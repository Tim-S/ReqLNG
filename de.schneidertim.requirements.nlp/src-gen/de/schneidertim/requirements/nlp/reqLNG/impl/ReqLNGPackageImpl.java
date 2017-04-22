/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG.impl;

import de.schneidertim.requirements.nlp.reqLNG.Actor;
import de.schneidertim.requirements.nlp.reqLNG.ActorInteraction;
import de.schneidertim.requirements.nlp.reqLNG.ConceptCombination;
import de.schneidertim.requirements.nlp.reqLNG.ConceptOrSynonym;
import de.schneidertim.requirements.nlp.reqLNG.ConditionalRequirement;
import de.schneidertim.requirements.nlp.reqLNG.Description;
import de.schneidertim.requirements.nlp.reqLNG.DomainObject;
import de.schneidertim.requirements.nlp.reqLNG.Entity;
import de.schneidertim.requirements.nlp.reqLNG.Function;
import de.schneidertim.requirements.nlp.reqLNG.Glossary;
import de.schneidertim.requirements.nlp.reqLNG.Liability;
import de.schneidertim.requirements.nlp.reqLNG.Precondition;
import de.schneidertim.requirements.nlp.reqLNG.ReferenceCombination;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGFactory;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.Requirement;
import de.schneidertim.requirements.nlp.reqLNG.RequirementDocument;
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd;
import de.schneidertim.requirements.nlp.reqLNG.SentenceWithReferences;
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms;
import de.schneidertim.requirements.nlp.reqLNG.TextWithReferences;
import de.schneidertim.requirements.nlp.reqLNG.UnconditionalRequirement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqLNGPackageImpl extends EPackageImpl implements ReqLNGPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceWithReferencesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textWithReferencesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceCombinationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalRequirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unconditionalRequirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorInteractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textWithConceptsOrSynonymsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptCombinationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass glossaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptOrSynonymEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum liabilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ReqLNGPackageImpl()
  {
    super(eNS_URI, ReqLNGFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ReqLNGPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ReqLNGPackage init()
  {
    if (isInited) return (ReqLNGPackage)EPackage.Registry.INSTANCE.getEPackage(ReqLNGPackage.eNS_URI);

    // Obtain or create and register package
    ReqLNGPackageImpl theReqLNGPackage = (ReqLNGPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReqLNGPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReqLNGPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theReqLNGPackage.createPackageContents();

    // Initialize created meta-data
    theReqLNGPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theReqLNGPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ReqLNGPackage.eNS_URI, theReqLNGPackage);
    return theReqLNGPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementDocument()
  {
    return requirementDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementDocument_Entities()
  {
    return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementDocument_Requirement()
  {
    return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementDocument_Glossary()
  {
    return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Description()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActor()
  {
    return actorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystem()
  {
    return systemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescription_Text()
  {
    return (EReference)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentenceWithReferences()
  {
    return sentenceWithReferencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSentenceWithReferences_TextWithReferences()
  {
    return (EReference)sentenceWithReferencesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSentenceWithReferences_Punctuation()
  {
    return (EAttribute)sentenceWithReferencesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextWithReferences()
  {
    return textWithReferencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithReferences_OnlyRefs()
  {
    return (EReference)textWithReferencesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithReferences_RefBefore()
  {
    return (EReference)textWithReferencesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextWithReferences_Text()
  {
    return (EAttribute)textWithReferencesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithReferences_After()
  {
    return (EReference)textWithReferencesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithReferences_FinalRef()
  {
    return (EReference)textWithReferencesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceCombination()
  {
    return referenceCombinationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceCombination_Refs()
  {
    return (EReference)referenceCombinationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCombination_Text()
  {
    return (EAttribute)referenceCombinationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_System()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Liability()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_End()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalRequirement()
  {
    return conditionalRequirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalRequirement_Condition()
  {
    return (EReference)conditionalRequirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnconditionalRequirement()
  {
    return unconditionalRequirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnconditionalRequirement_The()
  {
    return (EAttribute)unconditionalRequirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrecondition()
  {
    return preconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecondition_Conditional()
  {
    return (EAttribute)preconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecondition_Condition()
  {
    return (EReference)preconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorInteraction()
  {
    return actorInteractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorInteraction_Provide()
  {
    return (EAttribute)actorInteractionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorInteraction_The1()
  {
    return (EAttribute)actorInteractionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorInteraction_Actor()
  {
    return (EReference)actorInteractionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorInteraction_With()
  {
    return (EAttribute)actorInteractionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorInteraction_The2()
  {
    return (EAttribute)actorInteractionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorInteraction_Ability()
  {
    return (EAttribute)actorInteractionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorInteraction_To()
  {
    return (EAttribute)actorInteractionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementEnd()
  {
    return requirementEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementEnd_Ai()
  {
    return (EReference)requirementEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementEnd_ObjectWithDetails()
  {
    return (EReference)requirementEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextWithConceptsOrSynonyms()
  {
    return textWithConceptsOrSynonymsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithConceptsOrSynonyms_OnlyRefs()
  {
    return (EReference)textWithConceptsOrSynonymsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithConceptsOrSynonyms_RefBefore()
  {
    return (EReference)textWithConceptsOrSynonymsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextWithConceptsOrSynonyms_Text()
  {
    return (EAttribute)textWithConceptsOrSynonymsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithConceptsOrSynonyms_After()
  {
    return (EReference)textWithConceptsOrSynonymsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextWithConceptsOrSynonyms_FinalRef()
  {
    return (EReference)textWithConceptsOrSynonymsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptCombination()
  {
    return conceptCombinationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptCombination_Concepts()
  {
    return (EReference)conceptCombinationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptCombination_Text()
  {
    return (EAttribute)conceptCombinationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlossary()
  {
    return glossaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlossary_Concepts()
  {
    return (EReference)glossaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptOrSynonym()
  {
    return conceptOrSynonymEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptOrSynonym_Name()
  {
    return (EAttribute)conceptOrSynonymEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptOrSynonym_Synonyms()
  {
    return (EReference)conceptOrSynonymEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptOrSynonym_Description()
  {
    return (EReference)conceptOrSynonymEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainObject()
  {
    return domainObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLiability()
  {
    return liabilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqLNGFactory getReqLNGFactory()
  {
    return (ReqLNGFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    requirementDocumentEClass = createEClass(REQUIREMENT_DOCUMENT);
    createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ENTITIES);
    createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__REQUIREMENT);
    createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__GLOSSARY);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEReference(entityEClass, ENTITY__DESCRIPTION);

    actorEClass = createEClass(ACTOR);

    systemEClass = createEClass(SYSTEM);

    descriptionEClass = createEClass(DESCRIPTION);
    createEReference(descriptionEClass, DESCRIPTION__TEXT);

    sentenceWithReferencesEClass = createEClass(SENTENCE_WITH_REFERENCES);
    createEReference(sentenceWithReferencesEClass, SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES);
    createEAttribute(sentenceWithReferencesEClass, SENTENCE_WITH_REFERENCES__PUNCTUATION);

    textWithReferencesEClass = createEClass(TEXT_WITH_REFERENCES);
    createEReference(textWithReferencesEClass, TEXT_WITH_REFERENCES__ONLY_REFS);
    createEReference(textWithReferencesEClass, TEXT_WITH_REFERENCES__REF_BEFORE);
    createEAttribute(textWithReferencesEClass, TEXT_WITH_REFERENCES__TEXT);
    createEReference(textWithReferencesEClass, TEXT_WITH_REFERENCES__AFTER);
    createEReference(textWithReferencesEClass, TEXT_WITH_REFERENCES__FINAL_REF);

    referenceCombinationEClass = createEClass(REFERENCE_COMBINATION);
    createEReference(referenceCombinationEClass, REFERENCE_COMBINATION__REFS);
    createEAttribute(referenceCombinationEClass, REFERENCE_COMBINATION__TEXT);

    requirementEClass = createEClass(REQUIREMENT);
    createEReference(requirementEClass, REQUIREMENT__SYSTEM);
    createEAttribute(requirementEClass, REQUIREMENT__LIABILITY);
    createEReference(requirementEClass, REQUIREMENT__END);

    conditionalRequirementEClass = createEClass(CONDITIONAL_REQUIREMENT);
    createEReference(conditionalRequirementEClass, CONDITIONAL_REQUIREMENT__CONDITION);

    unconditionalRequirementEClass = createEClass(UNCONDITIONAL_REQUIREMENT);
    createEAttribute(unconditionalRequirementEClass, UNCONDITIONAL_REQUIREMENT__THE);

    preconditionEClass = createEClass(PRECONDITION);
    createEAttribute(preconditionEClass, PRECONDITION__CONDITIONAL);
    createEReference(preconditionEClass, PRECONDITION__CONDITION);

    actorInteractionEClass = createEClass(ACTOR_INTERACTION);
    createEAttribute(actorInteractionEClass, ACTOR_INTERACTION__PROVIDE);
    createEAttribute(actorInteractionEClass, ACTOR_INTERACTION__THE1);
    createEReference(actorInteractionEClass, ACTOR_INTERACTION__ACTOR);
    createEAttribute(actorInteractionEClass, ACTOR_INTERACTION__WITH);
    createEAttribute(actorInteractionEClass, ACTOR_INTERACTION__THE2);
    createEAttribute(actorInteractionEClass, ACTOR_INTERACTION__ABILITY);
    createEAttribute(actorInteractionEClass, ACTOR_INTERACTION__TO);

    requirementEndEClass = createEClass(REQUIREMENT_END);
    createEReference(requirementEndEClass, REQUIREMENT_END__AI);
    createEReference(requirementEndEClass, REQUIREMENT_END__OBJECT_WITH_DETAILS);

    textWithConceptsOrSynonymsEClass = createEClass(TEXT_WITH_CONCEPTS_OR_SYNONYMS);
    createEReference(textWithConceptsOrSynonymsEClass, TEXT_WITH_CONCEPTS_OR_SYNONYMS__ONLY_REFS);
    createEReference(textWithConceptsOrSynonymsEClass, TEXT_WITH_CONCEPTS_OR_SYNONYMS__REF_BEFORE);
    createEAttribute(textWithConceptsOrSynonymsEClass, TEXT_WITH_CONCEPTS_OR_SYNONYMS__TEXT);
    createEReference(textWithConceptsOrSynonymsEClass, TEXT_WITH_CONCEPTS_OR_SYNONYMS__AFTER);
    createEReference(textWithConceptsOrSynonymsEClass, TEXT_WITH_CONCEPTS_OR_SYNONYMS__FINAL_REF);

    conceptCombinationEClass = createEClass(CONCEPT_COMBINATION);
    createEReference(conceptCombinationEClass, CONCEPT_COMBINATION__CONCEPTS);
    createEAttribute(conceptCombinationEClass, CONCEPT_COMBINATION__TEXT);

    glossaryEClass = createEClass(GLOSSARY);
    createEReference(glossaryEClass, GLOSSARY__CONCEPTS);

    conceptOrSynonymEClass = createEClass(CONCEPT_OR_SYNONYM);
    createEAttribute(conceptOrSynonymEClass, CONCEPT_OR_SYNONYM__NAME);
    createEReference(conceptOrSynonymEClass, CONCEPT_OR_SYNONYM__SYNONYMS);
    createEReference(conceptOrSynonymEClass, CONCEPT_OR_SYNONYM__DESCRIPTION);

    functionEClass = createEClass(FUNCTION);

    domainObjectEClass = createEClass(DOMAIN_OBJECT);

    // Create enums
    liabilityEEnum = createEEnum(LIABILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    actorEClass.getESuperTypes().add(this.getEntity());
    systemEClass.getESuperTypes().add(this.getEntity());
    conditionalRequirementEClass.getESuperTypes().add(this.getRequirement());
    unconditionalRequirementEClass.getESuperTypes().add(this.getRequirement());
    functionEClass.getESuperTypes().add(this.getConceptOrSynonym());
    domainObjectEClass.getESuperTypes().add(this.getConceptOrSynonym());

    // Initialize classes and features; add operations and parameters
    initEClass(requirementDocumentEClass, RequirementDocument.class, "RequirementDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequirementDocument_Entities(), this.getEntity(), null, "entities", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementDocument_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementDocument_Glossary(), this.getGlossary(), null, "glossary", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Description(), this.getDescription(), null, "description", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemEClass, de.schneidertim.requirements.nlp.reqLNG.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescription_Text(), this.getSentenceWithReferences(), null, "text", null, 0, -1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentenceWithReferencesEClass, SentenceWithReferences.class, "SentenceWithReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSentenceWithReferences_TextWithReferences(), this.getTextWithReferences(), null, "textWithReferences", null, 0, 1, SentenceWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSentenceWithReferences_Punctuation(), ecorePackage.getEString(), "punctuation", null, 0, 1, SentenceWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textWithReferencesEClass, TextWithReferences.class, "TextWithReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextWithReferences_OnlyRefs(), this.getEntity(), null, "onlyRefs", null, 0, -1, TextWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextWithReferences_RefBefore(), this.getEntity(), null, "refBefore", null, 0, -1, TextWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextWithReferences_Text(), ecorePackage.getEString(), "text", null, 0, -1, TextWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextWithReferences_After(), this.getReferenceCombination(), null, "after", null, 0, -1, TextWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextWithReferences_FinalRef(), this.getEntity(), null, "finalRef", null, 0, -1, TextWithReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceCombinationEClass, ReferenceCombination.class, "ReferenceCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceCombination_Refs(), this.getEntity(), null, "refs", null, 0, -1, ReferenceCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCombination_Text(), ecorePackage.getEString(), "text", null, 0, -1, ReferenceCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequirement_System(), this.getSystem(), null, "system", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Liability(), this.getLiability(), "liability", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_End(), this.getRequirementEnd(), null, "end", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalRequirementEClass, ConditionalRequirement.class, "ConditionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalRequirement_Condition(), this.getPrecondition(), null, "condition", null, 0, 1, ConditionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unconditionalRequirementEClass, UnconditionalRequirement.class, "UnconditionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnconditionalRequirement_The(), ecorePackage.getEString(), "the", null, 0, 1, UnconditionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrecondition_Conditional(), ecorePackage.getEString(), "conditional", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrecondition_Condition(), this.getTextWithReferences(), null, "condition", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorInteractionEClass, ActorInteraction.class, "ActorInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorInteraction_Provide(), ecorePackage.getEString(), "provide", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActorInteraction_The1(), ecorePackage.getEString(), "the1", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorInteraction_Actor(), this.getActor(), null, "actor", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActorInteraction_With(), ecorePackage.getEString(), "with", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActorInteraction_The2(), ecorePackage.getEString(), "the2", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActorInteraction_Ability(), ecorePackage.getEString(), "ability", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActorInteraction_To(), ecorePackage.getEString(), "to", null, 0, 1, ActorInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEndEClass, RequirementEnd.class, "RequirementEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequirementEnd_Ai(), this.getActorInteraction(), null, "ai", null, 0, 1, RequirementEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementEnd_ObjectWithDetails(), this.getTextWithConceptsOrSynonyms(), null, "objectWithDetails", null, 0, 1, RequirementEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textWithConceptsOrSynonymsEClass, TextWithConceptsOrSynonyms.class, "TextWithConceptsOrSynonyms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextWithConceptsOrSynonyms_OnlyRefs(), this.getConceptOrSynonym(), null, "onlyRefs", null, 0, -1, TextWithConceptsOrSynonyms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextWithConceptsOrSynonyms_RefBefore(), this.getConceptOrSynonym(), null, "refBefore", null, 0, -1, TextWithConceptsOrSynonyms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextWithConceptsOrSynonyms_Text(), ecorePackage.getEString(), "text", null, 0, -1, TextWithConceptsOrSynonyms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextWithConceptsOrSynonyms_After(), this.getConceptCombination(), null, "after", null, 0, -1, TextWithConceptsOrSynonyms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextWithConceptsOrSynonyms_FinalRef(), this.getConceptOrSynonym(), null, "finalRef", null, 0, -1, TextWithConceptsOrSynonyms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptCombinationEClass, ConceptCombination.class, "ConceptCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConceptCombination_Concepts(), this.getConceptOrSynonym(), null, "concepts", null, 0, -1, ConceptCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConceptCombination_Text(), ecorePackage.getEString(), "text", null, 0, -1, ConceptCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(glossaryEClass, Glossary.class, "Glossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlossary_Concepts(), this.getConceptOrSynonym(), null, "concepts", null, 0, -1, Glossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptOrSynonymEClass, ConceptOrSynonym.class, "ConceptOrSynonym", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConceptOrSynonym_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConceptOrSynonym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConceptOrSynonym_Synonyms(), this.getConceptOrSynonym(), null, "synonyms", null, 0, -1, ConceptOrSynonym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConceptOrSynonym_Description(), this.getSentenceWithReferences(), null, "description", null, 0, -1, ConceptOrSynonym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(domainObjectEClass, DomainObject.class, "DomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(liabilityEEnum, Liability.class, "Liability");
    addEEnumLiteral(liabilityEEnum, Liability.SHALL);
    addEEnumLiteral(liabilityEEnum, Liability.SHOULD);
    addEEnumLiteral(liabilityEEnum, Liability.WILL);

    // Create resource
    createResource(eNS_URI);
  }

} //ReqLNGPackageImpl
