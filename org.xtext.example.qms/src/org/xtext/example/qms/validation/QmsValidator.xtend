/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.qms.qms.BomNode
import org.xtext.example.qms.qms.EvidenceNode
import org.xtext.example.qms.qms.QmsPackage
import org.xtext.example.qms.qms.Repository
import org.xtext.example.qms.qms.RepositoryNode
import org.xtext.example.qms.qms.RequirementNode

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class QmsValidator extends AbstractQmsValidator {
	
	@Check
	def checkRootNodeType(Repository r) {
		switch r.type {
			case REQUIREMENT: if (!(r.root instanceof RequirementNode)) error("Must contain requirement node.", r, QmsPackage.Literals.REPOSITORY__ROOT)
			case EVIDENCE: if (!(r.root instanceof EvidenceNode)) error("Must contain evidence node.", r, QmsPackage.Literals.REPOSITORY__ROOT)
	//		case QMS: if (!(r.root instanceof QmsNode)) error("Must contain QMS node", r, QmsPackage.Literals.REPOSITORY__ROOT)
			case QMS: { }
			case BOM: if (!(r.root instanceof BomNode)) error("Must contain BOM node.", r, QmsPackage.Literals.REPOSITORY__ROOT)
		}
	}
	
	@Check
	def checkSingleNodeModel(RepositoryNode n) {
		if (n.eContainer === null) {
			val nodes = n.eContents.filter(RepositoryNode)
			if (! nodes.empty) {
				error("Single-node files cannot contain more than one node.", n, QmsPackage.Literals.MODEL__NAME)
			}
		}
	}
}
