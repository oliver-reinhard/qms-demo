/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.validation;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.qms.qms.BomNode;
import org.xtext.example.qms.qms.EvidenceNode;
import org.xtext.example.qms.qms.QmsPackage;
import org.xtext.example.qms.qms.Repository;
import org.xtext.example.qms.qms.RepositoryNode;
import org.xtext.example.qms.qms.RepositoryType;
import org.xtext.example.qms.qms.RequirementNode;
import org.xtext.example.qms.validation.AbstractQmsValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class QmsValidator extends AbstractQmsValidator {
  @Check
  public Object checkRootNodeType(final Repository r) {
    Object _switchResult = null;
    RepositoryType _type = r.getType();
    if (_type != null) {
      switch (_type) {
        case REQUIREMENT:
          RepositoryNode _root = r.getRoot();
          boolean _not = (!(_root instanceof RequirementNode));
          if (_not) {
            this.error("Must contain requirement node.", r, QmsPackage.Literals.REPOSITORY__ROOT);
          }
          break;
        case EVIDENCE:
          RepositoryNode _root_1 = r.getRoot();
          boolean _not_1 = (!(_root_1 instanceof EvidenceNode));
          if (_not_1) {
            this.error("Must contain evidence node.", r, QmsPackage.Literals.REPOSITORY__ROOT);
          }
          break;
        case QMS:
          _switchResult = null;
          break;
        case BOM:
          RepositoryNode _root_2 = r.getRoot();
          boolean _not_2 = (!(_root_2 instanceof BomNode));
          if (_not_2) {
            this.error("Must contain BOM node.", r, QmsPackage.Literals.REPOSITORY__ROOT);
          }
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  @Check
  public void checkSingleNodeModel(final RepositoryNode n) {
    EObject _eContainer = n.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      final Iterable<RepositoryNode> nodes = Iterables.<RepositoryNode>filter(n.eContents(), RepositoryNode.class);
      boolean _isEmpty = IterableExtensions.isEmpty(nodes);
      boolean _not = (!_isEmpty);
      if (_not) {
        this.error("Single-node files cannot contain more than one node.", n, QmsPackage.Literals.MODEL__NAME);
      }
    }
  }
}
