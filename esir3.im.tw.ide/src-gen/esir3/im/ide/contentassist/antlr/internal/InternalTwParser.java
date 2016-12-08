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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'}'", "';'", "'if'", "'('", "')'", "'else'", "':='", "'AND'", "','", "'OR'", "'tweets_user'", "'tweets_location'", "'tweets_entity'", "'tweets_date'", "'ProportionPositif'", "'ProportionNegatif'", "'countTweet'", "'countVisitProfil'", "'CroissanceAbonne'", "'moyFollowers'", "'moyFavorited'", "'GREATER'", "'LESS'", "'EQUALS'", "'print'", "'ADD'", "'MUL'"
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


    // $ANTLR start "entryRuleString0"
    // InternalTw.g:753:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalTw.g:754:1: ( ruleString0 EOF )
            // InternalTw.g:755:1: ruleString0 EOF
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
    // InternalTw.g:762:1: ruleString0 : ( RULE_ID ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:766:2: ( ( RULE_ID ) )
            // InternalTw.g:767:2: ( RULE_ID )
            {
            // InternalTw.g:767:2: ( RULE_ID )
            // InternalTw.g:768:3: RULE_ID
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
    // InternalTw.g:777:1: rule__Statement__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleDeclarationVar ) | ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleprint ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:781:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleDeclarationVar ) | ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleprint ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) )
            int alt1=24;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalTw.g:782:2: ( ruleBlock )
                    {
                    // InternalTw.g:782:2: ( ruleBlock )
                    // InternalTw.g:783:3: ruleBlock
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
                    // InternalTw.g:788:2: ( ruleIf )
                    {
                    // InternalTw.g:788:2: ( ruleIf )
                    // InternalTw.g:789:3: ruleIf
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
                    // InternalTw.g:794:2: ( ruleDeclarationVar )
                    {
                    // InternalTw.g:794:2: ( ruleDeclarationVar )
                    // InternalTw.g:795:3: ruleDeclarationVar
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
                    // InternalTw.g:800:2: ( ruleAND )
                    {
                    // InternalTw.g:800:2: ( ruleAND )
                    // InternalTw.g:801:3: ruleAND
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
                    // InternalTw.g:806:2: ( ruleOR )
                    {
                    // InternalTw.g:806:2: ( ruleOR )
                    // InternalTw.g:807:3: ruleOR
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
                    // InternalTw.g:812:2: ( ruletweets_user )
                    {
                    // InternalTw.g:812:2: ( ruletweets_user )
                    // InternalTw.g:813:3: ruletweets_user
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
                    // InternalTw.g:818:2: ( ruletweets_location )
                    {
                    // InternalTw.g:818:2: ( ruletweets_location )
                    // InternalTw.g:819:3: ruletweets_location
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
                    // InternalTw.g:824:2: ( ruletweets_entity )
                    {
                    // InternalTw.g:824:2: ( ruletweets_entity )
                    // InternalTw.g:825:3: ruletweets_entity
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
                    // InternalTw.g:830:2: ( ruletweets_date )
                    {
                    // InternalTw.g:830:2: ( ruletweets_date )
                    // InternalTw.g:831:3: ruletweets_date
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
                    // InternalTw.g:836:2: ( ruleProportionPositif )
                    {
                    // InternalTw.g:836:2: ( ruleProportionPositif )
                    // InternalTw.g:837:3: ruleProportionPositif
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
                    // InternalTw.g:842:2: ( ruleProportionNegatif )
                    {
                    // InternalTw.g:842:2: ( ruleProportionNegatif )
                    // InternalTw.g:843:3: ruleProportionNegatif
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
                    // InternalTw.g:848:2: ( rulecountTweet )
                    {
                    // InternalTw.g:848:2: ( rulecountTweet )
                    // InternalTw.g:849:3: rulecountTweet
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
                    // InternalTw.g:854:2: ( rulecountVisitProfil )
                    {
                    // InternalTw.g:854:2: ( rulecountVisitProfil )
                    // InternalTw.g:855:3: rulecountVisitProfil
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
                    // InternalTw.g:860:2: ( ruleCroissanceAbonne )
                    {
                    // InternalTw.g:860:2: ( ruleCroissanceAbonne )
                    // InternalTw.g:861:3: ruleCroissanceAbonne
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
                    // InternalTw.g:866:2: ( rulemoyFollowers )
                    {
                    // InternalTw.g:866:2: ( rulemoyFollowers )
                    // InternalTw.g:867:3: rulemoyFollowers
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
                    // InternalTw.g:872:2: ( rulemoyFavorited )
                    {
                    // InternalTw.g:872:2: ( rulemoyFavorited )
                    // InternalTw.g:873:3: rulemoyFavorited
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
                    // InternalTw.g:878:2: ( ruleGREATER )
                    {
                    // InternalTw.g:878:2: ( ruleGREATER )
                    // InternalTw.g:879:3: ruleGREATER
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
                    // InternalTw.g:884:2: ( ruleLESS )
                    {
                    // InternalTw.g:884:2: ( ruleLESS )
                    // InternalTw.g:885:3: ruleLESS
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
                    // InternalTw.g:890:2: ( ruleEQUALS )
                    {
                    // InternalTw.g:890:2: ( ruleEQUALS )
                    // InternalTw.g:891:3: ruleEQUALS
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
                    // InternalTw.g:896:2: ( ruleUtilisationVar )
                    {
                    // InternalTw.g:896:2: ( ruleUtilisationVar )
                    // InternalTw.g:897:3: ruleUtilisationVar
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
                    // InternalTw.g:902:2: ( ruleprint )
                    {
                    // InternalTw.g:902:2: ( ruleprint )
                    // InternalTw.g:903:3: ruleprint
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
                    // InternalTw.g:908:2: ( ruleStringTw )
                    {
                    // InternalTw.g:908:2: ( ruleStringTw )
                    // InternalTw.g:909:3: ruleStringTw
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
                    // InternalTw.g:914:2: ( ruleADD )
                    {
                    // InternalTw.g:914:2: ( ruleADD )
                    // InternalTw.g:915:3: ruleADD
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
                    // InternalTw.g:920:2: ( ruleMUL )
                    {
                    // InternalTw.g:920:2: ( ruleMUL )
                    // InternalTw.g:921:3: ruleMUL
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
    // InternalTw.g:930:1: rule__OpBool__Alternatives : ( ( ruleAND ) | ( ruleOR ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) );
    public final void rule__OpBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:934:1: ( ( ruleAND ) | ( ruleOR ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) )
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
                    // InternalTw.g:935:2: ( ruleAND )
                    {
                    // InternalTw.g:935:2: ( ruleAND )
                    // InternalTw.g:936:3: ruleAND
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
                    // InternalTw.g:941:2: ( ruleOR )
                    {
                    // InternalTw.g:941:2: ( ruleOR )
                    // InternalTw.g:942:3: ruleOR
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
                    // InternalTw.g:947:2: ( ruleGREATER )
                    {
                    // InternalTw.g:947:2: ( ruleGREATER )
                    // InternalTw.g:948:3: ruleGREATER
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
                    // InternalTw.g:953:2: ( ruleLESS )
                    {
                    // InternalTw.g:953:2: ( ruleLESS )
                    // InternalTw.g:954:3: ruleLESS
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
                    // InternalTw.g:959:2: ( ruleEQUALS )
                    {
                    // InternalTw.g:959:2: ( ruleEQUALS )
                    // InternalTw.g:960:3: ruleEQUALS
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
    // InternalTw.g:969:1: rule__Expression__Alternatives : ( ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:973:1: ( ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) )
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
                    // InternalTw.g:974:2: ( ruleAND )
                    {
                    // InternalTw.g:974:2: ( ruleAND )
                    // InternalTw.g:975:3: ruleAND
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
                    // InternalTw.g:980:2: ( ruleOR )
                    {
                    // InternalTw.g:980:2: ( ruleOR )
                    // InternalTw.g:981:3: ruleOR
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
                    // InternalTw.g:986:2: ( ruletweets_user )
                    {
                    // InternalTw.g:986:2: ( ruletweets_user )
                    // InternalTw.g:987:3: ruletweets_user
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
                    // InternalTw.g:992:2: ( ruletweets_location )
                    {
                    // InternalTw.g:992:2: ( ruletweets_location )
                    // InternalTw.g:993:3: ruletweets_location
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
                    // InternalTw.g:998:2: ( ruletweets_entity )
                    {
                    // InternalTw.g:998:2: ( ruletweets_entity )
                    // InternalTw.g:999:3: ruletweets_entity
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
                    // InternalTw.g:1004:2: ( ruletweets_date )
                    {
                    // InternalTw.g:1004:2: ( ruletweets_date )
                    // InternalTw.g:1005:3: ruletweets_date
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
                    // InternalTw.g:1010:2: ( ruleProportionPositif )
                    {
                    // InternalTw.g:1010:2: ( ruleProportionPositif )
                    // InternalTw.g:1011:3: ruleProportionPositif
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
                    // InternalTw.g:1016:2: ( ruleProportionNegatif )
                    {
                    // InternalTw.g:1016:2: ( ruleProportionNegatif )
                    // InternalTw.g:1017:3: ruleProportionNegatif
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
                    // InternalTw.g:1022:2: ( rulecountTweet )
                    {
                    // InternalTw.g:1022:2: ( rulecountTweet )
                    // InternalTw.g:1023:3: rulecountTweet
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
                    // InternalTw.g:1028:2: ( rulecountVisitProfil )
                    {
                    // InternalTw.g:1028:2: ( rulecountVisitProfil )
                    // InternalTw.g:1029:3: rulecountVisitProfil
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
                    // InternalTw.g:1034:2: ( ruleCroissanceAbonne )
                    {
                    // InternalTw.g:1034:2: ( ruleCroissanceAbonne )
                    // InternalTw.g:1035:3: ruleCroissanceAbonne
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
                    // InternalTw.g:1040:2: ( rulemoyFollowers )
                    {
                    // InternalTw.g:1040:2: ( rulemoyFollowers )
                    // InternalTw.g:1041:3: rulemoyFollowers
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
                    // InternalTw.g:1046:2: ( rulemoyFavorited )
                    {
                    // InternalTw.g:1046:2: ( rulemoyFavorited )
                    // InternalTw.g:1047:3: rulemoyFavorited
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
                    // InternalTw.g:1052:2: ( ruleGREATER )
                    {
                    // InternalTw.g:1052:2: ( ruleGREATER )
                    // InternalTw.g:1053:3: ruleGREATER
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
                    // InternalTw.g:1058:2: ( ruleLESS )
                    {
                    // InternalTw.g:1058:2: ( ruleLESS )
                    // InternalTw.g:1059:3: ruleLESS
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
                    // InternalTw.g:1064:2: ( ruleEQUALS )
                    {
                    // InternalTw.g:1064:2: ( ruleEQUALS )
                    // InternalTw.g:1065:3: ruleEQUALS
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
                    // InternalTw.g:1070:2: ( ruleUtilisationVar )
                    {
                    // InternalTw.g:1070:2: ( ruleUtilisationVar )
                    // InternalTw.g:1071:3: ruleUtilisationVar
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
                    // InternalTw.g:1076:2: ( ruleStringTw )
                    {
                    // InternalTw.g:1076:2: ( ruleStringTw )
                    // InternalTw.g:1077:3: ruleStringTw
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
                    // InternalTw.g:1082:2: ( ruleADD )
                    {
                    // InternalTw.g:1082:2: ( ruleADD )
                    // InternalTw.g:1083:3: ruleADD
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
                    // InternalTw.g:1088:2: ( ruleMUL )
                    {
                    // InternalTw.g:1088:2: ( ruleMUL )
                    // InternalTw.g:1089:3: ruleMUL
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
    // InternalTw.g:1098:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1102:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalTw.g:1103:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalTw.g:1110:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1114:1: ( ( () ) )
            // InternalTw.g:1115:1: ( () )
            {
            // InternalTw.g:1115:1: ( () )
            // InternalTw.g:1116:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalTw.g:1117:2: ()
            // InternalTw.g:1117:3: 
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
    // InternalTw.g:1125:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1129:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalTw.g:1130:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalTw.g:1137:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1141:1: ( ( 'Program' ) )
            // InternalTw.g:1142:1: ( 'Program' )
            {
            // InternalTw.g:1142:1: ( 'Program' )
            // InternalTw.g:1143:2: 'Program'
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
    // InternalTw.g:1152:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1156:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalTw.g:1157:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalTw.g:1164:1: rule__Program__Group__2__Impl : ( '{' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1168:1: ( ( '{' ) )
            // InternalTw.g:1169:1: ( '{' )
            {
            // InternalTw.g:1169:1: ( '{' )
            // InternalTw.g:1170:2: '{'
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
    // InternalTw.g:1179:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1183:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalTw.g:1184:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalTw.g:1191:1: rule__Program__Group__3__Impl : ( ( rule__Program__Group_3__0 )? ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1195:1: ( ( ( rule__Program__Group_3__0 )? ) )
            // InternalTw.g:1196:1: ( ( rule__Program__Group_3__0 )? )
            {
            // InternalTw.g:1196:1: ( ( rule__Program__Group_3__0 )? )
            // InternalTw.g:1197:2: ( rule__Program__Group_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_3()); 
            // InternalTw.g:1198:2: ( rule__Program__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==12||LA4_0==15||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=22 && LA4_0<=39)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTw.g:1198:3: rule__Program__Group_3__0
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
    // InternalTw.g:1206:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1210:1: ( rule__Program__Group__4__Impl )
            // InternalTw.g:1211:2: rule__Program__Group__4__Impl
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
    // InternalTw.g:1217:1: rule__Program__Group__4__Impl : ( '}' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1221:1: ( ( '}' ) )
            // InternalTw.g:1222:1: ( '}' )
            {
            // InternalTw.g:1222:1: ( '}' )
            // InternalTw.g:1223:2: '}'
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
    // InternalTw.g:1233:1: rule__Program__Group_3__0 : rule__Program__Group_3__0__Impl rule__Program__Group_3__1 ;
    public final void rule__Program__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1237:1: ( rule__Program__Group_3__0__Impl rule__Program__Group_3__1 )
            // InternalTw.g:1238:2: rule__Program__Group_3__0__Impl rule__Program__Group_3__1
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
    // InternalTw.g:1245:1: rule__Program__Group_3__0__Impl : ( ( rule__Program__StatementAssignment_3_0 ) ) ;
    public final void rule__Program__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1249:1: ( ( ( rule__Program__StatementAssignment_3_0 ) ) )
            // InternalTw.g:1250:1: ( ( rule__Program__StatementAssignment_3_0 ) )
            {
            // InternalTw.g:1250:1: ( ( rule__Program__StatementAssignment_3_0 ) )
            // InternalTw.g:1251:2: ( rule__Program__StatementAssignment_3_0 )
            {
             before(grammarAccess.getProgramAccess().getStatementAssignment_3_0()); 
            // InternalTw.g:1252:2: ( rule__Program__StatementAssignment_3_0 )
            // InternalTw.g:1252:3: rule__Program__StatementAssignment_3_0
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
    // InternalTw.g:1260:1: rule__Program__Group_3__1 : rule__Program__Group_3__1__Impl ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1264:1: ( rule__Program__Group_3__1__Impl )
            // InternalTw.g:1265:2: rule__Program__Group_3__1__Impl
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
    // InternalTw.g:1271:1: rule__Program__Group_3__1__Impl : ( ( rule__Program__Group_3_1__0 )* ) ;
    public final void rule__Program__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1275:1: ( ( ( rule__Program__Group_3_1__0 )* ) )
            // InternalTw.g:1276:1: ( ( rule__Program__Group_3_1__0 )* )
            {
            // InternalTw.g:1276:1: ( ( rule__Program__Group_3_1__0 )* )
            // InternalTw.g:1277:2: ( rule__Program__Group_3_1__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_3_1()); 
            // InternalTw.g:1278:2: ( rule__Program__Group_3_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTw.g:1278:3: rule__Program__Group_3_1__0
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
    // InternalTw.g:1287:1: rule__Program__Group_3_1__0 : rule__Program__Group_3_1__0__Impl rule__Program__Group_3_1__1 ;
    public final void rule__Program__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1291:1: ( rule__Program__Group_3_1__0__Impl rule__Program__Group_3_1__1 )
            // InternalTw.g:1292:2: rule__Program__Group_3_1__0__Impl rule__Program__Group_3_1__1
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
    // InternalTw.g:1299:1: rule__Program__Group_3_1__0__Impl : ( ';' ) ;
    public final void rule__Program__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1303:1: ( ( ';' ) )
            // InternalTw.g:1304:1: ( ';' )
            {
            // InternalTw.g:1304:1: ( ';' )
            // InternalTw.g:1305:2: ';'
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
    // InternalTw.g:1314:1: rule__Program__Group_3_1__1 : rule__Program__Group_3_1__1__Impl ;
    public final void rule__Program__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1318:1: ( rule__Program__Group_3_1__1__Impl )
            // InternalTw.g:1319:2: rule__Program__Group_3_1__1__Impl
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
    // InternalTw.g:1325:1: rule__Program__Group_3_1__1__Impl : ( ( rule__Program__StatementAssignment_3_1_1 ) ) ;
    public final void rule__Program__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1329:1: ( ( ( rule__Program__StatementAssignment_3_1_1 ) ) )
            // InternalTw.g:1330:1: ( ( rule__Program__StatementAssignment_3_1_1 ) )
            {
            // InternalTw.g:1330:1: ( ( rule__Program__StatementAssignment_3_1_1 ) )
            // InternalTw.g:1331:2: ( rule__Program__StatementAssignment_3_1_1 )
            {
             before(grammarAccess.getProgramAccess().getStatementAssignment_3_1_1()); 
            // InternalTw.g:1332:2: ( rule__Program__StatementAssignment_3_1_1 )
            // InternalTw.g:1332:3: rule__Program__StatementAssignment_3_1_1
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
    // InternalTw.g:1341:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1345:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalTw.g:1346:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalTw.g:1353:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1357:1: ( ( () ) )
            // InternalTw.g:1358:1: ( () )
            {
            // InternalTw.g:1358:1: ( () )
            // InternalTw.g:1359:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalTw.g:1360:2: ()
            // InternalTw.g:1360:3: 
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
    // InternalTw.g:1368:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1372:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalTw.g:1373:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalTw.g:1380:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1384:1: ( ( '{' ) )
            // InternalTw.g:1385:1: ( '{' )
            {
            // InternalTw.g:1385:1: ( '{' )
            // InternalTw.g:1386:2: '{'
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
    // InternalTw.g:1395:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1399:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalTw.g:1400:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalTw.g:1407:1: rule__Block__Group__2__Impl : ( ( rule__Block__Group_2__0 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1411:1: ( ( ( rule__Block__Group_2__0 )? ) )
            // InternalTw.g:1412:1: ( ( rule__Block__Group_2__0 )? )
            {
            // InternalTw.g:1412:1: ( ( rule__Block__Group_2__0 )? )
            // InternalTw.g:1413:2: ( rule__Block__Group_2__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_2()); 
            // InternalTw.g:1414:2: ( rule__Block__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==12||LA6_0==15||(LA6_0>=19 && LA6_0<=20)||(LA6_0>=22 && LA6_0<=39)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTw.g:1414:3: rule__Block__Group_2__0
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
    // InternalTw.g:1422:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1426:1: ( rule__Block__Group__3__Impl )
            // InternalTw.g:1427:2: rule__Block__Group__3__Impl
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
    // InternalTw.g:1433:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1437:1: ( ( '}' ) )
            // InternalTw.g:1438:1: ( '}' )
            {
            // InternalTw.g:1438:1: ( '}' )
            // InternalTw.g:1439:2: '}'
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
    // InternalTw.g:1449:1: rule__Block__Group_2__0 : rule__Block__Group_2__0__Impl rule__Block__Group_2__1 ;
    public final void rule__Block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1453:1: ( rule__Block__Group_2__0__Impl rule__Block__Group_2__1 )
            // InternalTw.g:1454:2: rule__Block__Group_2__0__Impl rule__Block__Group_2__1
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
    // InternalTw.g:1461:1: rule__Block__Group_2__0__Impl : ( ( rule__Block__StatementAssignment_2_0 ) ) ;
    public final void rule__Block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1465:1: ( ( ( rule__Block__StatementAssignment_2_0 ) ) )
            // InternalTw.g:1466:1: ( ( rule__Block__StatementAssignment_2_0 ) )
            {
            // InternalTw.g:1466:1: ( ( rule__Block__StatementAssignment_2_0 ) )
            // InternalTw.g:1467:2: ( rule__Block__StatementAssignment_2_0 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_2_0()); 
            // InternalTw.g:1468:2: ( rule__Block__StatementAssignment_2_0 )
            // InternalTw.g:1468:3: rule__Block__StatementAssignment_2_0
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
    // InternalTw.g:1476:1: rule__Block__Group_2__1 : rule__Block__Group_2__1__Impl ;
    public final void rule__Block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1480:1: ( rule__Block__Group_2__1__Impl )
            // InternalTw.g:1481:2: rule__Block__Group_2__1__Impl
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
    // InternalTw.g:1487:1: rule__Block__Group_2__1__Impl : ( ( rule__Block__Group_2_1__0 )* ) ;
    public final void rule__Block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1491:1: ( ( ( rule__Block__Group_2_1__0 )* ) )
            // InternalTw.g:1492:1: ( ( rule__Block__Group_2_1__0 )* )
            {
            // InternalTw.g:1492:1: ( ( rule__Block__Group_2_1__0 )* )
            // InternalTw.g:1493:2: ( rule__Block__Group_2_1__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_2_1()); 
            // InternalTw.g:1494:2: ( rule__Block__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTw.g:1494:3: rule__Block__Group_2_1__0
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
    // InternalTw.g:1503:1: rule__Block__Group_2_1__0 : rule__Block__Group_2_1__0__Impl rule__Block__Group_2_1__1 ;
    public final void rule__Block__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1507:1: ( rule__Block__Group_2_1__0__Impl rule__Block__Group_2_1__1 )
            // InternalTw.g:1508:2: rule__Block__Group_2_1__0__Impl rule__Block__Group_2_1__1
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
    // InternalTw.g:1515:1: rule__Block__Group_2_1__0__Impl : ( ';' ) ;
    public final void rule__Block__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1519:1: ( ( ';' ) )
            // InternalTw.g:1520:1: ( ';' )
            {
            // InternalTw.g:1520:1: ( ';' )
            // InternalTw.g:1521:2: ';'
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
    // InternalTw.g:1530:1: rule__Block__Group_2_1__1 : rule__Block__Group_2_1__1__Impl ;
    public final void rule__Block__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1534:1: ( rule__Block__Group_2_1__1__Impl )
            // InternalTw.g:1535:2: rule__Block__Group_2_1__1__Impl
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
    // InternalTw.g:1541:1: rule__Block__Group_2_1__1__Impl : ( ( rule__Block__StatementAssignment_2_1_1 ) ) ;
    public final void rule__Block__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1545:1: ( ( ( rule__Block__StatementAssignment_2_1_1 ) ) )
            // InternalTw.g:1546:1: ( ( rule__Block__StatementAssignment_2_1_1 ) )
            {
            // InternalTw.g:1546:1: ( ( rule__Block__StatementAssignment_2_1_1 ) )
            // InternalTw.g:1547:2: ( rule__Block__StatementAssignment_2_1_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_2_1_1()); 
            // InternalTw.g:1548:2: ( rule__Block__StatementAssignment_2_1_1 )
            // InternalTw.g:1548:3: rule__Block__StatementAssignment_2_1_1
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
    // InternalTw.g:1557:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1561:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalTw.g:1562:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalTw.g:1569:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1573:1: ( ( 'if' ) )
            // InternalTw.g:1574:1: ( 'if' )
            {
            // InternalTw.g:1574:1: ( 'if' )
            // InternalTw.g:1575:2: 'if'
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
    // InternalTw.g:1584:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1588:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalTw.g:1589:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalTw.g:1596:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1600:1: ( ( '(' ) )
            // InternalTw.g:1601:1: ( '(' )
            {
            // InternalTw.g:1601:1: ( '(' )
            // InternalTw.g:1602:2: '('
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
    // InternalTw.g:1611:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1615:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalTw.g:1616:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalTw.g:1623:1: rule__If__Group__2__Impl : ( ( rule__If__ConditionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1627:1: ( ( ( rule__If__ConditionAssignment_2 ) ) )
            // InternalTw.g:1628:1: ( ( rule__If__ConditionAssignment_2 ) )
            {
            // InternalTw.g:1628:1: ( ( rule__If__ConditionAssignment_2 ) )
            // InternalTw.g:1629:2: ( rule__If__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            // InternalTw.g:1630:2: ( rule__If__ConditionAssignment_2 )
            // InternalTw.g:1630:3: rule__If__ConditionAssignment_2
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
    // InternalTw.g:1638:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1642:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalTw.g:1643:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalTw.g:1650:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1654:1: ( ( ')' ) )
            // InternalTw.g:1655:1: ( ')' )
            {
            // InternalTw.g:1655:1: ( ')' )
            // InternalTw.g:1656:2: ')'
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
    // InternalTw.g:1665:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1669:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalTw.g:1670:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalTw.g:1677:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1681:1: ( ( ( rule__If__IfBlockAssignment_4 ) ) )
            // InternalTw.g:1682:1: ( ( rule__If__IfBlockAssignment_4 ) )
            {
            // InternalTw.g:1682:1: ( ( rule__If__IfBlockAssignment_4 ) )
            // InternalTw.g:1683:2: ( rule__If__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalTw.g:1684:2: ( rule__If__IfBlockAssignment_4 )
            // InternalTw.g:1684:3: rule__If__IfBlockAssignment_4
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
    // InternalTw.g:1692:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1696:1: ( rule__If__Group__5__Impl )
            // InternalTw.g:1697:2: rule__If__Group__5__Impl
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
    // InternalTw.g:1703:1: rule__If__Group__5__Impl : ( ( rule__If__Group_5__0 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1707:1: ( ( ( rule__If__Group_5__0 )? ) )
            // InternalTw.g:1708:1: ( ( rule__If__Group_5__0 )? )
            {
            // InternalTw.g:1708:1: ( ( rule__If__Group_5__0 )? )
            // InternalTw.g:1709:2: ( rule__If__Group_5__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_5()); 
            // InternalTw.g:1710:2: ( rule__If__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTw.g:1710:3: rule__If__Group_5__0
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
    // InternalTw.g:1719:1: rule__If__Group_5__0 : rule__If__Group_5__0__Impl rule__If__Group_5__1 ;
    public final void rule__If__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1723:1: ( rule__If__Group_5__0__Impl rule__If__Group_5__1 )
            // InternalTw.g:1724:2: rule__If__Group_5__0__Impl rule__If__Group_5__1
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
    // InternalTw.g:1731:1: rule__If__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1735:1: ( ( 'else' ) )
            // InternalTw.g:1736:1: ( 'else' )
            {
            // InternalTw.g:1736:1: ( 'else' )
            // InternalTw.g:1737:2: 'else'
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
    // InternalTw.g:1746:1: rule__If__Group_5__1 : rule__If__Group_5__1__Impl ;
    public final void rule__If__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1750:1: ( rule__If__Group_5__1__Impl )
            // InternalTw.g:1751:2: rule__If__Group_5__1__Impl
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
    // InternalTw.g:1757:1: rule__If__Group_5__1__Impl : ( ( rule__If__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__If__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1761:1: ( ( ( rule__If__ElseBlockAssignment_5_1 ) ) )
            // InternalTw.g:1762:1: ( ( rule__If__ElseBlockAssignment_5_1 ) )
            {
            // InternalTw.g:1762:1: ( ( rule__If__ElseBlockAssignment_5_1 ) )
            // InternalTw.g:1763:2: ( rule__If__ElseBlockAssignment_5_1 )
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_5_1()); 
            // InternalTw.g:1764:2: ( rule__If__ElseBlockAssignment_5_1 )
            // InternalTw.g:1764:3: rule__If__ElseBlockAssignment_5_1
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
    // InternalTw.g:1773:1: rule__DeclarationVar__Group__0 : rule__DeclarationVar__Group__0__Impl rule__DeclarationVar__Group__1 ;
    public final void rule__DeclarationVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1777:1: ( rule__DeclarationVar__Group__0__Impl rule__DeclarationVar__Group__1 )
            // InternalTw.g:1778:2: rule__DeclarationVar__Group__0__Impl rule__DeclarationVar__Group__1
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
    // InternalTw.g:1785:1: rule__DeclarationVar__Group__0__Impl : ( ( rule__DeclarationVar__NameAssignment_0 )? ) ;
    public final void rule__DeclarationVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1789:1: ( ( ( rule__DeclarationVar__NameAssignment_0 )? ) )
            // InternalTw.g:1790:1: ( ( rule__DeclarationVar__NameAssignment_0 )? )
            {
            // InternalTw.g:1790:1: ( ( rule__DeclarationVar__NameAssignment_0 )? )
            // InternalTw.g:1791:2: ( rule__DeclarationVar__NameAssignment_0 )?
            {
             before(grammarAccess.getDeclarationVarAccess().getNameAssignment_0()); 
            // InternalTw.g:1792:2: ( rule__DeclarationVar__NameAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTw.g:1792:3: rule__DeclarationVar__NameAssignment_0
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
    // InternalTw.g:1800:1: rule__DeclarationVar__Group__1 : rule__DeclarationVar__Group__1__Impl rule__DeclarationVar__Group__2 ;
    public final void rule__DeclarationVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1804:1: ( rule__DeclarationVar__Group__1__Impl rule__DeclarationVar__Group__2 )
            // InternalTw.g:1805:2: rule__DeclarationVar__Group__1__Impl rule__DeclarationVar__Group__2
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
    // InternalTw.g:1812:1: rule__DeclarationVar__Group__1__Impl : ( ':=' ) ;
    public final void rule__DeclarationVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1816:1: ( ( ':=' ) )
            // InternalTw.g:1817:1: ( ':=' )
            {
            // InternalTw.g:1817:1: ( ':=' )
            // InternalTw.g:1818:2: ':='
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
    // InternalTw.g:1827:1: rule__DeclarationVar__Group__2 : rule__DeclarationVar__Group__2__Impl ;
    public final void rule__DeclarationVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1831:1: ( rule__DeclarationVar__Group__2__Impl )
            // InternalTw.g:1832:2: rule__DeclarationVar__Group__2__Impl
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
    // InternalTw.g:1838:1: rule__DeclarationVar__Group__2__Impl : ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) ) ;
    public final void rule__DeclarationVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1842:1: ( ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) ) )
            // InternalTw.g:1843:1: ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) )
            {
            // InternalTw.g:1843:1: ( ( rule__DeclarationVar__OpDroiteAssignment_2 ) )
            // InternalTw.g:1844:2: ( rule__DeclarationVar__OpDroiteAssignment_2 )
            {
             before(grammarAccess.getDeclarationVarAccess().getOpDroiteAssignment_2()); 
            // InternalTw.g:1845:2: ( rule__DeclarationVar__OpDroiteAssignment_2 )
            // InternalTw.g:1845:3: rule__DeclarationVar__OpDroiteAssignment_2
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
    // InternalTw.g:1854:1: rule__AND__Group__0 : rule__AND__Group__0__Impl rule__AND__Group__1 ;
    public final void rule__AND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1858:1: ( rule__AND__Group__0__Impl rule__AND__Group__1 )
            // InternalTw.g:1859:2: rule__AND__Group__0__Impl rule__AND__Group__1
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
    // InternalTw.g:1866:1: rule__AND__Group__0__Impl : ( 'AND' ) ;
    public final void rule__AND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1870:1: ( ( 'AND' ) )
            // InternalTw.g:1871:1: ( 'AND' )
            {
            // InternalTw.g:1871:1: ( 'AND' )
            // InternalTw.g:1872:2: 'AND'
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
    // InternalTw.g:1881:1: rule__AND__Group__1 : rule__AND__Group__1__Impl rule__AND__Group__2 ;
    public final void rule__AND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1885:1: ( rule__AND__Group__1__Impl rule__AND__Group__2 )
            // InternalTw.g:1886:2: rule__AND__Group__1__Impl rule__AND__Group__2
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
    // InternalTw.g:1893:1: rule__AND__Group__1__Impl : ( '(' ) ;
    public final void rule__AND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1897:1: ( ( '(' ) )
            // InternalTw.g:1898:1: ( '(' )
            {
            // InternalTw.g:1898:1: ( '(' )
            // InternalTw.g:1899:2: '('
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
    // InternalTw.g:1908:1: rule__AND__Group__2 : rule__AND__Group__2__Impl rule__AND__Group__3 ;
    public final void rule__AND__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1912:1: ( rule__AND__Group__2__Impl rule__AND__Group__3 )
            // InternalTw.g:1913:2: rule__AND__Group__2__Impl rule__AND__Group__3
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
    // InternalTw.g:1920:1: rule__AND__Group__2__Impl : ( ( rule__AND__Exp1Assignment_2 ) ) ;
    public final void rule__AND__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1924:1: ( ( ( rule__AND__Exp1Assignment_2 ) ) )
            // InternalTw.g:1925:1: ( ( rule__AND__Exp1Assignment_2 ) )
            {
            // InternalTw.g:1925:1: ( ( rule__AND__Exp1Assignment_2 ) )
            // InternalTw.g:1926:2: ( rule__AND__Exp1Assignment_2 )
            {
             before(grammarAccess.getANDAccess().getExp1Assignment_2()); 
            // InternalTw.g:1927:2: ( rule__AND__Exp1Assignment_2 )
            // InternalTw.g:1927:3: rule__AND__Exp1Assignment_2
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
    // InternalTw.g:1935:1: rule__AND__Group__3 : rule__AND__Group__3__Impl rule__AND__Group__4 ;
    public final void rule__AND__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1939:1: ( rule__AND__Group__3__Impl rule__AND__Group__4 )
            // InternalTw.g:1940:2: rule__AND__Group__3__Impl rule__AND__Group__4
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
    // InternalTw.g:1947:1: rule__AND__Group__3__Impl : ( ',' ) ;
    public final void rule__AND__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1951:1: ( ( ',' ) )
            // InternalTw.g:1952:1: ( ',' )
            {
            // InternalTw.g:1952:1: ( ',' )
            // InternalTw.g:1953:2: ','
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
    // InternalTw.g:1962:1: rule__AND__Group__4 : rule__AND__Group__4__Impl rule__AND__Group__5 ;
    public final void rule__AND__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1966:1: ( rule__AND__Group__4__Impl rule__AND__Group__5 )
            // InternalTw.g:1967:2: rule__AND__Group__4__Impl rule__AND__Group__5
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
    // InternalTw.g:1974:1: rule__AND__Group__4__Impl : ( ( rule__AND__Exp2Assignment_4 ) ) ;
    public final void rule__AND__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1978:1: ( ( ( rule__AND__Exp2Assignment_4 ) ) )
            // InternalTw.g:1979:1: ( ( rule__AND__Exp2Assignment_4 ) )
            {
            // InternalTw.g:1979:1: ( ( rule__AND__Exp2Assignment_4 ) )
            // InternalTw.g:1980:2: ( rule__AND__Exp2Assignment_4 )
            {
             before(grammarAccess.getANDAccess().getExp2Assignment_4()); 
            // InternalTw.g:1981:2: ( rule__AND__Exp2Assignment_4 )
            // InternalTw.g:1981:3: rule__AND__Exp2Assignment_4
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
    // InternalTw.g:1989:1: rule__AND__Group__5 : rule__AND__Group__5__Impl ;
    public final void rule__AND__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1993:1: ( rule__AND__Group__5__Impl )
            // InternalTw.g:1994:2: rule__AND__Group__5__Impl
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
    // InternalTw.g:2000:1: rule__AND__Group__5__Impl : ( ')' ) ;
    public final void rule__AND__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2004:1: ( ( ')' ) )
            // InternalTw.g:2005:1: ( ')' )
            {
            // InternalTw.g:2005:1: ( ')' )
            // InternalTw.g:2006:2: ')'
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
    // InternalTw.g:2016:1: rule__OR__Group__0 : rule__OR__Group__0__Impl rule__OR__Group__1 ;
    public final void rule__OR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2020:1: ( rule__OR__Group__0__Impl rule__OR__Group__1 )
            // InternalTw.g:2021:2: rule__OR__Group__0__Impl rule__OR__Group__1
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
    // InternalTw.g:2028:1: rule__OR__Group__0__Impl : ( 'OR' ) ;
    public final void rule__OR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2032:1: ( ( 'OR' ) )
            // InternalTw.g:2033:1: ( 'OR' )
            {
            // InternalTw.g:2033:1: ( 'OR' )
            // InternalTw.g:2034:2: 'OR'
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
    // InternalTw.g:2043:1: rule__OR__Group__1 : rule__OR__Group__1__Impl rule__OR__Group__2 ;
    public final void rule__OR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2047:1: ( rule__OR__Group__1__Impl rule__OR__Group__2 )
            // InternalTw.g:2048:2: rule__OR__Group__1__Impl rule__OR__Group__2
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
    // InternalTw.g:2055:1: rule__OR__Group__1__Impl : ( '(' ) ;
    public final void rule__OR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2059:1: ( ( '(' ) )
            // InternalTw.g:2060:1: ( '(' )
            {
            // InternalTw.g:2060:1: ( '(' )
            // InternalTw.g:2061:2: '('
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
    // InternalTw.g:2070:1: rule__OR__Group__2 : rule__OR__Group__2__Impl rule__OR__Group__3 ;
    public final void rule__OR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2074:1: ( rule__OR__Group__2__Impl rule__OR__Group__3 )
            // InternalTw.g:2075:2: rule__OR__Group__2__Impl rule__OR__Group__3
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
    // InternalTw.g:2082:1: rule__OR__Group__2__Impl : ( ( rule__OR__Exp1Assignment_2 ) ) ;
    public final void rule__OR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2086:1: ( ( ( rule__OR__Exp1Assignment_2 ) ) )
            // InternalTw.g:2087:1: ( ( rule__OR__Exp1Assignment_2 ) )
            {
            // InternalTw.g:2087:1: ( ( rule__OR__Exp1Assignment_2 ) )
            // InternalTw.g:2088:2: ( rule__OR__Exp1Assignment_2 )
            {
             before(grammarAccess.getORAccess().getExp1Assignment_2()); 
            // InternalTw.g:2089:2: ( rule__OR__Exp1Assignment_2 )
            // InternalTw.g:2089:3: rule__OR__Exp1Assignment_2
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
    // InternalTw.g:2097:1: rule__OR__Group__3 : rule__OR__Group__3__Impl rule__OR__Group__4 ;
    public final void rule__OR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2101:1: ( rule__OR__Group__3__Impl rule__OR__Group__4 )
            // InternalTw.g:2102:2: rule__OR__Group__3__Impl rule__OR__Group__4
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
    // InternalTw.g:2109:1: rule__OR__Group__3__Impl : ( ',' ) ;
    public final void rule__OR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2113:1: ( ( ',' ) )
            // InternalTw.g:2114:1: ( ',' )
            {
            // InternalTw.g:2114:1: ( ',' )
            // InternalTw.g:2115:2: ','
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
    // InternalTw.g:2124:1: rule__OR__Group__4 : rule__OR__Group__4__Impl rule__OR__Group__5 ;
    public final void rule__OR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2128:1: ( rule__OR__Group__4__Impl rule__OR__Group__5 )
            // InternalTw.g:2129:2: rule__OR__Group__4__Impl rule__OR__Group__5
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
    // InternalTw.g:2136:1: rule__OR__Group__4__Impl : ( ( rule__OR__Exp2Assignment_4 ) ) ;
    public final void rule__OR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2140:1: ( ( ( rule__OR__Exp2Assignment_4 ) ) )
            // InternalTw.g:2141:1: ( ( rule__OR__Exp2Assignment_4 ) )
            {
            // InternalTw.g:2141:1: ( ( rule__OR__Exp2Assignment_4 ) )
            // InternalTw.g:2142:2: ( rule__OR__Exp2Assignment_4 )
            {
             before(grammarAccess.getORAccess().getExp2Assignment_4()); 
            // InternalTw.g:2143:2: ( rule__OR__Exp2Assignment_4 )
            // InternalTw.g:2143:3: rule__OR__Exp2Assignment_4
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
    // InternalTw.g:2151:1: rule__OR__Group__5 : rule__OR__Group__5__Impl ;
    public final void rule__OR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2155:1: ( rule__OR__Group__5__Impl )
            // InternalTw.g:2156:2: rule__OR__Group__5__Impl
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
    // InternalTw.g:2162:1: rule__OR__Group__5__Impl : ( ')' ) ;
    public final void rule__OR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2166:1: ( ( ')' ) )
            // InternalTw.g:2167:1: ( ')' )
            {
            // InternalTw.g:2167:1: ( ')' )
            // InternalTw.g:2168:2: ')'
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
    // InternalTw.g:2178:1: rule__Tweets_user__Group__0 : rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1 ;
    public final void rule__Tweets_user__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2182:1: ( rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1 )
            // InternalTw.g:2183:2: rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:2190:1: rule__Tweets_user__Group__0__Impl : ( 'tweets_user' ) ;
    public final void rule__Tweets_user__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2194:1: ( ( 'tweets_user' ) )
            // InternalTw.g:2195:1: ( 'tweets_user' )
            {
            // InternalTw.g:2195:1: ( 'tweets_user' )
            // InternalTw.g:2196:2: 'tweets_user'
            {
             before(grammarAccess.getTweets_userAccess().getTweets_userKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getTweets_userKeyword_0()); 

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
    // $ANTLR end "rule__Tweets_user__Group__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group__1"
    // InternalTw.g:2205:1: rule__Tweets_user__Group__1 : rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2 ;
    public final void rule__Tweets_user__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2209:1: ( rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2 )
            // InternalTw.g:2210:2: rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:2217:1: rule__Tweets_user__Group__1__Impl : ( '{' ) ;
    public final void rule__Tweets_user__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2221:1: ( ( '{' ) )
            // InternalTw.g:2222:1: ( '{' )
            {
            // InternalTw.g:2222:1: ( '{' )
            // InternalTw.g:2223:2: '{'
            {
             before(grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:2232:1: rule__Tweets_user__Group__2 : rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3 ;
    public final void rule__Tweets_user__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2236:1: ( rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3 )
            // InternalTw.g:2237:2: rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:2244:1: rule__Tweets_user__Group__2__Impl : ( ( rule__Tweets_user__Group_2__0 ) ) ;
    public final void rule__Tweets_user__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2248:1: ( ( ( rule__Tweets_user__Group_2__0 ) ) )
            // InternalTw.g:2249:1: ( ( rule__Tweets_user__Group_2__0 ) )
            {
            // InternalTw.g:2249:1: ( ( rule__Tweets_user__Group_2__0 ) )
            // InternalTw.g:2250:2: ( rule__Tweets_user__Group_2__0 )
            {
             before(grammarAccess.getTweets_userAccess().getGroup_2()); 
            // InternalTw.g:2251:2: ( rule__Tweets_user__Group_2__0 )
            // InternalTw.g:2251:3: rule__Tweets_user__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getGroup_2()); 

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
    // InternalTw.g:2259:1: rule__Tweets_user__Group__3 : rule__Tweets_user__Group__3__Impl ;
    public final void rule__Tweets_user__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2263:1: ( rule__Tweets_user__Group__3__Impl )
            // InternalTw.g:2264:2: rule__Tweets_user__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group__3__Impl();

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
    // InternalTw.g:2270:1: rule__Tweets_user__Group__3__Impl : ( '}' ) ;
    public final void rule__Tweets_user__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2274:1: ( ( '}' ) )
            // InternalTw.g:2275:1: ( '}' )
            {
            // InternalTw.g:2275:1: ( '}' )
            // InternalTw.g:2276:2: '}'
            {
             before(grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Tweets_user__Group_2__0"
    // InternalTw.g:2286:1: rule__Tweets_user__Group_2__0 : rule__Tweets_user__Group_2__0__Impl rule__Tweets_user__Group_2__1 ;
    public final void rule__Tweets_user__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2290:1: ( rule__Tweets_user__Group_2__0__Impl rule__Tweets_user__Group_2__1 )
            // InternalTw.g:2291:2: rule__Tweets_user__Group_2__0__Impl rule__Tweets_user__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_user__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_2__1();

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
    // $ANTLR end "rule__Tweets_user__Group_2__0"


    // $ANTLR start "rule__Tweets_user__Group_2__0__Impl"
    // InternalTw.g:2298:1: rule__Tweets_user__Group_2__0__Impl : ( ( rule__Tweets_user__ArgsAssignment_2_0 ) ) ;
    public final void rule__Tweets_user__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2302:1: ( ( ( rule__Tweets_user__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:2303:1: ( ( rule__Tweets_user__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:2303:1: ( ( rule__Tweets_user__ArgsAssignment_2_0 ) )
            // InternalTw.g:2304:2: ( rule__Tweets_user__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getTweets_userAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:2305:2: ( rule__Tweets_user__ArgsAssignment_2_0 )
            // InternalTw.g:2305:3: rule__Tweets_user__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__Tweets_user__Group_2__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group_2__1"
    // InternalTw.g:2313:1: rule__Tweets_user__Group_2__1 : rule__Tweets_user__Group_2__1__Impl ;
    public final void rule__Tweets_user__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2317:1: ( rule__Tweets_user__Group_2__1__Impl )
            // InternalTw.g:2318:2: rule__Tweets_user__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_2__1__Impl();

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
    // $ANTLR end "rule__Tweets_user__Group_2__1"


    // $ANTLR start "rule__Tweets_user__Group_2__1__Impl"
    // InternalTw.g:2324:1: rule__Tweets_user__Group_2__1__Impl : ( ( rule__Tweets_user__Group_2_1__0 )* ) ;
    public final void rule__Tweets_user__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2328:1: ( ( ( rule__Tweets_user__Group_2_1__0 )* ) )
            // InternalTw.g:2329:1: ( ( rule__Tweets_user__Group_2_1__0 )* )
            {
            // InternalTw.g:2329:1: ( ( rule__Tweets_user__Group_2_1__0 )* )
            // InternalTw.g:2330:2: ( rule__Tweets_user__Group_2_1__0 )*
            {
             before(grammarAccess.getTweets_userAccess().getGroup_2_1()); 
            // InternalTw.g:2331:2: ( rule__Tweets_user__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTw.g:2331:3: rule__Tweets_user__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Tweets_user__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTweets_userAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Tweets_user__Group_2__1__Impl"


    // $ANTLR start "rule__Tweets_user__Group_2_1__0"
    // InternalTw.g:2340:1: rule__Tweets_user__Group_2_1__0 : rule__Tweets_user__Group_2_1__0__Impl rule__Tweets_user__Group_2_1__1 ;
    public final void rule__Tweets_user__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2344:1: ( rule__Tweets_user__Group_2_1__0__Impl rule__Tweets_user__Group_2_1__1 )
            // InternalTw.g:2345:2: rule__Tweets_user__Group_2_1__0__Impl rule__Tweets_user__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Tweets_user__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_2_1__1();

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
    // $ANTLR end "rule__Tweets_user__Group_2_1__0"


    // $ANTLR start "rule__Tweets_user__Group_2_1__0__Impl"
    // InternalTw.g:2352:1: rule__Tweets_user__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_user__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2356:1: ( ( ',' ) )
            // InternalTw.g:2357:1: ( ',' )
            {
            // InternalTw.g:2357:1: ( ',' )
            // InternalTw.g:2358:2: ','
            {
             before(grammarAccess.getTweets_userAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Tweets_user__Group_2_1__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group_2_1__1"
    // InternalTw.g:2367:1: rule__Tweets_user__Group_2_1__1 : rule__Tweets_user__Group_2_1__1__Impl ;
    public final void rule__Tweets_user__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2371:1: ( rule__Tweets_user__Group_2_1__1__Impl )
            // InternalTw.g:2372:2: rule__Tweets_user__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Tweets_user__Group_2_1__1"


    // $ANTLR start "rule__Tweets_user__Group_2_1__1__Impl"
    // InternalTw.g:2378:1: rule__Tweets_user__Group_2_1__1__Impl : ( ( rule__Tweets_user__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Tweets_user__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2382:1: ( ( ( rule__Tweets_user__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:2383:1: ( ( rule__Tweets_user__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:2383:1: ( ( rule__Tweets_user__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:2384:2: ( rule__Tweets_user__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getTweets_userAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:2385:2: ( rule__Tweets_user__ArgsAssignment_2_1_1 )
            // InternalTw.g:2385:3: rule__Tweets_user__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Tweets_user__Group_2_1__1__Impl"


    // $ANTLR start "rule__Tweets_location__Group__0"
    // InternalTw.g:2394:1: rule__Tweets_location__Group__0 : rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1 ;
    public final void rule__Tweets_location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2398:1: ( rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1 )
            // InternalTw.g:2399:2: rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:2406:1: rule__Tweets_location__Group__0__Impl : ( 'tweets_location' ) ;
    public final void rule__Tweets_location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2410:1: ( ( 'tweets_location' ) )
            // InternalTw.g:2411:1: ( 'tweets_location' )
            {
            // InternalTw.g:2411:1: ( 'tweets_location' )
            // InternalTw.g:2412:2: 'tweets_location'
            {
             before(grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_0()); 

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
    // $ANTLR end "rule__Tweets_location__Group__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group__1"
    // InternalTw.g:2421:1: rule__Tweets_location__Group__1 : rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2 ;
    public final void rule__Tweets_location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2425:1: ( rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2 )
            // InternalTw.g:2426:2: rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:2433:1: rule__Tweets_location__Group__1__Impl : ( '{' ) ;
    public final void rule__Tweets_location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2437:1: ( ( '{' ) )
            // InternalTw.g:2438:1: ( '{' )
            {
            // InternalTw.g:2438:1: ( '{' )
            // InternalTw.g:2439:2: '{'
            {
             before(grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:2448:1: rule__Tweets_location__Group__2 : rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3 ;
    public final void rule__Tweets_location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2452:1: ( rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3 )
            // InternalTw.g:2453:2: rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:2460:1: rule__Tweets_location__Group__2__Impl : ( ( rule__Tweets_location__Group_2__0 ) ) ;
    public final void rule__Tweets_location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2464:1: ( ( ( rule__Tweets_location__Group_2__0 ) ) )
            // InternalTw.g:2465:1: ( ( rule__Tweets_location__Group_2__0 ) )
            {
            // InternalTw.g:2465:1: ( ( rule__Tweets_location__Group_2__0 ) )
            // InternalTw.g:2466:2: ( rule__Tweets_location__Group_2__0 )
            {
             before(grammarAccess.getTweets_locationAccess().getGroup_2()); 
            // InternalTw.g:2467:2: ( rule__Tweets_location__Group_2__0 )
            // InternalTw.g:2467:3: rule__Tweets_location__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getGroup_2()); 

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
    // InternalTw.g:2475:1: rule__Tweets_location__Group__3 : rule__Tweets_location__Group__3__Impl ;
    public final void rule__Tweets_location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2479:1: ( rule__Tweets_location__Group__3__Impl )
            // InternalTw.g:2480:2: rule__Tweets_location__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group__3__Impl();

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
    // InternalTw.g:2486:1: rule__Tweets_location__Group__3__Impl : ( '}' ) ;
    public final void rule__Tweets_location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2490:1: ( ( '}' ) )
            // InternalTw.g:2491:1: ( '}' )
            {
            // InternalTw.g:2491:1: ( '}' )
            // InternalTw.g:2492:2: '}'
            {
             before(grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Tweets_location__Group_2__0"
    // InternalTw.g:2502:1: rule__Tweets_location__Group_2__0 : rule__Tweets_location__Group_2__0__Impl rule__Tweets_location__Group_2__1 ;
    public final void rule__Tweets_location__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2506:1: ( rule__Tweets_location__Group_2__0__Impl rule__Tweets_location__Group_2__1 )
            // InternalTw.g:2507:2: rule__Tweets_location__Group_2__0__Impl rule__Tweets_location__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_location__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_2__1();

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
    // $ANTLR end "rule__Tweets_location__Group_2__0"


    // $ANTLR start "rule__Tweets_location__Group_2__0__Impl"
    // InternalTw.g:2514:1: rule__Tweets_location__Group_2__0__Impl : ( ( rule__Tweets_location__ArgsAssignment_2_0 ) ) ;
    public final void rule__Tweets_location__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2518:1: ( ( ( rule__Tweets_location__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:2519:1: ( ( rule__Tweets_location__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:2519:1: ( ( rule__Tweets_location__ArgsAssignment_2_0 ) )
            // InternalTw.g:2520:2: ( rule__Tweets_location__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getTweets_locationAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:2521:2: ( rule__Tweets_location__ArgsAssignment_2_0 )
            // InternalTw.g:2521:3: rule__Tweets_location__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__Tweets_location__Group_2__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group_2__1"
    // InternalTw.g:2529:1: rule__Tweets_location__Group_2__1 : rule__Tweets_location__Group_2__1__Impl ;
    public final void rule__Tweets_location__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2533:1: ( rule__Tweets_location__Group_2__1__Impl )
            // InternalTw.g:2534:2: rule__Tweets_location__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_2__1__Impl();

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
    // $ANTLR end "rule__Tweets_location__Group_2__1"


    // $ANTLR start "rule__Tweets_location__Group_2__1__Impl"
    // InternalTw.g:2540:1: rule__Tweets_location__Group_2__1__Impl : ( ( rule__Tweets_location__Group_2_1__0 )* ) ;
    public final void rule__Tweets_location__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2544:1: ( ( ( rule__Tweets_location__Group_2_1__0 )* ) )
            // InternalTw.g:2545:1: ( ( rule__Tweets_location__Group_2_1__0 )* )
            {
            // InternalTw.g:2545:1: ( ( rule__Tweets_location__Group_2_1__0 )* )
            // InternalTw.g:2546:2: ( rule__Tweets_location__Group_2_1__0 )*
            {
             before(grammarAccess.getTweets_locationAccess().getGroup_2_1()); 
            // InternalTw.g:2547:2: ( rule__Tweets_location__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTw.g:2547:3: rule__Tweets_location__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Tweets_location__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTweets_locationAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Tweets_location__Group_2__1__Impl"


    // $ANTLR start "rule__Tweets_location__Group_2_1__0"
    // InternalTw.g:2556:1: rule__Tweets_location__Group_2_1__0 : rule__Tweets_location__Group_2_1__0__Impl rule__Tweets_location__Group_2_1__1 ;
    public final void rule__Tweets_location__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2560:1: ( rule__Tweets_location__Group_2_1__0__Impl rule__Tweets_location__Group_2_1__1 )
            // InternalTw.g:2561:2: rule__Tweets_location__Group_2_1__0__Impl rule__Tweets_location__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Tweets_location__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_2_1__1();

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
    // $ANTLR end "rule__Tweets_location__Group_2_1__0"


    // $ANTLR start "rule__Tweets_location__Group_2_1__0__Impl"
    // InternalTw.g:2568:1: rule__Tweets_location__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_location__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2572:1: ( ( ',' ) )
            // InternalTw.g:2573:1: ( ',' )
            {
            // InternalTw.g:2573:1: ( ',' )
            // InternalTw.g:2574:2: ','
            {
             before(grammarAccess.getTweets_locationAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Tweets_location__Group_2_1__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group_2_1__1"
    // InternalTw.g:2583:1: rule__Tweets_location__Group_2_1__1 : rule__Tweets_location__Group_2_1__1__Impl ;
    public final void rule__Tweets_location__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2587:1: ( rule__Tweets_location__Group_2_1__1__Impl )
            // InternalTw.g:2588:2: rule__Tweets_location__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Tweets_location__Group_2_1__1"


    // $ANTLR start "rule__Tweets_location__Group_2_1__1__Impl"
    // InternalTw.g:2594:1: rule__Tweets_location__Group_2_1__1__Impl : ( ( rule__Tweets_location__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Tweets_location__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2598:1: ( ( ( rule__Tweets_location__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:2599:1: ( ( rule__Tweets_location__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:2599:1: ( ( rule__Tweets_location__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:2600:2: ( rule__Tweets_location__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getTweets_locationAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:2601:2: ( rule__Tweets_location__ArgsAssignment_2_1_1 )
            // InternalTw.g:2601:3: rule__Tweets_location__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Tweets_location__Group_2_1__1__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__0"
    // InternalTw.g:2610:1: rule__Tweets_entity__Group__0 : rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1 ;
    public final void rule__Tweets_entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2614:1: ( rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1 )
            // InternalTw.g:2615:2: rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:2622:1: rule__Tweets_entity__Group__0__Impl : ( 'tweets_entity' ) ;
    public final void rule__Tweets_entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2626:1: ( ( 'tweets_entity' ) )
            // InternalTw.g:2627:1: ( 'tweets_entity' )
            {
            // InternalTw.g:2627:1: ( 'tweets_entity' )
            // InternalTw.g:2628:2: 'tweets_entity'
            {
             before(grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_0()); 

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
    // $ANTLR end "rule__Tweets_entity__Group__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__1"
    // InternalTw.g:2637:1: rule__Tweets_entity__Group__1 : rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2 ;
    public final void rule__Tweets_entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2641:1: ( rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2 )
            // InternalTw.g:2642:2: rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:2649:1: rule__Tweets_entity__Group__1__Impl : ( '{' ) ;
    public final void rule__Tweets_entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2653:1: ( ( '{' ) )
            // InternalTw.g:2654:1: ( '{' )
            {
            // InternalTw.g:2654:1: ( '{' )
            // InternalTw.g:2655:2: '{'
            {
             before(grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:2664:1: rule__Tweets_entity__Group__2 : rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3 ;
    public final void rule__Tweets_entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2668:1: ( rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3 )
            // InternalTw.g:2669:2: rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:2676:1: rule__Tweets_entity__Group__2__Impl : ( ( rule__Tweets_entity__Group_2__0 ) ) ;
    public final void rule__Tweets_entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2680:1: ( ( ( rule__Tweets_entity__Group_2__0 ) ) )
            // InternalTw.g:2681:1: ( ( rule__Tweets_entity__Group_2__0 ) )
            {
            // InternalTw.g:2681:1: ( ( rule__Tweets_entity__Group_2__0 ) )
            // InternalTw.g:2682:2: ( rule__Tweets_entity__Group_2__0 )
            {
             before(grammarAccess.getTweets_entityAccess().getGroup_2()); 
            // InternalTw.g:2683:2: ( rule__Tweets_entity__Group_2__0 )
            // InternalTw.g:2683:3: rule__Tweets_entity__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getGroup_2()); 

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
    // InternalTw.g:2691:1: rule__Tweets_entity__Group__3 : rule__Tweets_entity__Group__3__Impl ;
    public final void rule__Tweets_entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2695:1: ( rule__Tweets_entity__Group__3__Impl )
            // InternalTw.g:2696:2: rule__Tweets_entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group__3__Impl();

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
    // InternalTw.g:2702:1: rule__Tweets_entity__Group__3__Impl : ( '}' ) ;
    public final void rule__Tweets_entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2706:1: ( ( '}' ) )
            // InternalTw.g:2707:1: ( '}' )
            {
            // InternalTw.g:2707:1: ( '}' )
            // InternalTw.g:2708:2: '}'
            {
             before(grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Tweets_entity__Group_2__0"
    // InternalTw.g:2718:1: rule__Tweets_entity__Group_2__0 : rule__Tweets_entity__Group_2__0__Impl rule__Tweets_entity__Group_2__1 ;
    public final void rule__Tweets_entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2722:1: ( rule__Tweets_entity__Group_2__0__Impl rule__Tweets_entity__Group_2__1 )
            // InternalTw.g:2723:2: rule__Tweets_entity__Group_2__0__Impl rule__Tweets_entity__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_2__1();

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
    // $ANTLR end "rule__Tweets_entity__Group_2__0"


    // $ANTLR start "rule__Tweets_entity__Group_2__0__Impl"
    // InternalTw.g:2730:1: rule__Tweets_entity__Group_2__0__Impl : ( ( rule__Tweets_entity__ArgsAssignment_2_0 ) ) ;
    public final void rule__Tweets_entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2734:1: ( ( ( rule__Tweets_entity__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:2735:1: ( ( rule__Tweets_entity__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:2735:1: ( ( rule__Tweets_entity__ArgsAssignment_2_0 ) )
            // InternalTw.g:2736:2: ( rule__Tweets_entity__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getTweets_entityAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:2737:2: ( rule__Tweets_entity__ArgsAssignment_2_0 )
            // InternalTw.g:2737:3: rule__Tweets_entity__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__Tweets_entity__Group_2__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_2__1"
    // InternalTw.g:2745:1: rule__Tweets_entity__Group_2__1 : rule__Tweets_entity__Group_2__1__Impl ;
    public final void rule__Tweets_entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2749:1: ( rule__Tweets_entity__Group_2__1__Impl )
            // InternalTw.g:2750:2: rule__Tweets_entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Tweets_entity__Group_2__1"


    // $ANTLR start "rule__Tweets_entity__Group_2__1__Impl"
    // InternalTw.g:2756:1: rule__Tweets_entity__Group_2__1__Impl : ( ( rule__Tweets_entity__Group_2_1__0 )* ) ;
    public final void rule__Tweets_entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2760:1: ( ( ( rule__Tweets_entity__Group_2_1__0 )* ) )
            // InternalTw.g:2761:1: ( ( rule__Tweets_entity__Group_2_1__0 )* )
            {
            // InternalTw.g:2761:1: ( ( rule__Tweets_entity__Group_2_1__0 )* )
            // InternalTw.g:2762:2: ( rule__Tweets_entity__Group_2_1__0 )*
            {
             before(grammarAccess.getTweets_entityAccess().getGroup_2_1()); 
            // InternalTw.g:2763:2: ( rule__Tweets_entity__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTw.g:2763:3: rule__Tweets_entity__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Tweets_entity__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTweets_entityAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Tweets_entity__Group_2__1__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_2_1__0"
    // InternalTw.g:2772:1: rule__Tweets_entity__Group_2_1__0 : rule__Tweets_entity__Group_2_1__0__Impl rule__Tweets_entity__Group_2_1__1 ;
    public final void rule__Tweets_entity__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2776:1: ( rule__Tweets_entity__Group_2_1__0__Impl rule__Tweets_entity__Group_2_1__1 )
            // InternalTw.g:2777:2: rule__Tweets_entity__Group_2_1__0__Impl rule__Tweets_entity__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Tweets_entity__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_2_1__1();

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
    // $ANTLR end "rule__Tweets_entity__Group_2_1__0"


    // $ANTLR start "rule__Tweets_entity__Group_2_1__0__Impl"
    // InternalTw.g:2784:1: rule__Tweets_entity__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_entity__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2788:1: ( ( ',' ) )
            // InternalTw.g:2789:1: ( ',' )
            {
            // InternalTw.g:2789:1: ( ',' )
            // InternalTw.g:2790:2: ','
            {
             before(grammarAccess.getTweets_entityAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Tweets_entity__Group_2_1__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_2_1__1"
    // InternalTw.g:2799:1: rule__Tweets_entity__Group_2_1__1 : rule__Tweets_entity__Group_2_1__1__Impl ;
    public final void rule__Tweets_entity__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2803:1: ( rule__Tweets_entity__Group_2_1__1__Impl )
            // InternalTw.g:2804:2: rule__Tweets_entity__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Tweets_entity__Group_2_1__1"


    // $ANTLR start "rule__Tweets_entity__Group_2_1__1__Impl"
    // InternalTw.g:2810:1: rule__Tweets_entity__Group_2_1__1__Impl : ( ( rule__Tweets_entity__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Tweets_entity__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2814:1: ( ( ( rule__Tweets_entity__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:2815:1: ( ( rule__Tweets_entity__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:2815:1: ( ( rule__Tweets_entity__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:2816:2: ( rule__Tweets_entity__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getTweets_entityAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:2817:2: ( rule__Tweets_entity__ArgsAssignment_2_1_1 )
            // InternalTw.g:2817:3: rule__Tweets_entity__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Tweets_entity__Group_2_1__1__Impl"


    // $ANTLR start "rule__Tweets_date__Group__0"
    // InternalTw.g:2826:1: rule__Tweets_date__Group__0 : rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1 ;
    public final void rule__Tweets_date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2830:1: ( rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1 )
            // InternalTw.g:2831:2: rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:2838:1: rule__Tweets_date__Group__0__Impl : ( 'tweets_date' ) ;
    public final void rule__Tweets_date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2842:1: ( ( 'tweets_date' ) )
            // InternalTw.g:2843:1: ( 'tweets_date' )
            {
            // InternalTw.g:2843:1: ( 'tweets_date' )
            // InternalTw.g:2844:2: 'tweets_date'
            {
             before(grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_0()); 

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
    // $ANTLR end "rule__Tweets_date__Group__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group__1"
    // InternalTw.g:2853:1: rule__Tweets_date__Group__1 : rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2 ;
    public final void rule__Tweets_date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2857:1: ( rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2 )
            // InternalTw.g:2858:2: rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:2865:1: rule__Tweets_date__Group__1__Impl : ( '{' ) ;
    public final void rule__Tweets_date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2869:1: ( ( '{' ) )
            // InternalTw.g:2870:1: ( '{' )
            {
            // InternalTw.g:2870:1: ( '{' )
            // InternalTw.g:2871:2: '{'
            {
             before(grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:2880:1: rule__Tweets_date__Group__2 : rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3 ;
    public final void rule__Tweets_date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2884:1: ( rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3 )
            // InternalTw.g:2885:2: rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:2892:1: rule__Tweets_date__Group__2__Impl : ( ( rule__Tweets_date__Group_2__0 ) ) ;
    public final void rule__Tweets_date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2896:1: ( ( ( rule__Tweets_date__Group_2__0 ) ) )
            // InternalTw.g:2897:1: ( ( rule__Tweets_date__Group_2__0 ) )
            {
            // InternalTw.g:2897:1: ( ( rule__Tweets_date__Group_2__0 ) )
            // InternalTw.g:2898:2: ( rule__Tweets_date__Group_2__0 )
            {
             before(grammarAccess.getTweets_dateAccess().getGroup_2()); 
            // InternalTw.g:2899:2: ( rule__Tweets_date__Group_2__0 )
            // InternalTw.g:2899:3: rule__Tweets_date__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getGroup_2()); 

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
    // InternalTw.g:2907:1: rule__Tweets_date__Group__3 : rule__Tweets_date__Group__3__Impl ;
    public final void rule__Tweets_date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2911:1: ( rule__Tweets_date__Group__3__Impl )
            // InternalTw.g:2912:2: rule__Tweets_date__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group__3__Impl();

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
    // InternalTw.g:2918:1: rule__Tweets_date__Group__3__Impl : ( '}' ) ;
    public final void rule__Tweets_date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2922:1: ( ( '}' ) )
            // InternalTw.g:2923:1: ( '}' )
            {
            // InternalTw.g:2923:1: ( '}' )
            // InternalTw.g:2924:2: '}'
            {
             before(grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Tweets_date__Group_2__0"
    // InternalTw.g:2934:1: rule__Tweets_date__Group_2__0 : rule__Tweets_date__Group_2__0__Impl rule__Tweets_date__Group_2__1 ;
    public final void rule__Tweets_date__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2938:1: ( rule__Tweets_date__Group_2__0__Impl rule__Tweets_date__Group_2__1 )
            // InternalTw.g:2939:2: rule__Tweets_date__Group_2__0__Impl rule__Tweets_date__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Tweets_date__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_2__1();

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
    // $ANTLR end "rule__Tweets_date__Group_2__0"


    // $ANTLR start "rule__Tweets_date__Group_2__0__Impl"
    // InternalTw.g:2946:1: rule__Tweets_date__Group_2__0__Impl : ( ( rule__Tweets_date__ArgsAssignment_2_0 ) ) ;
    public final void rule__Tweets_date__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2950:1: ( ( ( rule__Tweets_date__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:2951:1: ( ( rule__Tweets_date__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:2951:1: ( ( rule__Tweets_date__ArgsAssignment_2_0 ) )
            // InternalTw.g:2952:2: ( rule__Tweets_date__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getTweets_dateAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:2953:2: ( rule__Tweets_date__ArgsAssignment_2_0 )
            // InternalTw.g:2953:3: rule__Tweets_date__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__Tweets_date__Group_2__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group_2__1"
    // InternalTw.g:2961:1: rule__Tweets_date__Group_2__1 : rule__Tweets_date__Group_2__1__Impl ;
    public final void rule__Tweets_date__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2965:1: ( rule__Tweets_date__Group_2__1__Impl )
            // InternalTw.g:2966:2: rule__Tweets_date__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_2__1__Impl();

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
    // $ANTLR end "rule__Tweets_date__Group_2__1"


    // $ANTLR start "rule__Tweets_date__Group_2__1__Impl"
    // InternalTw.g:2972:1: rule__Tweets_date__Group_2__1__Impl : ( ( rule__Tweets_date__Group_2_1__0 )* ) ;
    public final void rule__Tweets_date__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2976:1: ( ( ( rule__Tweets_date__Group_2_1__0 )* ) )
            // InternalTw.g:2977:1: ( ( rule__Tweets_date__Group_2_1__0 )* )
            {
            // InternalTw.g:2977:1: ( ( rule__Tweets_date__Group_2_1__0 )* )
            // InternalTw.g:2978:2: ( rule__Tweets_date__Group_2_1__0 )*
            {
             before(grammarAccess.getTweets_dateAccess().getGroup_2_1()); 
            // InternalTw.g:2979:2: ( rule__Tweets_date__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTw.g:2979:3: rule__Tweets_date__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Tweets_date__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTweets_dateAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Tweets_date__Group_2__1__Impl"


    // $ANTLR start "rule__Tweets_date__Group_2_1__0"
    // InternalTw.g:2988:1: rule__Tweets_date__Group_2_1__0 : rule__Tweets_date__Group_2_1__0__Impl rule__Tweets_date__Group_2_1__1 ;
    public final void rule__Tweets_date__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2992:1: ( rule__Tweets_date__Group_2_1__0__Impl rule__Tweets_date__Group_2_1__1 )
            // InternalTw.g:2993:2: rule__Tweets_date__Group_2_1__0__Impl rule__Tweets_date__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Tweets_date__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_2_1__1();

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
    // $ANTLR end "rule__Tweets_date__Group_2_1__0"


    // $ANTLR start "rule__Tweets_date__Group_2_1__0__Impl"
    // InternalTw.g:3000:1: rule__Tweets_date__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Tweets_date__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3004:1: ( ( ',' ) )
            // InternalTw.g:3005:1: ( ',' )
            {
            // InternalTw.g:3005:1: ( ',' )
            // InternalTw.g:3006:2: ','
            {
             before(grammarAccess.getTweets_dateAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Tweets_date__Group_2_1__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group_2_1__1"
    // InternalTw.g:3015:1: rule__Tweets_date__Group_2_1__1 : rule__Tweets_date__Group_2_1__1__Impl ;
    public final void rule__Tweets_date__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3019:1: ( rule__Tweets_date__Group_2_1__1__Impl )
            // InternalTw.g:3020:2: rule__Tweets_date__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Tweets_date__Group_2_1__1"


    // $ANTLR start "rule__Tweets_date__Group_2_1__1__Impl"
    // InternalTw.g:3026:1: rule__Tweets_date__Group_2_1__1__Impl : ( ( rule__Tweets_date__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Tweets_date__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3030:1: ( ( ( rule__Tweets_date__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:3031:1: ( ( rule__Tweets_date__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:3031:1: ( ( rule__Tweets_date__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:3032:2: ( rule__Tweets_date__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getTweets_dateAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:3033:2: ( rule__Tweets_date__ArgsAssignment_2_1_1 )
            // InternalTw.g:3033:3: rule__Tweets_date__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Tweets_date__Group_2_1__1__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__0"
    // InternalTw.g:3042:1: rule__ProportionPositif__Group__0 : rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1 ;
    public final void rule__ProportionPositif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3046:1: ( rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1 )
            // InternalTw.g:3047:2: rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3054:1: rule__ProportionPositif__Group__0__Impl : ( 'ProportionPositif' ) ;
    public final void rule__ProportionPositif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3058:1: ( ( 'ProportionPositif' ) )
            // InternalTw.g:3059:1: ( 'ProportionPositif' )
            {
            // InternalTw.g:3059:1: ( 'ProportionPositif' )
            // InternalTw.g:3060:2: 'ProportionPositif'
            {
             before(grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_0()); 

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
    // $ANTLR end "rule__ProportionPositif__Group__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__1"
    // InternalTw.g:3069:1: rule__ProportionPositif__Group__1 : rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2 ;
    public final void rule__ProportionPositif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3073:1: ( rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2 )
            // InternalTw.g:3074:2: rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:3081:1: rule__ProportionPositif__Group__1__Impl : ( '{' ) ;
    public final void rule__ProportionPositif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3085:1: ( ( '{' ) )
            // InternalTw.g:3086:1: ( '{' )
            {
            // InternalTw.g:3086:1: ( '{' )
            // InternalTw.g:3087:2: '{'
            {
             before(grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:3096:1: rule__ProportionPositif__Group__2 : rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3 ;
    public final void rule__ProportionPositif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3100:1: ( rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3 )
            // InternalTw.g:3101:2: rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:3108:1: rule__ProportionPositif__Group__2__Impl : ( ( rule__ProportionPositif__Group_2__0 ) ) ;
    public final void rule__ProportionPositif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3112:1: ( ( ( rule__ProportionPositif__Group_2__0 ) ) )
            // InternalTw.g:3113:1: ( ( rule__ProportionPositif__Group_2__0 ) )
            {
            // InternalTw.g:3113:1: ( ( rule__ProportionPositif__Group_2__0 ) )
            // InternalTw.g:3114:2: ( rule__ProportionPositif__Group_2__0 )
            {
             before(grammarAccess.getProportionPositifAccess().getGroup_2()); 
            // InternalTw.g:3115:2: ( rule__ProportionPositif__Group_2__0 )
            // InternalTw.g:3115:3: rule__ProportionPositif__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getGroup_2()); 

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
    // InternalTw.g:3123:1: rule__ProportionPositif__Group__3 : rule__ProportionPositif__Group__3__Impl ;
    public final void rule__ProportionPositif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3127:1: ( rule__ProportionPositif__Group__3__Impl )
            // InternalTw.g:3128:2: rule__ProportionPositif__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group__3__Impl();

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
    // InternalTw.g:3134:1: rule__ProportionPositif__Group__3__Impl : ( '}' ) ;
    public final void rule__ProportionPositif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3138:1: ( ( '}' ) )
            // InternalTw.g:3139:1: ( '}' )
            {
            // InternalTw.g:3139:1: ( '}' )
            // InternalTw.g:3140:2: '}'
            {
             before(grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__ProportionPositif__Group_2__0"
    // InternalTw.g:3150:1: rule__ProportionPositif__Group_2__0 : rule__ProportionPositif__Group_2__0__Impl rule__ProportionPositif__Group_2__1 ;
    public final void rule__ProportionPositif__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3154:1: ( rule__ProportionPositif__Group_2__0__Impl rule__ProportionPositif__Group_2__1 )
            // InternalTw.g:3155:2: rule__ProportionPositif__Group_2__0__Impl rule__ProportionPositif__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ProportionPositif__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_2__1();

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
    // $ANTLR end "rule__ProportionPositif__Group_2__0"


    // $ANTLR start "rule__ProportionPositif__Group_2__0__Impl"
    // InternalTw.g:3162:1: rule__ProportionPositif__Group_2__0__Impl : ( ( rule__ProportionPositif__ArgsAssignment_2_0 ) ) ;
    public final void rule__ProportionPositif__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3166:1: ( ( ( rule__ProportionPositif__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:3167:1: ( ( rule__ProportionPositif__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:3167:1: ( ( rule__ProportionPositif__ArgsAssignment_2_0 ) )
            // InternalTw.g:3168:2: ( rule__ProportionPositif__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getProportionPositifAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:3169:2: ( rule__ProportionPositif__ArgsAssignment_2_0 )
            // InternalTw.g:3169:3: rule__ProportionPositif__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__ProportionPositif__Group_2__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_2__1"
    // InternalTw.g:3177:1: rule__ProportionPositif__Group_2__1 : rule__ProportionPositif__Group_2__1__Impl ;
    public final void rule__ProportionPositif__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3181:1: ( rule__ProportionPositif__Group_2__1__Impl )
            // InternalTw.g:3182:2: rule__ProportionPositif__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_2__1__Impl();

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
    // $ANTLR end "rule__ProportionPositif__Group_2__1"


    // $ANTLR start "rule__ProportionPositif__Group_2__1__Impl"
    // InternalTw.g:3188:1: rule__ProportionPositif__Group_2__1__Impl : ( ( rule__ProportionPositif__Group_2_1__0 )* ) ;
    public final void rule__ProportionPositif__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3192:1: ( ( ( rule__ProportionPositif__Group_2_1__0 )* ) )
            // InternalTw.g:3193:1: ( ( rule__ProportionPositif__Group_2_1__0 )* )
            {
            // InternalTw.g:3193:1: ( ( rule__ProportionPositif__Group_2_1__0 )* )
            // InternalTw.g:3194:2: ( rule__ProportionPositif__Group_2_1__0 )*
            {
             before(grammarAccess.getProportionPositifAccess().getGroup_2_1()); 
            // InternalTw.g:3195:2: ( rule__ProportionPositif__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTw.g:3195:3: rule__ProportionPositif__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ProportionPositif__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProportionPositifAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__ProportionPositif__Group_2__1__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_2_1__0"
    // InternalTw.g:3204:1: rule__ProportionPositif__Group_2_1__0 : rule__ProportionPositif__Group_2_1__0__Impl rule__ProportionPositif__Group_2_1__1 ;
    public final void rule__ProportionPositif__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3208:1: ( rule__ProportionPositif__Group_2_1__0__Impl rule__ProportionPositif__Group_2_1__1 )
            // InternalTw.g:3209:2: rule__ProportionPositif__Group_2_1__0__Impl rule__ProportionPositif__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ProportionPositif__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_2_1__1();

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
    // $ANTLR end "rule__ProportionPositif__Group_2_1__0"


    // $ANTLR start "rule__ProportionPositif__Group_2_1__0__Impl"
    // InternalTw.g:3216:1: rule__ProportionPositif__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ProportionPositif__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3220:1: ( ( ',' ) )
            // InternalTw.g:3221:1: ( ',' )
            {
            // InternalTw.g:3221:1: ( ',' )
            // InternalTw.g:3222:2: ','
            {
             before(grammarAccess.getProportionPositifAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__ProportionPositif__Group_2_1__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_2_1__1"
    // InternalTw.g:3231:1: rule__ProportionPositif__Group_2_1__1 : rule__ProportionPositif__Group_2_1__1__Impl ;
    public final void rule__ProportionPositif__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3235:1: ( rule__ProportionPositif__Group_2_1__1__Impl )
            // InternalTw.g:3236:2: rule__ProportionPositif__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ProportionPositif__Group_2_1__1"


    // $ANTLR start "rule__ProportionPositif__Group_2_1__1__Impl"
    // InternalTw.g:3242:1: rule__ProportionPositif__Group_2_1__1__Impl : ( ( rule__ProportionPositif__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__ProportionPositif__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3246:1: ( ( ( rule__ProportionPositif__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:3247:1: ( ( rule__ProportionPositif__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:3247:1: ( ( rule__ProportionPositif__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:3248:2: ( rule__ProportionPositif__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getProportionPositifAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:3249:2: ( rule__ProportionPositif__ArgsAssignment_2_1_1 )
            // InternalTw.g:3249:3: rule__ProportionPositif__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__ProportionPositif__Group_2_1__1__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__0"
    // InternalTw.g:3258:1: rule__ProportionNegatif__Group__0 : rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1 ;
    public final void rule__ProportionNegatif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3262:1: ( rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1 )
            // InternalTw.g:3263:2: rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3270:1: rule__ProportionNegatif__Group__0__Impl : ( 'ProportionNegatif' ) ;
    public final void rule__ProportionNegatif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3274:1: ( ( 'ProportionNegatif' ) )
            // InternalTw.g:3275:1: ( 'ProportionNegatif' )
            {
            // InternalTw.g:3275:1: ( 'ProportionNegatif' )
            // InternalTw.g:3276:2: 'ProportionNegatif'
            {
             before(grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_0()); 

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
    // $ANTLR end "rule__ProportionNegatif__Group__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__1"
    // InternalTw.g:3285:1: rule__ProportionNegatif__Group__1 : rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2 ;
    public final void rule__ProportionNegatif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3289:1: ( rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2 )
            // InternalTw.g:3290:2: rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:3297:1: rule__ProportionNegatif__Group__1__Impl : ( '{' ) ;
    public final void rule__ProportionNegatif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3301:1: ( ( '{' ) )
            // InternalTw.g:3302:1: ( '{' )
            {
            // InternalTw.g:3302:1: ( '{' )
            // InternalTw.g:3303:2: '{'
            {
             before(grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:3312:1: rule__ProportionNegatif__Group__2 : rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3 ;
    public final void rule__ProportionNegatif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3316:1: ( rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3 )
            // InternalTw.g:3317:2: rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:3324:1: rule__ProportionNegatif__Group__2__Impl : ( ( rule__ProportionNegatif__Group_2__0 ) ) ;
    public final void rule__ProportionNegatif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3328:1: ( ( ( rule__ProportionNegatif__Group_2__0 ) ) )
            // InternalTw.g:3329:1: ( ( rule__ProportionNegatif__Group_2__0 ) )
            {
            // InternalTw.g:3329:1: ( ( rule__ProportionNegatif__Group_2__0 ) )
            // InternalTw.g:3330:2: ( rule__ProportionNegatif__Group_2__0 )
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup_2()); 
            // InternalTw.g:3331:2: ( rule__ProportionNegatif__Group_2__0 )
            // InternalTw.g:3331:3: rule__ProportionNegatif__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getGroup_2()); 

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
    // InternalTw.g:3339:1: rule__ProportionNegatif__Group__3 : rule__ProportionNegatif__Group__3__Impl ;
    public final void rule__ProportionNegatif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3343:1: ( rule__ProportionNegatif__Group__3__Impl )
            // InternalTw.g:3344:2: rule__ProportionNegatif__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group__3__Impl();

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
    // InternalTw.g:3350:1: rule__ProportionNegatif__Group__3__Impl : ( '}' ) ;
    public final void rule__ProportionNegatif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3354:1: ( ( '}' ) )
            // InternalTw.g:3355:1: ( '}' )
            {
            // InternalTw.g:3355:1: ( '}' )
            // InternalTw.g:3356:2: '}'
            {
             before(grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__ProportionNegatif__Group_2__0"
    // InternalTw.g:3366:1: rule__ProportionNegatif__Group_2__0 : rule__ProportionNegatif__Group_2__0__Impl rule__ProportionNegatif__Group_2__1 ;
    public final void rule__ProportionNegatif__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3370:1: ( rule__ProportionNegatif__Group_2__0__Impl rule__ProportionNegatif__Group_2__1 )
            // InternalTw.g:3371:2: rule__ProportionNegatif__Group_2__0__Impl rule__ProportionNegatif__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ProportionNegatif__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_2__1();

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
    // $ANTLR end "rule__ProportionNegatif__Group_2__0"


    // $ANTLR start "rule__ProportionNegatif__Group_2__0__Impl"
    // InternalTw.g:3378:1: rule__ProportionNegatif__Group_2__0__Impl : ( ( rule__ProportionNegatif__ArgsAssignment_2_0 ) ) ;
    public final void rule__ProportionNegatif__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3382:1: ( ( ( rule__ProportionNegatif__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:3383:1: ( ( rule__ProportionNegatif__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:3383:1: ( ( rule__ProportionNegatif__ArgsAssignment_2_0 ) )
            // InternalTw.g:3384:2: ( rule__ProportionNegatif__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:3385:2: ( rule__ProportionNegatif__ArgsAssignment_2_0 )
            // InternalTw.g:3385:3: rule__ProportionNegatif__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__ProportionNegatif__Group_2__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_2__1"
    // InternalTw.g:3393:1: rule__ProportionNegatif__Group_2__1 : rule__ProportionNegatif__Group_2__1__Impl ;
    public final void rule__ProportionNegatif__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3397:1: ( rule__ProportionNegatif__Group_2__1__Impl )
            // InternalTw.g:3398:2: rule__ProportionNegatif__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_2__1__Impl();

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
    // $ANTLR end "rule__ProportionNegatif__Group_2__1"


    // $ANTLR start "rule__ProportionNegatif__Group_2__1__Impl"
    // InternalTw.g:3404:1: rule__ProportionNegatif__Group_2__1__Impl : ( ( rule__ProportionNegatif__Group_2_1__0 )* ) ;
    public final void rule__ProportionNegatif__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3408:1: ( ( ( rule__ProportionNegatif__Group_2_1__0 )* ) )
            // InternalTw.g:3409:1: ( ( rule__ProportionNegatif__Group_2_1__0 )* )
            {
            // InternalTw.g:3409:1: ( ( rule__ProportionNegatif__Group_2_1__0 )* )
            // InternalTw.g:3410:2: ( rule__ProportionNegatif__Group_2_1__0 )*
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup_2_1()); 
            // InternalTw.g:3411:2: ( rule__ProportionNegatif__Group_2_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTw.g:3411:3: rule__ProportionNegatif__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ProportionNegatif__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProportionNegatifAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__ProportionNegatif__Group_2__1__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_2_1__0"
    // InternalTw.g:3420:1: rule__ProportionNegatif__Group_2_1__0 : rule__ProportionNegatif__Group_2_1__0__Impl rule__ProportionNegatif__Group_2_1__1 ;
    public final void rule__ProportionNegatif__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3424:1: ( rule__ProportionNegatif__Group_2_1__0__Impl rule__ProportionNegatif__Group_2_1__1 )
            // InternalTw.g:3425:2: rule__ProportionNegatif__Group_2_1__0__Impl rule__ProportionNegatif__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ProportionNegatif__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_2_1__1();

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
    // $ANTLR end "rule__ProportionNegatif__Group_2_1__0"


    // $ANTLR start "rule__ProportionNegatif__Group_2_1__0__Impl"
    // InternalTw.g:3432:1: rule__ProportionNegatif__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ProportionNegatif__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3436:1: ( ( ',' ) )
            // InternalTw.g:3437:1: ( ',' )
            {
            // InternalTw.g:3437:1: ( ',' )
            // InternalTw.g:3438:2: ','
            {
             before(grammarAccess.getProportionNegatifAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__ProportionNegatif__Group_2_1__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_2_1__1"
    // InternalTw.g:3447:1: rule__ProportionNegatif__Group_2_1__1 : rule__ProportionNegatif__Group_2_1__1__Impl ;
    public final void rule__ProportionNegatif__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3451:1: ( rule__ProportionNegatif__Group_2_1__1__Impl )
            // InternalTw.g:3452:2: rule__ProportionNegatif__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ProportionNegatif__Group_2_1__1"


    // $ANTLR start "rule__ProportionNegatif__Group_2_1__1__Impl"
    // InternalTw.g:3458:1: rule__ProportionNegatif__Group_2_1__1__Impl : ( ( rule__ProportionNegatif__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__ProportionNegatif__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3462:1: ( ( ( rule__ProportionNegatif__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:3463:1: ( ( rule__ProportionNegatif__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:3463:1: ( ( rule__ProportionNegatif__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:3464:2: ( rule__ProportionNegatif__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:3465:2: ( rule__ProportionNegatif__ArgsAssignment_2_1_1 )
            // InternalTw.g:3465:3: rule__ProportionNegatif__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__ProportionNegatif__Group_2_1__1__Impl"


    // $ANTLR start "rule__CountTweet__Group__0"
    // InternalTw.g:3474:1: rule__CountTweet__Group__0 : rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1 ;
    public final void rule__CountTweet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3478:1: ( rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1 )
            // InternalTw.g:3479:2: rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3486:1: rule__CountTweet__Group__0__Impl : ( 'countTweet' ) ;
    public final void rule__CountTweet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3490:1: ( ( 'countTweet' ) )
            // InternalTw.g:3491:1: ( 'countTweet' )
            {
            // InternalTw.g:3491:1: ( 'countTweet' )
            // InternalTw.g:3492:2: 'countTweet'
            {
             before(grammarAccess.getCountTweetAccess().getCountTweetKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getCountTweetKeyword_0()); 

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
    // $ANTLR end "rule__CountTweet__Group__0__Impl"


    // $ANTLR start "rule__CountTweet__Group__1"
    // InternalTw.g:3501:1: rule__CountTweet__Group__1 : rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2 ;
    public final void rule__CountTweet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3505:1: ( rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2 )
            // InternalTw.g:3506:2: rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:3513:1: rule__CountTweet__Group__1__Impl : ( '{' ) ;
    public final void rule__CountTweet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3517:1: ( ( '{' ) )
            // InternalTw.g:3518:1: ( '{' )
            {
            // InternalTw.g:3518:1: ( '{' )
            // InternalTw.g:3519:2: '{'
            {
             before(grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:3528:1: rule__CountTweet__Group__2 : rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3 ;
    public final void rule__CountTweet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3532:1: ( rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3 )
            // InternalTw.g:3533:2: rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:3540:1: rule__CountTweet__Group__2__Impl : ( ( rule__CountTweet__Group_2__0 ) ) ;
    public final void rule__CountTweet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3544:1: ( ( ( rule__CountTweet__Group_2__0 ) ) )
            // InternalTw.g:3545:1: ( ( rule__CountTweet__Group_2__0 ) )
            {
            // InternalTw.g:3545:1: ( ( rule__CountTweet__Group_2__0 ) )
            // InternalTw.g:3546:2: ( rule__CountTweet__Group_2__0 )
            {
             before(grammarAccess.getCountTweetAccess().getGroup_2()); 
            // InternalTw.g:3547:2: ( rule__CountTweet__Group_2__0 )
            // InternalTw.g:3547:3: rule__CountTweet__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getGroup_2()); 

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
    // InternalTw.g:3555:1: rule__CountTweet__Group__3 : rule__CountTweet__Group__3__Impl ;
    public final void rule__CountTweet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3559:1: ( rule__CountTweet__Group__3__Impl )
            // InternalTw.g:3560:2: rule__CountTweet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group__3__Impl();

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
    // InternalTw.g:3566:1: rule__CountTweet__Group__3__Impl : ( '}' ) ;
    public final void rule__CountTweet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3570:1: ( ( '}' ) )
            // InternalTw.g:3571:1: ( '}' )
            {
            // InternalTw.g:3571:1: ( '}' )
            // InternalTw.g:3572:2: '}'
            {
             before(grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__CountTweet__Group_2__0"
    // InternalTw.g:3582:1: rule__CountTweet__Group_2__0 : rule__CountTweet__Group_2__0__Impl rule__CountTweet__Group_2__1 ;
    public final void rule__CountTweet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3586:1: ( rule__CountTweet__Group_2__0__Impl rule__CountTweet__Group_2__1 )
            // InternalTw.g:3587:2: rule__CountTweet__Group_2__0__Impl rule__CountTweet__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__CountTweet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_2__1();

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
    // $ANTLR end "rule__CountTweet__Group_2__0"


    // $ANTLR start "rule__CountTweet__Group_2__0__Impl"
    // InternalTw.g:3594:1: rule__CountTweet__Group_2__0__Impl : ( ( rule__CountTweet__ArgsAssignment_2_0 ) ) ;
    public final void rule__CountTweet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3598:1: ( ( ( rule__CountTweet__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:3599:1: ( ( rule__CountTweet__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:3599:1: ( ( rule__CountTweet__ArgsAssignment_2_0 ) )
            // InternalTw.g:3600:2: ( rule__CountTweet__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getCountTweetAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:3601:2: ( rule__CountTweet__ArgsAssignment_2_0 )
            // InternalTw.g:3601:3: rule__CountTweet__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__CountTweet__Group_2__0__Impl"


    // $ANTLR start "rule__CountTweet__Group_2__1"
    // InternalTw.g:3609:1: rule__CountTweet__Group_2__1 : rule__CountTweet__Group_2__1__Impl ;
    public final void rule__CountTweet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3613:1: ( rule__CountTweet__Group_2__1__Impl )
            // InternalTw.g:3614:2: rule__CountTweet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_2__1__Impl();

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
    // $ANTLR end "rule__CountTweet__Group_2__1"


    // $ANTLR start "rule__CountTweet__Group_2__1__Impl"
    // InternalTw.g:3620:1: rule__CountTweet__Group_2__1__Impl : ( ( rule__CountTweet__Group_2_1__0 )* ) ;
    public final void rule__CountTweet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3624:1: ( ( ( rule__CountTweet__Group_2_1__0 )* ) )
            // InternalTw.g:3625:1: ( ( rule__CountTweet__Group_2_1__0 )* )
            {
            // InternalTw.g:3625:1: ( ( rule__CountTweet__Group_2_1__0 )* )
            // InternalTw.g:3626:2: ( rule__CountTweet__Group_2_1__0 )*
            {
             before(grammarAccess.getCountTweetAccess().getGroup_2_1()); 
            // InternalTw.g:3627:2: ( rule__CountTweet__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTw.g:3627:3: rule__CountTweet__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CountTweet__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCountTweetAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CountTweet__Group_2__1__Impl"


    // $ANTLR start "rule__CountTweet__Group_2_1__0"
    // InternalTw.g:3636:1: rule__CountTweet__Group_2_1__0 : rule__CountTweet__Group_2_1__0__Impl rule__CountTweet__Group_2_1__1 ;
    public final void rule__CountTweet__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3640:1: ( rule__CountTweet__Group_2_1__0__Impl rule__CountTweet__Group_2_1__1 )
            // InternalTw.g:3641:2: rule__CountTweet__Group_2_1__0__Impl rule__CountTweet__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__CountTweet__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_2_1__1();

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
    // $ANTLR end "rule__CountTweet__Group_2_1__0"


    // $ANTLR start "rule__CountTweet__Group_2_1__0__Impl"
    // InternalTw.g:3648:1: rule__CountTweet__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__CountTweet__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3652:1: ( ( ',' ) )
            // InternalTw.g:3653:1: ( ',' )
            {
            // InternalTw.g:3653:1: ( ',' )
            // InternalTw.g:3654:2: ','
            {
             before(grammarAccess.getCountTweetAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CountTweet__Group_2_1__0__Impl"


    // $ANTLR start "rule__CountTweet__Group_2_1__1"
    // InternalTw.g:3663:1: rule__CountTweet__Group_2_1__1 : rule__CountTweet__Group_2_1__1__Impl ;
    public final void rule__CountTweet__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3667:1: ( rule__CountTweet__Group_2_1__1__Impl )
            // InternalTw.g:3668:2: rule__CountTweet__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__CountTweet__Group_2_1__1"


    // $ANTLR start "rule__CountTweet__Group_2_1__1__Impl"
    // InternalTw.g:3674:1: rule__CountTweet__Group_2_1__1__Impl : ( ( rule__CountTweet__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__CountTweet__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3678:1: ( ( ( rule__CountTweet__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:3679:1: ( ( rule__CountTweet__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:3679:1: ( ( rule__CountTweet__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:3680:2: ( rule__CountTweet__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getCountTweetAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:3681:2: ( rule__CountTweet__ArgsAssignment_2_1_1 )
            // InternalTw.g:3681:3: rule__CountTweet__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CountTweet__Group_2_1__1__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__0"
    // InternalTw.g:3690:1: rule__CountVisitProfil__Group__0 : rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1 ;
    public final void rule__CountVisitProfil__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3694:1: ( rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1 )
            // InternalTw.g:3695:2: rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3702:1: rule__CountVisitProfil__Group__0__Impl : ( 'countVisitProfil' ) ;
    public final void rule__CountVisitProfil__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3706:1: ( ( 'countVisitProfil' ) )
            // InternalTw.g:3707:1: ( 'countVisitProfil' )
            {
            // InternalTw.g:3707:1: ( 'countVisitProfil' )
            // InternalTw.g:3708:2: 'countVisitProfil'
            {
             before(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_0()); 

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
    // $ANTLR end "rule__CountVisitProfil__Group__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__1"
    // InternalTw.g:3717:1: rule__CountVisitProfil__Group__1 : rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2 ;
    public final void rule__CountVisitProfil__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3721:1: ( rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2 )
            // InternalTw.g:3722:2: rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:3729:1: rule__CountVisitProfil__Group__1__Impl : ( '{' ) ;
    public final void rule__CountVisitProfil__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3733:1: ( ( '{' ) )
            // InternalTw.g:3734:1: ( '{' )
            {
            // InternalTw.g:3734:1: ( '{' )
            // InternalTw.g:3735:2: '{'
            {
             before(grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:3744:1: rule__CountVisitProfil__Group__2 : rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3 ;
    public final void rule__CountVisitProfil__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3748:1: ( rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3 )
            // InternalTw.g:3749:2: rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:3756:1: rule__CountVisitProfil__Group__2__Impl : ( ( rule__CountVisitProfil__Group_2__0 ) ) ;
    public final void rule__CountVisitProfil__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3760:1: ( ( ( rule__CountVisitProfil__Group_2__0 ) ) )
            // InternalTw.g:3761:1: ( ( rule__CountVisitProfil__Group_2__0 ) )
            {
            // InternalTw.g:3761:1: ( ( rule__CountVisitProfil__Group_2__0 ) )
            // InternalTw.g:3762:2: ( rule__CountVisitProfil__Group_2__0 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup_2()); 
            // InternalTw.g:3763:2: ( rule__CountVisitProfil__Group_2__0 )
            // InternalTw.g:3763:3: rule__CountVisitProfil__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getGroup_2()); 

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
    // InternalTw.g:3771:1: rule__CountVisitProfil__Group__3 : rule__CountVisitProfil__Group__3__Impl ;
    public final void rule__CountVisitProfil__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3775:1: ( rule__CountVisitProfil__Group__3__Impl )
            // InternalTw.g:3776:2: rule__CountVisitProfil__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group__3__Impl();

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
    // InternalTw.g:3782:1: rule__CountVisitProfil__Group__3__Impl : ( '}' ) ;
    public final void rule__CountVisitProfil__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3786:1: ( ( '}' ) )
            // InternalTw.g:3787:1: ( '}' )
            {
            // InternalTw.g:3787:1: ( '}' )
            // InternalTw.g:3788:2: '}'
            {
             before(grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__CountVisitProfil__Group_2__0"
    // InternalTw.g:3798:1: rule__CountVisitProfil__Group_2__0 : rule__CountVisitProfil__Group_2__0__Impl rule__CountVisitProfil__Group_2__1 ;
    public final void rule__CountVisitProfil__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3802:1: ( rule__CountVisitProfil__Group_2__0__Impl rule__CountVisitProfil__Group_2__1 )
            // InternalTw.g:3803:2: rule__CountVisitProfil__Group_2__0__Impl rule__CountVisitProfil__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__CountVisitProfil__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_2__1();

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
    // $ANTLR end "rule__CountVisitProfil__Group_2__0"


    // $ANTLR start "rule__CountVisitProfil__Group_2__0__Impl"
    // InternalTw.g:3810:1: rule__CountVisitProfil__Group_2__0__Impl : ( ( rule__CountVisitProfil__ArgsAssignment_2_0 ) ) ;
    public final void rule__CountVisitProfil__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3814:1: ( ( ( rule__CountVisitProfil__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:3815:1: ( ( rule__CountVisitProfil__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:3815:1: ( ( rule__CountVisitProfil__ArgsAssignment_2_0 ) )
            // InternalTw.g:3816:2: ( rule__CountVisitProfil__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:3817:2: ( rule__CountVisitProfil__ArgsAssignment_2_0 )
            // InternalTw.g:3817:3: rule__CountVisitProfil__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__CountVisitProfil__Group_2__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_2__1"
    // InternalTw.g:3825:1: rule__CountVisitProfil__Group_2__1 : rule__CountVisitProfil__Group_2__1__Impl ;
    public final void rule__CountVisitProfil__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3829:1: ( rule__CountVisitProfil__Group_2__1__Impl )
            // InternalTw.g:3830:2: rule__CountVisitProfil__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_2__1__Impl();

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
    // $ANTLR end "rule__CountVisitProfil__Group_2__1"


    // $ANTLR start "rule__CountVisitProfil__Group_2__1__Impl"
    // InternalTw.g:3836:1: rule__CountVisitProfil__Group_2__1__Impl : ( ( rule__CountVisitProfil__Group_2_1__0 )* ) ;
    public final void rule__CountVisitProfil__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3840:1: ( ( ( rule__CountVisitProfil__Group_2_1__0 )* ) )
            // InternalTw.g:3841:1: ( ( rule__CountVisitProfil__Group_2_1__0 )* )
            {
            // InternalTw.g:3841:1: ( ( rule__CountVisitProfil__Group_2_1__0 )* )
            // InternalTw.g:3842:2: ( rule__CountVisitProfil__Group_2_1__0 )*
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup_2_1()); 
            // InternalTw.g:3843:2: ( rule__CountVisitProfil__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTw.g:3843:3: rule__CountVisitProfil__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CountVisitProfil__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCountVisitProfilAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CountVisitProfil__Group_2__1__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_2_1__0"
    // InternalTw.g:3852:1: rule__CountVisitProfil__Group_2_1__0 : rule__CountVisitProfil__Group_2_1__0__Impl rule__CountVisitProfil__Group_2_1__1 ;
    public final void rule__CountVisitProfil__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3856:1: ( rule__CountVisitProfil__Group_2_1__0__Impl rule__CountVisitProfil__Group_2_1__1 )
            // InternalTw.g:3857:2: rule__CountVisitProfil__Group_2_1__0__Impl rule__CountVisitProfil__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__CountVisitProfil__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_2_1__1();

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
    // $ANTLR end "rule__CountVisitProfil__Group_2_1__0"


    // $ANTLR start "rule__CountVisitProfil__Group_2_1__0__Impl"
    // InternalTw.g:3864:1: rule__CountVisitProfil__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__CountVisitProfil__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3868:1: ( ( ',' ) )
            // InternalTw.g:3869:1: ( ',' )
            {
            // InternalTw.g:3869:1: ( ',' )
            // InternalTw.g:3870:2: ','
            {
             before(grammarAccess.getCountVisitProfilAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CountVisitProfil__Group_2_1__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_2_1__1"
    // InternalTw.g:3879:1: rule__CountVisitProfil__Group_2_1__1 : rule__CountVisitProfil__Group_2_1__1__Impl ;
    public final void rule__CountVisitProfil__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3883:1: ( rule__CountVisitProfil__Group_2_1__1__Impl )
            // InternalTw.g:3884:2: rule__CountVisitProfil__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__CountVisitProfil__Group_2_1__1"


    // $ANTLR start "rule__CountVisitProfil__Group_2_1__1__Impl"
    // InternalTw.g:3890:1: rule__CountVisitProfil__Group_2_1__1__Impl : ( ( rule__CountVisitProfil__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__CountVisitProfil__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3894:1: ( ( ( rule__CountVisitProfil__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:3895:1: ( ( rule__CountVisitProfil__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:3895:1: ( ( rule__CountVisitProfil__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:3896:2: ( rule__CountVisitProfil__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:3897:2: ( rule__CountVisitProfil__ArgsAssignment_2_1_1 )
            // InternalTw.g:3897:3: rule__CountVisitProfil__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CountVisitProfil__Group_2_1__1__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__0"
    // InternalTw.g:3906:1: rule__CroissanceAbonne__Group__0 : rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1 ;
    public final void rule__CroissanceAbonne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3910:1: ( rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1 )
            // InternalTw.g:3911:2: rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3918:1: rule__CroissanceAbonne__Group__0__Impl : ( 'CroissanceAbonne' ) ;
    public final void rule__CroissanceAbonne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3922:1: ( ( 'CroissanceAbonne' ) )
            // InternalTw.g:3923:1: ( 'CroissanceAbonne' )
            {
            // InternalTw.g:3923:1: ( 'CroissanceAbonne' )
            // InternalTw.g:3924:2: 'CroissanceAbonne'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_0()); 

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
    // $ANTLR end "rule__CroissanceAbonne__Group__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__1"
    // InternalTw.g:3933:1: rule__CroissanceAbonne__Group__1 : rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2 ;
    public final void rule__CroissanceAbonne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3937:1: ( rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2 )
            // InternalTw.g:3938:2: rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:3945:1: rule__CroissanceAbonne__Group__1__Impl : ( '{' ) ;
    public final void rule__CroissanceAbonne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3949:1: ( ( '{' ) )
            // InternalTw.g:3950:1: ( '{' )
            {
            // InternalTw.g:3950:1: ( '{' )
            // InternalTw.g:3951:2: '{'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:3960:1: rule__CroissanceAbonne__Group__2 : rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3 ;
    public final void rule__CroissanceAbonne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3964:1: ( rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3 )
            // InternalTw.g:3965:2: rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:3972:1: rule__CroissanceAbonne__Group__2__Impl : ( ( rule__CroissanceAbonne__Group_2__0 ) ) ;
    public final void rule__CroissanceAbonne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3976:1: ( ( ( rule__CroissanceAbonne__Group_2__0 ) ) )
            // InternalTw.g:3977:1: ( ( rule__CroissanceAbonne__Group_2__0 ) )
            {
            // InternalTw.g:3977:1: ( ( rule__CroissanceAbonne__Group_2__0 ) )
            // InternalTw.g:3978:2: ( rule__CroissanceAbonne__Group_2__0 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup_2()); 
            // InternalTw.g:3979:2: ( rule__CroissanceAbonne__Group_2__0 )
            // InternalTw.g:3979:3: rule__CroissanceAbonne__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getGroup_2()); 

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
    // InternalTw.g:3987:1: rule__CroissanceAbonne__Group__3 : rule__CroissanceAbonne__Group__3__Impl ;
    public final void rule__CroissanceAbonne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3991:1: ( rule__CroissanceAbonne__Group__3__Impl )
            // InternalTw.g:3992:2: rule__CroissanceAbonne__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group__3__Impl();

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
    // InternalTw.g:3998:1: rule__CroissanceAbonne__Group__3__Impl : ( '}' ) ;
    public final void rule__CroissanceAbonne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4002:1: ( ( '}' ) )
            // InternalTw.g:4003:1: ( '}' )
            {
            // InternalTw.g:4003:1: ( '}' )
            // InternalTw.g:4004:2: '}'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__CroissanceAbonne__Group_2__0"
    // InternalTw.g:4014:1: rule__CroissanceAbonne__Group_2__0 : rule__CroissanceAbonne__Group_2__0__Impl rule__CroissanceAbonne__Group_2__1 ;
    public final void rule__CroissanceAbonne__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4018:1: ( rule__CroissanceAbonne__Group_2__0__Impl rule__CroissanceAbonne__Group_2__1 )
            // InternalTw.g:4019:2: rule__CroissanceAbonne__Group_2__0__Impl rule__CroissanceAbonne__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__CroissanceAbonne__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_2__1();

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2__0"


    // $ANTLR start "rule__CroissanceAbonne__Group_2__0__Impl"
    // InternalTw.g:4026:1: rule__CroissanceAbonne__Group_2__0__Impl : ( ( rule__CroissanceAbonne__ArgsAssignment_2_0 ) ) ;
    public final void rule__CroissanceAbonne__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4030:1: ( ( ( rule__CroissanceAbonne__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:4031:1: ( ( rule__CroissanceAbonne__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:4031:1: ( ( rule__CroissanceAbonne__ArgsAssignment_2_0 ) )
            // InternalTw.g:4032:2: ( rule__CroissanceAbonne__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:4033:2: ( rule__CroissanceAbonne__ArgsAssignment_2_0 )
            // InternalTw.g:4033:3: rule__CroissanceAbonne__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_2__1"
    // InternalTw.g:4041:1: rule__CroissanceAbonne__Group_2__1 : rule__CroissanceAbonne__Group_2__1__Impl ;
    public final void rule__CroissanceAbonne__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4045:1: ( rule__CroissanceAbonne__Group_2__1__Impl )
            // InternalTw.g:4046:2: rule__CroissanceAbonne__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_2__1__Impl();

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2__1"


    // $ANTLR start "rule__CroissanceAbonne__Group_2__1__Impl"
    // InternalTw.g:4052:1: rule__CroissanceAbonne__Group_2__1__Impl : ( ( rule__CroissanceAbonne__Group_2_1__0 )* ) ;
    public final void rule__CroissanceAbonne__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4056:1: ( ( ( rule__CroissanceAbonne__Group_2_1__0 )* ) )
            // InternalTw.g:4057:1: ( ( rule__CroissanceAbonne__Group_2_1__0 )* )
            {
            // InternalTw.g:4057:1: ( ( rule__CroissanceAbonne__Group_2_1__0 )* )
            // InternalTw.g:4058:2: ( rule__CroissanceAbonne__Group_2_1__0 )*
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup_2_1()); 
            // InternalTw.g:4059:2: ( rule__CroissanceAbonne__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTw.g:4059:3: rule__CroissanceAbonne__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CroissanceAbonne__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCroissanceAbonneAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2__1__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_2_1__0"
    // InternalTw.g:4068:1: rule__CroissanceAbonne__Group_2_1__0 : rule__CroissanceAbonne__Group_2_1__0__Impl rule__CroissanceAbonne__Group_2_1__1 ;
    public final void rule__CroissanceAbonne__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4072:1: ( rule__CroissanceAbonne__Group_2_1__0__Impl rule__CroissanceAbonne__Group_2_1__1 )
            // InternalTw.g:4073:2: rule__CroissanceAbonne__Group_2_1__0__Impl rule__CroissanceAbonne__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__CroissanceAbonne__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_2_1__1();

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2_1__0"


    // $ANTLR start "rule__CroissanceAbonne__Group_2_1__0__Impl"
    // InternalTw.g:4080:1: rule__CroissanceAbonne__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__CroissanceAbonne__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4084:1: ( ( ',' ) )
            // InternalTw.g:4085:1: ( ',' )
            {
            // InternalTw.g:4085:1: ( ',' )
            // InternalTw.g:4086:2: ','
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2_1__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_2_1__1"
    // InternalTw.g:4095:1: rule__CroissanceAbonne__Group_2_1__1 : rule__CroissanceAbonne__Group_2_1__1__Impl ;
    public final void rule__CroissanceAbonne__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4099:1: ( rule__CroissanceAbonne__Group_2_1__1__Impl )
            // InternalTw.g:4100:2: rule__CroissanceAbonne__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2_1__1"


    // $ANTLR start "rule__CroissanceAbonne__Group_2_1__1__Impl"
    // InternalTw.g:4106:1: rule__CroissanceAbonne__Group_2_1__1__Impl : ( ( rule__CroissanceAbonne__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__CroissanceAbonne__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4110:1: ( ( ( rule__CroissanceAbonne__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:4111:1: ( ( rule__CroissanceAbonne__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:4111:1: ( ( rule__CroissanceAbonne__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:4112:2: ( rule__CroissanceAbonne__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:4113:2: ( rule__CroissanceAbonne__ArgsAssignment_2_1_1 )
            // InternalTw.g:4113:3: rule__CroissanceAbonne__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CroissanceAbonne__Group_2_1__1__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__0"
    // InternalTw.g:4122:1: rule__MoyFollowers__Group__0 : rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1 ;
    public final void rule__MoyFollowers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4126:1: ( rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1 )
            // InternalTw.g:4127:2: rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:4134:1: rule__MoyFollowers__Group__0__Impl : ( 'moyFollowers' ) ;
    public final void rule__MoyFollowers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4138:1: ( ( 'moyFollowers' ) )
            // InternalTw.g:4139:1: ( 'moyFollowers' )
            {
            // InternalTw.g:4139:1: ( 'moyFollowers' )
            // InternalTw.g:4140:2: 'moyFollowers'
            {
             before(grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_0()); 

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
    // $ANTLR end "rule__MoyFollowers__Group__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__1"
    // InternalTw.g:4149:1: rule__MoyFollowers__Group__1 : rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2 ;
    public final void rule__MoyFollowers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4153:1: ( rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2 )
            // InternalTw.g:4154:2: rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:4161:1: rule__MoyFollowers__Group__1__Impl : ( '{' ) ;
    public final void rule__MoyFollowers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4165:1: ( ( '{' ) )
            // InternalTw.g:4166:1: ( '{' )
            {
            // InternalTw.g:4166:1: ( '{' )
            // InternalTw.g:4167:2: '{'
            {
             before(grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:4176:1: rule__MoyFollowers__Group__2 : rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3 ;
    public final void rule__MoyFollowers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4180:1: ( rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3 )
            // InternalTw.g:4181:2: rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:4188:1: rule__MoyFollowers__Group__2__Impl : ( ( rule__MoyFollowers__Group_2__0 ) ) ;
    public final void rule__MoyFollowers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4192:1: ( ( ( rule__MoyFollowers__Group_2__0 ) ) )
            // InternalTw.g:4193:1: ( ( rule__MoyFollowers__Group_2__0 ) )
            {
            // InternalTw.g:4193:1: ( ( rule__MoyFollowers__Group_2__0 ) )
            // InternalTw.g:4194:2: ( rule__MoyFollowers__Group_2__0 )
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup_2()); 
            // InternalTw.g:4195:2: ( rule__MoyFollowers__Group_2__0 )
            // InternalTw.g:4195:3: rule__MoyFollowers__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getGroup_2()); 

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
    // InternalTw.g:4203:1: rule__MoyFollowers__Group__3 : rule__MoyFollowers__Group__3__Impl ;
    public final void rule__MoyFollowers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4207:1: ( rule__MoyFollowers__Group__3__Impl )
            // InternalTw.g:4208:2: rule__MoyFollowers__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group__3__Impl();

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
    // InternalTw.g:4214:1: rule__MoyFollowers__Group__3__Impl : ( '}' ) ;
    public final void rule__MoyFollowers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4218:1: ( ( '}' ) )
            // InternalTw.g:4219:1: ( '}' )
            {
            // InternalTw.g:4219:1: ( '}' )
            // InternalTw.g:4220:2: '}'
            {
             before(grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__MoyFollowers__Group_2__0"
    // InternalTw.g:4230:1: rule__MoyFollowers__Group_2__0 : rule__MoyFollowers__Group_2__0__Impl rule__MoyFollowers__Group_2__1 ;
    public final void rule__MoyFollowers__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4234:1: ( rule__MoyFollowers__Group_2__0__Impl rule__MoyFollowers__Group_2__1 )
            // InternalTw.g:4235:2: rule__MoyFollowers__Group_2__0__Impl rule__MoyFollowers__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__MoyFollowers__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_2__1();

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
    // $ANTLR end "rule__MoyFollowers__Group_2__0"


    // $ANTLR start "rule__MoyFollowers__Group_2__0__Impl"
    // InternalTw.g:4242:1: rule__MoyFollowers__Group_2__0__Impl : ( ( rule__MoyFollowers__ArgsAssignment_2_0 ) ) ;
    public final void rule__MoyFollowers__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4246:1: ( ( ( rule__MoyFollowers__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:4247:1: ( ( rule__MoyFollowers__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:4247:1: ( ( rule__MoyFollowers__ArgsAssignment_2_0 ) )
            // InternalTw.g:4248:2: ( rule__MoyFollowers__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:4249:2: ( rule__MoyFollowers__ArgsAssignment_2_0 )
            // InternalTw.g:4249:3: rule__MoyFollowers__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__MoyFollowers__Group_2__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_2__1"
    // InternalTw.g:4257:1: rule__MoyFollowers__Group_2__1 : rule__MoyFollowers__Group_2__1__Impl ;
    public final void rule__MoyFollowers__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4261:1: ( rule__MoyFollowers__Group_2__1__Impl )
            // InternalTw.g:4262:2: rule__MoyFollowers__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_2__1__Impl();

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
    // $ANTLR end "rule__MoyFollowers__Group_2__1"


    // $ANTLR start "rule__MoyFollowers__Group_2__1__Impl"
    // InternalTw.g:4268:1: rule__MoyFollowers__Group_2__1__Impl : ( ( rule__MoyFollowers__Group_2_1__0 )* ) ;
    public final void rule__MoyFollowers__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4272:1: ( ( ( rule__MoyFollowers__Group_2_1__0 )* ) )
            // InternalTw.g:4273:1: ( ( rule__MoyFollowers__Group_2_1__0 )* )
            {
            // InternalTw.g:4273:1: ( ( rule__MoyFollowers__Group_2_1__0 )* )
            // InternalTw.g:4274:2: ( rule__MoyFollowers__Group_2_1__0 )*
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup_2_1()); 
            // InternalTw.g:4275:2: ( rule__MoyFollowers__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTw.g:4275:3: rule__MoyFollowers__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MoyFollowers__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMoyFollowersAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__MoyFollowers__Group_2__1__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_2_1__0"
    // InternalTw.g:4284:1: rule__MoyFollowers__Group_2_1__0 : rule__MoyFollowers__Group_2_1__0__Impl rule__MoyFollowers__Group_2_1__1 ;
    public final void rule__MoyFollowers__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4288:1: ( rule__MoyFollowers__Group_2_1__0__Impl rule__MoyFollowers__Group_2_1__1 )
            // InternalTw.g:4289:2: rule__MoyFollowers__Group_2_1__0__Impl rule__MoyFollowers__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__MoyFollowers__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_2_1__1();

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
    // $ANTLR end "rule__MoyFollowers__Group_2_1__0"


    // $ANTLR start "rule__MoyFollowers__Group_2_1__0__Impl"
    // InternalTw.g:4296:1: rule__MoyFollowers__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MoyFollowers__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4300:1: ( ( ',' ) )
            // InternalTw.g:4301:1: ( ',' )
            {
            // InternalTw.g:4301:1: ( ',' )
            // InternalTw.g:4302:2: ','
            {
             before(grammarAccess.getMoyFollowersAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__MoyFollowers__Group_2_1__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_2_1__1"
    // InternalTw.g:4311:1: rule__MoyFollowers__Group_2_1__1 : rule__MoyFollowers__Group_2_1__1__Impl ;
    public final void rule__MoyFollowers__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4315:1: ( rule__MoyFollowers__Group_2_1__1__Impl )
            // InternalTw.g:4316:2: rule__MoyFollowers__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MoyFollowers__Group_2_1__1"


    // $ANTLR start "rule__MoyFollowers__Group_2_1__1__Impl"
    // InternalTw.g:4322:1: rule__MoyFollowers__Group_2_1__1__Impl : ( ( rule__MoyFollowers__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__MoyFollowers__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4326:1: ( ( ( rule__MoyFollowers__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:4327:1: ( ( rule__MoyFollowers__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:4327:1: ( ( rule__MoyFollowers__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:4328:2: ( rule__MoyFollowers__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:4329:2: ( rule__MoyFollowers__ArgsAssignment_2_1_1 )
            // InternalTw.g:4329:3: rule__MoyFollowers__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__MoyFollowers__Group_2_1__1__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__0"
    // InternalTw.g:4338:1: rule__MoyFavorited__Group__0 : rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1 ;
    public final void rule__MoyFavorited__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4342:1: ( rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1 )
            // InternalTw.g:4343:2: rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:4350:1: rule__MoyFavorited__Group__0__Impl : ( 'moyFavorited' ) ;
    public final void rule__MoyFavorited__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4354:1: ( ( 'moyFavorited' ) )
            // InternalTw.g:4355:1: ( 'moyFavorited' )
            {
            // InternalTw.g:4355:1: ( 'moyFavorited' )
            // InternalTw.g:4356:2: 'moyFavorited'
            {
             before(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_0()); 

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
    // $ANTLR end "rule__MoyFavorited__Group__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__1"
    // InternalTw.g:4365:1: rule__MoyFavorited__Group__1 : rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2 ;
    public final void rule__MoyFavorited__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4369:1: ( rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2 )
            // InternalTw.g:4370:2: rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTw.g:4377:1: rule__MoyFavorited__Group__1__Impl : ( '{' ) ;
    public final void rule__MoyFavorited__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4381:1: ( ( '{' ) )
            // InternalTw.g:4382:1: ( '{' )
            {
            // InternalTw.g:4382:1: ( '{' )
            // InternalTw.g:4383:2: '{'
            {
             before(grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalTw.g:4392:1: rule__MoyFavorited__Group__2 : rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3 ;
    public final void rule__MoyFavorited__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4396:1: ( rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3 )
            // InternalTw.g:4397:2: rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalTw.g:4404:1: rule__MoyFavorited__Group__2__Impl : ( ( rule__MoyFavorited__Group_2__0 ) ) ;
    public final void rule__MoyFavorited__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4408:1: ( ( ( rule__MoyFavorited__Group_2__0 ) ) )
            // InternalTw.g:4409:1: ( ( rule__MoyFavorited__Group_2__0 ) )
            {
            // InternalTw.g:4409:1: ( ( rule__MoyFavorited__Group_2__0 ) )
            // InternalTw.g:4410:2: ( rule__MoyFavorited__Group_2__0 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup_2()); 
            // InternalTw.g:4411:2: ( rule__MoyFavorited__Group_2__0 )
            // InternalTw.g:4411:3: rule__MoyFavorited__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getGroup_2()); 

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
    // InternalTw.g:4419:1: rule__MoyFavorited__Group__3 : rule__MoyFavorited__Group__3__Impl ;
    public final void rule__MoyFavorited__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4423:1: ( rule__MoyFavorited__Group__3__Impl )
            // InternalTw.g:4424:2: rule__MoyFavorited__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group__3__Impl();

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
    // InternalTw.g:4430:1: rule__MoyFavorited__Group__3__Impl : ( '}' ) ;
    public final void rule__MoyFavorited__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4434:1: ( ( '}' ) )
            // InternalTw.g:4435:1: ( '}' )
            {
            // InternalTw.g:4435:1: ( '}' )
            // InternalTw.g:4436:2: '}'
            {
             before(grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__MoyFavorited__Group_2__0"
    // InternalTw.g:4446:1: rule__MoyFavorited__Group_2__0 : rule__MoyFavorited__Group_2__0__Impl rule__MoyFavorited__Group_2__1 ;
    public final void rule__MoyFavorited__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4450:1: ( rule__MoyFavorited__Group_2__0__Impl rule__MoyFavorited__Group_2__1 )
            // InternalTw.g:4451:2: rule__MoyFavorited__Group_2__0__Impl rule__MoyFavorited__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__MoyFavorited__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_2__1();

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
    // $ANTLR end "rule__MoyFavorited__Group_2__0"


    // $ANTLR start "rule__MoyFavorited__Group_2__0__Impl"
    // InternalTw.g:4458:1: rule__MoyFavorited__Group_2__0__Impl : ( ( rule__MoyFavorited__ArgsAssignment_2_0 ) ) ;
    public final void rule__MoyFavorited__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4462:1: ( ( ( rule__MoyFavorited__ArgsAssignment_2_0 ) ) )
            // InternalTw.g:4463:1: ( ( rule__MoyFavorited__ArgsAssignment_2_0 ) )
            {
            // InternalTw.g:4463:1: ( ( rule__MoyFavorited__ArgsAssignment_2_0 ) )
            // InternalTw.g:4464:2: ( rule__MoyFavorited__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_2_0()); 
            // InternalTw.g:4465:2: ( rule__MoyFavorited__ArgsAssignment_2_0 )
            // InternalTw.g:4465:3: rule__MoyFavorited__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_2_0()); 

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
    // $ANTLR end "rule__MoyFavorited__Group_2__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_2__1"
    // InternalTw.g:4473:1: rule__MoyFavorited__Group_2__1 : rule__MoyFavorited__Group_2__1__Impl ;
    public final void rule__MoyFavorited__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4477:1: ( rule__MoyFavorited__Group_2__1__Impl )
            // InternalTw.g:4478:2: rule__MoyFavorited__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_2__1__Impl();

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
    // $ANTLR end "rule__MoyFavorited__Group_2__1"


    // $ANTLR start "rule__MoyFavorited__Group_2__1__Impl"
    // InternalTw.g:4484:1: rule__MoyFavorited__Group_2__1__Impl : ( ( rule__MoyFavorited__Group_2_1__0 )* ) ;
    public final void rule__MoyFavorited__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4488:1: ( ( ( rule__MoyFavorited__Group_2_1__0 )* ) )
            // InternalTw.g:4489:1: ( ( rule__MoyFavorited__Group_2_1__0 )* )
            {
            // InternalTw.g:4489:1: ( ( rule__MoyFavorited__Group_2_1__0 )* )
            // InternalTw.g:4490:2: ( rule__MoyFavorited__Group_2_1__0 )*
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup_2_1()); 
            // InternalTw.g:4491:2: ( rule__MoyFavorited__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTw.g:4491:3: rule__MoyFavorited__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MoyFavorited__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMoyFavoritedAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__MoyFavorited__Group_2__1__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_2_1__0"
    // InternalTw.g:4500:1: rule__MoyFavorited__Group_2_1__0 : rule__MoyFavorited__Group_2_1__0__Impl rule__MoyFavorited__Group_2_1__1 ;
    public final void rule__MoyFavorited__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4504:1: ( rule__MoyFavorited__Group_2_1__0__Impl rule__MoyFavorited__Group_2_1__1 )
            // InternalTw.g:4505:2: rule__MoyFavorited__Group_2_1__0__Impl rule__MoyFavorited__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__MoyFavorited__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_2_1__1();

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
    // $ANTLR end "rule__MoyFavorited__Group_2_1__0"


    // $ANTLR start "rule__MoyFavorited__Group_2_1__0__Impl"
    // InternalTw.g:4512:1: rule__MoyFavorited__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MoyFavorited__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4516:1: ( ( ',' ) )
            // InternalTw.g:4517:1: ( ',' )
            {
            // InternalTw.g:4517:1: ( ',' )
            // InternalTw.g:4518:2: ','
            {
             before(grammarAccess.getMoyFavoritedAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__MoyFavorited__Group_2_1__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_2_1__1"
    // InternalTw.g:4527:1: rule__MoyFavorited__Group_2_1__1 : rule__MoyFavorited__Group_2_1__1__Impl ;
    public final void rule__MoyFavorited__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4531:1: ( rule__MoyFavorited__Group_2_1__1__Impl )
            // InternalTw.g:4532:2: rule__MoyFavorited__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MoyFavorited__Group_2_1__1"


    // $ANTLR start "rule__MoyFavorited__Group_2_1__1__Impl"
    // InternalTw.g:4538:1: rule__MoyFavorited__Group_2_1__1__Impl : ( ( rule__MoyFavorited__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__MoyFavorited__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4542:1: ( ( ( rule__MoyFavorited__ArgsAssignment_2_1_1 ) ) )
            // InternalTw.g:4543:1: ( ( rule__MoyFavorited__ArgsAssignment_2_1_1 ) )
            {
            // InternalTw.g:4543:1: ( ( rule__MoyFavorited__ArgsAssignment_2_1_1 ) )
            // InternalTw.g:4544:2: ( rule__MoyFavorited__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_2_1_1()); 
            // InternalTw.g:4545:2: ( rule__MoyFavorited__ArgsAssignment_2_1_1 )
            // InternalTw.g:4545:3: rule__MoyFavorited__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__MoyFavorited__Group_2_1__1__Impl"


    // $ANTLR start "rule__GREATER__Group__0"
    // InternalTw.g:4554:1: rule__GREATER__Group__0 : rule__GREATER__Group__0__Impl rule__GREATER__Group__1 ;
    public final void rule__GREATER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4558:1: ( rule__GREATER__Group__0__Impl rule__GREATER__Group__1 )
            // InternalTw.g:4559:2: rule__GREATER__Group__0__Impl rule__GREATER__Group__1
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
    // InternalTw.g:4566:1: rule__GREATER__Group__0__Impl : ( 'GREATER' ) ;
    public final void rule__GREATER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4570:1: ( ( 'GREATER' ) )
            // InternalTw.g:4571:1: ( 'GREATER' )
            {
            // InternalTw.g:4571:1: ( 'GREATER' )
            // InternalTw.g:4572:2: 'GREATER'
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
    // InternalTw.g:4581:1: rule__GREATER__Group__1 : rule__GREATER__Group__1__Impl rule__GREATER__Group__2 ;
    public final void rule__GREATER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4585:1: ( rule__GREATER__Group__1__Impl rule__GREATER__Group__2 )
            // InternalTw.g:4586:2: rule__GREATER__Group__1__Impl rule__GREATER__Group__2
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
    // InternalTw.g:4593:1: rule__GREATER__Group__1__Impl : ( '(' ) ;
    public final void rule__GREATER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4597:1: ( ( '(' ) )
            // InternalTw.g:4598:1: ( '(' )
            {
            // InternalTw.g:4598:1: ( '(' )
            // InternalTw.g:4599:2: '('
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
    // InternalTw.g:4608:1: rule__GREATER__Group__2 : rule__GREATER__Group__2__Impl rule__GREATER__Group__3 ;
    public final void rule__GREATER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4612:1: ( rule__GREATER__Group__2__Impl rule__GREATER__Group__3 )
            // InternalTw.g:4613:2: rule__GREATER__Group__2__Impl rule__GREATER__Group__3
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
    // InternalTw.g:4620:1: rule__GREATER__Group__2__Impl : ( ( rule__GREATER__Exp1Assignment_2 ) ) ;
    public final void rule__GREATER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4624:1: ( ( ( rule__GREATER__Exp1Assignment_2 ) ) )
            // InternalTw.g:4625:1: ( ( rule__GREATER__Exp1Assignment_2 ) )
            {
            // InternalTw.g:4625:1: ( ( rule__GREATER__Exp1Assignment_2 ) )
            // InternalTw.g:4626:2: ( rule__GREATER__Exp1Assignment_2 )
            {
             before(grammarAccess.getGREATERAccess().getExp1Assignment_2()); 
            // InternalTw.g:4627:2: ( rule__GREATER__Exp1Assignment_2 )
            // InternalTw.g:4627:3: rule__GREATER__Exp1Assignment_2
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
    // InternalTw.g:4635:1: rule__GREATER__Group__3 : rule__GREATER__Group__3__Impl rule__GREATER__Group__4 ;
    public final void rule__GREATER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4639:1: ( rule__GREATER__Group__3__Impl rule__GREATER__Group__4 )
            // InternalTw.g:4640:2: rule__GREATER__Group__3__Impl rule__GREATER__Group__4
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
    // InternalTw.g:4647:1: rule__GREATER__Group__3__Impl : ( ',' ) ;
    public final void rule__GREATER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4651:1: ( ( ',' ) )
            // InternalTw.g:4652:1: ( ',' )
            {
            // InternalTw.g:4652:1: ( ',' )
            // InternalTw.g:4653:2: ','
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
    // InternalTw.g:4662:1: rule__GREATER__Group__4 : rule__GREATER__Group__4__Impl rule__GREATER__Group__5 ;
    public final void rule__GREATER__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4666:1: ( rule__GREATER__Group__4__Impl rule__GREATER__Group__5 )
            // InternalTw.g:4667:2: rule__GREATER__Group__4__Impl rule__GREATER__Group__5
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
    // InternalTw.g:4674:1: rule__GREATER__Group__4__Impl : ( ( rule__GREATER__Exp2Assignment_4 ) ) ;
    public final void rule__GREATER__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4678:1: ( ( ( rule__GREATER__Exp2Assignment_4 ) ) )
            // InternalTw.g:4679:1: ( ( rule__GREATER__Exp2Assignment_4 ) )
            {
            // InternalTw.g:4679:1: ( ( rule__GREATER__Exp2Assignment_4 ) )
            // InternalTw.g:4680:2: ( rule__GREATER__Exp2Assignment_4 )
            {
             before(grammarAccess.getGREATERAccess().getExp2Assignment_4()); 
            // InternalTw.g:4681:2: ( rule__GREATER__Exp2Assignment_4 )
            // InternalTw.g:4681:3: rule__GREATER__Exp2Assignment_4
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
    // InternalTw.g:4689:1: rule__GREATER__Group__5 : rule__GREATER__Group__5__Impl ;
    public final void rule__GREATER__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4693:1: ( rule__GREATER__Group__5__Impl )
            // InternalTw.g:4694:2: rule__GREATER__Group__5__Impl
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
    // InternalTw.g:4700:1: rule__GREATER__Group__5__Impl : ( ')' ) ;
    public final void rule__GREATER__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4704:1: ( ( ')' ) )
            // InternalTw.g:4705:1: ( ')' )
            {
            // InternalTw.g:4705:1: ( ')' )
            // InternalTw.g:4706:2: ')'
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
    // InternalTw.g:4716:1: rule__LESS__Group__0 : rule__LESS__Group__0__Impl rule__LESS__Group__1 ;
    public final void rule__LESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4720:1: ( rule__LESS__Group__0__Impl rule__LESS__Group__1 )
            // InternalTw.g:4721:2: rule__LESS__Group__0__Impl rule__LESS__Group__1
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
    // InternalTw.g:4728:1: rule__LESS__Group__0__Impl : ( 'LESS' ) ;
    public final void rule__LESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4732:1: ( ( 'LESS' ) )
            // InternalTw.g:4733:1: ( 'LESS' )
            {
            // InternalTw.g:4733:1: ( 'LESS' )
            // InternalTw.g:4734:2: 'LESS'
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
    // InternalTw.g:4743:1: rule__LESS__Group__1 : rule__LESS__Group__1__Impl rule__LESS__Group__2 ;
    public final void rule__LESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4747:1: ( rule__LESS__Group__1__Impl rule__LESS__Group__2 )
            // InternalTw.g:4748:2: rule__LESS__Group__1__Impl rule__LESS__Group__2
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
    // InternalTw.g:4755:1: rule__LESS__Group__1__Impl : ( '(' ) ;
    public final void rule__LESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4759:1: ( ( '(' ) )
            // InternalTw.g:4760:1: ( '(' )
            {
            // InternalTw.g:4760:1: ( '(' )
            // InternalTw.g:4761:2: '('
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
    // InternalTw.g:4770:1: rule__LESS__Group__2 : rule__LESS__Group__2__Impl rule__LESS__Group__3 ;
    public final void rule__LESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4774:1: ( rule__LESS__Group__2__Impl rule__LESS__Group__3 )
            // InternalTw.g:4775:2: rule__LESS__Group__2__Impl rule__LESS__Group__3
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
    // InternalTw.g:4782:1: rule__LESS__Group__2__Impl : ( ( rule__LESS__Exp1Assignment_2 ) ) ;
    public final void rule__LESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4786:1: ( ( ( rule__LESS__Exp1Assignment_2 ) ) )
            // InternalTw.g:4787:1: ( ( rule__LESS__Exp1Assignment_2 ) )
            {
            // InternalTw.g:4787:1: ( ( rule__LESS__Exp1Assignment_2 ) )
            // InternalTw.g:4788:2: ( rule__LESS__Exp1Assignment_2 )
            {
             before(grammarAccess.getLESSAccess().getExp1Assignment_2()); 
            // InternalTw.g:4789:2: ( rule__LESS__Exp1Assignment_2 )
            // InternalTw.g:4789:3: rule__LESS__Exp1Assignment_2
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
    // InternalTw.g:4797:1: rule__LESS__Group__3 : rule__LESS__Group__3__Impl rule__LESS__Group__4 ;
    public final void rule__LESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4801:1: ( rule__LESS__Group__3__Impl rule__LESS__Group__4 )
            // InternalTw.g:4802:2: rule__LESS__Group__3__Impl rule__LESS__Group__4
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
    // InternalTw.g:4809:1: rule__LESS__Group__3__Impl : ( ',' ) ;
    public final void rule__LESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4813:1: ( ( ',' ) )
            // InternalTw.g:4814:1: ( ',' )
            {
            // InternalTw.g:4814:1: ( ',' )
            // InternalTw.g:4815:2: ','
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
    // InternalTw.g:4824:1: rule__LESS__Group__4 : rule__LESS__Group__4__Impl rule__LESS__Group__5 ;
    public final void rule__LESS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4828:1: ( rule__LESS__Group__4__Impl rule__LESS__Group__5 )
            // InternalTw.g:4829:2: rule__LESS__Group__4__Impl rule__LESS__Group__5
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
    // InternalTw.g:4836:1: rule__LESS__Group__4__Impl : ( ( rule__LESS__Exp2Assignment_4 ) ) ;
    public final void rule__LESS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4840:1: ( ( ( rule__LESS__Exp2Assignment_4 ) ) )
            // InternalTw.g:4841:1: ( ( rule__LESS__Exp2Assignment_4 ) )
            {
            // InternalTw.g:4841:1: ( ( rule__LESS__Exp2Assignment_4 ) )
            // InternalTw.g:4842:2: ( rule__LESS__Exp2Assignment_4 )
            {
             before(grammarAccess.getLESSAccess().getExp2Assignment_4()); 
            // InternalTw.g:4843:2: ( rule__LESS__Exp2Assignment_4 )
            // InternalTw.g:4843:3: rule__LESS__Exp2Assignment_4
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
    // InternalTw.g:4851:1: rule__LESS__Group__5 : rule__LESS__Group__5__Impl ;
    public final void rule__LESS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4855:1: ( rule__LESS__Group__5__Impl )
            // InternalTw.g:4856:2: rule__LESS__Group__5__Impl
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
    // InternalTw.g:4862:1: rule__LESS__Group__5__Impl : ( ')' ) ;
    public final void rule__LESS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4866:1: ( ( ')' ) )
            // InternalTw.g:4867:1: ( ')' )
            {
            // InternalTw.g:4867:1: ( ')' )
            // InternalTw.g:4868:2: ')'
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
    // InternalTw.g:4878:1: rule__EQUALS__Group__0 : rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 ;
    public final void rule__EQUALS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4882:1: ( rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 )
            // InternalTw.g:4883:2: rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1
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
    // InternalTw.g:4890:1: rule__EQUALS__Group__0__Impl : ( 'EQUALS' ) ;
    public final void rule__EQUALS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4894:1: ( ( 'EQUALS' ) )
            // InternalTw.g:4895:1: ( 'EQUALS' )
            {
            // InternalTw.g:4895:1: ( 'EQUALS' )
            // InternalTw.g:4896:2: 'EQUALS'
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
    // InternalTw.g:4905:1: rule__EQUALS__Group__1 : rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 ;
    public final void rule__EQUALS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4909:1: ( rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 )
            // InternalTw.g:4910:2: rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2
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
    // InternalTw.g:4917:1: rule__EQUALS__Group__1__Impl : ( '(' ) ;
    public final void rule__EQUALS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4921:1: ( ( '(' ) )
            // InternalTw.g:4922:1: ( '(' )
            {
            // InternalTw.g:4922:1: ( '(' )
            // InternalTw.g:4923:2: '('
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
    // InternalTw.g:4932:1: rule__EQUALS__Group__2 : rule__EQUALS__Group__2__Impl rule__EQUALS__Group__3 ;
    public final void rule__EQUALS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4936:1: ( rule__EQUALS__Group__2__Impl rule__EQUALS__Group__3 )
            // InternalTw.g:4937:2: rule__EQUALS__Group__2__Impl rule__EQUALS__Group__3
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
    // InternalTw.g:4944:1: rule__EQUALS__Group__2__Impl : ( ( rule__EQUALS__Exp1Assignment_2 ) ) ;
    public final void rule__EQUALS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4948:1: ( ( ( rule__EQUALS__Exp1Assignment_2 ) ) )
            // InternalTw.g:4949:1: ( ( rule__EQUALS__Exp1Assignment_2 ) )
            {
            // InternalTw.g:4949:1: ( ( rule__EQUALS__Exp1Assignment_2 ) )
            // InternalTw.g:4950:2: ( rule__EQUALS__Exp1Assignment_2 )
            {
             before(grammarAccess.getEQUALSAccess().getExp1Assignment_2()); 
            // InternalTw.g:4951:2: ( rule__EQUALS__Exp1Assignment_2 )
            // InternalTw.g:4951:3: rule__EQUALS__Exp1Assignment_2
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
    // InternalTw.g:4959:1: rule__EQUALS__Group__3 : rule__EQUALS__Group__3__Impl rule__EQUALS__Group__4 ;
    public final void rule__EQUALS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4963:1: ( rule__EQUALS__Group__3__Impl rule__EQUALS__Group__4 )
            // InternalTw.g:4964:2: rule__EQUALS__Group__3__Impl rule__EQUALS__Group__4
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
    // InternalTw.g:4971:1: rule__EQUALS__Group__3__Impl : ( ',' ) ;
    public final void rule__EQUALS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4975:1: ( ( ',' ) )
            // InternalTw.g:4976:1: ( ',' )
            {
            // InternalTw.g:4976:1: ( ',' )
            // InternalTw.g:4977:2: ','
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
    // InternalTw.g:4986:1: rule__EQUALS__Group__4 : rule__EQUALS__Group__4__Impl rule__EQUALS__Group__5 ;
    public final void rule__EQUALS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4990:1: ( rule__EQUALS__Group__4__Impl rule__EQUALS__Group__5 )
            // InternalTw.g:4991:2: rule__EQUALS__Group__4__Impl rule__EQUALS__Group__5
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
    // InternalTw.g:4998:1: rule__EQUALS__Group__4__Impl : ( ( rule__EQUALS__Exp2Assignment_4 ) ) ;
    public final void rule__EQUALS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5002:1: ( ( ( rule__EQUALS__Exp2Assignment_4 ) ) )
            // InternalTw.g:5003:1: ( ( rule__EQUALS__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5003:1: ( ( rule__EQUALS__Exp2Assignment_4 ) )
            // InternalTw.g:5004:2: ( rule__EQUALS__Exp2Assignment_4 )
            {
             before(grammarAccess.getEQUALSAccess().getExp2Assignment_4()); 
            // InternalTw.g:5005:2: ( rule__EQUALS__Exp2Assignment_4 )
            // InternalTw.g:5005:3: rule__EQUALS__Exp2Assignment_4
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
    // InternalTw.g:5013:1: rule__EQUALS__Group__5 : rule__EQUALS__Group__5__Impl ;
    public final void rule__EQUALS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5017:1: ( rule__EQUALS__Group__5__Impl )
            // InternalTw.g:5018:2: rule__EQUALS__Group__5__Impl
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
    // InternalTw.g:5024:1: rule__EQUALS__Group__5__Impl : ( ')' ) ;
    public final void rule__EQUALS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5028:1: ( ( ')' ) )
            // InternalTw.g:5029:1: ( ')' )
            {
            // InternalTw.g:5029:1: ( ')' )
            // InternalTw.g:5030:2: ')'
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
    // InternalTw.g:5040:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5044:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalTw.g:5045:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalTw.g:5052:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5056:1: ( ( 'print' ) )
            // InternalTw.g:5057:1: ( 'print' )
            {
            // InternalTw.g:5057:1: ( 'print' )
            // InternalTw.g:5058:2: 'print'
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
    // InternalTw.g:5067:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5071:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalTw.g:5072:2: rule__Print__Group__1__Impl rule__Print__Group__2
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
    // InternalTw.g:5079:1: rule__Print__Group__1__Impl : ( '(' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5083:1: ( ( '(' ) )
            // InternalTw.g:5084:1: ( '(' )
            {
            // InternalTw.g:5084:1: ( '(' )
            // InternalTw.g:5085:2: '('
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
    // InternalTw.g:5094:1: rule__Print__Group__2 : rule__Print__Group__2__Impl rule__Print__Group__3 ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5098:1: ( rule__Print__Group__2__Impl rule__Print__Group__3 )
            // InternalTw.g:5099:2: rule__Print__Group__2__Impl rule__Print__Group__3
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
    // InternalTw.g:5106:1: rule__Print__Group__2__Impl : ( ( rule__Print__ExpressionAssignment_2 ) ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5110:1: ( ( ( rule__Print__ExpressionAssignment_2 ) ) )
            // InternalTw.g:5111:1: ( ( rule__Print__ExpressionAssignment_2 ) )
            {
            // InternalTw.g:5111:1: ( ( rule__Print__ExpressionAssignment_2 ) )
            // InternalTw.g:5112:2: ( rule__Print__ExpressionAssignment_2 )
            {
             before(grammarAccess.getPrintAccess().getExpressionAssignment_2()); 
            // InternalTw.g:5113:2: ( rule__Print__ExpressionAssignment_2 )
            // InternalTw.g:5113:3: rule__Print__ExpressionAssignment_2
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
    // InternalTw.g:5121:1: rule__Print__Group__3 : rule__Print__Group__3__Impl ;
    public final void rule__Print__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5125:1: ( rule__Print__Group__3__Impl )
            // InternalTw.g:5126:2: rule__Print__Group__3__Impl
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
    // InternalTw.g:5132:1: rule__Print__Group__3__Impl : ( ')' ) ;
    public final void rule__Print__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5136:1: ( ( ')' ) )
            // InternalTw.g:5137:1: ( ')' )
            {
            // InternalTw.g:5137:1: ( ')' )
            // InternalTw.g:5138:2: ')'
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
    // InternalTw.g:5148:1: rule__ADD__Group__0 : rule__ADD__Group__0__Impl rule__ADD__Group__1 ;
    public final void rule__ADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5152:1: ( rule__ADD__Group__0__Impl rule__ADD__Group__1 )
            // InternalTw.g:5153:2: rule__ADD__Group__0__Impl rule__ADD__Group__1
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
    // InternalTw.g:5160:1: rule__ADD__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__ADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5164:1: ( ( 'ADD' ) )
            // InternalTw.g:5165:1: ( 'ADD' )
            {
            // InternalTw.g:5165:1: ( 'ADD' )
            // InternalTw.g:5166:2: 'ADD'
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
    // InternalTw.g:5175:1: rule__ADD__Group__1 : rule__ADD__Group__1__Impl rule__ADD__Group__2 ;
    public final void rule__ADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5179:1: ( rule__ADD__Group__1__Impl rule__ADD__Group__2 )
            // InternalTw.g:5180:2: rule__ADD__Group__1__Impl rule__ADD__Group__2
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
    // InternalTw.g:5187:1: rule__ADD__Group__1__Impl : ( '(' ) ;
    public final void rule__ADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5191:1: ( ( '(' ) )
            // InternalTw.g:5192:1: ( '(' )
            {
            // InternalTw.g:5192:1: ( '(' )
            // InternalTw.g:5193:2: '('
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
    // InternalTw.g:5202:1: rule__ADD__Group__2 : rule__ADD__Group__2__Impl rule__ADD__Group__3 ;
    public final void rule__ADD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5206:1: ( rule__ADD__Group__2__Impl rule__ADD__Group__3 )
            // InternalTw.g:5207:2: rule__ADD__Group__2__Impl rule__ADD__Group__3
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
    // InternalTw.g:5214:1: rule__ADD__Group__2__Impl : ( ( rule__ADD__Exp1Assignment_2 ) ) ;
    public final void rule__ADD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5218:1: ( ( ( rule__ADD__Exp1Assignment_2 ) ) )
            // InternalTw.g:5219:1: ( ( rule__ADD__Exp1Assignment_2 ) )
            {
            // InternalTw.g:5219:1: ( ( rule__ADD__Exp1Assignment_2 ) )
            // InternalTw.g:5220:2: ( rule__ADD__Exp1Assignment_2 )
            {
             before(grammarAccess.getADDAccess().getExp1Assignment_2()); 
            // InternalTw.g:5221:2: ( rule__ADD__Exp1Assignment_2 )
            // InternalTw.g:5221:3: rule__ADD__Exp1Assignment_2
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
    // InternalTw.g:5229:1: rule__ADD__Group__3 : rule__ADD__Group__3__Impl rule__ADD__Group__4 ;
    public final void rule__ADD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5233:1: ( rule__ADD__Group__3__Impl rule__ADD__Group__4 )
            // InternalTw.g:5234:2: rule__ADD__Group__3__Impl rule__ADD__Group__4
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
    // InternalTw.g:5241:1: rule__ADD__Group__3__Impl : ( ',' ) ;
    public final void rule__ADD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5245:1: ( ( ',' ) )
            // InternalTw.g:5246:1: ( ',' )
            {
            // InternalTw.g:5246:1: ( ',' )
            // InternalTw.g:5247:2: ','
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
    // InternalTw.g:5256:1: rule__ADD__Group__4 : rule__ADD__Group__4__Impl rule__ADD__Group__5 ;
    public final void rule__ADD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5260:1: ( rule__ADD__Group__4__Impl rule__ADD__Group__5 )
            // InternalTw.g:5261:2: rule__ADD__Group__4__Impl rule__ADD__Group__5
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
    // InternalTw.g:5268:1: rule__ADD__Group__4__Impl : ( ( rule__ADD__Exp2Assignment_4 ) ) ;
    public final void rule__ADD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5272:1: ( ( ( rule__ADD__Exp2Assignment_4 ) ) )
            // InternalTw.g:5273:1: ( ( rule__ADD__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5273:1: ( ( rule__ADD__Exp2Assignment_4 ) )
            // InternalTw.g:5274:2: ( rule__ADD__Exp2Assignment_4 )
            {
             before(grammarAccess.getADDAccess().getExp2Assignment_4()); 
            // InternalTw.g:5275:2: ( rule__ADD__Exp2Assignment_4 )
            // InternalTw.g:5275:3: rule__ADD__Exp2Assignment_4
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
    // InternalTw.g:5283:1: rule__ADD__Group__5 : rule__ADD__Group__5__Impl ;
    public final void rule__ADD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5287:1: ( rule__ADD__Group__5__Impl )
            // InternalTw.g:5288:2: rule__ADD__Group__5__Impl
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
    // InternalTw.g:5294:1: rule__ADD__Group__5__Impl : ( ')' ) ;
    public final void rule__ADD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5298:1: ( ( ')' ) )
            // InternalTw.g:5299:1: ( ')' )
            {
            // InternalTw.g:5299:1: ( ')' )
            // InternalTw.g:5300:2: ')'
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
    // InternalTw.g:5310:1: rule__MUL__Group__0 : rule__MUL__Group__0__Impl rule__MUL__Group__1 ;
    public final void rule__MUL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5314:1: ( rule__MUL__Group__0__Impl rule__MUL__Group__1 )
            // InternalTw.g:5315:2: rule__MUL__Group__0__Impl rule__MUL__Group__1
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
    // InternalTw.g:5322:1: rule__MUL__Group__0__Impl : ( 'MUL' ) ;
    public final void rule__MUL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5326:1: ( ( 'MUL' ) )
            // InternalTw.g:5327:1: ( 'MUL' )
            {
            // InternalTw.g:5327:1: ( 'MUL' )
            // InternalTw.g:5328:2: 'MUL'
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
    // InternalTw.g:5337:1: rule__MUL__Group__1 : rule__MUL__Group__1__Impl rule__MUL__Group__2 ;
    public final void rule__MUL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5341:1: ( rule__MUL__Group__1__Impl rule__MUL__Group__2 )
            // InternalTw.g:5342:2: rule__MUL__Group__1__Impl rule__MUL__Group__2
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
    // InternalTw.g:5349:1: rule__MUL__Group__1__Impl : ( '(' ) ;
    public final void rule__MUL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5353:1: ( ( '(' ) )
            // InternalTw.g:5354:1: ( '(' )
            {
            // InternalTw.g:5354:1: ( '(' )
            // InternalTw.g:5355:2: '('
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
    // InternalTw.g:5364:1: rule__MUL__Group__2 : rule__MUL__Group__2__Impl rule__MUL__Group__3 ;
    public final void rule__MUL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5368:1: ( rule__MUL__Group__2__Impl rule__MUL__Group__3 )
            // InternalTw.g:5369:2: rule__MUL__Group__2__Impl rule__MUL__Group__3
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
    // InternalTw.g:5376:1: rule__MUL__Group__2__Impl : ( ( rule__MUL__Exp1Assignment_2 ) ) ;
    public final void rule__MUL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5380:1: ( ( ( rule__MUL__Exp1Assignment_2 ) ) )
            // InternalTw.g:5381:1: ( ( rule__MUL__Exp1Assignment_2 ) )
            {
            // InternalTw.g:5381:1: ( ( rule__MUL__Exp1Assignment_2 ) )
            // InternalTw.g:5382:2: ( rule__MUL__Exp1Assignment_2 )
            {
             before(grammarAccess.getMULAccess().getExp1Assignment_2()); 
            // InternalTw.g:5383:2: ( rule__MUL__Exp1Assignment_2 )
            // InternalTw.g:5383:3: rule__MUL__Exp1Assignment_2
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
    // InternalTw.g:5391:1: rule__MUL__Group__3 : rule__MUL__Group__3__Impl rule__MUL__Group__4 ;
    public final void rule__MUL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5395:1: ( rule__MUL__Group__3__Impl rule__MUL__Group__4 )
            // InternalTw.g:5396:2: rule__MUL__Group__3__Impl rule__MUL__Group__4
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
    // InternalTw.g:5403:1: rule__MUL__Group__3__Impl : ( ',' ) ;
    public final void rule__MUL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5407:1: ( ( ',' ) )
            // InternalTw.g:5408:1: ( ',' )
            {
            // InternalTw.g:5408:1: ( ',' )
            // InternalTw.g:5409:2: ','
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
    // InternalTw.g:5418:1: rule__MUL__Group__4 : rule__MUL__Group__4__Impl rule__MUL__Group__5 ;
    public final void rule__MUL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5422:1: ( rule__MUL__Group__4__Impl rule__MUL__Group__5 )
            // InternalTw.g:5423:2: rule__MUL__Group__4__Impl rule__MUL__Group__5
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
    // InternalTw.g:5430:1: rule__MUL__Group__4__Impl : ( ( rule__MUL__Exp2Assignment_4 ) ) ;
    public final void rule__MUL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5434:1: ( ( ( rule__MUL__Exp2Assignment_4 ) ) )
            // InternalTw.g:5435:1: ( ( rule__MUL__Exp2Assignment_4 ) )
            {
            // InternalTw.g:5435:1: ( ( rule__MUL__Exp2Assignment_4 ) )
            // InternalTw.g:5436:2: ( rule__MUL__Exp2Assignment_4 )
            {
             before(grammarAccess.getMULAccess().getExp2Assignment_4()); 
            // InternalTw.g:5437:2: ( rule__MUL__Exp2Assignment_4 )
            // InternalTw.g:5437:3: rule__MUL__Exp2Assignment_4
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
    // InternalTw.g:5445:1: rule__MUL__Group__5 : rule__MUL__Group__5__Impl ;
    public final void rule__MUL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5449:1: ( rule__MUL__Group__5__Impl )
            // InternalTw.g:5450:2: rule__MUL__Group__5__Impl
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
    // InternalTw.g:5456:1: rule__MUL__Group__5__Impl : ( ')' ) ;
    public final void rule__MUL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5460:1: ( ( ')' ) )
            // InternalTw.g:5461:1: ( ')' )
            {
            // InternalTw.g:5461:1: ( ')' )
            // InternalTw.g:5462:2: ')'
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
    // InternalTw.g:5472:1: rule__Program__StatementAssignment_3_0 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5476:1: ( ( ruleStatement ) )
            // InternalTw.g:5477:2: ( ruleStatement )
            {
            // InternalTw.g:5477:2: ( ruleStatement )
            // InternalTw.g:5478:3: ruleStatement
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
    // InternalTw.g:5487:1: rule__Program__StatementAssignment_3_1_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5491:1: ( ( ruleStatement ) )
            // InternalTw.g:5492:2: ( ruleStatement )
            {
            // InternalTw.g:5492:2: ( ruleStatement )
            // InternalTw.g:5493:3: ruleStatement
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
    // InternalTw.g:5502:1: rule__Block__StatementAssignment_2_0 : ( ruleStatement ) ;
    public final void rule__Block__StatementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5506:1: ( ( ruleStatement ) )
            // InternalTw.g:5507:2: ( ruleStatement )
            {
            // InternalTw.g:5507:2: ( ruleStatement )
            // InternalTw.g:5508:3: ruleStatement
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
    // InternalTw.g:5517:1: rule__Block__StatementAssignment_2_1_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5521:1: ( ( ruleStatement ) )
            // InternalTw.g:5522:2: ( ruleStatement )
            {
            // InternalTw.g:5522:2: ( ruleStatement )
            // InternalTw.g:5523:3: ruleStatement
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
    // InternalTw.g:5532:1: rule__If__ConditionAssignment_2 : ( ruleOpBool ) ;
    public final void rule__If__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5536:1: ( ( ruleOpBool ) )
            // InternalTw.g:5537:2: ( ruleOpBool )
            {
            // InternalTw.g:5537:2: ( ruleOpBool )
            // InternalTw.g:5538:3: ruleOpBool
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
    // InternalTw.g:5547:1: rule__If__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5551:1: ( ( ruleBlock ) )
            // InternalTw.g:5552:2: ( ruleBlock )
            {
            // InternalTw.g:5552:2: ( ruleBlock )
            // InternalTw.g:5553:3: ruleBlock
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
    // InternalTw.g:5562:1: rule__If__ElseBlockAssignment_5_1 : ( ruleBlock ) ;
    public final void rule__If__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5566:1: ( ( ruleBlock ) )
            // InternalTw.g:5567:2: ( ruleBlock )
            {
            // InternalTw.g:5567:2: ( ruleBlock )
            // InternalTw.g:5568:3: ruleBlock
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
    // InternalTw.g:5577:1: rule__DeclarationVar__NameAssignment_0 : ( ruleString0 ) ;
    public final void rule__DeclarationVar__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5581:1: ( ( ruleString0 ) )
            // InternalTw.g:5582:2: ( ruleString0 )
            {
            // InternalTw.g:5582:2: ( ruleString0 )
            // InternalTw.g:5583:3: ruleString0
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
    // InternalTw.g:5592:1: rule__DeclarationVar__OpDroiteAssignment_2 : ( ruleExpression ) ;
    public final void rule__DeclarationVar__OpDroiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5596:1: ( ( ruleExpression ) )
            // InternalTw.g:5597:2: ( ruleExpression )
            {
            // InternalTw.g:5597:2: ( ruleExpression )
            // InternalTw.g:5598:3: ruleExpression
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
    // InternalTw.g:5607:1: rule__AND__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__AND__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5611:1: ( ( ruleExpression ) )
            // InternalTw.g:5612:2: ( ruleExpression )
            {
            // InternalTw.g:5612:2: ( ruleExpression )
            // InternalTw.g:5613:3: ruleExpression
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
    // InternalTw.g:5622:1: rule__AND__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__AND__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5626:1: ( ( ruleExpression ) )
            // InternalTw.g:5627:2: ( ruleExpression )
            {
            // InternalTw.g:5627:2: ( ruleExpression )
            // InternalTw.g:5628:3: ruleExpression
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
    // InternalTw.g:5637:1: rule__OR__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__OR__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5641:1: ( ( ruleExpression ) )
            // InternalTw.g:5642:2: ( ruleExpression )
            {
            // InternalTw.g:5642:2: ( ruleExpression )
            // InternalTw.g:5643:3: ruleExpression
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
    // InternalTw.g:5652:1: rule__OR__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__OR__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5656:1: ( ( ruleExpression ) )
            // InternalTw.g:5657:2: ( ruleExpression )
            {
            // InternalTw.g:5657:2: ( ruleExpression )
            // InternalTw.g:5658:3: ruleExpression
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


    // $ANTLR start "rule__Tweets_user__ArgsAssignment_2_0"
    // InternalTw.g:5667:1: rule__Tweets_user__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_user__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5671:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5672:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5672:2: ( ruleUtilisationVar )
            // InternalTw.g:5673:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_userAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_userAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Tweets_user__ArgsAssignment_2_0"


    // $ANTLR start "rule__Tweets_user__ArgsAssignment_2_1_1"
    // InternalTw.g:5682:1: rule__Tweets_user__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_user__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5686:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5687:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5687:2: ( ruleUtilisationVar )
            // InternalTw.g:5688:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_userAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_userAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Tweets_user__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__Tweets_location__ArgsAssignment_2_0"
    // InternalTw.g:5697:1: rule__Tweets_location__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_location__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5701:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5702:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5702:2: ( ruleUtilisationVar )
            // InternalTw.g:5703:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_locationAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_locationAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Tweets_location__ArgsAssignment_2_0"


    // $ANTLR start "rule__Tweets_location__ArgsAssignment_2_1_1"
    // InternalTw.g:5712:1: rule__Tweets_location__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_location__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5716:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5717:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5717:2: ( ruleUtilisationVar )
            // InternalTw.g:5718:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_locationAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_locationAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Tweets_location__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__Tweets_entity__ArgsAssignment_2_0"
    // InternalTw.g:5727:1: rule__Tweets_entity__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_entity__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5731:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5732:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5732:2: ( ruleUtilisationVar )
            // InternalTw.g:5733:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_entityAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_entityAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Tweets_entity__ArgsAssignment_2_0"


    // $ANTLR start "rule__Tweets_entity__ArgsAssignment_2_1_1"
    // InternalTw.g:5742:1: rule__Tweets_entity__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_entity__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5746:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5747:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5747:2: ( ruleUtilisationVar )
            // InternalTw.g:5748:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_entityAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_entityAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Tweets_entity__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__Tweets_date__ArgsAssignment_2_0"
    // InternalTw.g:5757:1: rule__Tweets_date__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_date__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5761:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5762:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5762:2: ( ruleUtilisationVar )
            // InternalTw.g:5763:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_dateAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_dateAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Tweets_date__ArgsAssignment_2_0"


    // $ANTLR start "rule__Tweets_date__ArgsAssignment_2_1_1"
    // InternalTw.g:5772:1: rule__Tweets_date__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__Tweets_date__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5776:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5777:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5777:2: ( ruleUtilisationVar )
            // InternalTw.g:5778:3: ruleUtilisationVar
            {
             before(grammarAccess.getTweets_dateAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getTweets_dateAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Tweets_date__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__ProportionPositif__ArgsAssignment_2_0"
    // InternalTw.g:5787:1: rule__ProportionPositif__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__ProportionPositif__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5791:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5792:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5792:2: ( ruleUtilisationVar )
            // InternalTw.g:5793:3: ruleUtilisationVar
            {
             before(grammarAccess.getProportionPositifAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getProportionPositifAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ProportionPositif__ArgsAssignment_2_0"


    // $ANTLR start "rule__ProportionPositif__ArgsAssignment_2_1_1"
    // InternalTw.g:5802:1: rule__ProportionPositif__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__ProportionPositif__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5806:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5807:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5807:2: ( ruleUtilisationVar )
            // InternalTw.g:5808:3: ruleUtilisationVar
            {
             before(grammarAccess.getProportionPositifAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getProportionPositifAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__ProportionPositif__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__ProportionNegatif__ArgsAssignment_2_0"
    // InternalTw.g:5817:1: rule__ProportionNegatif__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__ProportionNegatif__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5821:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5822:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5822:2: ( ruleUtilisationVar )
            // InternalTw.g:5823:3: ruleUtilisationVar
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getProportionNegatifAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ProportionNegatif__ArgsAssignment_2_0"


    // $ANTLR start "rule__ProportionNegatif__ArgsAssignment_2_1_1"
    // InternalTw.g:5832:1: rule__ProportionNegatif__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__ProportionNegatif__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5836:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5837:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5837:2: ( ruleUtilisationVar )
            // InternalTw.g:5838:3: ruleUtilisationVar
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getProportionNegatifAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__ProportionNegatif__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__CountTweet__ArgsAssignment_2_0"
    // InternalTw.g:5847:1: rule__CountTweet__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__CountTweet__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5851:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5852:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5852:2: ( ruleUtilisationVar )
            // InternalTw.g:5853:3: ruleUtilisationVar
            {
             before(grammarAccess.getCountTweetAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getCountTweetAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__CountTweet__ArgsAssignment_2_0"


    // $ANTLR start "rule__CountTweet__ArgsAssignment_2_1_1"
    // InternalTw.g:5862:1: rule__CountTweet__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__CountTweet__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5866:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5867:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5867:2: ( ruleUtilisationVar )
            // InternalTw.g:5868:3: ruleUtilisationVar
            {
             before(grammarAccess.getCountTweetAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getCountTweetAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__CountTweet__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__CountVisitProfil__ArgsAssignment_2_0"
    // InternalTw.g:5877:1: rule__CountVisitProfil__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__CountVisitProfil__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5881:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5882:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5882:2: ( ruleUtilisationVar )
            // InternalTw.g:5883:3: ruleUtilisationVar
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__CountVisitProfil__ArgsAssignment_2_0"


    // $ANTLR start "rule__CountVisitProfil__ArgsAssignment_2_1_1"
    // InternalTw.g:5892:1: rule__CountVisitProfil__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__CountVisitProfil__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5896:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5897:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5897:2: ( ruleUtilisationVar )
            // InternalTw.g:5898:3: ruleUtilisationVar
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__CountVisitProfil__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__CroissanceAbonne__ArgsAssignment_2_0"
    // InternalTw.g:5907:1: rule__CroissanceAbonne__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__CroissanceAbonne__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5911:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5912:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5912:2: ( ruleUtilisationVar )
            // InternalTw.g:5913:3: ruleUtilisationVar
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__CroissanceAbonne__ArgsAssignment_2_0"


    // $ANTLR start "rule__CroissanceAbonne__ArgsAssignment_2_1_1"
    // InternalTw.g:5922:1: rule__CroissanceAbonne__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__CroissanceAbonne__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5926:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5927:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5927:2: ( ruleUtilisationVar )
            // InternalTw.g:5928:3: ruleUtilisationVar
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__CroissanceAbonne__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__MoyFollowers__ArgsAssignment_2_0"
    // InternalTw.g:5937:1: rule__MoyFollowers__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__MoyFollowers__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5941:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5942:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5942:2: ( ruleUtilisationVar )
            // InternalTw.g:5943:3: ruleUtilisationVar
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getMoyFollowersAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__MoyFollowers__ArgsAssignment_2_0"


    // $ANTLR start "rule__MoyFollowers__ArgsAssignment_2_1_1"
    // InternalTw.g:5952:1: rule__MoyFollowers__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__MoyFollowers__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5956:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5957:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5957:2: ( ruleUtilisationVar )
            // InternalTw.g:5958:3: ruleUtilisationVar
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getMoyFollowersAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__MoyFollowers__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__MoyFavorited__ArgsAssignment_2_0"
    // InternalTw.g:5967:1: rule__MoyFavorited__ArgsAssignment_2_0 : ( ruleUtilisationVar ) ;
    public final void rule__MoyFavorited__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5971:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5972:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5972:2: ( ruleUtilisationVar )
            // InternalTw.g:5973:3: ruleUtilisationVar
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedAccess().getArgsUtilisationVarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__MoyFavorited__ArgsAssignment_2_0"


    // $ANTLR start "rule__MoyFavorited__ArgsAssignment_2_1_1"
    // InternalTw.g:5982:1: rule__MoyFavorited__ArgsAssignment_2_1_1 : ( ruleUtilisationVar ) ;
    public final void rule__MoyFavorited__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5986:1: ( ( ruleUtilisationVar ) )
            // InternalTw.g:5987:2: ( ruleUtilisationVar )
            {
            // InternalTw.g:5987:2: ( ruleUtilisationVar )
            // InternalTw.g:5988:3: ruleUtilisationVar
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUtilisationVar();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedAccess().getArgsUtilisationVarParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__MoyFavorited__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__GREATER__Exp1Assignment_2"
    // InternalTw.g:5997:1: rule__GREATER__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__GREATER__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6001:1: ( ( ruleExpression ) )
            // InternalTw.g:6002:2: ( ruleExpression )
            {
            // InternalTw.g:6002:2: ( ruleExpression )
            // InternalTw.g:6003:3: ruleExpression
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
    // InternalTw.g:6012:1: rule__GREATER__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__GREATER__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6016:1: ( ( ruleExpression ) )
            // InternalTw.g:6017:2: ( ruleExpression )
            {
            // InternalTw.g:6017:2: ( ruleExpression )
            // InternalTw.g:6018:3: ruleExpression
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
    // InternalTw.g:6027:1: rule__LESS__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__LESS__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6031:1: ( ( ruleExpression ) )
            // InternalTw.g:6032:2: ( ruleExpression )
            {
            // InternalTw.g:6032:2: ( ruleExpression )
            // InternalTw.g:6033:3: ruleExpression
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
    // InternalTw.g:6042:1: rule__LESS__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__LESS__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6046:1: ( ( ruleExpression ) )
            // InternalTw.g:6047:2: ( ruleExpression )
            {
            // InternalTw.g:6047:2: ( ruleExpression )
            // InternalTw.g:6048:3: ruleExpression
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
    // InternalTw.g:6057:1: rule__EQUALS__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__EQUALS__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6061:1: ( ( ruleExpression ) )
            // InternalTw.g:6062:2: ( ruleExpression )
            {
            // InternalTw.g:6062:2: ( ruleExpression )
            // InternalTw.g:6063:3: ruleExpression
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
    // InternalTw.g:6072:1: rule__EQUALS__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__EQUALS__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6076:1: ( ( ruleExpression ) )
            // InternalTw.g:6077:2: ( ruleExpression )
            {
            // InternalTw.g:6077:2: ( ruleExpression )
            // InternalTw.g:6078:3: ruleExpression
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
    // InternalTw.g:6087:1: rule__UtilisationVar__NameVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UtilisationVar__NameVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6091:1: ( ( ( RULE_ID ) ) )
            // InternalTw.g:6092:2: ( ( RULE_ID ) )
            {
            // InternalTw.g:6092:2: ( ( RULE_ID ) )
            // InternalTw.g:6093:3: ( RULE_ID )
            {
             before(grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarCrossReference_0()); 
            // InternalTw.g:6094:3: ( RULE_ID )
            // InternalTw.g:6095:4: RULE_ID
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
    // InternalTw.g:6106:1: rule__Print__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Print__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6110:1: ( ( ruleExpression ) )
            // InternalTw.g:6111:2: ( ruleExpression )
            {
            // InternalTw.g:6111:2: ( ruleExpression )
            // InternalTw.g:6112:3: ruleExpression
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
    // InternalTw.g:6121:1: rule__StringTw__StringTwAssignment : ( RULE_STRING ) ;
    public final void rule__StringTw__StringTwAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6125:1: ( ( RULE_STRING ) )
            // InternalTw.g:6126:2: ( RULE_STRING )
            {
            // InternalTw.g:6126:2: ( RULE_STRING )
            // InternalTw.g:6127:3: RULE_STRING
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
    // InternalTw.g:6136:1: rule__ADD__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__ADD__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6140:1: ( ( ruleExpression ) )
            // InternalTw.g:6141:2: ( ruleExpression )
            {
            // InternalTw.g:6141:2: ( ruleExpression )
            // InternalTw.g:6142:3: ruleExpression
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
    // InternalTw.g:6151:1: rule__ADD__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__ADD__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6155:1: ( ( ruleExpression ) )
            // InternalTw.g:6156:2: ( ruleExpression )
            {
            // InternalTw.g:6156:2: ( ruleExpression )
            // InternalTw.g:6157:3: ruleExpression
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
    // InternalTw.g:6166:1: rule__MUL__Exp1Assignment_2 : ( ruleExpression ) ;
    public final void rule__MUL__Exp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6170:1: ( ( ruleExpression ) )
            // InternalTw.g:6171:2: ( ruleExpression )
            {
            // InternalTw.g:6171:2: ( ruleExpression )
            // InternalTw.g:6172:3: ruleExpression
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
    // InternalTw.g:6181:1: rule__MUL__Exp2Assignment_4 : ( ruleExpression ) ;
    public final void rule__MUL__Exp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6185:1: ( ( ruleExpression ) )
            // InternalTw.g:6186:2: ( ruleExpression )
            {
            // InternalTw.g:6186:2: ( ruleExpression )
            // InternalTw.g:6187:3: ruleExpression
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
            return "777:1: rule__Statement__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleDeclarationVar ) | ( ruleAND ) | ( ruleOR ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGREATER ) | ( ruleLESS ) | ( ruleEQUALS ) | ( ruleUtilisationVar ) | ( ruleprint ) | ( ruleStringTw ) | ( ruleADD ) | ( ruleMUL ) );";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});

}