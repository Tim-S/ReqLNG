package de.schneidertim.requirements.nlp.validation;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.hsrm.cknauf.POSRegex.api.IPOSRegexPattern;
import de.hsrm.cknauf.POSRegex.impl.MatchResult;
import de.hsrm.cknauf.POSRegex.impl.Token;
import de.schneidertim.requirements.nlp.BoilerplateToStringConverter;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.Requirement;
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd;
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms;
import de.schneidertim.requirements.nlp.validation.AbstractReqLNGValidator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class NLPValidator extends AbstractReqLNGValidator {
  @Inject
  private IPOSRegexPattern posRegex;
  
  @Inject
  private BoilerplateToStringConverter converter;
  
  @Check(CheckType.NORMAL)
  public void checkObjectWithDetailsContainsFunction(final RequirementEnd end) {
    final String pattern = "(?$verb[pos:VB|pos:VBD|pos:VBG|pos:VBN|pos:VBP|pos:VBZ])";
    EObject _eContainer = end.eContainer();
    final Requirement requirement = ((Requirement) _eContainer);
    final String reqString = this.converter.toString(requirement);
    final MatchResult result = this.posRegex.match(reqString, pattern);
    final TextWithConceptsOrSynonyms objectWithDetails = end.getObjectWithDetails();
    final String owdString = this.converter.toString(objectWithDetails);
    Map<String, List<List<Token>>> _tokensByGroup = result.getTokensByGroup();
    final List<List<Token>> verbs = _tokensByGroup.get("verb");
    final Iterable<Token> verbsInOwdString = this.countOccurrences(owdString, verbs);
    final EReference literal = ReqLNGPackage.Literals.REQUIREMENT_END__OBJECT_WITH_DETAILS;
    int _size = IterableExtensions.size(verbsInOwdString);
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      this.error("This text must contain one verb which stands for a function of the system", literal);
    }
  }
  
  public Iterable<Token> countOccurrences(final String string, final List<List<Token>> lists) {
    Iterable<Token> _flatten = Iterables.<Token>concat(lists);
    final Function1<Token, Boolean> _function = (Token it) -> {
      String _word = it.getWord();
      return Boolean.valueOf(string.contains(_word));
    };
    return IterableExtensions.<Token>filter(_flatten, _function);
  }
  
  public int numMatches(final String string, final String word) {
    int index = string.indexOf(word);
    if ((index == (-1))) {
      return 0;
    } else {
      int _length = word.length();
      int _plus = (index + _length);
      String _substring = string.substring(_plus);
      int _numMatches = this.numMatches(_substring, word);
      return (1 + _numMatches);
    }
  }
}
