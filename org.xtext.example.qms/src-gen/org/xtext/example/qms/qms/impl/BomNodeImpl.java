/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.qms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.qms.qms.BomNode;
import org.xtext.example.qms.qms.QmsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bom Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.qms.qms.impl.BomNodeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.xtext.example.qms.qms.impl.BomNodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BomNodeImpl extends RepositoryNodeImpl implements BomNode
{
  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final int WEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected int weight = WEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<BomNode> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BomNodeImpl()
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
    return QmsPackage.Literals.BOM_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeight(int newWeight)
  {
    int oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QmsPackage.BOM_NODE__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BomNode> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<BomNode>(BomNode.class, this, QmsPackage.BOM_NODE__CHILDREN);
    }
    return children;
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
      case QmsPackage.BOM_NODE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case QmsPackage.BOM_NODE__WEIGHT:
        return getWeight();
      case QmsPackage.BOM_NODE__CHILDREN:
        return getChildren();
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
      case QmsPackage.BOM_NODE__WEIGHT:
        setWeight((Integer)newValue);
        return;
      case QmsPackage.BOM_NODE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends BomNode>)newValue);
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
      case QmsPackage.BOM_NODE__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case QmsPackage.BOM_NODE__CHILDREN:
        getChildren().clear();
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
      case QmsPackage.BOM_NODE__WEIGHT:
        return weight != WEIGHT_EDEFAULT;
      case QmsPackage.BOM_NODE__CHILDREN:
        return children != null && !children.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (weight: ");
    result.append(weight);
    result.append(')');
    return result.toString();
  }

} //BomNodeImpl