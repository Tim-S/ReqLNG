/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.Function#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.Function#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ConceptOrSynonym
{
  /**
   * Returns the value of the '<em><b>Synonyms</b></em>' containment reference list.
   * The list contents are of type {@link de.schneidertim.requirements.nlp.reqLNG.FunctionSynonym}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Synonyms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Synonyms</em>' containment reference list.
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getFunction_Synonyms()
   * @model containment="true"
   * @generated
   */
  EList<FunctionSynonym> getSynonyms();

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference list.
   * The list contents are of type {@link de.schneidertim.requirements.nlp.reqLNG.SentenceWithReferences}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference list.
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getFunction_Description()
   * @model containment="true"
   * @generated
   */
  EList<SentenceWithReferences> getDescription();

} // Function
