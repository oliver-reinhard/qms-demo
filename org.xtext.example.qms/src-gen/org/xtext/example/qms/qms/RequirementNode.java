/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.qms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.qms.qms.RequirementNode#getFormerName <em>Former Name</em>}</li>
 *   <li>{@link org.xtext.example.qms.qms.RequirementNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.qms.qms.QmsPackage#getRequirementNode()
 * @model
 * @generated
 */
public interface RequirementNode extends RepositoryNode
{
  /**
   * Returns the value of the '<em><b>Former Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Former Name</em>' attribute.
   * @see #setFormerName(String)
   * @see org.xtext.example.qms.qms.QmsPackage#getRequirementNode_FormerName()
   * @model
   * @generated
   */
  String getFormerName();

  /**
   * Sets the value of the '{@link org.xtext.example.qms.qms.RequirementNode#getFormerName <em>Former Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Former Name</em>' attribute.
   * @see #getFormerName()
   * @generated
   */
  void setFormerName(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.qms.qms.RequirementNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.xtext.example.qms.qms.QmsPackage#getRequirementNode_Children()
   * @model containment="true"
   * @generated
   */
  EList<RequirementNode> getChildren();

} // RequirementNode