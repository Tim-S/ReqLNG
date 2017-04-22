/*
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.schneidertim.requirements.nlp.ide.contentassist.antlr.internal.InternalReqLNGParser;
import de.schneidertim.requirements.nlp.services.ReqLNGGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ReqLNGParser extends AbstractContentAssistParser {

	@Inject
	private ReqLNGGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalReqLNGParser createParser() {
		InternalReqLNGParser result = new InternalReqLNGParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRequirementDocumentAccess().getAlternatives_0(), "rule__RequirementDocument__Alternatives_0");
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getTextAccess().getAlternatives(), "rule__Text__Alternatives");
					put(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAlternatives_1_0(), "rule__SentenceWithReferences__PunctuationAlternatives_1_0");
					put(grammarAccess.getTextWithReferencesAccess().getAlternatives(), "rule__TextWithReferences__Alternatives");
					put(grammarAccess.getRequirementAccess().getAlternatives(), "rule__Requirement__Alternatives");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAlternatives(), "rule__TextWithConceptsOrSynonyms__Alternatives");
					put(grammarAccess.getConceptAccess().getAlternatives(), "rule__Concept__Alternatives");
					put(grammarAccess.getLiabilityAccess().getAlternatives(), "rule__Liability__Alternatives");
					put(grammarAccess.getRequirementDocumentAccess().getGroup(), "rule__RequirementDocument__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getSentenceWithReferencesAccess().getGroup(), "rule__SentenceWithReferences__Group__0");
					put(grammarAccess.getTextWithReferencesAccess().getGroup_1(), "rule__TextWithReferences__Group_1__0");
					put(grammarAccess.getReferenceCombinationAccess().getGroup(), "rule__ReferenceCombination__Group__0");
					put(grammarAccess.getConditionalRequirementAccess().getGroup(), "rule__ConditionalRequirement__Group__0");
					put(grammarAccess.getUnconditionalRequirementAccess().getGroup(), "rule__UnconditionalRequirement__Group__0");
					put(grammarAccess.getPreconditionAccess().getGroup(), "rule__Precondition__Group__0");
					put(grammarAccess.getActorInteractionAccess().getGroup(), "rule__ActorInteraction__Group__0");
					put(grammarAccess.getRequirementEndAccess().getGroup(), "rule__RequirementEnd__Group__0");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getGroup_1(), "rule__TextWithConceptsOrSynonyms__Group_1__0");
					put(grammarAccess.getConceptCombinationAccess().getGroup(), "rule__ConceptCombination__Group__0");
					put(grammarAccess.getGlossaryAccess().getGroup(), "rule__Glossary__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
					put(grammarAccess.getFunctionAccess().getGroup_3_3(), "rule__Function__Group_3_3__0");
					put(grammarAccess.getFunctionAccess().getGroup_4(), "rule__Function__Group_4__0");
					put(grammarAccess.getDomainObjectAccess().getGroup(), "rule__DomainObject__Group__0");
					put(grammarAccess.getDomainObjectAccess().getGroup_3(), "rule__DomainObject__Group_3__0");
					put(grammarAccess.getDomainObjectAccess().getGroup_3_3(), "rule__DomainObject__Group_3_3__0");
					put(grammarAccess.getDomainObjectAccess().getGroup_4(), "rule__DomainObject__Group_4__0");
					put(grammarAccess.getRequirementDocumentAccess().getEntitiesAssignment_0_0(), "rule__RequirementDocument__EntitiesAssignment_0_0");
					put(grammarAccess.getRequirementDocumentAccess().getRequirementAssignment_0_1(), "rule__RequirementDocument__RequirementAssignment_0_1");
					put(grammarAccess.getRequirementDocumentAccess().getGlossaryAssignment_1(), "rule__RequirementDocument__GlossaryAssignment_1");
					put(grammarAccess.getActorAccess().getNameAssignment_2(), "rule__Actor__NameAssignment_2");
					put(grammarAccess.getActorAccess().getDescriptionAssignment_3(), "rule__Actor__DescriptionAssignment_3");
					put(grammarAccess.getSystemAccess().getNameAssignment_2(), "rule__System__NameAssignment_2");
					put(grammarAccess.getSystemAccess().getDescriptionAssignment_3(), "rule__System__DescriptionAssignment_3");
					put(grammarAccess.getDescriptionAccess().getTextAssignment_2(), "rule__Description__TextAssignment_2");
					put(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesAssignment_0(), "rule__SentenceWithReferences__TextWithReferencesAssignment_0");
					put(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAssignment_1(), "rule__SentenceWithReferences__PunctuationAssignment_1");
					put(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0(), "rule__TextWithReferences__OnlyRefsAssignment_0");
					put(grammarAccess.getTextWithReferencesAccess().getRefBeforeAssignment_1_0(), "rule__TextWithReferences__RefBeforeAssignment_1_0");
					put(grammarAccess.getTextWithReferencesAccess().getTextAssignment_1_1(), "rule__TextWithReferences__TextAssignment_1_1");
					put(grammarAccess.getTextWithReferencesAccess().getAfterAssignment_1_2(), "rule__TextWithReferences__AfterAssignment_1_2");
					put(grammarAccess.getTextWithReferencesAccess().getFinalRefAssignment_1_3(), "rule__TextWithReferences__FinalRefAssignment_1_3");
					put(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0(), "rule__ReferenceCombination__RefsAssignment_0");
					put(grammarAccess.getReferenceCombinationAccess().getTextAssignment_1(), "rule__ReferenceCombination__TextAssignment_1");
					put(grammarAccess.getConditionalRequirementAccess().getConditionAssignment_0(), "rule__ConditionalRequirement__ConditionAssignment_0");
					put(grammarAccess.getConditionalRequirementAccess().getSystemAssignment_1(), "rule__ConditionalRequirement__SystemAssignment_1");
					put(grammarAccess.getConditionalRequirementAccess().getLiabilityAssignment_2(), "rule__ConditionalRequirement__LiabilityAssignment_2");
					put(grammarAccess.getConditionalRequirementAccess().getEndAssignment_3(), "rule__ConditionalRequirement__EndAssignment_3");
					put(grammarAccess.getUnconditionalRequirementAccess().getTheAssignment_0(), "rule__UnconditionalRequirement__TheAssignment_0");
					put(grammarAccess.getUnconditionalRequirementAccess().getSystemAssignment_1(), "rule__UnconditionalRequirement__SystemAssignment_1");
					put(grammarAccess.getUnconditionalRequirementAccess().getLiabilityAssignment_2(), "rule__UnconditionalRequirement__LiabilityAssignment_2");
					put(grammarAccess.getUnconditionalRequirementAccess().getEndAssignment_3(), "rule__UnconditionalRequirement__EndAssignment_3");
					put(grammarAccess.getPreconditionAccess().getConditionalAssignment_0(), "rule__Precondition__ConditionalAssignment_0");
					put(grammarAccess.getPreconditionAccess().getConditionAssignment_1(), "rule__Precondition__ConditionAssignment_1");
					put(grammarAccess.getActorInteractionAccess().getProvideAssignment_0(), "rule__ActorInteraction__ProvideAssignment_0");
					put(grammarAccess.getActorInteractionAccess().getThe1Assignment_1(), "rule__ActorInteraction__The1Assignment_1");
					put(grammarAccess.getActorInteractionAccess().getActorAssignment_2(), "rule__ActorInteraction__ActorAssignment_2");
					put(grammarAccess.getActorInteractionAccess().getWithAssignment_3(), "rule__ActorInteraction__WithAssignment_3");
					put(grammarAccess.getActorInteractionAccess().getThe2Assignment_4(), "rule__ActorInteraction__The2Assignment_4");
					put(grammarAccess.getActorInteractionAccess().getAbilityAssignment_5(), "rule__ActorInteraction__AbilityAssignment_5");
					put(grammarAccess.getActorInteractionAccess().getToAssignment_6(), "rule__ActorInteraction__ToAssignment_6");
					put(grammarAccess.getRequirementEndAccess().getAiAssignment_0(), "rule__RequirementEnd__AiAssignment_0");
					put(grammarAccess.getRequirementEndAccess().getObjectWithDetailsAssignment_1(), "rule__RequirementEnd__ObjectWithDetailsAssignment_1");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0(), "rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeAssignment_1_0(), "rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextAssignment_1_1(), "rule__TextWithConceptsOrSynonyms__TextAssignment_1_1");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterAssignment_1_2(), "rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2");
					put(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefAssignment_1_3(), "rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3");
					put(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0(), "rule__ConceptCombination__ConceptsAssignment_0");
					put(grammarAccess.getConceptCombinationAccess().getTextAssignment_1(), "rule__ConceptCombination__TextAssignment_1");
					put(grammarAccess.getGlossaryAccess().getConceptsAssignment_2(), "rule__Glossary__ConceptsAssignment_2");
					put(grammarAccess.getFunctionAccess().getNameAssignment_2(), "rule__Function__NameAssignment_2");
					put(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_2(), "rule__Function__SynonymsAssignment_3_2");
					put(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_3_1(), "rule__Function__SynonymsAssignment_3_3_1");
					put(grammarAccess.getFunctionAccess().getDescriptionAssignment_4_2(), "rule__Function__DescriptionAssignment_4_2");
					put(grammarAccess.getDomainObjectAccess().getNameAssignment_2(), "rule__DomainObject__NameAssignment_2");
					put(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_2(), "rule__DomainObject__SynonymsAssignment_3_2");
					put(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_3_1(), "rule__DomainObject__SynonymsAssignment_3_3_1");
					put(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2(), "rule__DomainObject__DescriptionAssignment_4_2");
					put(grammarAccess.getFunctionSynonymAccess().getNameAssignment(), "rule__FunctionSynonym__NameAssignment");
					put(grammarAccess.getDomainObjectSynonymAccess().getNameAssignment(), "rule__DomainObjectSynonym__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalReqLNGParser typedParser = (InternalReqLNGParser) parser;
			typedParser.entryRuleRequirementDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ReqLNGGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReqLNGGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
