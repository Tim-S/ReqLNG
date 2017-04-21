/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.ConceptCombination#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.ConceptCombination#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getConceptCombination()
 * @model
 * @generated
 */
public interface ConceptCombination extends EObject
{
  /**
   * Returns the value of the '<em><b>Concepts</b></em>' reference list.
   * The list contents are of type {@link de.schneidertim.requirements.nlp.reqLNG.ConceptOrSynonym}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concepts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concepts</em>' reference list.
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getConceptCombination_Concepts()
   * @model
   * @generated
   */
  EList<ConceptOrSynonym> getConcepts();

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute list.
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getConceptCombination_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

} // ConceptCombination
