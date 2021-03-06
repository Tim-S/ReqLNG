/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG.impl;

import de.schneidertim.requirements.nlp.reqLNG.DomainObject;
import de.schneidertim.requirements.nlp.reqLNG.DomainObjectSynonym;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.SentenceWithReferences;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.DomainObjectImpl#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.DomainObjectImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectImpl extends ConceptOrSynonymImpl implements DomainObject
{
  /**
   * The cached value of the '{@link #getSynonyms() <em>Synonyms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynonyms()
   * @generated
   * @ordered
   */
  protected EList<DomainObjectSynonym> synonyms;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<SentenceWithReferences> description;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainObjectImpl()
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
    return ReqLNGPackage.Literals.DOMAIN_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DomainObjectSynonym> getSynonyms()
  {
    if (synonyms == null)
    {
      synonyms = new EObjectContainmentEList<DomainObjectSynonym>(DomainObjectSynonym.class, this, ReqLNGPackage.DOMAIN_OBJECT__SYNONYMS);
    }
    return synonyms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SentenceWithReferences> getDescription()
  {
    if (description == null)
    {
      description = new EObjectContainmentEList<SentenceWithReferences>(SentenceWithReferences.class, this, ReqLNGPackage.DOMAIN_OBJECT__DESCRIPTION);
    }
    return description;
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
      case ReqLNGPackage.DOMAIN_OBJECT__SYNONYMS:
        return ((InternalEList<?>)getSynonyms()).basicRemove(otherEnd, msgs);
      case ReqLNGPackage.DOMAIN_OBJECT__DESCRIPTION:
        return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
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
      case ReqLNGPackage.DOMAIN_OBJECT__SYNONYMS:
        return getSynonyms();
      case ReqLNGPackage.DOMAIN_OBJECT__DESCRIPTION:
        return getDescription();
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
      case ReqLNGPackage.DOMAIN_OBJECT__SYNONYMS:
        getSynonyms().clear();
        getSynonyms().addAll((Collection<? extends DomainObjectSynonym>)newValue);
        return;
      case ReqLNGPackage.DOMAIN_OBJECT__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends SentenceWithReferences>)newValue);
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
      case ReqLNGPackage.DOMAIN_OBJECT__SYNONYMS:
        getSynonyms().clear();
        return;
      case ReqLNGPackage.DOMAIN_OBJECT__DESCRIPTION:
        getDescription().clear();
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
      case ReqLNGPackage.DOMAIN_OBJECT__SYNONYMS:
        return synonyms != null && !synonyms.isEmpty();
      case ReqLNGPackage.DOMAIN_OBJECT__DESCRIPTION:
        return description != null && !description.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainObjectImpl
