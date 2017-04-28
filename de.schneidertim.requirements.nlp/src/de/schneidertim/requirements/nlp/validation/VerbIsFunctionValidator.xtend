package de.schneidertim.requirements.nlp.validation

import com.google.inject.Inject
import de.hsrm.cknauf.POSRegex.api.IPOSRegexPattern
import de.schneidertim.requirements.nlp.BoilerplateToStringConverter
import de.schneidertim.requirements.nlp.reqLNG.Function
import de.schneidertim.requirements.nlp.reqLNG.Requirement
import de.schneidertim.requirements.nlp.reqLNG.RequirementDocument
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms
import java.util.List
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType

class VerbIsFunctionValidator extends AbstractReqLNGValidator {
	@Inject
	IPOSRegexPattern posRegex

	@Inject
	BoilerplateToStringConverter converter
	
	@Check(CheckType.NORMAL)
	def extractFunctionFromObjectWithDetails(RequirementEnd end) {
		val pattern = '(?$verb[pos:VB|pos:VBD|pos:VBG|pos:VBN|pos:VBP|pos:VBZ])'
		// get objectWithDetails part of RequirementEnd and transform it to string
		val objectWithDetails = end.objectWithDetails
		val owdString = converter.toString(objectWithDetails)
		// get verbs in Requirement string 
		val result = posRegex.match(owdString, pattern)
		val verbGroupsFound = result.tokensByGroup.get("verb")
		for (verbs : verbGroupsFound) {
			var String verb = verbs.head.word
			var String lemma = verbs.head.lemma
			var verbPosition = verbs.head.begin
			if (!isReference(verb, objectWithDetails)) {
				val existingFunctions = getParentForEObject(end).glossary.concepts.filter(typeof(Function)).toList
				showFunctionQuickFixes(existingFunctions, objectWithDetails, verb, verbPosition, lemma)
			}
		}
	}
	
	def getParentForEObject(RequirementEnd end) {
		val requirement = end.eContainer as Requirement
		val requirementDocument = requirement.eContainer as RequirementDocument
		return requirementDocument
	}
	
	def isReference(String verb, TextWithConceptsOrSynonyms text) {
		if (!text.onlyRefs.empty) {
			return text.onlyRefs.map[name].contains(verb)
		}
		text.refBefore.map[name].contains(verb)
		|| text.after.stream.anyMatch[concepts.map[name].contains(verb)] 
		|| text.finalRef.map[name].contains(verb)
	}
	
	def showFunctionQuickFixes(List<Function> functions, TextWithConceptsOrSynonyms text, String verb, int verbPos,
		String lemma) {
		val synonyms = functions.map[f|f.synonyms].flatten.toList
		val synonymNames = synonyms.map[name].toList
		val functionNames = functions.map[name].toList
		println(functionNames)
		val offset = calculateOffset(text, verb, verbPos);
		val length = verb.length
		val message = "Function " + verb + " found"
		if (synonymNames.contains(verb)) {
			// rule 1 
			acceptWarning(message, text, offset, length, REFERENCE_CONCEPT_OR_SYNONYM, verb)
		} else if (functionNames.contains(lemma) && verb.equals(lemma)) {
			// rule 2 
			acceptWarning(message, text, offset, length, REFERENCE_CONCEPT_OR_SYNONYM, verb)
		} else if (functionNames.contains(lemma) && !verb.equals(lemma)) {
			// rule 3
			acceptWarning(message, text, offset, length, ADD_AS_SYNONYM_FOR_EXISTING_FUNCTION, verb, lemma)
		} else if (!functionNames.contains(lemma) && verb.equals(lemma)) {
			// rule 4 & 6
			acceptWarning(message, text, offset, length, ADD_AS_NEW_FUNCTION, verb, lemma)
			acceptWarning(message, text, offset, length, CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM, verb)
		} else if (!functionNames.contains(lemma) && !verb.equals(lemma)) {
			// rule 5 & 6 
			acceptWarning(message, text, offset, length, CREATE_NEW_FUNCTION_AND_ADD_AS_SYNONYM, verb, lemma)
			acceptWarning(message, text, offset, length, CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM, verb)
		}
	}
	
	def calculateOffset(TextWithConceptsOrSynonyms text, String verb, int verbPos) {
		val actualNode = NodeModelUtils.findActualNodeFor(text)
		val string = NodeModelUtils.getTokenText(actualNode)
		//offset of textual representation of TextWithConceptsOrSynonyms in XtextDocument 
		//+ relative position of verb in this textual represenattion
		return actualNode.offset + string.indexOf(verb) 
	}
	
	public static val ADD_AS_NEW_FUNCTION = "INTRODUCE_FUNCTION"
	public static val CREATE_NEW_FUNCTION_AND_ADD_AS_SYNONYM = "INTRODUCE_FUNCTION_AND_SYNONYM"
	public static val CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM = "INTRODUCE_FUNCTION_SYNONYM"
	public static val ADD_AS_SYNONYM_FOR_EXISTING_FUNCTION = "INTRODUCE_SYNONYM_FOR_EXISTING_FUNCTION"
	public static val REFERENCE_CONCEPT_OR_SYNONYM = "REFERENCE_CONCEPT_OR_SYNONYM"
	
}