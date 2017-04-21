/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.reqLNG.impl;

import de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage;
import de.schneidertim.requirements.nlp.reqLNG.SentenceWithReferences;
import de.schneidertim.requirements.nlp.reqLNG.TextWithReferences;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentence With References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.SentenceWithReferencesImpl#getTextWithReferences <em>Text With References</em>}</li>
 *   <li>{@link de.schneidertim.requirements.nlp.reqLNG.impl.SentenceWithReferencesImpl#getPunctuation <em>Punctuation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentenceWithReferencesImpl extends MinimalEObjectImpl.Container implements SentenceWithReferences
{
  /**
   * The cached value of the '{@link #getTextWithReferences() <em>Text With References</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextWithReferences()
   * @generated
   * @ordered
   */
  protected TextWithReferences textWithReferences;

  /**
   * The default value of the '{@link #getPunctuation() <em>Punctuation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPunctuation()
   * @generated
   * @ordered
   */
  protected static final String PUNCTUATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPunctuation() <em>Punctuation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPunctuation()
   * @generated
   * @ordered
   */
  protected String punctuation = PUNCTUATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SentenceWithReferencesImpl()
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
    return ReqLNGPackage.Literals.SENTENCE_WITH_REFERENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextWithReferences getTextWithReferences()
  {
    return textWithReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextWithReferences(TextWithReferences newTextWithReferences, NotificationChain msgs)
  {
    TextWithReferences oldTextWithReferences = textWithReferences;
    textWithReferences = newTextWithReferences;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES, oldTextWithReferences, newTextWithReferences);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextWithReferences(TextWithReferences newTextWithReferences)
  {
    if (newTextWithReferences != textWithReferences)
    {
      NotificationChain msgs = null;
      if (textWithReferences != null)
        msgs = ((InternalEObject)textWithReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES, null, msgs);
      if (newTextWithReferences != null)
        msgs = ((InternalEObject)newTextWithReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES, null, msgs);
      msgs = basicSetTextWithReferences(newTextWithReferences, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES, newTextWithReferences, newTextWithReferences));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPunctuation()
  {
    return punctuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPunctuation(String newPunctuation)
  {
    String oldPunctuation = punctuation;
    punctuation = newPunctuation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLNGPackage.SENTENCE_WITH_REFERENCES__PUNCTUATION, oldPunctuation, punctuation));
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
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES:
        return basicSetTextWithReferences(null, msgs);
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
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES:
        return getTextWithReferences();
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__PUNCTUATION:
        return getPunctuation();
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
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES:
        setTextWithReferences((TextWithReferences)newValue);
        return;
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__PUNCTUATION:
        setPunctuation((String)newValue);
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
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES:
        setTextWithReferences((TextWithReferences)null);
        return;
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__PUNCTUATION:
        setPunctuation(PUNCTUATION_EDEFAULT);
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
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__TEXT_WITH_REFERENCES:
        return textWithReferences != null;
      case ReqLNGPackage.SENTENCE_WITH_REFERENCES__PUNCTUATION:
        return PUNCTUATION_EDEFAULT == null ? punctuation != null : !PUNCTUATION_EDEFAULT.equals(punctuation);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (punctuation: ");
    result.append(punctuation);
    result.append(')');
    return result.toString();
  }

} //SentenceWithReferencesImpl
