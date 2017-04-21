/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG.impl;

import de.schneidertim.requirements.nlp.reqLNG.Description;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.SentenceWithReferences;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.DescriptionImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected EList<SentenceWithReferences> text;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReqLNGPackage.Literals.DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SentenceWithReferences> getText()
  {
    if (text == null)
    {
      text = new EObjectContainmentEList<SentenceWithReferences>(SentenceWithReferences.class, this, ReqLNGPackage.DESCRIPTION__TEXT);
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReqLNGPackage.DESCRIPTION__TEXT:
        return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReqLNGPackage.DESCRIPTION__TEXT:
        return getText();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReqLNGPackage.DESCRIPTION__TEXT:
        getText().clear();
        getText().addAll((Collection<? extends SentenceWithReferences>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReqLNGPackage.DESCRIPTION__TEXT:
        getText().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReqLNGPackage.DESCRIPTION__TEXT:
        return text != null && !text.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DescriptionImpl
