/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG.util;

import de.schneidertim.requirements.nlp.reqLNG.Actor;
import de.schneidertim.requirements.nlp.reqLNG.ActorInteraction;
import de.schneidertim.requirements.nlp.reqLNG.ConceptCombination;
import de.schneidertim.requirements.nlp.reqLNG.ConceptOrSynonym;
import de.schneidertim.requirements.nlp.reqLNG.ConditionalRequirement;
import de.schneidertim.requirements.nlp.reqLNG.Description;
import de.schneidertim.requirements.nlp.reqLNG.DomainObject;
import de.schneidertim.requirements.nlp.reqLNG.DomainObjectSynonym;
import de.schneidertim.requirements.nlp.reqLNG.Entity;
import de.schneidertim.requirements.nlp.reqLNG.Function;
import de.schneidertim.requirements.nlp.reqLNG.FunctionSynonym;
import de.schneidertim.requirements.nlp.reqLNG.Glossary;
import de.schneidertim.requirements.nlp.reqLNG.Precondition;
import de.schneidertim.requirements.nlp.reqLNG.ReferenceCombination;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.Requirement;
import de.schneidertim.requirements.nlp.reqLNG.RequirementDocument;
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd;
import de.schneidertim.requirements.nlp.reqLNG.SentenceWithReferences;
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms;
import de.schneidertim.requirements.nlp.reqLNG.TextWithReferences;
import de.schneidertim.requirements.nlp.reqLNG.UnconditionalRequirement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage
 * @generated
 */
public class ReqLNGSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReqLNGPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqLNGSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ReqLNGPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ReqLNGPackage.REQUIREMENT_DOCUMENT:
      {
        RequirementDocument requirementDocument = (RequirementDocument)theEObject;
        T result = caseRequirementDocument(requirementDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = caseEntity(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.SYSTEM:
      {
        de.schneidertim.requirements.nlp.reqLNG.System system = (de.schneidertim.requirements.nlp.reqLNG.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = caseEntity(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.DESCRIPTION:
      {
        Description description = (Description)theEObject;
        T result = caseDescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES:
      {
        SentenceWithReferences sentenceWithReferences = (SentenceWithReferences)theEObject;
        T result = caseSentenceWithReferences(sentenceWithReferences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.TEXT_WITH_REFERENCES:
      {
        TextWithReferences textWithReferences = (TextWithReferences)theEObject;
        T result = caseTextWithReferences(textWithReferences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.REFERENCE_COMBINATION:
      {
        ReferenceCombination referenceCombination = (ReferenceCombination)theEObject;
        T result = caseReferenceCombination(referenceCombination);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.CONDITIONAL_REQUIREMENT:
      {
        ConditionalRequirement conditionalRequirement = (ConditionalRequirement)theEObject;
        T result = caseConditionalRequirement(conditionalRequirement);
        if (result == null) result = caseRequirement(conditionalRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.UNCONDITIONAL_REQUIREMENT:
      {
        UnconditionalRequirement unconditionalRequirement = (UnconditionalRequirement)theEObject;
        T result = caseUnconditionalRequirement(unconditionalRequirement);
        if (result == null) result = caseRequirement(unconditionalRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.PRECONDITION:
      {
        Precondition precondition = (Precondition)theEObject;
        T result = casePrecondition(precondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.ACTOR_INTERACTION:
      {
        ActorInteraction actorInteraction = (ActorInteraction)theEObject;
        T result = caseActorInteraction(actorInteraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.REQUIREMENT_END:
      {
        RequirementEnd requirementEnd = (RequirementEnd)theEObject;
        T result = caseRequirementEnd(requirementEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.TEXT_WITH_CONCEPTS_OR_SYNONYMS:
      {
        TextWithConceptsOrSynonyms textWithConceptsOrSynonyms = (TextWithConceptsOrSynonyms)theEObject;
        T result = caseTextWithConceptsOrSynonyms(textWithConceptsOrSynonyms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.CONCEPT_COMBINATION:
      {
        ConceptCombination conceptCombination = (ConceptCombination)theEObject;
        T result = caseConceptCombination(conceptCombination);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.GLOSSARY:
      {
        Glossary glossary = (Glossary)theEObject;
        T result = caseGlossary(glossary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.CONCEPT_OR_SYNONYM:
      {
        ConceptOrSynonym conceptOrSynonym = (ConceptOrSynonym)theEObject;
        T result = caseConceptOrSynonym(conceptOrSynonym);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseConceptOrSynonym(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.DOMAIN_OBJECT:
      {
        DomainObject domainObject = (DomainObject)theEObject;
        T result = caseDomainObject(domainObject);
        if (result == null) result = caseConceptOrSynonym(domainObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.FUNCTION_SYNONYM:
      {
        FunctionSynonym functionSynonym = (FunctionSynonym)theEObject;
        T result = caseFunctionSynonym(functionSynonym);
        if (result == null) result = caseConceptOrSynonym(functionSynonym);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReqLNGPackage.DOMAIN_OBJECT_SYNONYM:
      {
        DomainObjectSynonym domainObjectSynonym = (DomainObjectSynonym)theEObject;
        T result = caseDomainObjectSynonym(domainObjectSynonym);
        if (result == null) result = caseConceptOrSynonym(domainObjectSynonym);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementDocument(RequirementDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(de.schneidertim.requirements.nlp.reqLNG.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescription(Description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence With References</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence With References</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentenceWithReferences(SentenceWithReferences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text With References</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text With References</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextWithReferences(TextWithReferences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Combination</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Combination</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceCombination(ReferenceCombination object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalRequirement(ConditionalRequirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unconditional Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unconditional Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnconditionalRequirement(UnconditionalRequirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecondition(Precondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Interaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Interaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorInteraction(ActorInteraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementEnd(RequirementEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text With Concepts Or Synonyms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text With Concepts Or Synonyms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextWithConceptsOrSynonyms(TextWithConceptsOrSynonyms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept Combination</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept Combination</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConceptCombination(ConceptCombination object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlossary(Glossary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept Or Synonym</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept Or Synonym</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConceptOrSynonym(ConceptOrSynonym object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainObject(DomainObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Synonym</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Synonym</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionSynonym(FunctionSynonym object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Object Synonym</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Object Synonym</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainObjectSynonym(DomainObjectSynonym object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ReqLNGSwitch
