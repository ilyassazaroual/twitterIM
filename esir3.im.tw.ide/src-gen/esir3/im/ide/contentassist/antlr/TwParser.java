/*
 * generated by Xtext 2.10.0
 */
package esir3.im.ide.contentassist.antlr;

import com.google.inject.Inject;
import esir3.im.ide.contentassist.antlr.internal.InternalTwParser;
import esir3.im.services.TwGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TwParser extends AbstractContentAssistParser {

	@Inject
	private TwGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTwParser createParser() {
		InternalTwParser result = new InternalTwParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getOpBoolAccess().getAlternatives(), "rule__OpBool__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_3(), "rule__Program__Group_3__0");
					put(grammarAccess.getProgramAccess().getGroup_3_3(), "rule__Program__Group_3_3__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_3(), "rule__Block__Group_3__0");
					put(grammarAccess.getBlockAccess().getGroup_3_3(), "rule__Block__Group_3_3__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_2(), "rule__If__Group_2__0");
					put(grammarAccess.getConstAccess().getGroup(), "rule__Const__Group__0");
					put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
					put(grammarAccess.getAffectationAccess().getGroup_4(), "rule__Affectation__Group_4__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getXorAccess().getGroup(), "rule__Xor__Group__0");
					put(grammarAccess.getTweets_userAccess().getGroup(), "rule__Tweets_user__Group__0");
					put(grammarAccess.getTweets_userAccess().getGroup_3(), "rule__Tweets_user__Group_3__0");
					put(grammarAccess.getTweets_userAccess().getGroup_3_3(), "rule__Tweets_user__Group_3_3__0");
					put(grammarAccess.getTweets_locationAccess().getGroup(), "rule__Tweets_location__Group__0");
					put(grammarAccess.getTweets_locationAccess().getGroup_3(), "rule__Tweets_location__Group_3__0");
					put(grammarAccess.getTweets_locationAccess().getGroup_3_3(), "rule__Tweets_location__Group_3_3__0");
					put(grammarAccess.getTweets_entityAccess().getGroup(), "rule__Tweets_entity__Group__0");
					put(grammarAccess.getTweets_entityAccess().getGroup_3(), "rule__Tweets_entity__Group_3__0");
					put(grammarAccess.getTweets_entityAccess().getGroup_3_3(), "rule__Tweets_entity__Group_3_3__0");
					put(grammarAccess.getTweets_dateAccess().getGroup(), "rule__Tweets_date__Group__0");
					put(grammarAccess.getTweets_dateAccess().getGroup_3(), "rule__Tweets_date__Group_3__0");
					put(grammarAccess.getTweets_dateAccess().getGroup_3_3(), "rule__Tweets_date__Group_3_3__0");
					put(grammarAccess.getProportionPositifAccess().getGroup(), "rule__ProportionPositif__Group__0");
					put(grammarAccess.getProportionPositifAccess().getGroup_3(), "rule__ProportionPositif__Group_3__0");
					put(grammarAccess.getProportionPositifAccess().getGroup_3_3(), "rule__ProportionPositif__Group_3_3__0");
					put(grammarAccess.getProportionNegatifAccess().getGroup(), "rule__ProportionNegatif__Group__0");
					put(grammarAccess.getProportionNegatifAccess().getGroup_3(), "rule__ProportionNegatif__Group_3__0");
					put(grammarAccess.getProportionNegatifAccess().getGroup_3_3(), "rule__ProportionNegatif__Group_3_3__0");
					put(grammarAccess.getCountTweetAccess().getGroup(), "rule__CountTweet__Group__0");
					put(grammarAccess.getCountTweetAccess().getGroup_3(), "rule__CountTweet__Group_3__0");
					put(grammarAccess.getCountTweetAccess().getGroup_3_3(), "rule__CountTweet__Group_3_3__0");
					put(grammarAccess.getCountVisitProfilAccess().getGroup(), "rule__CountVisitProfil__Group__0");
					put(grammarAccess.getCountVisitProfilAccess().getGroup_3(), "rule__CountVisitProfil__Group_3__0");
					put(grammarAccess.getCountVisitProfilAccess().getGroup_3_3(), "rule__CountVisitProfil__Group_3_3__0");
					put(grammarAccess.getCroissanceAbonneAccess().getGroup(), "rule__CroissanceAbonne__Group__0");
					put(grammarAccess.getCroissanceAbonneAccess().getGroup_3(), "rule__CroissanceAbonne__Group_3__0");
					put(grammarAccess.getCroissanceAbonneAccess().getGroup_3_3(), "rule__CroissanceAbonne__Group_3_3__0");
					put(grammarAccess.getMoyFollowersAccess().getGroup(), "rule__MoyFollowers__Group__0");
					put(grammarAccess.getMoyFollowersAccess().getGroup_3(), "rule__MoyFollowers__Group_3__0");
					put(grammarAccess.getMoyFollowersAccess().getGroup_3_3(), "rule__MoyFollowers__Group_3_3__0");
					put(grammarAccess.getMoyFavoritedAccess().getGroup(), "rule__MoyFavorited__Group__0");
					put(grammarAccess.getMoyFavoritedAccess().getGroup_3(), "rule__MoyFavorited__Group_3__0");
					put(grammarAccess.getMoyFavoritedAccess().getGroup_3_3(), "rule__MoyFavorited__Group_3_3__0");
					put(grammarAccess.getGreaterAccess().getGroup(), "rule__Greater__Group__0");
					put(grammarAccess.getLessAccess().getGroup(), "rule__Less__Group__0");
					put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
					put(grammarAccess.getSupEgalAccess().getGroup(), "rule__SupEgal__Group__0");
					put(grammarAccess.getArgsAccess().getGroup(), "rule__Args__Group__0");
					put(grammarAccess.getArgsAccess().getGroup_3(), "rule__Args__Group_3__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_3(), "rule__Variable__Group_3__0");
					put(grammarAccess.getProgramAccess().getStatementAssignment_3_2(), "rule__Program__StatementAssignment_3_2");
					put(grammarAccess.getProgramAccess().getStatementAssignment_3_3_1(), "rule__Program__StatementAssignment_3_3_1");
					put(grammarAccess.getBlockAccess().getStatementAssignment_3_2(), "rule__Block__StatementAssignment_3_2");
					put(grammarAccess.getBlockAccess().getStatementAssignment_3_3_1(), "rule__Block__StatementAssignment_3_3_1");
					put(grammarAccess.getIfAccess().getElseBlockAssignment_2_1(), "rule__If__ElseBlockAssignment_2_1");
					put(grammarAccess.getIfAccess().getIfBlockAssignment_4(), "rule__If__IfBlockAssignment_4");
					put(grammarAccess.getIfAccess().getConditionAssignment_6(), "rule__If__ConditionAssignment_6");
					put(grammarAccess.getAffectationAccess().getVariableAssignment_3(), "rule__Affectation__VariableAssignment_3");
					put(grammarAccess.getAffectationAccess().getOpDroiteAssignment_4_1(), "rule__Affectation__OpDroiteAssignment_4_1");
					put(grammarAccess.getAndAccess().getExpressionGAssignment_3(), "rule__And__ExpressionGAssignment_3");
					put(grammarAccess.getAndAccess().getExpressionDAssignment_5(), "rule__And__ExpressionDAssignment_5");
					put(grammarAccess.getOrAccess().getExpressionGAssignment_3(), "rule__Or__ExpressionGAssignment_3");
					put(grammarAccess.getOrAccess().getExpressionDAssignment_5(), "rule__Or__ExpressionDAssignment_5");
					put(grammarAccess.getXorAccess().getExpressionGAssignment_3(), "rule__Xor__ExpressionGAssignment_3");
					put(grammarAccess.getXorAccess().getExpressionDAssignment_5(), "rule__Xor__ExpressionDAssignment_5");
					put(grammarAccess.getTweets_userAccess().getArgsAssignment_3_2(), "rule__Tweets_user__ArgsAssignment_3_2");
					put(grammarAccess.getTweets_userAccess().getArgsAssignment_3_3_1(), "rule__Tweets_user__ArgsAssignment_3_3_1");
					put(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_2(), "rule__Tweets_location__ArgsAssignment_3_2");
					put(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_3_1(), "rule__Tweets_location__ArgsAssignment_3_3_1");
					put(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_2(), "rule__Tweets_entity__ArgsAssignment_3_2");
					put(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_3_1(), "rule__Tweets_entity__ArgsAssignment_3_3_1");
					put(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_2(), "rule__Tweets_date__ArgsAssignment_3_2");
					put(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_3_1(), "rule__Tweets_date__ArgsAssignment_3_3_1");
					put(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_2(), "rule__ProportionPositif__ArgsAssignment_3_2");
					put(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_3_1(), "rule__ProportionPositif__ArgsAssignment_3_3_1");
					put(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_2(), "rule__ProportionNegatif__ArgsAssignment_3_2");
					put(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_3_1(), "rule__ProportionNegatif__ArgsAssignment_3_3_1");
					put(grammarAccess.getCountTweetAccess().getArgsAssignment_3_2(), "rule__CountTweet__ArgsAssignment_3_2");
					put(grammarAccess.getCountTweetAccess().getArgsAssignment_3_3_1(), "rule__CountTweet__ArgsAssignment_3_3_1");
					put(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_2(), "rule__CountVisitProfil__ArgsAssignment_3_2");
					put(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_3_1(), "rule__CountVisitProfil__ArgsAssignment_3_3_1");
					put(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_2(), "rule__CroissanceAbonne__ArgsAssignment_3_2");
					put(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_3_1(), "rule__CroissanceAbonne__ArgsAssignment_3_3_1");
					put(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_2(), "rule__MoyFollowers__ArgsAssignment_3_2");
					put(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_3_1(), "rule__MoyFollowers__ArgsAssignment_3_3_1");
					put(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_2(), "rule__MoyFavorited__ArgsAssignment_3_2");
					put(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_3_1(), "rule__MoyFavorited__ArgsAssignment_3_3_1");
					put(grammarAccess.getGreaterAccess().getExpressionGAssignment_3(), "rule__Greater__ExpressionGAssignment_3");
					put(grammarAccess.getGreaterAccess().getExpressionDAssignment_5(), "rule__Greater__ExpressionDAssignment_5");
					put(grammarAccess.getLessAccess().getExpressionGAssignment_3(), "rule__Less__ExpressionGAssignment_3");
					put(grammarAccess.getLessAccess().getExpressionDAssignment_5(), "rule__Less__ExpressionDAssignment_5");
					put(grammarAccess.getEqualAccess().getExpressionGAssignment_3(), "rule__Equal__ExpressionGAssignment_3");
					put(grammarAccess.getEqualAccess().getExpressionDAssignment_5(), "rule__Equal__ExpressionDAssignment_5");
					put(grammarAccess.getSupEgalAccess().getExpressionGAssignment_3(), "rule__SupEgal__ExpressionGAssignment_3");
					put(grammarAccess.getSupEgalAccess().getExpressionDAssignment_5(), "rule__SupEgal__ExpressionDAssignment_5");
					put(grammarAccess.getArgsAccess().getArgAssignment_3_1(), "rule__Args__ArgAssignment_3_1");
					put(grammarAccess.getVariableAccess().getNameVariableAssignment_3_1(), "rule__Variable__NameVariableAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTwParser typedParser = (InternalTwParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TwGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TwGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}