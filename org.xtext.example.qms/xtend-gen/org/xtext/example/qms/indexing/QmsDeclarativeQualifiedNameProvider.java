package org.xtext.example.qms.indexing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.example.qms.qms.Repository;
import org.xtext.example.qms.qms.RepositoryNode;

@SuppressWarnings("all")
public class QmsDeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  /**
   * Qualified name of Repository nodes = {Repository.name, node.name} instead of fully qualified by containment hierarchy.
   */
  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    if ((obj instanceof RepositoryNode)) {
      final Repository repository = EcoreUtil2.<Repository>getContainerOfType(obj, Repository.class);
      if ((repository != null)) {
        final QualifiedName.Builder builder = new QualifiedName.Builder(2);
        builder.add(((Repository) repository).getName());
        builder.add(((RepositoryNode)obj).getName());
        return builder.build();
      }
    }
    return super.getFullyQualifiedName(obj);
  }
}
