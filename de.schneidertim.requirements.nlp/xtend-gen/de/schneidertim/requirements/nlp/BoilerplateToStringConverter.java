package de.schneidertim.requirements.nlp;

import de.schneidertim.requirements.nlp.reqLNG.Actor;
import de.schneidertim.requirements.nlp.reqLNG.ActorInteraction;
import de.schneidertim.requirements.nlp.reqLNG.ConceptCombination;
import de.schneidertim.requirements.nlp.reqLNG.ConceptOrSynonym;
import de.schneidertim.requirements.nlp.reqLNG.ConditionalRequirement;
import de.schneidertim.requirements.nlp.reqLNG.Entity;
import de.schneidertim.requirements.nlp.reqLNG.Liability;
import de.schneidertim.requirements.nlp.reqLNG.ReferenceCombination;
import de.schneidertim.requirements.nlp.reqLNG.Requirement;
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd;
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms;
import de.schneidertim.requirements.nlp.reqLNG.TextWithReferences;
import de.schneidertim.requirements.nlp.reqLNG.UnconditionalRequirement;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class BoilerplateToStringConverter {
  public String toString(final TextWithReferences text) {
    String _xblockexpression = null;
    {
      EList<Entity> _onlyRefs = text.getOnlyRefs();
      boolean _isEmpty = _onlyRefs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<Entity> _onlyRefs_1 = text.getOnlyRefs();
        final Function1<Entity, String> _function = (Entity it) -> {
          return it.getName();
        };
        List<String> _map = ListExtensions.<Entity, String>map(_onlyRefs_1, _function);
        String _join = IterableExtensions.join(_map, " ");
        return _join.trim();
      }
      final LinkedList<Object> elements = CollectionLiterals.<Object>newLinkedList();
      EList<Entity> _refBefore = text.getRefBefore();
      final Function1<Entity, String> _function_1 = (Entity it) -> {
        return it.getName();
      };
      List<String> _map_1 = ListExtensions.<Entity, String>map(_refBefore, _function_1);
      elements.addAll(_map_1);
      EList<String> _text = text.getText();
      elements.addAll(_text);
      EList<ReferenceCombination> _after = text.getAfter();
      final Consumer<ReferenceCombination> _function_2 = (ReferenceCombination comb) -> {
        EList<Entity> _refs = comb.getRefs();
        final Function1<Entity, String> _function_3 = (Entity it) -> {
          return it.getName();
        };
        List<String> _map_2 = ListExtensions.<Entity, String>map(_refs, _function_3);
        elements.addAll(_map_2);
        EList<String> _text_1 = comb.getText();
        elements.addAll(_text_1);
      };
      _after.forEach(_function_2);
      EList<Entity> _finalRef = text.getFinalRef();
      final Function1<Entity, String> _function_3 = (Entity it) -> {
        return it.getName();
      };
      List<String> _map_2 = ListExtensions.<Entity, String>map(_finalRef, _function_3);
      elements.addAll(_map_2);
      String _join_1 = IterableExtensions.join(elements, " ");
      _xblockexpression = _join_1.trim();
    }
    return _xblockexpression;
  }
  
  public String toString(final Requirement req) {
    String _xifexpression = null;
    if ((req instanceof UnconditionalRequirement)) {
      _xifexpression = this.toString(((UnconditionalRequirement)req));
    } else {
      String _xifexpression_1 = null;
      if ((req instanceof ConditionalRequirement)) {
        _xifexpression_1 = this.toString(((ConditionalRequirement)req));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String toString(final UnconditionalRequirement req) {
    String _xblockexpression = null;
    {
      final LinkedList<Object> elements = CollectionLiterals.<Object>newLinkedList();
      String _the = req.getThe();
      elements.add(_the);
      de.schneidertim.requirements.nlp.reqLNG.System _system = req.getSystem();
      String _name = _system.getName();
      elements.add(_name);
      Liability _liability = req.getLiability();
      String _string = _liability.toString();
      elements.add(_string);
      RequirementEnd _end = req.getEnd();
      String _string_1 = this.toString(_end);
      elements.add(_string_1);
      String _join = IterableExtensions.join(elements, " ");
      _xblockexpression = _join.trim();
    }
    return _xblockexpression;
  }
  
  public String toString(final RequirementEnd reqEnd) {
    String _xblockexpression = null;
    {
      final LinkedList<Object> elements = CollectionLiterals.<Object>newLinkedList();
      ActorInteraction _ai = reqEnd.getAi();
      String _string = this.toString(_ai);
      elements.add(_string);
      TextWithConceptsOrSynonyms _objectWithDetails = reqEnd.getObjectWithDetails();
      String _string_1 = this.toString(_objectWithDetails);
      elements.add(_string_1);
      elements.add(".");
      String _join = IterableExtensions.join(elements, " ");
      _xblockexpression = _join.trim();
    }
    return _xblockexpression;
  }
  
  public String toString(final TextWithConceptsOrSynonyms text) {
    String _xblockexpression = null;
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
        String _join = IterableExtensions.join(_map, " ");
        return _join.trim();
      }
      final LinkedList<Object> elements = CollectionLiterals.<Object>newLinkedList();
      EList<ConceptOrSynonym> _refBefore = text.getRefBefore();
      final Function1<ConceptOrSynonym, String> _function_1 = (ConceptOrSynonym it) -> {
        return it.getName();
      };
      List<String> _map_1 = ListExtensions.<ConceptOrSynonym, String>map(_refBefore, _function_1);
      elements.addAll(_map_1);
      EList<String> _text = text.getText();
      elements.addAll(_text);
      EList<ConceptCombination> _after = text.getAfter();
      final Consumer<ConceptCombination> _function_2 = (ConceptCombination comb) -> {
        EList<ConceptOrSynonym> _concepts = comb.getConcepts();
        final Function1<ConceptOrSynonym, String> _function_3 = (ConceptOrSynonym it) -> {
          return it.getName();
        };
        List<String> _map_2 = ListExtensions.<ConceptOrSynonym, String>map(_concepts, _function_3);
        elements.addAll(_map_2);
        EList<String> _text_1 = comb.getText();
        elements.addAll(_text_1);
      };
      _after.forEach(_function_2);
      EList<ConceptOrSynonym> _finalRef = text.getFinalRef();
      final Function1<ConceptOrSynonym, String> _function_3 = (ConceptOrSynonym it) -> {
        return it.getName();
      };
      List<String> _map_2 = ListExtensions.<ConceptOrSynonym, String>map(_finalRef, _function_3);
      elements.addAll(_map_2);
      String _join_1 = IterableExtensions.join(elements, " ");
      _xblockexpression = _join_1.trim();
    }
    return _xblockexpression;
  }
  
  public String toString(final ActorInteraction ai) {
    String _xblockexpression = null;
    {
      final LinkedList<Object> elements = CollectionLiterals.<Object>newLinkedList();
      String _provide = ai.getProvide();
      elements.add(_provide);
      String _the1 = ai.getThe1();
      elements.add(_the1);
      Actor _actor = ai.getActor();
      String _name = _actor.getName();
      elements.add(_name);
      String _with = ai.getWith();
      elements.add(_with);
      String _the2 = ai.getThe2();
      elements.add(_the2);
      String _ability = ai.getAbility();
      elements.add(_ability);
      String _to = ai.getTo();
      elements.add(_to);
      String _join = IterableExtensions.join(elements, " ");
      _xblockexpression = _join.trim();
    }
    return _xblockexpression;
  }
  
  public String toString(final ConditionalRequirement req) {
    return "";
  }
}
