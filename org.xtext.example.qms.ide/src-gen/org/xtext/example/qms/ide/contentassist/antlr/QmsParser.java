/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.qms.ide.contentassist.antlr.internal.InternalQmsParser;
import org.xtext.example.qms.services.QmsGrammarAccess;

public class QmsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(QmsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, QmsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getRepositoryNodeAccess().getAlternatives(), "rule__RepositoryNode__Alternatives");
			builder.put(grammarAccess.getNodeBodyElementAccess().getAlternatives(), "rule__NodeBodyElement__Alternatives");
			builder.put(grammarAccess.getRepositoryTypeAccess().getAlternatives(), "rule__RepositoryType__Alternatives");
			builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
			builder.put(grammarAccess.getRequirementNodeAccess().getGroup(), "rule__RequirementNode__Group__0");
			builder.put(grammarAccess.getRequirementNodeAccess().getGroup_2(), "rule__RequirementNode__Group_2__0");
			builder.put(grammarAccess.getRequirementNodeAccess().getGroup_4(), "rule__RequirementNode__Group_4__0");
			builder.put(grammarAccess.getBomNodeAccess().getGroup(), "rule__BomNode__Group__0");
			builder.put(grammarAccess.getBomNodeAccess().getGroup_3(), "rule__BomNode__Group_3__0");
			builder.put(grammarAccess.getEvidenceNodeAccess().getGroup(), "rule__EvidenceNode__Group__0");
			builder.put(grammarAccess.getEvidenceNodeAccess().getGroup_3(), "rule__EvidenceNode__Group_3__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getNodeReferenceAccess().getGroup(), "rule__NodeReference__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getRepositoryAccess().getNameAssignment_1(), "rule__Repository__NameAssignment_1");
			builder.put(grammarAccess.getRepositoryAccess().getTypeAssignment_3(), "rule__Repository__TypeAssignment_3");
			builder.put(grammarAccess.getRepositoryAccess().getRootAssignment_4(), "rule__Repository__RootAssignment_4");
			builder.put(grammarAccess.getRequirementNodeAccess().getNameAssignment_1(), "rule__RequirementNode__NameAssignment_1");
			builder.put(grammarAccess.getRequirementNodeAccess().getFormerNameAssignment_2_1(), "rule__RequirementNode__FormerNameAssignment_2_1");
			builder.put(grammarAccess.getRequirementNodeAccess().getTitleAssignment_4_1(), "rule__RequirementNode__TitleAssignment_4_1");
			builder.put(grammarAccess.getRequirementNodeAccess().getBodyAssignment_5(), "rule__RequirementNode__BodyAssignment_5");
			builder.put(grammarAccess.getRequirementNodeAccess().getChildrenAssignment_6(), "rule__RequirementNode__ChildrenAssignment_6");
			builder.put(grammarAccess.getBomNodeAccess().getNameAssignment_1(), "rule__BomNode__NameAssignment_1");
			builder.put(grammarAccess.getBomNodeAccess().getTitleAssignment_3_1(), "rule__BomNode__TitleAssignment_3_1");
			builder.put(grammarAccess.getBomNodeAccess().getBodyAssignment_4(), "rule__BomNode__BodyAssignment_4");
			builder.put(grammarAccess.getBomNodeAccess().getWeightAssignment_6(), "rule__BomNode__WeightAssignment_6");
			builder.put(grammarAccess.getBomNodeAccess().getChildrenAssignment_7(), "rule__BomNode__ChildrenAssignment_7");
			builder.put(grammarAccess.getEvidenceNodeAccess().getNameAssignment_1(), "rule__EvidenceNode__NameAssignment_1");
			builder.put(grammarAccess.getEvidenceNodeAccess().getTitleAssignment_3_1(), "rule__EvidenceNode__TitleAssignment_3_1");
			builder.put(grammarAccess.getEvidenceNodeAccess().getBodyAssignment_4(), "rule__EvidenceNode__BodyAssignment_4");
			builder.put(grammarAccess.getEvidenceNodeAccess().getChildrenAssignment_5(), "rule__EvidenceNode__ChildrenAssignment_5");
			builder.put(grammarAccess.getTextAccess().getTextAssignment_1(), "rule__Text__TextAssignment_1");
			builder.put(grammarAccess.getNodeReferenceAccess().getRefAssignment_1(), "rule__NodeReference__RefAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private QmsGrammarAccess grammarAccess;

	@Override
	protected InternalQmsParser createParser() {
		InternalQmsParser result = new InternalQmsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public QmsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QmsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
