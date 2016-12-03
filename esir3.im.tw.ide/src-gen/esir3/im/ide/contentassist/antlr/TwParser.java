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
					put(grammarAccess.getProgramAccess().getGroup_3_1(), "rule__Program__Group_3_1__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_2(), "rule__Block__Group_2__0");
					put(grammarAccess.getBlockAccess().getGroup_2_1(), "rule__Block__Group_2_1__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_5(), "rule__If__Group_5__0");
					put(grammarAccess.getDeclarationVarAccess().getGroup(), "rule__DeclarationVar__Group__0");
					put(grammarAccess.getANDAccess().getGroup(), "rule__AND__Group__0");
					put(grammarAccess.getORAccess().getGroup(), "rule__OR__Group__0");
					put(grammarAccess.getTweets_userAccess().getGroup(), "rule__Tweets_user__Group__0");
					put(grammarAccess.getTweets_userAccess().getGroup_3(), "rule__Tweets_user__Group_3__0");
					put(grammarAccess.getTweets_userAccess().getGroup_3_1(), "rule__Tweets_user__Group_3_1__0");
					put(grammarAccess.getTweets_locationAccess().getGroup(), "rule__Tweets_location__Group__0");
					put(grammarAccess.getTweets_locationAccess().getGroup_3(), "rule__Tweets_location__Group_3__0");
					put(grammarAccess.getTweets_locationAccess().getGroup_3_1(), "rule__Tweets_location__Group_3_1__0");
					put(grammarAccess.getTweets_entityAccess().getGroup(), "rule__Tweets_entity__Group__0");
					put(grammarAccess.getTweets_entityAccess().getGroup_3(), "rule__Tweets_entity__Group_3__0");
					put(grammarAccess.getTweets_entityAccess().getGroup_3_1(), "rule__Tweets_entity__Group_3_1__0");
					put(grammarAccess.getTweets_dateAccess().getGroup(), "rule__Tweets_date__Group__0");
					put(grammarAccess.getTweets_dateAccess().getGroup_3(), "rule__Tweets_date__Group_3__0");
					put(grammarAccess.getTweets_dateAccess().getGroup_3_1(), "rule__Tweets_date__Group_3_1__0");
					put(grammarAccess.getProportionPositifAccess().getGroup(), "rule__ProportionPositif__Group__0");
					put(grammarAccess.getProportionPositifAccess().getGroup_3(), "rule__ProportionPositif__Group_3__0");
					put(grammarAccess.getProportionPositifAccess().getGroup_3_1(), "rule__ProportionPositif__Group_3_1__0");
					put(grammarAccess.getProportionNegatifAccess().getGroup(), "rule__ProportionNegatif__Group__0");
					put(grammarAccess.getProportionNegatifAccess().getGroup_3(), "rule__ProportionNegatif__Group_3__0");
					put(grammarAccess.getProportionNegatifAccess().getGroup_3_1(), "rule__ProportionNegatif__Group_3_1__0");
					put(grammarAccess.getCountTweetAccess().getGroup(), "rule__CountTweet__Group__0");
					put(grammarAccess.getCountTweetAccess().getGroup_3(), "rule__CountTweet__Group_3__0");
					put(grammarAccess.getCountTweetAccess().getGroup_3_1(), "rule__CountTweet__Group_3_1__0");
					put(grammarAccess.getCountVisitProfilAccess().getGroup(), "rule__CountVisitProfil__Group__0");
					put(grammarAccess.getCountVisitProfilAccess().getGroup_3(), "rule__CountVisitProfil__Group_3__0");
					put(grammarAccess.getCountVisitProfilAccess().getGroup_3_1(), "rule__CountVisitProfil__Group_3_1__0");
					put(grammarAccess.getCroissanceAbonneAccess().getGroup(), "rule__CroissanceAbonne__Group__0");
					put(grammarAccess.getCroissanceAbonneAccess().getGroup_3(), "rule__CroissanceAbonne__Group_3__0");
					put(grammarAccess.getCroissanceAbonneAccess().getGroup_3_1(), "rule__CroissanceAbonne__Group_3_1__0");
					put(grammarAccess.getMoyFollowersAccess().getGroup(), "rule__MoyFollowers__Group__0");
					put(grammarAccess.getMoyFollowersAccess().getGroup_3(), "rule__MoyFollowers__Group_3__0");
					put(grammarAccess.getMoyFollowersAccess().getGroup_3_1(), "rule__MoyFollowers__Group_3_1__0");
					put(grammarAccess.getMoyFavoritedAccess().getGroup(), "rule__MoyFavorited__Group__0");
					put(grammarAccess.getMoyFavoritedAccess().getGroup_3(), "rule__MoyFavorited__Group_3__0");
					put(grammarAccess.getMoyFavoritedAccess().getGroup_3_1(), "rule__MoyFavorited__Group_3_1__0");
					put(grammarAccess.getGREATERAccess().getGroup(), "rule__GREATER__Group__0");
					put(grammarAccess.getLESSAccess().getGroup(), "rule__LESS__Group__0");
					put(grammarAccess.getEQUALSAccess().getGroup(), "rule__EQUALS__Group__0");
					put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
					put(grammarAccess.getADDAccess().getGroup(), "rule__ADD__Group__0");
					put(grammarAccess.getMULAccess().getGroup(), "rule__MUL__Group__0");
					put(grammarAccess.getProgramAccess().getStatementAssignment_3_0(), "rule__Program__StatementAssignment_3_0");
					put(grammarAccess.getProgramAccess().getStatementAssignment_3_1_1(), "rule__Program__StatementAssignment_3_1_1");
					put(grammarAccess.getBlockAccess().getStatementAssignment_2_0(), "rule__Block__StatementAssignment_2_0");
					put(grammarAccess.getBlockAccess().getStatementAssignment_2_1_1(), "rule__Block__StatementAssignment_2_1_1");
					put(grammarAccess.getIfAccess().getConditionAssignment_2(), "rule__If__ConditionAssignment_2");
					put(grammarAccess.getIfAccess().getIfBlockAssignment_4(), "rule__If__IfBlockAssignment_4");
					put(grammarAccess.getIfAccess().getElseBlockAssignment_5_1(), "rule__If__ElseBlockAssignment_5_1");
					put(grammarAccess.getDeclarationVarAccess().getNameAssignment_0(), "rule__DeclarationVar__NameAssignment_0");
					put(grammarAccess.getDeclarationVarAccess().getOpDroiteAssignment_2(), "rule__DeclarationVar__OpDroiteAssignment_2");
					put(grammarAccess.getANDAccess().getExp1Assignment_2(), "rule__AND__Exp1Assignment_2");
					put(grammarAccess.getANDAccess().getExp2Assignment_4(), "rule__AND__Exp2Assignment_4");
					put(grammarAccess.getORAccess().getExp1Assignment_2(), "rule__OR__Exp1Assignment_2");
					put(grammarAccess.getORAccess().getExp2Assignment_4(), "rule__OR__Exp2Assignment_4");
					put(grammarAccess.getTweets_userAccess().getArgsAssignment_3_0(), "rule__Tweets_user__ArgsAssignment_3_0");
					put(grammarAccess.getTweets_userAccess().getArgsAssignment_3_1_1(), "rule__Tweets_user__ArgsAssignment_3_1_1");
					put(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_0(), "rule__Tweets_location__ArgsAssignment_3_0");
					put(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_1_1(), "rule__Tweets_location__ArgsAssignment_3_1_1");
					put(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_0(), "rule__Tweets_entity__ArgsAssignment_3_0");
					put(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_1_1(), "rule__Tweets_entity__ArgsAssignment_3_1_1");
					put(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_0(), "rule__Tweets_date__ArgsAssignment_3_0");
					put(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_1_1(), "rule__Tweets_date__ArgsAssignment_3_1_1");
					put(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_0(), "rule__ProportionPositif__ArgsAssignment_3_0");
					put(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_1_1(), "rule__ProportionPositif__ArgsAssignment_3_1_1");
					put(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_0(), "rule__ProportionNegatif__ArgsAssignment_3_0");
					put(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_1_1(), "rule__ProportionNegatif__ArgsAssignment_3_1_1");
					put(grammarAccess.getCountTweetAccess().getArgsAssignment_3_0(), "rule__CountTweet__ArgsAssignment_3_0");
					put(grammarAccess.getCountTweetAccess().getArgsAssignment_3_1_1(), "rule__CountTweet__ArgsAssignment_3_1_1");
					put(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_0(), "rule__CountVisitProfil__ArgsAssignment_3_0");
					put(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_1_1(), "rule__CountVisitProfil__ArgsAssignment_3_1_1");
					put(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_0(), "rule__CroissanceAbonne__ArgsAssignment_3_0");
					put(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_1_1(), "rule__CroissanceAbonne__ArgsAssignment_3_1_1");
					put(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_0(), "rule__MoyFollowers__ArgsAssignment_3_0");
					put(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_1_1(), "rule__MoyFollowers__ArgsAssignment_3_1_1");
					put(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_0(), "rule__MoyFavorited__ArgsAssignment_3_0");
					put(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_1_1(), "rule__MoyFavorited__ArgsAssignment_3_1_1");
					put(grammarAccess.getGREATERAccess().getExp1Assignment_2(), "rule__GREATER__Exp1Assignment_2");
					put(grammarAccess.getGREATERAccess().getExp2Assignment_4(), "rule__GREATER__Exp2Assignment_4");
					put(grammarAccess.getLESSAccess().getExp1Assignment_2(), "rule__LESS__Exp1Assignment_2");
					put(grammarAccess.getLESSAccess().getExp2Assignment_4(), "rule__LESS__Exp2Assignment_4");
					put(grammarAccess.getEQUALSAccess().getExp1Assignment_2(), "rule__EQUALS__Exp1Assignment_2");
					put(grammarAccess.getEQUALSAccess().getExp2Assignment_4(), "rule__EQUALS__Exp2Assignment_4");
					put(grammarAccess.getUtilisationVarAccess().getNameVarAssignment(), "rule__UtilisationVar__NameVarAssignment");
					put(grammarAccess.getPrintAccess().getExpressionAssignment_2(), "rule__Print__ExpressionAssignment_2");
					put(grammarAccess.getStringTwAccess().getStringTwAssignment(), "rule__StringTw__StringTwAssignment");
					put(grammarAccess.getADDAccess().getExp1Assignment_2(), "rule__ADD__Exp1Assignment_2");
					put(grammarAccess.getADDAccess().getExp2Assignment_4(), "rule__ADD__Exp2Assignment_4");
					put(grammarAccess.getMULAccess().getExp1Assignment_2(), "rule__MUL__Exp1Assignment_2");
					put(grammarAccess.getMULAccess().getExp2Assignment_4(), "rule__MUL__Exp2Assignment_4");
					put(grammarAccess.getArgsAccess().getExpressionAssignment(), "rule__Args__ExpressionAssignment");
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
