package org.xtext.example.qms.indexing

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.naming.QualifiedName.Builder
import org.xtext.example.qms.qms.Repository
import org.xtext.example.qms.qms.RepositoryNode

class QmsDeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

/*
 * Qualified name of Repository nodes = {Repository.name, node.name} instead of fully qualified by containment hierarchy.
 */
	override QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof RepositoryNode) {
			val repository = EcoreUtil2.getContainerOfType(obj, Repository)
			if (repository !== null) {
				val builder = new Builder(2)
				builder.add((repository as Repository).name)
				builder.add(obj.name)
				return builder.build()
			}
		}
		return super.getFullyQualifiedName(obj);
	}
}