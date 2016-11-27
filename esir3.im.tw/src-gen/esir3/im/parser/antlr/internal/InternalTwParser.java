package esir3.im.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import esir3.im.services.TwGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTwParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'statement'", "','", "'}'", "'Block'", "'If'", "'elseBlock'", "'ifBlock'", "'condition'", "'Const'", "'Affectation'", "'variable'", "'opDroite'", "'And'", "'expressionG'", "'expressionD'", "'Or'", "'Xor'", "'tweets_user'", "'args'", "'tweets_location'", "'tweets_entity'", "'tweets_date'", "'ProportionPositif'", "'ProportionNegatif'", "'countTweet'", "'countVisitProfil'", "'CroissanceAbonne'", "'moyFollowers'", "'moyFavorited'", "'Greater'", "'Less'", "'Equal'", "'SupEgal'", "'Args'", "'arg'", "'Variable'", "'nameVariable'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTwParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTwParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTwParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTw.g"; }



     	private TwGrammarAccess grammarAccess;

        public InternalTwParser(TokenStream input, TwGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected TwGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalTw.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalTw.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalTw.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalTw.g:71:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_statement_5_0 = null;

        EObject lv_statement_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:77:2: ( ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:78:2: ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:78:2: ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:79:3: () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:79:3: ()
            // InternalTw.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:94:3: (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTw.g:95:4: otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getStatementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:103:4: ( (lv_statement_5_0= ruleStatement ) )
                    // InternalTw.g:104:5: (lv_statement_5_0= ruleStatement )
                    {
                    // InternalTw.g:104:5: (lv_statement_5_0= ruleStatement )
                    // InternalTw.g:105:6: lv_statement_5_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_statement_5_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_5_0,
                    							"esir3.im.Tw.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:122:4: (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTw.g:123:5: otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:127:5: ( (lv_statement_7_0= ruleStatement ) )
                    	    // InternalTw.g:128:6: (lv_statement_7_0= ruleStatement )
                    	    {
                    	    // InternalTw.g:128:6: (lv_statement_7_0= ruleStatement )
                    	    // InternalTw.g:129:7: lv_statement_7_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_statement_7_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statement",
                    	    								lv_statement_7_0,
                    	    								"esir3.im.Tw.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTw.g:160:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTw.g:160:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTw.g:161:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTw.g:167:1: ruleStatement returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Const_2= ruleConst | this_Affectation_3= ruleAffectation | this_And_4= ruleAnd | this_Or_5= ruleOr | this_Xor_6= ruleXor | this_tweets_user_7= ruletweets_user | this_tweets_location_8= ruletweets_location | this_tweets_entity_9= ruletweets_entity | this_tweets_date_10= ruletweets_date | this_ProportionPositif_11= ruleProportionPositif | this_ProportionNegatif_12= ruleProportionNegatif | this_countTweet_13= rulecountTweet | this_countVisitProfil_14= rulecountVisitProfil | this_CroissanceAbonne_15= ruleCroissanceAbonne | this_moyFollowers_16= rulemoyFollowers | this_moyFavorited_17= rulemoyFavorited | this_Greater_18= ruleGreater | this_Less_19= ruleLess | this_Equal_20= ruleEqual | this_SupEgal_21= ruleSupEgal ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_If_1 = null;

        EObject this_Const_2 = null;

        EObject this_Affectation_3 = null;

        EObject this_And_4 = null;

        EObject this_Or_5 = null;

        EObject this_Xor_6 = null;

        EObject this_tweets_user_7 = null;

        EObject this_tweets_location_8 = null;

        EObject this_tweets_entity_9 = null;

        EObject this_tweets_date_10 = null;

        EObject this_ProportionPositif_11 = null;

        EObject this_ProportionNegatif_12 = null;

        EObject this_countTweet_13 = null;

        EObject this_countVisitProfil_14 = null;

        EObject this_CroissanceAbonne_15 = null;

        EObject this_moyFollowers_16 = null;

        EObject this_moyFavorited_17 = null;

        EObject this_Greater_18 = null;

        EObject this_Less_19 = null;

        EObject this_Equal_20 = null;

        EObject this_SupEgal_21 = null;



        	enterRule();

        try {
            // InternalTw.g:173:2: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Const_2= ruleConst | this_Affectation_3= ruleAffectation | this_And_4= ruleAnd | this_Or_5= ruleOr | this_Xor_6= ruleXor | this_tweets_user_7= ruletweets_user | this_tweets_location_8= ruletweets_location | this_tweets_entity_9= ruletweets_entity | this_tweets_date_10= ruletweets_date | this_ProportionPositif_11= ruleProportionPositif | this_ProportionNegatif_12= ruleProportionNegatif | this_countTweet_13= rulecountTweet | this_countVisitProfil_14= rulecountVisitProfil | this_CroissanceAbonne_15= ruleCroissanceAbonne | this_moyFollowers_16= rulemoyFollowers | this_moyFavorited_17= rulemoyFavorited | this_Greater_18= ruleGreater | this_Less_19= ruleLess | this_Equal_20= ruleEqual | this_SupEgal_21= ruleSupEgal ) )
            // InternalTw.g:174:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Const_2= ruleConst | this_Affectation_3= ruleAffectation | this_And_4= ruleAnd | this_Or_5= ruleOr | this_Xor_6= ruleXor | this_tweets_user_7= ruletweets_user | this_tweets_location_8= ruletweets_location | this_tweets_entity_9= ruletweets_entity | this_tweets_date_10= ruletweets_date | this_ProportionPositif_11= ruleProportionPositif | this_ProportionNegatif_12= ruleProportionNegatif | this_countTweet_13= rulecountTweet | this_countVisitProfil_14= rulecountVisitProfil | this_CroissanceAbonne_15= ruleCroissanceAbonne | this_moyFollowers_16= rulemoyFollowers | this_moyFavorited_17= rulemoyFavorited | this_Greater_18= ruleGreater | this_Less_19= ruleLess | this_Equal_20= ruleEqual | this_SupEgal_21= ruleSupEgal )
            {
            // InternalTw.g:174:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Const_2= ruleConst | this_Affectation_3= ruleAffectation | this_And_4= ruleAnd | this_Or_5= ruleOr | this_Xor_6= ruleXor | this_tweets_user_7= ruletweets_user | this_tweets_location_8= ruletweets_location | this_tweets_entity_9= ruletweets_entity | this_tweets_date_10= ruletweets_date | this_ProportionPositif_11= ruleProportionPositif | this_ProportionNegatif_12= ruleProportionNegatif | this_countTweet_13= rulecountTweet | this_countVisitProfil_14= rulecountVisitProfil | this_CroissanceAbonne_15= ruleCroissanceAbonne | this_moyFollowers_16= rulemoyFollowers | this_moyFavorited_17= rulemoyFavorited | this_Greater_18= ruleGreater | this_Less_19= ruleLess | this_Equal_20= ruleEqual | this_SupEgal_21= ruleSupEgal )
            int alt3=22;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            case 29:
                {
                alt3=7;
                }
                break;
            case 30:
                {
                alt3=8;
                }
                break;
            case 32:
                {
                alt3=9;
                }
                break;
            case 33:
                {
                alt3=10;
                }
                break;
            case 34:
                {
                alt3=11;
                }
                break;
            case 35:
                {
                alt3=12;
                }
                break;
            case 36:
                {
                alt3=13;
                }
                break;
            case 37:
                {
                alt3=14;
                }
                break;
            case 38:
                {
                alt3=15;
                }
                break;
            case 39:
                {
                alt3=16;
                }
                break;
            case 40:
                {
                alt3=17;
                }
                break;
            case 41:
                {
                alt3=18;
                }
                break;
            case 42:
                {
                alt3=19;
                }
                break;
            case 43:
                {
                alt3=20;
                }
                break;
            case 44:
                {
                alt3=21;
                }
                break;
            case 45:
                {
                alt3=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTw.g:175:3: this_Block_0= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;


                    			current = this_Block_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTw.g:184:3: this_If_1= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_1=ruleIf();

                    state._fsp--;


                    			current = this_If_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTw.g:193:3: this_Const_2= ruleConst
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConstParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Const_2=ruleConst();

                    state._fsp--;


                    			current = this_Const_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTw.g:202:3: this_Affectation_3= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAffectationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_3=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTw.g:211:3: this_And_4= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAndParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_4=ruleAnd();

                    state._fsp--;


                    			current = this_And_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTw.g:220:3: this_Or_5= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOrParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_5=ruleOr();

                    state._fsp--;


                    			current = this_Or_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTw.g:229:3: this_Xor_6= ruleXor
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getXorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Xor_6=ruleXor();

                    state._fsp--;


                    			current = this_Xor_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTw.g:238:3: this_tweets_user_7= ruletweets_user
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_userParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_user_7=ruletweets_user();

                    state._fsp--;


                    			current = this_tweets_user_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTw.g:247:3: this_tweets_location_8= ruletweets_location
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_locationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_location_8=ruletweets_location();

                    state._fsp--;


                    			current = this_tweets_location_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTw.g:256:3: this_tweets_entity_9= ruletweets_entity
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_entityParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_entity_9=ruletweets_entity();

                    state._fsp--;


                    			current = this_tweets_entity_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTw.g:265:3: this_tweets_date_10= ruletweets_date
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_dateParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_date_10=ruletweets_date();

                    state._fsp--;


                    			current = this_tweets_date_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTw.g:274:3: this_ProportionPositif_11= ruleProportionPositif
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getProportionPositifParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionPositif_11=ruleProportionPositif();

                    state._fsp--;


                    			current = this_ProportionPositif_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTw.g:283:3: this_ProportionNegatif_12= ruleProportionNegatif
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getProportionNegatifParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionNegatif_12=ruleProportionNegatif();

                    state._fsp--;


                    			current = this_ProportionNegatif_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTw.g:292:3: this_countTweet_13= rulecountTweet
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCountTweetParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_countTweet_13=rulecountTweet();

                    state._fsp--;


                    			current = this_countTweet_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTw.g:301:3: this_countVisitProfil_14= rulecountVisitProfil
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCountVisitProfilParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_countVisitProfil_14=rulecountVisitProfil();

                    state._fsp--;


                    			current = this_countVisitProfil_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTw.g:310:3: this_CroissanceAbonne_15= ruleCroissanceAbonne
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCroissanceAbonneParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_CroissanceAbonne_15=ruleCroissanceAbonne();

                    state._fsp--;


                    			current = this_CroissanceAbonne_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTw.g:319:3: this_moyFollowers_16= rulemoyFollowers
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoyFollowersParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFollowers_16=rulemoyFollowers();

                    state._fsp--;


                    			current = this_moyFollowers_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTw.g:328:3: this_moyFavorited_17= rulemoyFavorited
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoyFavoritedParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFavorited_17=rulemoyFavorited();

                    state._fsp--;


                    			current = this_moyFavorited_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTw.g:337:3: this_Greater_18= ruleGreater
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGreaterParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_Greater_18=ruleGreater();

                    state._fsp--;


                    			current = this_Greater_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTw.g:346:3: this_Less_19= ruleLess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLessParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_Less_19=ruleLess();

                    state._fsp--;


                    			current = this_Less_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalTw.g:355:3: this_Equal_20= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEqualParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_20=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalTw.g:364:3: this_SupEgal_21= ruleSupEgal
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSupEgalParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupEgal_21=ruleSupEgal();

                    state._fsp--;


                    			current = this_SupEgal_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleOpBool"
    // InternalTw.g:376:1: entryRuleOpBool returns [EObject current=null] : iv_ruleOpBool= ruleOpBool EOF ;
    public final EObject entryRuleOpBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpBool = null;


        try {
            // InternalTw.g:376:47: (iv_ruleOpBool= ruleOpBool EOF )
            // InternalTw.g:377:2: iv_ruleOpBool= ruleOpBool EOF
            {
             newCompositeNode(grammarAccess.getOpBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpBool=ruleOpBool();

            state._fsp--;

             current =iv_ruleOpBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpBool"


    // $ANTLR start "ruleOpBool"
    // InternalTw.g:383:1: ruleOpBool returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor | this_Greater_3= ruleGreater | this_Less_4= ruleLess | this_Equal_5= ruleEqual | this_SupEgal_6= ruleSupEgal ) ;
    public final EObject ruleOpBool() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;

        EObject this_Xor_2 = null;

        EObject this_Greater_3 = null;

        EObject this_Less_4 = null;

        EObject this_Equal_5 = null;

        EObject this_SupEgal_6 = null;



        	enterRule();

        try {
            // InternalTw.g:389:2: ( (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor | this_Greater_3= ruleGreater | this_Less_4= ruleLess | this_Equal_5= ruleEqual | this_SupEgal_6= ruleSupEgal ) )
            // InternalTw.g:390:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor | this_Greater_3= ruleGreater | this_Less_4= ruleLess | this_Equal_5= ruleEqual | this_SupEgal_6= ruleSupEgal )
            {
            // InternalTw.g:390:2: (this_And_0= ruleAnd | this_Or_1= ruleOr | this_Xor_2= ruleXor | this_Greater_3= ruleGreater | this_Less_4= ruleLess | this_Equal_5= ruleEqual | this_SupEgal_6= ruleSupEgal )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 42:
                {
                alt4=4;
                }
                break;
            case 43:
                {
                alt4=5;
                }
                break;
            case 44:
                {
                alt4=6;
                }
                break;
            case 45:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTw.g:391:3: this_And_0= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getAndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;


                    			current = this_And_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTw.g:400:3: this_Or_1= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getOrParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_1=ruleOr();

                    state._fsp--;


                    			current = this_Or_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTw.g:409:3: this_Xor_2= ruleXor
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getXorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Xor_2=ruleXor();

                    state._fsp--;


                    			current = this_Xor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTw.g:418:3: this_Greater_3= ruleGreater
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getGreaterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Greater_3=ruleGreater();

                    state._fsp--;


                    			current = this_Greater_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTw.g:427:3: this_Less_4= ruleLess
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getLessParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Less_4=ruleLess();

                    state._fsp--;


                    			current = this_Less_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTw.g:436:3: this_Equal_5= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getEqualParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_5=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTw.g:445:3: this_SupEgal_6= ruleSupEgal
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getSupEgalParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupEgal_6=ruleSupEgal();

                    state._fsp--;


                    			current = this_SupEgal_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpBool"


    // $ANTLR start "entryRuleExpression"
    // InternalTw.g:457:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTw.g:457:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTw.g:458:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTw.g:464:1: ruleExpression returns [EObject current=null] : (this_Const_0= ruleConst | this_Affectation_1= ruleAffectation | this_And_2= ruleAnd | this_Or_3= ruleOr | this_Xor_4= ruleXor | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_Greater_16= ruleGreater | this_Less_17= ruleLess | this_Equal_18= ruleEqual | this_SupEgal_19= ruleSupEgal ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_Affectation_1 = null;

        EObject this_And_2 = null;

        EObject this_Or_3 = null;

        EObject this_Xor_4 = null;

        EObject this_tweets_user_5 = null;

        EObject this_tweets_location_6 = null;

        EObject this_tweets_entity_7 = null;

        EObject this_tweets_date_8 = null;

        EObject this_ProportionPositif_9 = null;

        EObject this_ProportionNegatif_10 = null;

        EObject this_countTweet_11 = null;

        EObject this_countVisitProfil_12 = null;

        EObject this_CroissanceAbonne_13 = null;

        EObject this_moyFollowers_14 = null;

        EObject this_moyFavorited_15 = null;

        EObject this_Greater_16 = null;

        EObject this_Less_17 = null;

        EObject this_Equal_18 = null;

        EObject this_SupEgal_19 = null;



        	enterRule();

        try {
            // InternalTw.g:470:2: ( (this_Const_0= ruleConst | this_Affectation_1= ruleAffectation | this_And_2= ruleAnd | this_Or_3= ruleOr | this_Xor_4= ruleXor | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_Greater_16= ruleGreater | this_Less_17= ruleLess | this_Equal_18= ruleEqual | this_SupEgal_19= ruleSupEgal ) )
            // InternalTw.g:471:2: (this_Const_0= ruleConst | this_Affectation_1= ruleAffectation | this_And_2= ruleAnd | this_Or_3= ruleOr | this_Xor_4= ruleXor | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_Greater_16= ruleGreater | this_Less_17= ruleLess | this_Equal_18= ruleEqual | this_SupEgal_19= ruleSupEgal )
            {
            // InternalTw.g:471:2: (this_Const_0= ruleConst | this_Affectation_1= ruleAffectation | this_And_2= ruleAnd | this_Or_3= ruleOr | this_Xor_4= ruleXor | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_Greater_16= ruleGreater | this_Less_17= ruleLess | this_Equal_18= ruleEqual | this_SupEgal_19= ruleSupEgal )
            int alt5=20;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            case 34:
                {
                alt5=9;
                }
                break;
            case 35:
                {
                alt5=10;
                }
                break;
            case 36:
                {
                alt5=11;
                }
                break;
            case 37:
                {
                alt5=12;
                }
                break;
            case 38:
                {
                alt5=13;
                }
                break;
            case 39:
                {
                alt5=14;
                }
                break;
            case 40:
                {
                alt5=15;
                }
                break;
            case 41:
                {
                alt5=16;
                }
                break;
            case 42:
                {
                alt5=17;
                }
                break;
            case 43:
                {
                alt5=18;
                }
                break;
            case 44:
                {
                alt5=19;
                }
                break;
            case 45:
                {
                alt5=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTw.g:472:3: this_Const_0= ruleConst
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getConstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Const_0=ruleConst();

                    state._fsp--;


                    			current = this_Const_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTw.g:481:3: this_Affectation_1= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAffectationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_1=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTw.g:490:3: this_And_2= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_2=ruleAnd();

                    state._fsp--;


                    			current = this_And_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTw.g:499:3: this_Or_3= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_3=ruleOr();

                    state._fsp--;


                    			current = this_Or_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTw.g:508:3: this_Xor_4= ruleXor
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getXorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Xor_4=ruleXor();

                    state._fsp--;


                    			current = this_Xor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTw.g:517:3: this_tweets_user_5= ruletweets_user
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_userParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_user_5=ruletweets_user();

                    state._fsp--;


                    			current = this_tweets_user_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTw.g:526:3: this_tweets_location_6= ruletweets_location
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_locationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_location_6=ruletweets_location();

                    state._fsp--;


                    			current = this_tweets_location_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTw.g:535:3: this_tweets_entity_7= ruletweets_entity
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_entityParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_entity_7=ruletweets_entity();

                    state._fsp--;


                    			current = this_tweets_entity_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTw.g:544:3: this_tweets_date_8= ruletweets_date
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_dateParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_date_8=ruletweets_date();

                    state._fsp--;


                    			current = this_tweets_date_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTw.g:553:3: this_ProportionPositif_9= ruleProportionPositif
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getProportionPositifParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionPositif_9=ruleProportionPositif();

                    state._fsp--;


                    			current = this_ProportionPositif_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTw.g:562:3: this_ProportionNegatif_10= ruleProportionNegatif
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getProportionNegatifParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionNegatif_10=ruleProportionNegatif();

                    state._fsp--;


                    			current = this_ProportionNegatif_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTw.g:571:3: this_countTweet_11= rulecountTweet
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCountTweetParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_countTweet_11=rulecountTweet();

                    state._fsp--;


                    			current = this_countTweet_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTw.g:580:3: this_countVisitProfil_12= rulecountVisitProfil
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCountVisitProfilParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_countVisitProfil_12=rulecountVisitProfil();

                    state._fsp--;


                    			current = this_countVisitProfil_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTw.g:589:3: this_CroissanceAbonne_13= ruleCroissanceAbonne
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCroissanceAbonneParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_CroissanceAbonne_13=ruleCroissanceAbonne();

                    state._fsp--;


                    			current = this_CroissanceAbonne_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTw.g:598:3: this_moyFollowers_14= rulemoyFollowers
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMoyFollowersParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFollowers_14=rulemoyFollowers();

                    state._fsp--;


                    			current = this_moyFollowers_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTw.g:607:3: this_moyFavorited_15= rulemoyFavorited
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMoyFavoritedParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFavorited_15=rulemoyFavorited();

                    state._fsp--;


                    			current = this_moyFavorited_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTw.g:616:3: this_Greater_16= ruleGreater
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getGreaterParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_Greater_16=ruleGreater();

                    state._fsp--;


                    			current = this_Greater_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTw.g:625:3: this_Less_17= ruleLess
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLessParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_Less_17=ruleLess();

                    state._fsp--;


                    			current = this_Less_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTw.g:634:3: this_Equal_18= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEqualParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_18=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTw.g:643:3: this_SupEgal_19= ruleSupEgal
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSupEgalParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupEgal_19=ruleSupEgal();

                    state._fsp--;


                    			current = this_SupEgal_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBlock"
    // InternalTw.g:655:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTw.g:655:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTw.g:656:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTw.g:662:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_statement_5_0 = null;

        EObject lv_statement_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:668:2: ( ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:669:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:669:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:670:3: () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:670:3: ()
            // InternalTw.g:671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:685:3: (otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTw.g:686:4: otherlv_3= 'statement' otherlv_4= '{' ( (lv_statement_5_0= ruleStatement ) ) (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getStatementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:694:4: ( (lv_statement_5_0= ruleStatement ) )
                    // InternalTw.g:695:5: (lv_statement_5_0= ruleStatement )
                    {
                    // InternalTw.g:695:5: (lv_statement_5_0= ruleStatement )
                    // InternalTw.g:696:6: lv_statement_5_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_statement_5_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_5_0,
                    							"esir3.im.Tw.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:713:4: (otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTw.g:714:5: otherlv_6= ',' ( (lv_statement_7_0= ruleStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:718:5: ( (lv_statement_7_0= ruleStatement ) )
                    	    // InternalTw.g:719:6: (lv_statement_7_0= ruleStatement )
                    	    {
                    	    // InternalTw.g:719:6: (lv_statement_7_0= ruleStatement )
                    	    // InternalTw.g:720:7: lv_statement_7_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_statement_7_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statement",
                    	    								lv_statement_7_0,
                    	    								"esir3.im.Tw.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIf"
    // InternalTw.g:751:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalTw.g:751:43: (iv_ruleIf= ruleIf EOF )
            // InternalTw.g:752:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalTw.g:758:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) ) )? otherlv_4= 'ifBlock' ( (lv_ifBlock_5_0= ruleBlock ) ) otherlv_6= 'condition' ( (lv_condition_7_0= ruleOpBool ) ) otherlv_8= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_elseBlock_3_0 = null;

        EObject lv_ifBlock_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:764:2: ( (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) ) )? otherlv_4= 'ifBlock' ( (lv_ifBlock_5_0= ruleBlock ) ) otherlv_6= 'condition' ( (lv_condition_7_0= ruleOpBool ) ) otherlv_8= '}' ) )
            // InternalTw.g:765:2: (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) ) )? otherlv_4= 'ifBlock' ( (lv_ifBlock_5_0= ruleBlock ) ) otherlv_6= 'condition' ( (lv_condition_7_0= ruleOpBool ) ) otherlv_8= '}' )
            {
            // InternalTw.g:765:2: (otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) ) )? otherlv_4= 'ifBlock' ( (lv_ifBlock_5_0= ruleBlock ) ) otherlv_6= 'condition' ( (lv_condition_7_0= ruleOpBool ) ) otherlv_8= '}' )
            // InternalTw.g:766:3: otherlv_0= 'If' otherlv_1= '{' (otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) ) )? otherlv_4= 'ifBlock' ( (lv_ifBlock_5_0= ruleBlock ) ) otherlv_6= 'condition' ( (lv_condition_7_0= ruleOpBool ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTw.g:774:3: (otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTw.g:775:4: otherlv_2= 'elseBlock' ( (lv_elseBlock_3_0= ruleBlock ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getIfAccess().getElseBlockKeyword_2_0());
                    			
                    // InternalTw.g:779:4: ( (lv_elseBlock_3_0= ruleBlock ) )
                    // InternalTw.g:780:5: (lv_elseBlock_3_0= ruleBlock )
                    {
                    // InternalTw.g:780:5: (lv_elseBlock_3_0= ruleBlock )
                    // InternalTw.g:781:6: lv_elseBlock_3_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elseBlock_3_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
                    						}
                    						set(
                    							current,
                    							"elseBlock",
                    							lv_elseBlock_3_0,
                    							"esir3.im.Tw.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getIfBlockKeyword_3());
            		
            // InternalTw.g:803:3: ( (lv_ifBlock_5_0= ruleBlock ) )
            // InternalTw.g:804:4: (lv_ifBlock_5_0= ruleBlock )
            {
            // InternalTw.g:804:4: (lv_ifBlock_5_0= ruleBlock )
            // InternalTw.g:805:5: lv_ifBlock_5_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_ifBlock_5_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"ifBlock",
            						lv_ifBlock_5_0,
            						"esir3.im.Tw.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getConditionKeyword_5());
            		
            // InternalTw.g:826:3: ( (lv_condition_7_0= ruleOpBool ) )
            // InternalTw.g:827:4: (lv_condition_7_0= ruleOpBool )
            {
            // InternalTw.g:827:4: (lv_condition_7_0= ruleOpBool )
            // InternalTw.g:828:5: lv_condition_7_0= ruleOpBool
            {

            					newCompositeNode(grammarAccess.getIfAccess().getConditionOpBoolParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_7_0=ruleOpBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_7_0,
            						"esir3.im.Tw.OpBool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleConst"
    // InternalTw.g:853:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalTw.g:853:46: (iv_ruleConst= ruleConst EOF )
            // InternalTw.g:854:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalTw.g:860:1: ruleConst returns [EObject current=null] : ( () otherlv_1= 'Const' ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTw.g:866:2: ( ( () otherlv_1= 'Const' ) )
            // InternalTw.g:867:2: ( () otherlv_1= 'Const' )
            {
            // InternalTw.g:867:2: ( () otherlv_1= 'Const' )
            // InternalTw.g:868:3: () otherlv_1= 'Const'
            {
            // InternalTw.g:868:3: ()
            // InternalTw.g:869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstAccess().getConstAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getConstAccess().getConstKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleAffectation"
    // InternalTw.g:883:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalTw.g:883:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalTw.g:884:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalTw.g:890:1: ruleAffectation returns [EObject current=null] : (otherlv_0= 'Affectation' otherlv_1= '{' otherlv_2= 'variable' ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variable_3_0 = null;

        EObject lv_opDroite_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:896:2: ( (otherlv_0= 'Affectation' otherlv_1= '{' otherlv_2= 'variable' ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) ) )? otherlv_6= '}' ) )
            // InternalTw.g:897:2: (otherlv_0= 'Affectation' otherlv_1= '{' otherlv_2= 'variable' ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) ) )? otherlv_6= '}' )
            {
            // InternalTw.g:897:2: (otherlv_0= 'Affectation' otherlv_1= '{' otherlv_2= 'variable' ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) ) )? otherlv_6= '}' )
            // InternalTw.g:898:3: otherlv_0= 'Affectation' otherlv_1= '{' otherlv_2= 'variable' ( (lv_variable_3_0= ruleVariable ) ) (otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAffectationAccess().getAffectationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAffectationAccess().getVariableKeyword_2());
            		
            // InternalTw.g:910:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalTw.g:911:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalTw.g:911:4: (lv_variable_3_0= ruleVariable )
            // InternalTw.g:912:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"esir3.im.Tw.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTw.g:929:3: (otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTw.g:930:4: otherlv_4= 'opDroite' ( (lv_opDroite_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAffectationAccess().getOpDroiteKeyword_4_0());
                    			
                    // InternalTw.g:934:4: ( (lv_opDroite_5_0= ruleExpression ) )
                    // InternalTw.g:935:5: (lv_opDroite_5_0= ruleExpression )
                    {
                    // InternalTw.g:935:5: (lv_opDroite_5_0= ruleExpression )
                    // InternalTw.g:936:6: lv_opDroite_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getAffectationAccess().getOpDroiteExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_opDroite_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAffectationRule());
                    						}
                    						set(
                    							current,
                    							"opDroite",
                    							lv_opDroite_5_0,
                    							"esir3.im.Tw.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAffectationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleAnd"
    // InternalTw.g:962:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalTw.g:962:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalTw.g:963:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTw.g:969:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:975:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:976:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:976:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:977:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:989:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:990:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:990:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:991:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:1012:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:1013:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:1013:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:1014:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalTw.g:1039:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalTw.g:1039:43: (iv_ruleOr= ruleOr EOF )
            // InternalTw.g:1040:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTw.g:1046:1: ruleOr returns [EObject current=null] : (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1052:2: ( (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:1053:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:1053:2: (otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:1054:3: otherlv_0= 'Or' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOrAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:1066:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:1067:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:1067:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:1068:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getOrAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:1089:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:1090:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:1090:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:1091:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getOrAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleXor"
    // InternalTw.g:1116:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // InternalTw.g:1116:44: (iv_ruleXor= ruleXor EOF )
            // InternalTw.g:1117:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXor"


    // $ANTLR start "ruleXor"
    // InternalTw.g:1123:1: ruleXor returns [EObject current=null] : (otherlv_0= 'Xor' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1129:2: ( (otherlv_0= 'Xor' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:1130:2: (otherlv_0= 'Xor' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:1130:2: (otherlv_0= 'Xor' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:1131:3: otherlv_0= 'Xor' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getXorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getXorAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:1143:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:1144:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:1144:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:1145:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getXorAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXorRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getXorAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:1166:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:1167:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:1167:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:1168:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getXorAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXorRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getXorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXor"


    // $ANTLR start "entryRuletweets_user"
    // InternalTw.g:1193:1: entryRuletweets_user returns [EObject current=null] : iv_ruletweets_user= ruletweets_user EOF ;
    public final EObject entryRuletweets_user() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_user = null;


        try {
            // InternalTw.g:1193:52: (iv_ruletweets_user= ruletweets_user EOF )
            // InternalTw.g:1194:2: iv_ruletweets_user= ruletweets_user EOF
            {
             newCompositeNode(grammarAccess.getTweets_userRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletweets_user=ruletweets_user();

            state._fsp--;

             current =iv_ruletweets_user; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletweets_user"


    // $ANTLR start "ruletweets_user"
    // InternalTw.g:1200:1: ruletweets_user returns [EObject current=null] : ( () otherlv_1= 'tweets_user' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruletweets_user() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1206:2: ( ( () otherlv_1= 'tweets_user' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1207:2: ( () otherlv_1= 'tweets_user' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1207:2: ( () otherlv_1= 'tweets_user' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1208:3: () otherlv_1= 'tweets_user' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1208:3: ()
            // InternalTw.g:1209:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_userAccess().getTweets_userAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_userAccess().getTweets_userKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1223:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTw.g:1224:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTweets_userAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1232:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1233:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1233:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1234:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_userRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1251:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTw.g:1252:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTweets_userAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1256:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1257:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1257:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1258:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTweets_userRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletweets_user"


    // $ANTLR start "entryRuletweets_location"
    // InternalTw.g:1289:1: entryRuletweets_location returns [EObject current=null] : iv_ruletweets_location= ruletweets_location EOF ;
    public final EObject entryRuletweets_location() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_location = null;


        try {
            // InternalTw.g:1289:56: (iv_ruletweets_location= ruletweets_location EOF )
            // InternalTw.g:1290:2: iv_ruletweets_location= ruletweets_location EOF
            {
             newCompositeNode(grammarAccess.getTweets_locationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletweets_location=ruletweets_location();

            state._fsp--;

             current =iv_ruletweets_location; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletweets_location"


    // $ANTLR start "ruletweets_location"
    // InternalTw.g:1296:1: ruletweets_location returns [EObject current=null] : ( () otherlv_1= 'tweets_location' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruletweets_location() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1302:2: ( ( () otherlv_1= 'tweets_location' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1303:2: ( () otherlv_1= 'tweets_location' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1303:2: ( () otherlv_1= 'tweets_location' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1304:3: () otherlv_1= 'tweets_location' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1304:3: ()
            // InternalTw.g:1305:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_locationAccess().getTweets_locationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1319:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTw.g:1320:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTweets_locationAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1328:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1329:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1329:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1330:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_locationRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1347:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalTw.g:1348:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTweets_locationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1352:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1353:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1353:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1354:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTweets_locationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletweets_location"


    // $ANTLR start "entryRuletweets_entity"
    // InternalTw.g:1385:1: entryRuletweets_entity returns [EObject current=null] : iv_ruletweets_entity= ruletweets_entity EOF ;
    public final EObject entryRuletweets_entity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_entity = null;


        try {
            // InternalTw.g:1385:54: (iv_ruletweets_entity= ruletweets_entity EOF )
            // InternalTw.g:1386:2: iv_ruletweets_entity= ruletweets_entity EOF
            {
             newCompositeNode(grammarAccess.getTweets_entityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletweets_entity=ruletweets_entity();

            state._fsp--;

             current =iv_ruletweets_entity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletweets_entity"


    // $ANTLR start "ruletweets_entity"
    // InternalTw.g:1392:1: ruletweets_entity returns [EObject current=null] : ( () otherlv_1= 'tweets_entity' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruletweets_entity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1398:2: ( ( () otherlv_1= 'tweets_entity' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1399:2: ( () otherlv_1= 'tweets_entity' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1399:2: ( () otherlv_1= 'tweets_entity' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1400:3: () otherlv_1= 'tweets_entity' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1400:3: ()
            // InternalTw.g:1401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_entityAccess().getTweets_entityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1415:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTw.g:1416:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTweets_entityAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1424:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1425:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1425:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1426:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_entityRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1443:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTw.g:1444:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTweets_entityAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1448:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1449:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1449:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1450:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTweets_entityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletweets_entity"


    // $ANTLR start "entryRuletweets_date"
    // InternalTw.g:1481:1: entryRuletweets_date returns [EObject current=null] : iv_ruletweets_date= ruletweets_date EOF ;
    public final EObject entryRuletweets_date() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_date = null;


        try {
            // InternalTw.g:1481:52: (iv_ruletweets_date= ruletweets_date EOF )
            // InternalTw.g:1482:2: iv_ruletweets_date= ruletweets_date EOF
            {
             newCompositeNode(grammarAccess.getTweets_dateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletweets_date=ruletweets_date();

            state._fsp--;

             current =iv_ruletweets_date; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletweets_date"


    // $ANTLR start "ruletweets_date"
    // InternalTw.g:1488:1: ruletweets_date returns [EObject current=null] : ( () otherlv_1= 'tweets_date' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruletweets_date() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1494:2: ( ( () otherlv_1= 'tweets_date' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1495:2: ( () otherlv_1= 'tweets_date' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1495:2: ( () otherlv_1= 'tweets_date' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1496:3: () otherlv_1= 'tweets_date' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1496:3: ()
            // InternalTw.g:1497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_dateAccess().getTweets_dateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1511:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTw.g:1512:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTweets_dateAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1520:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1521:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1521:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1522:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_dateRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1539:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalTw.g:1540:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTweets_dateAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1544:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1545:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1545:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1546:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTweets_dateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletweets_date"


    // $ANTLR start "entryRuleProportionPositif"
    // InternalTw.g:1577:1: entryRuleProportionPositif returns [EObject current=null] : iv_ruleProportionPositif= ruleProportionPositif EOF ;
    public final EObject entryRuleProportionPositif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProportionPositif = null;


        try {
            // InternalTw.g:1577:58: (iv_ruleProportionPositif= ruleProportionPositif EOF )
            // InternalTw.g:1578:2: iv_ruleProportionPositif= ruleProportionPositif EOF
            {
             newCompositeNode(grammarAccess.getProportionPositifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProportionPositif=ruleProportionPositif();

            state._fsp--;

             current =iv_ruleProportionPositif; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProportionPositif"


    // $ANTLR start "ruleProportionPositif"
    // InternalTw.g:1584:1: ruleProportionPositif returns [EObject current=null] : ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleProportionPositif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1590:2: ( ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1591:2: ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1591:2: ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1592:3: () otherlv_1= 'ProportionPositif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1592:3: ()
            // InternalTw.g:1593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProportionPositifAccess().getProportionPositifAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1607:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTw.g:1608:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProportionPositifAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1616:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1617:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1617:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1618:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProportionPositifRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1635:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTw.g:1636:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProportionPositifAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1640:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1641:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1641:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1642:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProportionPositifRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProportionPositif"


    // $ANTLR start "entryRuleProportionNegatif"
    // InternalTw.g:1673:1: entryRuleProportionNegatif returns [EObject current=null] : iv_ruleProportionNegatif= ruleProportionNegatif EOF ;
    public final EObject entryRuleProportionNegatif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProportionNegatif = null;


        try {
            // InternalTw.g:1673:58: (iv_ruleProportionNegatif= ruleProportionNegatif EOF )
            // InternalTw.g:1674:2: iv_ruleProportionNegatif= ruleProportionNegatif EOF
            {
             newCompositeNode(grammarAccess.getProportionNegatifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProportionNegatif=ruleProportionNegatif();

            state._fsp--;

             current =iv_ruleProportionNegatif; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProportionNegatif"


    // $ANTLR start "ruleProportionNegatif"
    // InternalTw.g:1680:1: ruleProportionNegatif returns [EObject current=null] : ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleProportionNegatif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1686:2: ( ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1687:2: ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1687:2: ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1688:3: () otherlv_1= 'ProportionNegatif' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1688:3: ()
            // InternalTw.g:1689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProportionNegatifAccess().getProportionNegatifAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1703:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTw.g:1704:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProportionNegatifAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1712:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1713:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1713:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1714:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProportionNegatifRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1731:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalTw.g:1732:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProportionNegatifAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1736:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1737:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1737:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1738:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProportionNegatifRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProportionNegatif"


    // $ANTLR start "entryRulecountTweet"
    // InternalTw.g:1769:1: entryRulecountTweet returns [EObject current=null] : iv_rulecountTweet= rulecountTweet EOF ;
    public final EObject entryRulecountTweet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecountTweet = null;


        try {
            // InternalTw.g:1769:51: (iv_rulecountTweet= rulecountTweet EOF )
            // InternalTw.g:1770:2: iv_rulecountTweet= rulecountTweet EOF
            {
             newCompositeNode(grammarAccess.getCountTweetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecountTweet=rulecountTweet();

            state._fsp--;

             current =iv_rulecountTweet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecountTweet"


    // $ANTLR start "rulecountTweet"
    // InternalTw.g:1776:1: rulecountTweet returns [EObject current=null] : ( () otherlv_1= 'countTweet' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulecountTweet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1782:2: ( ( () otherlv_1= 'countTweet' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1783:2: ( () otherlv_1= 'countTweet' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1783:2: ( () otherlv_1= 'countTweet' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1784:3: () otherlv_1= 'countTweet' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1784:3: ()
            // InternalTw.g:1785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCountTweetAccess().getCountTweetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCountTweetAccess().getCountTweetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1799:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTw.g:1800:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCountTweetAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1808:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1809:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1809:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1810:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCountTweetRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1827:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalTw.g:1828:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCountTweetAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1832:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1833:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1833:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1834:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCountTweetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecountTweet"


    // $ANTLR start "entryRulecountVisitProfil"
    // InternalTw.g:1865:1: entryRulecountVisitProfil returns [EObject current=null] : iv_rulecountVisitProfil= rulecountVisitProfil EOF ;
    public final EObject entryRulecountVisitProfil() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecountVisitProfil = null;


        try {
            // InternalTw.g:1865:57: (iv_rulecountVisitProfil= rulecountVisitProfil EOF )
            // InternalTw.g:1866:2: iv_rulecountVisitProfil= rulecountVisitProfil EOF
            {
             newCompositeNode(grammarAccess.getCountVisitProfilRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecountVisitProfil=rulecountVisitProfil();

            state._fsp--;

             current =iv_rulecountVisitProfil; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecountVisitProfil"


    // $ANTLR start "rulecountVisitProfil"
    // InternalTw.g:1872:1: rulecountVisitProfil returns [EObject current=null] : ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulecountVisitProfil() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1878:2: ( ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1879:2: ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1879:2: ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1880:3: () otherlv_1= 'countVisitProfil' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1880:3: ()
            // InternalTw.g:1881:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCountVisitProfilAccess().getCountVisitProfilAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1895:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTw.g:1896:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCountVisitProfilAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:1904:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:1905:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:1905:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:1906:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCountVisitProfilRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1923:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalTw.g:1924:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCountVisitProfilAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:1928:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:1929:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1929:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:1930:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCountVisitProfilRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecountVisitProfil"


    // $ANTLR start "entryRuleCroissanceAbonne"
    // InternalTw.g:1961:1: entryRuleCroissanceAbonne returns [EObject current=null] : iv_ruleCroissanceAbonne= ruleCroissanceAbonne EOF ;
    public final EObject entryRuleCroissanceAbonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCroissanceAbonne = null;


        try {
            // InternalTw.g:1961:57: (iv_ruleCroissanceAbonne= ruleCroissanceAbonne EOF )
            // InternalTw.g:1962:2: iv_ruleCroissanceAbonne= ruleCroissanceAbonne EOF
            {
             newCompositeNode(grammarAccess.getCroissanceAbonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCroissanceAbonne=ruleCroissanceAbonne();

            state._fsp--;

             current =iv_ruleCroissanceAbonne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCroissanceAbonne"


    // $ANTLR start "ruleCroissanceAbonne"
    // InternalTw.g:1968:1: ruleCroissanceAbonne returns [EObject current=null] : ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleCroissanceAbonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1974:2: ( ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:1975:2: ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:1975:2: ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:1976:3: () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:1976:3: ()
            // InternalTw.g:1977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1991:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTw.g:1992:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCroissanceAbonneAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:2000:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:2001:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:2001:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:2002:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCroissanceAbonneRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:2019:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTw.g:2020:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:2024:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:2025:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:2025:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:2026:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCroissanceAbonneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCroissanceAbonne"


    // $ANTLR start "entryRulemoyFollowers"
    // InternalTw.g:2057:1: entryRulemoyFollowers returns [EObject current=null] : iv_rulemoyFollowers= rulemoyFollowers EOF ;
    public final EObject entryRulemoyFollowers() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoyFollowers = null;


        try {
            // InternalTw.g:2057:53: (iv_rulemoyFollowers= rulemoyFollowers EOF )
            // InternalTw.g:2058:2: iv_rulemoyFollowers= rulemoyFollowers EOF
            {
             newCompositeNode(grammarAccess.getMoyFollowersRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemoyFollowers=rulemoyFollowers();

            state._fsp--;

             current =iv_rulemoyFollowers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemoyFollowers"


    // $ANTLR start "rulemoyFollowers"
    // InternalTw.g:2064:1: rulemoyFollowers returns [EObject current=null] : ( () otherlv_1= 'moyFollowers' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulemoyFollowers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2070:2: ( ( () otherlv_1= 'moyFollowers' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:2071:2: ( () otherlv_1= 'moyFollowers' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:2071:2: ( () otherlv_1= 'moyFollowers' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:2072:3: () otherlv_1= 'moyFollowers' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:2072:3: ()
            // InternalTw.g:2073:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoyFollowersAccess().getMoyFollowersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:2087:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTw.g:2088:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoyFollowersAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:2096:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:2097:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:2097:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:2098:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoyFollowersRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:2115:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalTw.g:2116:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMoyFollowersAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:2120:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:2121:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:2121:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:2122:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoyFollowersRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemoyFollowers"


    // $ANTLR start "entryRulemoyFavorited"
    // InternalTw.g:2153:1: entryRulemoyFavorited returns [EObject current=null] : iv_rulemoyFavorited= rulemoyFavorited EOF ;
    public final EObject entryRulemoyFavorited() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoyFavorited = null;


        try {
            // InternalTw.g:2153:53: (iv_rulemoyFavorited= rulemoyFavorited EOF )
            // InternalTw.g:2154:2: iv_rulemoyFavorited= rulemoyFavorited EOF
            {
             newCompositeNode(grammarAccess.getMoyFavoritedRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemoyFavorited=rulemoyFavorited();

            state._fsp--;

             current =iv_rulemoyFavorited; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemoyFavorited"


    // $ANTLR start "rulemoyFavorited"
    // InternalTw.g:2160:1: rulemoyFavorited returns [EObject current=null] : ( () otherlv_1= 'moyFavorited' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulemoyFavorited() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2166:2: ( ( () otherlv_1= 'moyFavorited' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalTw.g:2167:2: ( () otherlv_1= 'moyFavorited' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalTw.g:2167:2: ( () otherlv_1= 'moyFavorited' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalTw.g:2168:3: () otherlv_1= 'moyFavorited' otherlv_2= '{' (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalTw.g:2168:3: ()
            // InternalTw.g:2169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoyFavoritedAccess().getMoyFavoritedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:2183:3: (otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTw.g:2184:4: otherlv_3= 'args' otherlv_4= '{' ( (lv_args_5_0= ruleArgs ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoyFavoritedAccess().getArgsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTw.g:2192:4: ( (lv_args_5_0= ruleArgs ) )
                    // InternalTw.g:2193:5: (lv_args_5_0= ruleArgs )
                    {
                    // InternalTw.g:2193:5: (lv_args_5_0= ruleArgs )
                    // InternalTw.g:2194:6: lv_args_5_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_5_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoyFavoritedRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:2211:4: (otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalTw.g:2212:5: otherlv_6= ',' ( (lv_args_7_0= ruleArgs ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMoyFavoritedAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTw.g:2216:5: ( (lv_args_7_0= ruleArgs ) )
                    	    // InternalTw.g:2217:6: (lv_args_7_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:2217:6: (lv_args_7_0= ruleArgs )
                    	    // InternalTw.g:2218:7: lv_args_7_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_7_0=ruleArgs();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoyFavoritedRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"esir3.im.Tw.Args");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemoyFavorited"


    // $ANTLR start "entryRuleGreater"
    // InternalTw.g:2249:1: entryRuleGreater returns [EObject current=null] : iv_ruleGreater= ruleGreater EOF ;
    public final EObject entryRuleGreater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreater = null;


        try {
            // InternalTw.g:2249:48: (iv_ruleGreater= ruleGreater EOF )
            // InternalTw.g:2250:2: iv_ruleGreater= ruleGreater EOF
            {
             newCompositeNode(grammarAccess.getGreaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreater=ruleGreater();

            state._fsp--;

             current =iv_ruleGreater; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreater"


    // $ANTLR start "ruleGreater"
    // InternalTw.g:2256:1: ruleGreater returns [EObject current=null] : (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleGreater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2262:2: ( (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:2263:2: (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:2263:2: (otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:2264:3: otherlv_0= 'Greater' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterAccess().getGreaterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGreaterAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:2276:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:2277:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:2277:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:2278:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGreaterAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGreaterAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:2299:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:2300:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:2300:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:2301:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGreaterAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGreaterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreater"


    // $ANTLR start "entryRuleLess"
    // InternalTw.g:2326:1: entryRuleLess returns [EObject current=null] : iv_ruleLess= ruleLess EOF ;
    public final EObject entryRuleLess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLess = null;


        try {
            // InternalTw.g:2326:45: (iv_ruleLess= ruleLess EOF )
            // InternalTw.g:2327:2: iv_ruleLess= ruleLess EOF
            {
             newCompositeNode(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLess=ruleLess();

            state._fsp--;

             current =iv_ruleLess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalTw.g:2333:1: ruleLess returns [EObject current=null] : (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleLess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2339:2: ( (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:2340:2: (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:2340:2: (otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:2341:3: otherlv_0= 'Less' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLessAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLessAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLessAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:2353:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:2354:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:2354:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:2355:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLessAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getLessAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:2376:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:2377:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:2377:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:2378:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLessAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLessAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleEqual"
    // InternalTw.g:2403:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalTw.g:2403:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalTw.g:2404:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalTw.g:2410:1: ruleEqual returns [EObject current=null] : (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2416:2: ( (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:2417:2: (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:2417:2: (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:2418:3: otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:2430:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:2431:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:2431:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:2432:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:2453:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:2454:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:2454:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:2455:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEqualAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleSupEgal"
    // InternalTw.g:2480:1: entryRuleSupEgal returns [EObject current=null] : iv_ruleSupEgal= ruleSupEgal EOF ;
    public final EObject entryRuleSupEgal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupEgal = null;


        try {
            // InternalTw.g:2480:48: (iv_ruleSupEgal= ruleSupEgal EOF )
            // InternalTw.g:2481:2: iv_ruleSupEgal= ruleSupEgal EOF
            {
             newCompositeNode(grammarAccess.getSupEgalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupEgal=ruleSupEgal();

            state._fsp--;

             current =iv_ruleSupEgal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupEgal"


    // $ANTLR start "ruleSupEgal"
    // InternalTw.g:2487:1: ruleSupEgal returns [EObject current=null] : (otherlv_0= 'SupEgal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleSupEgal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressionG_3_0 = null;

        EObject lv_expressionD_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2493:2: ( (otherlv_0= 'SupEgal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalTw.g:2494:2: (otherlv_0= 'SupEgal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalTw.g:2494:2: (otherlv_0= 'SupEgal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalTw.g:2495:3: otherlv_0= 'SupEgal' otherlv_1= '{' otherlv_2= 'expressionG' ( (lv_expressionG_3_0= ruleExpression ) ) otherlv_4= 'expressionD' ( (lv_expressionD_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSupEgalAccess().getSupEgalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSupEgalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSupEgalAccess().getExpressionGKeyword_2());
            		
            // InternalTw.g:2507:3: ( (lv_expressionG_3_0= ruleExpression ) )
            // InternalTw.g:2508:4: (lv_expressionG_3_0= ruleExpression )
            {
            // InternalTw.g:2508:4: (lv_expressionG_3_0= ruleExpression )
            // InternalTw.g:2509:5: lv_expressionG_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSupEgalAccess().getExpressionGExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressionG_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupEgalRule());
            					}
            					set(
            						current,
            						"expressionG",
            						lv_expressionG_3_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSupEgalAccess().getExpressionDKeyword_4());
            		
            // InternalTw.g:2530:3: ( (lv_expressionD_5_0= ruleExpression ) )
            // InternalTw.g:2531:4: (lv_expressionD_5_0= ruleExpression )
            {
            // InternalTw.g:2531:4: (lv_expressionD_5_0= ruleExpression )
            // InternalTw.g:2532:5: lv_expressionD_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSupEgalAccess().getExpressionDExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_expressionD_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupEgalRule());
            					}
            					set(
            						current,
            						"expressionD",
            						lv_expressionD_5_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSupEgalAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupEgal"


    // $ANTLR start "entryRuleArgs"
    // InternalTw.g:2557:1: entryRuleArgs returns [EObject current=null] : iv_ruleArgs= ruleArgs EOF ;
    public final EObject entryRuleArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgs = null;


        try {
            // InternalTw.g:2557:45: (iv_ruleArgs= ruleArgs EOF )
            // InternalTw.g:2558:2: iv_ruleArgs= ruleArgs EOF
            {
             newCompositeNode(grammarAccess.getArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgs=ruleArgs();

            state._fsp--;

             current =iv_ruleArgs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgs"


    // $ANTLR start "ruleArgs"
    // InternalTw.g:2564:1: ruleArgs returns [EObject current=null] : ( () otherlv_1= 'Args' otherlv_2= '{' (otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2570:2: ( ( () otherlv_1= 'Args' otherlv_2= '{' (otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) ) )? otherlv_5= '}' ) )
            // InternalTw.g:2571:2: ( () otherlv_1= 'Args' otherlv_2= '{' (otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            {
            // InternalTw.g:2571:2: ( () otherlv_1= 'Args' otherlv_2= '{' (otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            // InternalTw.g:2572:3: () otherlv_1= 'Args' otherlv_2= '{' (otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) ) )? otherlv_5= '}'
            {
            // InternalTw.g:2572:3: ()
            // InternalTw.g:2573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgsAccess().getArgsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArgsAccess().getArgsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getArgsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:2587:3: (otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTw.g:2588:4: otherlv_3= 'arg' ( (lv_arg_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getArgsAccess().getArgKeyword_3_0());
                    			
                    // InternalTw.g:2592:4: ( (lv_arg_4_0= ruleString0 ) )
                    // InternalTw.g:2593:5: (lv_arg_4_0= ruleString0 )
                    {
                    // InternalTw.g:2593:5: (lv_arg_4_0= ruleString0 )
                    // InternalTw.g:2594:6: lv_arg_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getArgsAccess().getArgString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_arg_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgsRule());
                    						}
                    						set(
                    							current,
                    							"arg",
                    							lv_arg_4_0,
                    							"esir3.im.Tw.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArgsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgs"


    // $ANTLR start "entryRuleString0"
    // InternalTw.g:2620:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalTw.g:2620:47: (iv_ruleString0= ruleString0 EOF )
            // InternalTw.g:2621:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalTw.g:2627:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTw.g:2633:2: (this_STRING_0= RULE_STRING )
            // InternalTw.g:2634:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleVariable"
    // InternalTw.g:2644:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTw.g:2644:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTw.g:2645:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTw.g:2651:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nameVariable_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2657:2: ( ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) ) )? otherlv_5= '}' ) )
            // InternalTw.g:2658:2: ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            {
            // InternalTw.g:2658:2: ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            // InternalTw.g:2659:3: () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) ) )? otherlv_5= '}'
            {
            // InternalTw.g:2659:3: ()
            // InternalTw.g:2660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:2674:3: (otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTw.g:2675:4: otherlv_3= 'nameVariable' ( (lv_nameVariable_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getNameVariableKeyword_3_0());
                    			
                    // InternalTw.g:2679:4: ( (lv_nameVariable_4_0= ruleString0 ) )
                    // InternalTw.g:2680:5: (lv_nameVariable_4_0= ruleString0 )
                    {
                    // InternalTw.g:2680:5: (lv_nameVariable_4_0= ruleString0 )
                    // InternalTw.g:2681:6: lv_nameVariable_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getNameVariableString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_nameVariable_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"nameVariable",
                    							lv_nameVariable_4_0,
                    							"esir3.im.Tw.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00003FFF72630000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000008000L});

}