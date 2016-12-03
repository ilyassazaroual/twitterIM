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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "';'", "'}'", "'If'", "'('", "')'", "'else'", "':='", "'AND'", "','", "'OR'", "'tweets_user'", "'tweets_location'", "'tweets_entity'", "'tweets_date'", "'ProportionPositif'", "'ProportionNegatif'", "'countTweet'", "'countVisitProfil'", "'CroissanceAbonne'", "'moyFollowers'", "'moyFavorited'", "'GREATER'", "'LESS'", "'EQUALS'", "'print'", "'ADD'", "'MUL'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalTw.g:71:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' otherlv_2= '{' ( ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_statement_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:77:2: ( ( () otherlv_1= 'Program' otherlv_2= '{' ( ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:78:2: ( () otherlv_1= 'Program' otherlv_2= '{' ( ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:78:2: ( () otherlv_1= 'Program' otherlv_2= '{' ( ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:79:3: () otherlv_1= 'Program' otherlv_2= '{' ( ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )* )? otherlv_6= '}'
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
            		
            // InternalTw.g:94:3: ( ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==12||LA2_0==15||(LA2_0>=19 && LA2_0<=20)||(LA2_0>=22 && LA2_0<=39)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTw.g:95:4: ( (lv_statement_3_0= ruleStatement ) ) (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )*
                    {
                    // InternalTw.g:95:4: ( (lv_statement_3_0= ruleStatement ) )
                    // InternalTw.g:96:5: (lv_statement_3_0= ruleStatement )
                    {
                    // InternalTw.g:96:5: (lv_statement_3_0= ruleStatement )
                    // InternalTw.g:97:6: lv_statement_3_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_statement_3_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_3_0,
                    							"esir3.im.Tw.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:114:4: (otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTw.g:115:5: otherlv_4= ';' ( (lv_statement_5_0= ruleStatement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getSemicolonKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:119:5: ( (lv_statement_5_0= ruleStatement ) )
                    	    // InternalTw.g:120:6: (lv_statement_5_0= ruleStatement )
                    	    {
                    	    // InternalTw.g:120:6: (lv_statement_5_0= ruleStatement )
                    	    // InternalTw.g:121:7: lv_statement_5_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:148:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTw.g:148:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTw.g:149:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalTw.g:155:1: ruleStatement returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_DeclarationVar_2= ruleDeclarationVar | this_AND_3= ruleAND | this_OR_4= ruleOR | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_GREATER_16= ruleGREATER | this_LESS_17= ruleLESS | this_EQUALS_18= ruleEQUALS | this_UtilisationVar_19= ruleUtilisationVar | this_print_20= ruleprint | this_StringTw_21= ruleStringTw | this_ADD_22= ruleADD | this_MUL_23= ruleMUL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_If_1 = null;

        EObject this_DeclarationVar_2 = null;

        EObject this_AND_3 = null;

        EObject this_OR_4 = null;

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

        EObject this_GREATER_16 = null;

        EObject this_LESS_17 = null;

        EObject this_EQUALS_18 = null;

        EObject this_UtilisationVar_19 = null;

        EObject this_print_20 = null;

        EObject this_StringTw_21 = null;

        EObject this_ADD_22 = null;

        EObject this_MUL_23 = null;



        	enterRule();

        try {
            // InternalTw.g:161:2: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_DeclarationVar_2= ruleDeclarationVar | this_AND_3= ruleAND | this_OR_4= ruleOR | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_GREATER_16= ruleGREATER | this_LESS_17= ruleLESS | this_EQUALS_18= ruleEQUALS | this_UtilisationVar_19= ruleUtilisationVar | this_print_20= ruleprint | this_StringTw_21= ruleStringTw | this_ADD_22= ruleADD | this_MUL_23= ruleMUL ) )
            // InternalTw.g:162:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_DeclarationVar_2= ruleDeclarationVar | this_AND_3= ruleAND | this_OR_4= ruleOR | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_GREATER_16= ruleGREATER | this_LESS_17= ruleLESS | this_EQUALS_18= ruleEQUALS | this_UtilisationVar_19= ruleUtilisationVar | this_print_20= ruleprint | this_StringTw_21= ruleStringTw | this_ADD_22= ruleADD | this_MUL_23= ruleMUL )
            {
            // InternalTw.g:162:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_DeclarationVar_2= ruleDeclarationVar | this_AND_3= ruleAND | this_OR_4= ruleOR | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_GREATER_16= ruleGREATER | this_LESS_17= ruleLESS | this_EQUALS_18= ruleEQUALS | this_UtilisationVar_19= ruleUtilisationVar | this_print_20= ruleprint | this_StringTw_21= ruleStringTw | this_ADD_22= ruleADD | this_MUL_23= ruleMUL )
            int alt3=24;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalTw.g:163:3: this_Block_0= ruleBlock
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
                    // InternalTw.g:172:3: this_If_1= ruleIf
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
                    // InternalTw.g:181:3: this_DeclarationVar_2= ruleDeclarationVar
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeclarationVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclarationVar_2=ruleDeclarationVar();

                    state._fsp--;


                    			current = this_DeclarationVar_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTw.g:190:3: this_AND_3= ruleAND
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getANDParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AND_3=ruleAND();

                    state._fsp--;


                    			current = this_AND_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTw.g:199:3: this_OR_4= ruleOR
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getORParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OR_4=ruleOR();

                    state._fsp--;


                    			current = this_OR_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTw.g:208:3: this_tweets_user_5= ruletweets_user
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_userParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_user_5=ruletweets_user();

                    state._fsp--;


                    			current = this_tweets_user_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTw.g:217:3: this_tweets_location_6= ruletweets_location
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_locationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_location_6=ruletweets_location();

                    state._fsp--;


                    			current = this_tweets_location_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTw.g:226:3: this_tweets_entity_7= ruletweets_entity
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_entityParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_entity_7=ruletweets_entity();

                    state._fsp--;


                    			current = this_tweets_entity_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTw.g:235:3: this_tweets_date_8= ruletweets_date
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTweets_dateParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_date_8=ruletweets_date();

                    state._fsp--;


                    			current = this_tweets_date_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTw.g:244:3: this_ProportionPositif_9= ruleProportionPositif
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getProportionPositifParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionPositif_9=ruleProportionPositif();

                    state._fsp--;


                    			current = this_ProportionPositif_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTw.g:253:3: this_ProportionNegatif_10= ruleProportionNegatif
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getProportionNegatifParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionNegatif_10=ruleProportionNegatif();

                    state._fsp--;


                    			current = this_ProportionNegatif_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTw.g:262:3: this_countTweet_11= rulecountTweet
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCountTweetParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_countTweet_11=rulecountTweet();

                    state._fsp--;


                    			current = this_countTweet_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTw.g:271:3: this_countVisitProfil_12= rulecountVisitProfil
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCountVisitProfilParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_countVisitProfil_12=rulecountVisitProfil();

                    state._fsp--;


                    			current = this_countVisitProfil_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTw.g:280:3: this_CroissanceAbonne_13= ruleCroissanceAbonne
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCroissanceAbonneParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_CroissanceAbonne_13=ruleCroissanceAbonne();

                    state._fsp--;


                    			current = this_CroissanceAbonne_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTw.g:289:3: this_moyFollowers_14= rulemoyFollowers
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoyFollowersParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFollowers_14=rulemoyFollowers();

                    state._fsp--;


                    			current = this_moyFollowers_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTw.g:298:3: this_moyFavorited_15= rulemoyFavorited
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoyFavoritedParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFavorited_15=rulemoyFavorited();

                    state._fsp--;


                    			current = this_moyFavorited_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTw.g:307:3: this_GREATER_16= ruleGREATER
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGREATERParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_GREATER_16=ruleGREATER();

                    state._fsp--;


                    			current = this_GREATER_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTw.g:316:3: this_LESS_17= ruleLESS
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLESSParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_LESS_17=ruleLESS();

                    state._fsp--;


                    			current = this_LESS_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTw.g:325:3: this_EQUALS_18= ruleEQUALS
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEQUALSParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_EQUALS_18=ruleEQUALS();

                    state._fsp--;


                    			current = this_EQUALS_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTw.g:334:3: this_UtilisationVar_19= ruleUtilisationVar
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUtilisationVarParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_UtilisationVar_19=ruleUtilisationVar();

                    state._fsp--;


                    			current = this_UtilisationVar_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalTw.g:343:3: this_print_20= ruleprint
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_print_20=ruleprint();

                    state._fsp--;


                    			current = this_print_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalTw.g:352:3: this_StringTw_21= ruleStringTw
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStringTwParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringTw_21=ruleStringTw();

                    state._fsp--;


                    			current = this_StringTw_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalTw.g:361:3: this_ADD_22= ruleADD
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getADDParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADD_22=ruleADD();

                    state._fsp--;


                    			current = this_ADD_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalTw.g:370:3: this_MUL_23= ruleMUL
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMULParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_MUL_23=ruleMUL();

                    state._fsp--;


                    			current = this_MUL_23;
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
    // InternalTw.g:382:1: entryRuleOpBool returns [EObject current=null] : iv_ruleOpBool= ruleOpBool EOF ;
    public final EObject entryRuleOpBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpBool = null;


        try {
            // InternalTw.g:382:47: (iv_ruleOpBool= ruleOpBool EOF )
            // InternalTw.g:383:2: iv_ruleOpBool= ruleOpBool EOF
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
    // InternalTw.g:389:1: ruleOpBool returns [EObject current=null] : (this_AND_0= ruleAND | this_OR_1= ruleOR | this_GREATER_2= ruleGREATER | this_LESS_3= ruleLESS | this_EQUALS_4= ruleEQUALS ) ;
    public final EObject ruleOpBool() throws RecognitionException {
        EObject current = null;

        EObject this_AND_0 = null;

        EObject this_OR_1 = null;

        EObject this_GREATER_2 = null;

        EObject this_LESS_3 = null;

        EObject this_EQUALS_4 = null;



        	enterRule();

        try {
            // InternalTw.g:395:2: ( (this_AND_0= ruleAND | this_OR_1= ruleOR | this_GREATER_2= ruleGREATER | this_LESS_3= ruleLESS | this_EQUALS_4= ruleEQUALS ) )
            // InternalTw.g:396:2: (this_AND_0= ruleAND | this_OR_1= ruleOR | this_GREATER_2= ruleGREATER | this_LESS_3= ruleLESS | this_EQUALS_4= ruleEQUALS )
            {
            // InternalTw.g:396:2: (this_AND_0= ruleAND | this_OR_1= ruleOR | this_GREATER_2= ruleGREATER | this_LESS_3= ruleLESS | this_EQUALS_4= ruleEQUALS )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTw.g:397:3: this_AND_0= ruleAND
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getANDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AND_0=ruleAND();

                    state._fsp--;


                    			current = this_AND_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTw.g:406:3: this_OR_1= ruleOR
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getORParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OR_1=ruleOR();

                    state._fsp--;


                    			current = this_OR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTw.g:415:3: this_GREATER_2= ruleGREATER
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getGREATERParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GREATER_2=ruleGREATER();

                    state._fsp--;


                    			current = this_GREATER_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTw.g:424:3: this_LESS_3= ruleLESS
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getLESSParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LESS_3=ruleLESS();

                    state._fsp--;


                    			current = this_LESS_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTw.g:433:3: this_EQUALS_4= ruleEQUALS
                    {

                    			newCompositeNode(grammarAccess.getOpBoolAccess().getEQUALSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EQUALS_4=ruleEQUALS();

                    state._fsp--;


                    			current = this_EQUALS_4;
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
    // InternalTw.g:445:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTw.g:445:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTw.g:446:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTw.g:452:1: ruleExpression returns [EObject current=null] : (this_AND_0= ruleAND | this_OR_1= ruleOR | this_tweets_user_2= ruletweets_user | this_tweets_location_3= ruletweets_location | this_tweets_entity_4= ruletweets_entity | this_tweets_date_5= ruletweets_date | this_ProportionPositif_6= ruleProportionPositif | this_ProportionNegatif_7= ruleProportionNegatif | this_countTweet_8= rulecountTweet | this_countVisitProfil_9= rulecountVisitProfil | this_CroissanceAbonne_10= ruleCroissanceAbonne | this_moyFollowers_11= rulemoyFollowers | this_moyFavorited_12= rulemoyFavorited | this_GREATER_13= ruleGREATER | this_LESS_14= ruleLESS | this_EQUALS_15= ruleEQUALS | this_UtilisationVar_16= ruleUtilisationVar | this_StringTw_17= ruleStringTw | this_ADD_18= ruleADD | this_MUL_19= ruleMUL ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AND_0 = null;

        EObject this_OR_1 = null;

        EObject this_tweets_user_2 = null;

        EObject this_tweets_location_3 = null;

        EObject this_tweets_entity_4 = null;

        EObject this_tweets_date_5 = null;

        EObject this_ProportionPositif_6 = null;

        EObject this_ProportionNegatif_7 = null;

        EObject this_countTweet_8 = null;

        EObject this_countVisitProfil_9 = null;

        EObject this_CroissanceAbonne_10 = null;

        EObject this_moyFollowers_11 = null;

        EObject this_moyFavorited_12 = null;

        EObject this_GREATER_13 = null;

        EObject this_LESS_14 = null;

        EObject this_EQUALS_15 = null;

        EObject this_UtilisationVar_16 = null;

        EObject this_StringTw_17 = null;

        EObject this_ADD_18 = null;

        EObject this_MUL_19 = null;



        	enterRule();

        try {
            // InternalTw.g:458:2: ( (this_AND_0= ruleAND | this_OR_1= ruleOR | this_tweets_user_2= ruletweets_user | this_tweets_location_3= ruletweets_location | this_tweets_entity_4= ruletweets_entity | this_tweets_date_5= ruletweets_date | this_ProportionPositif_6= ruleProportionPositif | this_ProportionNegatif_7= ruleProportionNegatif | this_countTweet_8= rulecountTweet | this_countVisitProfil_9= rulecountVisitProfil | this_CroissanceAbonne_10= ruleCroissanceAbonne | this_moyFollowers_11= rulemoyFollowers | this_moyFavorited_12= rulemoyFavorited | this_GREATER_13= ruleGREATER | this_LESS_14= ruleLESS | this_EQUALS_15= ruleEQUALS | this_UtilisationVar_16= ruleUtilisationVar | this_StringTw_17= ruleStringTw | this_ADD_18= ruleADD | this_MUL_19= ruleMUL ) )
            // InternalTw.g:459:2: (this_AND_0= ruleAND | this_OR_1= ruleOR | this_tweets_user_2= ruletweets_user | this_tweets_location_3= ruletweets_location | this_tweets_entity_4= ruletweets_entity | this_tweets_date_5= ruletweets_date | this_ProportionPositif_6= ruleProportionPositif | this_ProportionNegatif_7= ruleProportionNegatif | this_countTweet_8= rulecountTweet | this_countVisitProfil_9= rulecountVisitProfil | this_CroissanceAbonne_10= ruleCroissanceAbonne | this_moyFollowers_11= rulemoyFollowers | this_moyFavorited_12= rulemoyFavorited | this_GREATER_13= ruleGREATER | this_LESS_14= ruleLESS | this_EQUALS_15= ruleEQUALS | this_UtilisationVar_16= ruleUtilisationVar | this_StringTw_17= ruleStringTw | this_ADD_18= ruleADD | this_MUL_19= ruleMUL )
            {
            // InternalTw.g:459:2: (this_AND_0= ruleAND | this_OR_1= ruleOR | this_tweets_user_2= ruletweets_user | this_tweets_location_3= ruletweets_location | this_tweets_entity_4= ruletweets_entity | this_tweets_date_5= ruletweets_date | this_ProportionPositif_6= ruleProportionPositif | this_ProportionNegatif_7= ruleProportionNegatif | this_countTweet_8= rulecountTweet | this_countVisitProfil_9= rulecountVisitProfil | this_CroissanceAbonne_10= ruleCroissanceAbonne | this_moyFollowers_11= rulemoyFollowers | this_moyFavorited_12= rulemoyFavorited | this_GREATER_13= ruleGREATER | this_LESS_14= ruleLESS | this_EQUALS_15= ruleEQUALS | this_UtilisationVar_16= ruleUtilisationVar | this_StringTw_17= ruleStringTw | this_ADD_18= ruleADD | this_MUL_19= ruleMUL )
            int alt5=20;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            case 26:
                {
                alt5=6;
                }
                break;
            case 27:
                {
                alt5=7;
                }
                break;
            case 28:
                {
                alt5=8;
                }
                break;
            case 29:
                {
                alt5=9;
                }
                break;
            case 30:
                {
                alt5=10;
                }
                break;
            case 31:
                {
                alt5=11;
                }
                break;
            case 32:
                {
                alt5=12;
                }
                break;
            case 33:
                {
                alt5=13;
                }
                break;
            case 34:
                {
                alt5=14;
                }
                break;
            case 35:
                {
                alt5=15;
                }
                break;
            case 36:
                {
                alt5=16;
                }
                break;
            case RULE_ID:
                {
                alt5=17;
                }
                break;
            case RULE_STRING:
                {
                alt5=18;
                }
                break;
            case 38:
                {
                alt5=19;
                }
                break;
            case 39:
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
                    // InternalTw.g:460:3: this_AND_0= ruleAND
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getANDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AND_0=ruleAND();

                    state._fsp--;


                    			current = this_AND_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTw.g:469:3: this_OR_1= ruleOR
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getORParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OR_1=ruleOR();

                    state._fsp--;


                    			current = this_OR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTw.g:478:3: this_tweets_user_2= ruletweets_user
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_userParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_user_2=ruletweets_user();

                    state._fsp--;


                    			current = this_tweets_user_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTw.g:487:3: this_tweets_location_3= ruletweets_location
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_locationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_location_3=ruletweets_location();

                    state._fsp--;


                    			current = this_tweets_location_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTw.g:496:3: this_tweets_entity_4= ruletweets_entity
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_entityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_entity_4=ruletweets_entity();

                    state._fsp--;


                    			current = this_tweets_entity_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTw.g:505:3: this_tweets_date_5= ruletweets_date
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTweets_dateParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_tweets_date_5=ruletweets_date();

                    state._fsp--;


                    			current = this_tweets_date_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTw.g:514:3: this_ProportionPositif_6= ruleProportionPositif
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getProportionPositifParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionPositif_6=ruleProportionPositif();

                    state._fsp--;


                    			current = this_ProportionPositif_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTw.g:523:3: this_ProportionNegatif_7= ruleProportionNegatif
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getProportionNegatifParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProportionNegatif_7=ruleProportionNegatif();

                    state._fsp--;


                    			current = this_ProportionNegatif_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTw.g:532:3: this_countTweet_8= rulecountTweet
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCountTweetParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_countTweet_8=rulecountTweet();

                    state._fsp--;


                    			current = this_countTweet_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTw.g:541:3: this_countVisitProfil_9= rulecountVisitProfil
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCountVisitProfilParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_countVisitProfil_9=rulecountVisitProfil();

                    state._fsp--;


                    			current = this_countVisitProfil_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTw.g:550:3: this_CroissanceAbonne_10= ruleCroissanceAbonne
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCroissanceAbonneParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_CroissanceAbonne_10=ruleCroissanceAbonne();

                    state._fsp--;


                    			current = this_CroissanceAbonne_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTw.g:559:3: this_moyFollowers_11= rulemoyFollowers
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMoyFollowersParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFollowers_11=rulemoyFollowers();

                    state._fsp--;


                    			current = this_moyFollowers_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTw.g:568:3: this_moyFavorited_12= rulemoyFavorited
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMoyFavoritedParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_moyFavorited_12=rulemoyFavorited();

                    state._fsp--;


                    			current = this_moyFavorited_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTw.g:577:3: this_GREATER_13= ruleGREATER
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getGREATERParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_GREATER_13=ruleGREATER();

                    state._fsp--;


                    			current = this_GREATER_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTw.g:586:3: this_LESS_14= ruleLESS
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLESSParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_LESS_14=ruleLESS();

                    state._fsp--;


                    			current = this_LESS_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTw.g:595:3: this_EQUALS_15= ruleEQUALS
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEQUALSParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_EQUALS_15=ruleEQUALS();

                    state._fsp--;


                    			current = this_EQUALS_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTw.g:604:3: this_UtilisationVar_16= ruleUtilisationVar
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getUtilisationVarParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_UtilisationVar_16=ruleUtilisationVar();

                    state._fsp--;


                    			current = this_UtilisationVar_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTw.g:613:3: this_StringTw_17= ruleStringTw
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStringTwParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringTw_17=ruleStringTw();

                    state._fsp--;


                    			current = this_StringTw_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTw.g:622:3: this_ADD_18= ruleADD
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getADDParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADD_18=ruleADD();

                    state._fsp--;


                    			current = this_ADD_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTw.g:631:3: this_MUL_19= ruleMUL
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMULParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_MUL_19=ruleMUL();

                    state._fsp--;


                    			current = this_MUL_19;
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
    // InternalTw.g:643:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTw.g:643:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTw.g:644:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalTw.g:650:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_statement_2_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:656:2: ( ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )* )? otherlv_5= '}' ) )
            // InternalTw.g:657:2: ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )* )? otherlv_5= '}' )
            {
            // InternalTw.g:657:2: ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )* )? otherlv_5= '}' )
            // InternalTw.g:658:3: () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )* )? otherlv_5= '}'
            {
            // InternalTw.g:658:3: ()
            // InternalTw.g:659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTw.g:669:3: ( ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==12||LA7_0==15||(LA7_0>=19 && LA7_0<=20)||(LA7_0>=22 && LA7_0<=39)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTw.g:670:4: ( (lv_statement_2_0= ruleStatement ) ) (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )*
                    {
                    // InternalTw.g:670:4: ( (lv_statement_2_0= ruleStatement ) )
                    // InternalTw.g:671:5: (lv_statement_2_0= ruleStatement )
                    {
                    // InternalTw.g:671:5: (lv_statement_2_0= ruleStatement )
                    // InternalTw.g:672:6: lv_statement_2_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_statement_2_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_2_0,
                    							"esir3.im.Tw.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:689:4: (otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTw.g:690:5: otherlv_3= ';' ( (lv_statement_4_0= ruleStatement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSemicolonKeyword_2_1_0());
                    	    				
                    	    // InternalTw.g:694:5: ( (lv_statement_4_0= ruleStatement ) )
                    	    // InternalTw.g:695:6: (lv_statement_4_0= ruleStatement )
                    	    {
                    	    // InternalTw.g:695:6: (lv_statement_4_0= ruleStatement )
                    	    // InternalTw.g:696:7: lv_statement_4_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_statement_4_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statement",
                    	    								lv_statement_4_0,
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalTw.g:723:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalTw.g:723:43: (iv_ruleIf= ruleIf EOF )
            // InternalTw.g:724:2: iv_ruleIf= ruleIf EOF
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
    // InternalTw.g:730:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleOpBool ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalTw.g:736:2: ( (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleOpBool ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) )
            // InternalTw.g:737:2: (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleOpBool ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            {
            // InternalTw.g:737:2: (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleOpBool ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            // InternalTw.g:738:3: otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleOpBool ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:746:3: ( (lv_condition_2_0= ruleOpBool ) )
            // InternalTw.g:747:4: (lv_condition_2_0= ruleOpBool )
            {
            // InternalTw.g:747:4: (lv_condition_2_0= ruleOpBool )
            // InternalTw.g:748:5: lv_condition_2_0= ruleOpBool
            {

            					newCompositeNode(grammarAccess.getIfAccess().getConditionOpBoolParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_2_0=ruleOpBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"esir3.im.Tw.OpBool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
            		
            // InternalTw.g:769:3: ( (lv_ifBlock_4_0= ruleBlock ) )
            // InternalTw.g:770:4: (lv_ifBlock_4_0= ruleBlock )
            {
            // InternalTw.g:770:4: (lv_ifBlock_4_0= ruleBlock )
            // InternalTw.g:771:5: lv_ifBlock_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_ifBlock_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"ifBlock",
            						lv_ifBlock_4_0,
            						"esir3.im.Tw.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTw.g:788:3: (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTw.g:789:4: otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                    			
                    // InternalTw.g:793:4: ( (lv_elseBlock_6_0= ruleBlock ) )
                    // InternalTw.g:794:5: (lv_elseBlock_6_0= ruleBlock )
                    {
                    // InternalTw.g:794:5: (lv_elseBlock_6_0= ruleBlock )
                    // InternalTw.g:795:6: lv_elseBlock_6_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
                    						}
                    						set(
                    							current,
                    							"elseBlock",
                    							lv_elseBlock_6_0,
                    							"esir3.im.Tw.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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


    // $ANTLR start "entryRuleDeclarationVar"
    // InternalTw.g:817:1: entryRuleDeclarationVar returns [EObject current=null] : iv_ruleDeclarationVar= ruleDeclarationVar EOF ;
    public final EObject entryRuleDeclarationVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationVar = null;


        try {
            // InternalTw.g:817:55: (iv_ruleDeclarationVar= ruleDeclarationVar EOF )
            // InternalTw.g:818:2: iv_ruleDeclarationVar= ruleDeclarationVar EOF
            {
             newCompositeNode(grammarAccess.getDeclarationVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationVar=ruleDeclarationVar();

            state._fsp--;

             current =iv_ruleDeclarationVar; 
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
    // $ANTLR end "entryRuleDeclarationVar"


    // $ANTLR start "ruleDeclarationVar"
    // InternalTw.g:824:1: ruleDeclarationVar returns [EObject current=null] : ( ( (lv_name_0_0= ruleString0 ) )? otherlv_1= ':=' ( (lv_opDroite_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDeclarationVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_opDroite_2_0 = null;



        	enterRule();

        try {
            // InternalTw.g:830:2: ( ( ( (lv_name_0_0= ruleString0 ) )? otherlv_1= ':=' ( (lv_opDroite_2_0= ruleExpression ) ) ) )
            // InternalTw.g:831:2: ( ( (lv_name_0_0= ruleString0 ) )? otherlv_1= ':=' ( (lv_opDroite_2_0= ruleExpression ) ) )
            {
            // InternalTw.g:831:2: ( ( (lv_name_0_0= ruleString0 ) )? otherlv_1= ':=' ( (lv_opDroite_2_0= ruleExpression ) ) )
            // InternalTw.g:832:3: ( (lv_name_0_0= ruleString0 ) )? otherlv_1= ':=' ( (lv_opDroite_2_0= ruleExpression ) )
            {
            // InternalTw.g:832:3: ( (lv_name_0_0= ruleString0 ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTw.g:833:4: (lv_name_0_0= ruleString0 )
                    {
                    // InternalTw.g:833:4: (lv_name_0_0= ruleString0 )
                    // InternalTw.g:834:5: lv_name_0_0= ruleString0
                    {

                    					newCompositeNode(grammarAccess.getDeclarationVarAccess().getNameString0ParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleString0();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationVarRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"esir3.im.Tw.String0");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationVarAccess().getColonEqualsSignKeyword_1());
            		
            // InternalTw.g:855:3: ( (lv_opDroite_2_0= ruleExpression ) )
            // InternalTw.g:856:4: (lv_opDroite_2_0= ruleExpression )
            {
            // InternalTw.g:856:4: (lv_opDroite_2_0= ruleExpression )
            // InternalTw.g:857:5: lv_opDroite_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDeclarationVarAccess().getOpDroiteExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_opDroite_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationVarRule());
            					}
            					set(
            						current,
            						"opDroite",
            						lv_opDroite_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDeclarationVar"


    // $ANTLR start "entryRuleAND"
    // InternalTw.g:878:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // InternalTw.g:878:44: (iv_ruleAND= ruleAND EOF )
            // InternalTw.g:879:2: iv_ruleAND= ruleAND EOF
            {
             newCompositeNode(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND=ruleAND();

            state._fsp--;

             current =iv_ruleAND; 
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
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // InternalTw.g:885:1: ruleAND returns [EObject current=null] : (otherlv_0= 'AND' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:891:2: ( (otherlv_0= 'AND' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:892:2: (otherlv_0= 'AND' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:892:2: (otherlv_0= 'AND' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:893:3: otherlv_0= 'AND' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getANDKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getANDAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:901:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:902:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:902:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:903:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getANDAccess().getCommaKeyword_3());
            		
            // InternalTw.g:924:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:925:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:925:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:926:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getANDAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleOR"
    // InternalTw.g:951:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // InternalTw.g:951:43: (iv_ruleOR= ruleOR EOF )
            // InternalTw.g:952:2: iv_ruleOR= ruleOR EOF
            {
             newCompositeNode(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOR=ruleOR();

            state._fsp--;

             current =iv_ruleOR; 
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
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // InternalTw.g:958:1: ruleOR returns [EObject current=null] : (otherlv_0= 'OR' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:964:2: ( (otherlv_0= 'OR' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:965:2: (otherlv_0= 'OR' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:965:2: (otherlv_0= 'OR' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:966:3: otherlv_0= 'OR' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getORAccess().getORKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getORAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:974:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:975:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:975:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:976:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getORRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getORAccess().getCommaKeyword_3());
            		
            // InternalTw.g:997:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:998:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:998:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:999:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getORRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getORAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleOR"


    // $ANTLR start "entryRuletweets_user"
    // InternalTw.g:1024:1: entryRuletweets_user returns [EObject current=null] : iv_ruletweets_user= ruletweets_user EOF ;
    public final EObject entryRuletweets_user() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_user = null;


        try {
            // InternalTw.g:1024:52: (iv_ruletweets_user= ruletweets_user EOF )
            // InternalTw.g:1025:2: iv_ruletweets_user= ruletweets_user EOF
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
    // InternalTw.g:1031:1: ruletweets_user returns [EObject current=null] : ( () otherlv_1= 'tweets_user' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruletweets_user() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1037:2: ( ( () otherlv_1= 'tweets_user' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1038:2: ( () otherlv_1= 'tweets_user' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1038:2: ( () otherlv_1= 'tweets_user' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1039:3: () otherlv_1= 'tweets_user' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1039:3: ()
            // InternalTw.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_userAccess().getTweets_userAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_userAccess().getTweets_userKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1054:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==20||(LA11_0>=22 && LA11_0<=36)||(LA11_0>=38 && LA11_0<=39)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTw.g:1055:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1055:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1056:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1056:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1057:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_userRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1074:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTw.g:1075:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTweets_userAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1079:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1080:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1080:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1081:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1108:1: entryRuletweets_location returns [EObject current=null] : iv_ruletweets_location= ruletweets_location EOF ;
    public final EObject entryRuletweets_location() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_location = null;


        try {
            // InternalTw.g:1108:56: (iv_ruletweets_location= ruletweets_location EOF )
            // InternalTw.g:1109:2: iv_ruletweets_location= ruletweets_location EOF
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
    // InternalTw.g:1115:1: ruletweets_location returns [EObject current=null] : ( () otherlv_1= 'tweets_location' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruletweets_location() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1121:2: ( ( () otherlv_1= 'tweets_location' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1122:2: ( () otherlv_1= 'tweets_location' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1122:2: ( () otherlv_1= 'tweets_location' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1123:3: () otherlv_1= 'tweets_location' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1123:3: ()
            // InternalTw.g:1124:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_locationAccess().getTweets_locationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1138:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==20||(LA13_0>=22 && LA13_0<=36)||(LA13_0>=38 && LA13_0<=39)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTw.g:1139:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1139:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1140:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1140:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1141:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_locationRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1158:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==21) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalTw.g:1159:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTweets_locationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1163:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1164:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1164:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1165:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1192:1: entryRuletweets_entity returns [EObject current=null] : iv_ruletweets_entity= ruletweets_entity EOF ;
    public final EObject entryRuletweets_entity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_entity = null;


        try {
            // InternalTw.g:1192:54: (iv_ruletweets_entity= ruletweets_entity EOF )
            // InternalTw.g:1193:2: iv_ruletweets_entity= ruletweets_entity EOF
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
    // InternalTw.g:1199:1: ruletweets_entity returns [EObject current=null] : ( () otherlv_1= 'tweets_entity' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruletweets_entity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1205:2: ( ( () otherlv_1= 'tweets_entity' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1206:2: ( () otherlv_1= 'tweets_entity' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1206:2: ( () otherlv_1= 'tweets_entity' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1207:3: () otherlv_1= 'tweets_entity' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1207:3: ()
            // InternalTw.g:1208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_entityAccess().getTweets_entityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1222:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==20||(LA15_0>=22 && LA15_0<=36)||(LA15_0>=38 && LA15_0<=39)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTw.g:1223:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1223:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1224:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1224:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1225:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_entityRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1242:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTw.g:1243:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTweets_entityAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1247:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1248:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1248:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1249:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1276:1: entryRuletweets_date returns [EObject current=null] : iv_ruletweets_date= ruletweets_date EOF ;
    public final EObject entryRuletweets_date() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletweets_date = null;


        try {
            // InternalTw.g:1276:52: (iv_ruletweets_date= ruletweets_date EOF )
            // InternalTw.g:1277:2: iv_ruletweets_date= ruletweets_date EOF
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
    // InternalTw.g:1283:1: ruletweets_date returns [EObject current=null] : ( () otherlv_1= 'tweets_date' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruletweets_date() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1289:2: ( ( () otherlv_1= 'tweets_date' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1290:2: ( () otherlv_1= 'tweets_date' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1290:2: ( () otherlv_1= 'tweets_date' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1291:3: () otherlv_1= 'tweets_date' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1291:3: ()
            // InternalTw.g:1292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTweets_dateAccess().getTweets_dateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1306:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==20||(LA17_0>=22 && LA17_0<=36)||(LA17_0>=38 && LA17_0<=39)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTw.g:1307:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1307:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1308:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1308:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1309:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTweets_dateRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1326:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalTw.g:1327:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTweets_dateAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1331:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1332:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1332:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1333:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1360:1: entryRuleProportionPositif returns [EObject current=null] : iv_ruleProportionPositif= ruleProportionPositif EOF ;
    public final EObject entryRuleProportionPositif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProportionPositif = null;


        try {
            // InternalTw.g:1360:58: (iv_ruleProportionPositif= ruleProportionPositif EOF )
            // InternalTw.g:1361:2: iv_ruleProportionPositif= ruleProportionPositif EOF
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
    // InternalTw.g:1367:1: ruleProportionPositif returns [EObject current=null] : ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleProportionPositif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1373:2: ( ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1374:2: ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1374:2: ( () otherlv_1= 'ProportionPositif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1375:3: () otherlv_1= 'ProportionPositif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1375:3: ()
            // InternalTw.g:1376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProportionPositifAccess().getProportionPositifAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1390:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==20||(LA19_0>=22 && LA19_0<=36)||(LA19_0>=38 && LA19_0<=39)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTw.g:1391:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1391:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1392:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1392:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1393:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProportionPositifRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1410:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTw.g:1411:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getProportionPositifAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1415:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1416:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1416:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1417:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1444:1: entryRuleProportionNegatif returns [EObject current=null] : iv_ruleProportionNegatif= ruleProportionNegatif EOF ;
    public final EObject entryRuleProportionNegatif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProportionNegatif = null;


        try {
            // InternalTw.g:1444:58: (iv_ruleProportionNegatif= ruleProportionNegatif EOF )
            // InternalTw.g:1445:2: iv_ruleProportionNegatif= ruleProportionNegatif EOF
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
    // InternalTw.g:1451:1: ruleProportionNegatif returns [EObject current=null] : ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleProportionNegatif() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1457:2: ( ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1458:2: ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1458:2: ( () otherlv_1= 'ProportionNegatif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1459:3: () otherlv_1= 'ProportionNegatif' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1459:3: ()
            // InternalTw.g:1460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProportionNegatifAccess().getProportionNegatifAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1474:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==20||(LA21_0>=22 && LA21_0<=36)||(LA21_0>=38 && LA21_0<=39)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTw.g:1475:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1475:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1476:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1476:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1477:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProportionNegatifRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1494:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalTw.g:1495:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getProportionNegatifAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1499:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1500:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1500:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1501:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1528:1: entryRulecountTweet returns [EObject current=null] : iv_rulecountTweet= rulecountTweet EOF ;
    public final EObject entryRulecountTweet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecountTweet = null;


        try {
            // InternalTw.g:1528:51: (iv_rulecountTweet= rulecountTweet EOF )
            // InternalTw.g:1529:2: iv_rulecountTweet= rulecountTweet EOF
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
    // InternalTw.g:1535:1: rulecountTweet returns [EObject current=null] : ( () otherlv_1= 'countTweet' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulecountTweet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1541:2: ( ( () otherlv_1= 'countTweet' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1542:2: ( () otherlv_1= 'countTweet' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1542:2: ( () otherlv_1= 'countTweet' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1543:3: () otherlv_1= 'countTweet' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1543:3: ()
            // InternalTw.g:1544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCountTweetAccess().getCountTweetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCountTweetAccess().getCountTweetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1558:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||LA23_0==20||(LA23_0>=22 && LA23_0<=36)||(LA23_0>=38 && LA23_0<=39)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTw.g:1559:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1559:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1560:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1560:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1561:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCountTweetRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1578:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==21) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalTw.g:1579:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCountTweetAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1583:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1584:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1584:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1585:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1612:1: entryRulecountVisitProfil returns [EObject current=null] : iv_rulecountVisitProfil= rulecountVisitProfil EOF ;
    public final EObject entryRulecountVisitProfil() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecountVisitProfil = null;


        try {
            // InternalTw.g:1612:57: (iv_rulecountVisitProfil= rulecountVisitProfil EOF )
            // InternalTw.g:1613:2: iv_rulecountVisitProfil= rulecountVisitProfil EOF
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
    // InternalTw.g:1619:1: rulecountVisitProfil returns [EObject current=null] : ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulecountVisitProfil() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1625:2: ( ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1626:2: ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1626:2: ( () otherlv_1= 'countVisitProfil' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1627:3: () otherlv_1= 'countVisitProfil' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1627:3: ()
            // InternalTw.g:1628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCountVisitProfilAccess().getCountVisitProfilAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1642:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==20||(LA25_0>=22 && LA25_0<=36)||(LA25_0>=38 && LA25_0<=39)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTw.g:1643:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1643:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1644:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1644:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1645:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCountVisitProfilRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1662:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==21) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalTw.g:1663:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCountVisitProfilAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1667:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1668:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1668:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1669:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1696:1: entryRuleCroissanceAbonne returns [EObject current=null] : iv_ruleCroissanceAbonne= ruleCroissanceAbonne EOF ;
    public final EObject entryRuleCroissanceAbonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCroissanceAbonne = null;


        try {
            // InternalTw.g:1696:57: (iv_ruleCroissanceAbonne= ruleCroissanceAbonne EOF )
            // InternalTw.g:1697:2: iv_ruleCroissanceAbonne= ruleCroissanceAbonne EOF
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
    // InternalTw.g:1703:1: ruleCroissanceAbonne returns [EObject current=null] : ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleCroissanceAbonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1709:2: ( ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1710:2: ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1710:2: ( () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1711:3: () otherlv_1= 'CroissanceAbonne' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1711:3: ()
            // InternalTw.g:1712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1726:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||LA27_0==20||(LA27_0>=22 && LA27_0<=36)||(LA27_0>=38 && LA27_0<=39)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTw.g:1727:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1727:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1728:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1728:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1729:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCroissanceAbonneRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1746:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTw.g:1747:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1751:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1752:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1752:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1753:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1780:1: entryRulemoyFollowers returns [EObject current=null] : iv_rulemoyFollowers= rulemoyFollowers EOF ;
    public final EObject entryRulemoyFollowers() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoyFollowers = null;


        try {
            // InternalTw.g:1780:53: (iv_rulemoyFollowers= rulemoyFollowers EOF )
            // InternalTw.g:1781:2: iv_rulemoyFollowers= rulemoyFollowers EOF
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
    // InternalTw.g:1787:1: rulemoyFollowers returns [EObject current=null] : ( () otherlv_1= 'moyFollowers' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulemoyFollowers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1793:2: ( ( () otherlv_1= 'moyFollowers' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1794:2: ( () otherlv_1= 'moyFollowers' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1794:2: ( () otherlv_1= 'moyFollowers' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1795:3: () otherlv_1= 'moyFollowers' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1795:3: ()
            // InternalTw.g:1796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoyFollowersAccess().getMoyFollowersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1810:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==20||(LA29_0>=22 && LA29_0<=36)||(LA29_0>=38 && LA29_0<=39)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTw.g:1811:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1811:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1812:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1812:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1813:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoyFollowersRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1830:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==21) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalTw.g:1831:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMoyFollowersAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1835:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1836:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1836:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1837:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTw.g:1864:1: entryRulemoyFavorited returns [EObject current=null] : iv_rulemoyFavorited= rulemoyFavorited EOF ;
    public final EObject entryRulemoyFavorited() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoyFavorited = null;


        try {
            // InternalTw.g:1864:53: (iv_rulemoyFavorited= rulemoyFavorited EOF )
            // InternalTw.g:1865:2: iv_rulemoyFavorited= rulemoyFavorited EOF
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
    // InternalTw.g:1871:1: rulemoyFavorited returns [EObject current=null] : ( () otherlv_1= 'moyFavorited' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulemoyFavorited() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1877:2: ( ( () otherlv_1= 'moyFavorited' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' ) )
            // InternalTw.g:1878:2: ( () otherlv_1= 'moyFavorited' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            {
            // InternalTw.g:1878:2: ( () otherlv_1= 'moyFavorited' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}' )
            // InternalTw.g:1879:3: () otherlv_1= 'moyFavorited' otherlv_2= '{' ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )? otherlv_6= '}'
            {
            // InternalTw.g:1879:3: ()
            // InternalTw.g:1880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoyFavoritedAccess().getMoyFavoritedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTw.g:1894:3: ( ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==20||(LA31_0>=22 && LA31_0<=36)||(LA31_0>=38 && LA31_0<=39)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTw.g:1895:4: ( (lv_args_3_0= ruleArgs ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    {
                    // InternalTw.g:1895:4: ( (lv_args_3_0= ruleArgs ) )
                    // InternalTw.g:1896:5: (lv_args_3_0= ruleArgs )
                    {
                    // InternalTw.g:1896:5: (lv_args_3_0= ruleArgs )
                    // InternalTw.g:1897:6: lv_args_3_0= ruleArgs
                    {

                    						newCompositeNode(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_3_0=ruleArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoyFavoritedRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"esir3.im.Tw.Args");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTw.g:1914:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalTw.g:1915:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgs ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMoyFavoritedAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTw.g:1919:5: ( (lv_args_5_0= ruleArgs ) )
                    	    // InternalTw.g:1920:6: (lv_args_5_0= ruleArgs )
                    	    {
                    	    // InternalTw.g:1920:6: (lv_args_5_0= ruleArgs )
                    	    // InternalTw.g:1921:7: lv_args_5_0= ruleArgs
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleGREATER"
    // InternalTw.g:1948:1: entryRuleGREATER returns [EObject current=null] : iv_ruleGREATER= ruleGREATER EOF ;
    public final EObject entryRuleGREATER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGREATER = null;


        try {
            // InternalTw.g:1948:48: (iv_ruleGREATER= ruleGREATER EOF )
            // InternalTw.g:1949:2: iv_ruleGREATER= ruleGREATER EOF
            {
             newCompositeNode(grammarAccess.getGREATERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGREATER=ruleGREATER();

            state._fsp--;

             current =iv_ruleGREATER; 
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
    // $ANTLR end "entryRuleGREATER"


    // $ANTLR start "ruleGREATER"
    // InternalTw.g:1955:1: ruleGREATER returns [EObject current=null] : (otherlv_0= 'GREATER' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleGREATER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:1961:2: ( (otherlv_0= 'GREATER' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:1962:2: (otherlv_0= 'GREATER' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:1962:2: (otherlv_0= 'GREATER' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:1963:3: otherlv_0= 'GREATER' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGREATERAccess().getGREATERKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGREATERAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:1971:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:1972:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:1972:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:1973:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGREATERAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGREATERRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGREATERAccess().getCommaKeyword_3());
            		
            // InternalTw.g:1994:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:1995:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:1995:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:1996:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGREATERAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGREATERRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGREATERAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleGREATER"


    // $ANTLR start "entryRuleLESS"
    // InternalTw.g:2021:1: entryRuleLESS returns [EObject current=null] : iv_ruleLESS= ruleLESS EOF ;
    public final EObject entryRuleLESS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLESS = null;


        try {
            // InternalTw.g:2021:45: (iv_ruleLESS= ruleLESS EOF )
            // InternalTw.g:2022:2: iv_ruleLESS= ruleLESS EOF
            {
             newCompositeNode(grammarAccess.getLESSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLESS=ruleLESS();

            state._fsp--;

             current =iv_ruleLESS; 
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
    // $ANTLR end "entryRuleLESS"


    // $ANTLR start "ruleLESS"
    // InternalTw.g:2028:1: ruleLESS returns [EObject current=null] : (otherlv_0= 'LESS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleLESS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2034:2: ( (otherlv_0= 'LESS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:2035:2: (otherlv_0= 'LESS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:2035:2: (otherlv_0= 'LESS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:2036:3: otherlv_0= 'LESS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLESSAccess().getLESSKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLESSAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:2044:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:2045:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:2045:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:2046:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLESSAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLESSRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLESSAccess().getCommaKeyword_3());
            		
            // InternalTw.g:2067:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:2068:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:2068:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:2069:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLESSAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLESSRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLESSAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleLESS"


    // $ANTLR start "entryRuleEQUALS"
    // InternalTw.g:2094:1: entryRuleEQUALS returns [EObject current=null] : iv_ruleEQUALS= ruleEQUALS EOF ;
    public final EObject entryRuleEQUALS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQUALS = null;


        try {
            // InternalTw.g:2094:47: (iv_ruleEQUALS= ruleEQUALS EOF )
            // InternalTw.g:2095:2: iv_ruleEQUALS= ruleEQUALS EOF
            {
             newCompositeNode(grammarAccess.getEQUALSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEQUALS=ruleEQUALS();

            state._fsp--;

             current =iv_ruleEQUALS; 
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
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // InternalTw.g:2101:1: ruleEQUALS returns [EObject current=null] : (otherlv_0= 'EQUALS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleEQUALS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2107:2: ( (otherlv_0= 'EQUALS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:2108:2: (otherlv_0= 'EQUALS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:2108:2: (otherlv_0= 'EQUALS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:2109:3: otherlv_0= 'EQUALS' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEQUALSAccess().getEQUALSKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEQUALSAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:2117:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:2118:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:2118:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:2119:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEQUALSAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEQUALSRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEQUALSAccess().getCommaKeyword_3());
            		
            // InternalTw.g:2140:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:2141:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:2141:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:2142:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEQUALSAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEQUALSRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEQUALSAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEQUALS"


    // $ANTLR start "entryRuleUtilisationVar"
    // InternalTw.g:2167:1: entryRuleUtilisationVar returns [EObject current=null] : iv_ruleUtilisationVar= ruleUtilisationVar EOF ;
    public final EObject entryRuleUtilisationVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtilisationVar = null;


        try {
            // InternalTw.g:2167:55: (iv_ruleUtilisationVar= ruleUtilisationVar EOF )
            // InternalTw.g:2168:2: iv_ruleUtilisationVar= ruleUtilisationVar EOF
            {
             newCompositeNode(grammarAccess.getUtilisationVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUtilisationVar=ruleUtilisationVar();

            state._fsp--;

             current =iv_ruleUtilisationVar; 
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
    // $ANTLR end "entryRuleUtilisationVar"


    // $ANTLR start "ruleUtilisationVar"
    // InternalTw.g:2174:1: ruleUtilisationVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUtilisationVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTw.g:2180:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTw.g:2181:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTw.g:2181:2: ( (otherlv_0= RULE_ID ) )
            // InternalTw.g:2182:3: (otherlv_0= RULE_ID )
            {
            // InternalTw.g:2182:3: (otherlv_0= RULE_ID )
            // InternalTw.g:2183:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUtilisationVarRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleUtilisationVar"


    // $ANTLR start "entryRuleprint"
    // InternalTw.g:2197:1: entryRuleprint returns [EObject current=null] : iv_ruleprint= ruleprint EOF ;
    public final EObject entryRuleprint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprint = null;


        try {
            // InternalTw.g:2197:46: (iv_ruleprint= ruleprint EOF )
            // InternalTw.g:2198:2: iv_ruleprint= ruleprint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprint=ruleprint();

            state._fsp--;

             current =iv_ruleprint; 
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
    // $ANTLR end "entryRuleprint"


    // $ANTLR start "ruleprint"
    // InternalTw.g:2204:1: ruleprint returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleprint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2210:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalTw.g:2211:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalTw.g:2211:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalTw.g:2212:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:2220:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalTw.g:2221:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalTw.g:2221:4: (lv_expression_2_0= ruleExpression )
            // InternalTw.g:2222:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleprint"


    // $ANTLR start "entryRuleStringTw"
    // InternalTw.g:2247:1: entryRuleStringTw returns [EObject current=null] : iv_ruleStringTw= ruleStringTw EOF ;
    public final EObject entryRuleStringTw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTw = null;


        try {
            // InternalTw.g:2247:49: (iv_ruleStringTw= ruleStringTw EOF )
            // InternalTw.g:2248:2: iv_ruleStringTw= ruleStringTw EOF
            {
             newCompositeNode(grammarAccess.getStringTwRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringTw=ruleStringTw();

            state._fsp--;

             current =iv_ruleStringTw; 
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
    // $ANTLR end "entryRuleStringTw"


    // $ANTLR start "ruleStringTw"
    // InternalTw.g:2254:1: ruleStringTw returns [EObject current=null] : ( (lv_stringTw_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringTw() throws RecognitionException {
        EObject current = null;

        Token lv_stringTw_0_0=null;


        	enterRule();

        try {
            // InternalTw.g:2260:2: ( ( (lv_stringTw_0_0= RULE_STRING ) ) )
            // InternalTw.g:2261:2: ( (lv_stringTw_0_0= RULE_STRING ) )
            {
            // InternalTw.g:2261:2: ( (lv_stringTw_0_0= RULE_STRING ) )
            // InternalTw.g:2262:3: (lv_stringTw_0_0= RULE_STRING )
            {
            // InternalTw.g:2262:3: (lv_stringTw_0_0= RULE_STRING )
            // InternalTw.g:2263:4: lv_stringTw_0_0= RULE_STRING
            {
            lv_stringTw_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_stringTw_0_0, grammarAccess.getStringTwAccess().getStringTwSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringTwRule());
            				}
            				setWithLastConsumed(
            					current,
            					"stringTw",
            					lv_stringTw_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleStringTw"


    // $ANTLR start "entryRuleADD"
    // InternalTw.g:2282:1: entryRuleADD returns [EObject current=null] : iv_ruleADD= ruleADD EOF ;
    public final EObject entryRuleADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD = null;


        try {
            // InternalTw.g:2282:44: (iv_ruleADD= ruleADD EOF )
            // InternalTw.g:2283:2: iv_ruleADD= ruleADD EOF
            {
             newCompositeNode(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADD=ruleADD();

            state._fsp--;

             current =iv_ruleADD; 
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
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalTw.g:2289:1: ruleADD returns [EObject current=null] : (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleADD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2295:2: ( (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:2296:2: (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:2296:2: (otherlv_0= 'ADD' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:2297:3: otherlv_0= 'ADD' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getADDAccess().getADDKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getADDAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:2305:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:2306:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:2306:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:2307:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getADDAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADDRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getADDAccess().getCommaKeyword_3());
            		
            // InternalTw.g:2328:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:2329:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:2329:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:2330:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getADDAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getADDRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getADDAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleMUL"
    // InternalTw.g:2355:1: entryRuleMUL returns [EObject current=null] : iv_ruleMUL= ruleMUL EOF ;
    public final EObject entryRuleMUL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMUL = null;


        try {
            // InternalTw.g:2355:44: (iv_ruleMUL= ruleMUL EOF )
            // InternalTw.g:2356:2: iv_ruleMUL= ruleMUL EOF
            {
             newCompositeNode(grammarAccess.getMULRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMUL=ruleMUL();

            state._fsp--;

             current =iv_ruleMUL; 
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
    // $ANTLR end "entryRuleMUL"


    // $ANTLR start "ruleMUL"
    // InternalTw.g:2362:1: ruleMUL returns [EObject current=null] : (otherlv_0= 'MUL' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMUL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp1_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2368:2: ( (otherlv_0= 'MUL' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalTw.g:2369:2: (otherlv_0= 'MUL' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalTw.g:2369:2: (otherlv_0= 'MUL' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalTw.g:2370:3: otherlv_0= 'MUL' otherlv_1= '(' ( (lv_exp1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_exp2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMULAccess().getMULKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMULAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTw.g:2378:3: ( (lv_exp1_2_0= ruleExpression ) )
            // InternalTw.g:2379:4: (lv_exp1_2_0= ruleExpression )
            {
            // InternalTw.g:2379:4: (lv_exp1_2_0= ruleExpression )
            // InternalTw.g:2380:5: lv_exp1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMULAccess().getExp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMULRule());
            					}
            					set(
            						current,
            						"exp1",
            						lv_exp1_2_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMULAccess().getCommaKeyword_3());
            		
            // InternalTw.g:2401:3: ( (lv_exp2_4_0= ruleExpression ) )
            // InternalTw.g:2402:4: (lv_exp2_4_0= ruleExpression )
            {
            // InternalTw.g:2402:4: (lv_exp2_4_0= ruleExpression )
            // InternalTw.g:2403:5: lv_exp2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMULAccess().getExp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMULRule());
            					}
            					set(
            						current,
            						"exp2",
            						lv_exp2_4_0,
            						"esir3.im.Tw.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMULAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMUL"


    // $ANTLR start "entryRuleArgs"
    // InternalTw.g:2428:1: entryRuleArgs returns [EObject current=null] : iv_ruleArgs= ruleArgs EOF ;
    public final EObject entryRuleArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgs = null;


        try {
            // InternalTw.g:2428:45: (iv_ruleArgs= ruleArgs EOF )
            // InternalTw.g:2429:2: iv_ruleArgs= ruleArgs EOF
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
    // InternalTw.g:2435:1: ruleArgs returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleArgs() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalTw.g:2441:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalTw.g:2442:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalTw.g:2442:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalTw.g:2443:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalTw.g:2443:3: (lv_expression_0_0= ruleExpression )
            // InternalTw.g:2444:4: lv_expression_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getArgsAccess().getExpressionExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArgsRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"esir3.im.Tw.Expression");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // InternalTw.g:2464:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalTw.g:2464:47: (iv_ruleString0= ruleString0 EOF )
            // InternalTw.g:2465:2: iv_ruleString0= ruleString0 EOF
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
    // InternalTw.g:2471:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTw.g:2477:2: (this_ID_0= RULE_ID )
            // InternalTw.g:2478:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getString0Access().getIDTerminalRuleCall());
            	

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\3\uffff\1\31\26\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\15\26\uffff";
    static final String dfa_4s = "\1\47\2\uffff\1\23\26\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\30\1\24";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\26\6\uffff\1\1\2\uffff\1\2\3\uffff\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30",
            "",
            "",
            "\2\31\4\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "162:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_DeclarationVar_2= ruleDeclarationVar | this_AND_3= ruleAND | this_OR_4= ruleOR | this_tweets_user_5= ruletweets_user | this_tweets_location_6= ruletweets_location | this_tweets_entity_7= ruletweets_entity | this_tweets_date_8= ruletweets_date | this_ProportionPositif_9= ruleProportionPositif | this_ProportionNegatif_10= ruleProportionNegatif | this_countTweet_11= rulecountTweet | this_countVisitProfil_12= rulecountVisitProfil | this_CroissanceAbonne_13= ruleCroissanceAbonne | this_moyFollowers_14= rulemoyFollowers | this_moyFavorited_15= rulemoyFavorited | this_GREATER_16= ruleGREATER | this_LESS_17= ruleLESS | this_EQUALS_18= ruleEQUALS | this_UtilisationVar_19= ruleUtilisationVar | this_print_20= ruleprint | this_StringTw_21= ruleStringTw | this_ADD_22= ruleADD | this_MUL_23= ruleMUL )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000FFFFD8D030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000FFFFD89030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001C00500000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000204000L});

}