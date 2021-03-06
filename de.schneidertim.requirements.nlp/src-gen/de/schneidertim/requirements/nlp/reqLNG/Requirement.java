/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.Requirement#getSystem <em>System</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.Requirement#getLiability <em>Liability</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.Requirement#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(de.schneidertim.requirements.nlp.reqLNG.System)
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getRequirement_System()
   * @model
   * @generated
   */
  de.schneidertim.requirements.nlp.reqLNG.System getSystem();

  /**
   * Sets the value of the '{@link de.schneidertim.requirements.nlp.reqLNG.Requirement#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(de.schneidertim.requirements.nlp.reqLNG.System value);

  /**
   * Returns the value of the '<em><b>Liability</b></em>' attribute.
   * The literals are from the enumeration {@link de.schneidertim.requirements.nlp.reqLNG.Liability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Liability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Liability</em>' attribute.
   * @see de.schneidertim.requirements.nlp.reqLNG.Liability
   * @see #setLiability(Liability)
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getRequirement_Liability()
   * @model
   * @generated
   */
  Liability getLiability();

  /**
   * Sets the value of the '{@link de.schneidertim.requirements.nlp.reqLNG.Requirement#getLiability <em>Liability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Liability</em>' attribute.
   * @see de.schneidertim.requirements.nlp.reqLNG.Liability
   * @see #getLiability()
   * @generated
   */
  void setLiability(Liability value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(RequirementEnd)
   * @see de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage#getRequirement_End()
   * @model containment="true"
   * @generated
   */
  RequirementEnd getEnd();

  /**
   * Sets the value of the '{@link de.schneidertim.requirements.nlp.reqLNG.Requirement#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(RequirementEnd value);

} // Requirement
