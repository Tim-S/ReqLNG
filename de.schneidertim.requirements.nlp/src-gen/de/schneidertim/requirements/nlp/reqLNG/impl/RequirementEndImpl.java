/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG.impl;

import de.schneidertim.requirements.nlp.reqLNG.ActorInteraction;
import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd;
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.RequirementEndImpl#getAi <em>Ai</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.RequirementEndImpl#getObjectWithDetails <em>Object With Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementEndImpl extends MinimalEObjectImpl.Container implements RequirementEnd
{
  /**
   * The cached value of the '{@link #getAi() <em>Ai</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAi()
   * @generated
   * @ordered
   */
  protected ActorInteraction ai;

  /**
   * The cached value of the '{@link #getObjectWithDetails() <em>Object With Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectWithDetails()
   * @generated
   * @ordered
   */
  protected TextWithConceptsOrSynonyms objectWithDetails;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementEndImpl()
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
    return ReqLNGPackage.Literals.REQUIREMENT_END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorInteraction getAi()
  {
    return ai;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAi(ActorInteraction newAi, NotificationChain msgs)
  {
    ActorInteraction oldAi = ai;
    ai = newAi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLNGPackage.REQUIREMENT_END__AI, oldAi, newAi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAi(ActorInteraction newAi)
  {
    if (newAi != ai)
    {
      NotificationChain msgs = null;
      if (ai != null)
        msgs = ((InternalEObject)ai).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLNGPackage.REQUIREMENT_END__AI, null, msgs);
      if (newAi != null)
        msgs = ((InternalEObject)newAi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLNGPackage.REQUIREMENT_END__AI, null, msgs);
      msgs = basicSetAi(newAi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLNGPackage.REQUIREMENT_END__AI, newAi, newAi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextWithConceptsOrSynonyms getObjectWithDetails()
  {
    return objectWithDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectWithDetails(TextWithConceptsOrSynonyms newObjectWithDetails, NotificationChain msgs)
  {
    TextWithConceptsOrSynonyms oldObjectWithDetails = objectWithDetails;
    objectWithDetails = newObjectWithDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS, oldObjectWithDetails, newObjectWithDetails);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectWithDetails(TextWithConceptsOrSynonyms newObjectWithDetails)
  {
    if (newObjectWithDetails != objectWithDetails)
    {
      NotificationChain msgs = null;
      if (objectWithDetails != null)
        msgs = ((InternalEObject)objectWithDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS, null, msgs);
      if (newObjectWithDetails != null)
        msgs = ((InternalEObject)newObjectWithDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS, null, msgs);
      msgs = basicSetObjectWithDetails(newObjectWithDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS, newObjectWithDetails, newObjectWithDetails));
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
      case ReqLNGPackage.REQUIREMENT_END__AI:
        return basicSetAi(null, msgs);
      case ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS:
        return basicSetObjectWithDetails(null, msgs);
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
      case ReqLNGPackage.REQUIREMENT_END__AI:
        return getAi();
      case ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS:
        return getObjectWithDetails();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReqLNGPackage.REQUIREMENT_END__AI:
        setAi((ActorInteraction)newValue);
        return;
      case ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS:
        setObjectWithDetails((TextWithConceptsOrSynonyms)newValue);
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
      case ReqLNGPackage.REQUIREMENT_END__AI:
        setAi((ActorInteraction)null);
        return;
      case ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS:
        setObjectWithDetails((TextWithConceptsOrSynonyms)null);
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
      case ReqLNGPackage.REQUIREMENT_END__AI:
        return ai != null;
      case ReqLNGPackage.REQUIREMENT_END__OBJECT_WITH_DETAILS:
        return objectWithDetails != null;
    }
    return super.eIsSet(featureID);
  }

} //RequirementEndImpl
