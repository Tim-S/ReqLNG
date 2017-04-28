package de.schneidertim.requirements.nlp.validation;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.hsrm.cknauf.POSRegex.api.IPOSRegexPattern;
import de.hsrm.cknauf.POSRegex.impl.MatchResult;
import de.hsrm.cknauf.POSRegex.impl.Token;
import de.schneidertim.requirements.nlp.BoilerplateToStringConverter;
import de.schneidertim.requirements.nlp.reqLNG.ConceptCombination;
import de.schneidertim.requirements.nlp.reqLNG.ConceptOrSynonym;
import de.schneidertim.requirements.nlp.reqLNG.Function;
import de.schneidertim.requirements.nlp.reqLNG.FunctionSynonym;
import de.schneidertim.requirements.nlp.reqLNG.Glossary;
import de.schneidertim.requirements.nlp.reqLNG.Requirement;
import de.schneidertim.requirements.nlp.reqLNG.RequirementDocument;
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd;
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms;
import de.schneidertim.requirements.nlp.validation.AbstractReqLNGValidator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class VerbIsFunctionValidator extends AbstractReqLNGValidator {
  @Inject
  private IPOSRegexPattern posRegex;
  
  @Inject
  private BoilerplateToStringConverter converter;
  
  @Check(CheckType.NORMAL)
  public void extractFunctionFromObjectWithDetails(final RequirementEnd end) {
    final String pattern = "(?$verb[pos:VB|pos:VBD|pos:VBG|pos:VBN|pos:VBP|pos:VBZ])";
    final TextWithConceptsOrSynonyms objectWithDetails = end.getObjectWithDetails();
    final String owdString = this.converter.toString(objectWithDetails);
    final MatchResult result = this.posRegex.match(owdString, pattern);
    Map<String, List<List<Token>>> _tokensByGroup = result.getTokensByGroup();
    final List<List<Token>> verbGroupsFound = _tokensByGroup.get("verb");
    for (final List<Token> verbs : verbGroupsFound) {
      {
        Token _head = IterableExtensions.<Token>head(verbs);
        String verb = _head.getWord();
        Token _head_1 = IterableExtensions.<Token>head(verbs);
        String lemma = _head_1.getLemma();
        Token _head_2 = IterableExtensions.<Token>head(verbs);
        int verbPosition = _head_2.getBegin();
        boolean _isReference = this.isReference(verb, objectWithDetails);
        boolean _not = (!_isReference);
        if (_not) {
          RequirementDocument _parentForEObject = this.getParentForEObject(end);
          Glossary _glossary = _parentForEObject.getGlossary();
          EList<ConceptOrSynonym> _concepts = _glossary.getConcepts();
          Iterable<Function> _filter = Iterables.<Function>filter(_concepts, Function.class);
          final List<Function> existingFunctions = IterableExtensions.<Function>toList(_filter);
          this.showFunctionQuickFixes(existingFunctions, objectWithDetails, verb, verbPosition, lemma);
        }
      }
    }
  }
  
  public RequirementDocument getParentForEObject(final RequirementEnd end) {
    EObject _eContainer = end.eContainer();
    final Requirement requirement = ((Requirement) _eContainer);
    EObject _eContainer_1 = requirement.eContainer();
    final RequirementDocument requirementDocument = ((RequirementDocument) _eContainer_1);
    return requirementDocument;
  }
  
  public boolean isReference(final String verb, final TextWithConceptsOrSynonyms text) {
    boolean _xblockexpression = false;
    {
      EList<ConceptOrSynonym> _onlyRefs = text.getOnlyRefs();
      boolean _isEmpty = _onlyRefs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<ConceptOrSynonym> _onlyRefs_1 = text.getOnlyRefs();
        final Function1<ConceptOrSynonym, String> _function = (ConceptOrSynonym it) -> {
          return it.getName();
        };
        List<String> _map = ListExtensions.<ConceptOrSynonym, String>map(_onlyRefs_1, _function);
        return _map.contains(verb);
      }
      _xblockexpression = ((ListExtensions.<ConceptOrSynonym, String>map(text.getRefBefore(), ((Function1<ConceptOrSynonym, String>) (ConceptOrSynonym it) -> {
        return it.getName();
      })).contains(verb) || text.getAfter().stream().anyMatch(((Predicate<ConceptCombination>) (ConceptCombination it) -> {
        EList<ConceptOrSynonym> _concepts = it.getConcepts();
        final Function1<ConceptOrSynonym, String> _function_1 = (ConceptOrSynonym it_1) -> {
          return it_1.getName();
        };
        List<String> _map_1 = ListExtensions.<ConceptOrSynonym, String>map(_concepts, _function_1);
        return _map_1.contains(verb);
      }))) || ListExtensions.<ConceptOrSynonym, String>map(text.getFinalRef(), ((Function1<ConceptOrSynonym, String>) (ConceptOrSynonym it) -> {
        return it.getName();
      })).contains(verb));
    }
    return _xblockexpression;
  }
  
  public void showFunctionQuickFixes(final List<Function> functions, final TextWithConceptsOrSynonyms text, final String verb, final int verbPos, final String lemma) {
    final Function1<Function, EList<FunctionSynonym>> _function = (Function f) -> {
      return f.getSynonyms();
    };
    List<EList<FunctionSynonym>> _map = ListExtensions.<Function, EList<FunctionSynonym>>map(functions, _function);
    Iterable<FunctionSynonym> _flatten = Iterables.<FunctionSynonym>concat(_map);
    final List<FunctionSynonym> synonyms = IterableExtensions.<FunctionSynonym>toList(_flatten);
    final Function1<FunctionSynonym, String> _function_1 = (FunctionSynonym it) -> {
      return it.getName();
    };
    List<String> _map_1 = ListExtensions.<FunctionSynonym, String>map(synonyms, _function_1);
    final List<String> synonymNames = IterableExtensions.<String>toList(_map_1);
    final Function1<Function, String> _function_2 = (Function it) -> {
      return it.getName();
    };
    List<String> _map_2 = ListExtensions.<Function, String>map(functions, _function_2);
    final List<String> functionNames = IterableExtensions.<String>toList(_map_2);
    final int offset = this.calculateOffset(text, verb, verbPos);
    final int length = verb.length();
    final String message = (("Function " + verb) + " found");
    boolean _contains = synonymNames.contains(verb);
    if (_contains) {
      this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.REFERENCE_CONCEPT_OR_SYNONYM, verb);
    } else {
      if ((functionNames.contains(lemma) && verb.equals(lemma))) {
        this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.REFERENCE_CONCEPT_OR_SYNONYM, verb);
      } else {
        if ((functionNames.contains(lemma) && (!verb.equals(lemma)))) {
          this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.ADD_AS_SYNONYM_FOR_EXISTING_FUNCTION, verb, lemma);
        } else {
          if (((!functionNames.contains(lemma)) && verb.equals(lemma))) {
            this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.ADD_AS_NEW_FUNCTION, verb, lemma);
            this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM, verb);
          } else {
            if (((!functionNames.contains(lemma)) && (!verb.equals(lemma)))) {
              this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.CREATE_NEW_FUNCTION_AND_ADD_AS_SYNONYM, verb, lemma);
              this.acceptWarning(message, text, offset, length, VerbIsFunctionValidator.CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM, verb);
            }
          }
        }
      }
    }
  }
  
  public int calculateOffset(final TextWithConceptsOrSynonyms text, final String verb, final int verbPos) {
    final ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(text);
    final String string = NodeModelUtils.getTokenText(actualNode);
    int _offset = actualNode.getOffset();
    int _indexOf = string.indexOf(verb);
    return (_offset + _indexOf);
  }
  
  public final static String ADD_AS_NEW_FUNCTION = "INTRODUCE_FUNCTION";
  
  public final static String CREATE_NEW_FUNCTION_AND_ADD_AS_SYNONYM = "INTRODUCE_FUNCTION_AND_SYNONYM";
  
  public final static String CHOOSE_FUNCTION_AND_ADD_AS_SYNONYM = "INTRODUCE_FUNCTION_SYNONYM";
  
  public final static String ADD_AS_SYNONYM_FOR_EXISTING_FUNCTION = "INTRODUCE_SYNONYM_FOR_EXISTING_FUNCTION";
  
  public final static String REFERENCE_CONCEPT_OR_SYNONYM = "REFERENCE_CONCEPT_OR_SYNONYM";
}
