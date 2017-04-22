package de.schneidertim.requirements.nlp.validation

import de.schneidertim.requirements.nlp.validation.AbstractReqLNGValidator
import com.google.inject.Inject
import de.hsrm.cknauf.POSRegex.api.IPOSRegexPattern
import de.schneidertim.requirements.nlp.BoilerplateToStringConverter
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.validation.Check
import de.schneidertim.requirements.nlp.reqLNG.Requirement
import java.util.List
import de.hsrm.cknauf.POSRegex.impl.Token
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage

class NLPValidator extends AbstractReqLNGValidator {
	@Inject
	IPOSRegexPattern posRegex

	@Inject
	BoilerplateToStringConverter converter

	@Check(CheckType.NORMAL)
	def checkObjectWithDetailsContainsFunction(RequirementEnd end) {
		val pattern = '(?$verb[pos:VB|pos:VBD|pos:VBG|pos:VBN|pos:VBP|pos:VBZ])'
		val requirement = end.eContainer as Requirement
		val reqString = converter.toString(requirement)
		val result = posRegex.match(reqString, pattern)
		val objectWithDetails = end.objectWithDetails
		val owdString = converter.toString(objectWithDetails)
		val verbs = result.tokensByGroup.get("verb")
		val verbsInOwdString = countOccurrences(owdString, verbs)
		val literal =  ReqLNGPackage.Literals.REQUIREMENT_END__OBJECT_WITH_DETAILS
		if (verbsInOwdString.size != 1) {
			error("This text must contain one verb which stands for a function of the system",literal)
		}
	}
	
	def countOccurrences(String string, List<List<Token>> lists) {
		//println(lists.flatten.map[word])
		//println(lists.flatten.filter[string.contains(word)])
		lists.flatten.filter[string.contains(word)]
	}
	
	def int numMatches(String string, String word){
		var index = string.indexOf(word);
		if(index == -1)
			return 0
		else
			return 1 + numMatches(string.substring(index+word.length), word);
	}
	
}
