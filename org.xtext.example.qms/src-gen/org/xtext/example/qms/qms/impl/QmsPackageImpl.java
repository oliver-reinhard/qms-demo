/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.qms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.qms.qms.BomNode;
import org.xtext.example.qms.qms.EvidenceNode;
import org.xtext.example.qms.qms.Model;
import org.xtext.example.qms.qms.NodeBodyElement;
import org.xtext.example.qms.qms.NodeReference;
import org.xtext.example.qms.qms.QmsFactory;
import org.xtext.example.qms.qms.QmsPackage;
import org.xtext.example.qms.qms.Repository;
import org.xtext.example.qms.qms.RepositoryNode;
import org.xtext.example.qms.qms.RepositoryType;
import org.xtext.example.qms.qms.RequirementNode;
import org.xtext.example.qms.qms.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmsPackageImpl extends EPackageImpl implements QmsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bomNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evidenceNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeBodyElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum repositoryTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.qms.qms.QmsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QmsPackageImpl()
  {
    super(eNS_URI, QmsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link QmsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QmsPackage init()
  {
    if (isInited) return (QmsPackage)EPackage.Registry.INSTANCE.getEPackage(QmsPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredQmsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    QmsPackageImpl theQmsPackage = registeredQmsPackage instanceof QmsPackageImpl ? (QmsPackageImpl)registeredQmsPackage : new QmsPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theQmsPackage.createPackageContents();

    // Initialize created meta-data
    theQmsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQmsPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QmsPackage.eNS_URI, theQmsPackage);
    return theQmsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRepository()
  {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRepository_Type()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRepository_Root()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRepositoryNode()
  {
    return repositoryNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRepositoryNode_Title()
  {
    return (EAttribute)repositoryNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRepositoryNode_Body()
  {
    return (EReference)repositoryNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRequirementNode()
  {
    return requirementNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequirementNode_FormerName()
  {
    return (EAttribute)requirementNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRequirementNode_Children()
  {
    return (EReference)requirementNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBomNode()
  {
    return bomNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBomNode_Weight()
  {
    return (EAttribute)bomNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBomNode_Children()
  {
    return (EReference)bomNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEvidenceNode()
  {
    return evidenceNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEvidenceNode_Children()
  {
    return (EReference)evidenceNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodeBodyElement()
  {
    return nodeBodyElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getText_Text()
  {
    return (EAttribute)textEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodeReference()
  {
    return nodeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeReference_Ref()
  {
    return (EReference)nodeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getRepositoryType()
  {
    return repositoryTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QmsFactory getQmsFactory()
  {
    return (QmsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__NAME);

    repositoryEClass = createEClass(REPOSITORY);
    createEAttribute(repositoryEClass, REPOSITORY__TYPE);
    createEReference(repositoryEClass, REPOSITORY__ROOT);

    repositoryNodeEClass = createEClass(REPOSITORY_NODE);
    createEAttribute(repositoryNodeEClass, REPOSITORY_NODE__TITLE);
    createEReference(repositoryNodeEClass, REPOSITORY_NODE__BODY);

    requirementNodeEClass = createEClass(REQUIREMENT_NODE);
    createEAttribute(requirementNodeEClass, REQUIREMENT_NODE__FORMER_NAME);
    createEReference(requirementNodeEClass, REQUIREMENT_NODE__CHILDREN);

    bomNodeEClass = createEClass(BOM_NODE);
    createEAttribute(bomNodeEClass, BOM_NODE__WEIGHT);
    createEReference(bomNodeEClass, BOM_NODE__CHILDREN);

    evidenceNodeEClass = createEClass(EVIDENCE_NODE);
    createEReference(evidenceNodeEClass, EVIDENCE_NODE__CHILDREN);

    nodeBodyElementEClass = createEClass(NODE_BODY_ELEMENT);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__TEXT);

    nodeReferenceEClass = createEClass(NODE_REFERENCE);
    createEReference(nodeReferenceEClass, NODE_REFERENCE__REF);

    // Create enums
    repositoryTypeEEnum = createEEnum(REPOSITORY_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    repositoryEClass.getESuperTypes().add(this.getModel());
    repositoryNodeEClass.getESuperTypes().add(this.getModel());
    requirementNodeEClass.getESuperTypes().add(this.getRepositoryNode());
    bomNodeEClass.getESuperTypes().add(this.getRepositoryNode());
    evidenceNodeEClass.getESuperTypes().add(this.getRepositoryNode());
    textEClass.getESuperTypes().add(this.getNodeBodyElement());
    nodeReferenceEClass.getESuperTypes().add(this.getNodeBodyElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepository_Type(), this.getRepositoryType(), "type", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepository_Root(), this.getRepositoryNode(), null, "root", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryNodeEClass, RepositoryNode.class, "RepositoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepositoryNode_Title(), ecorePackage.getEString(), "title", null, 0, 1, RepositoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepositoryNode_Body(), this.getNodeBodyElement(), null, "body", null, 0, -1, RepositoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementNodeEClass, RequirementNode.class, "RequirementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirementNode_FormerName(), ecorePackage.getEString(), "formerName", null, 0, 1, RequirementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementNode_Children(), this.getRequirementNode(), null, "children", null, 0, -1, RequirementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bomNodeEClass, BomNode.class, "BomNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBomNode_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, BomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBomNode_Children(), this.getBomNode(), null, "children", null, 0, -1, BomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evidenceNodeEClass, EvidenceNode.class, "EvidenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvidenceNode_Children(), this.getEvidenceNode(), null, "children", null, 0, -1, EvidenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeBodyElementEClass, NodeBodyElement.class, "NodeBodyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeReferenceEClass, NodeReference.class, "NodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeReference_Ref(), this.getRepositoryNode(), null, "ref", null, 0, 1, NodeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(repositoryTypeEEnum, RepositoryType.class, "RepositoryType");
    addEEnumLiteral(repositoryTypeEEnum, RepositoryType.REQUIREMENT);
    addEEnumLiteral(repositoryTypeEEnum, RepositoryType.EVIDENCE);
    addEEnumLiteral(repositoryTypeEEnum, RepositoryType.QMS);
    addEEnumLiteral(repositoryTypeEEnum, RepositoryType.BOM);

    // Create resource
    createResource(eNS_URI);
  }

} //QmsPackageImpl