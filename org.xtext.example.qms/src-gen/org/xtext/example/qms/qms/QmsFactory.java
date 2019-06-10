/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.qms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.qms.qms.QmsPackage
 * @generated
 */
public interface QmsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QmsFactory eINSTANCE = org.xtext.example.qms.qms.impl.QmsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>Repository Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Node</em>'.
   * @generated
   */
  RepositoryNode createRepositoryNode();

  /**
   * Returns a new object of class '<em>Requirement Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement Node</em>'.
   * @generated
   */
  RequirementNode createRequirementNode();

  /**
   * Returns a new object of class '<em>Bom Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bom Node</em>'.
   * @generated
   */
  BomNode createBomNode();

  /**
   * Returns a new object of class '<em>Evidence Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evidence Node</em>'.
   * @generated
   */
  EvidenceNode createEvidenceNode();

  /**
   * Returns a new object of class '<em>Node Body Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Body Element</em>'.
   * @generated
   */
  NodeBodyElement createNodeBodyElement();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Node Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Reference</em>'.
   * @generated
   */
  NodeReference createNodeReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QmsPackage getQmsPackage();

} //QmsFactory
