package esir3.im.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import esir3.im.services.TwGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTwParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'}'", "';'", "'If'", "'('", "')'", "'else'", "':='", "'AND'", "','", "'OR'", "'tweets_user'", "'tweets_location'", "'tweets_entity'", "'tweets_date'", "'ProportionPositif'", "'ProportionNegatif'", "'countTweet'", "'countVisitProfil'", "'CroissanceAbonne'", "'moyFollowers'", "'moyFavorited'", "'GREATER'", "'LESS'", "'EQUALS'", "'print'", "'ADD'", "'MUL'"
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

    	public void setGrammarAccess(TwGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalTw.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalTw.g:54:1: ( ruleProgram EOF )
            // InternalTw.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalTw.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalTw.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalTw.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalTw.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalTw.g:69:3: ( rule__Program__Group__0 )
            // InternalTw.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTw.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTw.g:79:1: ( ruleStatement EOF )
            // InternalTw.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTw.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalTw.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalTw.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalTw.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalTw.g:94:3: ( rule__Statement__Alternatives )
            // InternalTw.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleOpBool"
    // InternalTw.g:103:1: entryRuleOpBool : ruleOpBool EOF ;
    public final void entryRuleOpBool() throws RecognitionException {
        try {
            // InternalTw.g:104:1: ( ruleOpBool EOF )
            // InternalTw.g:105:1: ruleOpBool EOF
            {
             before(grammarAccess.getOpBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getOpBoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpBool"


    // $ANTLR start "ruleOpBool"
    // InternalTw.g:112:1: ruleOpBool : ( ( rule__OpBool__Alternatives ) ) ;
    public final void ruleOpBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:116:2: ( ( ( rule__OpBool__Alternatives ) ) )
            // InternalTw.g:117:2: ( ( rule__OpBool__Alternatives ) )
            {
            // InternalTw.g:117:2: ( ( rule__OpBool__Alternatives ) )
            // InternalTw.g:118:3: ( rule__OpBool__Alternatives )
            {
             before(grammarAccess.getOpBoolAccess().getAlternatives()); 
            // InternalTw.g:119:3: ( rule__OpBool__Alternatives )
            // InternalTw.g:119:4: rule__OpBool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpBool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpBool"


    // $ANTLR start "entryRuleExpression"
    // InternalTw.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTw.g:129:1: ( ruleExpression EOF )
            // InternalTw.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTw.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalTw.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalTw.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalTw.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalTw.g:144:3: ( rule__Expression__Alternatives )
            // InternalTw.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBlock"
    // InternalTw.g:153:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalTw.g:154:1: ( ruleBlock EOF )
            // InternalTw.g:155:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTw.g:162:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:166:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalTw.g:167:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalTw.g:167:2: ( ( rule__Block__Group__0 ) )
            // InternalTw.g:168:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalTw.g:169:3: ( rule__Block__Group__0 )
            // InternalTw.g:169:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIf"
    // InternalTw.g:178:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalTw.g:179:1: ( ruleIf EOF )
            // InternalTw.g:180:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalTw.g:187:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:191:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalTw.g:192:2: ( ( rule__If__Group__0 ) )
            {
            // InternalTw.g:192:2: ( ( rule__If__Group__0 ) )
            // InternalTw.g:193:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalTw.g:194:3: ( rule__If__Group__0 )
            // InternalTw.g:194:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleDeclarationVar"
    // InternalTw.g:203:1: entryRuleDeclarationVar : ruleDeclarationVar EOF ;
    public final void entryRuleDeclarationVar() throws RecognitionException {
        try {
            // InternalTw.g:204:1: ( ruleDeclarationVar EOF )
            // InternalTw.g:205:1: ruleDeclarationVar EOF
            {
             before(grammarAccess.getDeclarationVarRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclarationVar();

            state._fsp--;

             after(grammarAccess.getDeclarationVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclarationVar"


    // $ANTLR start "ruleDeclarationVar"
    // InternalTw.g:212:1: ruleDeclarationVar : ( ( rule__DeclarationVar__Group__0 ) ) ;
    public final void ruleDeclarationVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:216:2: ( ( ( rule__DeclarationVar__Group__0 ) ) )
            // InternalTw.g:217:2: ( ( rule__DeclarationVar__Group__0 ) )
            {
            // InternalTw.g:217:2: ( ( rule__DeclarationVar__Group__0 ) )
            // InternalTw.g:218:3: ( rule__DeclarationVar__Group__0 )
            {
             before(grammarAccess.getDeclarationVarAccess().getGroup()); 
            // InternalTw.g:219:3: ( rule__DeclarationVar__Group__0 )
            // InternalTw.g:219:4: rule__DeclarationVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarationVar"


    // $ANTLR start "entryRuleAND"
    // InternalTw.g:228:1: entryRuleAND : ruleAND EOF ;
    public final void entryRuleAND() throws RecognitionException {
        try {
            // InternalTw.g:229:1: ( ruleAND EOF )
            // InternalTw.g:230:1: ruleAND EOF
            {
             before(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_1);
            ruleAND();

            state._fsp--;

             after(grammarAccess.getANDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // InternalTw.g:237:1: ruleAND : ( ( rule__AND__Group__0 ) ) ;
    public final void ruleAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:241:2: ( ( ( rule__AND__Group__0 ) ) )
            // InternalTw.g:242:2: ( ( rule__AND__Group__0 ) )
            {
            // InternalTw.g:242:2: ( ( rule__AND__Group__0 ) )
            // InternalTw.g:243:3: ( rule__AND__Group__0 )
            {
             before(grammarAccess.getANDAccess().getGroup()); 
            // InternalTw.g:244:3: ( rule__AND__Group__0 )
            // InternalTw.g:244:4: rule__AND__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AND__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleOR"
    // InternalTw.g:253:1: entryRuleOR : ruleOR EOF ;
    public final void entryRuleOR() throws RecognitionException {
        try {
            // InternalTw.g:254:1: ( ruleOR EOF )
            // InternalTw.g:255:1: ruleOR EOF
            {
             before(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_1);
            ruleOR();

            state._fsp--;

             after(grammarAccess.getORRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // InternalTw.g:262:1: ruleOR : ( ( rule__OR__Group__0 ) ) ;
    public final void ruleOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:266:2: ( ( ( rule__OR__Group__0 ) ) )
            // InternalTw.g:267:2: ( ( rule__OR__Group__0 ) )
            {
            // InternalTw.g:267:2: ( ( rule__OR__Group__0 ) )
            // InternalTw.g:268:3: ( rule__OR__Group__0 )
            {
             before(grammarAccess.getORAccess().getGroup()); 
            // InternalTw.g:269:3: ( rule__OR__Group__0 )
            // InternalTw.g:269:4: rule__OR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOR"


    // $ANTLR start "entryRuletweets_user"
    // InternalTw.g:278:1: entryRuletweets_user : ruletweets_user EOF ;
    public final void entryRuletweets_user() throws RecognitionException {
        try {
            // InternalTw.g:279:1: ( ruletweets_user EOF )
            // InternalTw.g:280:1: ruletweets_user EOF
            {
             before(grammarAccess.getTweets_userRule()); 
            pushFollow(FOLLOW_1);
            ruletweets_user();

            state._fsp--;

             after(grammarAccess.getTweets_userRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletweets_user"


    // $ANTLR start "ruletweets_user"
    // InternalTw.g:287:1: ruletweets_user : ( ( rule__Tweets_user__Group__0 ) ) ;
    public final void ruletweets_user() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:291:2: ( ( ( rule__Tweets_user__Group__0 ) ) )
            // InternalTw.g:292:2: ( ( rule__Tweets_user__Group__0 ) )
            {
            // InternalTw.g:292:2: ( ( rule__Tweets_user__Group__0 ) )
            // InternalTw.g:293:3: ( rule__Tweets_user__Group__0 )
            {
             before(grammarAccess.getTweets_userAccess().getGroup()); 
            // InternalTw.g:294:3: ( rule__Tweets_user__Group__0 )
            // InternalTw.g:294:4: rule__Tweets_user__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletweets_user"


    // $ANTLR start "entryRuletweets_location"
    // InternalTw.g:303:1: entryRuletweets_location : ruletweets_location EOF ;
    public final void entryRuletweets_location() throws RecognitionException {
        try {
            // InternalTw.g:304:1: ( ruletweets_location EOF )
            // InternalTw.g:305:1: ruletweets_location EOF
            {
             before(grammarAccess.getTweets_locationRule()); 
            pushFollow(FOLLOW_1);
            ruletweets_location();

            state._fsp--;

             after(grammarAccess.getTweets_locationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletweets_location"


    // $ANTLR start "ruletweets_location"
    // InternalTw.g:312:1: ruletweets_location : ( ( rule__Tweets_location__Group__0 ) ) ;
    public final void ruletweets_location() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:316:2: ( ( ( rule__Tweets_location__Group__0 ) ) )
            // InternalTw.g:317:2: ( ( rule__Tweets_location__Group__0 ) )
            {
            // InternalTw.g:317:2: ( ( rule__Tweets_location__Group__0 ) )
            // InternalTw.g:318:3: ( rule__Tweets_location__Group__0 )
            {
             before(grammarAccess.getTweets_locationAccess().getGroup()); 
            // InternalTw.g:319:3: ( rule__Tweets_location__Group__0 )
            // InternalTw.g:319:4: rule__Tweets_location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletweets_location"


    // $ANTLR start "entryRuletweets_entity"
    // InternalTw.g:328:1: entryRuletweets_entity : ruletweets_entity EOF ;
    public final void entryRuletweets_entity() throws RecognitionException {
        try {
            // InternalTw.g:329:1: ( ruletweets_entity EOF )
            // InternalTw.g:330:1: ruletweets_entity EOF
            {
             before(grammarAccess.getTweets_entityRule()); 
            pushFollow(FOLLOW_1);
            ruletweets_entity();

            state._fsp--;

             after(grammarAccess.getTweets_entityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletweets_entity"


    // $ANTLR start "ruletweets_entity"
    // InternalTw.g:337:1: ruletweets_entity : ( ( rule__Tweets_entity__Group__0 ) ) ;
    public final void ruletweets_entity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:341:2: ( ( ( rule__Tweets_entity__Group__0 ) ) )
            // InternalTw.g:342:2: ( ( rule__Tweets_entity__Group__0 ) )
            {
            // InternalTw.g:342:2: ( ( rule__Tweets_entity__Group__0 ) )
            // InternalTw.g:343:3: ( rule__Tweets_entity__Group__0 )
            {
             before(grammarAccess.getTweets_entityAccess().getGroup()); 
            // InternalTw.g:344:3: ( rule__Tweets_entity__Group__0 )
            // InternalTw.g:344:4: rule__Tweets_entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletweets_entity"


    // $ANTLR start "entryRuletweets_date"
    // InternalTw.g:353:1: entryRuletweets_date : ruletweets_date EOF ;
    public final void entryRuletweets_date() throws RecognitionException {
        try {
            // InternalTw.g:354:1: ( ruletweets_date EOF )
            // InternalTw.g:355:1: ruletweets_date EOF
            {
             before(grammarAccess.getTweets_dateRule()); 
            pushFollow(FOLLOW_1);
            ruletweets_date();

            state._fsp--;

             after(grammarAccess.getTweets_dateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletweets_date"


    // $ANTLR start "ruletweets_date"
    // InternalTw.g:362:1: ruletweets_date : ( ( rule__Tweets_date__Group__0 ) ) ;
    public final void ruletweets_date() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:366:2: ( ( ( rule__Tweets_date__Group__0 ) ) )
            // InternalTw.g:367:2: ( ( rule__Tweets_date__Group__0 ) )
            {
            // InternalTw.g:367:2: ( ( rule__Tweets_date__Group__0 ) )
            // InternalTw.g:368:3: ( rule__Tweets_date__Group__0 )
            {
             before(grammarAccess.getTweets_dateAccess().getGroup()); 
            // InternalTw.g:369:3: ( rule__Tweets_date__Group__0 )
            // InternalTw.g:369:4: rule__Tweets_date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletweets_date"


    // $ANTLR start "entryRuleProportionPositif"
    // InternalTw.g:378:1: entryRuleProportionPositif : ruleProportionPositif EOF ;
    public final void entryRuleProportionPositif() throws RecognitionException {
        try {
            // InternalTw.g:379:1: ( ruleProportionPositif EOF )
            // InternalTw.g:380:1: ruleProportionPositif EOF
            {
             before(grammarAccess.getProportionPositifRule()); 
            pushFollow(FOLLOW_1);
            ruleProportionPositif();

            state._fsp--;

             after(grammarAccess.getProportionPositifRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProportionPositif"


    // $ANTLR start "ruleProportionPositif"
    // InternalTw.g:387:1: ruleProportionPositif : ( ( rule__ProportionPositif__Group__0 ) ) ;
    public final void ruleProportionPositif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:391:2: ( ( ( rule__ProportionPositif__Group__0 ) ) )
            // InternalTw.g:392:2: ( ( rule__ProportionPositif__Group__0 ) )
            {
            // InternalTw.g:392:2: ( ( rule__ProportionPositif__Group__0 ) )
            // InternalTw.g:393:3: ( rule__ProportionPositif__Group__0 )
            {
             before(grammarAccess.getProportionPositifAccess().getGroup()); 
            // InternalTw.g:394:3: ( rule__ProportionPositif__Group__0 )
            // InternalTw.g:394:4: rule__ProportionPositif__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProportionPositif"


    // $ANTLR start "entryRuleProportionNegatif"
    // InternalTw.g:403:1: entryRuleProportionNegatif : ruleProportionNegatif EOF ;
    public final void entryRuleProportionNegatif() throws RecognitionException {
        try {
            // InternalTw.g:404:1: ( ruleProportionNegatif EOF )
            // InternalTw.g:405:1: ruleProportionNegatif EOF
            {
             before(grammarAccess.getProportionNegatifRule()); 
            pushFollow(FOLLOW_1);
            ruleProportionNegatif();

            state._fsp--;

             after(grammarAccess.getProportionNegatifRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProportionNegatif"


    // $ANTLR start "ruleProportionNegatif"
    // InternalTw.g:412:1: ruleProportionNegatif : ( ( rule__ProportionNegatif__Group__0 ) ) ;
    public final void ruleProportionNegatif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:416:2: ( ( ( rule__ProportionNegatif__Group__0 ) ) )
            // InternalTw.g:417:2: ( ( rule__ProportionNegatif__Group__0 ) )
            {
            // InternalTw.g:417:2: ( ( rule__ProportionNegatif__Group__0 ) )
            // InternalTw.g:418:3: ( rule__ProportionNegatif__Group__0 )
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup()); 
            // InternalTw.g:419:3: ( rule__ProportionNegatif__Group__0 )
            // InternalTw.g:419:4: rule__ProportionNegatif__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProportionNegatif"


    // $ANTLR start "entryRulecountTweet"
    // InternalTw.g:428:1: entryRulecountTweet : rulecountTweet EOF ;
    public final void entryRulecountTweet() throws RecognitionException {
        try {
            // InternalTw.g:429:1: ( rulecountTweet EOF )
            // InternalTw.g:430:1: rulecountTweet EOF
            {
             before(grammarAccess.getCountTweetRule()); 
            pushFollow(FOLLOW_1);
            rulecountTweet();

            state._fsp--;

             after(grammarAccess.getCountTweetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecountTweet"


    // $ANTLR start "rulecountTweet"
    // InternalTw.g:437:1: rulecountTweet : ( ( rule__CountTweet__Group__0 ) ) ;
    public final void rulecountTweet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:441:2: ( ( ( rule__CountTweet__Group__0 ) ) )
            // InternalTw.g:442:2: ( ( rule__CountTweet__Group__0 ) )
            {
            // InternalTw.g:442:2: ( ( rule__CountTweet__Group__0 ) )
            // InternalTw.g:443:3: ( rule__CountTweet__Group__0 )
            {
             before(grammarAccess.getCountTweetAccess().getGroup()); 
            // InternalTw.g:444:3: ( rule__CountTweet__Group__0 )
            // InternalTw.g:444:4: rule__CountTweet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecountTweet"


    // $ANTLR start "entryRulecountVisitProfil"
    // InternalTw.g:453:1: entryRulecountVisitProfil : rulecountVisitProfil EOF ;
    public final void entryRulecountVisitProfil() throws RecognitionException {
        try {
            // InternalTw.g:454:1: ( rulecountVisitProfil EOF )
            // InternalTw.g:455:1: rulecountVisitProfil EOF
            {
             before(grammarAccess.getCountVisitProfilRule()); 
            pushFollow(FOLLOW_1);
            rulecountVisitProfil();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecountVisitProfil"


    // $ANTLR start "rulecountVisitProfil"
    // InternalTw.g:462:1: rulecountVisitProfil : ( ( rule__CountVisitProfil__Group__0 ) ) ;
    public final void rulecountVisitProfil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:466:2: ( ( ( rule__CountVisitProfil__Group__0 ) ) )
            // InternalTw.g:467:2: ( ( rule__CountVisitProfil__Group__0 ) )
            {
            // InternalTw.g:467:2: ( ( rule__CountVisitProfil__Group__0 ) )
            // InternalTw.g:468:3: ( rule__CountVisitProfil__Group__0 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup()); 
            // InternalTw.g:469:3: ( rule__CountVisitProfil__Group__0 )
            // InternalTw.g:469:4: rule__CountVisitProfil__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecountVisitProfil"


    // $ANTLR start "entryRuleCroissanceAbonne"
    // InternalTw.g:478:1: entryRuleCroissanceAbonne : ruleCroissanceAbonne EOF ;
    public final void entryRuleCroissanceAbonne() throws RecognitionException {
        try {
            // InternalTw.g:479:1: ( ruleCroissanceAbonne EOF )
            // InternalTw.g:480:1: ruleCroissanceAbonne EOF
            {
             before(grammarAccess.getCroissanceAbonneRule()); 
            pushFollow(FOLLOW_1);
            ruleCroissanceAbonne();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCroissanceAbonne"


    // $ANTLR start "ruleCroissanceAbonne"
    // InternalTw.g:487:1: ruleCroissanceAbonne : ( ( rule__CroissanceAbonne__Group__0 ) ) ;
    public final void ruleCroissanceAbonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:491:2: ( ( ( rule__CroissanceAbonne__Group__0 ) ) )
            // InternalTw.g:492:2: ( ( rule__CroissanceAbonne__Group__0 ) )
            {
            // InternalTw.g:492:2: ( ( rule__CroissanceAbonne__Group__0 ) )
            // InternalTw.g:493:3: ( rule__CroissanceAbonne__Group__0 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup()); 
            // InternalTw.g:494:3: ( rule__CroissanceAbonne__Group__0 )
            // InternalTw.g:494:4: rule__CroissanceAbonne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCroissanceAbonne"


    // $ANTLR start "entryRulemoyFollowers"
    // InternalTw.g:503:1: entryRulemoyFollowers : rulemoyFollowers EOF ;
    public final void entryRulemoyFollowers() throws RecognitionException {
        try {
            // InternalTw.g:504:1: ( rulemoyFollowers EOF )
            // InternalTw.g:505:1: rulemoyFollowers EOF
            {
             before(grammarAccess.getMoyFollowersRule()); 
            pushFollow(FOLLOW_1);
            rulemoyFollowers();

            state._fsp--;

             after(grammarAccess.getMoyFollowersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemoyFollowers"


    // $ANTLR start "rulemoyFollowers"
    // InternalTw.g:512:1: rulemoyFollowers : ( ( rule__MoyFollowers__Group__0 ) ) ;
    public final void rulemoyFollowers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:516:2: ( ( ( rule__MoyFollowers__Group__0 ) ) )
            // InternalTw.g:517:2: ( ( rule__MoyFollowers__Group__0 ) )
            {
            // InternalTw.g:517:2: ( ( rule__MoyFollowers__Group__0 ) )
            // InternalTw.g:518:3: ( rule__MoyFollowers__Group__0 )
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup()); 
            // InternalTw.g:519:3: ( rule__MoyFollowers__Group__0 )
            // InternalTw.g:519:4: rule__MoyFollowers__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemoyFollowers"


    // $ANTLR start "entryRulemoyFavorited"
    // InternalTw.g:528:1: entryRulemoyFavorited : rulemoyFavorited EOF ;
    public final void entryRulemoyFavorited() throws RecognitionException {
        try {
            // InternalTw.g:529:1: ( rulemoyFavorited EOF )
            // InternalTw.g:530:1: rulemoyFavorited EOF
            {
             before(grammarAccess.getMoyFavoritedRule()); 
            pushFollow(FOLLOW_1);
            rulemoyFavorited();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemoyFavorited"


    // $ANTLR start "rulemoyFavorited"
    // InternalTw.g:537:1: rulemoyFavorited : ( ( rule__MoyFavorited__Group__0 ) ) ;
    public final void rulemoyFavorited() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:541:2: ( ( ( rule__MoyFavorited__Group__0 ) ) )
            // InternalTw.g:542:2: ( ( rule__MoyFavorited__Group__0 ) )
            {
            // InternalTw.g:542:2: ( ( rule__MoyFavorited__Group__0 ) )
            // InternalTw.g:543:3: ( rule__MoyFavorited__Group__0 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup()); 
            // InternalTw.g:544:3: ( rule__MoyFavorited__Group__0 )
            // InternalTw.g:544:4: rule__MoyFavorited__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemoyFavorited"


    // $ANTLR start "entryRuleGREATER"
    // InternalTw.g:553:1: entryRuleGREATER : ruleGREATER EOF ;
    public final void entryRuleGREATER() throws RecognitionException {
        try {
            // InternalTw.g:554:1: ( ruleGREATER EOF )
            // InternalTw.g:555:1: ruleGREATER EOF
            {
             before(grammarAccess.getGREATERRule()); 
            pushFollow(FOLLOW_1);
            ruleGREATER();

            state._fsp--;

             after(grammarAccess.getGREATERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGREATER"


    // $ANTLR start "ruleGREATER"
    // InternalTw.g:562:1: ruleGREATER : ( ( rule__GREATER__Group__0 ) ) ;
    public final void ruleGREATER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:566:2: ( ( ( rule__GREATER__Group__0 ) ) )
            // InternalTw.g:567:2: ( ( rule__GREATER__Group__0 ) )
            {
            // InternalTw.g:567:2: ( ( rule__GREATER__Group__0 ) )
            // InternalTw.g:568:3: ( rule__GREATER__Group__0 )
            {
             before(grammarAccess.getGREATERAccess().getGroup()); 
            // InternalTw.g:569:3: ( rule__GREATER__Group__0 )
            // InternalTw.g:569:4: rule__GREATER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GREATER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGREATERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGREATER"


    // $ANTLR start "entryRuleLESS"
    // InternalTw.g:578:1: entryRuleLESS : ruleLESS EOF ;
    public final void entryRuleLESS() throws RecognitionException {
        try {
            // InternalTw.g:579:1: ( ruleLESS EOF )
            // InternalTw.g:580:1: ruleLESS EOF
            {
             before(grammarAccess.getLESSRule()); 
            pushFollow(FOLLOW_1);
            ruleLESS();

            state._fsp--;

             after(grammarAccess.getLESSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLESS"


    // $ANTLR start "ruleLESS"
    // InternalTw.g:587:1: ruleLESS : ( ( rule__LESS__Group__0 ) ) ;
    public final void ruleLESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:591:2: ( ( ( rule__LESS__Group__0 ) ) )
            // InternalTw.g:592:2: ( ( rule__LESS__Group__0 ) )
            {
            // InternalTw.g:592:2: ( ( rule__LESS__Group__0 ) )
            // InternalTw.g:593:3: ( rule__LESS__Group__0 )
            {
             before(grammarAccess.getLESSAccess().getGroup()); 
            // InternalTw.g:594:3: ( rule__LESS__Group__0 )
            // InternalTw.g:594:4: rule__LESS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LESS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLESSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLESS"


    // $ANTLR start "entryRuleEQUALS"
    // InternalTw.g:603:1: entryRuleEQUALS : ruleEQUALS EOF ;
    public final void entryRuleEQUALS() throws RecognitionException {
        try {
            // InternalTw.g:604:1: ( ruleEQUALS EOF )
            // InternalTw.g:605:1: ruleEQUALS EOF
            {
             before(grammarAccess.getEQUALSRule()); 
            pushFollow(FOLLOW_1);
            ruleEQUALS();

            state._fsp--;

             after(grammarAccess.getEQUALSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // InternalTw.g:612:1: ruleEQUALS : ( ( rule__EQUALS__Group__0 ) ) ;
    public final void ruleEQUALS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:616:2: ( ( ( rule__EQUALS__Group__0 ) ) )
            // InternalTw.g:617:2: ( ( rule__EQUALS__Group__0 ) )
            {
            // InternalTw.g:617:2: ( ( rule__EQUALS__Group__0 ) )
            // InternalTw.g:618:3: ( rule__EQUALS__Group__0 )
            {
             before(grammarAccess.getEQUALSAccess().getGroup()); 
            // InternalTw.g:619:3: ( rule__EQUALS__Group__0 )
            // InternalTw.g:619:4: rule__EQUALS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEQUALS"


    // $ANTLR start "entryRuleUtilisationVar"
    // InternalTw.g:628:1: entryRuleUtilisationVar : ruleUtilisationVar EOF ;
    public final void entryRuleUtilisationVar() throws RecognitionException {
        try {
            // InternalTw.g:629:1: ( ruleUtilisationVar EOF )
            // InternalTw.g:630:1: ruleUtilisationVar EOF
            {
             before(grammarAccess.getUtilisationVarRule()); 
            pushFollow(FOLLOW_1);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getUtilisationVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUtilisationVar"


    // $ANTLR start "ruleUtilisationVar"
    // InternalTw.g:637:1: ruleUtilisationVar : ( ( rule__UtilisationVar__NameVarAssignment ) ) ;
    public final void ruleUtilisationVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:641:2: ( ( ( rule__UtilisationVar__NameVarAssignment ) ) )
            // InternalTw.g:642:2: ( ( rule__UtilisationVar__NameVarAssignment ) )
            {
            // InternalTw.g:642:2: ( ( rule__UtilisationVar__NameVarAssignment ) )
            // InternalTw.g:643:3: ( rule__UtilisationVar__NameVarAssignment )
            {
             before(grammarAccess.getUtilisationVarAccess().getNameVarAssignment()); 
            // InternalTw.g:644:3: ( rule__UtilisationVar__NameVarAssignment )
            // InternalTw.g:644:4: rule__UtilisationVar__NameVarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UtilisationVar__NameVarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUtilisationVarAccess().getNameVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUtilisationVar"


    // $ANTLR start "entryRuleprint"
    // InternalTw.g:653:1: entryRuleprint : ruleprint EOF ;
    public final void entryRuleprint() throws RecognitionException {
        try {
            // InternalTw.g:654:1: ( ruleprint EOF )
            // InternalTw.g:655:1: ruleprint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            ruleprint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprint"


    // $ANTLR start "ruleprint"
    // InternalTw.g:662:1: ruleprint : ( ( rule__Print__Group__0 ) ) ;
    public final void ruleprint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:666:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalTw.g:667:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalTw.g:667:2: ( ( rule__Print__Group__0 ) )
            // InternalTw.g:668:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalTw.g:669:3: ( rule__Print__Group__0 )
            // InternalTw.g:669:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprint"


    // $ANTLR start "entryRuleStringTw"
    // InternalTw.g:678:1: entryRuleStringTw : ruleStringTw EOF ;
    public final void entryRuleStringTw() throws RecognitionException {
        try {
            // InternalTw.g:679:1: ( ruleStringTw EOF )
            // InternalTw.g:680:1: ruleStringTw EOF
            {
             before(grammarAccess.getStringTwRule()); 
            pushFollow(FOLLOW_1);
            ruleStringTw();

            state._fsp--;

             after(grammarAccess.getStringTwRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringTw"


    // $ANTLR start "ruleStringTw"
    // InternalTw.g:687:1: ruleStringTw : ( ( rule__StringTw__StringTwAssignment ) ) ;
    public final void ruleStringTw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:691:2: ( ( ( rule__StringTw__StringTwAssignment ) ) )
            // InternalTw.g:692:2: ( ( rule__StringTw__StringTwAssignment ) )
            {
            // InternalTw.g:692:2: ( ( rule__StringTw__StringTwAssignment ) )
            // InternalTw.g:693:3: ( rule__StringTw__StringTwAssignment )
            {
             before(grammarAccess.getStringTwAccess().getStringTwAssignment()); 
            // InternalTw.g:694:3: ( rule__StringTw__StringTwAssignment )
            // InternalTw.g:694:4: rule__StringTw__StringTwAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringTw__StringTwAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringTwAccess().getStringTwAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringTw"


    // $ANTLR start "entryRuleADD"
    // InternalTw.g:703:1: entryRuleADD : ruleADD EOF ;
    public final void entryRuleADD() throws RecognitionException {
        try {
            // InternalTw.g:704:1: ( ruleADD EOF )
            // InternalTw.g:705:1: ruleADD EOF
            {
             before(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            ruleADD();

            state._fsp--;

             after(grammarAccess.getADDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalTw.g:712:1: ruleADD : ( ( rule__ADD__Group__0 ) ) ;
    public final void ruleADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:716:2: ( ( ( rule__ADD__Group__0 ) ) )
            // InternalTw.g:717:2: ( ( rule__ADD__Group__0 ) )
            {
            // InternalTw.g:717:2: ( ( rule__ADD__Group__0 ) )
            // InternalTw.g:718:3: ( rule__ADD__Group__0 )
            {
             before(grammarAccess.getADDAccess().getGroup()); 
            // InternalTw.g:719:3: ( rule__ADD__Group__0 )
            // InternalTw.g:719:4: rule__ADD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleMUL"
    // InternalTw.g:728:1: entryRuleMUL : ruleMUL EOF ;
    public final void entryRuleMUL() throws RecognitionException {
        try {
            // InternalTw.g:729:1: ( ruleMUL EOF )
            // InternalTw.g:730:1: ruleMUL EOF
            {
             before(grammarAccess.getMULRule()); 
            pushFollow(FOLLOW_1);
            ruleMUL();

            state._fsp--;

             after(grammarAccess.getMULRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMUL"


    // $ANTLR start "ruleMUL"
    // InternalTw.g:737:1: ruleMUL : ( ( rule__MUL__Group__0 ) ) ;
    public final void ruleMUL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:741:2: ( ( ( rule__MUL__Group__0 ) ) )
            // InternalTw.g:742:2: ( ( rule__MUL__Group__0 ) )
            {
            // InternalTw.g:742:2: ( ( rule__MUL__Group__0 ) )
            // InternalTw.g:743:3: ( rule__MUL__Group__0 )
            {
             before(grammarAccess.getMULAccess().getGroup()); 
            // InternalTw.g:744:3: ( rule__MUL__Group__0 )
            // InternalTw.g:744:4: rule__MUL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MUL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMULAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMUL"


    // $ANTLR start "entryRuleArgs"
    // InternalTw.g:753:1: entryRuleArgs : ruleArgs EOF ;
    public final void entryRuleArgs() throws RecognitionException {
        try {
            // InternalTw.g:754:1: ( ruleArgs EOF )
            // InternalTw.g:755:1: ruleArgs EOF
            {
             before(grammarAccess.getArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getArgsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgs"


    // $ANTLR start "ruleArgs"
    // InternalTw.g:762:1: ruleArgs : ( ( rule__Args__ExpressionAssignment ) ) ;
    public final void ruleArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:766:2: ( ( ( rule__Args__ExpressionAssignment ) ) )
            // InternalTw.g:767:2: ( ( rule__Args__ExpressionAssignment ) )
            {
            // InternalTw.g:767:2: ( ( rule__Args__ExpressionAssignment ) )
            // InternalTw.g:768:3: ( rule__Args__ExpressionAssignment )
            {
             before(grammarAccess.getArgsAccess().getExpressionAssignment()); 
            // InternalTw.g:769:3: ( rule__Args__ExpressionAssignment )
            // InternalTw.g:769:4: rule__Args__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Args__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArgsAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgs"


    // $ANTLR start "entryRuleString0"
    // InternalTw.g:778:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalTw.g:779:1: ( ruleString0 EOF )
            // InternalTw.g:780:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalTw.g:787:1: ruleString0 : ( RULE_ID ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:791:2: ( ( RULE_ID ) )
            // InternalTw.g:792:2: ( RULE_ID )
            {
            // InternalTw.g:792:2: ( RULE_ID )
            // InternalTw.g:793:3: RULE_ID
            {
             before(grammarAccess.getString0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getString0Access().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTw.g:802:1: rule__Statement__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleDeclarationVar ) | ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleprint ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:806:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleDeclarationVar ) | ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleprint ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) )
            int alt1=24;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalTw.g:807:2: ( ruleBlock )
                    {
                    // InternalTw.g:807:2: ( ruleBlock )
                    // InternalTw.g:808:3: ruleBlock
                    {
                     before(grammarAccess.getStatementAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTw.g:813:2: ( ruleIf )
                    {
                    // InternalTw.g:813:2: ( ruleIf )
                    // InternalTw.g:814:3: ruleIf
                    {
                     before(grammarAccess.getStatementAccess().getIfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTw.g:819:2: ( ruleDeclarationVar )
                    {
                    // InternalTw.g:819:2: ( ruleDeclarationVar )
                    // InternalTw.g:820:3: ruleDeclarationVar
                    {
                     before(grammarAccess.getStatementAccess().getDeclarationVarParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclarationVar();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeclarationVarParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTw.g:825:2: ( ruleAND )
                    {
                    // InternalTw.g:825:2: ( ruleAND )
                    // InternalTw.g:826:3: ruleAND
                    {
                     before(grammarAccess.getStatementAccess().getANDParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAND();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getANDParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTw.g:831:2: ( ruleOR )
                    {
                    // InternalTw.g:831:2: ( ruleOR )
                    // InternalTw.g:832:3: ruleOR
                    {
                     before(grammarAccess.getStatementAccess().getORParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOR();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getORParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTw.g:837:2: ( ruletweets_user )
                    {
                    // InternalTw.g:837:2: ( ruletweets_user )
                    // InternalTw.g:838:3: ruletweets_user
                    {
                     before(grammarAccess.getStatementAccess().getTweets_userParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_user();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_userParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTw.g:843:2: ( ruletweets_location )
                    {
                    // InternalTw.g:843:2: ( ruletweets_location )
                    // InternalTw.g:844:3: ruletweets_location
                    {
                     before(grammarAccess.getStatementAccess().getTweets_locationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_location();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_locationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTw.g:849:2: ( ruletweets_entity )
                    {
                    // InternalTw.g:849:2: ( ruletweets_entity )
                    // InternalTw.g:850:3: ruletweets_entity
                    {
                     before(grammarAccess.getStatementAccess().getTweets_entityParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_entity();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_entityParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTw.g:855:2: ( ruletweets_date )
                    {
                    // InternalTw.g:855:2: ( ruletweets_date )
                    // InternalTw.g:856:3: ruletweets_date
                    {
                     before(grammarAccess.getStatementAccess().getTweets_dateParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_date();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_dateParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTw.g:861:2: ( ruleProportionPositif )
                    {
                    // InternalTw.g:861:2: ( ruleProportionPositif )
                    // InternalTw.g:862:3: ruleProportionPositif
                    {
                     before(grammarAccess.getStatementAccess().getProportionPositifParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionPositif();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getProportionPositifParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTw.g:867:2: ( ruleProportionNegatif )
                    {
                    // InternalTw.g:867:2: ( ruleProportionNegatif )
                    // InternalTw.g:868:3: ruleProportionNegatif
                    {
                     before(grammarAccess.getStatementAccess().getProportionNegatifParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionNegatif();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getProportionNegatifParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTw.g:873:2: ( rulecountTweet )
                    {
                    // InternalTw.g:873:2: ( rulecountTweet )
                    // InternalTw.g:874:3: rulecountTweet
                    {
                     before(grammarAccess.getStatementAccess().getCountTweetParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulecountTweet();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCountTweetParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTw.g:879:2: ( rulecountVisitProfil )
                    {
                    // InternalTw.g:879:2: ( rulecountVisitProfil )
                    // InternalTw.g:880:3: rulecountVisitProfil
                    {
                     before(grammarAccess.getStatementAccess().getCountVisitProfilParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulecountVisitProfil();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCountVisitProfilParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTw.g:885:2: ( ruleCroissanceAbonne )
                    {
                    // InternalTw.g:885:2: ( ruleCroissanceAbonne )
                    // InternalTw.g:886:3: ruleCroissanceAbonne
                    {
                     before(grammarAccess.getStatementAccess().getCroissanceAbonneParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleCroissanceAbonne();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCroissanceAbonneParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTw.g:891:2: ( rulemoyFollowers )
                    {
                    // InternalTw.g:891:2: ( rulemoyFollowers )
                    // InternalTw.g:892:3: rulemoyFollowers
                    {
                     before(grammarAccess.getStatementAccess().getMoyFollowersParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFollowers();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoyFollowersParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTw.g:897:2: ( rulemoyFavorited )
                    {
                    // InternalTw.g:897:2: ( rulemoyFavorited )
                    // InternalTw.g:898:3: rulemoyFavorited
                    {
                     before(grammarAccess.getStatementAccess().getMoyFavoritedParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFavorited();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoyFavoritedParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTw.g:903:2: ( ruleGREATER )
                    {
                    // InternalTw.g:903:2: ( ruleGREATER )
                    // InternalTw.g:904:3: ruleGREATER
                    {
                     before(grammarAccess.getStatementAccess().getGREATERParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleGREATER();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGREATERParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTw.g:909:2: ( ruleLESS )
                    {
                    // InternalTw.g:909:2: ( ruleLESS )
                    // InternalTw.g:910:3: ruleLESS
                    {
                     before(grammarAccess.getStatementAccess().getLESSParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleLESS();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLESSParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTw.g:915:2: ( ruleEQUALS )
                    {
                    // InternalTw.g:915:2: ( ruleEQUALS )
                    // InternalTw.g:916:3: ruleEQUALS
                    {
                     before(grammarAccess.getStatementAccess().getEQUALSParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleEQUALS();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEQUALSParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTw.g:921:2: ( ruleUtilisationVar )
                    {
                    // InternalTw.g:921:2: ( ruleUtilisationVar )
                    // InternalTw.g:922:3: ruleUtilisationVar
                    {
                     before(grammarAccess.getStatementAccess().getUtilisationVarParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleUtilisationVar();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUtilisationVarParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalTw.g:927:2: ( ruleprint )
                    {
                    // InternalTw.g:927:2: ( ruleprint )
                    // InternalTw.g:928:3: ruleprint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_20()); 
                    pushFollow(FOLLOW_2);
                    ruleprint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalTw.g:933:2: ( ruleStringTw )
                    {
                    // InternalTw.g:933:2: ( ruleStringTw )
                    // InternalTw.g:934:3: ruleStringTw
                    {
                     before(grammarAccess.getStatementAccess().getStringTwParserRuleCall_21()); 
                    pushFollow(FOLLOW_2);
                    ruleStringTw();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringTwParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalTw.g:939:2: ( ruleADD )
                    {
                    // InternalTw.g:939:2: ( ruleADD )
                    // InternalTw.g:940:3: ruleADD
                    {
                     before(grammarAccess.getStatementAccess().getADDParserRuleCall_22()); 
                    pushFollow(FOLLOW_2);
                    ruleADD();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getADDParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalTw.g:945:2: ( ruleMUL )
                    {
                    // InternalTw.g:945:2: ( ruleMUL )
                    // InternalTw.g:946:3: ruleMUL
                    {
                     before(grammarAccess.getStatementAccess().getMULParserRuleCall_23()); 
                    pushFollow(FOLLOW_2);
                    ruleMUL();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMULParserRuleCall_23()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__OpBool__Alternatives"
    // InternalTw.g:955:1: rule__OpBool__Alternatives : ( ( ruleAND ) | ( ruleOR ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) );
    public final void rule__OpBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:959:1: ( ( ruleAND ) | ( ruleOR ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTw.g:960:2: ( ruleAND )
                    {
                    // InternalTw.g:960:2: ( ruleAND )
                    // InternalTw.g:961:3: ruleAND
                    {
                     before(grammarAccess.getOpBoolAccess().getANDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAND();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getANDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTw.g:966:2: ( ruleOR )
                    {
                    // InternalTw.g:966:2: ( ruleOR )
                    // InternalTw.g:967:3: ruleOR
                    {
                     before(grammarAccess.getOpBoolAccess().getORParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOR();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getORParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTw.g:972:2: ( ruleGREATER )
                    {
                    // InternalTw.g:972:2: ( ruleGREATER )
                    // InternalTw.g:973:3: ruleGREATER
                    {
                     before(grammarAccess.getOpBoolAccess().getGREATERParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGREATER();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getGREATERParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTw.g:978:2: ( ruleLESS )
                    {
                    // InternalTw.g:978:2: ( ruleLESS )
                    // InternalTw.g:979:3: ruleLESS
                    {
                     before(grammarAccess.getOpBoolAccess().getLESSParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLESS();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getLESSParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTw.g:984:2: ( ruleEQUALS )
                    {
                    // InternalTw.g:984:2: ( ruleEQUALS )
                    // InternalTw.g:985:3: ruleEQUALS
                    {
                     before(grammarAccess.getOpBoolAccess().getEQUALSParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEQUALS();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getEQUALSParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBool__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalTw.g:994:1: rule__Expression__Alternatives : ( ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:998:1: ( ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) )
            int alt3=20;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 26:
                {
                alt3=6;
                }
                break;
            case 27:
                {
                alt3=7;
                }
                break;
            case 28:
                {
                alt3=8;
                }
                break;
            case 29:
                {
                alt3=9;
                }
                break;
            case 30:
                {
                alt3=10;
                }
                break;
            case 31:
                {
                alt3=11;
                }
                break;
            case 32:
                {
                alt3=12;
                }
                break;
            case 33:
                {
                alt3=13;
                }
                break;
            case 34:
                {
                alt3=14;
                }
                break;
            case 35:
                {
                alt3=15;
                }
                break;
            case 36:
                {
                alt3=16;
                }
                break;
            case RULE_ID:
                {
                alt3=17;
                }
                break;
            case RULE_STRING:
                {
                alt3=18;
                }
                break;
            case 38:
                {
                alt3=19;
                }
                break;
            case 39:
                {
                alt3=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTw.g:999:2: ( ruleAND )
                    {
                    // InternalTw.g:999:2: ( ruleAND )
                    // InternalTw.g:1000:3: ruleAND
                    {
                     before(grammarAccess.getExpressionAccess().getANDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAND();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getANDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTw.g:1005:2: ( ruleOR )
                    {
                    // InternalTw.g:1005:2: ( ruleOR )
                    // InternalTw.g:1006:3: ruleOR
                    {
                     before(grammarAccess.getExpressionAccess().getORParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOR();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getORParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTw.g:1011:2: ( ruletweets_user )
                    {
                    // InternalTw.g:1011:2: ( ruletweets_user )
                    // InternalTw.g:1012:3: ruletweets_user
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_userParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_user();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_userParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTw.g:1017:2: ( ruletweets_location )
                    {
                    // InternalTw.g:1017:2: ( ruletweets_location )
                    // InternalTw.g:1018:3: ruletweets_location
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_locationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_location();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_locationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTw.g:1023:2: ( ruletweets_entity )
                    {
                    // InternalTw.g:1023:2: ( ruletweets_entity )
                    // InternalTw.g:1024:3: ruletweets_entity
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_entityParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_entity();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_entityParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTw.g:1029:2: ( ruletweets_date )
                    {
                    // InternalTw.g:1029:2: ( ruletweets_date )
                    // InternalTw.g:1030:3: ruletweets_date
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_dateParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_date();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_dateParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTw.g:1035:2: ( ruleProportionPositif )
                    {
                    // InternalTw.g:1035:2: ( ruleProportionPositif )
                    // InternalTw.g:1036:3: ruleProportionPositif
                    {
                     before(grammarAccess.getExpressionAccess().getProportionPositifParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionPositif();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getProportionPositifParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTw.g:1041:2: ( ruleProportionNegatif )
                    {
                    // InternalTw.g:1041:2: ( ruleProportionNegatif )
                    // InternalTw.g:1042:3: ruleProportionNegatif
                    {
                     before(grammarAccess.getExpressionAccess().getProportionNegatifParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionNegatif();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getProportionNegatifParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTw.g:1047:2: ( rulecountTweet )
                    {
                    // InternalTw.g:1047:2: ( rulecountTweet )
                    // InternalTw.g:1048:3: rulecountTweet
                    {
                     before(grammarAccess.getExpressionAccess().getCountTweetParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    rulecountTweet();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCountTweetParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTw.g:1053:2: ( rulecountVisitProfil )
                    {
                    // InternalTw.g:1053:2: ( rulecountVisitProfil )
                    // InternalTw.g:1054:3: rulecountVisitProfil
                    {
                     before(grammarAccess.getExpressionAccess().getCountVisitProfilParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulecountVisitProfil();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCountVisitProfilParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTw.g:1059:2: ( ruleCroissanceAbonne )
                    {
                    // InternalTw.g:1059:2: ( ruleCroissanceAbonne )
                    // InternalTw.g:1060:3: ruleCroissanceAbonne
                    {
                     before(grammarAccess.getExpressionAccess().getCroissanceAbonneParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleCroissanceAbonne();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCroissanceAbonneParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTw.g:1065:2: ( rulemoyFollowers )
                    {
                    // InternalTw.g:1065:2: ( rulemoyFollowers )
                    // InternalTw.g:1066:3: rulemoyFollowers
                    {
                     before(grammarAccess.getExpressionAccess().getMoyFollowersParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFollowers();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMoyFollowersParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTw.g:1071:2: ( rulemoyFavorited )
                    {
                    // InternalTw.g:1071:2: ( rulemoyFavorited )
                    // InternalTw.g:1072:3: rulemoyFavorited
                    {
                     before(grammarAccess.getExpressionAccess().getMoyFavoritedParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFavorited();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMoyFavoritedParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTw.g:1077:2: ( ruleGREATER )
                    {
                    // InternalTw.g:1077:2: ( ruleGREATER )
                    // InternalTw.g:1078:3: ruleGREATER
                    {
                     before(grammarAccess.getExpressionAccess().getGREATERParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleGREATER();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getGREATERParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTw.g:1083:2: ( ruleLESS )
                    {
                    // InternalTw.g:1083:2: ( ruleLESS )
                    // InternalTw.g:1084:3: ruleLESS
                    {
                     before(grammarAccess.getExpressionAccess().getLESSParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleLESS();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLESSParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTw.g:1089:2: ( ruleEQUALS )
                    {
                    // InternalTw.g:1089:2: ( ruleEQUALS )
                    // InternalTw.g:1090:3: ruleEQUALS
                    {
                     before(grammarAccess.getExpressionAccess().getEQUALSParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleEQUALS();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getEQUALSParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTw.g:1095:2: ( ruleUtilisationVar )
                    {
                    // InternalTw.g:1095:2: ( ruleUtilisationVar )
                    // InternalTw.g:1096:3: ruleUtilisationVar
                    {
                     before(grammarAccess.getExpressionAccess().getUtilisationVarParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleUtilisationVar();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getUtilisationVarParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTw.g:1101:2: ( ruleStringTw )
                    {
                    // InternalTw.g:1101:2: ( ruleStringTw )
                    // InternalTw.g:1102:3: ruleStringTw
                    {
                     before(grammarAccess.getExpressionAccess().getStringTwParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleStringTw();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringTwParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTw.g:1107:2: ( ruleADD )
                    {
                    // InternalTw.g:1107:2: ( ruleADD )
                    // InternalTw.g:1108:3: ruleADD
                    {
                     before(grammarAccess.getExpressionAccess().getADDParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleADD();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getADDParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTw.g:1113:2: ( ruleMUL )
                    {
                    // InternalTw.g:1113:2: ( ruleMUL )
                    // InternalTw.g:1114:3: ruleMUL
                    {
                     before(grammarAccess.getExpressionAccess().getMULParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleMUL();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMULParserRuleCall_19()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalTw.g:1123:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1127:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalTw.g:1128:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalTw.g:1135:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1139:1: ( ( () ) )
            // InternalTw.g:1140:1: ( () )
            {
            // InternalTw.g:1140:1: ( () )
            // InternalTw.g:1141:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalTw.g:1142:2: ()
            // InternalTw.g:1142:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalTw.g:1150:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1154:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalTw.g:1155:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalTw.g:1162:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1166:1: ( ( 'Program' ) )
            // InternalTw.g:1167:1: ( 'Program' )
            {
            // InternalTw.g:1167:1: ( 'Program' )
            // InternalTw.g:1168:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalTw.g:1177:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1181:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalTw.g:1182:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalTw.g:1189:1: rule__Program__Group__2__Impl : ( '{' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1193:1: ( ( '{' ) )
            // InternalTw.g:1194:1: ( '{' )
            {
            // InternalTw.g:1194:1: ( '{' )
            // InternalTw.g:1195:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalTw.g:1204:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1208:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalTw.g:1209:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalTw.g:1216:1: rule__Program__Group__3__Impl : ( ( rule__Program__Group_3__0 )? ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1220:1: ( ( ( rule__Program__Group_3__0 )? ) )
            // InternalTw.g:1221:1: ( ( rule__Program__Group_3__0 )? )
            {
            // InternalTw.g:1221:1: ( ( rule__Program__Group_3__0 )? )
            // InternalTw.g:1222:2: ( rule__Program__Group_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_3()); 
            // InternalTw.g:1223:2: ( rule__Program__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==12||LA4_0==15||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=22 && LA4_0<=39)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTw.g:1223:3: rule__Program__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalTw.g:1231:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1235:1: ( rule__Program__Group__4__Impl )
            // InternalTw.g:1236:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalTw.g:1242:1: rule__Program__Group__4__Impl : ( '}' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1246:1: ( ( '}' ) )
            // InternalTw.g:1247:1: ( '}' )
            {
            // InternalTw.g:1247:1: ( '}' )
            // InternalTw.g:1248:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group_3__0"
    // InternalTw.g:1258:1: rule__Program__Group_3__0 : rule__Program__Group_3__0__Impl rule__Program__Group_3__1 ;
    public final void rule__Program__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1262:1: ( rule__Program__Group_3__0__Impl rule__Program__Group_3__1 )
            // InternalTw.g:1263:2: rule__Program__Group_3__0__Impl rule__Program__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0"


    // $ANTLR start "rule__Program__Group_3__0__Impl"
    // InternalTw.g:1270:1: rule__Program__Group_3__0__Impl : ( ( rule__Program__StatementAssignment_3_0 ) ) ;
    public final void rule__Program__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1274:1: ( ( ( rule__Program__StatementAssignment_3_0 ) ) )
            // InternalTw.g:1275:1: ( ( rule__Program__StatementAssignment_3_0 ) )
            {
            // InternalTw.g:1275:1: ( ( rule__Program__StatementAssignment_3_0 ) )
            // InternalTw.g:1276:2: ( rule__Program__StatementAssignment_3_0 )
            {
             before(grammarAccess.getProgramAccess().getStatementAssignment_3_0()); 
            // InternalTw.g:1277:2: ( rule__Program__StatementAssignment_3_0 )
            // InternalTw.g:1277:3: rule__Program__StatementAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__StatementAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0__Impl"


    // $ANTLR start "rule__Program__Group_3__1"
    // InternalTw.g:1285:1: rule__Program__Group_3__1 : rule__Program__Group_3__1__Impl ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1289:1: ( rule__Program__Group_3__1__Impl )
            // InternalTw.g:1290:2: rule__Program__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1"


    // $ANTLR start "rule__Program__Group_3__1__Impl"
    // InternalTw.g:1296:1: rule__Program__Group_3__1__Impl : ( ( rule__Program__Group_3_1__0 )* ) ;
    public final void rule__Program__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1300:1: ( ( ( rule__Program__Group_3_1__0 )* ) )
            // InternalTw.g:1301:1: ( ( rule__Program__Group_3_1__0 )* )
            {
            // InternalTw.g:1301:1: ( ( rule__Program__Group_3_1__0 )* )
            // InternalTw.g:1302:2: ( rule__Program__Group_3_1__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_3_1()); 
            // InternalTw.g:1303:2: ( rule__Program__Group_3_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTw.g:1303:3: rule__Program__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Program__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1__Impl"


    // $ANTLR start "rule__Program__Group_3_1__0"
    // InternalTw.g:1312:1: rule__Program__Group_3_1__0 : rule__Program__Group_3_1__0__Impl rule__Program__Group_3_1__1 ;
    public final void rule__Program__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1316:1: ( rule__Program__Group_3_1__0__Impl rule__Program__Group_3_1__1 )
            // InternalTw.g:1317:2: rule__Program__Group_3_1__0__Impl rule__Program__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_1__0"


    // $ANTLR start "rule__Program__Group_3_1__0__Impl"
    // InternalTw.g:1324:1: rule__Program__Group_3_1__0__Impl : ( ';' ) ;
    public final void rule__Program__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1328:1: ( ( ';' ) )
            // InternalTw.g:1329:1: ( ';' )
            {
            // InternalTw.g:1329:1: ( ';' )
            // InternalTw.g:1330:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_3_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_1__0__Impl"


    // $ANTLR start "rule__Program__Group_3_1__1"
    // InternalTw.g:1339:1: rule__Program__Group_3_1__1 : rule__Program__Group_3_1__1__Impl ;
    public final void rule__Program__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1343:1: ( rule__Program__Group_3_1__1__Impl )
            // InternalTw.g:1344:2: rule__Program__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_1__1"


    // $ANTLR start "rule__Program__Group_3_1__1__Impl"
    // InternalTw.g:1350:1: rule__Program__Group_3_1__1__Impl : ( ( rule__Program__StatementAssignment_3_1_1 ) ) ;
    public final void rule__Program__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1354:1: ( ( ( rule__Program__StatementAssignment_3_1_1 ) ) )
            // InternalTw.g:1355:1: ( ( rule__Program__StatementAssignment_3_1_1 ) )
            {
            // InternalTw.g:1355:1: ( ( rule__Program__StatementAssignment_3_1_1 ) )
            // InternalTw.g:1356:2: ( rule__Program__StatementAssignment_3_1_1 )
            {
             before(grammarAccess.getProgramAccess().getStatementAssignment_3_1_1()); 
            // InternalTw.g:1357:2: ( rule__Program__StatementAssignment_3_1_1 )
            // InternalTw.g:1357:3: rule__Program__StatementAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__StatementAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalTw.g:1366:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1370:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalTw.g:1371:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalTw.g:1378:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1382:1: ( ( () ) )
            // InternalTw.g:1383:1: ( () )
            {
            // InternalTw.g:1383:1: ( () )
            // InternalTw.g:1384:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalTw.g:1385:2: ()
            // InternalTw.g:1385:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalTw.g:1393:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1397:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalTw.g:1398:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalTw.g:1405:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1409:1: ( ( '{' ) )
            // InternalTw.g:1410:1: ( '{' )
            {
            // InternalTw.g:1410:1: ( '{' )
            // InternalTw.g:1411:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalTw.g:1420:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1424:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalTw.g:1425:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalTw.g:1432:1: rule__Block__Group__2__Impl : ( ( rule__Block__Group_2__0 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1436:1: ( ( ( rule__Block__Group_2__0 )? ) )
            // InternalTw.g:1437:1: ( ( rule__Block__Group_2__0 )? )
            {
            // InternalTw.g:1437:1: ( ( rule__Block__Group_2__0 )? )
            // InternalTw.g:1438:2: ( rule__Block__Group_2__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_2()); 
            // InternalTw.g:1439:2: ( rule__Block__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==12||LA6_0==15||(LA6_0>=19 && LA6_0<=20)||(LA6_0>=22 && LA6_0<=39)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTw.g:1439:3: rule__Block__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalTw.g:1447:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1451:1: ( rule__Block__Group__3__Impl )
            // InternalTw.g:1452:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalTw.g:1458:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1462:1: ( ( '}' ) )
            // InternalTw.g:1463:1: ( '}' )
            {
            // InternalTw.g:1463:1: ( '}' )
            // InternalTw.g:1464:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group_2__0"
    // InternalTw.g:1474:1: rule__Block__Group_2__0 : rule__Block__Group_2__0__Impl rule__Block__Group_2__1 ;
    public final void rule__Block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1478:1: ( rule__Block__Group_2__0__Impl rule__Block__Group_2__1 )
            // InternalTw.g:1479:2: rule__Block__Group_2__0__Impl rule__Block__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__0"


    // $ANTLR start "rule__Block__Group_2__0__Impl"
    // InternalTw.g:1486:1: rule__Block__Group_2__0__Impl : ( ( rule__Block__StatementAssignment_2_0 ) ) ;
    public final void rule__Block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1490:1: ( ( ( rule__Block__StatementAssignment_2_0 ) ) )
            // InternalTw.g:1491:1: ( ( rule__Block__StatementAssignment_2_0 ) )
            {
            // InternalTw.g:1491:1: ( ( rule__Block__StatementAssignment_2_0 ) )
            // InternalTw.g:1492:2: ( rule__Block__StatementAssignment_2_0 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_2_0()); 
            // InternalTw.g:1493:2: ( rule__Block__StatementAssignment_2_0 )
            // InternalTw.g:1493:3: rule__Block__StatementAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__0__Impl"


    // $ANTLR start "rule__Block__Group_2__1"
    // InternalTw.g:1501:1: rule__Block__Group_2__1 : rule__Block__Group_2__1__Impl ;
    public final void rule__Block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1505:1: ( rule__Block__Group_2__1__Impl )
            // InternalTw.g:1506:2: rule__Block__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__1"


    // $ANTLR start "rule__Block__Group_2__1__Impl"
    // InternalTw.g:1512:1: rule__Block__Group_2__1__Impl : ( ( rule__Block__Group_2_1__0 )* ) ;
    public final void rule__Block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1516:1: ( ( ( rule__Block__Group_2_1__0 )* ) )
            // InternalTw.g:1517:1: ( ( rule__Block__Group_2_1__0 )* )
            {
            // InternalTw.g:1517:1: ( ( rule__Block__Group_2_1__0 )* )
            // InternalTw.g:1518:2: ( rule__Block__Group_2_1__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_2_1()); 
            // InternalTw.g:1519:2: ( rule__Block__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTw.g:1519:3: rule__Block__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Block__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__1__Impl"


    // $ANTLR start "rule__Block__Group_2_1__0"
    // InternalTw.g:1528:1: rule__Block__Group_2_1__0 : rule__Block__Group_2_1__0__Impl rule__Block__Group_2_1__1 ;
    public final void rule__Block__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1532:1: ( rule__Block__Group_2_1__0__Impl rule__Block__Group_2_1__1 )
            // InternalTw.g:1533:2: rule__Block__Group_2_1__0__Impl rule__Block__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Block__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_1__0"


    // $ANTLR start "rule__Block__Group_2_1__0__Impl"
    // InternalTw.g:1540:1: rule__Block__Group_2_1__0__Impl : ( ';' ) ;
    public final void rule__Block__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1544:1: ( ( ';' ) )
            // InternalTw.g:1545:1: ( ';' )
            {
            // InternalTw.g:1545:1: ( ';' )
            // InternalTw.g:1546:2: ';'
            {
             before(grammarAccess.getBlockAccess().getSemicolonKeyword_2_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getSemicolonKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_1__0__Impl"


    // $ANTLR start "rule__Block__Group_2_1__1"
    // InternalTw.g:1555:1: rule__Block__Group_2_1__1 : rule__Block__Group_2_1__1__Impl ;
    public final void rule__Block__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1559:1: ( rule__Block__Group_2_1__1__Impl )
            // InternalTw.g:1560:2: rule__Block__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_1__1"


    // $ANTLR start "rule__Block__Group_2_1__1__Impl"
    // InternalTw.g:1566:1: rule__Block__Group_2_1__1__Impl : ( ( rule__Block__StatementAssignment_2_1_1 ) ) ;
    public final void rule__Block__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1570:1: ( ( ( rule__Block__StatementAssignment_2_1_1 ) ) )
            // InternalTw.g:1571:1: ( ( rule__Block__StatementAssignment_2_1_1 ) )
            {
            // InternalTw.g:1571:1: ( ( rule__Block__StatementAssignment_2_1_1 ) )
            // InternalTw.g:1572:2: ( rule__Block__StatementAssignment_2_1_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_2_1_1()); 
            // InternalTw.g:1573:2: ( rule__Block__StatementAssignment_2_1_1 )
            // InternalTw.g:1573:3: rule__Block__StatementAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_1__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalTw.g:1582:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1586:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalTw.g:1587:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalTw.g:1594:1: rule__If__Group__0__Impl : ( 'If' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1598:1: ( ( 'If' ) )
            // InternalTw.g:1599:1: ( 'If' )
            {
            // InternalTw.g:1599:1: ( 'If' )
            // InternalTw.g:1600:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalTw.g:1609:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1613:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalTw.g:1614:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalTw.g:1621:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1625:1: ( ( '(' ) )
            // InternalTw.g:1626:1: ( '(' )
            {
            // InternalTw.g:1626:1: ( '(' )
            // InternalTw.g:1627:2: '('
            {
             before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalTw.g:1636:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1640:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalTw.g:1641:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalTw.g:1648:1: rule__If__Group__2__Impl : ( ( rule__If__ConditionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1652:1: ( ( ( rule__If__ConditionAssignment_2 ) ) )
            // InternalTw.g:1653:1: ( ( rule__If__ConditionAssignment_2 ) )
            {
            // InternalTw.g:1653:1: ( ( rule__If__ConditionAssignment_2 ) )
            // InternalTw.g:1654:2: ( rule__If__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            // InternalTw.g:1655:2: ( rule__If__ConditionAssignment_2 )
            // InternalTw.g:1655:3: rule__If__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalTw.g:1663:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1667:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalTw.g:1668:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalTw.g:1675:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1679:1: ( ( ')' ) )
            // InternalTw.g:1680:1: ( ')' )
            {
            // InternalTw.g:1680:1: ( ')' )
            // InternalTw.g:1681:2: ')'
            {
             before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalTw.g:1690:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1694:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalTw.g:1695:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalTw.g:1702:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1706:1: ( ( ( rule__If__IfBlockAssignment_4 ) ) )
            // InternalTw.g:1707:1: ( ( rule__If__IfBlockAssignment_4 ) )
            {
            // InternalTw.g:1707:1: ( ( rule__If__IfBlockAssignment_4 ) )
            // InternalTw.g:1708:2: ( rule__If__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalTw.g:1709:2: ( rule__If__IfBlockAssignment_4 )
            // InternalTw.g:1709:3: rule__If__IfBlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__If__IfBlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalTw.g:1717:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1721:1: ( rule__If__Group__5__Impl )
            // InternalTw.g:1722:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalTw.g:1728:1: rule__If__Group__5__Impl : ( ( rule__If__Group_5__0 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1732:1: ( ( ( rule__If__Group_5__0 )? ) )
            // InternalTw.g:1733:1: ( ( rule__If__Group_5__0 )? )
            {
            // InternalTw.g:1733:1: ( ( rule__If__Group_5__0 )? )
            // InternalTw.g:1734:2: ( rule__If__Group_5__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_5()); 
            // InternalTw.g:1735:2: ( rule__If__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTw.g:1735:3: rule__If__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group_5__0"
    // InternalTw.g:1744:1: rule__If__Group_5__0 : rule__If__Group_5__0__Impl rule__If__Group_5__1 ;
    public final void rule__If__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1748:1: ( rule__If__Group_5__0__Impl rule__If__Group_5__1 )
            // InternalTw.g:1749:2: rule__If__Group_5__0__Impl rule__If__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__If__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_5__0"


    // $ANTLR start "rule__If__Group_5__0__Impl"
    // InternalTw.g:1756:1: rule__If__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1760:1: ( ( 'else' ) )
            // InternalTw.g:1761:1: ( 'else' )
            {
            // InternalTw.g:1761:1: ( 'else' )
            // InternalTw.g:1762:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_5__0__Impl"


    // $ANTLR start "rule__If__Group_5__1"
    // InternalTw.g:1771:1: rule__If__Group_5__1 : rule__If__Group_5__1__Impl ;
    public final void rule__If__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1775:1: ( rule__If__Group_5__1__Impl )
            // InternalTw.g:1776:2: rule__If__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_5__1"


    // $ANTLR start "rule__If__Group_5__1__Impl"
    // InternalTw.g:1782:1: rule__If__Group_5__1__Impl : ( ( rule__If__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__If__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1786:1: ( ( ( rule__If__ElseBlockAssignment_5_1 ) ) )
            // InternalTw.g:1787:1: ( ( rule__If__ElseBlockAssignment_5_1 ) )
            {
            // InternalTw.g:1787:1: ( ( rule__If__ElseBlockAssignment_5_1 ) )
            // InternalTw.g:1788:2: ( rule__If__ElseBlockAssignment_5_1 )
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_5_1()); 
            // InternalTw.g:1789:2: ( rule__If__ElseBlockAssignment_5_1 )
            // InternalTw.g:1789:3: rule__If__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ElseBlockAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getElseBlockAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_5__1__Impl"


    // $ANTLR start "rule__DeclarationVar__Group__0"
    // InternalTw.g:1798:1: rule__DeclarationVar__Group__0 : rule__DeclarationVar__Group__0__Impl rule__DeclarationVar__Group__1 ;
    public final void rule__DeclarationVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1802:1: ( rule__DeclarationVar__Group__0__Impl rule__DeclarationVar__Group__1 )
            // InternalTw.g:1803:2: rule__DeclarationVar__Group__0__Impl rule__DeclarationVar__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DeclarationVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclarationVar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__Group__0"


    // $ANTLR start "rule__DeclarationVar__Group__0__Impl"
    // InternalTw.g:1810:1: rule__DeclarationVar__Group__0__Impl : ( ( rule__DeclarationVar__NameAssignment_0 )? ) ;
    public final void rule__DeclarationVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1814:1: ( ( ( rule__DeclarationVar__NameAssignment_0 )? ) )
            // InternalTw.g:1815:1: ( ( rule__DeclarationVar__NameAssignment_0 )? )
            {
            // InternalTw.g:1815:1: ( ( rule__DeclarationVar__NameAssignment_0 )? )
            // InternalTw.g:1816:2: ( rule__DeclarationVar__NameAssignment_0 )?
            {
             before(grammarAccess.getDeclarationVarAccess().getNameAssignment_0()); 
            // InternalTw.g:1817:2: ( rule__DeclarationVar__NameAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTw.g:1817:3: rule__DeclarationVar__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclarationVar__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationVarAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__Group__0__Impl"


    // $ANTLR start "rule__DeclarationVar__Group__1"
    // InternalTw.g:1825:1: rule__DeclarationVar__Group__1 : rule__DeclarationVar__Group__1__Impl rule__DeclarationVar__Group__2 ;
    public final void rule__DeclarationVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1829:1: ( rule__DeclarationVar__Group__1__Impl rule__DeclarationVar__Group__2 )
            // InternalTw.g:1830:2: rule__DeclarationVar__Group__1__Impl rule__DeclarationVar__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DeclarationVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclarationVar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__Group__1"


    // $ANTLR start "rule__DeclarationVar__Group__1__Impl"
    // InternalTw.g:1837:1: rule__DeclarationVar__Group__1__Impl : ( ':=' ) ;
    public final void rule__DeclarationVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1841:1: ( ( ':=' ) )
            // InternalTw.g:1842:1: ( ':=' )
            {
            // InternalTw.g:1842:1: ( ':=' )
            // InternalTw.g:1843:2: ':='
            {
             before(grammarAccess.getDeclarationVarAccess().getColonEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeclarationVarAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__Group__1__Impl"


    // $ANTLR start "rule__DeclarationVar__Group__2"
    // InternalTw.g:1852:1: rule__DeclarationVar__Group__2 : rule__DeclarationVar__Group__2__Impl ;
    public final void rule__DeclarationVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1856:1: ( rule__DeclarationVar__Group__2__Impl )
            // InternalTw.g:1857:2: rule__DeclarationVar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationVar__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__Group__2"


    // $ANTLR start "rule__DeclarationVar__Group__2__Impl"
    // InternalTw.g:1863:1: rule__DeclarationVar__Group__2__Impl : ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) ) ;
    public final void rule__DeclarationVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1867:1: ( ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) ) )
            // InternalTw.g:1868:1: ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) )
            {
            // InternalTw.g:1868:1: ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) )
            // InternalTw.g:1869:2: ( rule__DeclarationVar__OpDroiteAssignment_2 )
            {
             before(grammarAccess.getDeclarationVarAccess().getOpDroiteAssignment_2()); 
            // InternalTw.g:1870:2: ( rule__DeclarationVar__OpDroiteAssignment_2 )
            // InternalTw.g:1870:3: rule__DeclarationVar__OpDroiteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationVar__OpDroiteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationVarAccess().getOpDroiteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__Group__2__Impl"


    // $ANTLR start "rule__AND__Group__0"
    // InternalTw.g:1879:1: rule__AND__Group__0 : rule__AND__Group__0__Impl rule__AND__Group__1 ;
    public final void rule__AND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1883:1: ( rule__AND__Group__0__Impl rule__AND__Group__1 )
            // InternalTw.g:1884:2: rule__AND__Group__0__Impl rule__AND__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AND__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__0"


    // $ANTLR start "rule__AND__Group__0__Impl"
    // InternalTw.g:1891:1: rule__AND__Group__0__Impl : ( 'AND' ) ;
    public final void rule__AND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1895:1: ( ( 'AND' ) )
            // InternalTw.g:1896:1: ( 'AND' )
            {
            // InternalTw.g:1896:1: ( 'AND' )
            // InternalTw.g:1897:2: 'AND'
            {
             before(grammarAccess.getANDAccess().getANDKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getANDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__0__Impl"


    // $ANTLR start "rule__AND__Group__1"
    // InternalTw.g:1906:1: rule__AND__Group__1 : rule__AND__Group__1__Impl rule__AND__Group__2 ;
    public final void rule__AND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1910:1: ( rule__AND__Group__1__Impl rule__AND__Group__2 )
            // InternalTw.g:1911:2: rule__AND__Group__1__Impl rule__AND__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AND__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__1"


    // $ANTLR start "rule__AND__Group__1__Impl"
    // InternalTw.g:1918:1: rule__AND__Group__1__Impl : ( '(' ) ;
    public final void rule__AND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1922:1: ( ( '(' ) )
            // InternalTw.g:1923:1: ( '(' )
            {
            // InternalTw.g:1923:1: ( '(' )
            // InternalTw.g:1924:2: '('
            {
             before(grammarAccess.getANDAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__1__Impl"


    // $ANTLR start "rule__AND__Group__2"
    // InternalTw.g:1933:1: rule__AND__Group__2 : rule__AND__Group__2__Impl rule__AND__Group__3 ;
    public final void rule__AND__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1937:1: ( rule__AND__Group__2__Impl rule__AND__Group__3 )
            // InternalTw.g:1938:2: rule__AND__Group__2__Impl rule__AND__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AND__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__2"


    // $ANTLR start "rule__AND__Group__2__Impl"
    // InternalTw.g:1945:1: rule__AND__Group__2__Impl : ( ( rule__AND__Exp1Assignment_2 ) ) ;
    public final void rule__AND__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1949:1: ( ( ( rule__AND__Exp1Assignment_2 ) ) )
            // InternalTw.g:1950:1: ( ( rule__AND__Exp1Assignment_2 ) )
            {
            // InternalTw.g:1950:1: ( ( rule__AND__Exp1Assignment_2 ) )
            // InternalTw.g:1951:2: ( rule__AND__Exp1Assignment_2 )
            {
             before(grammarAccess.getANDAccess().getExp1Assignment_2()); 
            // InternalTw.g:1952:2: ( rule__AND__Exp1Assignment_2 )
            // InternalTw.g:1952:3: rule__AND__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AND__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__2__Impl"


    // $ANTLR start "rule__AND__Group__3"
    // InternalTw.g:1960:1: rule__AND__Group__3 : rule__AND__Group__3__Impl rule__AND__Group__4 ;
    public final void rule__AND__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1964:1: ( rule__AND__Group__3__Impl rule__AND__Group__4 )
            // InternalTw.g:1965:2: rule__AND__Group__3__Impl rule__AND__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AND__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__3"


    // $ANTLR start "rule__AND__Group__3__Impl"
    // InternalTw.g:1972:1: rule__AND__Group__3__Impl : ( ',' ) ;
    public final void rule__AND__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1976:1: ( ( ',' ) )
            // InternalTw.g:1977:1: ( ',' )
            {
            // InternalTw.g:1977:1: ( ',' )
            // InternalTw.g:1978:2: ','
            {
             before(grammarAccess.getANDAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__3__Impl"


    // $ANTLR start "rule__AND__Group__4"
    // InternalTw.g:1987:1: rule__AND__Group__4 : rule__AND__Group__4__Impl rule__AND__Group__5 ;
    public final void rule__AND__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1991:1: ( rule__AND__Group__4__Impl rule__AND__Group__5 )
            // InternalTw.g:1992:2: rule__AND__Group__4__Impl rule__AND__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__AND__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AND__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__4"


    // $ANTLR start "rule__AND__Group__4__Impl"
    // InternalTw.g:1999:1: rule__AND__Group__4__Impl : ( ( rule__AND__Exp2Assignment_4 ) ) ;
    public final void rule__AND__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2003:1: ( ( ( rule__AND__Exp2Assignment_4 ) ) )
            // InternalTw.g:2004:1: ( ( rule__AND__Exp2Assignment_4 ) )
            {
            // InternalTw.g:2004:1: ( ( rule__AND__Exp2Assignment_4 ) )
            // InternalTw.g:2005:2: ( rule__AND__Exp2Assignment_4 )
            {
             before(grammarAccess.getANDAccess().getExp2Assignment_4()); 
            // InternalTw.g:2006:2: ( rule__AND__Exp2Assignment_4 )
            // InternalTw.g:2006:3: rule__AND__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AND__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getANDAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__4__Impl"


    // $ANTLR start "rule__AND__Group__5"
    // InternalTw.g:2014:1: rule__AND__Group__5 : rule__AND__Group__5__Impl ;
    public final void rule__AND__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2018:1: ( rule__AND__Group__5__Impl )
            // InternalTw.g:2019:2: rule__AND__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AND__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__5"


    // $ANTLR start "rule__AND__Group__5__Impl"
    // InternalTw.g:2025:1: rule__AND__Group__5__Impl : ( ')' ) ;
    public final void rule__AND__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2029:1: ( ( ')' ) )
            // InternalTw.g:2030:1: ( ')' )
            {
            // InternalTw.g:2030:1: ( ')' )
            // InternalTw.g:2031:2: ')'
            {
             before(grammarAccess.getANDAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getANDAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Group__5__Impl"


    // $ANTLR start "rule__OR__Group__0"
    // InternalTw.g:2041:1: rule__OR__Group__0 : rule__OR__Group__0__Impl rule__OR__Group__1 ;
    public final void rule__OR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2045:1: ( rule__OR__Group__0__Impl rule__OR__Group__1 )
            // InternalTw.g:2046:2: rule__OR__Group__0__Impl rule__OR__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__0"


    // $ANTLR start "rule__OR__Group__0__Impl"
    // InternalTw.g:2053:1: rule__OR__Group__0__Impl : ( 'OR' ) ;
    public final void rule__OR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2057:1: ( ( 'OR' ) )
            // InternalTw.g:2058:1: ( 'OR' )
            {
            // InternalTw.g:2058:1: ( 'OR' )
            // InternalTw.g:2059:2: 'OR'
            {
             before(grammarAccess.getORAccess().getORKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getORAccess().getORKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__0__Impl"


    // $ANTLR start "rule__OR__Group__1"
    // InternalTw.g:2068:1: rule__OR__Group__1 : rule__OR__Group__1__Impl rule__OR__Group__2 ;
    public final void rule__OR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2072:1: ( rule__OR__Group__1__Impl rule__OR__Group__2 )
            // InternalTw.g:2073:2: rule__OR__Group__1__Impl rule__OR__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__1"


    // $ANTLR start "rule__OR__Group__1__Impl"
    // InternalTw.g:2080:1: rule__OR__Group__1__Impl : ( '(' ) ;
    public final void rule__OR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2084:1: ( ( '(' ) )
            // InternalTw.g:2085:1: ( '(' )
            {
            // InternalTw.g:2085:1: ( '(' )
            // InternalTw.g:2086:2: '('
            {
             before(grammarAccess.getORAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getORAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__1__Impl"


    // $ANTLR start "rule__OR__Group__2"
    // InternalTw.g:2095:1: rule__OR__Group__2 : rule__OR__Group__2__Impl rule__OR__Group__3 ;
    public final void rule__OR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2099:1: ( rule__OR__Group__2__Impl rule__OR__Group__3 )
            // InternalTw.g:2100:2: rule__OR__Group__2__Impl rule__OR__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__OR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__2"


    // $ANTLR start "rule__OR__Group__2__Impl"
    // InternalTw.g:2107:1: rule__OR__Group__2__Impl : ( ( rule__OR__Exp1Assignment_2 ) ) ;
    public final void rule__OR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2111:1: ( ( ( rule__OR__Exp1Assignment_2 ) ) )
            // InternalTw.g:2112:1: ( ( rule__OR__Exp1Assignment_2 ) )
            {
            // InternalTw.g:2112:1: ( ( rule__OR__Exp1Assignment_2 ) )
            // InternalTw.g:2113:2: ( rule__OR__Exp1Assignment_2 )
            {
             before(grammarAccess.getORAccess().getExp1Assignment_2()); 
            // InternalTw.g:2114:2: ( rule__OR__Exp1Assignment_2 )
            // InternalTw.g:2114:3: rule__OR__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OR__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__2__Impl"


    // $ANTLR start "rule__OR__Group__3"
    // InternalTw.g:2122:1: rule__OR__Group__3 : rule__OR__Group__3__Impl rule__OR__Group__4 ;
    public final void rule__OR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2126:1: ( rule__OR__Group__3__Impl rule__OR__Group__4 )
            // InternalTw.g:2127:2: rule__OR__Group__3__Impl rule__OR__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__OR__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__3"


    // $ANTLR start "rule__OR__Group__3__Impl"
    // InternalTw.g:2134:1: rule__OR__Group__3__Impl : ( ',' ) ;
    public final void rule__OR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2138:1: ( ( ',' ) )
            // InternalTw.g:2139:1: ( ',' )
            {
            // InternalTw.g:2139:1: ( ',' )
            // InternalTw.g:2140:2: ','
            {
             before(grammarAccess.getORAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getORAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__3__Impl"


    // $ANTLR start "rule__OR__Group__4"
    // InternalTw.g:2149:1: rule__OR__Group__4 : rule__OR__Group__4__Impl rule__OR__Group__5 ;
    public final void rule__OR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2153:1: ( rule__OR__Group__4__Impl rule__OR__Group__5 )
            // InternalTw.g:2154:2: rule__OR__Group__4__Impl rule__OR__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__OR__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OR__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__4"


    // $ANTLR start "rule__OR__Group__4__Impl"
    // InternalTw.g:2161:1: rule__OR__Group__4__Impl : ( ( rule__OR__Exp2Assignment_4 ) ) ;
    public final void rule__OR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2165:1: ( ( ( rule__OR__Exp2Assignment_4 ) ) )
            // InternalTw.g:2166:1: ( ( rule__OR__Exp2Assignment_4 ) )
            {
            // InternalTw.g:2166:1: ( ( rule__OR__Exp2Assignment_4 ) )
            // InternalTw.g:2167:2: ( rule__OR__Exp2Assignment_4 )
            {
             before(grammarAccess.getORAccess().getExp2Assignment_4()); 
            // InternalTw.g:2168:2: ( rule__OR__Exp2Assignment_4 )
            // InternalTw.g:2168:3: rule__OR__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OR__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getORAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__4__Impl"


    // $ANTLR start "rule__OR__Group__5"
    // InternalTw.g:2176:1: rule__OR__Group__5 : rule__OR__Group__5__Impl ;
    public final void rule__OR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2180:1: ( rule__OR__Group__5__Impl )
            // InternalTw.g:2181:2: rule__OR__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OR__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__5"


    // $ANTLR start "rule__OR__Group__5__Impl"
    // InternalTw.g:2187:1: rule__OR__Group__5__Impl : ( ')' ) ;
    public final void rule__OR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2191:1: ( ( ')' ) )
            // InternalTw.g:2192:1: ( ')' )
            {
            // InternalTw.g:2192:1: ( ')' )
            // InternalTw.g:2193:2: ')'
            {
             before(grammarAccess.getORAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getORAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Group__5__Impl"


    // $ANTLR start "rule__Tweets_user__Group__0"
    // InternalTw.g:2203:1: rule__Tweets_user__Group__0 : rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1 ;
    public final void rule__Tweets_user__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2207:1: ( rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1 )
            // InternalTw.g:2208:2: rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Tweets_user__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__0"


    // $ANTLR start "rule__Tweets_user__Group__0__Impl"
    // InternalTw.g:2215:1: rule__Tweets_user__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_user__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2219:1: ( ( () ) )
            // InternalTw.g:2220:1: ( () )
            {
            // InternalTw.g:2220:1: ( () )
            // InternalTw.g:2221:2: ()
            {
             before(grammarAccess.getTweets_userAccess().getTweets_userAction_0()); 
            // InternalTw.g:2222:2: ()
            // InternalTw.g:2222:3: 
            {
            }

             after(grammarAccess.getTweets_userAccess().getTweets_userAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group__1"
    // InternalTw.g:2230:1: rule__Tweets_user__Group__1 : rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2 ;
    public final void rule__Tweets_user__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2234:1: ( rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2 )
            // InternalTw.g:2235:2: rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tweets_user__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__1"


    // $ANTLR start "rule__Tweets_user__Group__1__Impl"
    // InternalTw.g:2242:1: rule__Tweets_user__Group__1__Impl : ( 'tweets_user' ) ;
    public final void rule__Tweets_user__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2246:1: ( ( 'tweets_user' ) )
            // InternalTw.g:2247:1: ( 'tweets_user' )
            {
            // InternalTw.g:2247:1: ( 'tweets_user' )
            // InternalTw.g:2248:2: 'tweets_user'
            {
             before(grammarAccess.getTweets_userAccess().getTweets_userKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getTweets_userKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__1__Impl"


    // $ANTLR start "rule__Tweets_user__Group__2"
    // InternalTw.g:2257:1: rule__Tweets_user__Group__2 : rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3 ;
    public final void rule__Tweets_user__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2261:1: ( rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3 )
            // InternalTw.g:2262:2: rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_user__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__2"


    // $ANTLR start "rule__Tweets_user__Group__2__Impl"
    // InternalTw.g:2269:1: rule__Tweets_user__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_user__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2273:1: ( ( '{' ) )
            // InternalTw.g:2274:1: ( '{' )
            {
            // InternalTw.g:2274:1: ( '{' )
            // InternalTw.g:2275:2: '{'
            {
             before(grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__2__Impl"


    // $ANTLR start "rule__Tweets_user__Group__3"
    // InternalTw.g:2284:1: rule__Tweets_user__Group__3 : rule__Tweets_user__Group__3__Impl rule__Tweets_user__Group__4 ;
    public final void rule__Tweets_user__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2288:1: ( rule__Tweets_user__Group__3__Impl rule__Tweets_user__Group__4 )
            // InternalTw.g:2289:2: rule__Tweets_user__Group__3__Impl rule__Tweets_user__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_user__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__3"


    // $ANTLR start "rule__Tweets_user__Group__3__Impl"
    // InternalTw.g:2296:1: rule__Tweets_user__Group__3__Impl : ( ( rule__Tweets_user__Group_3__0 )? ) ;
    public final void rule__Tweets_user__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2300:1: ( ( ( rule__Tweets_user__Group_3__0 )? ) )
            // InternalTw.g:2301:1: ( ( rule__Tweets_user__Group_3__0 )? )
            {
            // InternalTw.g:2301:1: ( ( rule__Tweets_user__Group_3__0 )? )
            // InternalTw.g:2302:2: ( rule__Tweets_user__Group_3__0 )?
            {
             before(grammarAccess.getTweets_userAccess().getGroup_3()); 
            // InternalTw.g:2303:2: ( rule__Tweets_user__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==20||(LA10_0>=22 && LA10_0<=36)||(LA10_0>=38 && LA10_0<=39)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTw.g:2303:3: rule__Tweets_user__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tweets_user__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTweets_userAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__3__Impl"


    // $ANTLR start "rule__Tweets_user__Group__4"
    // InternalTw.g:2311:1: rule__Tweets_user__Group__4 : rule__Tweets_user__Group__4__Impl ;
    public final void rule__Tweets_user__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2315:1: ( rule__Tweets_user__Group__4__Impl )
            // InternalTw.g:2316:2: rule__Tweets_user__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__4"


    // $ANTLR start "rule__Tweets_user__Group__4__Impl"
    // InternalTw.g:2322:1: rule__Tweets_user__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_user__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2326:1: ( ( '}' ) )
            // InternalTw.g:2327:1: ( '}' )
            {
            // InternalTw.g:2327:1: ( '}' )
            // InternalTw.g:2328:2: '}'
            {
             before(grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group__4__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3__0"
    // InternalTw.g:2338:1: rule__Tweets_user__Group_3__0 : rule__Tweets_user__Group_3__0__Impl rule__Tweets_user__Group_3__1 ;
    public final void rule__Tweets_user__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2342:1: ( rule__Tweets_user__Group_3__0__Impl rule__Tweets_user__Group_3__1 )
            // InternalTw.g:2343:2: rule__Tweets_user__Group_3__0__Impl rule__Tweets_user__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_user__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__0"


    // $ANTLR start "rule__Tweets_user__Group_3__0__Impl"
    // InternalTw.g:2350:1: rule__Tweets_user__Group_3__0__Impl : ( ( rule__Tweets_user__ArgsAssignment_3_0 ) ) ;
    public final void rule__Tweets_user__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2354:1: ( ( ( rule__Tweets_user__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:2355:1: ( ( rule__Tweets_user__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:2355:1: ( ( rule__Tweets_user__ArgsAssignment_3_0 ) )
            // InternalTw.g:2356:2: ( rule__Tweets_user__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getTweets_userAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:2357:2: ( rule__Tweets_user__ArgsAssignment_3_0 )
            // InternalTw.g:2357:3: rule__Tweets_user__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3__1"
    // InternalTw.g:2365:1: rule__Tweets_user__Group_3__1 : rule__Tweets_user__Group_3__1__Impl ;
    public final void rule__Tweets_user__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2369:1: ( rule__Tweets_user__Group_3__1__Impl )
            // InternalTw.g:2370:2: rule__Tweets_user__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__1"


    // $ANTLR start "rule__Tweets_user__Group_3__1__Impl"
    // InternalTw.g:2376:1: rule__Tweets_user__Group_3__1__Impl : ( ( rule__Tweets_user__Group_3_1__0 )* ) ;
    public final void rule__Tweets_user__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2380:1: ( ( ( rule__Tweets_user__Group_3_1__0 )* ) )
            // InternalTw.g:2381:1: ( ( rule__Tweets_user__Group_3_1__0 )* )
            {
            // InternalTw.g:2381:1: ( ( rule__Tweets_user__Group_3_1__0 )* )
            // InternalTw.g:2382:2: ( rule__Tweets_user__Group_3_1__0 )*
            {
             before(grammarAccess.getTweets_userAccess().getGroup_3_1()); 
            // InternalTw.g:2383:2: ( rule__Tweets_user__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTw.g:2383:3: rule__Tweets_user__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Tweets_user__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTweets_userAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__1__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3_1__0"
    // InternalTw.g:2392:1: rule__Tweets_user__Group_3_1__0 : rule__Tweets_user__Group_3_1__0__Impl rule__Tweets_user__Group_3_1__1 ;
    public final void rule__Tweets_user__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2396:1: ( rule__Tweets_user__Group_3_1__0__Impl rule__Tweets_user__Group_3_1__1 )
            // InternalTw.g:2397:2: rule__Tweets_user__Group_3_1__0__Impl rule__Tweets_user__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Tweets_user__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_1__0"


    // $ANTLR start "rule__Tweets_user__Group_3_1__0__Impl"
    // InternalTw.g:2404:1: rule__Tweets_user__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_user__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2408:1: ( ( ',' ) )
            // InternalTw.g:2409:1: ( ',' )
            {
            // InternalTw.g:2409:1: ( ',' )
            // InternalTw.g:2410:2: ','
            {
             before(grammarAccess.getTweets_userAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_1__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3_1__1"
    // InternalTw.g:2419:1: rule__Tweets_user__Group_3_1__1 : rule__Tweets_user__Group_3_1__1__Impl ;
    public final void rule__Tweets_user__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2423:1: ( rule__Tweets_user__Group_3_1__1__Impl )
            // InternalTw.g:2424:2: rule__Tweets_user__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_1__1"


    // $ANTLR start "rule__Tweets_user__Group_3_1__1__Impl"
    // InternalTw.g:2430:1: rule__Tweets_user__Group_3_1__1__Impl : ( ( rule__Tweets_user__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Tweets_user__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2434:1: ( ( ( rule__Tweets_user__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:2435:1: ( ( rule__Tweets_user__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:2435:1: ( ( rule__Tweets_user__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:2436:2: ( rule__Tweets_user__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getTweets_userAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:2437:2: ( rule__Tweets_user__ArgsAssignment_3_1_1 )
            // InternalTw.g:2437:3: rule__Tweets_user__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_1__1__Impl"


    // $ANTLR start "rule__Tweets_location__Group__0"
    // InternalTw.g:2446:1: rule__Tweets_location__Group__0 : rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1 ;
    public final void rule__Tweets_location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2450:1: ( rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1 )
            // InternalTw.g:2451:2: rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Tweets_location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__0"


    // $ANTLR start "rule__Tweets_location__Group__0__Impl"
    // InternalTw.g:2458:1: rule__Tweets_location__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2462:1: ( ( () ) )
            // InternalTw.g:2463:1: ( () )
            {
            // InternalTw.g:2463:1: ( () )
            // InternalTw.g:2464:2: ()
            {
             before(grammarAccess.getTweets_locationAccess().getTweets_locationAction_0()); 
            // InternalTw.g:2465:2: ()
            // InternalTw.g:2465:3: 
            {
            }

             after(grammarAccess.getTweets_locationAccess().getTweets_locationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group__1"
    // InternalTw.g:2473:1: rule__Tweets_location__Group__1 : rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2 ;
    public final void rule__Tweets_location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2477:1: ( rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2 )
            // InternalTw.g:2478:2: rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tweets_location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__1"


    // $ANTLR start "rule__Tweets_location__Group__1__Impl"
    // InternalTw.g:2485:1: rule__Tweets_location__Group__1__Impl : ( 'tweets_location' ) ;
    public final void rule__Tweets_location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2489:1: ( ( 'tweets_location' ) )
            // InternalTw.g:2490:1: ( 'tweets_location' )
            {
            // InternalTw.g:2490:1: ( 'tweets_location' )
            // InternalTw.g:2491:2: 'tweets_location'
            {
             before(grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__1__Impl"


    // $ANTLR start "rule__Tweets_location__Group__2"
    // InternalTw.g:2500:1: rule__Tweets_location__Group__2 : rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3 ;
    public final void rule__Tweets_location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2504:1: ( rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3 )
            // InternalTw.g:2505:2: rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__2"


    // $ANTLR start "rule__Tweets_location__Group__2__Impl"
    // InternalTw.g:2512:1: rule__Tweets_location__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2516:1: ( ( '{' ) )
            // InternalTw.g:2517:1: ( '{' )
            {
            // InternalTw.g:2517:1: ( '{' )
            // InternalTw.g:2518:2: '{'
            {
             before(grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__2__Impl"


    // $ANTLR start "rule__Tweets_location__Group__3"
    // InternalTw.g:2527:1: rule__Tweets_location__Group__3 : rule__Tweets_location__Group__3__Impl rule__Tweets_location__Group__4 ;
    public final void rule__Tweets_location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2531:1: ( rule__Tweets_location__Group__3__Impl rule__Tweets_location__Group__4 )
            // InternalTw.g:2532:2: rule__Tweets_location__Group__3__Impl rule__Tweets_location__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__3"


    // $ANTLR start "rule__Tweets_location__Group__3__Impl"
    // InternalTw.g:2539:1: rule__Tweets_location__Group__3__Impl : ( ( rule__Tweets_location__Group_3__0 )? ) ;
    public final void rule__Tweets_location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2543:1: ( ( ( rule__Tweets_location__Group_3__0 )? ) )
            // InternalTw.g:2544:1: ( ( rule__Tweets_location__Group_3__0 )? )
            {
            // InternalTw.g:2544:1: ( ( rule__Tweets_location__Group_3__0 )? )
            // InternalTw.g:2545:2: ( rule__Tweets_location__Group_3__0 )?
            {
             before(grammarAccess.getTweets_locationAccess().getGroup_3()); 
            // InternalTw.g:2546:2: ( rule__Tweets_location__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==20||(LA12_0>=22 && LA12_0<=36)||(LA12_0>=38 && LA12_0<=39)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTw.g:2546:3: rule__Tweets_location__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tweets_location__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTweets_locationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__3__Impl"


    // $ANTLR start "rule__Tweets_location__Group__4"
    // InternalTw.g:2554:1: rule__Tweets_location__Group__4 : rule__Tweets_location__Group__4__Impl ;
    public final void rule__Tweets_location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2558:1: ( rule__Tweets_location__Group__4__Impl )
            // InternalTw.g:2559:2: rule__Tweets_location__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__4"


    // $ANTLR start "rule__Tweets_location__Group__4__Impl"
    // InternalTw.g:2565:1: rule__Tweets_location__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2569:1: ( ( '}' ) )
            // InternalTw.g:2570:1: ( '}' )
            {
            // InternalTw.g:2570:1: ( '}' )
            // InternalTw.g:2571:2: '}'
            {
             before(grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group__4__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3__0"
    // InternalTw.g:2581:1: rule__Tweets_location__Group_3__0 : rule__Tweets_location__Group_3__0__Impl rule__Tweets_location__Group_3__1 ;
    public final void rule__Tweets_location__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2585:1: ( rule__Tweets_location__Group_3__0__Impl rule__Tweets_location__Group_3__1 )
            // InternalTw.g:2586:2: rule__Tweets_location__Group_3__0__Impl rule__Tweets_location__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_location__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__0"


    // $ANTLR start "rule__Tweets_location__Group_3__0__Impl"
    // InternalTw.g:2593:1: rule__Tweets_location__Group_3__0__Impl : ( ( rule__Tweets_location__ArgsAssignment_3_0 ) ) ;
    public final void rule__Tweets_location__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2597:1: ( ( ( rule__Tweets_location__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:2598:1: ( ( rule__Tweets_location__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:2598:1: ( ( rule__Tweets_location__ArgsAssignment_3_0 ) )
            // InternalTw.g:2599:2: ( rule__Tweets_location__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:2600:2: ( rule__Tweets_location__ArgsAssignment_3_0 )
            // InternalTw.g:2600:3: rule__Tweets_location__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3__1"
    // InternalTw.g:2608:1: rule__Tweets_location__Group_3__1 : rule__Tweets_location__Group_3__1__Impl ;
    public final void rule__Tweets_location__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2612:1: ( rule__Tweets_location__Group_3__1__Impl )
            // InternalTw.g:2613:2: rule__Tweets_location__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__1"


    // $ANTLR start "rule__Tweets_location__Group_3__1__Impl"
    // InternalTw.g:2619:1: rule__Tweets_location__Group_3__1__Impl : ( ( rule__Tweets_location__Group_3_1__0 )* ) ;
    public final void rule__Tweets_location__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2623:1: ( ( ( rule__Tweets_location__Group_3_1__0 )* ) )
            // InternalTw.g:2624:1: ( ( rule__Tweets_location__Group_3_1__0 )* )
            {
            // InternalTw.g:2624:1: ( ( rule__Tweets_location__Group_3_1__0 )* )
            // InternalTw.g:2625:2: ( rule__Tweets_location__Group_3_1__0 )*
            {
             before(grammarAccess.getTweets_locationAccess().getGroup_3_1()); 
            // InternalTw.g:2626:2: ( rule__Tweets_location__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTw.g:2626:3: rule__Tweets_location__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Tweets_location__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTweets_locationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__1__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3_1__0"
    // InternalTw.g:2635:1: rule__Tweets_location__Group_3_1__0 : rule__Tweets_location__Group_3_1__0__Impl rule__Tweets_location__Group_3_1__1 ;
    public final void rule__Tweets_location__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2639:1: ( rule__Tweets_location__Group_3_1__0__Impl rule__Tweets_location__Group_3_1__1 )
            // InternalTw.g:2640:2: rule__Tweets_location__Group_3_1__0__Impl rule__Tweets_location__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Tweets_location__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_1__0"


    // $ANTLR start "rule__Tweets_location__Group_3_1__0__Impl"
    // InternalTw.g:2647:1: rule__Tweets_location__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_location__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2651:1: ( ( ',' ) )
            // InternalTw.g:2652:1: ( ',' )
            {
            // InternalTw.g:2652:1: ( ',' )
            // InternalTw.g:2653:2: ','
            {
             before(grammarAccess.getTweets_locationAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_1__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3_1__1"
    // InternalTw.g:2662:1: rule__Tweets_location__Group_3_1__1 : rule__Tweets_location__Group_3_1__1__Impl ;
    public final void rule__Tweets_location__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2666:1: ( rule__Tweets_location__Group_3_1__1__Impl )
            // InternalTw.g:2667:2: rule__Tweets_location__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_1__1"


    // $ANTLR start "rule__Tweets_location__Group_3_1__1__Impl"
    // InternalTw.g:2673:1: rule__Tweets_location__Group_3_1__1__Impl : ( ( rule__Tweets_location__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Tweets_location__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2677:1: ( ( ( rule__Tweets_location__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:2678:1: ( ( rule__Tweets_location__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:2678:1: ( ( rule__Tweets_location__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:2679:2: ( rule__Tweets_location__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:2680:2: ( rule__Tweets_location__ArgsAssignment_3_1_1 )
            // InternalTw.g:2680:3: rule__Tweets_location__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_1__1__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__0"
    // InternalTw.g:2689:1: rule__Tweets_entity__Group__0 : rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1 ;
    public final void rule__Tweets_entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2693:1: ( rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1 )
            // InternalTw.g:2694:2: rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Tweets_entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__0"


    // $ANTLR start "rule__Tweets_entity__Group__0__Impl"
    // InternalTw.g:2701:1: rule__Tweets_entity__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2705:1: ( ( () ) )
            // InternalTw.g:2706:1: ( () )
            {
            // InternalTw.g:2706:1: ( () )
            // InternalTw.g:2707:2: ()
            {
             before(grammarAccess.getTweets_entityAccess().getTweets_entityAction_0()); 
            // InternalTw.g:2708:2: ()
            // InternalTw.g:2708:3: 
            {
            }

             after(grammarAccess.getTweets_entityAccess().getTweets_entityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__1"
    // InternalTw.g:2716:1: rule__Tweets_entity__Group__1 : rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2 ;
    public final void rule__Tweets_entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2720:1: ( rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2 )
            // InternalTw.g:2721:2: rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tweets_entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__1"


    // $ANTLR start "rule__Tweets_entity__Group__1__Impl"
    // InternalTw.g:2728:1: rule__Tweets_entity__Group__1__Impl : ( 'tweets_entity' ) ;
    public final void rule__Tweets_entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2732:1: ( ( 'tweets_entity' ) )
            // InternalTw.g:2733:1: ( 'tweets_entity' )
            {
            // InternalTw.g:2733:1: ( 'tweets_entity' )
            // InternalTw.g:2734:2: 'tweets_entity'
            {
             before(grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__1__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__2"
    // InternalTw.g:2743:1: rule__Tweets_entity__Group__2 : rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3 ;
    public final void rule__Tweets_entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2747:1: ( rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3 )
            // InternalTw.g:2748:2: rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__2"


    // $ANTLR start "rule__Tweets_entity__Group__2__Impl"
    // InternalTw.g:2755:1: rule__Tweets_entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2759:1: ( ( '{' ) )
            // InternalTw.g:2760:1: ( '{' )
            {
            // InternalTw.g:2760:1: ( '{' )
            // InternalTw.g:2761:2: '{'
            {
             before(grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__2__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__3"
    // InternalTw.g:2770:1: rule__Tweets_entity__Group__3 : rule__Tweets_entity__Group__3__Impl rule__Tweets_entity__Group__4 ;
    public final void rule__Tweets_entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2774:1: ( rule__Tweets_entity__Group__3__Impl rule__Tweets_entity__Group__4 )
            // InternalTw.g:2775:2: rule__Tweets_entity__Group__3__Impl rule__Tweets_entity__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__3"


    // $ANTLR start "rule__Tweets_entity__Group__3__Impl"
    // InternalTw.g:2782:1: rule__Tweets_entity__Group__3__Impl : ( ( rule__Tweets_entity__Group_3__0 )? ) ;
    public final void rule__Tweets_entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2786:1: ( ( ( rule__Tweets_entity__Group_3__0 )? ) )
            // InternalTw.g:2787:1: ( ( rule__Tweets_entity__Group_3__0 )? )
            {
            // InternalTw.g:2787:1: ( ( rule__Tweets_entity__Group_3__0 )? )
            // InternalTw.g:2788:2: ( rule__Tweets_entity__Group_3__0 )?
            {
             before(grammarAccess.getTweets_entityAccess().getGroup_3()); 
            // InternalTw.g:2789:2: ( rule__Tweets_entity__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==20||(LA14_0>=22 && LA14_0<=36)||(LA14_0>=38 && LA14_0<=39)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTw.g:2789:3: rule__Tweets_entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tweets_entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTweets_entityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__3__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__4"
    // InternalTw.g:2797:1: rule__Tweets_entity__Group__4 : rule__Tweets_entity__Group__4__Impl ;
    public final void rule__Tweets_entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2801:1: ( rule__Tweets_entity__Group__4__Impl )
            // InternalTw.g:2802:2: rule__Tweets_entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__4"


    // $ANTLR start "rule__Tweets_entity__Group__4__Impl"
    // InternalTw.g:2808:1: rule__Tweets_entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2812:1: ( ( '}' ) )
            // InternalTw.g:2813:1: ( '}' )
            {
            // InternalTw.g:2813:1: ( '}' )
            // InternalTw.g:2814:2: '}'
            {
             before(grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group__4__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3__0"
    // InternalTw.g:2824:1: rule__Tweets_entity__Group_3__0 : rule__Tweets_entity__Group_3__0__Impl rule__Tweets_entity__Group_3__1 ;
    public final void rule__Tweets_entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2828:1: ( rule__Tweets_entity__Group_3__0__Impl rule__Tweets_entity__Group_3__1 )
            // InternalTw.g:2829:2: rule__Tweets_entity__Group_3__0__Impl rule__Tweets_entity__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__0"


    // $ANTLR start "rule__Tweets_entity__Group_3__0__Impl"
    // InternalTw.g:2836:1: rule__Tweets_entity__Group_3__0__Impl : ( ( rule__Tweets_entity__ArgsAssignment_3_0 ) ) ;
    public final void rule__Tweets_entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2840:1: ( ( ( rule__Tweets_entity__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:2841:1: ( ( rule__Tweets_entity__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:2841:1: ( ( rule__Tweets_entity__ArgsAssignment_3_0 ) )
            // InternalTw.g:2842:2: ( rule__Tweets_entity__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:2843:2: ( rule__Tweets_entity__ArgsAssignment_3_0 )
            // InternalTw.g:2843:3: rule__Tweets_entity__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3__1"
    // InternalTw.g:2851:1: rule__Tweets_entity__Group_3__1 : rule__Tweets_entity__Group_3__1__Impl ;
    public final void rule__Tweets_entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2855:1: ( rule__Tweets_entity__Group_3__1__Impl )
            // InternalTw.g:2856:2: rule__Tweets_entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__1"


    // $ANTLR start "rule__Tweets_entity__Group_3__1__Impl"
    // InternalTw.g:2862:1: rule__Tweets_entity__Group_3__1__Impl : ( ( rule__Tweets_entity__Group_3_1__0 )* ) ;
    public final void rule__Tweets_entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2866:1: ( ( ( rule__Tweets_entity__Group_3_1__0 )* ) )
            // InternalTw.g:2867:1: ( ( rule__Tweets_entity__Group_3_1__0 )* )
            {
            // InternalTw.g:2867:1: ( ( rule__Tweets_entity__Group_3_1__0 )* )
            // InternalTw.g:2868:2: ( rule__Tweets_entity__Group_3_1__0 )*
            {
             before(grammarAccess.getTweets_entityAccess().getGroup_3_1()); 
            // InternalTw.g:2869:2: ( rule__Tweets_entity__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTw.g:2869:3: rule__Tweets_entity__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Tweets_entity__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTweets_entityAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__1__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3_1__0"
    // InternalTw.g:2878:1: rule__Tweets_entity__Group_3_1__0 : rule__Tweets_entity__Group_3_1__0__Impl rule__Tweets_entity__Group_3_1__1 ;
    public final void rule__Tweets_entity__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2882:1: ( rule__Tweets_entity__Group_3_1__0__Impl rule__Tweets_entity__Group_3_1__1 )
            // InternalTw.g:2883:2: rule__Tweets_entity__Group_3_1__0__Impl rule__Tweets_entity__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Tweets_entity__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_1__0"


    // $ANTLR start "rule__Tweets_entity__Group_3_1__0__Impl"
    // InternalTw.g:2890:1: rule__Tweets_entity__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_entity__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2894:1: ( ( ',' ) )
            // InternalTw.g:2895:1: ( ',' )
            {
            // InternalTw.g:2895:1: ( ',' )
            // InternalTw.g:2896:2: ','
            {
             before(grammarAccess.getTweets_entityAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_1__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3_1__1"
    // InternalTw.g:2905:1: rule__Tweets_entity__Group_3_1__1 : rule__Tweets_entity__Group_3_1__1__Impl ;
    public final void rule__Tweets_entity__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2909:1: ( rule__Tweets_entity__Group_3_1__1__Impl )
            // InternalTw.g:2910:2: rule__Tweets_entity__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_1__1"


    // $ANTLR start "rule__Tweets_entity__Group_3_1__1__Impl"
    // InternalTw.g:2916:1: rule__Tweets_entity__Group_3_1__1__Impl : ( ( rule__Tweets_entity__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Tweets_entity__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2920:1: ( ( ( rule__Tweets_entity__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:2921:1: ( ( rule__Tweets_entity__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:2921:1: ( ( rule__Tweets_entity__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:2922:2: ( rule__Tweets_entity__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:2923:2: ( rule__Tweets_entity__ArgsAssignment_3_1_1 )
            // InternalTw.g:2923:3: rule__Tweets_entity__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_1__1__Impl"


    // $ANTLR start "rule__Tweets_date__Group__0"
    // InternalTw.g:2932:1: rule__Tweets_date__Group__0 : rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1 ;
    public final void rule__Tweets_date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2936:1: ( rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1 )
            // InternalTw.g:2937:2: rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Tweets_date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__0"


    // $ANTLR start "rule__Tweets_date__Group__0__Impl"
    // InternalTw.g:2944:1: rule__Tweets_date__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2948:1: ( ( () ) )
            // InternalTw.g:2949:1: ( () )
            {
            // InternalTw.g:2949:1: ( () )
            // InternalTw.g:2950:2: ()
            {
             before(grammarAccess.getTweets_dateAccess().getTweets_dateAction_0()); 
            // InternalTw.g:2951:2: ()
            // InternalTw.g:2951:3: 
            {
            }

             after(grammarAccess.getTweets_dateAccess().getTweets_dateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group__1"
    // InternalTw.g:2959:1: rule__Tweets_date__Group__1 : rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2 ;
    public final void rule__Tweets_date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2963:1: ( rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2 )
            // InternalTw.g:2964:2: rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tweets_date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__1"


    // $ANTLR start "rule__Tweets_date__Group__1__Impl"
    // InternalTw.g:2971:1: rule__Tweets_date__Group__1__Impl : ( 'tweets_date' ) ;
    public final void rule__Tweets_date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2975:1: ( ( 'tweets_date' ) )
            // InternalTw.g:2976:1: ( 'tweets_date' )
            {
            // InternalTw.g:2976:1: ( 'tweets_date' )
            // InternalTw.g:2977:2: 'tweets_date'
            {
             before(grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__1__Impl"


    // $ANTLR start "rule__Tweets_date__Group__2"
    // InternalTw.g:2986:1: rule__Tweets_date__Group__2 : rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3 ;
    public final void rule__Tweets_date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2990:1: ( rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3 )
            // InternalTw.g:2991:2: rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__2"


    // $ANTLR start "rule__Tweets_date__Group__2__Impl"
    // InternalTw.g:2998:1: rule__Tweets_date__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3002:1: ( ( '{' ) )
            // InternalTw.g:3003:1: ( '{' )
            {
            // InternalTw.g:3003:1: ( '{' )
            // InternalTw.g:3004:2: '{'
            {
             before(grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__2__Impl"


    // $ANTLR start "rule__Tweets_date__Group__3"
    // InternalTw.g:3013:1: rule__Tweets_date__Group__3 : rule__Tweets_date__Group__3__Impl rule__Tweets_date__Group__4 ;
    public final void rule__Tweets_date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3017:1: ( rule__Tweets_date__Group__3__Impl rule__Tweets_date__Group__4 )
            // InternalTw.g:3018:2: rule__Tweets_date__Group__3__Impl rule__Tweets_date__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Tweets_date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__3"


    // $ANTLR start "rule__Tweets_date__Group__3__Impl"
    // InternalTw.g:3025:1: rule__Tweets_date__Group__3__Impl : ( ( rule__Tweets_date__Group_3__0 )? ) ;
    public final void rule__Tweets_date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3029:1: ( ( ( rule__Tweets_date__Group_3__0 )? ) )
            // InternalTw.g:3030:1: ( ( rule__Tweets_date__Group_3__0 )? )
            {
            // InternalTw.g:3030:1: ( ( rule__Tweets_date__Group_3__0 )? )
            // InternalTw.g:3031:2: ( rule__Tweets_date__Group_3__0 )?
            {
             before(grammarAccess.getTweets_dateAccess().getGroup_3()); 
            // InternalTw.g:3032:2: ( rule__Tweets_date__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==20||(LA16_0>=22 && LA16_0<=36)||(LA16_0>=38 && LA16_0<=39)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTw.g:3032:3: rule__Tweets_date__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tweets_date__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTweets_dateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__3__Impl"


    // $ANTLR start "rule__Tweets_date__Group__4"
    // InternalTw.g:3040:1: rule__Tweets_date__Group__4 : rule__Tweets_date__Group__4__Impl ;
    public final void rule__Tweets_date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3044:1: ( rule__Tweets_date__Group__4__Impl )
            // InternalTw.g:3045:2: rule__Tweets_date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__4"


    // $ANTLR start "rule__Tweets_date__Group__4__Impl"
    // InternalTw.g:3051:1: rule__Tweets_date__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3055:1: ( ( '}' ) )
            // InternalTw.g:3056:1: ( '}' )
            {
            // InternalTw.g:3056:1: ( '}' )
            // InternalTw.g:3057:2: '}'
            {
             before(grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group__4__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3__0"
    // InternalTw.g:3067:1: rule__Tweets_date__Group_3__0 : rule__Tweets_date__Group_3__0__Impl rule__Tweets_date__Group_3__1 ;
    public final void rule__Tweets_date__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3071:1: ( rule__Tweets_date__Group_3__0__Impl rule__Tweets_date__Group_3__1 )
            // InternalTw.g:3072:2: rule__Tweets_date__Group_3__0__Impl rule__Tweets_date__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_date__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__0"


    // $ANTLR start "rule__Tweets_date__Group_3__0__Impl"
    // InternalTw.g:3079:1: rule__Tweets_date__Group_3__0__Impl : ( ( rule__Tweets_date__ArgsAssignment_3_0 ) ) ;
    public final void rule__Tweets_date__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3083:1: ( ( ( rule__Tweets_date__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:3084:1: ( ( rule__Tweets_date__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:3084:1: ( ( rule__Tweets_date__ArgsAssignment_3_0 ) )
            // InternalTw.g:3085:2: ( rule__Tweets_date__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:3086:2: ( rule__Tweets_date__ArgsAssignment_3_0 )
            // InternalTw.g:3086:3: rule__Tweets_date__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3__1"
    // InternalTw.g:3094:1: rule__Tweets_date__Group_3__1 : rule__Tweets_date__Group_3__1__Impl ;
    public final void rule__Tweets_date__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3098:1: ( rule__Tweets_date__Group_3__1__Impl )
            // InternalTw.g:3099:2: rule__Tweets_date__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__1"


    // $ANTLR start "rule__Tweets_date__Group_3__1__Impl"
    // InternalTw.g:3105:1: rule__Tweets_date__Group_3__1__Impl : ( ( rule__Tweets_date__Group_3_1__0 )* ) ;
    public final void rule__Tweets_date__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3109:1: ( ( ( rule__Tweets_date__Group_3_1__0 )* ) )
            // InternalTw.g:3110:1: ( ( rule__Tweets_date__Group_3_1__0 )* )
            {
            // InternalTw.g:3110:1: ( ( rule__Tweets_date__Group_3_1__0 )* )
            // InternalTw.g:3111:2: ( rule__Tweets_date__Group_3_1__0 )*
            {
             before(grammarAccess.getTweets_dateAccess().getGroup_3_1()); 
            // InternalTw.g:3112:2: ( rule__Tweets_date__Group_3_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTw.g:3112:3: rule__Tweets_date__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Tweets_date__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTweets_dateAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__1__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3_1__0"
    // InternalTw.g:3121:1: rule__Tweets_date__Group_3_1__0 : rule__Tweets_date__Group_3_1__0__Impl rule__Tweets_date__Group_3_1__1 ;
    public final void rule__Tweets_date__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3125:1: ( rule__Tweets_date__Group_3_1__0__Impl rule__Tweets_date__Group_3_1__1 )
            // InternalTw.g:3126:2: rule__Tweets_date__Group_3_1__0__Impl rule__Tweets_date__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Tweets_date__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_1__0"


    // $ANTLR start "rule__Tweets_date__Group_3_1__0__Impl"
    // InternalTw.g:3133:1: rule__Tweets_date__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_date__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3137:1: ( ( ',' ) )
            // InternalTw.g:3138:1: ( ',' )
            {
            // InternalTw.g:3138:1: ( ',' )
            // InternalTw.g:3139:2: ','
            {
             before(grammarAccess.getTweets_dateAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_1__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3_1__1"
    // InternalTw.g:3148:1: rule__Tweets_date__Group_3_1__1 : rule__Tweets_date__Group_3_1__1__Impl ;
    public final void rule__Tweets_date__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3152:1: ( rule__Tweets_date__Group_3_1__1__Impl )
            // InternalTw.g:3153:2: rule__Tweets_date__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_1__1"


    // $ANTLR start "rule__Tweets_date__Group_3_1__1__Impl"
    // InternalTw.g:3159:1: rule__Tweets_date__Group_3_1__1__Impl : ( ( rule__Tweets_date__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Tweets_date__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3163:1: ( ( ( rule__Tweets_date__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:3164:1: ( ( rule__Tweets_date__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:3164:1: ( ( rule__Tweets_date__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:3165:2: ( rule__Tweets_date__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:3166:2: ( rule__Tweets_date__ArgsAssignment_3_1_1 )
            // InternalTw.g:3166:3: rule__Tweets_date__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_1__1__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__0"
    // InternalTw.g:3175:1: rule__ProportionPositif__Group__0 : rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1 ;
    public final void rule__ProportionPositif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3179:1: ( rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1 )
            // InternalTw.g:3180:2: rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ProportionPositif__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__0"


    // $ANTLR start "rule__ProportionPositif__Group__0__Impl"
    // InternalTw.g:3187:1: rule__ProportionPositif__Group__0__Impl : ( () ) ;
    public final void rule__ProportionPositif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3191:1: ( ( () ) )
            // InternalTw.g:3192:1: ( () )
            {
            // InternalTw.g:3192:1: ( () )
            // InternalTw.g:3193:2: ()
            {
             before(grammarAccess.getProportionPositifAccess().getProportionPositifAction_0()); 
            // InternalTw.g:3194:2: ()
            // InternalTw.g:3194:3: 
            {
            }

             after(grammarAccess.getProportionPositifAccess().getProportionPositifAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__1"
    // InternalTw.g:3202:1: rule__ProportionPositif__Group__1 : rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2 ;
    public final void rule__ProportionPositif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3206:1: ( rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2 )
            // InternalTw.g:3207:2: rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProportionPositif__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__1"


    // $ANTLR start "rule__ProportionPositif__Group__1__Impl"
    // InternalTw.g:3214:1: rule__ProportionPositif__Group__1__Impl : ( 'ProportionPositif' ) ;
    public final void rule__ProportionPositif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3218:1: ( ( 'ProportionPositif' ) )
            // InternalTw.g:3219:1: ( 'ProportionPositif' )
            {
            // InternalTw.g:3219:1: ( 'ProportionPositif' )
            // InternalTw.g:3220:2: 'ProportionPositif'
            {
             before(grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__1__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__2"
    // InternalTw.g:3229:1: rule__ProportionPositif__Group__2 : rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3 ;
    public final void rule__ProportionPositif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3233:1: ( rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3 )
            // InternalTw.g:3234:2: rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ProportionPositif__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__2"


    // $ANTLR start "rule__ProportionPositif__Group__2__Impl"
    // InternalTw.g:3241:1: rule__ProportionPositif__Group__2__Impl : ( '{' ) ;
    public final void rule__ProportionPositif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3245:1: ( ( '{' ) )
            // InternalTw.g:3246:1: ( '{' )
            {
            // InternalTw.g:3246:1: ( '{' )
            // InternalTw.g:3247:2: '{'
            {
             before(grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__2__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__3"
    // InternalTw.g:3256:1: rule__ProportionPositif__Group__3 : rule__ProportionPositif__Group__3__Impl rule__ProportionPositif__Group__4 ;
    public final void rule__ProportionPositif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3260:1: ( rule__ProportionPositif__Group__3__Impl rule__ProportionPositif__Group__4 )
            // InternalTw.g:3261:2: rule__ProportionPositif__Group__3__Impl rule__ProportionPositif__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ProportionPositif__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__3"


    // $ANTLR start "rule__ProportionPositif__Group__3__Impl"
    // InternalTw.g:3268:1: rule__ProportionPositif__Group__3__Impl : ( ( rule__ProportionPositif__Group_3__0 )? ) ;
    public final void rule__ProportionPositif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3272:1: ( ( ( rule__ProportionPositif__Group_3__0 )? ) )
            // InternalTw.g:3273:1: ( ( rule__ProportionPositif__Group_3__0 )? )
            {
            // InternalTw.g:3273:1: ( ( rule__ProportionPositif__Group_3__0 )? )
            // InternalTw.g:3274:2: ( rule__ProportionPositif__Group_3__0 )?
            {
             before(grammarAccess.getProportionPositifAccess().getGroup_3()); 
            // InternalTw.g:3275:2: ( rule__ProportionPositif__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==20||(LA18_0>=22 && LA18_0<=36)||(LA18_0>=38 && LA18_0<=39)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTw.g:3275:3: rule__ProportionPositif__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProportionPositif__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProportionPositifAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__3__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__4"
    // InternalTw.g:3283:1: rule__ProportionPositif__Group__4 : rule__ProportionPositif__Group__4__Impl ;
    public final void rule__ProportionPositif__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3287:1: ( rule__ProportionPositif__Group__4__Impl )
            // InternalTw.g:3288:2: rule__ProportionPositif__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__4"


    // $ANTLR start "rule__ProportionPositif__Group__4__Impl"
    // InternalTw.g:3294:1: rule__ProportionPositif__Group__4__Impl : ( '}' ) ;
    public final void rule__ProportionPositif__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3298:1: ( ( '}' ) )
            // InternalTw.g:3299:1: ( '}' )
            {
            // InternalTw.g:3299:1: ( '}' )
            // InternalTw.g:3300:2: '}'
            {
             before(grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group__4__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3__0"
    // InternalTw.g:3310:1: rule__ProportionPositif__Group_3__0 : rule__ProportionPositif__Group_3__0__Impl rule__ProportionPositif__Group_3__1 ;
    public final void rule__ProportionPositif__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3314:1: ( rule__ProportionPositif__Group_3__0__Impl rule__ProportionPositif__Group_3__1 )
            // InternalTw.g:3315:2: rule__ProportionPositif__Group_3__0__Impl rule__ProportionPositif__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ProportionPositif__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__0"


    // $ANTLR start "rule__ProportionPositif__Group_3__0__Impl"
    // InternalTw.g:3322:1: rule__ProportionPositif__Group_3__0__Impl : ( ( rule__ProportionPositif__ArgsAssignment_3_0 ) ) ;
    public final void rule__ProportionPositif__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3326:1: ( ( ( rule__ProportionPositif__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:3327:1: ( ( rule__ProportionPositif__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:3327:1: ( ( rule__ProportionPositif__ArgsAssignment_3_0 ) )
            // InternalTw.g:3328:2: ( rule__ProportionPositif__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:3329:2: ( rule__ProportionPositif__ArgsAssignment_3_0 )
            // InternalTw.g:3329:3: rule__ProportionPositif__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3__1"
    // InternalTw.g:3337:1: rule__ProportionPositif__Group_3__1 : rule__ProportionPositif__Group_3__1__Impl ;
    public final void rule__ProportionPositif__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3341:1: ( rule__ProportionPositif__Group_3__1__Impl )
            // InternalTw.g:3342:2: rule__ProportionPositif__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__1"


    // $ANTLR start "rule__ProportionPositif__Group_3__1__Impl"
    // InternalTw.g:3348:1: rule__ProportionPositif__Group_3__1__Impl : ( ( rule__ProportionPositif__Group_3_1__0 )* ) ;
    public final void rule__ProportionPositif__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3352:1: ( ( ( rule__ProportionPositif__Group_3_1__0 )* ) )
            // InternalTw.g:3353:1: ( ( rule__ProportionPositif__Group_3_1__0 )* )
            {
            // InternalTw.g:3353:1: ( ( rule__ProportionPositif__Group_3_1__0 )* )
            // InternalTw.g:3354:2: ( rule__ProportionPositif__Group_3_1__0 )*
            {
             before(grammarAccess.getProportionPositifAccess().getGroup_3_1()); 
            // InternalTw.g:3355:2: ( rule__ProportionPositif__Group_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTw.g:3355:3: rule__ProportionPositif__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ProportionPositif__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProportionPositifAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__1__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3_1__0"
    // InternalTw.g:3364:1: rule__ProportionPositif__Group_3_1__0 : rule__ProportionPositif__Group_3_1__0__Impl rule__ProportionPositif__Group_3_1__1 ;
    public final void rule__ProportionPositif__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3368:1: ( rule__ProportionPositif__Group_3_1__0__Impl rule__ProportionPositif__Group_3_1__1 )
            // InternalTw.g:3369:2: rule__ProportionPositif__Group_3_1__0__Impl rule__ProportionPositif__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ProportionPositif__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_1__0"


    // $ANTLR start "rule__ProportionPositif__Group_3_1__0__Impl"
    // InternalTw.g:3376:1: rule__ProportionPositif__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ProportionPositif__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3380:1: ( ( ',' ) )
            // InternalTw.g:3381:1: ( ',' )
            {
            // InternalTw.g:3381:1: ( ',' )
            // InternalTw.g:3382:2: ','
            {
             before(grammarAccess.getProportionPositifAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_1__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3_1__1"
    // InternalTw.g:3391:1: rule__ProportionPositif__Group_3_1__1 : rule__ProportionPositif__Group_3_1__1__Impl ;
    public final void rule__ProportionPositif__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3395:1: ( rule__ProportionPositif__Group_3_1__1__Impl )
            // InternalTw.g:3396:2: rule__ProportionPositif__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_1__1"


    // $ANTLR start "rule__ProportionPositif__Group_3_1__1__Impl"
    // InternalTw.g:3402:1: rule__ProportionPositif__Group_3_1__1__Impl : ( ( rule__ProportionPositif__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__ProportionPositif__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3406:1: ( ( ( rule__ProportionPositif__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:3407:1: ( ( rule__ProportionPositif__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:3407:1: ( ( rule__ProportionPositif__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:3408:2: ( rule__ProportionPositif__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:3409:2: ( rule__ProportionPositif__ArgsAssignment_3_1_1 )
            // InternalTw.g:3409:3: rule__ProportionPositif__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_1__1__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__0"
    // InternalTw.g:3418:1: rule__ProportionNegatif__Group__0 : rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1 ;
    public final void rule__ProportionNegatif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3422:1: ( rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1 )
            // InternalTw.g:3423:2: rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ProportionNegatif__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__0"


    // $ANTLR start "rule__ProportionNegatif__Group__0__Impl"
    // InternalTw.g:3430:1: rule__ProportionNegatif__Group__0__Impl : ( () ) ;
    public final void rule__ProportionNegatif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3434:1: ( ( () ) )
            // InternalTw.g:3435:1: ( () )
            {
            // InternalTw.g:3435:1: ( () )
            // InternalTw.g:3436:2: ()
            {
             before(grammarAccess.getProportionNegatifAccess().getProportionNegatifAction_0()); 
            // InternalTw.g:3437:2: ()
            // InternalTw.g:3437:3: 
            {
            }

             after(grammarAccess.getProportionNegatifAccess().getProportionNegatifAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__1"
    // InternalTw.g:3445:1: rule__ProportionNegatif__Group__1 : rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2 ;
    public final void rule__ProportionNegatif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3449:1: ( rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2 )
            // InternalTw.g:3450:2: rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProportionNegatif__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__1"


    // $ANTLR start "rule__ProportionNegatif__Group__1__Impl"
    // InternalTw.g:3457:1: rule__ProportionNegatif__Group__1__Impl : ( 'ProportionNegatif' ) ;
    public final void rule__ProportionNegatif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3461:1: ( ( 'ProportionNegatif' ) )
            // InternalTw.g:3462:1: ( 'ProportionNegatif' )
            {
            // InternalTw.g:3462:1: ( 'ProportionNegatif' )
            // InternalTw.g:3463:2: 'ProportionNegatif'
            {
             before(grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__1__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__2"
    // InternalTw.g:3472:1: rule__ProportionNegatif__Group__2 : rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3 ;
    public final void rule__ProportionNegatif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3476:1: ( rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3 )
            // InternalTw.g:3477:2: rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ProportionNegatif__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__2"


    // $ANTLR start "rule__ProportionNegatif__Group__2__Impl"
    // InternalTw.g:3484:1: rule__ProportionNegatif__Group__2__Impl : ( '{' ) ;
    public final void rule__ProportionNegatif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3488:1: ( ( '{' ) )
            // InternalTw.g:3489:1: ( '{' )
            {
            // InternalTw.g:3489:1: ( '{' )
            // InternalTw.g:3490:2: '{'
            {
             before(grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__2__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__3"
    // InternalTw.g:3499:1: rule__ProportionNegatif__Group__3 : rule__ProportionNegatif__Group__3__Impl rule__ProportionNegatif__Group__4 ;
    public final void rule__ProportionNegatif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3503:1: ( rule__ProportionNegatif__Group__3__Impl rule__ProportionNegatif__Group__4 )
            // InternalTw.g:3504:2: rule__ProportionNegatif__Group__3__Impl rule__ProportionNegatif__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ProportionNegatif__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__3"


    // $ANTLR start "rule__ProportionNegatif__Group__3__Impl"
    // InternalTw.g:3511:1: rule__ProportionNegatif__Group__3__Impl : ( ( rule__ProportionNegatif__Group_3__0 )? ) ;
    public final void rule__ProportionNegatif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3515:1: ( ( ( rule__ProportionNegatif__Group_3__0 )? ) )
            // InternalTw.g:3516:1: ( ( rule__ProportionNegatif__Group_3__0 )? )
            {
            // InternalTw.g:3516:1: ( ( rule__ProportionNegatif__Group_3__0 )? )
            // InternalTw.g:3517:2: ( rule__ProportionNegatif__Group_3__0 )?
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup_3()); 
            // InternalTw.g:3518:2: ( rule__ProportionNegatif__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==20||(LA20_0>=22 && LA20_0<=36)||(LA20_0>=38 && LA20_0<=39)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTw.g:3518:3: rule__ProportionNegatif__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProportionNegatif__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProportionNegatifAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__3__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__4"
    // InternalTw.g:3526:1: rule__ProportionNegatif__Group__4 : rule__ProportionNegatif__Group__4__Impl ;
    public final void rule__ProportionNegatif__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3530:1: ( rule__ProportionNegatif__Group__4__Impl )
            // InternalTw.g:3531:2: rule__ProportionNegatif__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__4"


    // $ANTLR start "rule__ProportionNegatif__Group__4__Impl"
    // InternalTw.g:3537:1: rule__ProportionNegatif__Group__4__Impl : ( '}' ) ;
    public final void rule__ProportionNegatif__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3541:1: ( ( '}' ) )
            // InternalTw.g:3542:1: ( '}' )
            {
            // InternalTw.g:3542:1: ( '}' )
            // InternalTw.g:3543:2: '}'
            {
             before(grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group__4__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3__0"
    // InternalTw.g:3553:1: rule__ProportionNegatif__Group_3__0 : rule__ProportionNegatif__Group_3__0__Impl rule__ProportionNegatif__Group_3__1 ;
    public final void rule__ProportionNegatif__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3557:1: ( rule__ProportionNegatif__Group_3__0__Impl rule__ProportionNegatif__Group_3__1 )
            // InternalTw.g:3558:2: rule__ProportionNegatif__Group_3__0__Impl rule__ProportionNegatif__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ProportionNegatif__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__0"


    // $ANTLR start "rule__ProportionNegatif__Group_3__0__Impl"
    // InternalTw.g:3565:1: rule__ProportionNegatif__Group_3__0__Impl : ( ( rule__ProportionNegatif__ArgsAssignment_3_0 ) ) ;
    public final void rule__ProportionNegatif__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3569:1: ( ( ( rule__ProportionNegatif__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:3570:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:3570:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_0 ) )
            // InternalTw.g:3571:2: ( rule__ProportionNegatif__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:3572:2: ( rule__ProportionNegatif__ArgsAssignment_3_0 )
            // InternalTw.g:3572:3: rule__ProportionNegatif__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3__1"
    // InternalTw.g:3580:1: rule__ProportionNegatif__Group_3__1 : rule__ProportionNegatif__Group_3__1__Impl ;
    public final void rule__ProportionNegatif__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3584:1: ( rule__ProportionNegatif__Group_3__1__Impl )
            // InternalTw.g:3585:2: rule__ProportionNegatif__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__1"


    // $ANTLR start "rule__ProportionNegatif__Group_3__1__Impl"
    // InternalTw.g:3591:1: rule__ProportionNegatif__Group_3__1__Impl : ( ( rule__ProportionNegatif__Group_3_1__0 )* ) ;
    public final void rule__ProportionNegatif__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3595:1: ( ( ( rule__ProportionNegatif__Group_3_1__0 )* ) )
            // InternalTw.g:3596:1: ( ( rule__ProportionNegatif__Group_3_1__0 )* )
            {
            // InternalTw.g:3596:1: ( ( rule__ProportionNegatif__Group_3_1__0 )* )
            // InternalTw.g:3597:2: ( rule__ProportionNegatif__Group_3_1__0 )*
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup_3_1()); 
            // InternalTw.g:3598:2: ( rule__ProportionNegatif__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTw.g:3598:3: rule__ProportionNegatif__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ProportionNegatif__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProportionNegatifAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__1__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3_1__0"
    // InternalTw.g:3607:1: rule__ProportionNegatif__Group_3_1__0 : rule__ProportionNegatif__Group_3_1__0__Impl rule__ProportionNegatif__Group_3_1__1 ;
    public final void rule__ProportionNegatif__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3611:1: ( rule__ProportionNegatif__Group_3_1__0__Impl rule__ProportionNegatif__Group_3_1__1 )
            // InternalTw.g:3612:2: rule__ProportionNegatif__Group_3_1__0__Impl rule__ProportionNegatif__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ProportionNegatif__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_1__0"


    // $ANTLR start "rule__ProportionNegatif__Group_3_1__0__Impl"
    // InternalTw.g:3619:1: rule__ProportionNegatif__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ProportionNegatif__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3623:1: ( ( ',' ) )
            // InternalTw.g:3624:1: ( ',' )
            {
            // InternalTw.g:3624:1: ( ',' )
            // InternalTw.g:3625:2: ','
            {
             before(grammarAccess.getProportionNegatifAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_1__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3_1__1"
    // InternalTw.g:3634:1: rule__ProportionNegatif__Group_3_1__1 : rule__ProportionNegatif__Group_3_1__1__Impl ;
    public final void rule__ProportionNegatif__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3638:1: ( rule__ProportionNegatif__Group_3_1__1__Impl )
            // InternalTw.g:3639:2: rule__ProportionNegatif__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_1__1"


    // $ANTLR start "rule__ProportionNegatif__Group_3_1__1__Impl"
    // InternalTw.g:3645:1: rule__ProportionNegatif__Group_3_1__1__Impl : ( ( rule__ProportionNegatif__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__ProportionNegatif__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3649:1: ( ( ( rule__ProportionNegatif__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:3650:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:3650:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:3651:2: ( rule__ProportionNegatif__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:3652:2: ( rule__ProportionNegatif__ArgsAssignment_3_1_1 )
            // InternalTw.g:3652:3: rule__ProportionNegatif__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_1__1__Impl"


    // $ANTLR start "rule__CountTweet__Group__0"
    // InternalTw.g:3661:1: rule__CountTweet__Group__0 : rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1 ;
    public final void rule__CountTweet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3665:1: ( rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1 )
            // InternalTw.g:3666:2: rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CountTweet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__0"


    // $ANTLR start "rule__CountTweet__Group__0__Impl"
    // InternalTw.g:3673:1: rule__CountTweet__Group__0__Impl : ( () ) ;
    public final void rule__CountTweet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3677:1: ( ( () ) )
            // InternalTw.g:3678:1: ( () )
            {
            // InternalTw.g:3678:1: ( () )
            // InternalTw.g:3679:2: ()
            {
             before(grammarAccess.getCountTweetAccess().getCountTweetAction_0()); 
            // InternalTw.g:3680:2: ()
            // InternalTw.g:3680:3: 
            {
            }

             after(grammarAccess.getCountTweetAccess().getCountTweetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__0__Impl"


    // $ANTLR start "rule__CountTweet__Group__1"
    // InternalTw.g:3688:1: rule__CountTweet__Group__1 : rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2 ;
    public final void rule__CountTweet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3692:1: ( rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2 )
            // InternalTw.g:3693:2: rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CountTweet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__1"


    // $ANTLR start "rule__CountTweet__Group__1__Impl"
    // InternalTw.g:3700:1: rule__CountTweet__Group__1__Impl : ( 'countTweet' ) ;
    public final void rule__CountTweet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3704:1: ( ( 'countTweet' ) )
            // InternalTw.g:3705:1: ( 'countTweet' )
            {
            // InternalTw.g:3705:1: ( 'countTweet' )
            // InternalTw.g:3706:2: 'countTweet'
            {
             before(grammarAccess.getCountTweetAccess().getCountTweetKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getCountTweetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__1__Impl"


    // $ANTLR start "rule__CountTweet__Group__2"
    // InternalTw.g:3715:1: rule__CountTweet__Group__2 : rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3 ;
    public final void rule__CountTweet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3719:1: ( rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3 )
            // InternalTw.g:3720:2: rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CountTweet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__2"


    // $ANTLR start "rule__CountTweet__Group__2__Impl"
    // InternalTw.g:3727:1: rule__CountTweet__Group__2__Impl : ( '{' ) ;
    public final void rule__CountTweet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3731:1: ( ( '{' ) )
            // InternalTw.g:3732:1: ( '{' )
            {
            // InternalTw.g:3732:1: ( '{' )
            // InternalTw.g:3733:2: '{'
            {
             before(grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__2__Impl"


    // $ANTLR start "rule__CountTweet__Group__3"
    // InternalTw.g:3742:1: rule__CountTweet__Group__3 : rule__CountTweet__Group__3__Impl rule__CountTweet__Group__4 ;
    public final void rule__CountTweet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3746:1: ( rule__CountTweet__Group__3__Impl rule__CountTweet__Group__4 )
            // InternalTw.g:3747:2: rule__CountTweet__Group__3__Impl rule__CountTweet__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CountTweet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__3"


    // $ANTLR start "rule__CountTweet__Group__3__Impl"
    // InternalTw.g:3754:1: rule__CountTweet__Group__3__Impl : ( ( rule__CountTweet__Group_3__0 )? ) ;
    public final void rule__CountTweet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3758:1: ( ( ( rule__CountTweet__Group_3__0 )? ) )
            // InternalTw.g:3759:1: ( ( rule__CountTweet__Group_3__0 )? )
            {
            // InternalTw.g:3759:1: ( ( rule__CountTweet__Group_3__0 )? )
            // InternalTw.g:3760:2: ( rule__CountTweet__Group_3__0 )?
            {
             before(grammarAccess.getCountTweetAccess().getGroup_3()); 
            // InternalTw.g:3761:2: ( rule__CountTweet__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==20||(LA22_0>=22 && LA22_0<=36)||(LA22_0>=38 && LA22_0<=39)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTw.g:3761:3: rule__CountTweet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountTweet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountTweetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__3__Impl"


    // $ANTLR start "rule__CountTweet__Group__4"
    // InternalTw.g:3769:1: rule__CountTweet__Group__4 : rule__CountTweet__Group__4__Impl ;
    public final void rule__CountTweet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3773:1: ( rule__CountTweet__Group__4__Impl )
            // InternalTw.g:3774:2: rule__CountTweet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__4"


    // $ANTLR start "rule__CountTweet__Group__4__Impl"
    // InternalTw.g:3780:1: rule__CountTweet__Group__4__Impl : ( '}' ) ;
    public final void rule__CountTweet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3784:1: ( ( '}' ) )
            // InternalTw.g:3785:1: ( '}' )
            {
            // InternalTw.g:3785:1: ( '}' )
            // InternalTw.g:3786:2: '}'
            {
             before(grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group__4__Impl"


    // $ANTLR start "rule__CountTweet__Group_3__0"
    // InternalTw.g:3796:1: rule__CountTweet__Group_3__0 : rule__CountTweet__Group_3__0__Impl rule__CountTweet__Group_3__1 ;
    public final void rule__CountTweet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3800:1: ( rule__CountTweet__Group_3__0__Impl rule__CountTweet__Group_3__1 )
            // InternalTw.g:3801:2: rule__CountTweet__Group_3__0__Impl rule__CountTweet__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__CountTweet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__0"


    // $ANTLR start "rule__CountTweet__Group_3__0__Impl"
    // InternalTw.g:3808:1: rule__CountTweet__Group_3__0__Impl : ( ( rule__CountTweet__ArgsAssignment_3_0 ) ) ;
    public final void rule__CountTweet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3812:1: ( ( ( rule__CountTweet__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:3813:1: ( ( rule__CountTweet__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:3813:1: ( ( rule__CountTweet__ArgsAssignment_3_0 ) )
            // InternalTw.g:3814:2: ( rule__CountTweet__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getCountTweetAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:3815:2: ( rule__CountTweet__ArgsAssignment_3_0 )
            // InternalTw.g:3815:3: rule__CountTweet__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__0__Impl"


    // $ANTLR start "rule__CountTweet__Group_3__1"
    // InternalTw.g:3823:1: rule__CountTweet__Group_3__1 : rule__CountTweet__Group_3__1__Impl ;
    public final void rule__CountTweet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3827:1: ( rule__CountTweet__Group_3__1__Impl )
            // InternalTw.g:3828:2: rule__CountTweet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__1"


    // $ANTLR start "rule__CountTweet__Group_3__1__Impl"
    // InternalTw.g:3834:1: rule__CountTweet__Group_3__1__Impl : ( ( rule__CountTweet__Group_3_1__0 )* ) ;
    public final void rule__CountTweet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3838:1: ( ( ( rule__CountTweet__Group_3_1__0 )* ) )
            // InternalTw.g:3839:1: ( ( rule__CountTweet__Group_3_1__0 )* )
            {
            // InternalTw.g:3839:1: ( ( rule__CountTweet__Group_3_1__0 )* )
            // InternalTw.g:3840:2: ( rule__CountTweet__Group_3_1__0 )*
            {
             before(grammarAccess.getCountTweetAccess().getGroup_3_1()); 
            // InternalTw.g:3841:2: ( rule__CountTweet__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTw.g:3841:3: rule__CountTweet__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CountTweet__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCountTweetAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__1__Impl"


    // $ANTLR start "rule__CountTweet__Group_3_1__0"
    // InternalTw.g:3850:1: rule__CountTweet__Group_3_1__0 : rule__CountTweet__Group_3_1__0__Impl rule__CountTweet__Group_3_1__1 ;
    public final void rule__CountTweet__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3854:1: ( rule__CountTweet__Group_3_1__0__Impl rule__CountTweet__Group_3_1__1 )
            // InternalTw.g:3855:2: rule__CountTweet__Group_3_1__0__Impl rule__CountTweet__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__CountTweet__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_1__0"


    // $ANTLR start "rule__CountTweet__Group_3_1__0__Impl"
    // InternalTw.g:3862:1: rule__CountTweet__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CountTweet__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3866:1: ( ( ',' ) )
            // InternalTw.g:3867:1: ( ',' )
            {
            // InternalTw.g:3867:1: ( ',' )
            // InternalTw.g:3868:2: ','
            {
             before(grammarAccess.getCountTweetAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_1__0__Impl"


    // $ANTLR start "rule__CountTweet__Group_3_1__1"
    // InternalTw.g:3877:1: rule__CountTweet__Group_3_1__1 : rule__CountTweet__Group_3_1__1__Impl ;
    public final void rule__CountTweet__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3881:1: ( rule__CountTweet__Group_3_1__1__Impl )
            // InternalTw.g:3882:2: rule__CountTweet__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_1__1"


    // $ANTLR start "rule__CountTweet__Group_3_1__1__Impl"
    // InternalTw.g:3888:1: rule__CountTweet__Group_3_1__1__Impl : ( ( rule__CountTweet__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__CountTweet__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3892:1: ( ( ( rule__CountTweet__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:3893:1: ( ( rule__CountTweet__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:3893:1: ( ( rule__CountTweet__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:3894:2: ( rule__CountTweet__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getCountTweetAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:3895:2: ( rule__CountTweet__ArgsAssignment_3_1_1 )
            // InternalTw.g:3895:3: rule__CountTweet__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_1__1__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__0"
    // InternalTw.g:3904:1: rule__CountVisitProfil__Group__0 : rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1 ;
    public final void rule__CountVisitProfil__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3908:1: ( rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1 )
            // InternalTw.g:3909:2: rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CountVisitProfil__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__0"


    // $ANTLR start "rule__CountVisitProfil__Group__0__Impl"
    // InternalTw.g:3916:1: rule__CountVisitProfil__Group__0__Impl : ( () ) ;
    public final void rule__CountVisitProfil__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3920:1: ( ( () ) )
            // InternalTw.g:3921:1: ( () )
            {
            // InternalTw.g:3921:1: ( () )
            // InternalTw.g:3922:2: ()
            {
             before(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilAction_0()); 
            // InternalTw.g:3923:2: ()
            // InternalTw.g:3923:3: 
            {
            }

             after(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__1"
    // InternalTw.g:3931:1: rule__CountVisitProfil__Group__1 : rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2 ;
    public final void rule__CountVisitProfil__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3935:1: ( rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2 )
            // InternalTw.g:3936:2: rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CountVisitProfil__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__1"


    // $ANTLR start "rule__CountVisitProfil__Group__1__Impl"
    // InternalTw.g:3943:1: rule__CountVisitProfil__Group__1__Impl : ( 'countVisitProfil' ) ;
    public final void rule__CountVisitProfil__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3947:1: ( ( 'countVisitProfil' ) )
            // InternalTw.g:3948:1: ( 'countVisitProfil' )
            {
            // InternalTw.g:3948:1: ( 'countVisitProfil' )
            // InternalTw.g:3949:2: 'countVisitProfil'
            {
             before(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__1__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__2"
    // InternalTw.g:3958:1: rule__CountVisitProfil__Group__2 : rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3 ;
    public final void rule__CountVisitProfil__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3962:1: ( rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3 )
            // InternalTw.g:3963:2: rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CountVisitProfil__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__2"


    // $ANTLR start "rule__CountVisitProfil__Group__2__Impl"
    // InternalTw.g:3970:1: rule__CountVisitProfil__Group__2__Impl : ( '{' ) ;
    public final void rule__CountVisitProfil__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3974:1: ( ( '{' ) )
            // InternalTw.g:3975:1: ( '{' )
            {
            // InternalTw.g:3975:1: ( '{' )
            // InternalTw.g:3976:2: '{'
            {
             before(grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__2__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__3"
    // InternalTw.g:3985:1: rule__CountVisitProfil__Group__3 : rule__CountVisitProfil__Group__3__Impl rule__CountVisitProfil__Group__4 ;
    public final void rule__CountVisitProfil__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3989:1: ( rule__CountVisitProfil__Group__3__Impl rule__CountVisitProfil__Group__4 )
            // InternalTw.g:3990:2: rule__CountVisitProfil__Group__3__Impl rule__CountVisitProfil__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CountVisitProfil__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__3"


    // $ANTLR start "rule__CountVisitProfil__Group__3__Impl"
    // InternalTw.g:3997:1: rule__CountVisitProfil__Group__3__Impl : ( ( rule__CountVisitProfil__Group_3__0 )? ) ;
    public final void rule__CountVisitProfil__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4001:1: ( ( ( rule__CountVisitProfil__Group_3__0 )? ) )
            // InternalTw.g:4002:1: ( ( rule__CountVisitProfil__Group_3__0 )? )
            {
            // InternalTw.g:4002:1: ( ( rule__CountVisitProfil__Group_3__0 )? )
            // InternalTw.g:4003:2: ( rule__CountVisitProfil__Group_3__0 )?
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup_3()); 
            // InternalTw.g:4004:2: ( rule__CountVisitProfil__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==20||(LA24_0>=22 && LA24_0<=36)||(LA24_0>=38 && LA24_0<=39)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTw.g:4004:3: rule__CountVisitProfil__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountVisitProfil__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountVisitProfilAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__3__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__4"
    // InternalTw.g:4012:1: rule__CountVisitProfil__Group__4 : rule__CountVisitProfil__Group__4__Impl ;
    public final void rule__CountVisitProfil__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4016:1: ( rule__CountVisitProfil__Group__4__Impl )
            // InternalTw.g:4017:2: rule__CountVisitProfil__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__4"


    // $ANTLR start "rule__CountVisitProfil__Group__4__Impl"
    // InternalTw.g:4023:1: rule__CountVisitProfil__Group__4__Impl : ( '}' ) ;
    public final void rule__CountVisitProfil__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4027:1: ( ( '}' ) )
            // InternalTw.g:4028:1: ( '}' )
            {
            // InternalTw.g:4028:1: ( '}' )
            // InternalTw.g:4029:2: '}'
            {
             before(grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group__4__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3__0"
    // InternalTw.g:4039:1: rule__CountVisitProfil__Group_3__0 : rule__CountVisitProfil__Group_3__0__Impl rule__CountVisitProfil__Group_3__1 ;
    public final void rule__CountVisitProfil__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4043:1: ( rule__CountVisitProfil__Group_3__0__Impl rule__CountVisitProfil__Group_3__1 )
            // InternalTw.g:4044:2: rule__CountVisitProfil__Group_3__0__Impl rule__CountVisitProfil__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__CountVisitProfil__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__0"


    // $ANTLR start "rule__CountVisitProfil__Group_3__0__Impl"
    // InternalTw.g:4051:1: rule__CountVisitProfil__Group_3__0__Impl : ( ( rule__CountVisitProfil__ArgsAssignment_3_0 ) ) ;
    public final void rule__CountVisitProfil__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4055:1: ( ( ( rule__CountVisitProfil__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:4056:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:4056:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_0 ) )
            // InternalTw.g:4057:2: ( rule__CountVisitProfil__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:4058:2: ( rule__CountVisitProfil__ArgsAssignment_3_0 )
            // InternalTw.g:4058:3: rule__CountVisitProfil__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3__1"
    // InternalTw.g:4066:1: rule__CountVisitProfil__Group_3__1 : rule__CountVisitProfil__Group_3__1__Impl ;
    public final void rule__CountVisitProfil__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4070:1: ( rule__CountVisitProfil__Group_3__1__Impl )
            // InternalTw.g:4071:2: rule__CountVisitProfil__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__1"


    // $ANTLR start "rule__CountVisitProfil__Group_3__1__Impl"
    // InternalTw.g:4077:1: rule__CountVisitProfil__Group_3__1__Impl : ( ( rule__CountVisitProfil__Group_3_1__0 )* ) ;
    public final void rule__CountVisitProfil__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4081:1: ( ( ( rule__CountVisitProfil__Group_3_1__0 )* ) )
            // InternalTw.g:4082:1: ( ( rule__CountVisitProfil__Group_3_1__0 )* )
            {
            // InternalTw.g:4082:1: ( ( rule__CountVisitProfil__Group_3_1__0 )* )
            // InternalTw.g:4083:2: ( rule__CountVisitProfil__Group_3_1__0 )*
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup_3_1()); 
            // InternalTw.g:4084:2: ( rule__CountVisitProfil__Group_3_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTw.g:4084:3: rule__CountVisitProfil__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CountVisitProfil__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCountVisitProfilAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__1__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3_1__0"
    // InternalTw.g:4093:1: rule__CountVisitProfil__Group_3_1__0 : rule__CountVisitProfil__Group_3_1__0__Impl rule__CountVisitProfil__Group_3_1__1 ;
    public final void rule__CountVisitProfil__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4097:1: ( rule__CountVisitProfil__Group_3_1__0__Impl rule__CountVisitProfil__Group_3_1__1 )
            // InternalTw.g:4098:2: rule__CountVisitProfil__Group_3_1__0__Impl rule__CountVisitProfil__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__CountVisitProfil__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_1__0"


    // $ANTLR start "rule__CountVisitProfil__Group_3_1__0__Impl"
    // InternalTw.g:4105:1: rule__CountVisitProfil__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CountVisitProfil__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4109:1: ( ( ',' ) )
            // InternalTw.g:4110:1: ( ',' )
            {
            // InternalTw.g:4110:1: ( ',' )
            // InternalTw.g:4111:2: ','
            {
             before(grammarAccess.getCountVisitProfilAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_1__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3_1__1"
    // InternalTw.g:4120:1: rule__CountVisitProfil__Group_3_1__1 : rule__CountVisitProfil__Group_3_1__1__Impl ;
    public final void rule__CountVisitProfil__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4124:1: ( rule__CountVisitProfil__Group_3_1__1__Impl )
            // InternalTw.g:4125:2: rule__CountVisitProfil__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_1__1"


    // $ANTLR start "rule__CountVisitProfil__Group_3_1__1__Impl"
    // InternalTw.g:4131:1: rule__CountVisitProfil__Group_3_1__1__Impl : ( ( rule__CountVisitProfil__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__CountVisitProfil__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4135:1: ( ( ( rule__CountVisitProfil__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:4136:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:4136:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:4137:2: ( rule__CountVisitProfil__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:4138:2: ( rule__CountVisitProfil__ArgsAssignment_3_1_1 )
            // InternalTw.g:4138:3: rule__CountVisitProfil__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_1__1__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__0"
    // InternalTw.g:4147:1: rule__CroissanceAbonne__Group__0 : rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1 ;
    public final void rule__CroissanceAbonne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4151:1: ( rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1 )
            // InternalTw.g:4152:2: rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__CroissanceAbonne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__0"


    // $ANTLR start "rule__CroissanceAbonne__Group__0__Impl"
    // InternalTw.g:4159:1: rule__CroissanceAbonne__Group__0__Impl : ( () ) ;
    public final void rule__CroissanceAbonne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4163:1: ( ( () ) )
            // InternalTw.g:4164:1: ( () )
            {
            // InternalTw.g:4164:1: ( () )
            // InternalTw.g:4165:2: ()
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneAction_0()); 
            // InternalTw.g:4166:2: ()
            // InternalTw.g:4166:3: 
            {
            }

             after(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__1"
    // InternalTw.g:4174:1: rule__CroissanceAbonne__Group__1 : rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2 ;
    public final void rule__CroissanceAbonne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4178:1: ( rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2 )
            // InternalTw.g:4179:2: rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CroissanceAbonne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__1"


    // $ANTLR start "rule__CroissanceAbonne__Group__1__Impl"
    // InternalTw.g:4186:1: rule__CroissanceAbonne__Group__1__Impl : ( 'CroissanceAbonne' ) ;
    public final void rule__CroissanceAbonne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4190:1: ( ( 'CroissanceAbonne' ) )
            // InternalTw.g:4191:1: ( 'CroissanceAbonne' )
            {
            // InternalTw.g:4191:1: ( 'CroissanceAbonne' )
            // InternalTw.g:4192:2: 'CroissanceAbonne'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__1__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__2"
    // InternalTw.g:4201:1: rule__CroissanceAbonne__Group__2 : rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3 ;
    public final void rule__CroissanceAbonne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4205:1: ( rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3 )
            // InternalTw.g:4206:2: rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CroissanceAbonne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__2"


    // $ANTLR start "rule__CroissanceAbonne__Group__2__Impl"
    // InternalTw.g:4213:1: rule__CroissanceAbonne__Group__2__Impl : ( '{' ) ;
    public final void rule__CroissanceAbonne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4217:1: ( ( '{' ) )
            // InternalTw.g:4218:1: ( '{' )
            {
            // InternalTw.g:4218:1: ( '{' )
            // InternalTw.g:4219:2: '{'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__2__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__3"
    // InternalTw.g:4228:1: rule__CroissanceAbonne__Group__3 : rule__CroissanceAbonne__Group__3__Impl rule__CroissanceAbonne__Group__4 ;
    public final void rule__CroissanceAbonne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4232:1: ( rule__CroissanceAbonne__Group__3__Impl rule__CroissanceAbonne__Group__4 )
            // InternalTw.g:4233:2: rule__CroissanceAbonne__Group__3__Impl rule__CroissanceAbonne__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CroissanceAbonne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__3"


    // $ANTLR start "rule__CroissanceAbonne__Group__3__Impl"
    // InternalTw.g:4240:1: rule__CroissanceAbonne__Group__3__Impl : ( ( rule__CroissanceAbonne__Group_3__0 )? ) ;
    public final void rule__CroissanceAbonne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4244:1: ( ( ( rule__CroissanceAbonne__Group_3__0 )? ) )
            // InternalTw.g:4245:1: ( ( rule__CroissanceAbonne__Group_3__0 )? )
            {
            // InternalTw.g:4245:1: ( ( rule__CroissanceAbonne__Group_3__0 )? )
            // InternalTw.g:4246:2: ( rule__CroissanceAbonne__Group_3__0 )?
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup_3()); 
            // InternalTw.g:4247:2: ( rule__CroissanceAbonne__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==20||(LA26_0>=22 && LA26_0<=36)||(LA26_0>=38 && LA26_0<=39)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTw.g:4247:3: rule__CroissanceAbonne__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CroissanceAbonne__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCroissanceAbonneAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__3__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__4"
    // InternalTw.g:4255:1: rule__CroissanceAbonne__Group__4 : rule__CroissanceAbonne__Group__4__Impl ;
    public final void rule__CroissanceAbonne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4259:1: ( rule__CroissanceAbonne__Group__4__Impl )
            // InternalTw.g:4260:2: rule__CroissanceAbonne__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__4"


    // $ANTLR start "rule__CroissanceAbonne__Group__4__Impl"
    // InternalTw.g:4266:1: rule__CroissanceAbonne__Group__4__Impl : ( '}' ) ;
    public final void rule__CroissanceAbonne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4270:1: ( ( '}' ) )
            // InternalTw.g:4271:1: ( '}' )
            {
            // InternalTw.g:4271:1: ( '}' )
            // InternalTw.g:4272:2: '}'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group__4__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__0"
    // InternalTw.g:4282:1: rule__CroissanceAbonne__Group_3__0 : rule__CroissanceAbonne__Group_3__0__Impl rule__CroissanceAbonne__Group_3__1 ;
    public final void rule__CroissanceAbonne__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4286:1: ( rule__CroissanceAbonne__Group_3__0__Impl rule__CroissanceAbonne__Group_3__1 )
            // InternalTw.g:4287:2: rule__CroissanceAbonne__Group_3__0__Impl rule__CroissanceAbonne__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__CroissanceAbonne__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__0"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__0__Impl"
    // InternalTw.g:4294:1: rule__CroissanceAbonne__Group_3__0__Impl : ( ( rule__CroissanceAbonne__ArgsAssignment_3_0 ) ) ;
    public final void rule__CroissanceAbonne__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4298:1: ( ( ( rule__CroissanceAbonne__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:4299:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:4299:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_0 ) )
            // InternalTw.g:4300:2: ( rule__CroissanceAbonne__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:4301:2: ( rule__CroissanceAbonne__ArgsAssignment_3_0 )
            // InternalTw.g:4301:3: rule__CroissanceAbonne__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__1"
    // InternalTw.g:4309:1: rule__CroissanceAbonne__Group_3__1 : rule__CroissanceAbonne__Group_3__1__Impl ;
    public final void rule__CroissanceAbonne__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4313:1: ( rule__CroissanceAbonne__Group_3__1__Impl )
            // InternalTw.g:4314:2: rule__CroissanceAbonne__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__1"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__1__Impl"
    // InternalTw.g:4320:1: rule__CroissanceAbonne__Group_3__1__Impl : ( ( rule__CroissanceAbonne__Group_3_1__0 )* ) ;
    public final void rule__CroissanceAbonne__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4324:1: ( ( ( rule__CroissanceAbonne__Group_3_1__0 )* ) )
            // InternalTw.g:4325:1: ( ( rule__CroissanceAbonne__Group_3_1__0 )* )
            {
            // InternalTw.g:4325:1: ( ( rule__CroissanceAbonne__Group_3_1__0 )* )
            // InternalTw.g:4326:2: ( rule__CroissanceAbonne__Group_3_1__0 )*
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup_3_1()); 
            // InternalTw.g:4327:2: ( rule__CroissanceAbonne__Group_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTw.g:4327:3: rule__CroissanceAbonne__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CroissanceAbonne__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCroissanceAbonneAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__1__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_1__0"
    // InternalTw.g:4336:1: rule__CroissanceAbonne__Group_3_1__0 : rule__CroissanceAbonne__Group_3_1__0__Impl rule__CroissanceAbonne__Group_3_1__1 ;
    public final void rule__CroissanceAbonne__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4340:1: ( rule__CroissanceAbonne__Group_3_1__0__Impl rule__CroissanceAbonne__Group_3_1__1 )
            // InternalTw.g:4341:2: rule__CroissanceAbonne__Group_3_1__0__Impl rule__CroissanceAbonne__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__CroissanceAbonne__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_1__0"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_1__0__Impl"
    // InternalTw.g:4348:1: rule__CroissanceAbonne__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CroissanceAbonne__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4352:1: ( ( ',' ) )
            // InternalTw.g:4353:1: ( ',' )
            {
            // InternalTw.g:4353:1: ( ',' )
            // InternalTw.g:4354:2: ','
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_1__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_1__1"
    // InternalTw.g:4363:1: rule__CroissanceAbonne__Group_3_1__1 : rule__CroissanceAbonne__Group_3_1__1__Impl ;
    public final void rule__CroissanceAbonne__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4367:1: ( rule__CroissanceAbonne__Group_3_1__1__Impl )
            // InternalTw.g:4368:2: rule__CroissanceAbonne__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_1__1"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_1__1__Impl"
    // InternalTw.g:4374:1: rule__CroissanceAbonne__Group_3_1__1__Impl : ( ( rule__CroissanceAbonne__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__CroissanceAbonne__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4378:1: ( ( ( rule__CroissanceAbonne__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:4379:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:4379:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:4380:2: ( rule__CroissanceAbonne__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:4381:2: ( rule__CroissanceAbonne__ArgsAssignment_3_1_1 )
            // InternalTw.g:4381:3: rule__CroissanceAbonne__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_1__1__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__0"
    // InternalTw.g:4390:1: rule__MoyFollowers__Group__0 : rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1 ;
    public final void rule__MoyFollowers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4394:1: ( rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1 )
            // InternalTw.g:4395:2: rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MoyFollowers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__0"


    // $ANTLR start "rule__MoyFollowers__Group__0__Impl"
    // InternalTw.g:4402:1: rule__MoyFollowers__Group__0__Impl : ( () ) ;
    public final void rule__MoyFollowers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4406:1: ( ( () ) )
            // InternalTw.g:4407:1: ( () )
            {
            // InternalTw.g:4407:1: ( () )
            // InternalTw.g:4408:2: ()
            {
             before(grammarAccess.getMoyFollowersAccess().getMoyFollowersAction_0()); 
            // InternalTw.g:4409:2: ()
            // InternalTw.g:4409:3: 
            {
            }

             after(grammarAccess.getMoyFollowersAccess().getMoyFollowersAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__1"
    // InternalTw.g:4417:1: rule__MoyFollowers__Group__1 : rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2 ;
    public final void rule__MoyFollowers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4421:1: ( rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2 )
            // InternalTw.g:4422:2: rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MoyFollowers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__1"


    // $ANTLR start "rule__MoyFollowers__Group__1__Impl"
    // InternalTw.g:4429:1: rule__MoyFollowers__Group__1__Impl : ( 'moyFollowers' ) ;
    public final void rule__MoyFollowers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4433:1: ( ( 'moyFollowers' ) )
            // InternalTw.g:4434:1: ( 'moyFollowers' )
            {
            // InternalTw.g:4434:1: ( 'moyFollowers' )
            // InternalTw.g:4435:2: 'moyFollowers'
            {
             before(grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__1__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__2"
    // InternalTw.g:4444:1: rule__MoyFollowers__Group__2 : rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3 ;
    public final void rule__MoyFollowers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4448:1: ( rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3 )
            // InternalTw.g:4449:2: rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MoyFollowers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__2"


    // $ANTLR start "rule__MoyFollowers__Group__2__Impl"
    // InternalTw.g:4456:1: rule__MoyFollowers__Group__2__Impl : ( '{' ) ;
    public final void rule__MoyFollowers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4460:1: ( ( '{' ) )
            // InternalTw.g:4461:1: ( '{' )
            {
            // InternalTw.g:4461:1: ( '{' )
            // InternalTw.g:4462:2: '{'
            {
             before(grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__2__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__3"
    // InternalTw.g:4471:1: rule__MoyFollowers__Group__3 : rule__MoyFollowers__Group__3__Impl rule__MoyFollowers__Group__4 ;
    public final void rule__MoyFollowers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4475:1: ( rule__MoyFollowers__Group__3__Impl rule__MoyFollowers__Group__4 )
            // InternalTw.g:4476:2: rule__MoyFollowers__Group__3__Impl rule__MoyFollowers__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__MoyFollowers__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__3"


    // $ANTLR start "rule__MoyFollowers__Group__3__Impl"
    // InternalTw.g:4483:1: rule__MoyFollowers__Group__3__Impl : ( ( rule__MoyFollowers__Group_3__0 )? ) ;
    public final void rule__MoyFollowers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4487:1: ( ( ( rule__MoyFollowers__Group_3__0 )? ) )
            // InternalTw.g:4488:1: ( ( rule__MoyFollowers__Group_3__0 )? )
            {
            // InternalTw.g:4488:1: ( ( rule__MoyFollowers__Group_3__0 )? )
            // InternalTw.g:4489:2: ( rule__MoyFollowers__Group_3__0 )?
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup_3()); 
            // InternalTw.g:4490:2: ( rule__MoyFollowers__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==20||(LA28_0>=22 && LA28_0<=36)||(LA28_0>=38 && LA28_0<=39)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTw.g:4490:3: rule__MoyFollowers__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoyFollowers__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoyFollowersAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__3__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__4"
    // InternalTw.g:4498:1: rule__MoyFollowers__Group__4 : rule__MoyFollowers__Group__4__Impl ;
    public final void rule__MoyFollowers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4502:1: ( rule__MoyFollowers__Group__4__Impl )
            // InternalTw.g:4503:2: rule__MoyFollowers__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__4"


    // $ANTLR start "rule__MoyFollowers__Group__4__Impl"
    // InternalTw.g:4509:1: rule__MoyFollowers__Group__4__Impl : ( '}' ) ;
    public final void rule__MoyFollowers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4513:1: ( ( '}' ) )
            // InternalTw.g:4514:1: ( '}' )
            {
            // InternalTw.g:4514:1: ( '}' )
            // InternalTw.g:4515:2: '}'
            {
             before(grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group__4__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3__0"
    // InternalTw.g:4525:1: rule__MoyFollowers__Group_3__0 : rule__MoyFollowers__Group_3__0__Impl rule__MoyFollowers__Group_3__1 ;
    public final void rule__MoyFollowers__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4529:1: ( rule__MoyFollowers__Group_3__0__Impl rule__MoyFollowers__Group_3__1 )
            // InternalTw.g:4530:2: rule__MoyFollowers__Group_3__0__Impl rule__MoyFollowers__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__MoyFollowers__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__0"


    // $ANTLR start "rule__MoyFollowers__Group_3__0__Impl"
    // InternalTw.g:4537:1: rule__MoyFollowers__Group_3__0__Impl : ( ( rule__MoyFollowers__ArgsAssignment_3_0 ) ) ;
    public final void rule__MoyFollowers__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4541:1: ( ( ( rule__MoyFollowers__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:4542:1: ( ( rule__MoyFollowers__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:4542:1: ( ( rule__MoyFollowers__ArgsAssignment_3_0 ) )
            // InternalTw.g:4543:2: ( rule__MoyFollowers__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:4544:2: ( rule__MoyFollowers__ArgsAssignment_3_0 )
            // InternalTw.g:4544:3: rule__MoyFollowers__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3__1"
    // InternalTw.g:4552:1: rule__MoyFollowers__Group_3__1 : rule__MoyFollowers__Group_3__1__Impl ;
    public final void rule__MoyFollowers__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4556:1: ( rule__MoyFollowers__Group_3__1__Impl )
            // InternalTw.g:4557:2: rule__MoyFollowers__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__1"


    // $ANTLR start "rule__MoyFollowers__Group_3__1__Impl"
    // InternalTw.g:4563:1: rule__MoyFollowers__Group_3__1__Impl : ( ( rule__MoyFollowers__Group_3_1__0 )* ) ;
    public final void rule__MoyFollowers__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4567:1: ( ( ( rule__MoyFollowers__Group_3_1__0 )* ) )
            // InternalTw.g:4568:1: ( ( rule__MoyFollowers__Group_3_1__0 )* )
            {
            // InternalTw.g:4568:1: ( ( rule__MoyFollowers__Group_3_1__0 )* )
            // InternalTw.g:4569:2: ( rule__MoyFollowers__Group_3_1__0 )*
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup_3_1()); 
            // InternalTw.g:4570:2: ( rule__MoyFollowers__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTw.g:4570:3: rule__MoyFollowers__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MoyFollowers__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMoyFollowersAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__1__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3_1__0"
    // InternalTw.g:4579:1: rule__MoyFollowers__Group_3_1__0 : rule__MoyFollowers__Group_3_1__0__Impl rule__MoyFollowers__Group_3_1__1 ;
    public final void rule__MoyFollowers__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4583:1: ( rule__MoyFollowers__Group_3_1__0__Impl rule__MoyFollowers__Group_3_1__1 )
            // InternalTw.g:4584:2: rule__MoyFollowers__Group_3_1__0__Impl rule__MoyFollowers__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MoyFollowers__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_1__0"


    // $ANTLR start "rule__MoyFollowers__Group_3_1__0__Impl"
    // InternalTw.g:4591:1: rule__MoyFollowers__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MoyFollowers__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4595:1: ( ( ',' ) )
            // InternalTw.g:4596:1: ( ',' )
            {
            // InternalTw.g:4596:1: ( ',' )
            // InternalTw.g:4597:2: ','
            {
             before(grammarAccess.getMoyFollowersAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_1__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3_1__1"
    // InternalTw.g:4606:1: rule__MoyFollowers__Group_3_1__1 : rule__MoyFollowers__Group_3_1__1__Impl ;
    public final void rule__MoyFollowers__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4610:1: ( rule__MoyFollowers__Group_3_1__1__Impl )
            // InternalTw.g:4611:2: rule__MoyFollowers__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_1__1"


    // $ANTLR start "rule__MoyFollowers__Group_3_1__1__Impl"
    // InternalTw.g:4617:1: rule__MoyFollowers__Group_3_1__1__Impl : ( ( rule__MoyFollowers__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__MoyFollowers__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4621:1: ( ( ( rule__MoyFollowers__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:4622:1: ( ( rule__MoyFollowers__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:4622:1: ( ( rule__MoyFollowers__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:4623:2: ( rule__MoyFollowers__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:4624:2: ( rule__MoyFollowers__ArgsAssignment_3_1_1 )
            // InternalTw.g:4624:3: rule__MoyFollowers__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_1__1__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__0"
    // InternalTw.g:4633:1: rule__MoyFavorited__Group__0 : rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1 ;
    public final void rule__MoyFavorited__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4637:1: ( rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1 )
            // InternalTw.g:4638:2: rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MoyFavorited__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__0"


    // $ANTLR start "rule__MoyFavorited__Group__0__Impl"
    // InternalTw.g:4645:1: rule__MoyFavorited__Group__0__Impl : ( () ) ;
    public final void rule__MoyFavorited__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4649:1: ( ( () ) )
            // InternalTw.g:4650:1: ( () )
            {
            // InternalTw.g:4650:1: ( () )
            // InternalTw.g:4651:2: ()
            {
             before(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedAction_0()); 
            // InternalTw.g:4652:2: ()
            // InternalTw.g:4652:3: 
            {
            }

             after(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__1"
    // InternalTw.g:4660:1: rule__MoyFavorited__Group__1 : rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2 ;
    public final void rule__MoyFavorited__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4664:1: ( rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2 )
            // InternalTw.g:4665:2: rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MoyFavorited__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__1"


    // $ANTLR start "rule__MoyFavorited__Group__1__Impl"
    // InternalTw.g:4672:1: rule__MoyFavorited__Group__1__Impl : ( 'moyFavorited' ) ;
    public final void rule__MoyFavorited__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4676:1: ( ( 'moyFavorited' ) )
            // InternalTw.g:4677:1: ( 'moyFavorited' )
            {
            // InternalTw.g:4677:1: ( 'moyFavorited' )
            // InternalTw.g:4678:2: 'moyFavorited'
            {
             before(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__1__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__2"
    // InternalTw.g:4687:1: rule__MoyFavorited__Group__2 : rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3 ;
    public final void rule__MoyFavorited__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4691:1: ( rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3 )
            // InternalTw.g:4692:2: rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MoyFavorited__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__2"


    // $ANTLR start "rule__MoyFavorited__Group__2__Impl"
    // InternalTw.g:4699:1: rule__MoyFavorited__Group__2__Impl : ( '{' ) ;
    public final void rule__MoyFavorited__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4703:1: ( ( '{' ) )
            // InternalTw.g:4704:1: ( '{' )
            {
            // InternalTw.g:4704:1: ( '{' )
            // InternalTw.g:4705:2: '{'
            {
             before(grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__2__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__3"
    // InternalTw.g:4714:1: rule__MoyFavorited__Group__3 : rule__MoyFavorited__Group__3__Impl rule__MoyFavorited__Group__4 ;
    public final void rule__MoyFavorited__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4718:1: ( rule__MoyFavorited__Group__3__Impl rule__MoyFavorited__Group__4 )
            // InternalTw.g:4719:2: rule__MoyFavorited__Group__3__Impl rule__MoyFavorited__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__MoyFavorited__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__3"


    // $ANTLR start "rule__MoyFavorited__Group__3__Impl"
    // InternalTw.g:4726:1: rule__MoyFavorited__Group__3__Impl : ( ( rule__MoyFavorited__Group_3__0 )? ) ;
    public final void rule__MoyFavorited__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4730:1: ( ( ( rule__MoyFavorited__Group_3__0 )? ) )
            // InternalTw.g:4731:1: ( ( rule__MoyFavorited__Group_3__0 )? )
            {
            // InternalTw.g:4731:1: ( ( rule__MoyFavorited__Group_3__0 )? )
            // InternalTw.g:4732:2: ( rule__MoyFavorited__Group_3__0 )?
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup_3()); 
            // InternalTw.g:4733:2: ( rule__MoyFavorited__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==20||(LA30_0>=22 && LA30_0<=36)||(LA30_0>=38 && LA30_0<=39)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTw.g:4733:3: rule__MoyFavorited__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoyFavorited__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoyFavoritedAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__3__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__4"
    // InternalTw.g:4741:1: rule__MoyFavorited__Group__4 : rule__MoyFavorited__Group__4__Impl ;
    public final void rule__MoyFavorited__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4745:1: ( rule__MoyFavorited__Group__4__Impl )
            // InternalTw.g:4746:2: rule__MoyFavorited__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__4"


    // $ANTLR start "rule__MoyFavorited__Group__4__Impl"
    // InternalTw.g:4752:1: rule__MoyFavorited__Group__4__Impl : ( '}' ) ;
    public final void rule__MoyFavorited__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4756:1: ( ( '}' ) )
            // InternalTw.g:4757:1: ( '}' )
            {
            // InternalTw.g:4757:1: ( '}' )
            // InternalTw.g:4758:2: '}'
            {
             before(grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group__4__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3__0"
    // InternalTw.g:4768:1: rule__MoyFavorited__Group_3__0 : rule__MoyFavorited__Group_3__0__Impl rule__MoyFavorited__Group_3__1 ;
    public final void rule__MoyFavorited__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4772:1: ( rule__MoyFavorited__Group_3__0__Impl rule__MoyFavorited__Group_3__1 )
            // InternalTw.g:4773:2: rule__MoyFavorited__Group_3__0__Impl rule__MoyFavorited__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__MoyFavorited__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__0"


    // $ANTLR start "rule__MoyFavorited__Group_3__0__Impl"
    // InternalTw.g:4780:1: rule__MoyFavorited__Group_3__0__Impl : ( ( rule__MoyFavorited__ArgsAssignment_3_0 ) ) ;
    public final void rule__MoyFavorited__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4784:1: ( ( ( rule__MoyFavorited__ArgsAssignment_3_0 ) ) )
            // InternalTw.g:4785:1: ( ( rule__MoyFavorited__ArgsAssignment_3_0 ) )
            {
            // InternalTw.g:4785:1: ( ( rule__MoyFavorited__ArgsAssignment_3_0 ) )
            // InternalTw.g:4786:2: ( rule__MoyFavorited__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_0()); 
            // InternalTw.g:4787:2: ( rule__MoyFavorited__ArgsAssignment_3_0 )
            // InternalTw.g:4787:3: rule__MoyFavorited__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3__1"
    // InternalTw.g:4795:1: rule__MoyFavorited__Group_3__1 : rule__MoyFavorited__Group_3__1__Impl ;
    public final void rule__MoyFavorited__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4799:1: ( rule__MoyFavorited__Group_3__1__Impl )
            // InternalTw.g:4800:2: rule__MoyFavorited__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__1"


    // $ANTLR start "rule__MoyFavorited__Group_3__1__Impl"
    // InternalTw.g:4806:1: rule__MoyFavorited__Group_3__1__Impl : ( ( rule__MoyFavorited__Group_3_1__0 )* ) ;
    public final void rule__MoyFavorited__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4810:1: ( ( ( rule__MoyFavorited__Group_3_1__0 )* ) )
            // InternalTw.g:4811:1: ( ( rule__MoyFavorited__Group_3_1__0 )* )
            {
            // InternalTw.g:4811:1: ( ( rule__MoyFavorited__Group_3_1__0 )* )
            // InternalTw.g:4812:2: ( rule__MoyFavorited__Group_3_1__0 )*
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup_3_1()); 
            // InternalTw.g:4813:2: ( rule__MoyFavorited__Group_3_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==21) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTw.g:4813:3: rule__MoyFavorited__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MoyFavorited__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMoyFavoritedAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__1__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3_1__0"
    // InternalTw.g:4822:1: rule__MoyFavorited__Group_3_1__0 : rule__MoyFavorited__Group_3_1__0__Impl rule__MoyFavorited__Group_3_1__1 ;
    public final void rule__MoyFavorited__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4826:1: ( rule__MoyFavorited__Group_3_1__0__Impl rule__MoyFavorited__Group_3_1__1 )
            // InternalTw.g:4827:2: rule__MoyFavorited__Group_3_1__0__Impl rule__MoyFavorited__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__MoyFavorited__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_1__0"


    // $ANTLR start "rule__MoyFavorited__Group_3_1__0__Impl"
    // InternalTw.g:4834:1: rule__MoyFavorited__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__MoyFavorited__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4838:1: ( ( ',' ) )
            // InternalTw.g:4839:1: ( ',' )
            {
            // InternalTw.g:4839:1: ( ',' )
            // InternalTw.g:4840:2: ','
            {
             before(grammarAccess.getMoyFavoritedAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_1__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3_1__1"
    // InternalTw.g:4849:1: rule__MoyFavorited__Group_3_1__1 : rule__MoyFavorited__Group_3_1__1__Impl ;
    public final void rule__MoyFavorited__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4853:1: ( rule__MoyFavorited__Group_3_1__1__Impl )
            // InternalTw.g:4854:2: rule__MoyFavorited__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_1__1"


    // $ANTLR start "rule__MoyFavorited__Group_3_1__1__Impl"
    // InternalTw.g:4860:1: rule__MoyFavorited__Group_3_1__1__Impl : ( ( rule__MoyFavorited__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__MoyFavorited__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4864:1: ( ( ( rule__MoyFavorited__ArgsAssignment_3_1_1 ) ) )
            // InternalTw.g:4865:1: ( ( rule__MoyFavorited__ArgsAssignment_3_1_1 ) )
            {
            // InternalTw.g:4865:1: ( ( rule__MoyFavorited__ArgsAssignment_3_1_1 ) )
            // InternalTw.g:4866:2: ( rule__MoyFavorited__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_1_1()); 
            // InternalTw.g:4867:2: ( rule__MoyFavorited__ArgsAssignment_3_1_1 )
            // InternalTw.g:4867:3: rule__MoyFavorited__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_1__1__Impl"


    // $ANTLR start "rule__GREATER__Group__0"
    // InternalTw.g:4876:1: rule__GREATER__Group__0 : rule__GREATER__Group__0__Impl rule__GREATER__Group__1 ;
    public final void rule__GREATER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4880:1: ( rule__GREATER__Group__0__Impl rule__GREATER__Group__1 )
            // InternalTw.g:4881:2: rule__GREATER__Group__0__Impl rule__GREATER__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GREATER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GREATER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__0"


    // $ANTLR start "rule__GREATER__Group__0__Impl"
    // InternalTw.g:4888:1: rule__GREATER__Group__0__Impl : ( 'GREATER' ) ;
    public final void rule__GREATER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4892:1: ( ( 'GREATER' ) )
            // InternalTw.g:4893:1: ( 'GREATER' )
            {
            // InternalTw.g:4893:1: ( 'GREATER' )
            // InternalTw.g:4894:2: 'GREATER'
            {
             before(grammarAccess.getGREATERAccess().getGREATERKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGREATERAccess().getGREATERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__0__Impl"


    // $ANTLR start "rule__GREATER__Group__1"
    // InternalTw.g:4903:1: rule__GREATER__Group__1 : rule__GREATER__Group__1__Impl rule__GREATER__Group__2 ;
    public final void rule__GREATER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4907:1: ( rule__GREATER__Group__1__Impl rule__GREATER__Group__2 )
            // InternalTw.g:4908:2: rule__GREATER__Group__1__Impl rule__GREATER__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GREATER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GREATER__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__1"


    // $ANTLR start "rule__GREATER__Group__1__Impl"
    // InternalTw.g:4915:1: rule__GREATER__Group__1__Impl : ( '(' ) ;
    public final void rule__GREATER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4919:1: ( ( '(' ) )
            // InternalTw.g:4920:1: ( '(' )
            {
            // InternalTw.g:4920:1: ( '(' )
            // InternalTw.g:4921:2: '('
            {
             before(grammarAccess.getGREATERAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGREATERAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__1__Impl"


    // $ANTLR start "rule__GREATER__Group__2"
    // InternalTw.g:4930:1: rule__GREATER__Group__2 : rule__GREATER__Group__2__Impl rule__GREATER__Group__3 ;
    public final void rule__GREATER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4934:1: ( rule__GREATER__Group__2__Impl rule__GREATER__Group__3 )
            // InternalTw.g:4935:2: rule__GREATER__Group__2__Impl rule__GREATER__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__GREATER__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GREATER__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__2"


    // $ANTLR start "rule__GREATER__Group__2__Impl"
    // InternalTw.g:4942:1: rule__GREATER__Group__2__Impl : ( ( rule__GREATER__Exp1Assignment_2 ) ) ;
    public final void rule__GREATER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4946:1: ( ( ( rule__GREATER__Exp1Assignment_2 ) ) )
            // InternalTw.g:4947:1: ( ( rule__GREATER__Exp1Assignment_2 ) )
            {
            // InternalTw.g:4947:1: ( ( rule__GREATER__Exp1Assignment_2 ) )
            // InternalTw.g:4948:2: ( rule__GREATER__Exp1Assignment_2 )
            {
             before(grammarAccess.getGREATERAccess().getExp1Assignment_2()); 
            // InternalTw.g:4949:2: ( rule__GREATER__Exp1Assignment_2 )
            // InternalTw.g:4949:3: rule__GREATER__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GREATER__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGREATERAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__2__Impl"


    // $ANTLR start "rule__GREATER__Group__3"
    // InternalTw.g:4957:1: rule__GREATER__Group__3 : rule__GREATER__Group__3__Impl rule__GREATER__Group__4 ;
    public final void rule__GREATER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4961:1: ( rule__GREATER__Group__3__Impl rule__GREATER__Group__4 )
            // InternalTw.g:4962:2: rule__GREATER__Group__3__Impl rule__GREATER__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__GREATER__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GREATER__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__3"


    // $ANTLR start "rule__GREATER__Group__3__Impl"
    // InternalTw.g:4969:1: rule__GREATER__Group__3__Impl : ( ',' ) ;
    public final void rule__GREATER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4973:1: ( ( ',' ) )
            // InternalTw.g:4974:1: ( ',' )
            {
            // InternalTw.g:4974:1: ( ',' )
            // InternalTw.g:4975:2: ','
            {
             before(grammarAccess.getGREATERAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGREATERAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__3__Impl"


    // $ANTLR start "rule__GREATER__Group__4"
    // InternalTw.g:4984:1: rule__GREATER__Group__4 : rule__GREATER__Group__4__Impl rule__GREATER__Group__5 ;
    public final void rule__GREATER__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4988:1: ( rule__GREATER__Group__4__Impl rule__GREATER__Group__5 )
            // InternalTw.g:4989:2: rule__GREATER__Group__4__Impl rule__GREATER__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__GREATER__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GREATER__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__4"


    // $ANTLR start "rule__GREATER__Group__4__Impl"
    // InternalTw.g:4996:1: rule__GREATER__Group__4__Impl : ( ( rule__GREATER__Exp2Assignment_4 ) ) ;
    public final void rule__GREATER__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5000:1: ( ( ( rule__GREATER__Exp2Assignment_4 ) ) )
            // InternalTw.g:5001:1: ( ( rule__GREATER__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5001:1: ( ( rule__GREATER__Exp2Assignment_4 ) )
            // InternalTw.g:5002:2: ( rule__GREATER__Exp2Assignment_4 )
            {
             before(grammarAccess.getGREATERAccess().getExp2Assignment_4()); 
            // InternalTw.g:5003:2: ( rule__GREATER__Exp2Assignment_4 )
            // InternalTw.g:5003:3: rule__GREATER__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GREATER__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGREATERAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__4__Impl"


    // $ANTLR start "rule__GREATER__Group__5"
    // InternalTw.g:5011:1: rule__GREATER__Group__5 : rule__GREATER__Group__5__Impl ;
    public final void rule__GREATER__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5015:1: ( rule__GREATER__Group__5__Impl )
            // InternalTw.g:5016:2: rule__GREATER__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GREATER__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__5"


    // $ANTLR start "rule__GREATER__Group__5__Impl"
    // InternalTw.g:5022:1: rule__GREATER__Group__5__Impl : ( ')' ) ;
    public final void rule__GREATER__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5026:1: ( ( ')' ) )
            // InternalTw.g:5027:1: ( ')' )
            {
            // InternalTw.g:5027:1: ( ')' )
            // InternalTw.g:5028:2: ')'
            {
             before(grammarAccess.getGREATERAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGREATERAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Group__5__Impl"


    // $ANTLR start "rule__LESS__Group__0"
    // InternalTw.g:5038:1: rule__LESS__Group__0 : rule__LESS__Group__0__Impl rule__LESS__Group__1 ;
    public final void rule__LESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5042:1: ( rule__LESS__Group__0__Impl rule__LESS__Group__1 )
            // InternalTw.g:5043:2: rule__LESS__Group__0__Impl rule__LESS__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LESS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LESS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__0"


    // $ANTLR start "rule__LESS__Group__0__Impl"
    // InternalTw.g:5050:1: rule__LESS__Group__0__Impl : ( 'LESS' ) ;
    public final void rule__LESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5054:1: ( ( 'LESS' ) )
            // InternalTw.g:5055:1: ( 'LESS' )
            {
            // InternalTw.g:5055:1: ( 'LESS' )
            // InternalTw.g:5056:2: 'LESS'
            {
             before(grammarAccess.getLESSAccess().getLESSKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLESSAccess().getLESSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__0__Impl"


    // $ANTLR start "rule__LESS__Group__1"
    // InternalTw.g:5065:1: rule__LESS__Group__1 : rule__LESS__Group__1__Impl rule__LESS__Group__2 ;
    public final void rule__LESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5069:1: ( rule__LESS__Group__1__Impl rule__LESS__Group__2 )
            // InternalTw.g:5070:2: rule__LESS__Group__1__Impl rule__LESS__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LESS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LESS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__1"


    // $ANTLR start "rule__LESS__Group__1__Impl"
    // InternalTw.g:5077:1: rule__LESS__Group__1__Impl : ( '(' ) ;
    public final void rule__LESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5081:1: ( ( '(' ) )
            // InternalTw.g:5082:1: ( '(' )
            {
            // InternalTw.g:5082:1: ( '(' )
            // InternalTw.g:5083:2: '('
            {
             before(grammarAccess.getLESSAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLESSAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__1__Impl"


    // $ANTLR start "rule__LESS__Group__2"
    // InternalTw.g:5092:1: rule__LESS__Group__2 : rule__LESS__Group__2__Impl rule__LESS__Group__3 ;
    public final void rule__LESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5096:1: ( rule__LESS__Group__2__Impl rule__LESS__Group__3 )
            // InternalTw.g:5097:2: rule__LESS__Group__2__Impl rule__LESS__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__LESS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LESS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__2"


    // $ANTLR start "rule__LESS__Group__2__Impl"
    // InternalTw.g:5104:1: rule__LESS__Group__2__Impl : ( ( rule__LESS__Exp1Assignment_2 ) ) ;
    public final void rule__LESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5108:1: ( ( ( rule__LESS__Exp1Assignment_2 ) ) )
            // InternalTw.g:5109:1: ( ( rule__LESS__Exp1Assignment_2 ) )
            {
            // InternalTw.g:5109:1: ( ( rule__LESS__Exp1Assignment_2 ) )
            // InternalTw.g:5110:2: ( rule__LESS__Exp1Assignment_2 )
            {
             before(grammarAccess.getLESSAccess().getExp1Assignment_2()); 
            // InternalTw.g:5111:2: ( rule__LESS__Exp1Assignment_2 )
            // InternalTw.g:5111:3: rule__LESS__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LESS__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLESSAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__2__Impl"


    // $ANTLR start "rule__LESS__Group__3"
    // InternalTw.g:5119:1: rule__LESS__Group__3 : rule__LESS__Group__3__Impl rule__LESS__Group__4 ;
    public final void rule__LESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5123:1: ( rule__LESS__Group__3__Impl rule__LESS__Group__4 )
            // InternalTw.g:5124:2: rule__LESS__Group__3__Impl rule__LESS__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LESS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LESS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__3"


    // $ANTLR start "rule__LESS__Group__3__Impl"
    // InternalTw.g:5131:1: rule__LESS__Group__3__Impl : ( ',' ) ;
    public final void rule__LESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5135:1: ( ( ',' ) )
            // InternalTw.g:5136:1: ( ',' )
            {
            // InternalTw.g:5136:1: ( ',' )
            // InternalTw.g:5137:2: ','
            {
             before(grammarAccess.getLESSAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLESSAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__3__Impl"


    // $ANTLR start "rule__LESS__Group__4"
    // InternalTw.g:5146:1: rule__LESS__Group__4 : rule__LESS__Group__4__Impl rule__LESS__Group__5 ;
    public final void rule__LESS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5150:1: ( rule__LESS__Group__4__Impl rule__LESS__Group__5 )
            // InternalTw.g:5151:2: rule__LESS__Group__4__Impl rule__LESS__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__LESS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LESS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__4"


    // $ANTLR start "rule__LESS__Group__4__Impl"
    // InternalTw.g:5158:1: rule__LESS__Group__4__Impl : ( ( rule__LESS__Exp2Assignment_4 ) ) ;
    public final void rule__LESS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5162:1: ( ( ( rule__LESS__Exp2Assignment_4 ) ) )
            // InternalTw.g:5163:1: ( ( rule__LESS__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5163:1: ( ( rule__LESS__Exp2Assignment_4 ) )
            // InternalTw.g:5164:2: ( rule__LESS__Exp2Assignment_4 )
            {
             before(grammarAccess.getLESSAccess().getExp2Assignment_4()); 
            // InternalTw.g:5165:2: ( rule__LESS__Exp2Assignment_4 )
            // InternalTw.g:5165:3: rule__LESS__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LESS__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLESSAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__4__Impl"


    // $ANTLR start "rule__LESS__Group__5"
    // InternalTw.g:5173:1: rule__LESS__Group__5 : rule__LESS__Group__5__Impl ;
    public final void rule__LESS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5177:1: ( rule__LESS__Group__5__Impl )
            // InternalTw.g:5178:2: rule__LESS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LESS__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__5"


    // $ANTLR start "rule__LESS__Group__5__Impl"
    // InternalTw.g:5184:1: rule__LESS__Group__5__Impl : ( ')' ) ;
    public final void rule__LESS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5188:1: ( ( ')' ) )
            // InternalTw.g:5189:1: ( ')' )
            {
            // InternalTw.g:5189:1: ( ')' )
            // InternalTw.g:5190:2: ')'
            {
             before(grammarAccess.getLESSAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLESSAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Group__5__Impl"


    // $ANTLR start "rule__EQUALS__Group__0"
    // InternalTw.g:5200:1: rule__EQUALS__Group__0 : rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 ;
    public final void rule__EQUALS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5204:1: ( rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 )
            // InternalTw.g:5205:2: rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EQUALS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__0"


    // $ANTLR start "rule__EQUALS__Group__0__Impl"
    // InternalTw.g:5212:1: rule__EQUALS__Group__0__Impl : ( 'EQUALS' ) ;
    public final void rule__EQUALS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5216:1: ( ( 'EQUALS' ) )
            // InternalTw.g:5217:1: ( 'EQUALS' )
            {
            // InternalTw.g:5217:1: ( 'EQUALS' )
            // InternalTw.g:5218:2: 'EQUALS'
            {
             before(grammarAccess.getEQUALSAccess().getEQUALSKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEQUALSAccess().getEQUALSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__0__Impl"


    // $ANTLR start "rule__EQUALS__Group__1"
    // InternalTw.g:5227:1: rule__EQUALS__Group__1 : rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 ;
    public final void rule__EQUALS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5231:1: ( rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 )
            // InternalTw.g:5232:2: rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EQUALS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__1"


    // $ANTLR start "rule__EQUALS__Group__1__Impl"
    // InternalTw.g:5239:1: rule__EQUALS__Group__1__Impl : ( '(' ) ;
    public final void rule__EQUALS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5243:1: ( ( '(' ) )
            // InternalTw.g:5244:1: ( '(' )
            {
            // InternalTw.g:5244:1: ( '(' )
            // InternalTw.g:5245:2: '('
            {
             before(grammarAccess.getEQUALSAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEQUALSAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__1__Impl"


    // $ANTLR start "rule__EQUALS__Group__2"
    // InternalTw.g:5254:1: rule__EQUALS__Group__2 : rule__EQUALS__Group__2__Impl rule__EQUALS__Group__3 ;
    public final void rule__EQUALS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5258:1: ( rule__EQUALS__Group__2__Impl rule__EQUALS__Group__3 )
            // InternalTw.g:5259:2: rule__EQUALS__Group__2__Impl rule__EQUALS__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__EQUALS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__2"


    // $ANTLR start "rule__EQUALS__Group__2__Impl"
    // InternalTw.g:5266:1: rule__EQUALS__Group__2__Impl : ( ( rule__EQUALS__Exp1Assignment_2 ) ) ;
    public final void rule__EQUALS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5270:1: ( ( ( rule__EQUALS__Exp1Assignment_2 ) ) )
            // InternalTw.g:5271:1: ( ( rule__EQUALS__Exp1Assignment_2 ) )
            {
            // InternalTw.g:5271:1: ( ( rule__EQUALS__Exp1Assignment_2 ) )
            // InternalTw.g:5272:2: ( rule__EQUALS__Exp1Assignment_2 )
            {
             before(grammarAccess.getEQUALSAccess().getExp1Assignment_2()); 
            // InternalTw.g:5273:2: ( rule__EQUALS__Exp1Assignment_2 )
            // InternalTw.g:5273:3: rule__EQUALS__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EQUALS__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__2__Impl"


    // $ANTLR start "rule__EQUALS__Group__3"
    // InternalTw.g:5281:1: rule__EQUALS__Group__3 : rule__EQUALS__Group__3__Impl rule__EQUALS__Group__4 ;
    public final void rule__EQUALS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5285:1: ( rule__EQUALS__Group__3__Impl rule__EQUALS__Group__4 )
            // InternalTw.g:5286:2: rule__EQUALS__Group__3__Impl rule__EQUALS__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__EQUALS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__3"


    // $ANTLR start "rule__EQUALS__Group__3__Impl"
    // InternalTw.g:5293:1: rule__EQUALS__Group__3__Impl : ( ',' ) ;
    public final void rule__EQUALS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5297:1: ( ( ',' ) )
            // InternalTw.g:5298:1: ( ',' )
            {
            // InternalTw.g:5298:1: ( ',' )
            // InternalTw.g:5299:2: ','
            {
             before(grammarAccess.getEQUALSAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEQUALSAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__3__Impl"


    // $ANTLR start "rule__EQUALS__Group__4"
    // InternalTw.g:5308:1: rule__EQUALS__Group__4 : rule__EQUALS__Group__4__Impl rule__EQUALS__Group__5 ;
    public final void rule__EQUALS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5312:1: ( rule__EQUALS__Group__4__Impl rule__EQUALS__Group__5 )
            // InternalTw.g:5313:2: rule__EQUALS__Group__4__Impl rule__EQUALS__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__EQUALS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__4"


    // $ANTLR start "rule__EQUALS__Group__4__Impl"
    // InternalTw.g:5320:1: rule__EQUALS__Group__4__Impl : ( ( rule__EQUALS__Exp2Assignment_4 ) ) ;
    public final void rule__EQUALS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5324:1: ( ( ( rule__EQUALS__Exp2Assignment_4 ) ) )
            // InternalTw.g:5325:1: ( ( rule__EQUALS__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5325:1: ( ( rule__EQUALS__Exp2Assignment_4 ) )
            // InternalTw.g:5326:2: ( rule__EQUALS__Exp2Assignment_4 )
            {
             before(grammarAccess.getEQUALSAccess().getExp2Assignment_4()); 
            // InternalTw.g:5327:2: ( rule__EQUALS__Exp2Assignment_4 )
            // InternalTw.g:5327:3: rule__EQUALS__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EQUALS__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__4__Impl"


    // $ANTLR start "rule__EQUALS__Group__5"
    // InternalTw.g:5335:1: rule__EQUALS__Group__5 : rule__EQUALS__Group__5__Impl ;
    public final void rule__EQUALS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5339:1: ( rule__EQUALS__Group__5__Impl )
            // InternalTw.g:5340:2: rule__EQUALS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EQUALS__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__5"


    // $ANTLR start "rule__EQUALS__Group__5__Impl"
    // InternalTw.g:5346:1: rule__EQUALS__Group__5__Impl : ( ')' ) ;
    public final void rule__EQUALS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5350:1: ( ( ')' ) )
            // InternalTw.g:5351:1: ( ')' )
            {
            // InternalTw.g:5351:1: ( ')' )
            // InternalTw.g:5352:2: ')'
            {
             before(grammarAccess.getEQUALSAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEQUALSAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__5__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalTw.g:5362:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5366:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalTw.g:5367:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalTw.g:5374:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5378:1: ( ( 'print' ) )
            // InternalTw.g:5379:1: ( 'print' )
            {
            // InternalTw.g:5379:1: ( 'print' )
            // InternalTw.g:5380:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalTw.g:5389:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5393:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalTw.g:5394:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Print__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalTw.g:5401:1: rule__Print__Group__1__Impl : ( '(' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5405:1: ( ( '(' ) )
            // InternalTw.g:5406:1: ( '(' )
            {
            // InternalTw.g:5406:1: ( '(' )
            // InternalTw.g:5407:2: '('
            {
             before(grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // InternalTw.g:5416:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5420:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalTw.g:5421:2: rule__Print__Group__2__Impl rule__Print__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Print__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // InternalTw.g:5428:1: rule__Print__Group__2__Impl : ( ( rule__Print__ExpressionAssignment_2 ) ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5432:1: ( ( ( rule__Print__ExpressionAssignment_2 ) ) )
            // InternalTw.g:5433:1: ( ( rule__Print__ExpressionAssignment_2 ) )
            {
            // InternalTw.g:5433:1: ( ( rule__Print__ExpressionAssignment_2 ) )
            // InternalTw.g:5434:2: ( rule__Print__ExpressionAssignment_2 )
            {
             before(grammarAccess.getPrintAccess().getExpressionAssignment_2()); 
            // InternalTw.g:5435:2: ( rule__Print__ExpressionAssignment_2 )
            // InternalTw.g:5435:3: rule__Print__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Print__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__Print__Group__3"
    // InternalTw.g:5443:1: rule__Print__Group__3 : rule__Print__Group__3__Impl ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5447:1: ( rule__Print__Group__3__Impl )
            // InternalTw.g:5448:2: rule__Print__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__3"


    // $ANTLR start "rule__Print__Group__3__Impl"
    // InternalTw.g:5454:1: rule__Print__Group__3__Impl : ( ')' ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5458:1: ( ( ')' ) )
            // InternalTw.g:5459:1: ( ')' )
            {
            // InternalTw.g:5459:1: ( ')' )
            // InternalTw.g:5460:2: ')'
            {
             before(grammarAccess.getPrintAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__3__Impl"


    // $ANTLR start "rule__ADD__Group__0"
    // InternalTw.g:5470:1: rule__ADD__Group__0 : rule__ADD__Group__0__Impl rule__ADD__Group__1 ;
    public final void rule__ADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5474:1: ( rule__ADD__Group__0__Impl rule__ADD__Group__1 )
            // InternalTw.g:5475:2: rule__ADD__Group__0__Impl rule__ADD__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ADD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__0"


    // $ANTLR start "rule__ADD__Group__0__Impl"
    // InternalTw.g:5482:1: rule__ADD__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__ADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5486:1: ( ( 'ADD' ) )
            // InternalTw.g:5487:1: ( 'ADD' )
            {
            // InternalTw.g:5487:1: ( 'ADD' )
            // InternalTw.g:5488:2: 'ADD'
            {
             before(grammarAccess.getADDAccess().getADDKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getADDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__0__Impl"


    // $ANTLR start "rule__ADD__Group__1"
    // InternalTw.g:5497:1: rule__ADD__Group__1 : rule__ADD__Group__1__Impl rule__ADD__Group__2 ;
    public final void rule__ADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5501:1: ( rule__ADD__Group__1__Impl rule__ADD__Group__2 )
            // InternalTw.g:5502:2: rule__ADD__Group__1__Impl rule__ADD__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ADD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__1"


    // $ANTLR start "rule__ADD__Group__1__Impl"
    // InternalTw.g:5509:1: rule__ADD__Group__1__Impl : ( '(' ) ;
    public final void rule__ADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5513:1: ( ( '(' ) )
            // InternalTw.g:5514:1: ( '(' )
            {
            // InternalTw.g:5514:1: ( '(' )
            // InternalTw.g:5515:2: '('
            {
             before(grammarAccess.getADDAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__1__Impl"


    // $ANTLR start "rule__ADD__Group__2"
    // InternalTw.g:5524:1: rule__ADD__Group__2 : rule__ADD__Group__2__Impl rule__ADD__Group__3 ;
    public final void rule__ADD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5528:1: ( rule__ADD__Group__2__Impl rule__ADD__Group__3 )
            // InternalTw.g:5529:2: rule__ADD__Group__2__Impl rule__ADD__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ADD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__2"


    // $ANTLR start "rule__ADD__Group__2__Impl"
    // InternalTw.g:5536:1: rule__ADD__Group__2__Impl : ( ( rule__ADD__Exp1Assignment_2 ) ) ;
    public final void rule__ADD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5540:1: ( ( ( rule__ADD__Exp1Assignment_2 ) ) )
            // InternalTw.g:5541:1: ( ( rule__ADD__Exp1Assignment_2 ) )
            {
            // InternalTw.g:5541:1: ( ( rule__ADD__Exp1Assignment_2 ) )
            // InternalTw.g:5542:2: ( rule__ADD__Exp1Assignment_2 )
            {
             before(grammarAccess.getADDAccess().getExp1Assignment_2()); 
            // InternalTw.g:5543:2: ( rule__ADD__Exp1Assignment_2 )
            // InternalTw.g:5543:3: rule__ADD__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__2__Impl"


    // $ANTLR start "rule__ADD__Group__3"
    // InternalTw.g:5551:1: rule__ADD__Group__3 : rule__ADD__Group__3__Impl rule__ADD__Group__4 ;
    public final void rule__ADD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5555:1: ( rule__ADD__Group__3__Impl rule__ADD__Group__4 )
            // InternalTw.g:5556:2: rule__ADD__Group__3__Impl rule__ADD__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ADD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__3"


    // $ANTLR start "rule__ADD__Group__3__Impl"
    // InternalTw.g:5563:1: rule__ADD__Group__3__Impl : ( ',' ) ;
    public final void rule__ADD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5567:1: ( ( ',' ) )
            // InternalTw.g:5568:1: ( ',' )
            {
            // InternalTw.g:5568:1: ( ',' )
            // InternalTw.g:5569:2: ','
            {
             before(grammarAccess.getADDAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__3__Impl"


    // $ANTLR start "rule__ADD__Group__4"
    // InternalTw.g:5578:1: rule__ADD__Group__4 : rule__ADD__Group__4__Impl rule__ADD__Group__5 ;
    public final void rule__ADD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5582:1: ( rule__ADD__Group__4__Impl rule__ADD__Group__5 )
            // InternalTw.g:5583:2: rule__ADD__Group__4__Impl rule__ADD__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ADD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__4"


    // $ANTLR start "rule__ADD__Group__4__Impl"
    // InternalTw.g:5590:1: rule__ADD__Group__4__Impl : ( ( rule__ADD__Exp2Assignment_4 ) ) ;
    public final void rule__ADD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5594:1: ( ( ( rule__ADD__Exp2Assignment_4 ) ) )
            // InternalTw.g:5595:1: ( ( rule__ADD__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5595:1: ( ( rule__ADD__Exp2Assignment_4 ) )
            // InternalTw.g:5596:2: ( rule__ADD__Exp2Assignment_4 )
            {
             before(grammarAccess.getADDAccess().getExp2Assignment_4()); 
            // InternalTw.g:5597:2: ( rule__ADD__Exp2Assignment_4 )
            // InternalTw.g:5597:3: rule__ADD__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__4__Impl"


    // $ANTLR start "rule__ADD__Group__5"
    // InternalTw.g:5605:1: rule__ADD__Group__5 : rule__ADD__Group__5__Impl ;
    public final void rule__ADD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5609:1: ( rule__ADD__Group__5__Impl )
            // InternalTw.g:5610:2: rule__ADD__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__5"


    // $ANTLR start "rule__ADD__Group__5__Impl"
    // InternalTw.g:5616:1: rule__ADD__Group__5__Impl : ( ')' ) ;
    public final void rule__ADD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5620:1: ( ( ')' ) )
            // InternalTw.g:5621:1: ( ')' )
            {
            // InternalTw.g:5621:1: ( ')' )
            // InternalTw.g:5622:2: ')'
            {
             before(grammarAccess.getADDAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__5__Impl"


    // $ANTLR start "rule__MUL__Group__0"
    // InternalTw.g:5632:1: rule__MUL__Group__0 : rule__MUL__Group__0__Impl rule__MUL__Group__1 ;
    public final void rule__MUL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5636:1: ( rule__MUL__Group__0__Impl rule__MUL__Group__1 )
            // InternalTw.g:5637:2: rule__MUL__Group__0__Impl rule__MUL__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MUL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MUL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__0"


    // $ANTLR start "rule__MUL__Group__0__Impl"
    // InternalTw.g:5644:1: rule__MUL__Group__0__Impl : ( 'MUL' ) ;
    public final void rule__MUL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5648:1: ( ( 'MUL' ) )
            // InternalTw.g:5649:1: ( 'MUL' )
            {
            // InternalTw.g:5649:1: ( 'MUL' )
            // InternalTw.g:5650:2: 'MUL'
            {
             before(grammarAccess.getMULAccess().getMULKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMULAccess().getMULKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__0__Impl"


    // $ANTLR start "rule__MUL__Group__1"
    // InternalTw.g:5659:1: rule__MUL__Group__1 : rule__MUL__Group__1__Impl rule__MUL__Group__2 ;
    public final void rule__MUL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5663:1: ( rule__MUL__Group__1__Impl rule__MUL__Group__2 )
            // InternalTw.g:5664:2: rule__MUL__Group__1__Impl rule__MUL__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MUL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MUL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__1"


    // $ANTLR start "rule__MUL__Group__1__Impl"
    // InternalTw.g:5671:1: rule__MUL__Group__1__Impl : ( '(' ) ;
    public final void rule__MUL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5675:1: ( ( '(' ) )
            // InternalTw.g:5676:1: ( '(' )
            {
            // InternalTw.g:5676:1: ( '(' )
            // InternalTw.g:5677:2: '('
            {
             before(grammarAccess.getMULAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMULAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__1__Impl"


    // $ANTLR start "rule__MUL__Group__2"
    // InternalTw.g:5686:1: rule__MUL__Group__2 : rule__MUL__Group__2__Impl rule__MUL__Group__3 ;
    public final void rule__MUL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5690:1: ( rule__MUL__Group__2__Impl rule__MUL__Group__3 )
            // InternalTw.g:5691:2: rule__MUL__Group__2__Impl rule__MUL__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MUL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MUL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__2"


    // $ANTLR start "rule__MUL__Group__2__Impl"
    // InternalTw.g:5698:1: rule__MUL__Group__2__Impl : ( ( rule__MUL__Exp1Assignment_2 ) ) ;
    public final void rule__MUL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5702:1: ( ( ( rule__MUL__Exp1Assignment_2 ) ) )
            // InternalTw.g:5703:1: ( ( rule__MUL__Exp1Assignment_2 ) )
            {
            // InternalTw.g:5703:1: ( ( rule__MUL__Exp1Assignment_2 ) )
            // InternalTw.g:5704:2: ( rule__MUL__Exp1Assignment_2 )
            {
             before(grammarAccess.getMULAccess().getExp1Assignment_2()); 
            // InternalTw.g:5705:2: ( rule__MUL__Exp1Assignment_2 )
            // InternalTw.g:5705:3: rule__MUL__Exp1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MUL__Exp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMULAccess().getExp1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__2__Impl"


    // $ANTLR start "rule__MUL__Group__3"
    // InternalTw.g:5713:1: rule__MUL__Group__3 : rule__MUL__Group__3__Impl rule__MUL__Group__4 ;
    public final void rule__MUL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5717:1: ( rule__MUL__Group__3__Impl rule__MUL__Group__4 )
            // InternalTw.g:5718:2: rule__MUL__Group__3__Impl rule__MUL__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__MUL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MUL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__3"


    // $ANTLR start "rule__MUL__Group__3__Impl"
    // InternalTw.g:5725:1: rule__MUL__Group__3__Impl : ( ',' ) ;
    public final void rule__MUL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5729:1: ( ( ',' ) )
            // InternalTw.g:5730:1: ( ',' )
            {
            // InternalTw.g:5730:1: ( ',' )
            // InternalTw.g:5731:2: ','
            {
             before(grammarAccess.getMULAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMULAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__3__Impl"


    // $ANTLR start "rule__MUL__Group__4"
    // InternalTw.g:5740:1: rule__MUL__Group__4 : rule__MUL__Group__4__Impl rule__MUL__Group__5 ;
    public final void rule__MUL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5744:1: ( rule__MUL__Group__4__Impl rule__MUL__Group__5 )
            // InternalTw.g:5745:2: rule__MUL__Group__4__Impl rule__MUL__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MUL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MUL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__4"


    // $ANTLR start "rule__MUL__Group__4__Impl"
    // InternalTw.g:5752:1: rule__MUL__Group__4__Impl : ( ( rule__MUL__Exp2Assignment_4 ) ) ;
    public final void rule__MUL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5756:1: ( ( ( rule__MUL__Exp2Assignment_4 ) ) )
            // InternalTw.g:5757:1: ( ( rule__MUL__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5757:1: ( ( rule__MUL__Exp2Assignment_4 ) )
            // InternalTw.g:5758:2: ( rule__MUL__Exp2Assignment_4 )
            {
             before(grammarAccess.getMULAccess().getExp2Assignment_4()); 
            // InternalTw.g:5759:2: ( rule__MUL__Exp2Assignment_4 )
            // InternalTw.g:5759:3: rule__MUL__Exp2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MUL__Exp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMULAccess().getExp2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__4__Impl"


    // $ANTLR start "rule__MUL__Group__5"
    // InternalTw.g:5767:1: rule__MUL__Group__5 : rule__MUL__Group__5__Impl ;
    public final void rule__MUL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5771:1: ( rule__MUL__Group__5__Impl )
            // InternalTw.g:5772:2: rule__MUL__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MUL__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__5"


    // $ANTLR start "rule__MUL__Group__5__Impl"
    // InternalTw.g:5778:1: rule__MUL__Group__5__Impl : ( ')' ) ;
    public final void rule__MUL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5782:1: ( ( ')' ) )
            // InternalTw.g:5783:1: ( ')' )
            {
            // InternalTw.g:5783:1: ( ')' )
            // InternalTw.g:5784:2: ')'
            {
             before(grammarAccess.getMULAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMULAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Group__5__Impl"


    // $ANTLR start "rule__Program__StatementAssignment_3_0"
    // InternalTw.g:5794:1: rule__Program__StatementAssignment_3_0 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5798:1: ( ( ruleStatement ) )
            // InternalTw.g:5799:2: ( ruleStatement )
            {
            // InternalTw.g:5799:2: ( ruleStatement )
            // InternalTw.g:5800:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_3_0"


    // $ANTLR start "rule__Program__StatementAssignment_3_1_1"
    // InternalTw.g:5809:1: rule__Program__StatementAssignment_3_1_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5813:1: ( ( ruleStatement ) )
            // InternalTw.g:5814:2: ( ruleStatement )
            {
            // InternalTw.g:5814:2: ( ruleStatement )
            // InternalTw.g:5815:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_3_1_1"


    // $ANTLR start "rule__Block__StatementAssignment_2_0"
    // InternalTw.g:5824:1: rule__Block__StatementAssignment_2_0 : ( ruleStatement ) ;
    public final void rule__Block__StatementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5828:1: ( ( ruleStatement ) )
            // InternalTw.g:5829:2: ( ruleStatement )
            {
            // InternalTw.g:5829:2: ( ruleStatement )
            // InternalTw.g:5830:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_2_0"


    // $ANTLR start "rule__Block__StatementAssignment_2_1_1"
    // InternalTw.g:5839:1: rule__Block__StatementAssignment_2_1_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5843:1: ( ( ruleStatement ) )
            // InternalTw.g:5844:2: ( ruleStatement )
            {
            // InternalTw.g:5844:2: ( ruleStatement )
            // InternalTw.g:5845:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_2_1_1"


    // $ANTLR start "rule__If__ConditionAssignment_2"
    // InternalTw.g:5854:1: rule__If__ConditionAssignment_2 : ( ruleOpBool ) ;
    public final void rule__If__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5858:1: ( ( ruleOpBool ) )
            // InternalTw.g:5859:2: ( ruleOpBool )
            {
            // InternalTw.g:5859:2: ( ruleOpBool )
            // InternalTw.g:5860:3: ruleOpBool
            {
             before(grammarAccess.getIfAccess().getConditionOpBoolParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionOpBoolParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_2"


    // $ANTLR start "rule__If__IfBlockAssignment_4"
    // InternalTw.g:5869:1: rule__If__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5873:1: ( ( ruleBlock ) )
            // InternalTw.g:5874:2: ( ruleBlock )
            {
            // InternalTw.g:5874:2: ( ruleBlock )
            // InternalTw.g:5875:3: ruleBlock
            {
             before(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__IfBlockAssignment_4"


    // $ANTLR start "rule__If__ElseBlockAssignment_5_1"
    // InternalTw.g:5884:1: rule__If__ElseBlockAssignment_5_1 : ( ruleBlock ) ;
    public final void rule__If__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5888:1: ( ( ruleBlock ) )
            // InternalTw.g:5889:2: ( ruleBlock )
            {
            // InternalTw.g:5889:2: ( ruleBlock )
            // InternalTw.g:5890:3: ruleBlock
            {
             before(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__DeclarationVar__NameAssignment_0"
    // InternalTw.g:5899:1: rule__DeclarationVar__NameAssignment_0 : ( ruleString0 ) ;
    public final void rule__DeclarationVar__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5903:1: ( ( ruleString0 ) )
            // InternalTw.g:5904:2: ( ruleString0 )
            {
            // InternalTw.g:5904:2: ( ruleString0 )
            // InternalTw.g:5905:3: ruleString0
            {
             before(grammarAccess.getDeclarationVarAccess().getNameString0ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getDeclarationVarAccess().getNameString0ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__NameAssignment_0"


    // $ANTLR start "rule__DeclarationVar__OpDroiteAssignment_2"
    // InternalTw.g:5914:1: rule__DeclarationVar__OpDroiteAssignment_2 : ( ruleExpression ) ;
    public final void rule__DeclarationVar__OpDroiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5918:1: ( ( ruleExpression ) )
            // InternalTw.g:5919:2: ( ruleExpression )
            {
            // InternalTw.g:5919:2: ( ruleExpression )
            // InternalTw.g:5920:3: ruleExpression
            {
             before(grammarAccess.getDeclarationVarAccess().getOpDroiteExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDeclarationVarAccess().getOpDroiteExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationVar__OpDroiteAssignment_2"


    // $ANTLR start "rule__AND__Exp1Assignment_2"
    // InternalTw.g:5929:1: rule__AND__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__AND__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5933:1: ( ( ruleExpression ) )
            // InternalTw.g:5934:2: ( ruleExpression )
            {
            // InternalTw.g:5934:2: ( ruleExpression )
            // InternalTw.g:5935:3: ruleExpression
            {
             before(grammarAccess.getANDAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getANDAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Exp1Assignment_2"


    // $ANTLR start "rule__AND__Exp2Assignment_4"
    // InternalTw.g:5944:1: rule__AND__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__AND__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5948:1: ( ( ruleExpression ) )
            // InternalTw.g:5949:2: ( ruleExpression )
            {
            // InternalTw.g:5949:2: ( ruleExpression )
            // InternalTw.g:5950:3: ruleExpression
            {
             before(grammarAccess.getANDAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getANDAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AND__Exp2Assignment_4"


    // $ANTLR start "rule__OR__Exp1Assignment_2"
    // InternalTw.g:5959:1: rule__OR__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__OR__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5963:1: ( ( ruleExpression ) )
            // InternalTw.g:5964:2: ( ruleExpression )
            {
            // InternalTw.g:5964:2: ( ruleExpression )
            // InternalTw.g:5965:3: ruleExpression
            {
             before(grammarAccess.getORAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getORAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Exp1Assignment_2"


    // $ANTLR start "rule__OR__Exp2Assignment_4"
    // InternalTw.g:5974:1: rule__OR__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__OR__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5978:1: ( ( ruleExpression ) )
            // InternalTw.g:5979:2: ( ruleExpression )
            {
            // InternalTw.g:5979:2: ( ruleExpression )
            // InternalTw.g:5980:3: ruleExpression
            {
             before(grammarAccess.getORAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getORAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OR__Exp2Assignment_4"


    // $ANTLR start "rule__Tweets_user__ArgsAssignment_3_0"
    // InternalTw.g:5989:1: rule__Tweets_user__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__Tweets_user__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5993:1: ( ( ruleArgs ) )
            // InternalTw.g:5994:2: ( ruleArgs )
            {
            // InternalTw.g:5994:2: ( ruleArgs )
            // InternalTw.g:5995:3: ruleArgs
            {
             before(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__ArgsAssignment_3_0"


    // $ANTLR start "rule__Tweets_user__ArgsAssignment_3_1_1"
    // InternalTw.g:6004:1: rule__Tweets_user__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__Tweets_user__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6008:1: ( ( ruleArgs ) )
            // InternalTw.g:6009:2: ( ruleArgs )
            {
            // InternalTw.g:6009:2: ( ruleArgs )
            // InternalTw.g:6010:3: ruleArgs
            {
             before(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__Tweets_location__ArgsAssignment_3_0"
    // InternalTw.g:6019:1: rule__Tweets_location__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__Tweets_location__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6023:1: ( ( ruleArgs ) )
            // InternalTw.g:6024:2: ( ruleArgs )
            {
            // InternalTw.g:6024:2: ( ruleArgs )
            // InternalTw.g:6025:3: ruleArgs
            {
             before(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__ArgsAssignment_3_0"


    // $ANTLR start "rule__Tweets_location__ArgsAssignment_3_1_1"
    // InternalTw.g:6034:1: rule__Tweets_location__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__Tweets_location__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6038:1: ( ( ruleArgs ) )
            // InternalTw.g:6039:2: ( ruleArgs )
            {
            // InternalTw.g:6039:2: ( ruleArgs )
            // InternalTw.g:6040:3: ruleArgs
            {
             before(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__Tweets_entity__ArgsAssignment_3_0"
    // InternalTw.g:6049:1: rule__Tweets_entity__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__Tweets_entity__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6053:1: ( ( ruleArgs ) )
            // InternalTw.g:6054:2: ( ruleArgs )
            {
            // InternalTw.g:6054:2: ( ruleArgs )
            // InternalTw.g:6055:3: ruleArgs
            {
             before(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__ArgsAssignment_3_0"


    // $ANTLR start "rule__Tweets_entity__ArgsAssignment_3_1_1"
    // InternalTw.g:6064:1: rule__Tweets_entity__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__Tweets_entity__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6068:1: ( ( ruleArgs ) )
            // InternalTw.g:6069:2: ( ruleArgs )
            {
            // InternalTw.g:6069:2: ( ruleArgs )
            // InternalTw.g:6070:3: ruleArgs
            {
             before(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__Tweets_date__ArgsAssignment_3_0"
    // InternalTw.g:6079:1: rule__Tweets_date__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__Tweets_date__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6083:1: ( ( ruleArgs ) )
            // InternalTw.g:6084:2: ( ruleArgs )
            {
            // InternalTw.g:6084:2: ( ruleArgs )
            // InternalTw.g:6085:3: ruleArgs
            {
             before(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__ArgsAssignment_3_0"


    // $ANTLR start "rule__Tweets_date__ArgsAssignment_3_1_1"
    // InternalTw.g:6094:1: rule__Tweets_date__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__Tweets_date__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6098:1: ( ( ruleArgs ) )
            // InternalTw.g:6099:2: ( ruleArgs )
            {
            // InternalTw.g:6099:2: ( ruleArgs )
            // InternalTw.g:6100:3: ruleArgs
            {
             before(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__ProportionPositif__ArgsAssignment_3_0"
    // InternalTw.g:6109:1: rule__ProportionPositif__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__ProportionPositif__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6113:1: ( ( ruleArgs ) )
            // InternalTw.g:6114:2: ( ruleArgs )
            {
            // InternalTw.g:6114:2: ( ruleArgs )
            // InternalTw.g:6115:3: ruleArgs
            {
             before(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__ArgsAssignment_3_0"


    // $ANTLR start "rule__ProportionPositif__ArgsAssignment_3_1_1"
    // InternalTw.g:6124:1: rule__ProportionPositif__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__ProportionPositif__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6128:1: ( ( ruleArgs ) )
            // InternalTw.g:6129:2: ( ruleArgs )
            {
            // InternalTw.g:6129:2: ( ruleArgs )
            // InternalTw.g:6130:3: ruleArgs
            {
             before(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__ProportionNegatif__ArgsAssignment_3_0"
    // InternalTw.g:6139:1: rule__ProportionNegatif__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__ProportionNegatif__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6143:1: ( ( ruleArgs ) )
            // InternalTw.g:6144:2: ( ruleArgs )
            {
            // InternalTw.g:6144:2: ( ruleArgs )
            // InternalTw.g:6145:3: ruleArgs
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__ArgsAssignment_3_0"


    // $ANTLR start "rule__ProportionNegatif__ArgsAssignment_3_1_1"
    // InternalTw.g:6154:1: rule__ProportionNegatif__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__ProportionNegatif__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6158:1: ( ( ruleArgs ) )
            // InternalTw.g:6159:2: ( ruleArgs )
            {
            // InternalTw.g:6159:2: ( ruleArgs )
            // InternalTw.g:6160:3: ruleArgs
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__CountTweet__ArgsAssignment_3_0"
    // InternalTw.g:6169:1: rule__CountTweet__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__CountTweet__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6173:1: ( ( ruleArgs ) )
            // InternalTw.g:6174:2: ( ruleArgs )
            {
            // InternalTw.g:6174:2: ( ruleArgs )
            // InternalTw.g:6175:3: ruleArgs
            {
             before(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__ArgsAssignment_3_0"


    // $ANTLR start "rule__CountTweet__ArgsAssignment_3_1_1"
    // InternalTw.g:6184:1: rule__CountTweet__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__CountTweet__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6188:1: ( ( ruleArgs ) )
            // InternalTw.g:6189:2: ( ruleArgs )
            {
            // InternalTw.g:6189:2: ( ruleArgs )
            // InternalTw.g:6190:3: ruleArgs
            {
             before(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__CountVisitProfil__ArgsAssignment_3_0"
    // InternalTw.g:6199:1: rule__CountVisitProfil__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__CountVisitProfil__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6203:1: ( ( ruleArgs ) )
            // InternalTw.g:6204:2: ( ruleArgs )
            {
            // InternalTw.g:6204:2: ( ruleArgs )
            // InternalTw.g:6205:3: ruleArgs
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__ArgsAssignment_3_0"


    // $ANTLR start "rule__CountVisitProfil__ArgsAssignment_3_1_1"
    // InternalTw.g:6214:1: rule__CountVisitProfil__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__CountVisitProfil__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6218:1: ( ( ruleArgs ) )
            // InternalTw.g:6219:2: ( ruleArgs )
            {
            // InternalTw.g:6219:2: ( ruleArgs )
            // InternalTw.g:6220:3: ruleArgs
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__CroissanceAbonne__ArgsAssignment_3_0"
    // InternalTw.g:6229:1: rule__CroissanceAbonne__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__CroissanceAbonne__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6233:1: ( ( ruleArgs ) )
            // InternalTw.g:6234:2: ( ruleArgs )
            {
            // InternalTw.g:6234:2: ( ruleArgs )
            // InternalTw.g:6235:3: ruleArgs
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__ArgsAssignment_3_0"


    // $ANTLR start "rule__CroissanceAbonne__ArgsAssignment_3_1_1"
    // InternalTw.g:6244:1: rule__CroissanceAbonne__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__CroissanceAbonne__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6248:1: ( ( ruleArgs ) )
            // InternalTw.g:6249:2: ( ruleArgs )
            {
            // InternalTw.g:6249:2: ( ruleArgs )
            // InternalTw.g:6250:3: ruleArgs
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__MoyFollowers__ArgsAssignment_3_0"
    // InternalTw.g:6259:1: rule__MoyFollowers__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__MoyFollowers__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6263:1: ( ( ruleArgs ) )
            // InternalTw.g:6264:2: ( ruleArgs )
            {
            // InternalTw.g:6264:2: ( ruleArgs )
            // InternalTw.g:6265:3: ruleArgs
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__ArgsAssignment_3_0"


    // $ANTLR start "rule__MoyFollowers__ArgsAssignment_3_1_1"
    // InternalTw.g:6274:1: rule__MoyFollowers__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__MoyFollowers__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6278:1: ( ( ruleArgs ) )
            // InternalTw.g:6279:2: ( ruleArgs )
            {
            // InternalTw.g:6279:2: ( ruleArgs )
            // InternalTw.g:6280:3: ruleArgs
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__MoyFavorited__ArgsAssignment_3_0"
    // InternalTw.g:6289:1: rule__MoyFavorited__ArgsAssignment_3_0 : ( ruleArgs ) ;
    public final void rule__MoyFavorited__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6293:1: ( ( ruleArgs ) )
            // InternalTw.g:6294:2: ( ruleArgs )
            {
            // InternalTw.g:6294:2: ( ruleArgs )
            // InternalTw.g:6295:3: ruleArgs
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__ArgsAssignment_3_0"


    // $ANTLR start "rule__MoyFavorited__ArgsAssignment_3_1_1"
    // InternalTw.g:6304:1: rule__MoyFavorited__ArgsAssignment_3_1_1 : ( ruleArgs ) ;
    public final void rule__MoyFavorited__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6308:1: ( ( ruleArgs ) )
            // InternalTw.g:6309:2: ( ruleArgs )
            {
            // InternalTw.g:6309:2: ( ruleArgs )
            // InternalTw.g:6310:3: ruleArgs
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__GREATER__Exp1Assignment_2"
    // InternalTw.g:6319:1: rule__GREATER__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__GREATER__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6323:1: ( ( ruleExpression ) )
            // InternalTw.g:6324:2: ( ruleExpression )
            {
            // InternalTw.g:6324:2: ( ruleExpression )
            // InternalTw.g:6325:3: ruleExpression
            {
             before(grammarAccess.getGREATERAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGREATERAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Exp1Assignment_2"


    // $ANTLR start "rule__GREATER__Exp2Assignment_4"
    // InternalTw.g:6334:1: rule__GREATER__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__GREATER__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6338:1: ( ( ruleExpression ) )
            // InternalTw.g:6339:2: ( ruleExpression )
            {
            // InternalTw.g:6339:2: ( ruleExpression )
            // InternalTw.g:6340:3: ruleExpression
            {
             before(grammarAccess.getGREATERAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGREATERAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER__Exp2Assignment_4"


    // $ANTLR start "rule__LESS__Exp1Assignment_2"
    // InternalTw.g:6349:1: rule__LESS__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__LESS__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6353:1: ( ( ruleExpression ) )
            // InternalTw.g:6354:2: ( ruleExpression )
            {
            // InternalTw.g:6354:2: ( ruleExpression )
            // InternalTw.g:6355:3: ruleExpression
            {
             before(grammarAccess.getLESSAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLESSAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Exp1Assignment_2"


    // $ANTLR start "rule__LESS__Exp2Assignment_4"
    // InternalTw.g:6364:1: rule__LESS__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__LESS__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6368:1: ( ( ruleExpression ) )
            // InternalTw.g:6369:2: ( ruleExpression )
            {
            // InternalTw.g:6369:2: ( ruleExpression )
            // InternalTw.g:6370:3: ruleExpression
            {
             before(grammarAccess.getLESSAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLESSAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESS__Exp2Assignment_4"


    // $ANTLR start "rule__EQUALS__Exp1Assignment_2"
    // InternalTw.g:6379:1: rule__EQUALS__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__EQUALS__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6383:1: ( ( ruleExpression ) )
            // InternalTw.g:6384:2: ( ruleExpression )
            {
            // InternalTw.g:6384:2: ( ruleExpression )
            // InternalTw.g:6385:3: ruleExpression
            {
             before(grammarAccess.getEQUALSAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEQUALSAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Exp1Assignment_2"


    // $ANTLR start "rule__EQUALS__Exp2Assignment_4"
    // InternalTw.g:6394:1: rule__EQUALS__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__EQUALS__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6398:1: ( ( ruleExpression ) )
            // InternalTw.g:6399:2: ( ruleExpression )
            {
            // InternalTw.g:6399:2: ( ruleExpression )
            // InternalTw.g:6400:3: ruleExpression
            {
             before(grammarAccess.getEQUALSAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEQUALSAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Exp2Assignment_4"


    // $ANTLR start "rule__UtilisationVar__NameVarAssignment"
    // InternalTw.g:6409:1: rule__UtilisationVar__NameVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UtilisationVar__NameVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6413:1: ( ( ( RULE_ID ) ) )
            // InternalTw.g:6414:2: ( ( RULE_ID ) )
            {
            // InternalTw.g:6414:2: ( ( RULE_ID ) )
            // InternalTw.g:6415:3: ( RULE_ID )
            {
             before(grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarCrossReference_0()); 
            // InternalTw.g:6416:3: ( RULE_ID )
            // InternalTw.g:6417:4: RULE_ID
            {
             before(grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilisationVar__NameVarAssignment"


    // $ANTLR start "rule__Print__ExpressionAssignment_2"
    // InternalTw.g:6428:1: rule__Print__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Print__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6432:1: ( ( ruleExpression ) )
            // InternalTw.g:6433:2: ( ruleExpression )
            {
            // InternalTw.g:6433:2: ( ruleExpression )
            // InternalTw.g:6434:3: ruleExpression
            {
             before(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__ExpressionAssignment_2"


    // $ANTLR start "rule__StringTw__StringTwAssignment"
    // InternalTw.g:6443:1: rule__StringTw__StringTwAssignment : ( RULE_STRING ) ;
    public final void rule__StringTw__StringTwAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6447:1: ( ( RULE_STRING ) )
            // InternalTw.g:6448:2: ( RULE_STRING )
            {
            // InternalTw.g:6448:2: ( RULE_STRING )
            // InternalTw.g:6449:3: RULE_STRING
            {
             before(grammarAccess.getStringTwAccess().getStringTwSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringTwAccess().getStringTwSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTw__StringTwAssignment"


    // $ANTLR start "rule__ADD__Exp1Assignment_2"
    // InternalTw.g:6458:1: rule__ADD__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__ADD__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6462:1: ( ( ruleExpression ) )
            // InternalTw.g:6463:2: ( ruleExpression )
            {
            // InternalTw.g:6463:2: ( ruleExpression )
            // InternalTw.g:6464:3: ruleExpression
            {
             before(grammarAccess.getADDAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getADDAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Exp1Assignment_2"


    // $ANTLR start "rule__ADD__Exp2Assignment_4"
    // InternalTw.g:6473:1: rule__ADD__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__ADD__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6477:1: ( ( ruleExpression ) )
            // InternalTw.g:6478:2: ( ruleExpression )
            {
            // InternalTw.g:6478:2: ( ruleExpression )
            // InternalTw.g:6479:3: ruleExpression
            {
             before(grammarAccess.getADDAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getADDAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Exp2Assignment_4"


    // $ANTLR start "rule__MUL__Exp1Assignment_2"
    // InternalTw.g:6488:1: rule__MUL__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__MUL__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6492:1: ( ( ruleExpression ) )
            // InternalTw.g:6493:2: ( ruleExpression )
            {
            // InternalTw.g:6493:2: ( ruleExpression )
            // InternalTw.g:6494:3: ruleExpression
            {
             before(grammarAccess.getMULAccess().getExp1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMULAccess().getExp1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Exp1Assignment_2"


    // $ANTLR start "rule__MUL__Exp2Assignment_4"
    // InternalTw.g:6503:1: rule__MUL__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__MUL__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6507:1: ( ( ruleExpression ) )
            // InternalTw.g:6508:2: ( ruleExpression )
            {
            // InternalTw.g:6508:2: ( ruleExpression )
            // InternalTw.g:6509:3: ruleExpression
            {
             before(grammarAccess.getMULAccess().getExp2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMULAccess().getExp2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MUL__Exp2Assignment_4"


    // $ANTLR start "rule__Args__ExpressionAssignment"
    // InternalTw.g:6518:1: rule__Args__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__Args__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6522:1: ( ( ruleExpression ) )
            // InternalTw.g:6523:2: ( ruleExpression )
            {
            // InternalTw.g:6523:2: ( ruleExpression )
            // InternalTw.g:6524:3: ruleExpression
            {
             before(grammarAccess.getArgsAccess().getExpressionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArgsAccess().getExpressionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__ExpressionAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "802:1: rule__Statement__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleDeclarationVar ) | ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleprint ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000FFFFD8B030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000FFFFD89030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001C00500000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}