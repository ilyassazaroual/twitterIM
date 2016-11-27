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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'}'", "'statement'", "','", "'Block'", "'If'", "'ifBlock'", "'condition'", "'elseBlock'", "'Const'", "'Affectation'", "'variable'", "'opDroite'", "'And'", "'expressionG'", "'expressionD'", "'Or'", "'Xor'", "'tweets_user'", "'args'", "'tweets_location'", "'tweets_entity'", "'tweets_date'", "'ProportionPositif'", "'ProportionNegatif'", "'countTweet'", "'countVisitProfil'", "'CroissanceAbonne'", "'moyFollowers'", "'moyFavorited'", "'Greater'", "'Less'", "'Equal'", "'SupEgal'", "'Args'", "'arg'", "'Variable'", "'nameVariable'"
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


    // $ANTLR start "entryRuleConst"
    // InternalTw.g:203:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalTw.g:204:1: ( ruleConst EOF )
            // InternalTw.g:205:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
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
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalTw.g:212:1: ruleConst : ( ( rule__Const__Group__0 ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:216:2: ( ( ( rule__Const__Group__0 ) ) )
            // InternalTw.g:217:2: ( ( rule__Const__Group__0 ) )
            {
            // InternalTw.g:217:2: ( ( rule__Const__Group__0 ) )
            // InternalTw.g:218:3: ( rule__Const__Group__0 )
            {
             before(grammarAccess.getConstAccess().getGroup()); 
            // InternalTw.g:219:3: ( rule__Const__Group__0 )
            // InternalTw.g:219:4: rule__Const__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Const__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleAffectation"
    // InternalTw.g:228:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // InternalTw.g:229:1: ( ruleAffectation EOF )
            // InternalTw.g:230:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalTw.g:237:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:241:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // InternalTw.g:242:2: ( ( rule__Affectation__Group__0 ) )
            {
            // InternalTw.g:242:2: ( ( rule__Affectation__Group__0 ) )
            // InternalTw.g:243:3: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // InternalTw.g:244:3: ( rule__Affectation__Group__0 )
            // InternalTw.g:244:4: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleAnd"
    // InternalTw.g:253:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalTw.g:254:1: ( ruleAnd EOF )
            // InternalTw.g:255:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTw.g:262:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:266:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalTw.g:267:2: ( ( rule__And__Group__0 ) )
            {
            // InternalTw.g:267:2: ( ( rule__And__Group__0 ) )
            // InternalTw.g:268:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalTw.g:269:3: ( rule__And__Group__0 )
            // InternalTw.g:269:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalTw.g:278:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalTw.g:279:1: ( ruleOr EOF )
            // InternalTw.g:280:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTw.g:287:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:291:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalTw.g:292:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalTw.g:292:2: ( ( rule__Or__Group__0 ) )
            // InternalTw.g:293:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalTw.g:294:3: ( rule__Or__Group__0 )
            // InternalTw.g:294:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleXor"
    // InternalTw.g:303:1: entryRuleXor : ruleXor EOF ;
    public final void entryRuleXor() throws RecognitionException {
        try {
            // InternalTw.g:304:1: ( ruleXor EOF )
            // InternalTw.g:305:1: ruleXor EOF
            {
             before(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_1);
            ruleXor();

            state._fsp--;

             after(grammarAccess.getXorRule()); 
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
    // $ANTLR end "entryRuleXor"


    // $ANTLR start "ruleXor"
    // InternalTw.g:312:1: ruleXor : ( ( rule__Xor__Group__0 ) ) ;
    public final void ruleXor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:316:2: ( ( ( rule__Xor__Group__0 ) ) )
            // InternalTw.g:317:2: ( ( rule__Xor__Group__0 ) )
            {
            // InternalTw.g:317:2: ( ( rule__Xor__Group__0 ) )
            // InternalTw.g:318:3: ( rule__Xor__Group__0 )
            {
             before(grammarAccess.getXorAccess().getGroup()); 
            // InternalTw.g:319:3: ( rule__Xor__Group__0 )
            // InternalTw.g:319:4: rule__Xor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXor"


    // $ANTLR start "entryRuletweets_user"
    // InternalTw.g:328:1: entryRuletweets_user : ruletweets_user EOF ;
    public final void entryRuletweets_user() throws RecognitionException {
        try {
            // InternalTw.g:329:1: ( ruletweets_user EOF )
            // InternalTw.g:330:1: ruletweets_user EOF
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
    // InternalTw.g:337:1: ruletweets_user : ( ( rule__Tweets_user__Group__0 ) ) ;
    public final void ruletweets_user() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:341:2: ( ( ( rule__Tweets_user__Group__0 ) ) )
            // InternalTw.g:342:2: ( ( rule__Tweets_user__Group__0 ) )
            {
            // InternalTw.g:342:2: ( ( rule__Tweets_user__Group__0 ) )
            // InternalTw.g:343:3: ( rule__Tweets_user__Group__0 )
            {
             before(grammarAccess.getTweets_userAccess().getGroup()); 
            // InternalTw.g:344:3: ( rule__Tweets_user__Group__0 )
            // InternalTw.g:344:4: rule__Tweets_user__Group__0
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
    // InternalTw.g:353:1: entryRuletweets_location : ruletweets_location EOF ;
    public final void entryRuletweets_location() throws RecognitionException {
        try {
            // InternalTw.g:354:1: ( ruletweets_location EOF )
            // InternalTw.g:355:1: ruletweets_location EOF
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
    // InternalTw.g:362:1: ruletweets_location : ( ( rule__Tweets_location__Group__0 ) ) ;
    public final void ruletweets_location() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:366:2: ( ( ( rule__Tweets_location__Group__0 ) ) )
            // InternalTw.g:367:2: ( ( rule__Tweets_location__Group__0 ) )
            {
            // InternalTw.g:367:2: ( ( rule__Tweets_location__Group__0 ) )
            // InternalTw.g:368:3: ( rule__Tweets_location__Group__0 )
            {
             before(grammarAccess.getTweets_locationAccess().getGroup()); 
            // InternalTw.g:369:3: ( rule__Tweets_location__Group__0 )
            // InternalTw.g:369:4: rule__Tweets_location__Group__0
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
    // InternalTw.g:378:1: entryRuletweets_entity : ruletweets_entity EOF ;
    public final void entryRuletweets_entity() throws RecognitionException {
        try {
            // InternalTw.g:379:1: ( ruletweets_entity EOF )
            // InternalTw.g:380:1: ruletweets_entity EOF
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
    // InternalTw.g:387:1: ruletweets_entity : ( ( rule__Tweets_entity__Group__0 ) ) ;
    public final void ruletweets_entity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:391:2: ( ( ( rule__Tweets_entity__Group__0 ) ) )
            // InternalTw.g:392:2: ( ( rule__Tweets_entity__Group__0 ) )
            {
            // InternalTw.g:392:2: ( ( rule__Tweets_entity__Group__0 ) )
            // InternalTw.g:393:3: ( rule__Tweets_entity__Group__0 )
            {
             before(grammarAccess.getTweets_entityAccess().getGroup()); 
            // InternalTw.g:394:3: ( rule__Tweets_entity__Group__0 )
            // InternalTw.g:394:4: rule__Tweets_entity__Group__0
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
    // InternalTw.g:403:1: entryRuletweets_date : ruletweets_date EOF ;
    public final void entryRuletweets_date() throws RecognitionException {
        try {
            // InternalTw.g:404:1: ( ruletweets_date EOF )
            // InternalTw.g:405:1: ruletweets_date EOF
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
    // InternalTw.g:412:1: ruletweets_date : ( ( rule__Tweets_date__Group__0 ) ) ;
    public final void ruletweets_date() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:416:2: ( ( ( rule__Tweets_date__Group__0 ) ) )
            // InternalTw.g:417:2: ( ( rule__Tweets_date__Group__0 ) )
            {
            // InternalTw.g:417:2: ( ( rule__Tweets_date__Group__0 ) )
            // InternalTw.g:418:3: ( rule__Tweets_date__Group__0 )
            {
             before(grammarAccess.getTweets_dateAccess().getGroup()); 
            // InternalTw.g:419:3: ( rule__Tweets_date__Group__0 )
            // InternalTw.g:419:4: rule__Tweets_date__Group__0
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
    // InternalTw.g:428:1: entryRuleProportionPositif : ruleProportionPositif EOF ;
    public final void entryRuleProportionPositif() throws RecognitionException {
        try {
            // InternalTw.g:429:1: ( ruleProportionPositif EOF )
            // InternalTw.g:430:1: ruleProportionPositif EOF
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
    // InternalTw.g:437:1: ruleProportionPositif : ( ( rule__ProportionPositif__Group__0 ) ) ;
    public final void ruleProportionPositif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:441:2: ( ( ( rule__ProportionPositif__Group__0 ) ) )
            // InternalTw.g:442:2: ( ( rule__ProportionPositif__Group__0 ) )
            {
            // InternalTw.g:442:2: ( ( rule__ProportionPositif__Group__0 ) )
            // InternalTw.g:443:3: ( rule__ProportionPositif__Group__0 )
            {
             before(grammarAccess.getProportionPositifAccess().getGroup()); 
            // InternalTw.g:444:3: ( rule__ProportionPositif__Group__0 )
            // InternalTw.g:444:4: rule__ProportionPositif__Group__0
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
    // InternalTw.g:453:1: entryRuleProportionNegatif : ruleProportionNegatif EOF ;
    public final void entryRuleProportionNegatif() throws RecognitionException {
        try {
            // InternalTw.g:454:1: ( ruleProportionNegatif EOF )
            // InternalTw.g:455:1: ruleProportionNegatif EOF
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
    // InternalTw.g:462:1: ruleProportionNegatif : ( ( rule__ProportionNegatif__Group__0 ) ) ;
    public final void ruleProportionNegatif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:466:2: ( ( ( rule__ProportionNegatif__Group__0 ) ) )
            // InternalTw.g:467:2: ( ( rule__ProportionNegatif__Group__0 ) )
            {
            // InternalTw.g:467:2: ( ( rule__ProportionNegatif__Group__0 ) )
            // InternalTw.g:468:3: ( rule__ProportionNegatif__Group__0 )
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup()); 
            // InternalTw.g:469:3: ( rule__ProportionNegatif__Group__0 )
            // InternalTw.g:469:4: rule__ProportionNegatif__Group__0
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
    // InternalTw.g:478:1: entryRulecountTweet : rulecountTweet EOF ;
    public final void entryRulecountTweet() throws RecognitionException {
        try {
            // InternalTw.g:479:1: ( rulecountTweet EOF )
            // InternalTw.g:480:1: rulecountTweet EOF
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
    // InternalTw.g:487:1: rulecountTweet : ( ( rule__CountTweet__Group__0 ) ) ;
    public final void rulecountTweet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:491:2: ( ( ( rule__CountTweet__Group__0 ) ) )
            // InternalTw.g:492:2: ( ( rule__CountTweet__Group__0 ) )
            {
            // InternalTw.g:492:2: ( ( rule__CountTweet__Group__0 ) )
            // InternalTw.g:493:3: ( rule__CountTweet__Group__0 )
            {
             before(grammarAccess.getCountTweetAccess().getGroup()); 
            // InternalTw.g:494:3: ( rule__CountTweet__Group__0 )
            // InternalTw.g:494:4: rule__CountTweet__Group__0
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
    // InternalTw.g:503:1: entryRulecountVisitProfil : rulecountVisitProfil EOF ;
    public final void entryRulecountVisitProfil() throws RecognitionException {
        try {
            // InternalTw.g:504:1: ( rulecountVisitProfil EOF )
            // InternalTw.g:505:1: rulecountVisitProfil EOF
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
    // InternalTw.g:512:1: rulecountVisitProfil : ( ( rule__CountVisitProfil__Group__0 ) ) ;
    public final void rulecountVisitProfil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:516:2: ( ( ( rule__CountVisitProfil__Group__0 ) ) )
            // InternalTw.g:517:2: ( ( rule__CountVisitProfil__Group__0 ) )
            {
            // InternalTw.g:517:2: ( ( rule__CountVisitProfil__Group__0 ) )
            // InternalTw.g:518:3: ( rule__CountVisitProfil__Group__0 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup()); 
            // InternalTw.g:519:3: ( rule__CountVisitProfil__Group__0 )
            // InternalTw.g:519:4: rule__CountVisitProfil__Group__0
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
    // InternalTw.g:528:1: entryRuleCroissanceAbonne : ruleCroissanceAbonne EOF ;
    public final void entryRuleCroissanceAbonne() throws RecognitionException {
        try {
            // InternalTw.g:529:1: ( ruleCroissanceAbonne EOF )
            // InternalTw.g:530:1: ruleCroissanceAbonne EOF
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
    // InternalTw.g:537:1: ruleCroissanceAbonne : ( ( rule__CroissanceAbonne__Group__0 ) ) ;
    public final void ruleCroissanceAbonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:541:2: ( ( ( rule__CroissanceAbonne__Group__0 ) ) )
            // InternalTw.g:542:2: ( ( rule__CroissanceAbonne__Group__0 ) )
            {
            // InternalTw.g:542:2: ( ( rule__CroissanceAbonne__Group__0 ) )
            // InternalTw.g:543:3: ( rule__CroissanceAbonne__Group__0 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup()); 
            // InternalTw.g:544:3: ( rule__CroissanceAbonne__Group__0 )
            // InternalTw.g:544:4: rule__CroissanceAbonne__Group__0
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
    // InternalTw.g:553:1: entryRulemoyFollowers : rulemoyFollowers EOF ;
    public final void entryRulemoyFollowers() throws RecognitionException {
        try {
            // InternalTw.g:554:1: ( rulemoyFollowers EOF )
            // InternalTw.g:555:1: rulemoyFollowers EOF
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
    // InternalTw.g:562:1: rulemoyFollowers : ( ( rule__MoyFollowers__Group__0 ) ) ;
    public final void rulemoyFollowers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:566:2: ( ( ( rule__MoyFollowers__Group__0 ) ) )
            // InternalTw.g:567:2: ( ( rule__MoyFollowers__Group__0 ) )
            {
            // InternalTw.g:567:2: ( ( rule__MoyFollowers__Group__0 ) )
            // InternalTw.g:568:3: ( rule__MoyFollowers__Group__0 )
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup()); 
            // InternalTw.g:569:3: ( rule__MoyFollowers__Group__0 )
            // InternalTw.g:569:4: rule__MoyFollowers__Group__0
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
    // InternalTw.g:578:1: entryRulemoyFavorited : rulemoyFavorited EOF ;
    public final void entryRulemoyFavorited() throws RecognitionException {
        try {
            // InternalTw.g:579:1: ( rulemoyFavorited EOF )
            // InternalTw.g:580:1: rulemoyFavorited EOF
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
    // InternalTw.g:587:1: rulemoyFavorited : ( ( rule__MoyFavorited__Group__0 ) ) ;
    public final void rulemoyFavorited() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:591:2: ( ( ( rule__MoyFavorited__Group__0 ) ) )
            // InternalTw.g:592:2: ( ( rule__MoyFavorited__Group__0 ) )
            {
            // InternalTw.g:592:2: ( ( rule__MoyFavorited__Group__0 ) )
            // InternalTw.g:593:3: ( rule__MoyFavorited__Group__0 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup()); 
            // InternalTw.g:594:3: ( rule__MoyFavorited__Group__0 )
            // InternalTw.g:594:4: rule__MoyFavorited__Group__0
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


    // $ANTLR start "entryRuleGreater"
    // InternalTw.g:603:1: entryRuleGreater : ruleGreater EOF ;
    public final void entryRuleGreater() throws RecognitionException {
        try {
            // InternalTw.g:604:1: ( ruleGreater EOF )
            // InternalTw.g:605:1: ruleGreater EOF
            {
             before(grammarAccess.getGreaterRule()); 
            pushFollow(FOLLOW_1);
            ruleGreater();

            state._fsp--;

             after(grammarAccess.getGreaterRule()); 
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
    // $ANTLR end "entryRuleGreater"


    // $ANTLR start "ruleGreater"
    // InternalTw.g:612:1: ruleGreater : ( ( rule__Greater__Group__0 ) ) ;
    public final void ruleGreater() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:616:2: ( ( ( rule__Greater__Group__0 ) ) )
            // InternalTw.g:617:2: ( ( rule__Greater__Group__0 ) )
            {
            // InternalTw.g:617:2: ( ( rule__Greater__Group__0 ) )
            // InternalTw.g:618:3: ( rule__Greater__Group__0 )
            {
             before(grammarAccess.getGreaterAccess().getGroup()); 
            // InternalTw.g:619:3: ( rule__Greater__Group__0 )
            // InternalTw.g:619:4: rule__Greater__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greater__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreaterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreater"


    // $ANTLR start "entryRuleLess"
    // InternalTw.g:628:1: entryRuleLess : ruleLess EOF ;
    public final void entryRuleLess() throws RecognitionException {
        try {
            // InternalTw.g:629:1: ( ruleLess EOF )
            // InternalTw.g:630:1: ruleLess EOF
            {
             before(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            ruleLess();

            state._fsp--;

             after(grammarAccess.getLessRule()); 
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
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalTw.g:637:1: ruleLess : ( ( rule__Less__Group__0 ) ) ;
    public final void ruleLess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:641:2: ( ( ( rule__Less__Group__0 ) ) )
            // InternalTw.g:642:2: ( ( rule__Less__Group__0 ) )
            {
            // InternalTw.g:642:2: ( ( rule__Less__Group__0 ) )
            // InternalTw.g:643:3: ( rule__Less__Group__0 )
            {
             before(grammarAccess.getLessAccess().getGroup()); 
            // InternalTw.g:644:3: ( rule__Less__Group__0 )
            // InternalTw.g:644:4: rule__Less__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Less__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleEqual"
    // InternalTw.g:653:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalTw.g:654:1: ( ruleEqual EOF )
            // InternalTw.g:655:1: ruleEqual EOF
            {
             before(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getEqualRule()); 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalTw.g:662:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:666:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalTw.g:667:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalTw.g:667:2: ( ( rule__Equal__Group__0 ) )
            // InternalTw.g:668:3: ( rule__Equal__Group__0 )
            {
             before(grammarAccess.getEqualAccess().getGroup()); 
            // InternalTw.g:669:3: ( rule__Equal__Group__0 )
            // InternalTw.g:669:4: rule__Equal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleSupEgal"
    // InternalTw.g:678:1: entryRuleSupEgal : ruleSupEgal EOF ;
    public final void entryRuleSupEgal() throws RecognitionException {
        try {
            // InternalTw.g:679:1: ( ruleSupEgal EOF )
            // InternalTw.g:680:1: ruleSupEgal EOF
            {
             before(grammarAccess.getSupEgalRule()); 
            pushFollow(FOLLOW_1);
            ruleSupEgal();

            state._fsp--;

             after(grammarAccess.getSupEgalRule()); 
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
    // $ANTLR end "entryRuleSupEgal"


    // $ANTLR start "ruleSupEgal"
    // InternalTw.g:687:1: ruleSupEgal : ( ( rule__SupEgal__Group__0 ) ) ;
    public final void ruleSupEgal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:691:2: ( ( ( rule__SupEgal__Group__0 ) ) )
            // InternalTw.g:692:2: ( ( rule__SupEgal__Group__0 ) )
            {
            // InternalTw.g:692:2: ( ( rule__SupEgal__Group__0 ) )
            // InternalTw.g:693:3: ( rule__SupEgal__Group__0 )
            {
             before(grammarAccess.getSupEgalAccess().getGroup()); 
            // InternalTw.g:694:3: ( rule__SupEgal__Group__0 )
            // InternalTw.g:694:4: rule__SupEgal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSupEgalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupEgal"


    // $ANTLR start "entryRuleArgs"
    // InternalTw.g:703:1: entryRuleArgs : ruleArgs EOF ;
    public final void entryRuleArgs() throws RecognitionException {
        try {
            // InternalTw.g:704:1: ( ruleArgs EOF )
            // InternalTw.g:705:1: ruleArgs EOF
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
    // InternalTw.g:712:1: ruleArgs : ( ( rule__Args__Group__0 ) ) ;
    public final void ruleArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:716:2: ( ( ( rule__Args__Group__0 ) ) )
            // InternalTw.g:717:2: ( ( rule__Args__Group__0 ) )
            {
            // InternalTw.g:717:2: ( ( rule__Args__Group__0 ) )
            // InternalTw.g:718:3: ( rule__Args__Group__0 )
            {
             before(grammarAccess.getArgsAccess().getGroup()); 
            // InternalTw.g:719:3: ( rule__Args__Group__0 )
            // InternalTw.g:719:4: rule__Args__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Args__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgsAccess().getGroup()); 

            }


            }

        }
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
    // InternalTw.g:728:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalTw.g:729:1: ( ruleString0 EOF )
            // InternalTw.g:730:1: ruleString0 EOF
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
    // InternalTw.g:737:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:741:2: ( ( RULE_STRING ) )
            // InternalTw.g:742:2: ( RULE_STRING )
            {
            // InternalTw.g:742:2: ( RULE_STRING )
            // InternalTw.g:743:3: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalTw.g:753:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTw.g:754:1: ( ruleVariable EOF )
            // InternalTw.g:755:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTw.g:762:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:766:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTw.g:767:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTw.g:767:2: ( ( rule__Variable__Group__0 ) )
            // InternalTw.g:768:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTw.g:769:3: ( rule__Variable__Group__0 )
            // InternalTw.g:769:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTw.g:777:1: rule__Statement__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleConst ) | ( ruleAffectation ) | ( ruleAnd ) | ( ruleOr ) | ( ruleXor ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGreater ) | ( ruleLess ) | ( ruleEqual ) | ( ruleSupEgal ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:781:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleConst ) | ( ruleAffectation ) | ( ruleAnd ) | ( ruleOr ) | ( ruleXor ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGreater ) | ( ruleLess ) | ( ruleEqual ) | ( ruleSupEgal ) )
            int alt1=22;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            case 28:
                {
                alt1=6;
                }
                break;
            case 29:
                {
                alt1=7;
                }
                break;
            case 30:
                {
                alt1=8;
                }
                break;
            case 32:
                {
                alt1=9;
                }
                break;
            case 33:
                {
                alt1=10;
                }
                break;
            case 34:
                {
                alt1=11;
                }
                break;
            case 35:
                {
                alt1=12;
                }
                break;
            case 36:
                {
                alt1=13;
                }
                break;
            case 37:
                {
                alt1=14;
                }
                break;
            case 38:
                {
                alt1=15;
                }
                break;
            case 39:
                {
                alt1=16;
                }
                break;
            case 40:
                {
                alt1=17;
                }
                break;
            case 41:
                {
                alt1=18;
                }
                break;
            case 42:
                {
                alt1=19;
                }
                break;
            case 43:
                {
                alt1=20;
                }
                break;
            case 44:
                {
                alt1=21;
                }
                break;
            case 45:
                {
                alt1=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

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
                    // InternalTw.g:794:2: ( ruleConst )
                    {
                    // InternalTw.g:794:2: ( ruleConst )
                    // InternalTw.g:795:3: ruleConst
                    {
                     before(grammarAccess.getStatementAccess().getConstParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConst();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConstParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTw.g:800:2: ( ruleAffectation )
                    {
                    // InternalTw.g:800:2: ( ruleAffectation )
                    // InternalTw.g:801:3: ruleAffectation
                    {
                     before(grammarAccess.getStatementAccess().getAffectationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAffectation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAffectationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTw.g:806:2: ( ruleAnd )
                    {
                    // InternalTw.g:806:2: ( ruleAnd )
                    // InternalTw.g:807:3: ruleAnd
                    {
                     before(grammarAccess.getStatementAccess().getAndParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAndParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTw.g:812:2: ( ruleOr )
                    {
                    // InternalTw.g:812:2: ( ruleOr )
                    // InternalTw.g:813:3: ruleOr
                    {
                     before(grammarAccess.getStatementAccess().getOrParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOrParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTw.g:818:2: ( ruleXor )
                    {
                    // InternalTw.g:818:2: ( ruleXor )
                    // InternalTw.g:819:3: ruleXor
                    {
                     before(grammarAccess.getStatementAccess().getXorParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleXor();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getXorParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTw.g:824:2: ( ruletweets_user )
                    {
                    // InternalTw.g:824:2: ( ruletweets_user )
                    // InternalTw.g:825:3: ruletweets_user
                    {
                     before(grammarAccess.getStatementAccess().getTweets_userParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_user();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_userParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTw.g:830:2: ( ruletweets_location )
                    {
                    // InternalTw.g:830:2: ( ruletweets_location )
                    // InternalTw.g:831:3: ruletweets_location
                    {
                     before(grammarAccess.getStatementAccess().getTweets_locationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_location();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_locationParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTw.g:836:2: ( ruletweets_entity )
                    {
                    // InternalTw.g:836:2: ( ruletweets_entity )
                    // InternalTw.g:837:3: ruletweets_entity
                    {
                     before(grammarAccess.getStatementAccess().getTweets_entityParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_entity();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_entityParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTw.g:842:2: ( ruletweets_date )
                    {
                    // InternalTw.g:842:2: ( ruletweets_date )
                    // InternalTw.g:843:3: ruletweets_date
                    {
                     before(grammarAccess.getStatementAccess().getTweets_dateParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_date();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTweets_dateParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTw.g:848:2: ( ruleProportionPositif )
                    {
                    // InternalTw.g:848:2: ( ruleProportionPositif )
                    // InternalTw.g:849:3: ruleProportionPositif
                    {
                     before(grammarAccess.getStatementAccess().getProportionPositifParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionPositif();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getProportionPositifParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTw.g:854:2: ( ruleProportionNegatif )
                    {
                    // InternalTw.g:854:2: ( ruleProportionNegatif )
                    // InternalTw.g:855:3: ruleProportionNegatif
                    {
                     before(grammarAccess.getStatementAccess().getProportionNegatifParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionNegatif();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getProportionNegatifParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTw.g:860:2: ( rulecountTweet )
                    {
                    // InternalTw.g:860:2: ( rulecountTweet )
                    // InternalTw.g:861:3: rulecountTweet
                    {
                     before(grammarAccess.getStatementAccess().getCountTweetParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    rulecountTweet();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCountTweetParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTw.g:866:2: ( rulecountVisitProfil )
                    {
                    // InternalTw.g:866:2: ( rulecountVisitProfil )
                    // InternalTw.g:867:3: rulecountVisitProfil
                    {
                     before(grammarAccess.getStatementAccess().getCountVisitProfilParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    rulecountVisitProfil();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCountVisitProfilParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTw.g:872:2: ( ruleCroissanceAbonne )
                    {
                    // InternalTw.g:872:2: ( ruleCroissanceAbonne )
                    // InternalTw.g:873:3: ruleCroissanceAbonne
                    {
                     before(grammarAccess.getStatementAccess().getCroissanceAbonneParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleCroissanceAbonne();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCroissanceAbonneParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTw.g:878:2: ( rulemoyFollowers )
                    {
                    // InternalTw.g:878:2: ( rulemoyFollowers )
                    // InternalTw.g:879:3: rulemoyFollowers
                    {
                     before(grammarAccess.getStatementAccess().getMoyFollowersParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFollowers();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoyFollowersParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTw.g:884:2: ( rulemoyFavorited )
                    {
                    // InternalTw.g:884:2: ( rulemoyFavorited )
                    // InternalTw.g:885:3: rulemoyFavorited
                    {
                     before(grammarAccess.getStatementAccess().getMoyFavoritedParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFavorited();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoyFavoritedParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTw.g:890:2: ( ruleGreater )
                    {
                    // InternalTw.g:890:2: ( ruleGreater )
                    // InternalTw.g:891:3: ruleGreater
                    {
                     before(grammarAccess.getStatementAccess().getGreaterParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleGreater();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGreaterParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTw.g:896:2: ( ruleLess )
                    {
                    // InternalTw.g:896:2: ( ruleLess )
                    // InternalTw.g:897:3: ruleLess
                    {
                     before(grammarAccess.getStatementAccess().getLessParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleLess();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLessParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalTw.g:902:2: ( ruleEqual )
                    {
                    // InternalTw.g:902:2: ( ruleEqual )
                    // InternalTw.g:903:3: ruleEqual
                    {
                     before(grammarAccess.getStatementAccess().getEqualParserRuleCall_20()); 
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEqualParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalTw.g:908:2: ( ruleSupEgal )
                    {
                    // InternalTw.g:908:2: ( ruleSupEgal )
                    // InternalTw.g:909:3: ruleSupEgal
                    {
                     before(grammarAccess.getStatementAccess().getSupEgalParserRuleCall_21()); 
                    pushFollow(FOLLOW_2);
                    ruleSupEgal();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSupEgalParserRuleCall_21()); 

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
    // InternalTw.g:918:1: rule__OpBool__Alternatives : ( ( ruleAnd ) | ( ruleOr ) | ( ruleXor ) | ( ruleGreater ) | ( ruleLess ) | ( ruleEqual ) | ( ruleSupEgal ) );
    public final void rule__OpBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:922:1: ( ( ruleAnd ) | ( ruleOr ) | ( ruleXor ) | ( ruleGreater ) | ( ruleLess ) | ( ruleEqual ) | ( ruleSupEgal ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 42:
                {
                alt2=4;
                }
                break;
            case 43:
                {
                alt2=5;
                }
                break;
            case 44:
                {
                alt2=6;
                }
                break;
            case 45:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTw.g:923:2: ( ruleAnd )
                    {
                    // InternalTw.g:923:2: ( ruleAnd )
                    // InternalTw.g:924:3: ruleAnd
                    {
                     before(grammarAccess.getOpBoolAccess().getAndParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getAndParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTw.g:929:2: ( ruleOr )
                    {
                    // InternalTw.g:929:2: ( ruleOr )
                    // InternalTw.g:930:3: ruleOr
                    {
                     before(grammarAccess.getOpBoolAccess().getOrParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getOrParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTw.g:935:2: ( ruleXor )
                    {
                    // InternalTw.g:935:2: ( ruleXor )
                    // InternalTw.g:936:3: ruleXor
                    {
                     before(grammarAccess.getOpBoolAccess().getXorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXor();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getXorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTw.g:941:2: ( ruleGreater )
                    {
                    // InternalTw.g:941:2: ( ruleGreater )
                    // InternalTw.g:942:3: ruleGreater
                    {
                     before(grammarAccess.getOpBoolAccess().getGreaterParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGreater();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getGreaterParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTw.g:947:2: ( ruleLess )
                    {
                    // InternalTw.g:947:2: ( ruleLess )
                    // InternalTw.g:948:3: ruleLess
                    {
                     before(grammarAccess.getOpBoolAccess().getLessParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLess();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getLessParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTw.g:953:2: ( ruleEqual )
                    {
                    // InternalTw.g:953:2: ( ruleEqual )
                    // InternalTw.g:954:3: ruleEqual
                    {
                     before(grammarAccess.getOpBoolAccess().getEqualParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getEqualParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTw.g:959:2: ( ruleSupEgal )
                    {
                    // InternalTw.g:959:2: ( ruleSupEgal )
                    // InternalTw.g:960:3: ruleSupEgal
                    {
                     before(grammarAccess.getOpBoolAccess().getSupEgalParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSupEgal();

                    state._fsp--;

                     after(grammarAccess.getOpBoolAccess().getSupEgalParserRuleCall_6()); 

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
    // InternalTw.g:969:1: rule__Expression__Alternatives : ( ( ruleConst ) | ( ruleAffectation ) | ( ruleAnd ) | ( ruleOr ) | ( ruleXor ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGreater ) | ( ruleLess ) | ( ruleEqual ) | ( ruleSupEgal ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:973:1: ( ( ruleConst ) | ( ruleAffectation ) | ( ruleAnd ) | ( ruleOr ) | ( ruleXor ) | ( ruletweets_user ) | ( ruletweets_location ) | ( ruletweets_entity ) | ( ruletweets_date ) | ( ruleProportionPositif ) | ( ruleProportionNegatif ) | ( rulecountTweet ) | ( rulecountVisitProfil ) | ( ruleCroissanceAbonne ) | ( rulemoyFollowers ) | ( rulemoyFavorited ) | ( ruleGreater ) | ( ruleLess ) | ( ruleEqual ) | ( ruleSupEgal ) )
            int alt3=20;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            case 33:
                {
                alt3=8;
                }
                break;
            case 34:
                {
                alt3=9;
                }
                break;
            case 35:
                {
                alt3=10;
                }
                break;
            case 36:
                {
                alt3=11;
                }
                break;
            case 37:
                {
                alt3=12;
                }
                break;
            case 38:
                {
                alt3=13;
                }
                break;
            case 39:
                {
                alt3=14;
                }
                break;
            case 40:
                {
                alt3=15;
                }
                break;
            case 41:
                {
                alt3=16;
                }
                break;
            case 42:
                {
                alt3=17;
                }
                break;
            case 43:
                {
                alt3=18;
                }
                break;
            case 44:
                {
                alt3=19;
                }
                break;
            case 45:
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
                    // InternalTw.g:974:2: ( ruleConst )
                    {
                    // InternalTw.g:974:2: ( ruleConst )
                    // InternalTw.g:975:3: ruleConst
                    {
                     before(grammarAccess.getExpressionAccess().getConstParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConst();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getConstParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTw.g:980:2: ( ruleAffectation )
                    {
                    // InternalTw.g:980:2: ( ruleAffectation )
                    // InternalTw.g:981:3: ruleAffectation
                    {
                     before(grammarAccess.getExpressionAccess().getAffectationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAffectation();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAffectationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTw.g:986:2: ( ruleAnd )
                    {
                    // InternalTw.g:986:2: ( ruleAnd )
                    // InternalTw.g:987:3: ruleAnd
                    {
                     before(grammarAccess.getExpressionAccess().getAndParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAndParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTw.g:992:2: ( ruleOr )
                    {
                    // InternalTw.g:992:2: ( ruleOr )
                    // InternalTw.g:993:3: ruleOr
                    {
                     before(grammarAccess.getExpressionAccess().getOrParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getOrParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTw.g:998:2: ( ruleXor )
                    {
                    // InternalTw.g:998:2: ( ruleXor )
                    // InternalTw.g:999:3: ruleXor
                    {
                     before(grammarAccess.getExpressionAccess().getXorParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleXor();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getXorParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTw.g:1004:2: ( ruletweets_user )
                    {
                    // InternalTw.g:1004:2: ( ruletweets_user )
                    // InternalTw.g:1005:3: ruletweets_user
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_userParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_user();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_userParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTw.g:1010:2: ( ruletweets_location )
                    {
                    // InternalTw.g:1010:2: ( ruletweets_location )
                    // InternalTw.g:1011:3: ruletweets_location
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_locationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_location();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_locationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTw.g:1016:2: ( ruletweets_entity )
                    {
                    // InternalTw.g:1016:2: ( ruletweets_entity )
                    // InternalTw.g:1017:3: ruletweets_entity
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_entityParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_entity();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_entityParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTw.g:1022:2: ( ruletweets_date )
                    {
                    // InternalTw.g:1022:2: ( ruletweets_date )
                    // InternalTw.g:1023:3: ruletweets_date
                    {
                     before(grammarAccess.getExpressionAccess().getTweets_dateParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruletweets_date();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTweets_dateParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTw.g:1028:2: ( ruleProportionPositif )
                    {
                    // InternalTw.g:1028:2: ( ruleProportionPositif )
                    // InternalTw.g:1029:3: ruleProportionPositif
                    {
                     before(grammarAccess.getExpressionAccess().getProportionPositifParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionPositif();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getProportionPositifParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTw.g:1034:2: ( ruleProportionNegatif )
                    {
                    // InternalTw.g:1034:2: ( ruleProportionNegatif )
                    // InternalTw.g:1035:3: ruleProportionNegatif
                    {
                     before(grammarAccess.getExpressionAccess().getProportionNegatifParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleProportionNegatif();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getProportionNegatifParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTw.g:1040:2: ( rulecountTweet )
                    {
                    // InternalTw.g:1040:2: ( rulecountTweet )
                    // InternalTw.g:1041:3: rulecountTweet
                    {
                     before(grammarAccess.getExpressionAccess().getCountTweetParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulecountTweet();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCountTweetParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTw.g:1046:2: ( rulecountVisitProfil )
                    {
                    // InternalTw.g:1046:2: ( rulecountVisitProfil )
                    // InternalTw.g:1047:3: rulecountVisitProfil
                    {
                     before(grammarAccess.getExpressionAccess().getCountVisitProfilParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulecountVisitProfil();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCountVisitProfilParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTw.g:1052:2: ( ruleCroissanceAbonne )
                    {
                    // InternalTw.g:1052:2: ( ruleCroissanceAbonne )
                    // InternalTw.g:1053:3: ruleCroissanceAbonne
                    {
                     before(grammarAccess.getExpressionAccess().getCroissanceAbonneParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleCroissanceAbonne();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCroissanceAbonneParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTw.g:1058:2: ( rulemoyFollowers )
                    {
                    // InternalTw.g:1058:2: ( rulemoyFollowers )
                    // InternalTw.g:1059:3: rulemoyFollowers
                    {
                     before(grammarAccess.getExpressionAccess().getMoyFollowersParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFollowers();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMoyFollowersParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTw.g:1064:2: ( rulemoyFavorited )
                    {
                    // InternalTw.g:1064:2: ( rulemoyFavorited )
                    // InternalTw.g:1065:3: rulemoyFavorited
                    {
                     before(grammarAccess.getExpressionAccess().getMoyFavoritedParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    rulemoyFavorited();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMoyFavoritedParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTw.g:1070:2: ( ruleGreater )
                    {
                    // InternalTw.g:1070:2: ( ruleGreater )
                    // InternalTw.g:1071:3: ruleGreater
                    {
                     before(grammarAccess.getExpressionAccess().getGreaterParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleGreater();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getGreaterParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTw.g:1076:2: ( ruleLess )
                    {
                    // InternalTw.g:1076:2: ( ruleLess )
                    // InternalTw.g:1077:3: ruleLess
                    {
                     before(grammarAccess.getExpressionAccess().getLessParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleLess();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLessParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTw.g:1082:2: ( ruleEqual )
                    {
                    // InternalTw.g:1082:2: ( ruleEqual )
                    // InternalTw.g:1083:3: ruleEqual
                    {
                     before(grammarAccess.getExpressionAccess().getEqualParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getEqualParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTw.g:1088:2: ( ruleSupEgal )
                    {
                    // InternalTw.g:1088:2: ( ruleSupEgal )
                    // InternalTw.g:1089:3: ruleSupEgal
                    {
                     before(grammarAccess.getExpressionAccess().getSupEgalParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleSupEgal();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSupEgalParserRuleCall_19()); 

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

            if ( (LA4_0==14) ) {
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
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:1245:1: rule__Program__Group_3__0__Impl : ( 'statement' ) ;
    public final void rule__Program__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1249:1: ( ( 'statement' ) )
            // InternalTw.g:1250:1: ( 'statement' )
            {
            // InternalTw.g:1250:1: ( 'statement' )
            // InternalTw.g:1251:2: 'statement'
            {
             before(grammarAccess.getProgramAccess().getStatementKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getStatementKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:1260:1: rule__Program__Group_3__1 : rule__Program__Group_3__1__Impl rule__Program__Group_3__2 ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1264:1: ( rule__Program__Group_3__1__Impl rule__Program__Group_3__2 )
            // InternalTw.g:1265:2: rule__Program__Group_3__1__Impl rule__Program__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:1272:1: rule__Program__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1276:1: ( ( '{' ) )
            // InternalTw.g:1277:1: ( '{' )
            {
            // InternalTw.g:1277:1: ( '{' )
            // InternalTw.g:1278:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group_3__2"
    // InternalTw.g:1287:1: rule__Program__Group_3__2 : rule__Program__Group_3__2__Impl rule__Program__Group_3__3 ;
    public final void rule__Program__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1291:1: ( rule__Program__Group_3__2__Impl rule__Program__Group_3__3 )
            // InternalTw.g:1292:2: rule__Program__Group_3__2__Impl rule__Program__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__2"


    // $ANTLR start "rule__Program__Group_3__2__Impl"
    // InternalTw.g:1299:1: rule__Program__Group_3__2__Impl : ( ( rule__Program__StatementAssignment_3_2 ) ) ;
    public final void rule__Program__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1303:1: ( ( ( rule__Program__StatementAssignment_3_2 ) ) )
            // InternalTw.g:1304:1: ( ( rule__Program__StatementAssignment_3_2 ) )
            {
            // InternalTw.g:1304:1: ( ( rule__Program__StatementAssignment_3_2 ) )
            // InternalTw.g:1305:2: ( rule__Program__StatementAssignment_3_2 )
            {
             before(grammarAccess.getProgramAccess().getStatementAssignment_3_2()); 
            // InternalTw.g:1306:2: ( rule__Program__StatementAssignment_3_2 )
            // InternalTw.g:1306:3: rule__Program__StatementAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__StatementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__2__Impl"


    // $ANTLR start "rule__Program__Group_3__3"
    // InternalTw.g:1314:1: rule__Program__Group_3__3 : rule__Program__Group_3__3__Impl rule__Program__Group_3__4 ;
    public final void rule__Program__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1318:1: ( rule__Program__Group_3__3__Impl rule__Program__Group_3__4 )
            // InternalTw.g:1319:2: rule__Program__Group_3__3__Impl rule__Program__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__3"


    // $ANTLR start "rule__Program__Group_3__3__Impl"
    // InternalTw.g:1326:1: rule__Program__Group_3__3__Impl : ( ( rule__Program__Group_3_3__0 )* ) ;
    public final void rule__Program__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1330:1: ( ( ( rule__Program__Group_3_3__0 )* ) )
            // InternalTw.g:1331:1: ( ( rule__Program__Group_3_3__0 )* )
            {
            // InternalTw.g:1331:1: ( ( rule__Program__Group_3_3__0 )* )
            // InternalTw.g:1332:2: ( rule__Program__Group_3_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_3_3()); 
            // InternalTw.g:1333:2: ( rule__Program__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTw.g:1333:3: rule__Program__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Program__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__3__Impl"


    // $ANTLR start "rule__Program__Group_3__4"
    // InternalTw.g:1341:1: rule__Program__Group_3__4 : rule__Program__Group_3__4__Impl ;
    public final void rule__Program__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1345:1: ( rule__Program__Group_3__4__Impl )
            // InternalTw.g:1346:2: rule__Program__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__4"


    // $ANTLR start "rule__Program__Group_3__4__Impl"
    // InternalTw.g:1352:1: rule__Program__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1356:1: ( ( '}' ) )
            // InternalTw.g:1357:1: ( '}' )
            {
            // InternalTw.g:1357:1: ( '}' )
            // InternalTw.g:1358:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__4__Impl"


    // $ANTLR start "rule__Program__Group_3_3__0"
    // InternalTw.g:1368:1: rule__Program__Group_3_3__0 : rule__Program__Group_3_3__0__Impl rule__Program__Group_3_3__1 ;
    public final void rule__Program__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1372:1: ( rule__Program__Group_3_3__0__Impl rule__Program__Group_3_3__1 )
            // InternalTw.g:1373:2: rule__Program__Group_3_3__0__Impl rule__Program__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__0"


    // $ANTLR start "rule__Program__Group_3_3__0__Impl"
    // InternalTw.g:1380:1: rule__Program__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1384:1: ( ( ',' ) )
            // InternalTw.g:1385:1: ( ',' )
            {
            // InternalTw.g:1385:1: ( ',' )
            // InternalTw.g:1386:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__0__Impl"


    // $ANTLR start "rule__Program__Group_3_3__1"
    // InternalTw.g:1395:1: rule__Program__Group_3_3__1 : rule__Program__Group_3_3__1__Impl ;
    public final void rule__Program__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1399:1: ( rule__Program__Group_3_3__1__Impl )
            // InternalTw.g:1400:2: rule__Program__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__1"


    // $ANTLR start "rule__Program__Group_3_3__1__Impl"
    // InternalTw.g:1406:1: rule__Program__Group_3_3__1__Impl : ( ( rule__Program__StatementAssignment_3_3_1 ) ) ;
    public final void rule__Program__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1410:1: ( ( ( rule__Program__StatementAssignment_3_3_1 ) ) )
            // InternalTw.g:1411:1: ( ( rule__Program__StatementAssignment_3_3_1 ) )
            {
            // InternalTw.g:1411:1: ( ( rule__Program__StatementAssignment_3_3_1 ) )
            // InternalTw.g:1412:2: ( rule__Program__StatementAssignment_3_3_1 )
            {
             before(grammarAccess.getProgramAccess().getStatementAssignment_3_3_1()); 
            // InternalTw.g:1413:2: ( rule__Program__StatementAssignment_3_3_1 )
            // InternalTw.g:1413:3: rule__Program__StatementAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__StatementAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalTw.g:1422:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1426:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalTw.g:1427:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTw.g:1434:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1438:1: ( ( () ) )
            // InternalTw.g:1439:1: ( () )
            {
            // InternalTw.g:1439:1: ( () )
            // InternalTw.g:1440:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalTw.g:1441:2: ()
            // InternalTw.g:1441:3: 
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
    // InternalTw.g:1449:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1453:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalTw.g:1454:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:1461:1: rule__Block__Group__1__Impl : ( 'Block' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1465:1: ( ( 'Block' ) )
            // InternalTw.g:1466:1: ( 'Block' )
            {
            // InternalTw.g:1466:1: ( 'Block' )
            // InternalTw.g:1467:2: 'Block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_1()); 

            }


            }

        }
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
    // InternalTw.g:1476:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1480:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalTw.g:1481:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalTw.g:1488:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1492:1: ( ( '{' ) )
            // InternalTw.g:1493:1: ( '{' )
            {
            // InternalTw.g:1493:1: ( '{' )
            // InternalTw.g:1494:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalTw.g:1503:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1507:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalTw.g:1508:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
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
    // InternalTw.g:1515:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1519:1: ( ( ( rule__Block__Group_3__0 )? ) )
            // InternalTw.g:1520:1: ( ( rule__Block__Group_3__0 )? )
            {
            // InternalTw.g:1520:1: ( ( rule__Block__Group_3__0 )? )
            // InternalTw.g:1521:2: ( rule__Block__Group_3__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_3()); 
            // InternalTw.g:1522:2: ( rule__Block__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTw.g:1522:3: rule__Block__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Block__Group__4"
    // InternalTw.g:1530:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1534:1: ( rule__Block__Group__4__Impl )
            // InternalTw.g:1535:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalTw.g:1541:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1545:1: ( ( '}' ) )
            // InternalTw.g:1546:1: ( '}' )
            {
            // InternalTw.g:1546:1: ( '}' )
            // InternalTw.g:1547:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group_3__0"
    // InternalTw.g:1557:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1561:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalTw.g:1562:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0"


    // $ANTLR start "rule__Block__Group_3__0__Impl"
    // InternalTw.g:1569:1: rule__Block__Group_3__0__Impl : ( 'statement' ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1573:1: ( ( 'statement' ) )
            // InternalTw.g:1574:1: ( 'statement' )
            {
            // InternalTw.g:1574:1: ( 'statement' )
            // InternalTw.g:1575:2: 'statement'
            {
             before(grammarAccess.getBlockAccess().getStatementKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getStatementKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0__Impl"


    // $ANTLR start "rule__Block__Group_3__1"
    // InternalTw.g:1584:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl rule__Block__Group_3__2 ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1588:1: ( rule__Block__Group_3__1__Impl rule__Block__Group_3__2 )
            // InternalTw.g:1589:2: rule__Block__Group_3__1__Impl rule__Block__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Block__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1"


    // $ANTLR start "rule__Block__Group_3__1__Impl"
    // InternalTw.g:1596:1: rule__Block__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1600:1: ( ( '{' ) )
            // InternalTw.g:1601:1: ( '{' )
            {
            // InternalTw.g:1601:1: ( '{' )
            // InternalTw.g:1602:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group_3__2"
    // InternalTw.g:1611:1: rule__Block__Group_3__2 : rule__Block__Group_3__2__Impl rule__Block__Group_3__3 ;
    public final void rule__Block__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1615:1: ( rule__Block__Group_3__2__Impl rule__Block__Group_3__3 )
            // InternalTw.g:1616:2: rule__Block__Group_3__2__Impl rule__Block__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Block__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__2"


    // $ANTLR start "rule__Block__Group_3__2__Impl"
    // InternalTw.g:1623:1: rule__Block__Group_3__2__Impl : ( ( rule__Block__StatementAssignment_3_2 ) ) ;
    public final void rule__Block__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1627:1: ( ( ( rule__Block__StatementAssignment_3_2 ) ) )
            // InternalTw.g:1628:1: ( ( rule__Block__StatementAssignment_3_2 ) )
            {
            // InternalTw.g:1628:1: ( ( rule__Block__StatementAssignment_3_2 ) )
            // InternalTw.g:1629:2: ( rule__Block__StatementAssignment_3_2 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_3_2()); 
            // InternalTw.g:1630:2: ( rule__Block__StatementAssignment_3_2 )
            // InternalTw.g:1630:3: rule__Block__StatementAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__2__Impl"


    // $ANTLR start "rule__Block__Group_3__3"
    // InternalTw.g:1638:1: rule__Block__Group_3__3 : rule__Block__Group_3__3__Impl rule__Block__Group_3__4 ;
    public final void rule__Block__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1642:1: ( rule__Block__Group_3__3__Impl rule__Block__Group_3__4 )
            // InternalTw.g:1643:2: rule__Block__Group_3__3__Impl rule__Block__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Block__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__3"


    // $ANTLR start "rule__Block__Group_3__3__Impl"
    // InternalTw.g:1650:1: rule__Block__Group_3__3__Impl : ( ( rule__Block__Group_3_3__0 )* ) ;
    public final void rule__Block__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1654:1: ( ( ( rule__Block__Group_3_3__0 )* ) )
            // InternalTw.g:1655:1: ( ( rule__Block__Group_3_3__0 )* )
            {
            // InternalTw.g:1655:1: ( ( rule__Block__Group_3_3__0 )* )
            // InternalTw.g:1656:2: ( rule__Block__Group_3_3__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_3_3()); 
            // InternalTw.g:1657:2: ( rule__Block__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTw.g:1657:3: rule__Block__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Block__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__3__Impl"


    // $ANTLR start "rule__Block__Group_3__4"
    // InternalTw.g:1665:1: rule__Block__Group_3__4 : rule__Block__Group_3__4__Impl ;
    public final void rule__Block__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1669:1: ( rule__Block__Group_3__4__Impl )
            // InternalTw.g:1670:2: rule__Block__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__4"


    // $ANTLR start "rule__Block__Group_3__4__Impl"
    // InternalTw.g:1676:1: rule__Block__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Block__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1680:1: ( ( '}' ) )
            // InternalTw.g:1681:1: ( '}' )
            {
            // InternalTw.g:1681:1: ( '}' )
            // InternalTw.g:1682:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__4__Impl"


    // $ANTLR start "rule__Block__Group_3_3__0"
    // InternalTw.g:1692:1: rule__Block__Group_3_3__0 : rule__Block__Group_3_3__0__Impl rule__Block__Group_3_3__1 ;
    public final void rule__Block__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1696:1: ( rule__Block__Group_3_3__0__Impl rule__Block__Group_3_3__1 )
            // InternalTw.g:1697:2: rule__Block__Group_3_3__0__Impl rule__Block__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Block__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__0"


    // $ANTLR start "rule__Block__Group_3_3__0__Impl"
    // InternalTw.g:1704:1: rule__Block__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Block__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1708:1: ( ( ',' ) )
            // InternalTw.g:1709:1: ( ',' )
            {
            // InternalTw.g:1709:1: ( ',' )
            // InternalTw.g:1710:2: ','
            {
             before(grammarAccess.getBlockAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__0__Impl"


    // $ANTLR start "rule__Block__Group_3_3__1"
    // InternalTw.g:1719:1: rule__Block__Group_3_3__1 : rule__Block__Group_3_3__1__Impl ;
    public final void rule__Block__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1723:1: ( rule__Block__Group_3_3__1__Impl )
            // InternalTw.g:1724:2: rule__Block__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__1"


    // $ANTLR start "rule__Block__Group_3_3__1__Impl"
    // InternalTw.g:1730:1: rule__Block__Group_3_3__1__Impl : ( ( rule__Block__StatementAssignment_3_3_1 ) ) ;
    public final void rule__Block__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1734:1: ( ( ( rule__Block__StatementAssignment_3_3_1 ) ) )
            // InternalTw.g:1735:1: ( ( rule__Block__StatementAssignment_3_3_1 ) )
            {
            // InternalTw.g:1735:1: ( ( rule__Block__StatementAssignment_3_3_1 ) )
            // InternalTw.g:1736:2: ( rule__Block__StatementAssignment_3_3_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_3_3_1()); 
            // InternalTw.g:1737:2: ( rule__Block__StatementAssignment_3_3_1 )
            // InternalTw.g:1737:3: rule__Block__StatementAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_3__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalTw.g:1746:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1750:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalTw.g:1751:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:1758:1: rule__If__Group__0__Impl : ( 'If' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1762:1: ( ( 'If' ) )
            // InternalTw.g:1763:1: ( 'If' )
            {
            // InternalTw.g:1763:1: ( 'If' )
            // InternalTw.g:1764:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTw.g:1773:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1777:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalTw.g:1778:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalTw.g:1785:1: rule__If__Group__1__Impl : ( '{' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1789:1: ( ( '{' ) )
            // InternalTw.g:1790:1: ( '{' )
            {
            // InternalTw.g:1790:1: ( '{' )
            // InternalTw.g:1791:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalTw.g:1800:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1804:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalTw.g:1805:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTw.g:1812:1: rule__If__Group__2__Impl : ( ( rule__If__Group_2__0 )? ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1816:1: ( ( ( rule__If__Group_2__0 )? ) )
            // InternalTw.g:1817:1: ( ( rule__If__Group_2__0 )? )
            {
            // InternalTw.g:1817:1: ( ( rule__If__Group_2__0 )? )
            // InternalTw.g:1818:2: ( rule__If__Group_2__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_2()); 
            // InternalTw.g:1819:2: ( rule__If__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTw.g:1819:3: rule__If__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalTw.g:1827:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1831:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalTw.g:1832:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalTw.g:1839:1: rule__If__Group__3__Impl : ( 'ifBlock' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1843:1: ( ( 'ifBlock' ) )
            // InternalTw.g:1844:1: ( 'ifBlock' )
            {
            // InternalTw.g:1844:1: ( 'ifBlock' )
            // InternalTw.g:1845:2: 'ifBlock'
            {
             before(grammarAccess.getIfAccess().getIfBlockKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfBlockKeyword_3()); 

            }


            }

        }
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
    // InternalTw.g:1854:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1858:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalTw.g:1859:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalTw.g:1866:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1870:1: ( ( ( rule__If__IfBlockAssignment_4 ) ) )
            // InternalTw.g:1871:1: ( ( rule__If__IfBlockAssignment_4 ) )
            {
            // InternalTw.g:1871:1: ( ( rule__If__IfBlockAssignment_4 ) )
            // InternalTw.g:1872:2: ( rule__If__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalTw.g:1873:2: ( rule__If__IfBlockAssignment_4 )
            // InternalTw.g:1873:3: rule__If__IfBlockAssignment_4
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
    // InternalTw.g:1881:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1885:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalTw.g:1886:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;


            }

        }
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
    // InternalTw.g:1893:1: rule__If__Group__5__Impl : ( 'condition' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1897:1: ( ( 'condition' ) )
            // InternalTw.g:1898:1: ( 'condition' )
            {
            // InternalTw.g:1898:1: ( 'condition' )
            // InternalTw.g:1899:2: 'condition'
            {
             before(grammarAccess.getIfAccess().getConditionKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getConditionKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__If__Group__6"
    // InternalTw.g:1908:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1912:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalTw.g:1913:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalTw.g:1920:1: rule__If__Group__6__Impl : ( ( rule__If__ConditionAssignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1924:1: ( ( ( rule__If__ConditionAssignment_6 ) ) )
            // InternalTw.g:1925:1: ( ( rule__If__ConditionAssignment_6 ) )
            {
            // InternalTw.g:1925:1: ( ( rule__If__ConditionAssignment_6 ) )
            // InternalTw.g:1926:2: ( rule__If__ConditionAssignment_6 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_6()); 
            // InternalTw.g:1927:2: ( rule__If__ConditionAssignment_6 )
            // InternalTw.g:1927:3: rule__If__ConditionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // InternalTw.g:1935:1: rule__If__Group__7 : rule__If__Group__7__Impl ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1939:1: ( rule__If__Group__7__Impl )
            // InternalTw.g:1940:2: rule__If__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // InternalTw.g:1946:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1950:1: ( ( '}' ) )
            // InternalTw.g:1951:1: ( '}' )
            {
            // InternalTw.g:1951:1: ( '}' )
            // InternalTw.g:1952:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group_2__0"
    // InternalTw.g:1962:1: rule__If__Group_2__0 : rule__If__Group_2__0__Impl rule__If__Group_2__1 ;
    public final void rule__If__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1966:1: ( rule__If__Group_2__0__Impl rule__If__Group_2__1 )
            // InternalTw.g:1967:2: rule__If__Group_2__0__Impl rule__If__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__If__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__0"


    // $ANTLR start "rule__If__Group_2__0__Impl"
    // InternalTw.g:1974:1: rule__If__Group_2__0__Impl : ( 'elseBlock' ) ;
    public final void rule__If__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1978:1: ( ( 'elseBlock' ) )
            // InternalTw.g:1979:1: ( 'elseBlock' )
            {
            // InternalTw.g:1979:1: ( 'elseBlock' )
            // InternalTw.g:1980:2: 'elseBlock'
            {
             before(grammarAccess.getIfAccess().getElseBlockKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseBlockKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__0__Impl"


    // $ANTLR start "rule__If__Group_2__1"
    // InternalTw.g:1989:1: rule__If__Group_2__1 : rule__If__Group_2__1__Impl ;
    public final void rule__If__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:1993:1: ( rule__If__Group_2__1__Impl )
            // InternalTw.g:1994:2: rule__If__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__1"


    // $ANTLR start "rule__If__Group_2__1__Impl"
    // InternalTw.g:2000:1: rule__If__Group_2__1__Impl : ( ( rule__If__ElseBlockAssignment_2_1 ) ) ;
    public final void rule__If__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2004:1: ( ( ( rule__If__ElseBlockAssignment_2_1 ) ) )
            // InternalTw.g:2005:1: ( ( rule__If__ElseBlockAssignment_2_1 ) )
            {
            // InternalTw.g:2005:1: ( ( rule__If__ElseBlockAssignment_2_1 ) )
            // InternalTw.g:2006:2: ( rule__If__ElseBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_2_1()); 
            // InternalTw.g:2007:2: ( rule__If__ElseBlockAssignment_2_1 )
            // InternalTw.g:2007:3: rule__If__ElseBlockAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ElseBlockAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getElseBlockAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__1__Impl"


    // $ANTLR start "rule__Const__Group__0"
    // InternalTw.g:2016:1: rule__Const__Group__0 : rule__Const__Group__0__Impl rule__Const__Group__1 ;
    public final void rule__Const__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2020:1: ( rule__Const__Group__0__Impl rule__Const__Group__1 )
            // InternalTw.g:2021:2: rule__Const__Group__0__Impl rule__Const__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Const__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Const__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__0"


    // $ANTLR start "rule__Const__Group__0__Impl"
    // InternalTw.g:2028:1: rule__Const__Group__0__Impl : ( () ) ;
    public final void rule__Const__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2032:1: ( ( () ) )
            // InternalTw.g:2033:1: ( () )
            {
            // InternalTw.g:2033:1: ( () )
            // InternalTw.g:2034:2: ()
            {
             before(grammarAccess.getConstAccess().getConstAction_0()); 
            // InternalTw.g:2035:2: ()
            // InternalTw.g:2035:3: 
            {
            }

             after(grammarAccess.getConstAccess().getConstAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__0__Impl"


    // $ANTLR start "rule__Const__Group__1"
    // InternalTw.g:2043:1: rule__Const__Group__1 : rule__Const__Group__1__Impl ;
    public final void rule__Const__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2047:1: ( rule__Const__Group__1__Impl )
            // InternalTw.g:2048:2: rule__Const__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__1"


    // $ANTLR start "rule__Const__Group__1__Impl"
    // InternalTw.g:2054:1: rule__Const__Group__1__Impl : ( 'Const' ) ;
    public final void rule__Const__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2058:1: ( ( 'Const' ) )
            // InternalTw.g:2059:1: ( 'Const' )
            {
            // InternalTw.g:2059:1: ( 'Const' )
            // InternalTw.g:2060:2: 'Const'
            {
             before(grammarAccess.getConstAccess().getConstKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConstAccess().getConstKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // InternalTw.g:2070:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2074:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // InternalTw.g:2075:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // InternalTw.g:2082:1: rule__Affectation__Group__0__Impl : ( 'Affectation' ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2086:1: ( ( 'Affectation' ) )
            // InternalTw.g:2087:1: ( 'Affectation' )
            {
            // InternalTw.g:2087:1: ( 'Affectation' )
            // InternalTw.g:2088:2: 'Affectation'
            {
             before(grammarAccess.getAffectationAccess().getAffectationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getAffectationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // InternalTw.g:2097:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2101:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // InternalTw.g:2102:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // InternalTw.g:2109:1: rule__Affectation__Group__1__Impl : ( '{' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2113:1: ( ( '{' ) )
            // InternalTw.g:2114:1: ( '{' )
            {
            // InternalTw.g:2114:1: ( '{' )
            // InternalTw.g:2115:2: '{'
            {
             before(grammarAccess.getAffectationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // InternalTw.g:2124:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl rule__Affectation__Group__3 ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2128:1: ( rule__Affectation__Group__2__Impl rule__Affectation__Group__3 )
            // InternalTw.g:2129:2: rule__Affectation__Group__2__Impl rule__Affectation__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Affectation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // InternalTw.g:2136:1: rule__Affectation__Group__2__Impl : ( 'variable' ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2140:1: ( ( 'variable' ) )
            // InternalTw.g:2141:1: ( 'variable' )
            {
            // InternalTw.g:2141:1: ( 'variable' )
            // InternalTw.g:2142:2: 'variable'
            {
             before(grammarAccess.getAffectationAccess().getVariableKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getVariableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__Affectation__Group__3"
    // InternalTw.g:2151:1: rule__Affectation__Group__3 : rule__Affectation__Group__3__Impl rule__Affectation__Group__4 ;
    public final void rule__Affectation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2155:1: ( rule__Affectation__Group__3__Impl rule__Affectation__Group__4 )
            // InternalTw.g:2156:2: rule__Affectation__Group__3__Impl rule__Affectation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Affectation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__3"


    // $ANTLR start "rule__Affectation__Group__3__Impl"
    // InternalTw.g:2163:1: rule__Affectation__Group__3__Impl : ( ( rule__Affectation__VariableAssignment_3 ) ) ;
    public final void rule__Affectation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2167:1: ( ( ( rule__Affectation__VariableAssignment_3 ) ) )
            // InternalTw.g:2168:1: ( ( rule__Affectation__VariableAssignment_3 ) )
            {
            // InternalTw.g:2168:1: ( ( rule__Affectation__VariableAssignment_3 ) )
            // InternalTw.g:2169:2: ( rule__Affectation__VariableAssignment_3 )
            {
             before(grammarAccess.getAffectationAccess().getVariableAssignment_3()); 
            // InternalTw.g:2170:2: ( rule__Affectation__VariableAssignment_3 )
            // InternalTw.g:2170:3: rule__Affectation__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__3__Impl"


    // $ANTLR start "rule__Affectation__Group__4"
    // InternalTw.g:2178:1: rule__Affectation__Group__4 : rule__Affectation__Group__4__Impl rule__Affectation__Group__5 ;
    public final void rule__Affectation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2182:1: ( rule__Affectation__Group__4__Impl rule__Affectation__Group__5 )
            // InternalTw.g:2183:2: rule__Affectation__Group__4__Impl rule__Affectation__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Affectation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__4"


    // $ANTLR start "rule__Affectation__Group__4__Impl"
    // InternalTw.g:2190:1: rule__Affectation__Group__4__Impl : ( ( rule__Affectation__Group_4__0 )? ) ;
    public final void rule__Affectation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2194:1: ( ( ( rule__Affectation__Group_4__0 )? ) )
            // InternalTw.g:2195:1: ( ( rule__Affectation__Group_4__0 )? )
            {
            // InternalTw.g:2195:1: ( ( rule__Affectation__Group_4__0 )? )
            // InternalTw.g:2196:2: ( rule__Affectation__Group_4__0 )?
            {
             before(grammarAccess.getAffectationAccess().getGroup_4()); 
            // InternalTw.g:2197:2: ( rule__Affectation__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTw.g:2197:3: rule__Affectation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Affectation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAffectationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__4__Impl"


    // $ANTLR start "rule__Affectation__Group__5"
    // InternalTw.g:2205:1: rule__Affectation__Group__5 : rule__Affectation__Group__5__Impl ;
    public final void rule__Affectation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2209:1: ( rule__Affectation__Group__5__Impl )
            // InternalTw.g:2210:2: rule__Affectation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__5"


    // $ANTLR start "rule__Affectation__Group__5__Impl"
    // InternalTw.g:2216:1: rule__Affectation__Group__5__Impl : ( '}' ) ;
    public final void rule__Affectation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2220:1: ( ( '}' ) )
            // InternalTw.g:2221:1: ( '}' )
            {
            // InternalTw.g:2221:1: ( '}' )
            // InternalTw.g:2222:2: '}'
            {
             before(grammarAccess.getAffectationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__5__Impl"


    // $ANTLR start "rule__Affectation__Group_4__0"
    // InternalTw.g:2232:1: rule__Affectation__Group_4__0 : rule__Affectation__Group_4__0__Impl rule__Affectation__Group_4__1 ;
    public final void rule__Affectation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2236:1: ( rule__Affectation__Group_4__0__Impl rule__Affectation__Group_4__1 )
            // InternalTw.g:2237:2: rule__Affectation__Group_4__0__Impl rule__Affectation__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Affectation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_4__0"


    // $ANTLR start "rule__Affectation__Group_4__0__Impl"
    // InternalTw.g:2244:1: rule__Affectation__Group_4__0__Impl : ( 'opDroite' ) ;
    public final void rule__Affectation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2248:1: ( ( 'opDroite' ) )
            // InternalTw.g:2249:1: ( 'opDroite' )
            {
            // InternalTw.g:2249:1: ( 'opDroite' )
            // InternalTw.g:2250:2: 'opDroite'
            {
             before(grammarAccess.getAffectationAccess().getOpDroiteKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getOpDroiteKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_4__0__Impl"


    // $ANTLR start "rule__Affectation__Group_4__1"
    // InternalTw.g:2259:1: rule__Affectation__Group_4__1 : rule__Affectation__Group_4__1__Impl ;
    public final void rule__Affectation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2263:1: ( rule__Affectation__Group_4__1__Impl )
            // InternalTw.g:2264:2: rule__Affectation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_4__1"


    // $ANTLR start "rule__Affectation__Group_4__1__Impl"
    // InternalTw.g:2270:1: rule__Affectation__Group_4__1__Impl : ( ( rule__Affectation__OpDroiteAssignment_4_1 ) ) ;
    public final void rule__Affectation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2274:1: ( ( ( rule__Affectation__OpDroiteAssignment_4_1 ) ) )
            // InternalTw.g:2275:1: ( ( rule__Affectation__OpDroiteAssignment_4_1 ) )
            {
            // InternalTw.g:2275:1: ( ( rule__Affectation__OpDroiteAssignment_4_1 ) )
            // InternalTw.g:2276:2: ( rule__Affectation__OpDroiteAssignment_4_1 )
            {
             before(grammarAccess.getAffectationAccess().getOpDroiteAssignment_4_1()); 
            // InternalTw.g:2277:2: ( rule__Affectation__OpDroiteAssignment_4_1 )
            // InternalTw.g:2277:3: rule__Affectation__OpDroiteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__OpDroiteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getOpDroiteAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_4__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalTw.g:2286:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2290:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalTw.g:2291:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalTw.g:2298:1: rule__And__Group__0__Impl : ( 'And' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2302:1: ( ( 'And' ) )
            // InternalTw.g:2303:1: ( 'And' )
            {
            // InternalTw.g:2303:1: ( 'And' )
            // InternalTw.g:2304:2: 'And'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalTw.g:2313:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2317:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalTw.g:2318:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__And__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalTw.g:2325:1: rule__And__Group__1__Impl : ( '{' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2329:1: ( ( '{' ) )
            // InternalTw.g:2330:1: ( '{' )
            {
            // InternalTw.g:2330:1: ( '{' )
            // InternalTw.g:2331:2: '{'
            {
             before(grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // InternalTw.g:2340:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2344:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalTw.g:2345:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__And__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // InternalTw.g:2352:1: rule__And__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2356:1: ( ( 'expressionG' ) )
            // InternalTw.g:2357:1: ( 'expressionG' )
            {
            // InternalTw.g:2357:1: ( 'expressionG' )
            // InternalTw.g:2358:2: 'expressionG'
            {
             before(grammarAccess.getAndAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group__3"
    // InternalTw.g:2367:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2371:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // InternalTw.g:2372:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__And__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3"


    // $ANTLR start "rule__And__Group__3__Impl"
    // InternalTw.g:2379:1: rule__And__Group__3__Impl : ( ( rule__And__ExpressionGAssignment_3 ) ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2383:1: ( ( ( rule__And__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:2384:1: ( ( rule__And__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:2384:1: ( ( rule__And__ExpressionGAssignment_3 ) )
            // InternalTw.g:2385:2: ( rule__And__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getAndAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:2386:2: ( rule__And__ExpressionGAssignment_3 )
            // InternalTw.g:2386:3: rule__And__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__And__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3__Impl"


    // $ANTLR start "rule__And__Group__4"
    // InternalTw.g:2394:1: rule__And__Group__4 : rule__And__Group__4__Impl rule__And__Group__5 ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2398:1: ( rule__And__Group__4__Impl rule__And__Group__5 )
            // InternalTw.g:2399:2: rule__And__Group__4__Impl rule__And__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__And__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__4"


    // $ANTLR start "rule__And__Group__4__Impl"
    // InternalTw.g:2406:1: rule__And__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2410:1: ( ( 'expressionD' ) )
            // InternalTw.g:2411:1: ( 'expressionD' )
            {
            // InternalTw.g:2411:1: ( 'expressionD' )
            // InternalTw.g:2412:2: 'expressionD'
            {
             before(grammarAccess.getAndAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__4__Impl"


    // $ANTLR start "rule__And__Group__5"
    // InternalTw.g:2421:1: rule__And__Group__5 : rule__And__Group__5__Impl rule__And__Group__6 ;
    public final void rule__And__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2425:1: ( rule__And__Group__5__Impl rule__And__Group__6 )
            // InternalTw.g:2426:2: rule__And__Group__5__Impl rule__And__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__And__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__5"


    // $ANTLR start "rule__And__Group__5__Impl"
    // InternalTw.g:2433:1: rule__And__Group__5__Impl : ( ( rule__And__ExpressionDAssignment_5 ) ) ;
    public final void rule__And__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2437:1: ( ( ( rule__And__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:2438:1: ( ( rule__And__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:2438:1: ( ( rule__And__ExpressionDAssignment_5 ) )
            // InternalTw.g:2439:2: ( rule__And__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getAndAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:2440:2: ( rule__And__ExpressionDAssignment_5 )
            // InternalTw.g:2440:3: rule__And__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__And__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__5__Impl"


    // $ANTLR start "rule__And__Group__6"
    // InternalTw.g:2448:1: rule__And__Group__6 : rule__And__Group__6__Impl ;
    public final void rule__And__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2452:1: ( rule__And__Group__6__Impl )
            // InternalTw.g:2453:2: rule__And__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__6"


    // $ANTLR start "rule__And__Group__6__Impl"
    // InternalTw.g:2459:1: rule__And__Group__6__Impl : ( '}' ) ;
    public final void rule__And__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2463:1: ( ( '}' ) )
            // InternalTw.g:2464:1: ( '}' )
            {
            // InternalTw.g:2464:1: ( '}' )
            // InternalTw.g:2465:2: '}'
            {
             before(grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__6__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalTw.g:2475:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2479:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalTw.g:2480:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalTw.g:2487:1: rule__Or__Group__0__Impl : ( 'Or' ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2491:1: ( ( 'Or' ) )
            // InternalTw.g:2492:1: ( 'Or' )
            {
            // InternalTw.g:2492:1: ( 'Or' )
            // InternalTw.g:2493:2: 'Or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getOrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalTw.g:2502:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2506:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // InternalTw.g:2507:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalTw.g:2514:1: rule__Or__Group__1__Impl : ( '{' ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2518:1: ( ( '{' ) )
            // InternalTw.g:2519:1: ( '{' )
            {
            // InternalTw.g:2519:1: ( '{' )
            // InternalTw.g:2520:2: '{'
            {
             before(grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__2"
    // InternalTw.g:2529:1: rule__Or__Group__2 : rule__Or__Group__2__Impl rule__Or__Group__3 ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2533:1: ( rule__Or__Group__2__Impl rule__Or__Group__3 )
            // InternalTw.g:2534:2: rule__Or__Group__2__Impl rule__Or__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Or__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2"


    // $ANTLR start "rule__Or__Group__2__Impl"
    // InternalTw.g:2541:1: rule__Or__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2545:1: ( ( 'expressionG' ) )
            // InternalTw.g:2546:1: ( 'expressionG' )
            {
            // InternalTw.g:2546:1: ( 'expressionG' )
            // InternalTw.g:2547:2: 'expressionG'
            {
             before(grammarAccess.getOrAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__3"
    // InternalTw.g:2556:1: rule__Or__Group__3 : rule__Or__Group__3__Impl rule__Or__Group__4 ;
    public final void rule__Or__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2560:1: ( rule__Or__Group__3__Impl rule__Or__Group__4 )
            // InternalTw.g:2561:2: rule__Or__Group__3__Impl rule__Or__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Or__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__3"


    // $ANTLR start "rule__Or__Group__3__Impl"
    // InternalTw.g:2568:1: rule__Or__Group__3__Impl : ( ( rule__Or__ExpressionGAssignment_3 ) ) ;
    public final void rule__Or__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2572:1: ( ( ( rule__Or__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:2573:1: ( ( rule__Or__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:2573:1: ( ( rule__Or__ExpressionGAssignment_3 ) )
            // InternalTw.g:2574:2: ( rule__Or__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getOrAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:2575:2: ( rule__Or__ExpressionGAssignment_3 )
            // InternalTw.g:2575:3: rule__Or__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Or__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__3__Impl"


    // $ANTLR start "rule__Or__Group__4"
    // InternalTw.g:2583:1: rule__Or__Group__4 : rule__Or__Group__4__Impl rule__Or__Group__5 ;
    public final void rule__Or__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2587:1: ( rule__Or__Group__4__Impl rule__Or__Group__5 )
            // InternalTw.g:2588:2: rule__Or__Group__4__Impl rule__Or__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Or__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__4"


    // $ANTLR start "rule__Or__Group__4__Impl"
    // InternalTw.g:2595:1: rule__Or__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__Or__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2599:1: ( ( 'expressionD' ) )
            // InternalTw.g:2600:1: ( 'expressionD' )
            {
            // InternalTw.g:2600:1: ( 'expressionD' )
            // InternalTw.g:2601:2: 'expressionD'
            {
             before(grammarAccess.getOrAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__4__Impl"


    // $ANTLR start "rule__Or__Group__5"
    // InternalTw.g:2610:1: rule__Or__Group__5 : rule__Or__Group__5__Impl rule__Or__Group__6 ;
    public final void rule__Or__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2614:1: ( rule__Or__Group__5__Impl rule__Or__Group__6 )
            // InternalTw.g:2615:2: rule__Or__Group__5__Impl rule__Or__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Or__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__5"


    // $ANTLR start "rule__Or__Group__5__Impl"
    // InternalTw.g:2622:1: rule__Or__Group__5__Impl : ( ( rule__Or__ExpressionDAssignment_5 ) ) ;
    public final void rule__Or__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2626:1: ( ( ( rule__Or__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:2627:1: ( ( rule__Or__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:2627:1: ( ( rule__Or__ExpressionDAssignment_5 ) )
            // InternalTw.g:2628:2: ( rule__Or__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getOrAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:2629:2: ( rule__Or__ExpressionDAssignment_5 )
            // InternalTw.g:2629:3: rule__Or__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Or__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__5__Impl"


    // $ANTLR start "rule__Or__Group__6"
    // InternalTw.g:2637:1: rule__Or__Group__6 : rule__Or__Group__6__Impl ;
    public final void rule__Or__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2641:1: ( rule__Or__Group__6__Impl )
            // InternalTw.g:2642:2: rule__Or__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__6"


    // $ANTLR start "rule__Or__Group__6__Impl"
    // InternalTw.g:2648:1: rule__Or__Group__6__Impl : ( '}' ) ;
    public final void rule__Or__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2652:1: ( ( '}' ) )
            // InternalTw.g:2653:1: ( '}' )
            {
            // InternalTw.g:2653:1: ( '}' )
            // InternalTw.g:2654:2: '}'
            {
             before(grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__6__Impl"


    // $ANTLR start "rule__Xor__Group__0"
    // InternalTw.g:2664:1: rule__Xor__Group__0 : rule__Xor__Group__0__Impl rule__Xor__Group__1 ;
    public final void rule__Xor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2668:1: ( rule__Xor__Group__0__Impl rule__Xor__Group__1 )
            // InternalTw.g:2669:2: rule__Xor__Group__0__Impl rule__Xor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Xor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__0"


    // $ANTLR start "rule__Xor__Group__0__Impl"
    // InternalTw.g:2676:1: rule__Xor__Group__0__Impl : ( 'Xor' ) ;
    public final void rule__Xor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2680:1: ( ( 'Xor' ) )
            // InternalTw.g:2681:1: ( 'Xor' )
            {
            // InternalTw.g:2681:1: ( 'Xor' )
            // InternalTw.g:2682:2: 'Xor'
            {
             before(grammarAccess.getXorAccess().getXorKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXorAccess().getXorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__0__Impl"


    // $ANTLR start "rule__Xor__Group__1"
    // InternalTw.g:2691:1: rule__Xor__Group__1 : rule__Xor__Group__1__Impl rule__Xor__Group__2 ;
    public final void rule__Xor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2695:1: ( rule__Xor__Group__1__Impl rule__Xor__Group__2 )
            // InternalTw.g:2696:2: rule__Xor__Group__1__Impl rule__Xor__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Xor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__1"


    // $ANTLR start "rule__Xor__Group__1__Impl"
    // InternalTw.g:2703:1: rule__Xor__Group__1__Impl : ( '{' ) ;
    public final void rule__Xor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2707:1: ( ( '{' ) )
            // InternalTw.g:2708:1: ( '{' )
            {
            // InternalTw.g:2708:1: ( '{' )
            // InternalTw.g:2709:2: '{'
            {
             before(grammarAccess.getXorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getXorAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__1__Impl"


    // $ANTLR start "rule__Xor__Group__2"
    // InternalTw.g:2718:1: rule__Xor__Group__2 : rule__Xor__Group__2__Impl rule__Xor__Group__3 ;
    public final void rule__Xor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2722:1: ( rule__Xor__Group__2__Impl rule__Xor__Group__3 )
            // InternalTw.g:2723:2: rule__Xor__Group__2__Impl rule__Xor__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Xor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__2"


    // $ANTLR start "rule__Xor__Group__2__Impl"
    // InternalTw.g:2730:1: rule__Xor__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__Xor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2734:1: ( ( 'expressionG' ) )
            // InternalTw.g:2735:1: ( 'expressionG' )
            {
            // InternalTw.g:2735:1: ( 'expressionG' )
            // InternalTw.g:2736:2: 'expressionG'
            {
             before(grammarAccess.getXorAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXorAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__2__Impl"


    // $ANTLR start "rule__Xor__Group__3"
    // InternalTw.g:2745:1: rule__Xor__Group__3 : rule__Xor__Group__3__Impl rule__Xor__Group__4 ;
    public final void rule__Xor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2749:1: ( rule__Xor__Group__3__Impl rule__Xor__Group__4 )
            // InternalTw.g:2750:2: rule__Xor__Group__3__Impl rule__Xor__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Xor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__3"


    // $ANTLR start "rule__Xor__Group__3__Impl"
    // InternalTw.g:2757:1: rule__Xor__Group__3__Impl : ( ( rule__Xor__ExpressionGAssignment_3 ) ) ;
    public final void rule__Xor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2761:1: ( ( ( rule__Xor__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:2762:1: ( ( rule__Xor__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:2762:1: ( ( rule__Xor__ExpressionGAssignment_3 ) )
            // InternalTw.g:2763:2: ( rule__Xor__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getXorAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:2764:2: ( rule__Xor__ExpressionGAssignment_3 )
            // InternalTw.g:2764:3: rule__Xor__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Xor__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__3__Impl"


    // $ANTLR start "rule__Xor__Group__4"
    // InternalTw.g:2772:1: rule__Xor__Group__4 : rule__Xor__Group__4__Impl rule__Xor__Group__5 ;
    public final void rule__Xor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2776:1: ( rule__Xor__Group__4__Impl rule__Xor__Group__5 )
            // InternalTw.g:2777:2: rule__Xor__Group__4__Impl rule__Xor__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Xor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__4"


    // $ANTLR start "rule__Xor__Group__4__Impl"
    // InternalTw.g:2784:1: rule__Xor__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__Xor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2788:1: ( ( 'expressionD' ) )
            // InternalTw.g:2789:1: ( 'expressionD' )
            {
            // InternalTw.g:2789:1: ( 'expressionD' )
            // InternalTw.g:2790:2: 'expressionD'
            {
             before(grammarAccess.getXorAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXorAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__4__Impl"


    // $ANTLR start "rule__Xor__Group__5"
    // InternalTw.g:2799:1: rule__Xor__Group__5 : rule__Xor__Group__5__Impl rule__Xor__Group__6 ;
    public final void rule__Xor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2803:1: ( rule__Xor__Group__5__Impl rule__Xor__Group__6 )
            // InternalTw.g:2804:2: rule__Xor__Group__5__Impl rule__Xor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Xor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__5"


    // $ANTLR start "rule__Xor__Group__5__Impl"
    // InternalTw.g:2811:1: rule__Xor__Group__5__Impl : ( ( rule__Xor__ExpressionDAssignment_5 ) ) ;
    public final void rule__Xor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2815:1: ( ( ( rule__Xor__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:2816:1: ( ( rule__Xor__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:2816:1: ( ( rule__Xor__ExpressionDAssignment_5 ) )
            // InternalTw.g:2817:2: ( rule__Xor__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getXorAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:2818:2: ( rule__Xor__ExpressionDAssignment_5 )
            // InternalTw.g:2818:3: rule__Xor__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Xor__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__5__Impl"


    // $ANTLR start "rule__Xor__Group__6"
    // InternalTw.g:2826:1: rule__Xor__Group__6 : rule__Xor__Group__6__Impl ;
    public final void rule__Xor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2830:1: ( rule__Xor__Group__6__Impl )
            // InternalTw.g:2831:2: rule__Xor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__6"


    // $ANTLR start "rule__Xor__Group__6__Impl"
    // InternalTw.g:2837:1: rule__Xor__Group__6__Impl : ( '}' ) ;
    public final void rule__Xor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2841:1: ( ( '}' ) )
            // InternalTw.g:2842:1: ( '}' )
            {
            // InternalTw.g:2842:1: ( '}' )
            // InternalTw.g:2843:2: '}'
            {
             before(grammarAccess.getXorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getXorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__6__Impl"


    // $ANTLR start "rule__Tweets_user__Group__0"
    // InternalTw.g:2853:1: rule__Tweets_user__Group__0 : rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1 ;
    public final void rule__Tweets_user__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2857:1: ( rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1 )
            // InternalTw.g:2858:2: rule__Tweets_user__Group__0__Impl rule__Tweets_user__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTw.g:2865:1: rule__Tweets_user__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_user__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2869:1: ( ( () ) )
            // InternalTw.g:2870:1: ( () )
            {
            // InternalTw.g:2870:1: ( () )
            // InternalTw.g:2871:2: ()
            {
             before(grammarAccess.getTweets_userAccess().getTweets_userAction_0()); 
            // InternalTw.g:2872:2: ()
            // InternalTw.g:2872:3: 
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
    // InternalTw.g:2880:1: rule__Tweets_user__Group__1 : rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2 ;
    public final void rule__Tweets_user__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2884:1: ( rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2 )
            // InternalTw.g:2885:2: rule__Tweets_user__Group__1__Impl rule__Tweets_user__Group__2
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
    // InternalTw.g:2892:1: rule__Tweets_user__Group__1__Impl : ( 'tweets_user' ) ;
    public final void rule__Tweets_user__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2896:1: ( ( 'tweets_user' ) )
            // InternalTw.g:2897:1: ( 'tweets_user' )
            {
            // InternalTw.g:2897:1: ( 'tweets_user' )
            // InternalTw.g:2898:2: 'tweets_user'
            {
             before(grammarAccess.getTweets_userAccess().getTweets_userKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTw.g:2907:1: rule__Tweets_user__Group__2 : rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3 ;
    public final void rule__Tweets_user__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2911:1: ( rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3 )
            // InternalTw.g:2912:2: rule__Tweets_user__Group__2__Impl rule__Tweets_user__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:2919:1: rule__Tweets_user__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_user__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2923:1: ( ( '{' ) )
            // InternalTw.g:2924:1: ( '{' )
            {
            // InternalTw.g:2924:1: ( '{' )
            // InternalTw.g:2925:2: '{'
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
    // InternalTw.g:2934:1: rule__Tweets_user__Group__3 : rule__Tweets_user__Group__3__Impl rule__Tweets_user__Group__4 ;
    public final void rule__Tweets_user__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2938:1: ( rule__Tweets_user__Group__3__Impl rule__Tweets_user__Group__4 )
            // InternalTw.g:2939:2: rule__Tweets_user__Group__3__Impl rule__Tweets_user__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:2946:1: rule__Tweets_user__Group__3__Impl : ( ( rule__Tweets_user__Group_3__0 )? ) ;
    public final void rule__Tweets_user__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2950:1: ( ( ( rule__Tweets_user__Group_3__0 )? ) )
            // InternalTw.g:2951:1: ( ( rule__Tweets_user__Group_3__0 )? )
            {
            // InternalTw.g:2951:1: ( ( rule__Tweets_user__Group_3__0 )? )
            // InternalTw.g:2952:2: ( rule__Tweets_user__Group_3__0 )?
            {
             before(grammarAccess.getTweets_userAccess().getGroup_3()); 
            // InternalTw.g:2953:2: ( rule__Tweets_user__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTw.g:2953:3: rule__Tweets_user__Group_3__0
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
    // InternalTw.g:2961:1: rule__Tweets_user__Group__4 : rule__Tweets_user__Group__4__Impl ;
    public final void rule__Tweets_user__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2965:1: ( rule__Tweets_user__Group__4__Impl )
            // InternalTw.g:2966:2: rule__Tweets_user__Group__4__Impl
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
    // InternalTw.g:2972:1: rule__Tweets_user__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_user__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2976:1: ( ( '}' ) )
            // InternalTw.g:2977:1: ( '}' )
            {
            // InternalTw.g:2977:1: ( '}' )
            // InternalTw.g:2978:2: '}'
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
    // InternalTw.g:2988:1: rule__Tweets_user__Group_3__0 : rule__Tweets_user__Group_3__0__Impl rule__Tweets_user__Group_3__1 ;
    public final void rule__Tweets_user__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:2992:1: ( rule__Tweets_user__Group_3__0__Impl rule__Tweets_user__Group_3__1 )
            // InternalTw.g:2993:2: rule__Tweets_user__Group_3__0__Impl rule__Tweets_user__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3000:1: rule__Tweets_user__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__Tweets_user__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3004:1: ( ( 'args' ) )
            // InternalTw.g:3005:1: ( 'args' )
            {
            // InternalTw.g:3005:1: ( 'args' )
            // InternalTw.g:3006:2: 'args'
            {
             before(grammarAccess.getTweets_userAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:3015:1: rule__Tweets_user__Group_3__1 : rule__Tweets_user__Group_3__1__Impl rule__Tweets_user__Group_3__2 ;
    public final void rule__Tweets_user__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3019:1: ( rule__Tweets_user__Group_3__1__Impl rule__Tweets_user__Group_3__2 )
            // InternalTw.g:3020:2: rule__Tweets_user__Group_3__1__Impl rule__Tweets_user__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_user__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:3027:1: rule__Tweets_user__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Tweets_user__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3031:1: ( ( '{' ) )
            // InternalTw.g:3032:1: ( '{' )
            {
            // InternalTw.g:3032:1: ( '{' )
            // InternalTw.g:3033:2: '{'
            {
             before(grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tweets_user__Group_3__2"
    // InternalTw.g:3042:1: rule__Tweets_user__Group_3__2 : rule__Tweets_user__Group_3__2__Impl rule__Tweets_user__Group_3__3 ;
    public final void rule__Tweets_user__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3046:1: ( rule__Tweets_user__Group_3__2__Impl rule__Tweets_user__Group_3__3 )
            // InternalTw.g:3047:2: rule__Tweets_user__Group_3__2__Impl rule__Tweets_user__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_user__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__2"


    // $ANTLR start "rule__Tweets_user__Group_3__2__Impl"
    // InternalTw.g:3054:1: rule__Tweets_user__Group_3__2__Impl : ( ( rule__Tweets_user__ArgsAssignment_3_2 ) ) ;
    public final void rule__Tweets_user__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3058:1: ( ( ( rule__Tweets_user__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:3059:1: ( ( rule__Tweets_user__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:3059:1: ( ( rule__Tweets_user__ArgsAssignment_3_2 ) )
            // InternalTw.g:3060:2: ( rule__Tweets_user__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getTweets_userAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:3061:2: ( rule__Tweets_user__ArgsAssignment_3_2 )
            // InternalTw.g:3061:3: rule__Tweets_user__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__2__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3__3"
    // InternalTw.g:3069:1: rule__Tweets_user__Group_3__3 : rule__Tweets_user__Group_3__3__Impl rule__Tweets_user__Group_3__4 ;
    public final void rule__Tweets_user__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3073:1: ( rule__Tweets_user__Group_3__3__Impl rule__Tweets_user__Group_3__4 )
            // InternalTw.g:3074:2: rule__Tweets_user__Group_3__3__Impl rule__Tweets_user__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_user__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__3"


    // $ANTLR start "rule__Tweets_user__Group_3__3__Impl"
    // InternalTw.g:3081:1: rule__Tweets_user__Group_3__3__Impl : ( ( rule__Tweets_user__Group_3_3__0 )* ) ;
    public final void rule__Tweets_user__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3085:1: ( ( ( rule__Tweets_user__Group_3_3__0 )* ) )
            // InternalTw.g:3086:1: ( ( rule__Tweets_user__Group_3_3__0 )* )
            {
            // InternalTw.g:3086:1: ( ( rule__Tweets_user__Group_3_3__0 )* )
            // InternalTw.g:3087:2: ( rule__Tweets_user__Group_3_3__0 )*
            {
             before(grammarAccess.getTweets_userAccess().getGroup_3_3()); 
            // InternalTw.g:3088:2: ( rule__Tweets_user__Group_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTw.g:3088:3: rule__Tweets_user__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Tweets_user__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTweets_userAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__3__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3__4"
    // InternalTw.g:3096:1: rule__Tweets_user__Group_3__4 : rule__Tweets_user__Group_3__4__Impl ;
    public final void rule__Tweets_user__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3100:1: ( rule__Tweets_user__Group_3__4__Impl )
            // InternalTw.g:3101:2: rule__Tweets_user__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__4"


    // $ANTLR start "rule__Tweets_user__Group_3__4__Impl"
    // InternalTw.g:3107:1: rule__Tweets_user__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Tweets_user__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3111:1: ( ( '}' ) )
            // InternalTw.g:3112:1: ( '}' )
            {
            // InternalTw.g:3112:1: ( '}' )
            // InternalTw.g:3113:2: '}'
            {
             before(grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3__4__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3_3__0"
    // InternalTw.g:3123:1: rule__Tweets_user__Group_3_3__0 : rule__Tweets_user__Group_3_3__0__Impl rule__Tweets_user__Group_3_3__1 ;
    public final void rule__Tweets_user__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3127:1: ( rule__Tweets_user__Group_3_3__0__Impl rule__Tweets_user__Group_3_3__1 )
            // InternalTw.g:3128:2: rule__Tweets_user__Group_3_3__0__Impl rule__Tweets_user__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_user__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_3__0"


    // $ANTLR start "rule__Tweets_user__Group_3_3__0__Impl"
    // InternalTw.g:3135:1: rule__Tweets_user__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Tweets_user__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3139:1: ( ( ',' ) )
            // InternalTw.g:3140:1: ( ',' )
            {
            // InternalTw.g:3140:1: ( ',' )
            // InternalTw.g:3141:2: ','
            {
             before(grammarAccess.getTweets_userAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTweets_userAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_3__0__Impl"


    // $ANTLR start "rule__Tweets_user__Group_3_3__1"
    // InternalTw.g:3150:1: rule__Tweets_user__Group_3_3__1 : rule__Tweets_user__Group_3_3__1__Impl ;
    public final void rule__Tweets_user__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3154:1: ( rule__Tweets_user__Group_3_3__1__Impl )
            // InternalTw.g:3155:2: rule__Tweets_user__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_3__1"


    // $ANTLR start "rule__Tweets_user__Group_3_3__1__Impl"
    // InternalTw.g:3161:1: rule__Tweets_user__Group_3_3__1__Impl : ( ( rule__Tweets_user__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__Tweets_user__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3165:1: ( ( ( rule__Tweets_user__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:3166:1: ( ( rule__Tweets_user__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:3166:1: ( ( rule__Tweets_user__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:3167:2: ( rule__Tweets_user__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getTweets_userAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:3168:2: ( rule__Tweets_user__ArgsAssignment_3_3_1 )
            // InternalTw.g:3168:3: rule__Tweets_user__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_user__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_userAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__Group_3_3__1__Impl"


    // $ANTLR start "rule__Tweets_location__Group__0"
    // InternalTw.g:3177:1: rule__Tweets_location__Group__0 : rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1 ;
    public final void rule__Tweets_location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3181:1: ( rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1 )
            // InternalTw.g:3182:2: rule__Tweets_location__Group__0__Impl rule__Tweets_location__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTw.g:3189:1: rule__Tweets_location__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3193:1: ( ( () ) )
            // InternalTw.g:3194:1: ( () )
            {
            // InternalTw.g:3194:1: ( () )
            // InternalTw.g:3195:2: ()
            {
             before(grammarAccess.getTweets_locationAccess().getTweets_locationAction_0()); 
            // InternalTw.g:3196:2: ()
            // InternalTw.g:3196:3: 
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
    // InternalTw.g:3204:1: rule__Tweets_location__Group__1 : rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2 ;
    public final void rule__Tweets_location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3208:1: ( rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2 )
            // InternalTw.g:3209:2: rule__Tweets_location__Group__1__Impl rule__Tweets_location__Group__2
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
    // InternalTw.g:3216:1: rule__Tweets_location__Group__1__Impl : ( 'tweets_location' ) ;
    public final void rule__Tweets_location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3220:1: ( ( 'tweets_location' ) )
            // InternalTw.g:3221:1: ( 'tweets_location' )
            {
            // InternalTw.g:3221:1: ( 'tweets_location' )
            // InternalTw.g:3222:2: 'tweets_location'
            {
             before(grammarAccess.getTweets_locationAccess().getTweets_locationKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTw.g:3231:1: rule__Tweets_location__Group__2 : rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3 ;
    public final void rule__Tweets_location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3235:1: ( rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3 )
            // InternalTw.g:3236:2: rule__Tweets_location__Group__2__Impl rule__Tweets_location__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:3243:1: rule__Tweets_location__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3247:1: ( ( '{' ) )
            // InternalTw.g:3248:1: ( '{' )
            {
            // InternalTw.g:3248:1: ( '{' )
            // InternalTw.g:3249:2: '{'
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
    // InternalTw.g:3258:1: rule__Tweets_location__Group__3 : rule__Tweets_location__Group__3__Impl rule__Tweets_location__Group__4 ;
    public final void rule__Tweets_location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3262:1: ( rule__Tweets_location__Group__3__Impl rule__Tweets_location__Group__4 )
            // InternalTw.g:3263:2: rule__Tweets_location__Group__3__Impl rule__Tweets_location__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:3270:1: rule__Tweets_location__Group__3__Impl : ( ( rule__Tweets_location__Group_3__0 )? ) ;
    public final void rule__Tweets_location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3274:1: ( ( ( rule__Tweets_location__Group_3__0 )? ) )
            // InternalTw.g:3275:1: ( ( rule__Tweets_location__Group_3__0 )? )
            {
            // InternalTw.g:3275:1: ( ( rule__Tweets_location__Group_3__0 )? )
            // InternalTw.g:3276:2: ( rule__Tweets_location__Group_3__0 )?
            {
             before(grammarAccess.getTweets_locationAccess().getGroup_3()); 
            // InternalTw.g:3277:2: ( rule__Tweets_location__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTw.g:3277:3: rule__Tweets_location__Group_3__0
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
    // InternalTw.g:3285:1: rule__Tweets_location__Group__4 : rule__Tweets_location__Group__4__Impl ;
    public final void rule__Tweets_location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3289:1: ( rule__Tweets_location__Group__4__Impl )
            // InternalTw.g:3290:2: rule__Tweets_location__Group__4__Impl
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
    // InternalTw.g:3296:1: rule__Tweets_location__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3300:1: ( ( '}' ) )
            // InternalTw.g:3301:1: ( '}' )
            {
            // InternalTw.g:3301:1: ( '}' )
            // InternalTw.g:3302:2: '}'
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
    // InternalTw.g:3312:1: rule__Tweets_location__Group_3__0 : rule__Tweets_location__Group_3__0__Impl rule__Tweets_location__Group_3__1 ;
    public final void rule__Tweets_location__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3316:1: ( rule__Tweets_location__Group_3__0__Impl rule__Tweets_location__Group_3__1 )
            // InternalTw.g:3317:2: rule__Tweets_location__Group_3__0__Impl rule__Tweets_location__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3324:1: rule__Tweets_location__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__Tweets_location__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3328:1: ( ( 'args' ) )
            // InternalTw.g:3329:1: ( 'args' )
            {
            // InternalTw.g:3329:1: ( 'args' )
            // InternalTw.g:3330:2: 'args'
            {
             before(grammarAccess.getTweets_locationAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:3339:1: rule__Tweets_location__Group_3__1 : rule__Tweets_location__Group_3__1__Impl rule__Tweets_location__Group_3__2 ;
    public final void rule__Tweets_location__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3343:1: ( rule__Tweets_location__Group_3__1__Impl rule__Tweets_location__Group_3__2 )
            // InternalTw.g:3344:2: rule__Tweets_location__Group_3__1__Impl rule__Tweets_location__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_location__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:3351:1: rule__Tweets_location__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Tweets_location__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3355:1: ( ( '{' ) )
            // InternalTw.g:3356:1: ( '{' )
            {
            // InternalTw.g:3356:1: ( '{' )
            // InternalTw.g:3357:2: '{'
            {
             before(grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tweets_location__Group_3__2"
    // InternalTw.g:3366:1: rule__Tweets_location__Group_3__2 : rule__Tweets_location__Group_3__2__Impl rule__Tweets_location__Group_3__3 ;
    public final void rule__Tweets_location__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3370:1: ( rule__Tweets_location__Group_3__2__Impl rule__Tweets_location__Group_3__3 )
            // InternalTw.g:3371:2: rule__Tweets_location__Group_3__2__Impl rule__Tweets_location__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_location__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__2"


    // $ANTLR start "rule__Tweets_location__Group_3__2__Impl"
    // InternalTw.g:3378:1: rule__Tweets_location__Group_3__2__Impl : ( ( rule__Tweets_location__ArgsAssignment_3_2 ) ) ;
    public final void rule__Tweets_location__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3382:1: ( ( ( rule__Tweets_location__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:3383:1: ( ( rule__Tweets_location__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:3383:1: ( ( rule__Tweets_location__ArgsAssignment_3_2 ) )
            // InternalTw.g:3384:2: ( rule__Tweets_location__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:3385:2: ( rule__Tweets_location__ArgsAssignment_3_2 )
            // InternalTw.g:3385:3: rule__Tweets_location__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__2__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3__3"
    // InternalTw.g:3393:1: rule__Tweets_location__Group_3__3 : rule__Tweets_location__Group_3__3__Impl rule__Tweets_location__Group_3__4 ;
    public final void rule__Tweets_location__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3397:1: ( rule__Tweets_location__Group_3__3__Impl rule__Tweets_location__Group_3__4 )
            // InternalTw.g:3398:2: rule__Tweets_location__Group_3__3__Impl rule__Tweets_location__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_location__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__3"


    // $ANTLR start "rule__Tweets_location__Group_3__3__Impl"
    // InternalTw.g:3405:1: rule__Tweets_location__Group_3__3__Impl : ( ( rule__Tweets_location__Group_3_3__0 )* ) ;
    public final void rule__Tweets_location__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3409:1: ( ( ( rule__Tweets_location__Group_3_3__0 )* ) )
            // InternalTw.g:3410:1: ( ( rule__Tweets_location__Group_3_3__0 )* )
            {
            // InternalTw.g:3410:1: ( ( rule__Tweets_location__Group_3_3__0 )* )
            // InternalTw.g:3411:2: ( rule__Tweets_location__Group_3_3__0 )*
            {
             before(grammarAccess.getTweets_locationAccess().getGroup_3_3()); 
            // InternalTw.g:3412:2: ( rule__Tweets_location__Group_3_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTw.g:3412:3: rule__Tweets_location__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Tweets_location__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTweets_locationAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__3__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3__4"
    // InternalTw.g:3420:1: rule__Tweets_location__Group_3__4 : rule__Tweets_location__Group_3__4__Impl ;
    public final void rule__Tweets_location__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3424:1: ( rule__Tweets_location__Group_3__4__Impl )
            // InternalTw.g:3425:2: rule__Tweets_location__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__4"


    // $ANTLR start "rule__Tweets_location__Group_3__4__Impl"
    // InternalTw.g:3431:1: rule__Tweets_location__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Tweets_location__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3435:1: ( ( '}' ) )
            // InternalTw.g:3436:1: ( '}' )
            {
            // InternalTw.g:3436:1: ( '}' )
            // InternalTw.g:3437:2: '}'
            {
             before(grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3__4__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3_3__0"
    // InternalTw.g:3447:1: rule__Tweets_location__Group_3_3__0 : rule__Tweets_location__Group_3_3__0__Impl rule__Tweets_location__Group_3_3__1 ;
    public final void rule__Tweets_location__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3451:1: ( rule__Tweets_location__Group_3_3__0__Impl rule__Tweets_location__Group_3_3__1 )
            // InternalTw.g:3452:2: rule__Tweets_location__Group_3_3__0__Impl rule__Tweets_location__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_location__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_3__0"


    // $ANTLR start "rule__Tweets_location__Group_3_3__0__Impl"
    // InternalTw.g:3459:1: rule__Tweets_location__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Tweets_location__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3463:1: ( ( ',' ) )
            // InternalTw.g:3464:1: ( ',' )
            {
            // InternalTw.g:3464:1: ( ',' )
            // InternalTw.g:3465:2: ','
            {
             before(grammarAccess.getTweets_locationAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTweets_locationAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_3__0__Impl"


    // $ANTLR start "rule__Tweets_location__Group_3_3__1"
    // InternalTw.g:3474:1: rule__Tweets_location__Group_3_3__1 : rule__Tweets_location__Group_3_3__1__Impl ;
    public final void rule__Tweets_location__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3478:1: ( rule__Tweets_location__Group_3_3__1__Impl )
            // InternalTw.g:3479:2: rule__Tweets_location__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_3__1"


    // $ANTLR start "rule__Tweets_location__Group_3_3__1__Impl"
    // InternalTw.g:3485:1: rule__Tweets_location__Group_3_3__1__Impl : ( ( rule__Tweets_location__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__Tweets_location__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3489:1: ( ( ( rule__Tweets_location__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:3490:1: ( ( rule__Tweets_location__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:3490:1: ( ( rule__Tweets_location__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:3491:2: ( rule__Tweets_location__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:3492:2: ( rule__Tweets_location__ArgsAssignment_3_3_1 )
            // InternalTw.g:3492:3: rule__Tweets_location__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_location__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_locationAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__Group_3_3__1__Impl"


    // $ANTLR start "rule__Tweets_entity__Group__0"
    // InternalTw.g:3501:1: rule__Tweets_entity__Group__0 : rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1 ;
    public final void rule__Tweets_entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3505:1: ( rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1 )
            // InternalTw.g:3506:2: rule__Tweets_entity__Group__0__Impl rule__Tweets_entity__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTw.g:3513:1: rule__Tweets_entity__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3517:1: ( ( () ) )
            // InternalTw.g:3518:1: ( () )
            {
            // InternalTw.g:3518:1: ( () )
            // InternalTw.g:3519:2: ()
            {
             before(grammarAccess.getTweets_entityAccess().getTweets_entityAction_0()); 
            // InternalTw.g:3520:2: ()
            // InternalTw.g:3520:3: 
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
    // InternalTw.g:3528:1: rule__Tweets_entity__Group__1 : rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2 ;
    public final void rule__Tweets_entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3532:1: ( rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2 )
            // InternalTw.g:3533:2: rule__Tweets_entity__Group__1__Impl rule__Tweets_entity__Group__2
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
    // InternalTw.g:3540:1: rule__Tweets_entity__Group__1__Impl : ( 'tweets_entity' ) ;
    public final void rule__Tweets_entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3544:1: ( ( 'tweets_entity' ) )
            // InternalTw.g:3545:1: ( 'tweets_entity' )
            {
            // InternalTw.g:3545:1: ( 'tweets_entity' )
            // InternalTw.g:3546:2: 'tweets_entity'
            {
             before(grammarAccess.getTweets_entityAccess().getTweets_entityKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTw.g:3555:1: rule__Tweets_entity__Group__2 : rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3 ;
    public final void rule__Tweets_entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3559:1: ( rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3 )
            // InternalTw.g:3560:2: rule__Tweets_entity__Group__2__Impl rule__Tweets_entity__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:3567:1: rule__Tweets_entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3571:1: ( ( '{' ) )
            // InternalTw.g:3572:1: ( '{' )
            {
            // InternalTw.g:3572:1: ( '{' )
            // InternalTw.g:3573:2: '{'
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
    // InternalTw.g:3582:1: rule__Tweets_entity__Group__3 : rule__Tweets_entity__Group__3__Impl rule__Tweets_entity__Group__4 ;
    public final void rule__Tweets_entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3586:1: ( rule__Tweets_entity__Group__3__Impl rule__Tweets_entity__Group__4 )
            // InternalTw.g:3587:2: rule__Tweets_entity__Group__3__Impl rule__Tweets_entity__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:3594:1: rule__Tweets_entity__Group__3__Impl : ( ( rule__Tweets_entity__Group_3__0 )? ) ;
    public final void rule__Tweets_entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3598:1: ( ( ( rule__Tweets_entity__Group_3__0 )? ) )
            // InternalTw.g:3599:1: ( ( rule__Tweets_entity__Group_3__0 )? )
            {
            // InternalTw.g:3599:1: ( ( rule__Tweets_entity__Group_3__0 )? )
            // InternalTw.g:3600:2: ( rule__Tweets_entity__Group_3__0 )?
            {
             before(grammarAccess.getTweets_entityAccess().getGroup_3()); 
            // InternalTw.g:3601:2: ( rule__Tweets_entity__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTw.g:3601:3: rule__Tweets_entity__Group_3__0
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
    // InternalTw.g:3609:1: rule__Tweets_entity__Group__4 : rule__Tweets_entity__Group__4__Impl ;
    public final void rule__Tweets_entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3613:1: ( rule__Tweets_entity__Group__4__Impl )
            // InternalTw.g:3614:2: rule__Tweets_entity__Group__4__Impl
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
    // InternalTw.g:3620:1: rule__Tweets_entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3624:1: ( ( '}' ) )
            // InternalTw.g:3625:1: ( '}' )
            {
            // InternalTw.g:3625:1: ( '}' )
            // InternalTw.g:3626:2: '}'
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
    // InternalTw.g:3636:1: rule__Tweets_entity__Group_3__0 : rule__Tweets_entity__Group_3__0__Impl rule__Tweets_entity__Group_3__1 ;
    public final void rule__Tweets_entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3640:1: ( rule__Tweets_entity__Group_3__0__Impl rule__Tweets_entity__Group_3__1 )
            // InternalTw.g:3641:2: rule__Tweets_entity__Group_3__0__Impl rule__Tweets_entity__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3648:1: rule__Tweets_entity__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__Tweets_entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3652:1: ( ( 'args' ) )
            // InternalTw.g:3653:1: ( 'args' )
            {
            // InternalTw.g:3653:1: ( 'args' )
            // InternalTw.g:3654:2: 'args'
            {
             before(grammarAccess.getTweets_entityAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:3663:1: rule__Tweets_entity__Group_3__1 : rule__Tweets_entity__Group_3__1__Impl rule__Tweets_entity__Group_3__2 ;
    public final void rule__Tweets_entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3667:1: ( rule__Tweets_entity__Group_3__1__Impl rule__Tweets_entity__Group_3__2 )
            // InternalTw.g:3668:2: rule__Tweets_entity__Group_3__1__Impl rule__Tweets_entity__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:3675:1: rule__Tweets_entity__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Tweets_entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3679:1: ( ( '{' ) )
            // InternalTw.g:3680:1: ( '{' )
            {
            // InternalTw.g:3680:1: ( '{' )
            // InternalTw.g:3681:2: '{'
            {
             before(grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tweets_entity__Group_3__2"
    // InternalTw.g:3690:1: rule__Tweets_entity__Group_3__2 : rule__Tweets_entity__Group_3__2__Impl rule__Tweets_entity__Group_3__3 ;
    public final void rule__Tweets_entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3694:1: ( rule__Tweets_entity__Group_3__2__Impl rule__Tweets_entity__Group_3__3 )
            // InternalTw.g:3695:2: rule__Tweets_entity__Group_3__2__Impl rule__Tweets_entity__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__2"


    // $ANTLR start "rule__Tweets_entity__Group_3__2__Impl"
    // InternalTw.g:3702:1: rule__Tweets_entity__Group_3__2__Impl : ( ( rule__Tweets_entity__ArgsAssignment_3_2 ) ) ;
    public final void rule__Tweets_entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3706:1: ( ( ( rule__Tweets_entity__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:3707:1: ( ( rule__Tweets_entity__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:3707:1: ( ( rule__Tweets_entity__ArgsAssignment_3_2 ) )
            // InternalTw.g:3708:2: ( rule__Tweets_entity__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:3709:2: ( rule__Tweets_entity__ArgsAssignment_3_2 )
            // InternalTw.g:3709:3: rule__Tweets_entity__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__2__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3__3"
    // InternalTw.g:3717:1: rule__Tweets_entity__Group_3__3 : rule__Tweets_entity__Group_3__3__Impl rule__Tweets_entity__Group_3__4 ;
    public final void rule__Tweets_entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3721:1: ( rule__Tweets_entity__Group_3__3__Impl rule__Tweets_entity__Group_3__4 )
            // InternalTw.g:3722:2: rule__Tweets_entity__Group_3__3__Impl rule__Tweets_entity__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_entity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__3"


    // $ANTLR start "rule__Tweets_entity__Group_3__3__Impl"
    // InternalTw.g:3729:1: rule__Tweets_entity__Group_3__3__Impl : ( ( rule__Tweets_entity__Group_3_3__0 )* ) ;
    public final void rule__Tweets_entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3733:1: ( ( ( rule__Tweets_entity__Group_3_3__0 )* ) )
            // InternalTw.g:3734:1: ( ( rule__Tweets_entity__Group_3_3__0 )* )
            {
            // InternalTw.g:3734:1: ( ( rule__Tweets_entity__Group_3_3__0 )* )
            // InternalTw.g:3735:2: ( rule__Tweets_entity__Group_3_3__0 )*
            {
             before(grammarAccess.getTweets_entityAccess().getGroup_3_3()); 
            // InternalTw.g:3736:2: ( rule__Tweets_entity__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTw.g:3736:3: rule__Tweets_entity__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Tweets_entity__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTweets_entityAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__3__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3__4"
    // InternalTw.g:3744:1: rule__Tweets_entity__Group_3__4 : rule__Tweets_entity__Group_3__4__Impl ;
    public final void rule__Tweets_entity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3748:1: ( rule__Tweets_entity__Group_3__4__Impl )
            // InternalTw.g:3749:2: rule__Tweets_entity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__4"


    // $ANTLR start "rule__Tweets_entity__Group_3__4__Impl"
    // InternalTw.g:3755:1: rule__Tweets_entity__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Tweets_entity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3759:1: ( ( '}' ) )
            // InternalTw.g:3760:1: ( '}' )
            {
            // InternalTw.g:3760:1: ( '}' )
            // InternalTw.g:3761:2: '}'
            {
             before(grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3__4__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3_3__0"
    // InternalTw.g:3771:1: rule__Tweets_entity__Group_3_3__0 : rule__Tweets_entity__Group_3_3__0__Impl rule__Tweets_entity__Group_3_3__1 ;
    public final void rule__Tweets_entity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3775:1: ( rule__Tweets_entity__Group_3_3__0__Impl rule__Tweets_entity__Group_3_3__1 )
            // InternalTw.g:3776:2: rule__Tweets_entity__Group_3_3__0__Impl rule__Tweets_entity__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_entity__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_3__0"


    // $ANTLR start "rule__Tweets_entity__Group_3_3__0__Impl"
    // InternalTw.g:3783:1: rule__Tweets_entity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Tweets_entity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3787:1: ( ( ',' ) )
            // InternalTw.g:3788:1: ( ',' )
            {
            // InternalTw.g:3788:1: ( ',' )
            // InternalTw.g:3789:2: ','
            {
             before(grammarAccess.getTweets_entityAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTweets_entityAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_3__0__Impl"


    // $ANTLR start "rule__Tweets_entity__Group_3_3__1"
    // InternalTw.g:3798:1: rule__Tweets_entity__Group_3_3__1 : rule__Tweets_entity__Group_3_3__1__Impl ;
    public final void rule__Tweets_entity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3802:1: ( rule__Tweets_entity__Group_3_3__1__Impl )
            // InternalTw.g:3803:2: rule__Tweets_entity__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_3__1"


    // $ANTLR start "rule__Tweets_entity__Group_3_3__1__Impl"
    // InternalTw.g:3809:1: rule__Tweets_entity__Group_3_3__1__Impl : ( ( rule__Tweets_entity__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__Tweets_entity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3813:1: ( ( ( rule__Tweets_entity__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:3814:1: ( ( rule__Tweets_entity__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:3814:1: ( ( rule__Tweets_entity__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:3815:2: ( rule__Tweets_entity__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:3816:2: ( rule__Tweets_entity__ArgsAssignment_3_3_1 )
            // InternalTw.g:3816:3: rule__Tweets_entity__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_entity__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_entityAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__Group_3_3__1__Impl"


    // $ANTLR start "rule__Tweets_date__Group__0"
    // InternalTw.g:3825:1: rule__Tweets_date__Group__0 : rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1 ;
    public final void rule__Tweets_date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3829:1: ( rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1 )
            // InternalTw.g:3830:2: rule__Tweets_date__Group__0__Impl rule__Tweets_date__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTw.g:3837:1: rule__Tweets_date__Group__0__Impl : ( () ) ;
    public final void rule__Tweets_date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3841:1: ( ( () ) )
            // InternalTw.g:3842:1: ( () )
            {
            // InternalTw.g:3842:1: ( () )
            // InternalTw.g:3843:2: ()
            {
             before(grammarAccess.getTweets_dateAccess().getTweets_dateAction_0()); 
            // InternalTw.g:3844:2: ()
            // InternalTw.g:3844:3: 
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
    // InternalTw.g:3852:1: rule__Tweets_date__Group__1 : rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2 ;
    public final void rule__Tweets_date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3856:1: ( rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2 )
            // InternalTw.g:3857:2: rule__Tweets_date__Group__1__Impl rule__Tweets_date__Group__2
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
    // InternalTw.g:3864:1: rule__Tweets_date__Group__1__Impl : ( 'tweets_date' ) ;
    public final void rule__Tweets_date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3868:1: ( ( 'tweets_date' ) )
            // InternalTw.g:3869:1: ( 'tweets_date' )
            {
            // InternalTw.g:3869:1: ( 'tweets_date' )
            // InternalTw.g:3870:2: 'tweets_date'
            {
             before(grammarAccess.getTweets_dateAccess().getTweets_dateKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTw.g:3879:1: rule__Tweets_date__Group__2 : rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3 ;
    public final void rule__Tweets_date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3883:1: ( rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3 )
            // InternalTw.g:3884:2: rule__Tweets_date__Group__2__Impl rule__Tweets_date__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:3891:1: rule__Tweets_date__Group__2__Impl : ( '{' ) ;
    public final void rule__Tweets_date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3895:1: ( ( '{' ) )
            // InternalTw.g:3896:1: ( '{' )
            {
            // InternalTw.g:3896:1: ( '{' )
            // InternalTw.g:3897:2: '{'
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
    // InternalTw.g:3906:1: rule__Tweets_date__Group__3 : rule__Tweets_date__Group__3__Impl rule__Tweets_date__Group__4 ;
    public final void rule__Tweets_date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3910:1: ( rule__Tweets_date__Group__3__Impl rule__Tweets_date__Group__4 )
            // InternalTw.g:3911:2: rule__Tweets_date__Group__3__Impl rule__Tweets_date__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:3918:1: rule__Tweets_date__Group__3__Impl : ( ( rule__Tweets_date__Group_3__0 )? ) ;
    public final void rule__Tweets_date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3922:1: ( ( ( rule__Tweets_date__Group_3__0 )? ) )
            // InternalTw.g:3923:1: ( ( rule__Tweets_date__Group_3__0 )? )
            {
            // InternalTw.g:3923:1: ( ( rule__Tweets_date__Group_3__0 )? )
            // InternalTw.g:3924:2: ( rule__Tweets_date__Group_3__0 )?
            {
             before(grammarAccess.getTweets_dateAccess().getGroup_3()); 
            // InternalTw.g:3925:2: ( rule__Tweets_date__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTw.g:3925:3: rule__Tweets_date__Group_3__0
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
    // InternalTw.g:3933:1: rule__Tweets_date__Group__4 : rule__Tweets_date__Group__4__Impl ;
    public final void rule__Tweets_date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3937:1: ( rule__Tweets_date__Group__4__Impl )
            // InternalTw.g:3938:2: rule__Tweets_date__Group__4__Impl
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
    // InternalTw.g:3944:1: rule__Tweets_date__Group__4__Impl : ( '}' ) ;
    public final void rule__Tweets_date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3948:1: ( ( '}' ) )
            // InternalTw.g:3949:1: ( '}' )
            {
            // InternalTw.g:3949:1: ( '}' )
            // InternalTw.g:3950:2: '}'
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
    // InternalTw.g:3960:1: rule__Tweets_date__Group_3__0 : rule__Tweets_date__Group_3__0__Impl rule__Tweets_date__Group_3__1 ;
    public final void rule__Tweets_date__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3964:1: ( rule__Tweets_date__Group_3__0__Impl rule__Tweets_date__Group_3__1 )
            // InternalTw.g:3965:2: rule__Tweets_date__Group_3__0__Impl rule__Tweets_date__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:3972:1: rule__Tweets_date__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__Tweets_date__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3976:1: ( ( 'args' ) )
            // InternalTw.g:3977:1: ( 'args' )
            {
            // InternalTw.g:3977:1: ( 'args' )
            // InternalTw.g:3978:2: 'args'
            {
             before(grammarAccess.getTweets_dateAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:3987:1: rule__Tweets_date__Group_3__1 : rule__Tweets_date__Group_3__1__Impl rule__Tweets_date__Group_3__2 ;
    public final void rule__Tweets_date__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:3991:1: ( rule__Tweets_date__Group_3__1__Impl rule__Tweets_date__Group_3__2 )
            // InternalTw.g:3992:2: rule__Tweets_date__Group_3__1__Impl rule__Tweets_date__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_date__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:3999:1: rule__Tweets_date__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Tweets_date__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4003:1: ( ( '{' ) )
            // InternalTw.g:4004:1: ( '{' )
            {
            // InternalTw.g:4004:1: ( '{' )
            // InternalTw.g:4005:2: '{'
            {
             before(grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tweets_date__Group_3__2"
    // InternalTw.g:4014:1: rule__Tweets_date__Group_3__2 : rule__Tweets_date__Group_3__2__Impl rule__Tweets_date__Group_3__3 ;
    public final void rule__Tweets_date__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4018:1: ( rule__Tweets_date__Group_3__2__Impl rule__Tweets_date__Group_3__3 )
            // InternalTw.g:4019:2: rule__Tweets_date__Group_3__2__Impl rule__Tweets_date__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_date__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__2"


    // $ANTLR start "rule__Tweets_date__Group_3__2__Impl"
    // InternalTw.g:4026:1: rule__Tweets_date__Group_3__2__Impl : ( ( rule__Tweets_date__ArgsAssignment_3_2 ) ) ;
    public final void rule__Tweets_date__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4030:1: ( ( ( rule__Tweets_date__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:4031:1: ( ( rule__Tweets_date__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:4031:1: ( ( rule__Tweets_date__ArgsAssignment_3_2 ) )
            // InternalTw.g:4032:2: ( rule__Tweets_date__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:4033:2: ( rule__Tweets_date__ArgsAssignment_3_2 )
            // InternalTw.g:4033:3: rule__Tweets_date__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__2__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3__3"
    // InternalTw.g:4041:1: rule__Tweets_date__Group_3__3 : rule__Tweets_date__Group_3__3__Impl rule__Tweets_date__Group_3__4 ;
    public final void rule__Tweets_date__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4045:1: ( rule__Tweets_date__Group_3__3__Impl rule__Tweets_date__Group_3__4 )
            // InternalTw.g:4046:2: rule__Tweets_date__Group_3__3__Impl rule__Tweets_date__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Tweets_date__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__3"


    // $ANTLR start "rule__Tweets_date__Group_3__3__Impl"
    // InternalTw.g:4053:1: rule__Tweets_date__Group_3__3__Impl : ( ( rule__Tweets_date__Group_3_3__0 )* ) ;
    public final void rule__Tweets_date__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4057:1: ( ( ( rule__Tweets_date__Group_3_3__0 )* ) )
            // InternalTw.g:4058:1: ( ( rule__Tweets_date__Group_3_3__0 )* )
            {
            // InternalTw.g:4058:1: ( ( rule__Tweets_date__Group_3_3__0 )* )
            // InternalTw.g:4059:2: ( rule__Tweets_date__Group_3_3__0 )*
            {
             before(grammarAccess.getTweets_dateAccess().getGroup_3_3()); 
            // InternalTw.g:4060:2: ( rule__Tweets_date__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTw.g:4060:3: rule__Tweets_date__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Tweets_date__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTweets_dateAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__3__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3__4"
    // InternalTw.g:4068:1: rule__Tweets_date__Group_3__4 : rule__Tweets_date__Group_3__4__Impl ;
    public final void rule__Tweets_date__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4072:1: ( rule__Tweets_date__Group_3__4__Impl )
            // InternalTw.g:4073:2: rule__Tweets_date__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__4"


    // $ANTLR start "rule__Tweets_date__Group_3__4__Impl"
    // InternalTw.g:4079:1: rule__Tweets_date__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Tweets_date__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4083:1: ( ( '}' ) )
            // InternalTw.g:4084:1: ( '}' )
            {
            // InternalTw.g:4084:1: ( '}' )
            // InternalTw.g:4085:2: '}'
            {
             before(grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3__4__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3_3__0"
    // InternalTw.g:4095:1: rule__Tweets_date__Group_3_3__0 : rule__Tweets_date__Group_3_3__0__Impl rule__Tweets_date__Group_3_3__1 ;
    public final void rule__Tweets_date__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4099:1: ( rule__Tweets_date__Group_3_3__0__Impl rule__Tweets_date__Group_3_3__1 )
            // InternalTw.g:4100:2: rule__Tweets_date__Group_3_3__0__Impl rule__Tweets_date__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Tweets_date__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_3__0"


    // $ANTLR start "rule__Tweets_date__Group_3_3__0__Impl"
    // InternalTw.g:4107:1: rule__Tweets_date__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Tweets_date__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4111:1: ( ( ',' ) )
            // InternalTw.g:4112:1: ( ',' )
            {
            // InternalTw.g:4112:1: ( ',' )
            // InternalTw.g:4113:2: ','
            {
             before(grammarAccess.getTweets_dateAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTweets_dateAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_3__0__Impl"


    // $ANTLR start "rule__Tweets_date__Group_3_3__1"
    // InternalTw.g:4122:1: rule__Tweets_date__Group_3_3__1 : rule__Tweets_date__Group_3_3__1__Impl ;
    public final void rule__Tweets_date__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4126:1: ( rule__Tweets_date__Group_3_3__1__Impl )
            // InternalTw.g:4127:2: rule__Tweets_date__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_3__1"


    // $ANTLR start "rule__Tweets_date__Group_3_3__1__Impl"
    // InternalTw.g:4133:1: rule__Tweets_date__Group_3_3__1__Impl : ( ( rule__Tweets_date__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__Tweets_date__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4137:1: ( ( ( rule__Tweets_date__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:4138:1: ( ( rule__Tweets_date__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:4138:1: ( ( rule__Tweets_date__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:4139:2: ( rule__Tweets_date__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:4140:2: ( rule__Tweets_date__ArgsAssignment_3_3_1 )
            // InternalTw.g:4140:3: rule__Tweets_date__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tweets_date__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTweets_dateAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__Group_3_3__1__Impl"


    // $ANTLR start "rule__ProportionPositif__Group__0"
    // InternalTw.g:4149:1: rule__ProportionPositif__Group__0 : rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1 ;
    public final void rule__ProportionPositif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4153:1: ( rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1 )
            // InternalTw.g:4154:2: rule__ProportionPositif__Group__0__Impl rule__ProportionPositif__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTw.g:4161:1: rule__ProportionPositif__Group__0__Impl : ( () ) ;
    public final void rule__ProportionPositif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4165:1: ( ( () ) )
            // InternalTw.g:4166:1: ( () )
            {
            // InternalTw.g:4166:1: ( () )
            // InternalTw.g:4167:2: ()
            {
             before(grammarAccess.getProportionPositifAccess().getProportionPositifAction_0()); 
            // InternalTw.g:4168:2: ()
            // InternalTw.g:4168:3: 
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
    // InternalTw.g:4176:1: rule__ProportionPositif__Group__1 : rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2 ;
    public final void rule__ProportionPositif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4180:1: ( rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2 )
            // InternalTw.g:4181:2: rule__ProportionPositif__Group__1__Impl rule__ProportionPositif__Group__2
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
    // InternalTw.g:4188:1: rule__ProportionPositif__Group__1__Impl : ( 'ProportionPositif' ) ;
    public final void rule__ProportionPositif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4192:1: ( ( 'ProportionPositif' ) )
            // InternalTw.g:4193:1: ( 'ProportionPositif' )
            {
            // InternalTw.g:4193:1: ( 'ProportionPositif' )
            // InternalTw.g:4194:2: 'ProportionPositif'
            {
             before(grammarAccess.getProportionPositifAccess().getProportionPositifKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTw.g:4203:1: rule__ProportionPositif__Group__2 : rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3 ;
    public final void rule__ProportionPositif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4207:1: ( rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3 )
            // InternalTw.g:4208:2: rule__ProportionPositif__Group__2__Impl rule__ProportionPositif__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:4215:1: rule__ProportionPositif__Group__2__Impl : ( '{' ) ;
    public final void rule__ProportionPositif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4219:1: ( ( '{' ) )
            // InternalTw.g:4220:1: ( '{' )
            {
            // InternalTw.g:4220:1: ( '{' )
            // InternalTw.g:4221:2: '{'
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
    // InternalTw.g:4230:1: rule__ProportionPositif__Group__3 : rule__ProportionPositif__Group__3__Impl rule__ProportionPositif__Group__4 ;
    public final void rule__ProportionPositif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4234:1: ( rule__ProportionPositif__Group__3__Impl rule__ProportionPositif__Group__4 )
            // InternalTw.g:4235:2: rule__ProportionPositif__Group__3__Impl rule__ProportionPositif__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:4242:1: rule__ProportionPositif__Group__3__Impl : ( ( rule__ProportionPositif__Group_3__0 )? ) ;
    public final void rule__ProportionPositif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4246:1: ( ( ( rule__ProportionPositif__Group_3__0 )? ) )
            // InternalTw.g:4247:1: ( ( rule__ProportionPositif__Group_3__0 )? )
            {
            // InternalTw.g:4247:1: ( ( rule__ProportionPositif__Group_3__0 )? )
            // InternalTw.g:4248:2: ( rule__ProportionPositif__Group_3__0 )?
            {
             before(grammarAccess.getProportionPositifAccess().getGroup_3()); 
            // InternalTw.g:4249:2: ( rule__ProportionPositif__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTw.g:4249:3: rule__ProportionPositif__Group_3__0
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
    // InternalTw.g:4257:1: rule__ProportionPositif__Group__4 : rule__ProportionPositif__Group__4__Impl ;
    public final void rule__ProportionPositif__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4261:1: ( rule__ProportionPositif__Group__4__Impl )
            // InternalTw.g:4262:2: rule__ProportionPositif__Group__4__Impl
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
    // InternalTw.g:4268:1: rule__ProportionPositif__Group__4__Impl : ( '}' ) ;
    public final void rule__ProportionPositif__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4272:1: ( ( '}' ) )
            // InternalTw.g:4273:1: ( '}' )
            {
            // InternalTw.g:4273:1: ( '}' )
            // InternalTw.g:4274:2: '}'
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
    // InternalTw.g:4284:1: rule__ProportionPositif__Group_3__0 : rule__ProportionPositif__Group_3__0__Impl rule__ProportionPositif__Group_3__1 ;
    public final void rule__ProportionPositif__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4288:1: ( rule__ProportionPositif__Group_3__0__Impl rule__ProportionPositif__Group_3__1 )
            // InternalTw.g:4289:2: rule__ProportionPositif__Group_3__0__Impl rule__ProportionPositif__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:4296:1: rule__ProportionPositif__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__ProportionPositif__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4300:1: ( ( 'args' ) )
            // InternalTw.g:4301:1: ( 'args' )
            {
            // InternalTw.g:4301:1: ( 'args' )
            // InternalTw.g:4302:2: 'args'
            {
             before(grammarAccess.getProportionPositifAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:4311:1: rule__ProportionPositif__Group_3__1 : rule__ProportionPositif__Group_3__1__Impl rule__ProportionPositif__Group_3__2 ;
    public final void rule__ProportionPositif__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4315:1: ( rule__ProportionPositif__Group_3__1__Impl rule__ProportionPositif__Group_3__2 )
            // InternalTw.g:4316:2: rule__ProportionPositif__Group_3__1__Impl rule__ProportionPositif__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__ProportionPositif__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:4323:1: rule__ProportionPositif__Group_3__1__Impl : ( '{' ) ;
    public final void rule__ProportionPositif__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4327:1: ( ( '{' ) )
            // InternalTw.g:4328:1: ( '{' )
            {
            // InternalTw.g:4328:1: ( '{' )
            // InternalTw.g:4329:2: '{'
            {
             before(grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProportionPositif__Group_3__2"
    // InternalTw.g:4338:1: rule__ProportionPositif__Group_3__2 : rule__ProportionPositif__Group_3__2__Impl rule__ProportionPositif__Group_3__3 ;
    public final void rule__ProportionPositif__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4342:1: ( rule__ProportionPositif__Group_3__2__Impl rule__ProportionPositif__Group_3__3 )
            // InternalTw.g:4343:2: rule__ProportionPositif__Group_3__2__Impl rule__ProportionPositif__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__ProportionPositif__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__2"


    // $ANTLR start "rule__ProportionPositif__Group_3__2__Impl"
    // InternalTw.g:4350:1: rule__ProportionPositif__Group_3__2__Impl : ( ( rule__ProportionPositif__ArgsAssignment_3_2 ) ) ;
    public final void rule__ProportionPositif__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4354:1: ( ( ( rule__ProportionPositif__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:4355:1: ( ( rule__ProportionPositif__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:4355:1: ( ( rule__ProportionPositif__ArgsAssignment_3_2 ) )
            // InternalTw.g:4356:2: ( rule__ProportionPositif__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:4357:2: ( rule__ProportionPositif__ArgsAssignment_3_2 )
            // InternalTw.g:4357:3: rule__ProportionPositif__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__2__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3__3"
    // InternalTw.g:4365:1: rule__ProportionPositif__Group_3__3 : rule__ProportionPositif__Group_3__3__Impl rule__ProportionPositif__Group_3__4 ;
    public final void rule__ProportionPositif__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4369:1: ( rule__ProportionPositif__Group_3__3__Impl rule__ProportionPositif__Group_3__4 )
            // InternalTw.g:4370:2: rule__ProportionPositif__Group_3__3__Impl rule__ProportionPositif__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__ProportionPositif__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__3"


    // $ANTLR start "rule__ProportionPositif__Group_3__3__Impl"
    // InternalTw.g:4377:1: rule__ProportionPositif__Group_3__3__Impl : ( ( rule__ProportionPositif__Group_3_3__0 )* ) ;
    public final void rule__ProportionPositif__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4381:1: ( ( ( rule__ProportionPositif__Group_3_3__0 )* ) )
            // InternalTw.g:4382:1: ( ( rule__ProportionPositif__Group_3_3__0 )* )
            {
            // InternalTw.g:4382:1: ( ( rule__ProportionPositif__Group_3_3__0 )* )
            // InternalTw.g:4383:2: ( rule__ProportionPositif__Group_3_3__0 )*
            {
             before(grammarAccess.getProportionPositifAccess().getGroup_3_3()); 
            // InternalTw.g:4384:2: ( rule__ProportionPositif__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTw.g:4384:3: rule__ProportionPositif__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ProportionPositif__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProportionPositifAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__3__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3__4"
    // InternalTw.g:4392:1: rule__ProportionPositif__Group_3__4 : rule__ProportionPositif__Group_3__4__Impl ;
    public final void rule__ProportionPositif__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4396:1: ( rule__ProportionPositif__Group_3__4__Impl )
            // InternalTw.g:4397:2: rule__ProportionPositif__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__4"


    // $ANTLR start "rule__ProportionPositif__Group_3__4__Impl"
    // InternalTw.g:4403:1: rule__ProportionPositif__Group_3__4__Impl : ( '}' ) ;
    public final void rule__ProportionPositif__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4407:1: ( ( '}' ) )
            // InternalTw.g:4408:1: ( '}' )
            {
            // InternalTw.g:4408:1: ( '}' )
            // InternalTw.g:4409:2: '}'
            {
             before(grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3__4__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3_3__0"
    // InternalTw.g:4419:1: rule__ProportionPositif__Group_3_3__0 : rule__ProportionPositif__Group_3_3__0__Impl rule__ProportionPositif__Group_3_3__1 ;
    public final void rule__ProportionPositif__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4423:1: ( rule__ProportionPositif__Group_3_3__0__Impl rule__ProportionPositif__Group_3_3__1 )
            // InternalTw.g:4424:2: rule__ProportionPositif__Group_3_3__0__Impl rule__ProportionPositif__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__ProportionPositif__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_3__0"


    // $ANTLR start "rule__ProportionPositif__Group_3_3__0__Impl"
    // InternalTw.g:4431:1: rule__ProportionPositif__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ProportionPositif__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4435:1: ( ( ',' ) )
            // InternalTw.g:4436:1: ( ',' )
            {
            // InternalTw.g:4436:1: ( ',' )
            // InternalTw.g:4437:2: ','
            {
             before(grammarAccess.getProportionPositifAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProportionPositifAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_3__0__Impl"


    // $ANTLR start "rule__ProportionPositif__Group_3_3__1"
    // InternalTw.g:4446:1: rule__ProportionPositif__Group_3_3__1 : rule__ProportionPositif__Group_3_3__1__Impl ;
    public final void rule__ProportionPositif__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4450:1: ( rule__ProportionPositif__Group_3_3__1__Impl )
            // InternalTw.g:4451:2: rule__ProportionPositif__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_3__1"


    // $ANTLR start "rule__ProportionPositif__Group_3_3__1__Impl"
    // InternalTw.g:4457:1: rule__ProportionPositif__Group_3_3__1__Impl : ( ( rule__ProportionPositif__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__ProportionPositif__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4461:1: ( ( ( rule__ProportionPositif__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:4462:1: ( ( rule__ProportionPositif__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:4462:1: ( ( rule__ProportionPositif__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:4463:2: ( rule__ProportionPositif__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:4464:2: ( rule__ProportionPositif__ArgsAssignment_3_3_1 )
            // InternalTw.g:4464:3: rule__ProportionPositif__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProportionPositif__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProportionPositifAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__Group_3_3__1__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group__0"
    // InternalTw.g:4473:1: rule__ProportionNegatif__Group__0 : rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1 ;
    public final void rule__ProportionNegatif__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4477:1: ( rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1 )
            // InternalTw.g:4478:2: rule__ProportionNegatif__Group__0__Impl rule__ProportionNegatif__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTw.g:4485:1: rule__ProportionNegatif__Group__0__Impl : ( () ) ;
    public final void rule__ProportionNegatif__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4489:1: ( ( () ) )
            // InternalTw.g:4490:1: ( () )
            {
            // InternalTw.g:4490:1: ( () )
            // InternalTw.g:4491:2: ()
            {
             before(grammarAccess.getProportionNegatifAccess().getProportionNegatifAction_0()); 
            // InternalTw.g:4492:2: ()
            // InternalTw.g:4492:3: 
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
    // InternalTw.g:4500:1: rule__ProportionNegatif__Group__1 : rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2 ;
    public final void rule__ProportionNegatif__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4504:1: ( rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2 )
            // InternalTw.g:4505:2: rule__ProportionNegatif__Group__1__Impl rule__ProportionNegatif__Group__2
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
    // InternalTw.g:4512:1: rule__ProportionNegatif__Group__1__Impl : ( 'ProportionNegatif' ) ;
    public final void rule__ProportionNegatif__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4516:1: ( ( 'ProportionNegatif' ) )
            // InternalTw.g:4517:1: ( 'ProportionNegatif' )
            {
            // InternalTw.g:4517:1: ( 'ProportionNegatif' )
            // InternalTw.g:4518:2: 'ProportionNegatif'
            {
             before(grammarAccess.getProportionNegatifAccess().getProportionNegatifKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTw.g:4527:1: rule__ProportionNegatif__Group__2 : rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3 ;
    public final void rule__ProportionNegatif__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4531:1: ( rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3 )
            // InternalTw.g:4532:2: rule__ProportionNegatif__Group__2__Impl rule__ProportionNegatif__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:4539:1: rule__ProportionNegatif__Group__2__Impl : ( '{' ) ;
    public final void rule__ProportionNegatif__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4543:1: ( ( '{' ) )
            // InternalTw.g:4544:1: ( '{' )
            {
            // InternalTw.g:4544:1: ( '{' )
            // InternalTw.g:4545:2: '{'
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
    // InternalTw.g:4554:1: rule__ProportionNegatif__Group__3 : rule__ProportionNegatif__Group__3__Impl rule__ProportionNegatif__Group__4 ;
    public final void rule__ProportionNegatif__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4558:1: ( rule__ProportionNegatif__Group__3__Impl rule__ProportionNegatif__Group__4 )
            // InternalTw.g:4559:2: rule__ProportionNegatif__Group__3__Impl rule__ProportionNegatif__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:4566:1: rule__ProportionNegatif__Group__3__Impl : ( ( rule__ProportionNegatif__Group_3__0 )? ) ;
    public final void rule__ProportionNegatif__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4570:1: ( ( ( rule__ProportionNegatif__Group_3__0 )? ) )
            // InternalTw.g:4571:1: ( ( rule__ProportionNegatif__Group_3__0 )? )
            {
            // InternalTw.g:4571:1: ( ( rule__ProportionNegatif__Group_3__0 )? )
            // InternalTw.g:4572:2: ( rule__ProportionNegatif__Group_3__0 )?
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup_3()); 
            // InternalTw.g:4573:2: ( rule__ProportionNegatif__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTw.g:4573:3: rule__ProportionNegatif__Group_3__0
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
    // InternalTw.g:4581:1: rule__ProportionNegatif__Group__4 : rule__ProportionNegatif__Group__4__Impl ;
    public final void rule__ProportionNegatif__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4585:1: ( rule__ProportionNegatif__Group__4__Impl )
            // InternalTw.g:4586:2: rule__ProportionNegatif__Group__4__Impl
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
    // InternalTw.g:4592:1: rule__ProportionNegatif__Group__4__Impl : ( '}' ) ;
    public final void rule__ProportionNegatif__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4596:1: ( ( '}' ) )
            // InternalTw.g:4597:1: ( '}' )
            {
            // InternalTw.g:4597:1: ( '}' )
            // InternalTw.g:4598:2: '}'
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
    // InternalTw.g:4608:1: rule__ProportionNegatif__Group_3__0 : rule__ProportionNegatif__Group_3__0__Impl rule__ProportionNegatif__Group_3__1 ;
    public final void rule__ProportionNegatif__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4612:1: ( rule__ProportionNegatif__Group_3__0__Impl rule__ProportionNegatif__Group_3__1 )
            // InternalTw.g:4613:2: rule__ProportionNegatif__Group_3__0__Impl rule__ProportionNegatif__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:4620:1: rule__ProportionNegatif__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__ProportionNegatif__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4624:1: ( ( 'args' ) )
            // InternalTw.g:4625:1: ( 'args' )
            {
            // InternalTw.g:4625:1: ( 'args' )
            // InternalTw.g:4626:2: 'args'
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:4635:1: rule__ProportionNegatif__Group_3__1 : rule__ProportionNegatif__Group_3__1__Impl rule__ProportionNegatif__Group_3__2 ;
    public final void rule__ProportionNegatif__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4639:1: ( rule__ProportionNegatif__Group_3__1__Impl rule__ProportionNegatif__Group_3__2 )
            // InternalTw.g:4640:2: rule__ProportionNegatif__Group_3__1__Impl rule__ProportionNegatif__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__ProportionNegatif__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:4647:1: rule__ProportionNegatif__Group_3__1__Impl : ( '{' ) ;
    public final void rule__ProportionNegatif__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4651:1: ( ( '{' ) )
            // InternalTw.g:4652:1: ( '{' )
            {
            // InternalTw.g:4652:1: ( '{' )
            // InternalTw.g:4653:2: '{'
            {
             before(grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProportionNegatif__Group_3__2"
    // InternalTw.g:4662:1: rule__ProportionNegatif__Group_3__2 : rule__ProportionNegatif__Group_3__2__Impl rule__ProportionNegatif__Group_3__3 ;
    public final void rule__ProportionNegatif__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4666:1: ( rule__ProportionNegatif__Group_3__2__Impl rule__ProportionNegatif__Group_3__3 )
            // InternalTw.g:4667:2: rule__ProportionNegatif__Group_3__2__Impl rule__ProportionNegatif__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__ProportionNegatif__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__2"


    // $ANTLR start "rule__ProportionNegatif__Group_3__2__Impl"
    // InternalTw.g:4674:1: rule__ProportionNegatif__Group_3__2__Impl : ( ( rule__ProportionNegatif__ArgsAssignment_3_2 ) ) ;
    public final void rule__ProportionNegatif__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4678:1: ( ( ( rule__ProportionNegatif__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:4679:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:4679:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_2 ) )
            // InternalTw.g:4680:2: ( rule__ProportionNegatif__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:4681:2: ( rule__ProportionNegatif__ArgsAssignment_3_2 )
            // InternalTw.g:4681:3: rule__ProportionNegatif__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__2__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3__3"
    // InternalTw.g:4689:1: rule__ProportionNegatif__Group_3__3 : rule__ProportionNegatif__Group_3__3__Impl rule__ProportionNegatif__Group_3__4 ;
    public final void rule__ProportionNegatif__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4693:1: ( rule__ProportionNegatif__Group_3__3__Impl rule__ProportionNegatif__Group_3__4 )
            // InternalTw.g:4694:2: rule__ProportionNegatif__Group_3__3__Impl rule__ProportionNegatif__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__ProportionNegatif__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__3"


    // $ANTLR start "rule__ProportionNegatif__Group_3__3__Impl"
    // InternalTw.g:4701:1: rule__ProportionNegatif__Group_3__3__Impl : ( ( rule__ProportionNegatif__Group_3_3__0 )* ) ;
    public final void rule__ProportionNegatif__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4705:1: ( ( ( rule__ProportionNegatif__Group_3_3__0 )* ) )
            // InternalTw.g:4706:1: ( ( rule__ProportionNegatif__Group_3_3__0 )* )
            {
            // InternalTw.g:4706:1: ( ( rule__ProportionNegatif__Group_3_3__0 )* )
            // InternalTw.g:4707:2: ( rule__ProportionNegatif__Group_3_3__0 )*
            {
             before(grammarAccess.getProportionNegatifAccess().getGroup_3_3()); 
            // InternalTw.g:4708:2: ( rule__ProportionNegatif__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTw.g:4708:3: rule__ProportionNegatif__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ProportionNegatif__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProportionNegatifAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__3__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3__4"
    // InternalTw.g:4716:1: rule__ProportionNegatif__Group_3__4 : rule__ProportionNegatif__Group_3__4__Impl ;
    public final void rule__ProportionNegatif__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4720:1: ( rule__ProportionNegatif__Group_3__4__Impl )
            // InternalTw.g:4721:2: rule__ProportionNegatif__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__4"


    // $ANTLR start "rule__ProportionNegatif__Group_3__4__Impl"
    // InternalTw.g:4727:1: rule__ProportionNegatif__Group_3__4__Impl : ( '}' ) ;
    public final void rule__ProportionNegatif__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4731:1: ( ( '}' ) )
            // InternalTw.g:4732:1: ( '}' )
            {
            // InternalTw.g:4732:1: ( '}' )
            // InternalTw.g:4733:2: '}'
            {
             before(grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3__4__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3_3__0"
    // InternalTw.g:4743:1: rule__ProportionNegatif__Group_3_3__0 : rule__ProportionNegatif__Group_3_3__0__Impl rule__ProportionNegatif__Group_3_3__1 ;
    public final void rule__ProportionNegatif__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4747:1: ( rule__ProportionNegatif__Group_3_3__0__Impl rule__ProportionNegatif__Group_3_3__1 )
            // InternalTw.g:4748:2: rule__ProportionNegatif__Group_3_3__0__Impl rule__ProportionNegatif__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__ProportionNegatif__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_3__0"


    // $ANTLR start "rule__ProportionNegatif__Group_3_3__0__Impl"
    // InternalTw.g:4755:1: rule__ProportionNegatif__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ProportionNegatif__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4759:1: ( ( ',' ) )
            // InternalTw.g:4760:1: ( ',' )
            {
            // InternalTw.g:4760:1: ( ',' )
            // InternalTw.g:4761:2: ','
            {
             before(grammarAccess.getProportionNegatifAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProportionNegatifAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_3__0__Impl"


    // $ANTLR start "rule__ProportionNegatif__Group_3_3__1"
    // InternalTw.g:4770:1: rule__ProportionNegatif__Group_3_3__1 : rule__ProportionNegatif__Group_3_3__1__Impl ;
    public final void rule__ProportionNegatif__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4774:1: ( rule__ProportionNegatif__Group_3_3__1__Impl )
            // InternalTw.g:4775:2: rule__ProportionNegatif__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_3__1"


    // $ANTLR start "rule__ProportionNegatif__Group_3_3__1__Impl"
    // InternalTw.g:4781:1: rule__ProportionNegatif__Group_3_3__1__Impl : ( ( rule__ProportionNegatif__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__ProportionNegatif__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4785:1: ( ( ( rule__ProportionNegatif__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:4786:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:4786:1: ( ( rule__ProportionNegatif__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:4787:2: ( rule__ProportionNegatif__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:4788:2: ( rule__ProportionNegatif__ArgsAssignment_3_3_1 )
            // InternalTw.g:4788:3: rule__ProportionNegatif__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProportionNegatif__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProportionNegatifAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__Group_3_3__1__Impl"


    // $ANTLR start "rule__CountTweet__Group__0"
    // InternalTw.g:4797:1: rule__CountTweet__Group__0 : rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1 ;
    public final void rule__CountTweet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4801:1: ( rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1 )
            // InternalTw.g:4802:2: rule__CountTweet__Group__0__Impl rule__CountTweet__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTw.g:4809:1: rule__CountTweet__Group__0__Impl : ( () ) ;
    public final void rule__CountTweet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4813:1: ( ( () ) )
            // InternalTw.g:4814:1: ( () )
            {
            // InternalTw.g:4814:1: ( () )
            // InternalTw.g:4815:2: ()
            {
             before(grammarAccess.getCountTweetAccess().getCountTweetAction_0()); 
            // InternalTw.g:4816:2: ()
            // InternalTw.g:4816:3: 
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
    // InternalTw.g:4824:1: rule__CountTweet__Group__1 : rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2 ;
    public final void rule__CountTweet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4828:1: ( rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2 )
            // InternalTw.g:4829:2: rule__CountTweet__Group__1__Impl rule__CountTweet__Group__2
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
    // InternalTw.g:4836:1: rule__CountTweet__Group__1__Impl : ( 'countTweet' ) ;
    public final void rule__CountTweet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4840:1: ( ( 'countTweet' ) )
            // InternalTw.g:4841:1: ( 'countTweet' )
            {
            // InternalTw.g:4841:1: ( 'countTweet' )
            // InternalTw.g:4842:2: 'countTweet'
            {
             before(grammarAccess.getCountTweetAccess().getCountTweetKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTw.g:4851:1: rule__CountTweet__Group__2 : rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3 ;
    public final void rule__CountTweet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4855:1: ( rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3 )
            // InternalTw.g:4856:2: rule__CountTweet__Group__2__Impl rule__CountTweet__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:4863:1: rule__CountTweet__Group__2__Impl : ( '{' ) ;
    public final void rule__CountTweet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4867:1: ( ( '{' ) )
            // InternalTw.g:4868:1: ( '{' )
            {
            // InternalTw.g:4868:1: ( '{' )
            // InternalTw.g:4869:2: '{'
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
    // InternalTw.g:4878:1: rule__CountTweet__Group__3 : rule__CountTweet__Group__3__Impl rule__CountTweet__Group__4 ;
    public final void rule__CountTweet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4882:1: ( rule__CountTweet__Group__3__Impl rule__CountTweet__Group__4 )
            // InternalTw.g:4883:2: rule__CountTweet__Group__3__Impl rule__CountTweet__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:4890:1: rule__CountTweet__Group__3__Impl : ( ( rule__CountTweet__Group_3__0 )? ) ;
    public final void rule__CountTweet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4894:1: ( ( ( rule__CountTweet__Group_3__0 )? ) )
            // InternalTw.g:4895:1: ( ( rule__CountTweet__Group_3__0 )? )
            {
            // InternalTw.g:4895:1: ( ( rule__CountTweet__Group_3__0 )? )
            // InternalTw.g:4896:2: ( rule__CountTweet__Group_3__0 )?
            {
             before(grammarAccess.getCountTweetAccess().getGroup_3()); 
            // InternalTw.g:4897:2: ( rule__CountTweet__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTw.g:4897:3: rule__CountTweet__Group_3__0
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
    // InternalTw.g:4905:1: rule__CountTweet__Group__4 : rule__CountTweet__Group__4__Impl ;
    public final void rule__CountTweet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4909:1: ( rule__CountTweet__Group__4__Impl )
            // InternalTw.g:4910:2: rule__CountTweet__Group__4__Impl
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
    // InternalTw.g:4916:1: rule__CountTweet__Group__4__Impl : ( '}' ) ;
    public final void rule__CountTweet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4920:1: ( ( '}' ) )
            // InternalTw.g:4921:1: ( '}' )
            {
            // InternalTw.g:4921:1: ( '}' )
            // InternalTw.g:4922:2: '}'
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
    // InternalTw.g:4932:1: rule__CountTweet__Group_3__0 : rule__CountTweet__Group_3__0__Impl rule__CountTweet__Group_3__1 ;
    public final void rule__CountTweet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4936:1: ( rule__CountTweet__Group_3__0__Impl rule__CountTweet__Group_3__1 )
            // InternalTw.g:4937:2: rule__CountTweet__Group_3__0__Impl rule__CountTweet__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:4944:1: rule__CountTweet__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__CountTweet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4948:1: ( ( 'args' ) )
            // InternalTw.g:4949:1: ( 'args' )
            {
            // InternalTw.g:4949:1: ( 'args' )
            // InternalTw.g:4950:2: 'args'
            {
             before(grammarAccess.getCountTweetAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:4959:1: rule__CountTweet__Group_3__1 : rule__CountTweet__Group_3__1__Impl rule__CountTweet__Group_3__2 ;
    public final void rule__CountTweet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4963:1: ( rule__CountTweet__Group_3__1__Impl rule__CountTweet__Group_3__2 )
            // InternalTw.g:4964:2: rule__CountTweet__Group_3__1__Impl rule__CountTweet__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__CountTweet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:4971:1: rule__CountTweet__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CountTweet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4975:1: ( ( '{' ) )
            // InternalTw.g:4976:1: ( '{' )
            {
            // InternalTw.g:4976:1: ( '{' )
            // InternalTw.g:4977:2: '{'
            {
             before(grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CountTweet__Group_3__2"
    // InternalTw.g:4986:1: rule__CountTweet__Group_3__2 : rule__CountTweet__Group_3__2__Impl rule__CountTweet__Group_3__3 ;
    public final void rule__CountTweet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:4990:1: ( rule__CountTweet__Group_3__2__Impl rule__CountTweet__Group_3__3 )
            // InternalTw.g:4991:2: rule__CountTweet__Group_3__2__Impl rule__CountTweet__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__CountTweet__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__2"


    // $ANTLR start "rule__CountTweet__Group_3__2__Impl"
    // InternalTw.g:4998:1: rule__CountTweet__Group_3__2__Impl : ( ( rule__CountTweet__ArgsAssignment_3_2 ) ) ;
    public final void rule__CountTweet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5002:1: ( ( ( rule__CountTweet__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:5003:1: ( ( rule__CountTweet__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:5003:1: ( ( rule__CountTweet__ArgsAssignment_3_2 ) )
            // InternalTw.g:5004:2: ( rule__CountTweet__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getCountTweetAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:5005:2: ( rule__CountTweet__ArgsAssignment_3_2 )
            // InternalTw.g:5005:3: rule__CountTweet__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__2__Impl"


    // $ANTLR start "rule__CountTweet__Group_3__3"
    // InternalTw.g:5013:1: rule__CountTweet__Group_3__3 : rule__CountTweet__Group_3__3__Impl rule__CountTweet__Group_3__4 ;
    public final void rule__CountTweet__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5017:1: ( rule__CountTweet__Group_3__3__Impl rule__CountTweet__Group_3__4 )
            // InternalTw.g:5018:2: rule__CountTweet__Group_3__3__Impl rule__CountTweet__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__CountTweet__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__3"


    // $ANTLR start "rule__CountTweet__Group_3__3__Impl"
    // InternalTw.g:5025:1: rule__CountTweet__Group_3__3__Impl : ( ( rule__CountTweet__Group_3_3__0 )* ) ;
    public final void rule__CountTweet__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5029:1: ( ( ( rule__CountTweet__Group_3_3__0 )* ) )
            // InternalTw.g:5030:1: ( ( rule__CountTweet__Group_3_3__0 )* )
            {
            // InternalTw.g:5030:1: ( ( rule__CountTweet__Group_3_3__0 )* )
            // InternalTw.g:5031:2: ( rule__CountTweet__Group_3_3__0 )*
            {
             before(grammarAccess.getCountTweetAccess().getGroup_3_3()); 
            // InternalTw.g:5032:2: ( rule__CountTweet__Group_3_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTw.g:5032:3: rule__CountTweet__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CountTweet__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCountTweetAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__3__Impl"


    // $ANTLR start "rule__CountTweet__Group_3__4"
    // InternalTw.g:5040:1: rule__CountTweet__Group_3__4 : rule__CountTweet__Group_3__4__Impl ;
    public final void rule__CountTweet__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5044:1: ( rule__CountTweet__Group_3__4__Impl )
            // InternalTw.g:5045:2: rule__CountTweet__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__4"


    // $ANTLR start "rule__CountTweet__Group_3__4__Impl"
    // InternalTw.g:5051:1: rule__CountTweet__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CountTweet__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5055:1: ( ( '}' ) )
            // InternalTw.g:5056:1: ( '}' )
            {
            // InternalTw.g:5056:1: ( '}' )
            // InternalTw.g:5057:2: '}'
            {
             before(grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3__4__Impl"


    // $ANTLR start "rule__CountTweet__Group_3_3__0"
    // InternalTw.g:5067:1: rule__CountTweet__Group_3_3__0 : rule__CountTweet__Group_3_3__0__Impl rule__CountTweet__Group_3_3__1 ;
    public final void rule__CountTweet__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5071:1: ( rule__CountTweet__Group_3_3__0__Impl rule__CountTweet__Group_3_3__1 )
            // InternalTw.g:5072:2: rule__CountTweet__Group_3_3__0__Impl rule__CountTweet__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__CountTweet__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_3__0"


    // $ANTLR start "rule__CountTweet__Group_3_3__0__Impl"
    // InternalTw.g:5079:1: rule__CountTweet__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CountTweet__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5083:1: ( ( ',' ) )
            // InternalTw.g:5084:1: ( ',' )
            {
            // InternalTw.g:5084:1: ( ',' )
            // InternalTw.g:5085:2: ','
            {
             before(grammarAccess.getCountTweetAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCountTweetAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_3__0__Impl"


    // $ANTLR start "rule__CountTweet__Group_3_3__1"
    // InternalTw.g:5094:1: rule__CountTweet__Group_3_3__1 : rule__CountTweet__Group_3_3__1__Impl ;
    public final void rule__CountTweet__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5098:1: ( rule__CountTweet__Group_3_3__1__Impl )
            // InternalTw.g:5099:2: rule__CountTweet__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_3__1"


    // $ANTLR start "rule__CountTweet__Group_3_3__1__Impl"
    // InternalTw.g:5105:1: rule__CountTweet__Group_3_3__1__Impl : ( ( rule__CountTweet__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__CountTweet__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5109:1: ( ( ( rule__CountTweet__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:5110:1: ( ( rule__CountTweet__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:5110:1: ( ( rule__CountTweet__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:5111:2: ( rule__CountTweet__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getCountTweetAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:5112:2: ( rule__CountTweet__ArgsAssignment_3_3_1 )
            // InternalTw.g:5112:3: rule__CountTweet__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CountTweet__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCountTweetAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__Group_3_3__1__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group__0"
    // InternalTw.g:5121:1: rule__CountVisitProfil__Group__0 : rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1 ;
    public final void rule__CountVisitProfil__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5125:1: ( rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1 )
            // InternalTw.g:5126:2: rule__CountVisitProfil__Group__0__Impl rule__CountVisitProfil__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTw.g:5133:1: rule__CountVisitProfil__Group__0__Impl : ( () ) ;
    public final void rule__CountVisitProfil__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5137:1: ( ( () ) )
            // InternalTw.g:5138:1: ( () )
            {
            // InternalTw.g:5138:1: ( () )
            // InternalTw.g:5139:2: ()
            {
             before(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilAction_0()); 
            // InternalTw.g:5140:2: ()
            // InternalTw.g:5140:3: 
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
    // InternalTw.g:5148:1: rule__CountVisitProfil__Group__1 : rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2 ;
    public final void rule__CountVisitProfil__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5152:1: ( rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2 )
            // InternalTw.g:5153:2: rule__CountVisitProfil__Group__1__Impl rule__CountVisitProfil__Group__2
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
    // InternalTw.g:5160:1: rule__CountVisitProfil__Group__1__Impl : ( 'countVisitProfil' ) ;
    public final void rule__CountVisitProfil__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5164:1: ( ( 'countVisitProfil' ) )
            // InternalTw.g:5165:1: ( 'countVisitProfil' )
            {
            // InternalTw.g:5165:1: ( 'countVisitProfil' )
            // InternalTw.g:5166:2: 'countVisitProfil'
            {
             before(grammarAccess.getCountVisitProfilAccess().getCountVisitProfilKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTw.g:5175:1: rule__CountVisitProfil__Group__2 : rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3 ;
    public final void rule__CountVisitProfil__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5179:1: ( rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3 )
            // InternalTw.g:5180:2: rule__CountVisitProfil__Group__2__Impl rule__CountVisitProfil__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:5187:1: rule__CountVisitProfil__Group__2__Impl : ( '{' ) ;
    public final void rule__CountVisitProfil__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5191:1: ( ( '{' ) )
            // InternalTw.g:5192:1: ( '{' )
            {
            // InternalTw.g:5192:1: ( '{' )
            // InternalTw.g:5193:2: '{'
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
    // InternalTw.g:5202:1: rule__CountVisitProfil__Group__3 : rule__CountVisitProfil__Group__3__Impl rule__CountVisitProfil__Group__4 ;
    public final void rule__CountVisitProfil__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5206:1: ( rule__CountVisitProfil__Group__3__Impl rule__CountVisitProfil__Group__4 )
            // InternalTw.g:5207:2: rule__CountVisitProfil__Group__3__Impl rule__CountVisitProfil__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:5214:1: rule__CountVisitProfil__Group__3__Impl : ( ( rule__CountVisitProfil__Group_3__0 )? ) ;
    public final void rule__CountVisitProfil__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5218:1: ( ( ( rule__CountVisitProfil__Group_3__0 )? ) )
            // InternalTw.g:5219:1: ( ( rule__CountVisitProfil__Group_3__0 )? )
            {
            // InternalTw.g:5219:1: ( ( rule__CountVisitProfil__Group_3__0 )? )
            // InternalTw.g:5220:2: ( rule__CountVisitProfil__Group_3__0 )?
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup_3()); 
            // InternalTw.g:5221:2: ( rule__CountVisitProfil__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTw.g:5221:3: rule__CountVisitProfil__Group_3__0
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
    // InternalTw.g:5229:1: rule__CountVisitProfil__Group__4 : rule__CountVisitProfil__Group__4__Impl ;
    public final void rule__CountVisitProfil__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5233:1: ( rule__CountVisitProfil__Group__4__Impl )
            // InternalTw.g:5234:2: rule__CountVisitProfil__Group__4__Impl
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
    // InternalTw.g:5240:1: rule__CountVisitProfil__Group__4__Impl : ( '}' ) ;
    public final void rule__CountVisitProfil__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5244:1: ( ( '}' ) )
            // InternalTw.g:5245:1: ( '}' )
            {
            // InternalTw.g:5245:1: ( '}' )
            // InternalTw.g:5246:2: '}'
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
    // InternalTw.g:5256:1: rule__CountVisitProfil__Group_3__0 : rule__CountVisitProfil__Group_3__0__Impl rule__CountVisitProfil__Group_3__1 ;
    public final void rule__CountVisitProfil__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5260:1: ( rule__CountVisitProfil__Group_3__0__Impl rule__CountVisitProfil__Group_3__1 )
            // InternalTw.g:5261:2: rule__CountVisitProfil__Group_3__0__Impl rule__CountVisitProfil__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:5268:1: rule__CountVisitProfil__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__CountVisitProfil__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5272:1: ( ( 'args' ) )
            // InternalTw.g:5273:1: ( 'args' )
            {
            // InternalTw.g:5273:1: ( 'args' )
            // InternalTw.g:5274:2: 'args'
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:5283:1: rule__CountVisitProfil__Group_3__1 : rule__CountVisitProfil__Group_3__1__Impl rule__CountVisitProfil__Group_3__2 ;
    public final void rule__CountVisitProfil__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5287:1: ( rule__CountVisitProfil__Group_3__1__Impl rule__CountVisitProfil__Group_3__2 )
            // InternalTw.g:5288:2: rule__CountVisitProfil__Group_3__1__Impl rule__CountVisitProfil__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__CountVisitProfil__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:5295:1: rule__CountVisitProfil__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CountVisitProfil__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5299:1: ( ( '{' ) )
            // InternalTw.g:5300:1: ( '{' )
            {
            // InternalTw.g:5300:1: ( '{' )
            // InternalTw.g:5301:2: '{'
            {
             before(grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CountVisitProfil__Group_3__2"
    // InternalTw.g:5310:1: rule__CountVisitProfil__Group_3__2 : rule__CountVisitProfil__Group_3__2__Impl rule__CountVisitProfil__Group_3__3 ;
    public final void rule__CountVisitProfil__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5314:1: ( rule__CountVisitProfil__Group_3__2__Impl rule__CountVisitProfil__Group_3__3 )
            // InternalTw.g:5315:2: rule__CountVisitProfil__Group_3__2__Impl rule__CountVisitProfil__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__CountVisitProfil__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__2"


    // $ANTLR start "rule__CountVisitProfil__Group_3__2__Impl"
    // InternalTw.g:5322:1: rule__CountVisitProfil__Group_3__2__Impl : ( ( rule__CountVisitProfil__ArgsAssignment_3_2 ) ) ;
    public final void rule__CountVisitProfil__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5326:1: ( ( ( rule__CountVisitProfil__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:5327:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:5327:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_2 ) )
            // InternalTw.g:5328:2: ( rule__CountVisitProfil__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:5329:2: ( rule__CountVisitProfil__ArgsAssignment_3_2 )
            // InternalTw.g:5329:3: rule__CountVisitProfil__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__2__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3__3"
    // InternalTw.g:5337:1: rule__CountVisitProfil__Group_3__3 : rule__CountVisitProfil__Group_3__3__Impl rule__CountVisitProfil__Group_3__4 ;
    public final void rule__CountVisitProfil__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5341:1: ( rule__CountVisitProfil__Group_3__3__Impl rule__CountVisitProfil__Group_3__4 )
            // InternalTw.g:5342:2: rule__CountVisitProfil__Group_3__3__Impl rule__CountVisitProfil__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__CountVisitProfil__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__3"


    // $ANTLR start "rule__CountVisitProfil__Group_3__3__Impl"
    // InternalTw.g:5349:1: rule__CountVisitProfil__Group_3__3__Impl : ( ( rule__CountVisitProfil__Group_3_3__0 )* ) ;
    public final void rule__CountVisitProfil__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5353:1: ( ( ( rule__CountVisitProfil__Group_3_3__0 )* ) )
            // InternalTw.g:5354:1: ( ( rule__CountVisitProfil__Group_3_3__0 )* )
            {
            // InternalTw.g:5354:1: ( ( rule__CountVisitProfil__Group_3_3__0 )* )
            // InternalTw.g:5355:2: ( rule__CountVisitProfil__Group_3_3__0 )*
            {
             before(grammarAccess.getCountVisitProfilAccess().getGroup_3_3()); 
            // InternalTw.g:5356:2: ( rule__CountVisitProfil__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTw.g:5356:3: rule__CountVisitProfil__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CountVisitProfil__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCountVisitProfilAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__3__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3__4"
    // InternalTw.g:5364:1: rule__CountVisitProfil__Group_3__4 : rule__CountVisitProfil__Group_3__4__Impl ;
    public final void rule__CountVisitProfil__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5368:1: ( rule__CountVisitProfil__Group_3__4__Impl )
            // InternalTw.g:5369:2: rule__CountVisitProfil__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__4"


    // $ANTLR start "rule__CountVisitProfil__Group_3__4__Impl"
    // InternalTw.g:5375:1: rule__CountVisitProfil__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CountVisitProfil__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5379:1: ( ( '}' ) )
            // InternalTw.g:5380:1: ( '}' )
            {
            // InternalTw.g:5380:1: ( '}' )
            // InternalTw.g:5381:2: '}'
            {
             before(grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3__4__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3_3__0"
    // InternalTw.g:5391:1: rule__CountVisitProfil__Group_3_3__0 : rule__CountVisitProfil__Group_3_3__0__Impl rule__CountVisitProfil__Group_3_3__1 ;
    public final void rule__CountVisitProfil__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5395:1: ( rule__CountVisitProfil__Group_3_3__0__Impl rule__CountVisitProfil__Group_3_3__1 )
            // InternalTw.g:5396:2: rule__CountVisitProfil__Group_3_3__0__Impl rule__CountVisitProfil__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__CountVisitProfil__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_3__0"


    // $ANTLR start "rule__CountVisitProfil__Group_3_3__0__Impl"
    // InternalTw.g:5403:1: rule__CountVisitProfil__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CountVisitProfil__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5407:1: ( ( ',' ) )
            // InternalTw.g:5408:1: ( ',' )
            {
            // InternalTw.g:5408:1: ( ',' )
            // InternalTw.g:5409:2: ','
            {
             before(grammarAccess.getCountVisitProfilAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCountVisitProfilAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_3__0__Impl"


    // $ANTLR start "rule__CountVisitProfil__Group_3_3__1"
    // InternalTw.g:5418:1: rule__CountVisitProfil__Group_3_3__1 : rule__CountVisitProfil__Group_3_3__1__Impl ;
    public final void rule__CountVisitProfil__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5422:1: ( rule__CountVisitProfil__Group_3_3__1__Impl )
            // InternalTw.g:5423:2: rule__CountVisitProfil__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_3__1"


    // $ANTLR start "rule__CountVisitProfil__Group_3_3__1__Impl"
    // InternalTw.g:5429:1: rule__CountVisitProfil__Group_3_3__1__Impl : ( ( rule__CountVisitProfil__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__CountVisitProfil__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5433:1: ( ( ( rule__CountVisitProfil__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:5434:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:5434:1: ( ( rule__CountVisitProfil__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:5435:2: ( rule__CountVisitProfil__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:5436:2: ( rule__CountVisitProfil__ArgsAssignment_3_3_1 )
            // InternalTw.g:5436:3: rule__CountVisitProfil__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CountVisitProfil__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCountVisitProfilAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__Group_3_3__1__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group__0"
    // InternalTw.g:5445:1: rule__CroissanceAbonne__Group__0 : rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1 ;
    public final void rule__CroissanceAbonne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5449:1: ( rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1 )
            // InternalTw.g:5450:2: rule__CroissanceAbonne__Group__0__Impl rule__CroissanceAbonne__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTw.g:5457:1: rule__CroissanceAbonne__Group__0__Impl : ( () ) ;
    public final void rule__CroissanceAbonne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5461:1: ( ( () ) )
            // InternalTw.g:5462:1: ( () )
            {
            // InternalTw.g:5462:1: ( () )
            // InternalTw.g:5463:2: ()
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneAction_0()); 
            // InternalTw.g:5464:2: ()
            // InternalTw.g:5464:3: 
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
    // InternalTw.g:5472:1: rule__CroissanceAbonne__Group__1 : rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2 ;
    public final void rule__CroissanceAbonne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5476:1: ( rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2 )
            // InternalTw.g:5477:2: rule__CroissanceAbonne__Group__1__Impl rule__CroissanceAbonne__Group__2
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
    // InternalTw.g:5484:1: rule__CroissanceAbonne__Group__1__Impl : ( 'CroissanceAbonne' ) ;
    public final void rule__CroissanceAbonne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5488:1: ( ( 'CroissanceAbonne' ) )
            // InternalTw.g:5489:1: ( 'CroissanceAbonne' )
            {
            // InternalTw.g:5489:1: ( 'CroissanceAbonne' )
            // InternalTw.g:5490:2: 'CroissanceAbonne'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCroissanceAbonneKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTw.g:5499:1: rule__CroissanceAbonne__Group__2 : rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3 ;
    public final void rule__CroissanceAbonne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5503:1: ( rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3 )
            // InternalTw.g:5504:2: rule__CroissanceAbonne__Group__2__Impl rule__CroissanceAbonne__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:5511:1: rule__CroissanceAbonne__Group__2__Impl : ( '{' ) ;
    public final void rule__CroissanceAbonne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5515:1: ( ( '{' ) )
            // InternalTw.g:5516:1: ( '{' )
            {
            // InternalTw.g:5516:1: ( '{' )
            // InternalTw.g:5517:2: '{'
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
    // InternalTw.g:5526:1: rule__CroissanceAbonne__Group__3 : rule__CroissanceAbonne__Group__3__Impl rule__CroissanceAbonne__Group__4 ;
    public final void rule__CroissanceAbonne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5530:1: ( rule__CroissanceAbonne__Group__3__Impl rule__CroissanceAbonne__Group__4 )
            // InternalTw.g:5531:2: rule__CroissanceAbonne__Group__3__Impl rule__CroissanceAbonne__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:5538:1: rule__CroissanceAbonne__Group__3__Impl : ( ( rule__CroissanceAbonne__Group_3__0 )? ) ;
    public final void rule__CroissanceAbonne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5542:1: ( ( ( rule__CroissanceAbonne__Group_3__0 )? ) )
            // InternalTw.g:5543:1: ( ( rule__CroissanceAbonne__Group_3__0 )? )
            {
            // InternalTw.g:5543:1: ( ( rule__CroissanceAbonne__Group_3__0 )? )
            // InternalTw.g:5544:2: ( rule__CroissanceAbonne__Group_3__0 )?
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup_3()); 
            // InternalTw.g:5545:2: ( rule__CroissanceAbonne__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTw.g:5545:3: rule__CroissanceAbonne__Group_3__0
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
    // InternalTw.g:5553:1: rule__CroissanceAbonne__Group__4 : rule__CroissanceAbonne__Group__4__Impl ;
    public final void rule__CroissanceAbonne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5557:1: ( rule__CroissanceAbonne__Group__4__Impl )
            // InternalTw.g:5558:2: rule__CroissanceAbonne__Group__4__Impl
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
    // InternalTw.g:5564:1: rule__CroissanceAbonne__Group__4__Impl : ( '}' ) ;
    public final void rule__CroissanceAbonne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5568:1: ( ( '}' ) )
            // InternalTw.g:5569:1: ( '}' )
            {
            // InternalTw.g:5569:1: ( '}' )
            // InternalTw.g:5570:2: '}'
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
    // InternalTw.g:5580:1: rule__CroissanceAbonne__Group_3__0 : rule__CroissanceAbonne__Group_3__0__Impl rule__CroissanceAbonne__Group_3__1 ;
    public final void rule__CroissanceAbonne__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5584:1: ( rule__CroissanceAbonne__Group_3__0__Impl rule__CroissanceAbonne__Group_3__1 )
            // InternalTw.g:5585:2: rule__CroissanceAbonne__Group_3__0__Impl rule__CroissanceAbonne__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:5592:1: rule__CroissanceAbonne__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__CroissanceAbonne__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5596:1: ( ( 'args' ) )
            // InternalTw.g:5597:1: ( 'args' )
            {
            // InternalTw.g:5597:1: ( 'args' )
            // InternalTw.g:5598:2: 'args'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:5607:1: rule__CroissanceAbonne__Group_3__1 : rule__CroissanceAbonne__Group_3__1__Impl rule__CroissanceAbonne__Group_3__2 ;
    public final void rule__CroissanceAbonne__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5611:1: ( rule__CroissanceAbonne__Group_3__1__Impl rule__CroissanceAbonne__Group_3__2 )
            // InternalTw.g:5612:2: rule__CroissanceAbonne__Group_3__1__Impl rule__CroissanceAbonne__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__CroissanceAbonne__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:5619:1: rule__CroissanceAbonne__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CroissanceAbonne__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5623:1: ( ( '{' ) )
            // InternalTw.g:5624:1: ( '{' )
            {
            // InternalTw.g:5624:1: ( '{' )
            // InternalTw.g:5625:2: '{'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CroissanceAbonne__Group_3__2"
    // InternalTw.g:5634:1: rule__CroissanceAbonne__Group_3__2 : rule__CroissanceAbonne__Group_3__2__Impl rule__CroissanceAbonne__Group_3__3 ;
    public final void rule__CroissanceAbonne__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5638:1: ( rule__CroissanceAbonne__Group_3__2__Impl rule__CroissanceAbonne__Group_3__3 )
            // InternalTw.g:5639:2: rule__CroissanceAbonne__Group_3__2__Impl rule__CroissanceAbonne__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__CroissanceAbonne__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__2"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__2__Impl"
    // InternalTw.g:5646:1: rule__CroissanceAbonne__Group_3__2__Impl : ( ( rule__CroissanceAbonne__ArgsAssignment_3_2 ) ) ;
    public final void rule__CroissanceAbonne__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5650:1: ( ( ( rule__CroissanceAbonne__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:5651:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:5651:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_2 ) )
            // InternalTw.g:5652:2: ( rule__CroissanceAbonne__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:5653:2: ( rule__CroissanceAbonne__ArgsAssignment_3_2 )
            // InternalTw.g:5653:3: rule__CroissanceAbonne__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__2__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__3"
    // InternalTw.g:5661:1: rule__CroissanceAbonne__Group_3__3 : rule__CroissanceAbonne__Group_3__3__Impl rule__CroissanceAbonne__Group_3__4 ;
    public final void rule__CroissanceAbonne__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5665:1: ( rule__CroissanceAbonne__Group_3__3__Impl rule__CroissanceAbonne__Group_3__4 )
            // InternalTw.g:5666:2: rule__CroissanceAbonne__Group_3__3__Impl rule__CroissanceAbonne__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__CroissanceAbonne__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__3"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__3__Impl"
    // InternalTw.g:5673:1: rule__CroissanceAbonne__Group_3__3__Impl : ( ( rule__CroissanceAbonne__Group_3_3__0 )* ) ;
    public final void rule__CroissanceAbonne__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5677:1: ( ( ( rule__CroissanceAbonne__Group_3_3__0 )* ) )
            // InternalTw.g:5678:1: ( ( rule__CroissanceAbonne__Group_3_3__0 )* )
            {
            // InternalTw.g:5678:1: ( ( rule__CroissanceAbonne__Group_3_3__0 )* )
            // InternalTw.g:5679:2: ( rule__CroissanceAbonne__Group_3_3__0 )*
            {
             before(grammarAccess.getCroissanceAbonneAccess().getGroup_3_3()); 
            // InternalTw.g:5680:2: ( rule__CroissanceAbonne__Group_3_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTw.g:5680:3: rule__CroissanceAbonne__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CroissanceAbonne__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCroissanceAbonneAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__3__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__4"
    // InternalTw.g:5688:1: rule__CroissanceAbonne__Group_3__4 : rule__CroissanceAbonne__Group_3__4__Impl ;
    public final void rule__CroissanceAbonne__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5692:1: ( rule__CroissanceAbonne__Group_3__4__Impl )
            // InternalTw.g:5693:2: rule__CroissanceAbonne__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__4"


    // $ANTLR start "rule__CroissanceAbonne__Group_3__4__Impl"
    // InternalTw.g:5699:1: rule__CroissanceAbonne__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CroissanceAbonne__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5703:1: ( ( '}' ) )
            // InternalTw.g:5704:1: ( '}' )
            {
            // InternalTw.g:5704:1: ( '}' )
            // InternalTw.g:5705:2: '}'
            {
             before(grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3__4__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_3__0"
    // InternalTw.g:5715:1: rule__CroissanceAbonne__Group_3_3__0 : rule__CroissanceAbonne__Group_3_3__0__Impl rule__CroissanceAbonne__Group_3_3__1 ;
    public final void rule__CroissanceAbonne__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5719:1: ( rule__CroissanceAbonne__Group_3_3__0__Impl rule__CroissanceAbonne__Group_3_3__1 )
            // InternalTw.g:5720:2: rule__CroissanceAbonne__Group_3_3__0__Impl rule__CroissanceAbonne__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__CroissanceAbonne__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_3__0"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_3__0__Impl"
    // InternalTw.g:5727:1: rule__CroissanceAbonne__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CroissanceAbonne__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5731:1: ( ( ',' ) )
            // InternalTw.g:5732:1: ( ',' )
            {
            // InternalTw.g:5732:1: ( ',' )
            // InternalTw.g:5733:2: ','
            {
             before(grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCroissanceAbonneAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_3__0__Impl"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_3__1"
    // InternalTw.g:5742:1: rule__CroissanceAbonne__Group_3_3__1 : rule__CroissanceAbonne__Group_3_3__1__Impl ;
    public final void rule__CroissanceAbonne__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5746:1: ( rule__CroissanceAbonne__Group_3_3__1__Impl )
            // InternalTw.g:5747:2: rule__CroissanceAbonne__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_3__1"


    // $ANTLR start "rule__CroissanceAbonne__Group_3_3__1__Impl"
    // InternalTw.g:5753:1: rule__CroissanceAbonne__Group_3_3__1__Impl : ( ( rule__CroissanceAbonne__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__CroissanceAbonne__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5757:1: ( ( ( rule__CroissanceAbonne__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:5758:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:5758:1: ( ( rule__CroissanceAbonne__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:5759:2: ( rule__CroissanceAbonne__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:5760:2: ( rule__CroissanceAbonne__ArgsAssignment_3_3_1 )
            // InternalTw.g:5760:3: rule__CroissanceAbonne__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CroissanceAbonne__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCroissanceAbonneAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__Group_3_3__1__Impl"


    // $ANTLR start "rule__MoyFollowers__Group__0"
    // InternalTw.g:5769:1: rule__MoyFollowers__Group__0 : rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1 ;
    public final void rule__MoyFollowers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5773:1: ( rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1 )
            // InternalTw.g:5774:2: rule__MoyFollowers__Group__0__Impl rule__MoyFollowers__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTw.g:5781:1: rule__MoyFollowers__Group__0__Impl : ( () ) ;
    public final void rule__MoyFollowers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5785:1: ( ( () ) )
            // InternalTw.g:5786:1: ( () )
            {
            // InternalTw.g:5786:1: ( () )
            // InternalTw.g:5787:2: ()
            {
             before(grammarAccess.getMoyFollowersAccess().getMoyFollowersAction_0()); 
            // InternalTw.g:5788:2: ()
            // InternalTw.g:5788:3: 
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
    // InternalTw.g:5796:1: rule__MoyFollowers__Group__1 : rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2 ;
    public final void rule__MoyFollowers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5800:1: ( rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2 )
            // InternalTw.g:5801:2: rule__MoyFollowers__Group__1__Impl rule__MoyFollowers__Group__2
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
    // InternalTw.g:5808:1: rule__MoyFollowers__Group__1__Impl : ( 'moyFollowers' ) ;
    public final void rule__MoyFollowers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5812:1: ( ( 'moyFollowers' ) )
            // InternalTw.g:5813:1: ( 'moyFollowers' )
            {
            // InternalTw.g:5813:1: ( 'moyFollowers' )
            // InternalTw.g:5814:2: 'moyFollowers'
            {
             before(grammarAccess.getMoyFollowersAccess().getMoyFollowersKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTw.g:5823:1: rule__MoyFollowers__Group__2 : rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3 ;
    public final void rule__MoyFollowers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5827:1: ( rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3 )
            // InternalTw.g:5828:2: rule__MoyFollowers__Group__2__Impl rule__MoyFollowers__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:5835:1: rule__MoyFollowers__Group__2__Impl : ( '{' ) ;
    public final void rule__MoyFollowers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5839:1: ( ( '{' ) )
            // InternalTw.g:5840:1: ( '{' )
            {
            // InternalTw.g:5840:1: ( '{' )
            // InternalTw.g:5841:2: '{'
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
    // InternalTw.g:5850:1: rule__MoyFollowers__Group__3 : rule__MoyFollowers__Group__3__Impl rule__MoyFollowers__Group__4 ;
    public final void rule__MoyFollowers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5854:1: ( rule__MoyFollowers__Group__3__Impl rule__MoyFollowers__Group__4 )
            // InternalTw.g:5855:2: rule__MoyFollowers__Group__3__Impl rule__MoyFollowers__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:5862:1: rule__MoyFollowers__Group__3__Impl : ( ( rule__MoyFollowers__Group_3__0 )? ) ;
    public final void rule__MoyFollowers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5866:1: ( ( ( rule__MoyFollowers__Group_3__0 )? ) )
            // InternalTw.g:5867:1: ( ( rule__MoyFollowers__Group_3__0 )? )
            {
            // InternalTw.g:5867:1: ( ( rule__MoyFollowers__Group_3__0 )? )
            // InternalTw.g:5868:2: ( rule__MoyFollowers__Group_3__0 )?
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup_3()); 
            // InternalTw.g:5869:2: ( rule__MoyFollowers__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTw.g:5869:3: rule__MoyFollowers__Group_3__0
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
    // InternalTw.g:5877:1: rule__MoyFollowers__Group__4 : rule__MoyFollowers__Group__4__Impl ;
    public final void rule__MoyFollowers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5881:1: ( rule__MoyFollowers__Group__4__Impl )
            // InternalTw.g:5882:2: rule__MoyFollowers__Group__4__Impl
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
    // InternalTw.g:5888:1: rule__MoyFollowers__Group__4__Impl : ( '}' ) ;
    public final void rule__MoyFollowers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5892:1: ( ( '}' ) )
            // InternalTw.g:5893:1: ( '}' )
            {
            // InternalTw.g:5893:1: ( '}' )
            // InternalTw.g:5894:2: '}'
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
    // InternalTw.g:5904:1: rule__MoyFollowers__Group_3__0 : rule__MoyFollowers__Group_3__0__Impl rule__MoyFollowers__Group_3__1 ;
    public final void rule__MoyFollowers__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5908:1: ( rule__MoyFollowers__Group_3__0__Impl rule__MoyFollowers__Group_3__1 )
            // InternalTw.g:5909:2: rule__MoyFollowers__Group_3__0__Impl rule__MoyFollowers__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:5916:1: rule__MoyFollowers__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__MoyFollowers__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5920:1: ( ( 'args' ) )
            // InternalTw.g:5921:1: ( 'args' )
            {
            // InternalTw.g:5921:1: ( 'args' )
            // InternalTw.g:5922:2: 'args'
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:5931:1: rule__MoyFollowers__Group_3__1 : rule__MoyFollowers__Group_3__1__Impl rule__MoyFollowers__Group_3__2 ;
    public final void rule__MoyFollowers__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5935:1: ( rule__MoyFollowers__Group_3__1__Impl rule__MoyFollowers__Group_3__2 )
            // InternalTw.g:5936:2: rule__MoyFollowers__Group_3__1__Impl rule__MoyFollowers__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__MoyFollowers__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:5943:1: rule__MoyFollowers__Group_3__1__Impl : ( '{' ) ;
    public final void rule__MoyFollowers__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5947:1: ( ( '{' ) )
            // InternalTw.g:5948:1: ( '{' )
            {
            // InternalTw.g:5948:1: ( '{' )
            // InternalTw.g:5949:2: '{'
            {
             before(grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MoyFollowers__Group_3__2"
    // InternalTw.g:5958:1: rule__MoyFollowers__Group_3__2 : rule__MoyFollowers__Group_3__2__Impl rule__MoyFollowers__Group_3__3 ;
    public final void rule__MoyFollowers__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5962:1: ( rule__MoyFollowers__Group_3__2__Impl rule__MoyFollowers__Group_3__3 )
            // InternalTw.g:5963:2: rule__MoyFollowers__Group_3__2__Impl rule__MoyFollowers__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__MoyFollowers__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__2"


    // $ANTLR start "rule__MoyFollowers__Group_3__2__Impl"
    // InternalTw.g:5970:1: rule__MoyFollowers__Group_3__2__Impl : ( ( rule__MoyFollowers__ArgsAssignment_3_2 ) ) ;
    public final void rule__MoyFollowers__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5974:1: ( ( ( rule__MoyFollowers__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:5975:1: ( ( rule__MoyFollowers__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:5975:1: ( ( rule__MoyFollowers__ArgsAssignment_3_2 ) )
            // InternalTw.g:5976:2: ( rule__MoyFollowers__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:5977:2: ( rule__MoyFollowers__ArgsAssignment_3_2 )
            // InternalTw.g:5977:3: rule__MoyFollowers__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__2__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3__3"
    // InternalTw.g:5985:1: rule__MoyFollowers__Group_3__3 : rule__MoyFollowers__Group_3__3__Impl rule__MoyFollowers__Group_3__4 ;
    public final void rule__MoyFollowers__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:5989:1: ( rule__MoyFollowers__Group_3__3__Impl rule__MoyFollowers__Group_3__4 )
            // InternalTw.g:5990:2: rule__MoyFollowers__Group_3__3__Impl rule__MoyFollowers__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__MoyFollowers__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__3"


    // $ANTLR start "rule__MoyFollowers__Group_3__3__Impl"
    // InternalTw.g:5997:1: rule__MoyFollowers__Group_3__3__Impl : ( ( rule__MoyFollowers__Group_3_3__0 )* ) ;
    public final void rule__MoyFollowers__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6001:1: ( ( ( rule__MoyFollowers__Group_3_3__0 )* ) )
            // InternalTw.g:6002:1: ( ( rule__MoyFollowers__Group_3_3__0 )* )
            {
            // InternalTw.g:6002:1: ( ( rule__MoyFollowers__Group_3_3__0 )* )
            // InternalTw.g:6003:2: ( rule__MoyFollowers__Group_3_3__0 )*
            {
             before(grammarAccess.getMoyFollowersAccess().getGroup_3_3()); 
            // InternalTw.g:6004:2: ( rule__MoyFollowers__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTw.g:6004:3: rule__MoyFollowers__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MoyFollowers__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMoyFollowersAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__3__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3__4"
    // InternalTw.g:6012:1: rule__MoyFollowers__Group_3__4 : rule__MoyFollowers__Group_3__4__Impl ;
    public final void rule__MoyFollowers__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6016:1: ( rule__MoyFollowers__Group_3__4__Impl )
            // InternalTw.g:6017:2: rule__MoyFollowers__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__4"


    // $ANTLR start "rule__MoyFollowers__Group_3__4__Impl"
    // InternalTw.g:6023:1: rule__MoyFollowers__Group_3__4__Impl : ( '}' ) ;
    public final void rule__MoyFollowers__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6027:1: ( ( '}' ) )
            // InternalTw.g:6028:1: ( '}' )
            {
            // InternalTw.g:6028:1: ( '}' )
            // InternalTw.g:6029:2: '}'
            {
             before(grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3__4__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3_3__0"
    // InternalTw.g:6039:1: rule__MoyFollowers__Group_3_3__0 : rule__MoyFollowers__Group_3_3__0__Impl rule__MoyFollowers__Group_3_3__1 ;
    public final void rule__MoyFollowers__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6043:1: ( rule__MoyFollowers__Group_3_3__0__Impl rule__MoyFollowers__Group_3_3__1 )
            // InternalTw.g:6044:2: rule__MoyFollowers__Group_3_3__0__Impl rule__MoyFollowers__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__MoyFollowers__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_3__0"


    // $ANTLR start "rule__MoyFollowers__Group_3_3__0__Impl"
    // InternalTw.g:6051:1: rule__MoyFollowers__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__MoyFollowers__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6055:1: ( ( ',' ) )
            // InternalTw.g:6056:1: ( ',' )
            {
            // InternalTw.g:6056:1: ( ',' )
            // InternalTw.g:6057:2: ','
            {
             before(grammarAccess.getMoyFollowersAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoyFollowersAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_3__0__Impl"


    // $ANTLR start "rule__MoyFollowers__Group_3_3__1"
    // InternalTw.g:6066:1: rule__MoyFollowers__Group_3_3__1 : rule__MoyFollowers__Group_3_3__1__Impl ;
    public final void rule__MoyFollowers__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6070:1: ( rule__MoyFollowers__Group_3_3__1__Impl )
            // InternalTw.g:6071:2: rule__MoyFollowers__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_3__1"


    // $ANTLR start "rule__MoyFollowers__Group_3_3__1__Impl"
    // InternalTw.g:6077:1: rule__MoyFollowers__Group_3_3__1__Impl : ( ( rule__MoyFollowers__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__MoyFollowers__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6081:1: ( ( ( rule__MoyFollowers__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:6082:1: ( ( rule__MoyFollowers__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:6082:1: ( ( rule__MoyFollowers__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:6083:2: ( rule__MoyFollowers__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:6084:2: ( rule__MoyFollowers__ArgsAssignment_3_3_1 )
            // InternalTw.g:6084:3: rule__MoyFollowers__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoyFollowers__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoyFollowersAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__Group_3_3__1__Impl"


    // $ANTLR start "rule__MoyFavorited__Group__0"
    // InternalTw.g:6093:1: rule__MoyFavorited__Group__0 : rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1 ;
    public final void rule__MoyFavorited__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6097:1: ( rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1 )
            // InternalTw.g:6098:2: rule__MoyFavorited__Group__0__Impl rule__MoyFavorited__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTw.g:6105:1: rule__MoyFavorited__Group__0__Impl : ( () ) ;
    public final void rule__MoyFavorited__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6109:1: ( ( () ) )
            // InternalTw.g:6110:1: ( () )
            {
            // InternalTw.g:6110:1: ( () )
            // InternalTw.g:6111:2: ()
            {
             before(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedAction_0()); 
            // InternalTw.g:6112:2: ()
            // InternalTw.g:6112:3: 
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
    // InternalTw.g:6120:1: rule__MoyFavorited__Group__1 : rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2 ;
    public final void rule__MoyFavorited__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6124:1: ( rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2 )
            // InternalTw.g:6125:2: rule__MoyFavorited__Group__1__Impl rule__MoyFavorited__Group__2
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
    // InternalTw.g:6132:1: rule__MoyFavorited__Group__1__Impl : ( 'moyFavorited' ) ;
    public final void rule__MoyFavorited__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6136:1: ( ( 'moyFavorited' ) )
            // InternalTw.g:6137:1: ( 'moyFavorited' )
            {
            // InternalTw.g:6137:1: ( 'moyFavorited' )
            // InternalTw.g:6138:2: 'moyFavorited'
            {
             before(grammarAccess.getMoyFavoritedAccess().getMoyFavoritedKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTw.g:6147:1: rule__MoyFavorited__Group__2 : rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3 ;
    public final void rule__MoyFavorited__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6151:1: ( rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3 )
            // InternalTw.g:6152:2: rule__MoyFavorited__Group__2__Impl rule__MoyFavorited__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:6159:1: rule__MoyFavorited__Group__2__Impl : ( '{' ) ;
    public final void rule__MoyFavorited__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6163:1: ( ( '{' ) )
            // InternalTw.g:6164:1: ( '{' )
            {
            // InternalTw.g:6164:1: ( '{' )
            // InternalTw.g:6165:2: '{'
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
    // InternalTw.g:6174:1: rule__MoyFavorited__Group__3 : rule__MoyFavorited__Group__3__Impl rule__MoyFavorited__Group__4 ;
    public final void rule__MoyFavorited__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6178:1: ( rule__MoyFavorited__Group__3__Impl rule__MoyFavorited__Group__4 )
            // InternalTw.g:6179:2: rule__MoyFavorited__Group__3__Impl rule__MoyFavorited__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTw.g:6186:1: rule__MoyFavorited__Group__3__Impl : ( ( rule__MoyFavorited__Group_3__0 )? ) ;
    public final void rule__MoyFavorited__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6190:1: ( ( ( rule__MoyFavorited__Group_3__0 )? ) )
            // InternalTw.g:6191:1: ( ( rule__MoyFavorited__Group_3__0 )? )
            {
            // InternalTw.g:6191:1: ( ( rule__MoyFavorited__Group_3__0 )? )
            // InternalTw.g:6192:2: ( rule__MoyFavorited__Group_3__0 )?
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup_3()); 
            // InternalTw.g:6193:2: ( rule__MoyFavorited__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTw.g:6193:3: rule__MoyFavorited__Group_3__0
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
    // InternalTw.g:6201:1: rule__MoyFavorited__Group__4 : rule__MoyFavorited__Group__4__Impl ;
    public final void rule__MoyFavorited__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6205:1: ( rule__MoyFavorited__Group__4__Impl )
            // InternalTw.g:6206:2: rule__MoyFavorited__Group__4__Impl
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
    // InternalTw.g:6212:1: rule__MoyFavorited__Group__4__Impl : ( '}' ) ;
    public final void rule__MoyFavorited__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6216:1: ( ( '}' ) )
            // InternalTw.g:6217:1: ( '}' )
            {
            // InternalTw.g:6217:1: ( '}' )
            // InternalTw.g:6218:2: '}'
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
    // InternalTw.g:6228:1: rule__MoyFavorited__Group_3__0 : rule__MoyFavorited__Group_3__0__Impl rule__MoyFavorited__Group_3__1 ;
    public final void rule__MoyFavorited__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6232:1: ( rule__MoyFavorited__Group_3__0__Impl rule__MoyFavorited__Group_3__1 )
            // InternalTw.g:6233:2: rule__MoyFavorited__Group_3__0__Impl rule__MoyFavorited__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTw.g:6240:1: rule__MoyFavorited__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__MoyFavorited__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6244:1: ( ( 'args' ) )
            // InternalTw.g:6245:1: ( 'args' )
            {
            // InternalTw.g:6245:1: ( 'args' )
            // InternalTw.g:6246:2: 'args'
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getArgsKeyword_3_0()); 

            }


            }

        }
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
    // InternalTw.g:6255:1: rule__MoyFavorited__Group_3__1 : rule__MoyFavorited__Group_3__1__Impl rule__MoyFavorited__Group_3__2 ;
    public final void rule__MoyFavorited__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6259:1: ( rule__MoyFavorited__Group_3__1__Impl rule__MoyFavorited__Group_3__2 )
            // InternalTw.g:6260:2: rule__MoyFavorited__Group_3__1__Impl rule__MoyFavorited__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__MoyFavorited__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalTw.g:6267:1: rule__MoyFavorited__Group_3__1__Impl : ( '{' ) ;
    public final void rule__MoyFavorited__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6271:1: ( ( '{' ) )
            // InternalTw.g:6272:1: ( '{' )
            {
            // InternalTw.g:6272:1: ( '{' )
            // InternalTw.g:6273:2: '{'
            {
             before(grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MoyFavorited__Group_3__2"
    // InternalTw.g:6282:1: rule__MoyFavorited__Group_3__2 : rule__MoyFavorited__Group_3__2__Impl rule__MoyFavorited__Group_3__3 ;
    public final void rule__MoyFavorited__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6286:1: ( rule__MoyFavorited__Group_3__2__Impl rule__MoyFavorited__Group_3__3 )
            // InternalTw.g:6287:2: rule__MoyFavorited__Group_3__2__Impl rule__MoyFavorited__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__MoyFavorited__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__2"


    // $ANTLR start "rule__MoyFavorited__Group_3__2__Impl"
    // InternalTw.g:6294:1: rule__MoyFavorited__Group_3__2__Impl : ( ( rule__MoyFavorited__ArgsAssignment_3_2 ) ) ;
    public final void rule__MoyFavorited__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6298:1: ( ( ( rule__MoyFavorited__ArgsAssignment_3_2 ) ) )
            // InternalTw.g:6299:1: ( ( rule__MoyFavorited__ArgsAssignment_3_2 ) )
            {
            // InternalTw.g:6299:1: ( ( rule__MoyFavorited__ArgsAssignment_3_2 ) )
            // InternalTw.g:6300:2: ( rule__MoyFavorited__ArgsAssignment_3_2 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_2()); 
            // InternalTw.g:6301:2: ( rule__MoyFavorited__ArgsAssignment_3_2 )
            // InternalTw.g:6301:3: rule__MoyFavorited__ArgsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__ArgsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__2__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3__3"
    // InternalTw.g:6309:1: rule__MoyFavorited__Group_3__3 : rule__MoyFavorited__Group_3__3__Impl rule__MoyFavorited__Group_3__4 ;
    public final void rule__MoyFavorited__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6313:1: ( rule__MoyFavorited__Group_3__3__Impl rule__MoyFavorited__Group_3__4 )
            // InternalTw.g:6314:2: rule__MoyFavorited__Group_3__3__Impl rule__MoyFavorited__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__MoyFavorited__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__3"


    // $ANTLR start "rule__MoyFavorited__Group_3__3__Impl"
    // InternalTw.g:6321:1: rule__MoyFavorited__Group_3__3__Impl : ( ( rule__MoyFavorited__Group_3_3__0 )* ) ;
    public final void rule__MoyFavorited__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6325:1: ( ( ( rule__MoyFavorited__Group_3_3__0 )* ) )
            // InternalTw.g:6326:1: ( ( rule__MoyFavorited__Group_3_3__0 )* )
            {
            // InternalTw.g:6326:1: ( ( rule__MoyFavorited__Group_3_3__0 )* )
            // InternalTw.g:6327:2: ( rule__MoyFavorited__Group_3_3__0 )*
            {
             before(grammarAccess.getMoyFavoritedAccess().getGroup_3_3()); 
            // InternalTw.g:6328:2: ( rule__MoyFavorited__Group_3_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTw.g:6328:3: rule__MoyFavorited__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MoyFavorited__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMoyFavoritedAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__3__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3__4"
    // InternalTw.g:6336:1: rule__MoyFavorited__Group_3__4 : rule__MoyFavorited__Group_3__4__Impl ;
    public final void rule__MoyFavorited__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6340:1: ( rule__MoyFavorited__Group_3__4__Impl )
            // InternalTw.g:6341:2: rule__MoyFavorited__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__4"


    // $ANTLR start "rule__MoyFavorited__Group_3__4__Impl"
    // InternalTw.g:6347:1: rule__MoyFavorited__Group_3__4__Impl : ( '}' ) ;
    public final void rule__MoyFavorited__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6351:1: ( ( '}' ) )
            // InternalTw.g:6352:1: ( '}' )
            {
            // InternalTw.g:6352:1: ( '}' )
            // InternalTw.g:6353:2: '}'
            {
             before(grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3__4__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3_3__0"
    // InternalTw.g:6363:1: rule__MoyFavorited__Group_3_3__0 : rule__MoyFavorited__Group_3_3__0__Impl rule__MoyFavorited__Group_3_3__1 ;
    public final void rule__MoyFavorited__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6367:1: ( rule__MoyFavorited__Group_3_3__0__Impl rule__MoyFavorited__Group_3_3__1 )
            // InternalTw.g:6368:2: rule__MoyFavorited__Group_3_3__0__Impl rule__MoyFavorited__Group_3_3__1
            {
            pushFollow(FOLLOW_21);
            rule__MoyFavorited__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_3__0"


    // $ANTLR start "rule__MoyFavorited__Group_3_3__0__Impl"
    // InternalTw.g:6375:1: rule__MoyFavorited__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__MoyFavorited__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6379:1: ( ( ',' ) )
            // InternalTw.g:6380:1: ( ',' )
            {
            // InternalTw.g:6380:1: ( ',' )
            // InternalTw.g:6381:2: ','
            {
             before(grammarAccess.getMoyFavoritedAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoyFavoritedAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_3__0__Impl"


    // $ANTLR start "rule__MoyFavorited__Group_3_3__1"
    // InternalTw.g:6390:1: rule__MoyFavorited__Group_3_3__1 : rule__MoyFavorited__Group_3_3__1__Impl ;
    public final void rule__MoyFavorited__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6394:1: ( rule__MoyFavorited__Group_3_3__1__Impl )
            // InternalTw.g:6395:2: rule__MoyFavorited__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_3__1"


    // $ANTLR start "rule__MoyFavorited__Group_3_3__1__Impl"
    // InternalTw.g:6401:1: rule__MoyFavorited__Group_3_3__1__Impl : ( ( rule__MoyFavorited__ArgsAssignment_3_3_1 ) ) ;
    public final void rule__MoyFavorited__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6405:1: ( ( ( rule__MoyFavorited__ArgsAssignment_3_3_1 ) ) )
            // InternalTw.g:6406:1: ( ( rule__MoyFavorited__ArgsAssignment_3_3_1 ) )
            {
            // InternalTw.g:6406:1: ( ( rule__MoyFavorited__ArgsAssignment_3_3_1 ) )
            // InternalTw.g:6407:2: ( rule__MoyFavorited__ArgsAssignment_3_3_1 )
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_3_1()); 
            // InternalTw.g:6408:2: ( rule__MoyFavorited__ArgsAssignment_3_3_1 )
            // InternalTw.g:6408:3: rule__MoyFavorited__ArgsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoyFavorited__ArgsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoyFavoritedAccess().getArgsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__Group_3_3__1__Impl"


    // $ANTLR start "rule__Greater__Group__0"
    // InternalTw.g:6417:1: rule__Greater__Group__0 : rule__Greater__Group__0__Impl rule__Greater__Group__1 ;
    public final void rule__Greater__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6421:1: ( rule__Greater__Group__0__Impl rule__Greater__Group__1 )
            // InternalTw.g:6422:2: rule__Greater__Group__0__Impl rule__Greater__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greater__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__0"


    // $ANTLR start "rule__Greater__Group__0__Impl"
    // InternalTw.g:6429:1: rule__Greater__Group__0__Impl : ( 'Greater' ) ;
    public final void rule__Greater__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6433:1: ( ( 'Greater' ) )
            // InternalTw.g:6434:1: ( 'Greater' )
            {
            // InternalTw.g:6434:1: ( 'Greater' )
            // InternalTw.g:6435:2: 'Greater'
            {
             before(grammarAccess.getGreaterAccess().getGreaterKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGreaterAccess().getGreaterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__0__Impl"


    // $ANTLR start "rule__Greater__Group__1"
    // InternalTw.g:6444:1: rule__Greater__Group__1 : rule__Greater__Group__1__Impl rule__Greater__Group__2 ;
    public final void rule__Greater__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6448:1: ( rule__Greater__Group__1__Impl rule__Greater__Group__2 )
            // InternalTw.g:6449:2: rule__Greater__Group__1__Impl rule__Greater__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Greater__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__1"


    // $ANTLR start "rule__Greater__Group__1__Impl"
    // InternalTw.g:6456:1: rule__Greater__Group__1__Impl : ( '{' ) ;
    public final void rule__Greater__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6460:1: ( ( '{' ) )
            // InternalTw.g:6461:1: ( '{' )
            {
            // InternalTw.g:6461:1: ( '{' )
            // InternalTw.g:6462:2: '{'
            {
             before(grammarAccess.getGreaterAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGreaterAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__1__Impl"


    // $ANTLR start "rule__Greater__Group__2"
    // InternalTw.g:6471:1: rule__Greater__Group__2 : rule__Greater__Group__2__Impl rule__Greater__Group__3 ;
    public final void rule__Greater__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6475:1: ( rule__Greater__Group__2__Impl rule__Greater__Group__3 )
            // InternalTw.g:6476:2: rule__Greater__Group__2__Impl rule__Greater__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Greater__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__2"


    // $ANTLR start "rule__Greater__Group__2__Impl"
    // InternalTw.g:6483:1: rule__Greater__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__Greater__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6487:1: ( ( 'expressionG' ) )
            // InternalTw.g:6488:1: ( 'expressionG' )
            {
            // InternalTw.g:6488:1: ( 'expressionG' )
            // InternalTw.g:6489:2: 'expressionG'
            {
             before(grammarAccess.getGreaterAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGreaterAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__2__Impl"


    // $ANTLR start "rule__Greater__Group__3"
    // InternalTw.g:6498:1: rule__Greater__Group__3 : rule__Greater__Group__3__Impl rule__Greater__Group__4 ;
    public final void rule__Greater__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6502:1: ( rule__Greater__Group__3__Impl rule__Greater__Group__4 )
            // InternalTw.g:6503:2: rule__Greater__Group__3__Impl rule__Greater__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Greater__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__3"


    // $ANTLR start "rule__Greater__Group__3__Impl"
    // InternalTw.g:6510:1: rule__Greater__Group__3__Impl : ( ( rule__Greater__ExpressionGAssignment_3 ) ) ;
    public final void rule__Greater__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6514:1: ( ( ( rule__Greater__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:6515:1: ( ( rule__Greater__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:6515:1: ( ( rule__Greater__ExpressionGAssignment_3 ) )
            // InternalTw.g:6516:2: ( rule__Greater__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getGreaterAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:6517:2: ( rule__Greater__ExpressionGAssignment_3 )
            // InternalTw.g:6517:3: rule__Greater__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Greater__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGreaterAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__3__Impl"


    // $ANTLR start "rule__Greater__Group__4"
    // InternalTw.g:6525:1: rule__Greater__Group__4 : rule__Greater__Group__4__Impl rule__Greater__Group__5 ;
    public final void rule__Greater__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6529:1: ( rule__Greater__Group__4__Impl rule__Greater__Group__5 )
            // InternalTw.g:6530:2: rule__Greater__Group__4__Impl rule__Greater__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Greater__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__4"


    // $ANTLR start "rule__Greater__Group__4__Impl"
    // InternalTw.g:6537:1: rule__Greater__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__Greater__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6541:1: ( ( 'expressionD' ) )
            // InternalTw.g:6542:1: ( 'expressionD' )
            {
            // InternalTw.g:6542:1: ( 'expressionD' )
            // InternalTw.g:6543:2: 'expressionD'
            {
             before(grammarAccess.getGreaterAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGreaterAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__4__Impl"


    // $ANTLR start "rule__Greater__Group__5"
    // InternalTw.g:6552:1: rule__Greater__Group__5 : rule__Greater__Group__5__Impl rule__Greater__Group__6 ;
    public final void rule__Greater__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6556:1: ( rule__Greater__Group__5__Impl rule__Greater__Group__6 )
            // InternalTw.g:6557:2: rule__Greater__Group__5__Impl rule__Greater__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Greater__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__5"


    // $ANTLR start "rule__Greater__Group__5__Impl"
    // InternalTw.g:6564:1: rule__Greater__Group__5__Impl : ( ( rule__Greater__ExpressionDAssignment_5 ) ) ;
    public final void rule__Greater__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6568:1: ( ( ( rule__Greater__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:6569:1: ( ( rule__Greater__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:6569:1: ( ( rule__Greater__ExpressionDAssignment_5 ) )
            // InternalTw.g:6570:2: ( rule__Greater__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getGreaterAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:6571:2: ( rule__Greater__ExpressionDAssignment_5 )
            // InternalTw.g:6571:3: rule__Greater__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Greater__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGreaterAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__5__Impl"


    // $ANTLR start "rule__Greater__Group__6"
    // InternalTw.g:6579:1: rule__Greater__Group__6 : rule__Greater__Group__6__Impl ;
    public final void rule__Greater__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6583:1: ( rule__Greater__Group__6__Impl )
            // InternalTw.g:6584:2: rule__Greater__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greater__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__6"


    // $ANTLR start "rule__Greater__Group__6__Impl"
    // InternalTw.g:6590:1: rule__Greater__Group__6__Impl : ( '}' ) ;
    public final void rule__Greater__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6594:1: ( ( '}' ) )
            // InternalTw.g:6595:1: ( '}' )
            {
            // InternalTw.g:6595:1: ( '}' )
            // InternalTw.g:6596:2: '}'
            {
             before(grammarAccess.getGreaterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGreaterAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__6__Impl"


    // $ANTLR start "rule__Less__Group__0"
    // InternalTw.g:6606:1: rule__Less__Group__0 : rule__Less__Group__0__Impl rule__Less__Group__1 ;
    public final void rule__Less__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6610:1: ( rule__Less__Group__0__Impl rule__Less__Group__1 )
            // InternalTw.g:6611:2: rule__Less__Group__0__Impl rule__Less__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Less__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__0"


    // $ANTLR start "rule__Less__Group__0__Impl"
    // InternalTw.g:6618:1: rule__Less__Group__0__Impl : ( 'Less' ) ;
    public final void rule__Less__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6622:1: ( ( 'Less' ) )
            // InternalTw.g:6623:1: ( 'Less' )
            {
            // InternalTw.g:6623:1: ( 'Less' )
            // InternalTw.g:6624:2: 'Less'
            {
             before(grammarAccess.getLessAccess().getLessKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLessAccess().getLessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__0__Impl"


    // $ANTLR start "rule__Less__Group__1"
    // InternalTw.g:6633:1: rule__Less__Group__1 : rule__Less__Group__1__Impl rule__Less__Group__2 ;
    public final void rule__Less__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6637:1: ( rule__Less__Group__1__Impl rule__Less__Group__2 )
            // InternalTw.g:6638:2: rule__Less__Group__1__Impl rule__Less__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Less__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__1"


    // $ANTLR start "rule__Less__Group__1__Impl"
    // InternalTw.g:6645:1: rule__Less__Group__1__Impl : ( '{' ) ;
    public final void rule__Less__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6649:1: ( ( '{' ) )
            // InternalTw.g:6650:1: ( '{' )
            {
            // InternalTw.g:6650:1: ( '{' )
            // InternalTw.g:6651:2: '{'
            {
             before(grammarAccess.getLessAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLessAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__1__Impl"


    // $ANTLR start "rule__Less__Group__2"
    // InternalTw.g:6660:1: rule__Less__Group__2 : rule__Less__Group__2__Impl rule__Less__Group__3 ;
    public final void rule__Less__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6664:1: ( rule__Less__Group__2__Impl rule__Less__Group__3 )
            // InternalTw.g:6665:2: rule__Less__Group__2__Impl rule__Less__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Less__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__2"


    // $ANTLR start "rule__Less__Group__2__Impl"
    // InternalTw.g:6672:1: rule__Less__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__Less__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6676:1: ( ( 'expressionG' ) )
            // InternalTw.g:6677:1: ( 'expressionG' )
            {
            // InternalTw.g:6677:1: ( 'expressionG' )
            // InternalTw.g:6678:2: 'expressionG'
            {
             before(grammarAccess.getLessAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLessAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__2__Impl"


    // $ANTLR start "rule__Less__Group__3"
    // InternalTw.g:6687:1: rule__Less__Group__3 : rule__Less__Group__3__Impl rule__Less__Group__4 ;
    public final void rule__Less__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6691:1: ( rule__Less__Group__3__Impl rule__Less__Group__4 )
            // InternalTw.g:6692:2: rule__Less__Group__3__Impl rule__Less__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Less__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__3"


    // $ANTLR start "rule__Less__Group__3__Impl"
    // InternalTw.g:6699:1: rule__Less__Group__3__Impl : ( ( rule__Less__ExpressionGAssignment_3 ) ) ;
    public final void rule__Less__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6703:1: ( ( ( rule__Less__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:6704:1: ( ( rule__Less__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:6704:1: ( ( rule__Less__ExpressionGAssignment_3 ) )
            // InternalTw.g:6705:2: ( rule__Less__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getLessAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:6706:2: ( rule__Less__ExpressionGAssignment_3 )
            // InternalTw.g:6706:3: rule__Less__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Less__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__3__Impl"


    // $ANTLR start "rule__Less__Group__4"
    // InternalTw.g:6714:1: rule__Less__Group__4 : rule__Less__Group__4__Impl rule__Less__Group__5 ;
    public final void rule__Less__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6718:1: ( rule__Less__Group__4__Impl rule__Less__Group__5 )
            // InternalTw.g:6719:2: rule__Less__Group__4__Impl rule__Less__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Less__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__4"


    // $ANTLR start "rule__Less__Group__4__Impl"
    // InternalTw.g:6726:1: rule__Less__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__Less__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6730:1: ( ( 'expressionD' ) )
            // InternalTw.g:6731:1: ( 'expressionD' )
            {
            // InternalTw.g:6731:1: ( 'expressionD' )
            // InternalTw.g:6732:2: 'expressionD'
            {
             before(grammarAccess.getLessAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLessAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__4__Impl"


    // $ANTLR start "rule__Less__Group__5"
    // InternalTw.g:6741:1: rule__Less__Group__5 : rule__Less__Group__5__Impl rule__Less__Group__6 ;
    public final void rule__Less__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6745:1: ( rule__Less__Group__5__Impl rule__Less__Group__6 )
            // InternalTw.g:6746:2: rule__Less__Group__5__Impl rule__Less__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Less__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__5"


    // $ANTLR start "rule__Less__Group__5__Impl"
    // InternalTw.g:6753:1: rule__Less__Group__5__Impl : ( ( rule__Less__ExpressionDAssignment_5 ) ) ;
    public final void rule__Less__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6757:1: ( ( ( rule__Less__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:6758:1: ( ( rule__Less__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:6758:1: ( ( rule__Less__ExpressionDAssignment_5 ) )
            // InternalTw.g:6759:2: ( rule__Less__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getLessAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:6760:2: ( rule__Less__ExpressionDAssignment_5 )
            // InternalTw.g:6760:3: rule__Less__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Less__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__5__Impl"


    // $ANTLR start "rule__Less__Group__6"
    // InternalTw.g:6768:1: rule__Less__Group__6 : rule__Less__Group__6__Impl ;
    public final void rule__Less__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6772:1: ( rule__Less__Group__6__Impl )
            // InternalTw.g:6773:2: rule__Less__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Less__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__6"


    // $ANTLR start "rule__Less__Group__6__Impl"
    // InternalTw.g:6779:1: rule__Less__Group__6__Impl : ( '}' ) ;
    public final void rule__Less__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6783:1: ( ( '}' ) )
            // InternalTw.g:6784:1: ( '}' )
            {
            // InternalTw.g:6784:1: ( '}' )
            // InternalTw.g:6785:2: '}'
            {
             before(grammarAccess.getLessAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLessAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__6__Impl"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalTw.g:6795:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6799:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalTw.g:6800:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Equal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0"


    // $ANTLR start "rule__Equal__Group__0__Impl"
    // InternalTw.g:6807:1: rule__Equal__Group__0__Impl : ( 'Equal' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6811:1: ( ( 'Equal' ) )
            // InternalTw.g:6812:1: ( 'Equal' )
            {
            // InternalTw.g:6812:1: ( 'Equal' )
            // InternalTw.g:6813:2: 'Equal'
            {
             before(grammarAccess.getEqualAccess().getEqualKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getEqualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0__Impl"


    // $ANTLR start "rule__Equal__Group__1"
    // InternalTw.g:6822:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6826:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalTw.g:6827:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Equal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1"


    // $ANTLR start "rule__Equal__Group__1__Impl"
    // InternalTw.g:6834:1: rule__Equal__Group__1__Impl : ( '{' ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6838:1: ( ( '{' ) )
            // InternalTw.g:6839:1: ( '{' )
            {
            // InternalTw.g:6839:1: ( '{' )
            // InternalTw.g:6840:2: '{'
            {
             before(grammarAccess.getEqualAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1__Impl"


    // $ANTLR start "rule__Equal__Group__2"
    // InternalTw.g:6849:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6853:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalTw.g:6854:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Equal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2"


    // $ANTLR start "rule__Equal__Group__2__Impl"
    // InternalTw.g:6861:1: rule__Equal__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6865:1: ( ( 'expressionG' ) )
            // InternalTw.g:6866:1: ( 'expressionG' )
            {
            // InternalTw.g:6866:1: ( 'expressionG' )
            // InternalTw.g:6867:2: 'expressionG'
            {
             before(grammarAccess.getEqualAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2__Impl"


    // $ANTLR start "rule__Equal__Group__3"
    // InternalTw.g:6876:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6880:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalTw.g:6881:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Equal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3"


    // $ANTLR start "rule__Equal__Group__3__Impl"
    // InternalTw.g:6888:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__ExpressionGAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6892:1: ( ( ( rule__Equal__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:6893:1: ( ( rule__Equal__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:6893:1: ( ( rule__Equal__ExpressionGAssignment_3 ) )
            // InternalTw.g:6894:2: ( rule__Equal__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getEqualAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:6895:2: ( rule__Equal__ExpressionGAssignment_3 )
            // InternalTw.g:6895:3: rule__Equal__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Equal__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3__Impl"


    // $ANTLR start "rule__Equal__Group__4"
    // InternalTw.g:6903:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl rule__Equal__Group__5 ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6907:1: ( rule__Equal__Group__4__Impl rule__Equal__Group__5 )
            // InternalTw.g:6908:2: rule__Equal__Group__4__Impl rule__Equal__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Equal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__4"


    // $ANTLR start "rule__Equal__Group__4__Impl"
    // InternalTw.g:6915:1: rule__Equal__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6919:1: ( ( 'expressionD' ) )
            // InternalTw.g:6920:1: ( 'expressionD' )
            {
            // InternalTw.g:6920:1: ( 'expressionD' )
            // InternalTw.g:6921:2: 'expressionD'
            {
             before(grammarAccess.getEqualAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__4__Impl"


    // $ANTLR start "rule__Equal__Group__5"
    // InternalTw.g:6930:1: rule__Equal__Group__5 : rule__Equal__Group__5__Impl rule__Equal__Group__6 ;
    public final void rule__Equal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6934:1: ( rule__Equal__Group__5__Impl rule__Equal__Group__6 )
            // InternalTw.g:6935:2: rule__Equal__Group__5__Impl rule__Equal__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Equal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__5"


    // $ANTLR start "rule__Equal__Group__5__Impl"
    // InternalTw.g:6942:1: rule__Equal__Group__5__Impl : ( ( rule__Equal__ExpressionDAssignment_5 ) ) ;
    public final void rule__Equal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6946:1: ( ( ( rule__Equal__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:6947:1: ( ( rule__Equal__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:6947:1: ( ( rule__Equal__ExpressionDAssignment_5 ) )
            // InternalTw.g:6948:2: ( rule__Equal__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getEqualAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:6949:2: ( rule__Equal__ExpressionDAssignment_5 )
            // InternalTw.g:6949:3: rule__Equal__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Equal__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__5__Impl"


    // $ANTLR start "rule__Equal__Group__6"
    // InternalTw.g:6957:1: rule__Equal__Group__6 : rule__Equal__Group__6__Impl ;
    public final void rule__Equal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6961:1: ( rule__Equal__Group__6__Impl )
            // InternalTw.g:6962:2: rule__Equal__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__6"


    // $ANTLR start "rule__Equal__Group__6__Impl"
    // InternalTw.g:6968:1: rule__Equal__Group__6__Impl : ( '}' ) ;
    public final void rule__Equal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6972:1: ( ( '}' ) )
            // InternalTw.g:6973:1: ( '}' )
            {
            // InternalTw.g:6973:1: ( '}' )
            // InternalTw.g:6974:2: '}'
            {
             before(grammarAccess.getEqualAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__6__Impl"


    // $ANTLR start "rule__SupEgal__Group__0"
    // InternalTw.g:6984:1: rule__SupEgal__Group__0 : rule__SupEgal__Group__0__Impl rule__SupEgal__Group__1 ;
    public final void rule__SupEgal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:6988:1: ( rule__SupEgal__Group__0__Impl rule__SupEgal__Group__1 )
            // InternalTw.g:6989:2: rule__SupEgal__Group__0__Impl rule__SupEgal__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SupEgal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__0"


    // $ANTLR start "rule__SupEgal__Group__0__Impl"
    // InternalTw.g:6996:1: rule__SupEgal__Group__0__Impl : ( 'SupEgal' ) ;
    public final void rule__SupEgal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7000:1: ( ( 'SupEgal' ) )
            // InternalTw.g:7001:1: ( 'SupEgal' )
            {
            // InternalTw.g:7001:1: ( 'SupEgal' )
            // InternalTw.g:7002:2: 'SupEgal'
            {
             before(grammarAccess.getSupEgalAccess().getSupEgalKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSupEgalAccess().getSupEgalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__0__Impl"


    // $ANTLR start "rule__SupEgal__Group__1"
    // InternalTw.g:7011:1: rule__SupEgal__Group__1 : rule__SupEgal__Group__1__Impl rule__SupEgal__Group__2 ;
    public final void rule__SupEgal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7015:1: ( rule__SupEgal__Group__1__Impl rule__SupEgal__Group__2 )
            // InternalTw.g:7016:2: rule__SupEgal__Group__1__Impl rule__SupEgal__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SupEgal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__1"


    // $ANTLR start "rule__SupEgal__Group__1__Impl"
    // InternalTw.g:7023:1: rule__SupEgal__Group__1__Impl : ( '{' ) ;
    public final void rule__SupEgal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7027:1: ( ( '{' ) )
            // InternalTw.g:7028:1: ( '{' )
            {
            // InternalTw.g:7028:1: ( '{' )
            // InternalTw.g:7029:2: '{'
            {
             before(grammarAccess.getSupEgalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSupEgalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__1__Impl"


    // $ANTLR start "rule__SupEgal__Group__2"
    // InternalTw.g:7038:1: rule__SupEgal__Group__2 : rule__SupEgal__Group__2__Impl rule__SupEgal__Group__3 ;
    public final void rule__SupEgal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7042:1: ( rule__SupEgal__Group__2__Impl rule__SupEgal__Group__3 )
            // InternalTw.g:7043:2: rule__SupEgal__Group__2__Impl rule__SupEgal__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SupEgal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__2"


    // $ANTLR start "rule__SupEgal__Group__2__Impl"
    // InternalTw.g:7050:1: rule__SupEgal__Group__2__Impl : ( 'expressionG' ) ;
    public final void rule__SupEgal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7054:1: ( ( 'expressionG' ) )
            // InternalTw.g:7055:1: ( 'expressionG' )
            {
            // InternalTw.g:7055:1: ( 'expressionG' )
            // InternalTw.g:7056:2: 'expressionG'
            {
             before(grammarAccess.getSupEgalAccess().getExpressionGKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSupEgalAccess().getExpressionGKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__2__Impl"


    // $ANTLR start "rule__SupEgal__Group__3"
    // InternalTw.g:7065:1: rule__SupEgal__Group__3 : rule__SupEgal__Group__3__Impl rule__SupEgal__Group__4 ;
    public final void rule__SupEgal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7069:1: ( rule__SupEgal__Group__3__Impl rule__SupEgal__Group__4 )
            // InternalTw.g:7070:2: rule__SupEgal__Group__3__Impl rule__SupEgal__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__SupEgal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__3"


    // $ANTLR start "rule__SupEgal__Group__3__Impl"
    // InternalTw.g:7077:1: rule__SupEgal__Group__3__Impl : ( ( rule__SupEgal__ExpressionGAssignment_3 ) ) ;
    public final void rule__SupEgal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7081:1: ( ( ( rule__SupEgal__ExpressionGAssignment_3 ) ) )
            // InternalTw.g:7082:1: ( ( rule__SupEgal__ExpressionGAssignment_3 ) )
            {
            // InternalTw.g:7082:1: ( ( rule__SupEgal__ExpressionGAssignment_3 ) )
            // InternalTw.g:7083:2: ( rule__SupEgal__ExpressionGAssignment_3 )
            {
             before(grammarAccess.getSupEgalAccess().getExpressionGAssignment_3()); 
            // InternalTw.g:7084:2: ( rule__SupEgal__ExpressionGAssignment_3 )
            // InternalTw.g:7084:3: rule__SupEgal__ExpressionGAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SupEgal__ExpressionGAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSupEgalAccess().getExpressionGAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__3__Impl"


    // $ANTLR start "rule__SupEgal__Group__4"
    // InternalTw.g:7092:1: rule__SupEgal__Group__4 : rule__SupEgal__Group__4__Impl rule__SupEgal__Group__5 ;
    public final void rule__SupEgal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7096:1: ( rule__SupEgal__Group__4__Impl rule__SupEgal__Group__5 )
            // InternalTw.g:7097:2: rule__SupEgal__Group__4__Impl rule__SupEgal__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SupEgal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__4"


    // $ANTLR start "rule__SupEgal__Group__4__Impl"
    // InternalTw.g:7104:1: rule__SupEgal__Group__4__Impl : ( 'expressionD' ) ;
    public final void rule__SupEgal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7108:1: ( ( 'expressionD' ) )
            // InternalTw.g:7109:1: ( 'expressionD' )
            {
            // InternalTw.g:7109:1: ( 'expressionD' )
            // InternalTw.g:7110:2: 'expressionD'
            {
             before(grammarAccess.getSupEgalAccess().getExpressionDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSupEgalAccess().getExpressionDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__4__Impl"


    // $ANTLR start "rule__SupEgal__Group__5"
    // InternalTw.g:7119:1: rule__SupEgal__Group__5 : rule__SupEgal__Group__5__Impl rule__SupEgal__Group__6 ;
    public final void rule__SupEgal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7123:1: ( rule__SupEgal__Group__5__Impl rule__SupEgal__Group__6 )
            // InternalTw.g:7124:2: rule__SupEgal__Group__5__Impl rule__SupEgal__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__SupEgal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__5"


    // $ANTLR start "rule__SupEgal__Group__5__Impl"
    // InternalTw.g:7131:1: rule__SupEgal__Group__5__Impl : ( ( rule__SupEgal__ExpressionDAssignment_5 ) ) ;
    public final void rule__SupEgal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7135:1: ( ( ( rule__SupEgal__ExpressionDAssignment_5 ) ) )
            // InternalTw.g:7136:1: ( ( rule__SupEgal__ExpressionDAssignment_5 ) )
            {
            // InternalTw.g:7136:1: ( ( rule__SupEgal__ExpressionDAssignment_5 ) )
            // InternalTw.g:7137:2: ( rule__SupEgal__ExpressionDAssignment_5 )
            {
             before(grammarAccess.getSupEgalAccess().getExpressionDAssignment_5()); 
            // InternalTw.g:7138:2: ( rule__SupEgal__ExpressionDAssignment_5 )
            // InternalTw.g:7138:3: rule__SupEgal__ExpressionDAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SupEgal__ExpressionDAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSupEgalAccess().getExpressionDAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__5__Impl"


    // $ANTLR start "rule__SupEgal__Group__6"
    // InternalTw.g:7146:1: rule__SupEgal__Group__6 : rule__SupEgal__Group__6__Impl ;
    public final void rule__SupEgal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7150:1: ( rule__SupEgal__Group__6__Impl )
            // InternalTw.g:7151:2: rule__SupEgal__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SupEgal__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__6"


    // $ANTLR start "rule__SupEgal__Group__6__Impl"
    // InternalTw.g:7157:1: rule__SupEgal__Group__6__Impl : ( '}' ) ;
    public final void rule__SupEgal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7161:1: ( ( '}' ) )
            // InternalTw.g:7162:1: ( '}' )
            {
            // InternalTw.g:7162:1: ( '}' )
            // InternalTw.g:7163:2: '}'
            {
             before(grammarAccess.getSupEgalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSupEgalAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__Group__6__Impl"


    // $ANTLR start "rule__Args__Group__0"
    // InternalTw.g:7173:1: rule__Args__Group__0 : rule__Args__Group__0__Impl rule__Args__Group__1 ;
    public final void rule__Args__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7177:1: ( rule__Args__Group__0__Impl rule__Args__Group__1 )
            // InternalTw.g:7178:2: rule__Args__Group__0__Impl rule__Args__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Args__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__0"


    // $ANTLR start "rule__Args__Group__0__Impl"
    // InternalTw.g:7185:1: rule__Args__Group__0__Impl : ( () ) ;
    public final void rule__Args__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7189:1: ( ( () ) )
            // InternalTw.g:7190:1: ( () )
            {
            // InternalTw.g:7190:1: ( () )
            // InternalTw.g:7191:2: ()
            {
             before(grammarAccess.getArgsAccess().getArgsAction_0()); 
            // InternalTw.g:7192:2: ()
            // InternalTw.g:7192:3: 
            {
            }

             after(grammarAccess.getArgsAccess().getArgsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__0__Impl"


    // $ANTLR start "rule__Args__Group__1"
    // InternalTw.g:7200:1: rule__Args__Group__1 : rule__Args__Group__1__Impl rule__Args__Group__2 ;
    public final void rule__Args__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7204:1: ( rule__Args__Group__1__Impl rule__Args__Group__2 )
            // InternalTw.g:7205:2: rule__Args__Group__1__Impl rule__Args__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Args__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__1"


    // $ANTLR start "rule__Args__Group__1__Impl"
    // InternalTw.g:7212:1: rule__Args__Group__1__Impl : ( 'Args' ) ;
    public final void rule__Args__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7216:1: ( ( 'Args' ) )
            // InternalTw.g:7217:1: ( 'Args' )
            {
            // InternalTw.g:7217:1: ( 'Args' )
            // InternalTw.g:7218:2: 'Args'
            {
             before(grammarAccess.getArgsAccess().getArgsKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getArgsAccess().getArgsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__1__Impl"


    // $ANTLR start "rule__Args__Group__2"
    // InternalTw.g:7227:1: rule__Args__Group__2 : rule__Args__Group__2__Impl rule__Args__Group__3 ;
    public final void rule__Args__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7231:1: ( rule__Args__Group__2__Impl rule__Args__Group__3 )
            // InternalTw.g:7232:2: rule__Args__Group__2__Impl rule__Args__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Args__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__2"


    // $ANTLR start "rule__Args__Group__2__Impl"
    // InternalTw.g:7239:1: rule__Args__Group__2__Impl : ( '{' ) ;
    public final void rule__Args__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7243:1: ( ( '{' ) )
            // InternalTw.g:7244:1: ( '{' )
            {
            // InternalTw.g:7244:1: ( '{' )
            // InternalTw.g:7245:2: '{'
            {
             before(grammarAccess.getArgsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArgsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__2__Impl"


    // $ANTLR start "rule__Args__Group__3"
    // InternalTw.g:7254:1: rule__Args__Group__3 : rule__Args__Group__3__Impl rule__Args__Group__4 ;
    public final void rule__Args__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7258:1: ( rule__Args__Group__3__Impl rule__Args__Group__4 )
            // InternalTw.g:7259:2: rule__Args__Group__3__Impl rule__Args__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Args__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__3"


    // $ANTLR start "rule__Args__Group__3__Impl"
    // InternalTw.g:7266:1: rule__Args__Group__3__Impl : ( ( rule__Args__Group_3__0 )? ) ;
    public final void rule__Args__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7270:1: ( ( ( rule__Args__Group_3__0 )? ) )
            // InternalTw.g:7271:1: ( ( rule__Args__Group_3__0 )? )
            {
            // InternalTw.g:7271:1: ( ( rule__Args__Group_3__0 )? )
            // InternalTw.g:7272:2: ( rule__Args__Group_3__0 )?
            {
             before(grammarAccess.getArgsAccess().getGroup_3()); 
            // InternalTw.g:7273:2: ( rule__Args__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTw.g:7273:3: rule__Args__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Args__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__3__Impl"


    // $ANTLR start "rule__Args__Group__4"
    // InternalTw.g:7281:1: rule__Args__Group__4 : rule__Args__Group__4__Impl ;
    public final void rule__Args__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7285:1: ( rule__Args__Group__4__Impl )
            // InternalTw.g:7286:2: rule__Args__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Args__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__4"


    // $ANTLR start "rule__Args__Group__4__Impl"
    // InternalTw.g:7292:1: rule__Args__Group__4__Impl : ( '}' ) ;
    public final void rule__Args__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7296:1: ( ( '}' ) )
            // InternalTw.g:7297:1: ( '}' )
            {
            // InternalTw.g:7297:1: ( '}' )
            // InternalTw.g:7298:2: '}'
            {
             before(grammarAccess.getArgsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArgsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__4__Impl"


    // $ANTLR start "rule__Args__Group_3__0"
    // InternalTw.g:7308:1: rule__Args__Group_3__0 : rule__Args__Group_3__0__Impl rule__Args__Group_3__1 ;
    public final void rule__Args__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7312:1: ( rule__Args__Group_3__0__Impl rule__Args__Group_3__1 )
            // InternalTw.g:7313:2: rule__Args__Group_3__0__Impl rule__Args__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__Args__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_3__0"


    // $ANTLR start "rule__Args__Group_3__0__Impl"
    // InternalTw.g:7320:1: rule__Args__Group_3__0__Impl : ( 'arg' ) ;
    public final void rule__Args__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7324:1: ( ( 'arg' ) )
            // InternalTw.g:7325:1: ( 'arg' )
            {
            // InternalTw.g:7325:1: ( 'arg' )
            // InternalTw.g:7326:2: 'arg'
            {
             before(grammarAccess.getArgsAccess().getArgKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getArgsAccess().getArgKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_3__0__Impl"


    // $ANTLR start "rule__Args__Group_3__1"
    // InternalTw.g:7335:1: rule__Args__Group_3__1 : rule__Args__Group_3__1__Impl ;
    public final void rule__Args__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7339:1: ( rule__Args__Group_3__1__Impl )
            // InternalTw.g:7340:2: rule__Args__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Args__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_3__1"


    // $ANTLR start "rule__Args__Group_3__1__Impl"
    // InternalTw.g:7346:1: rule__Args__Group_3__1__Impl : ( ( rule__Args__ArgAssignment_3_1 ) ) ;
    public final void rule__Args__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7350:1: ( ( ( rule__Args__ArgAssignment_3_1 ) ) )
            // InternalTw.g:7351:1: ( ( rule__Args__ArgAssignment_3_1 ) )
            {
            // InternalTw.g:7351:1: ( ( rule__Args__ArgAssignment_3_1 ) )
            // InternalTw.g:7352:2: ( rule__Args__ArgAssignment_3_1 )
            {
             before(grammarAccess.getArgsAccess().getArgAssignment_3_1()); 
            // InternalTw.g:7353:2: ( rule__Args__ArgAssignment_3_1 )
            // InternalTw.g:7353:3: rule__Args__ArgAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Args__ArgAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArgsAccess().getArgAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTw.g:7362:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7366:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTw.g:7367:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalTw.g:7374:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7378:1: ( ( () ) )
            // InternalTw.g:7379:1: ( () )
            {
            // InternalTw.g:7379:1: ( () )
            // InternalTw.g:7380:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalTw.g:7381:2: ()
            // InternalTw.g:7381:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalTw.g:7389:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7393:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTw.g:7394:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalTw.g:7401:1: rule__Variable__Group__1__Impl : ( 'Variable' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7405:1: ( ( 'Variable' ) )
            // InternalTw.g:7406:1: ( 'Variable' )
            {
            // InternalTw.g:7406:1: ( 'Variable' )
            // InternalTw.g:7407:2: 'Variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalTw.g:7416:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7420:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalTw.g:7421:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalTw.g:7428:1: rule__Variable__Group__2__Impl : ( '{' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7432:1: ( ( '{' ) )
            // InternalTw.g:7433:1: ( '{' )
            {
            // InternalTw.g:7433:1: ( '{' )
            // InternalTw.g:7434:2: '{'
            {
             before(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalTw.g:7443:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7447:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalTw.g:7448:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalTw.g:7455:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Group_3__0 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7459:1: ( ( ( rule__Variable__Group_3__0 )? ) )
            // InternalTw.g:7460:1: ( ( rule__Variable__Group_3__0 )? )
            {
            // InternalTw.g:7460:1: ( ( rule__Variable__Group_3__0 )? )
            // InternalTw.g:7461:2: ( rule__Variable__Group_3__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_3()); 
            // InternalTw.g:7462:2: ( rule__Variable__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTw.g:7462:3: rule__Variable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalTw.g:7470:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7474:1: ( rule__Variable__Group__4__Impl )
            // InternalTw.g:7475:2: rule__Variable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalTw.g:7481:1: rule__Variable__Group__4__Impl : ( '}' ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7485:1: ( ( '}' ) )
            // InternalTw.g:7486:1: ( '}' )
            {
            // InternalTw.g:7486:1: ( '}' )
            // InternalTw.g:7487:2: '}'
            {
             before(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group_3__0"
    // InternalTw.g:7497:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7501:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // InternalTw.g:7502:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__Variable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0"


    // $ANTLR start "rule__Variable__Group_3__0__Impl"
    // InternalTw.g:7509:1: rule__Variable__Group_3__0__Impl : ( 'nameVariable' ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7513:1: ( ( 'nameVariable' ) )
            // InternalTw.g:7514:1: ( 'nameVariable' )
            {
            // InternalTw.g:7514:1: ( 'nameVariable' )
            // InternalTw.g:7515:2: 'nameVariable'
            {
             before(grammarAccess.getVariableAccess().getNameVariableKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameVariableKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0__Impl"


    // $ANTLR start "rule__Variable__Group_3__1"
    // InternalTw.g:7524:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7528:1: ( rule__Variable__Group_3__1__Impl )
            // InternalTw.g:7529:2: rule__Variable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1"


    // $ANTLR start "rule__Variable__Group_3__1__Impl"
    // InternalTw.g:7535:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__NameVariableAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7539:1: ( ( ( rule__Variable__NameVariableAssignment_3_1 ) ) )
            // InternalTw.g:7540:1: ( ( rule__Variable__NameVariableAssignment_3_1 ) )
            {
            // InternalTw.g:7540:1: ( ( rule__Variable__NameVariableAssignment_3_1 ) )
            // InternalTw.g:7541:2: ( rule__Variable__NameVariableAssignment_3_1 )
            {
             before(grammarAccess.getVariableAccess().getNameVariableAssignment_3_1()); 
            // InternalTw.g:7542:2: ( rule__Variable__NameVariableAssignment_3_1 )
            // InternalTw.g:7542:3: rule__Variable__NameVariableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameVariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameVariableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1__Impl"


    // $ANTLR start "rule__Program__StatementAssignment_3_2"
    // InternalTw.g:7551:1: rule__Program__StatementAssignment_3_2 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7555:1: ( ( ruleStatement ) )
            // InternalTw.g:7556:2: ( ruleStatement )
            {
            // InternalTw.g:7556:2: ( ruleStatement )
            // InternalTw.g:7557:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_3_2"


    // $ANTLR start "rule__Program__StatementAssignment_3_3_1"
    // InternalTw.g:7566:1: rule__Program__StatementAssignment_3_3_1 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7570:1: ( ( ruleStatement ) )
            // InternalTw.g:7571:2: ( ruleStatement )
            {
            // InternalTw.g:7571:2: ( ruleStatement )
            // InternalTw.g:7572:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementAssignment_3_3_1"


    // $ANTLR start "rule__Block__StatementAssignment_3_2"
    // InternalTw.g:7581:1: rule__Block__StatementAssignment_3_2 : ( ruleStatement ) ;
    public final void rule__Block__StatementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7585:1: ( ( ruleStatement ) )
            // InternalTw.g:7586:2: ( ruleStatement )
            {
            // InternalTw.g:7586:2: ( ruleStatement )
            // InternalTw.g:7587:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_3_2"


    // $ANTLR start "rule__Block__StatementAssignment_3_3_1"
    // InternalTw.g:7596:1: rule__Block__StatementAssignment_3_3_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7600:1: ( ( ruleStatement ) )
            // InternalTw.g:7601:2: ( ruleStatement )
            {
            // InternalTw.g:7601:2: ( ruleStatement )
            // InternalTw.g:7602:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_3_3_1"


    // $ANTLR start "rule__If__ElseBlockAssignment_2_1"
    // InternalTw.g:7611:1: rule__If__ElseBlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__If__ElseBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7615:1: ( ( ruleBlock ) )
            // InternalTw.g:7616:2: ( ruleBlock )
            {
            // InternalTw.g:7616:2: ( ruleBlock )
            // InternalTw.g:7617:3: ruleBlock
            {
             before(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElseBlockAssignment_2_1"


    // $ANTLR start "rule__If__IfBlockAssignment_4"
    // InternalTw.g:7626:1: rule__If__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7630:1: ( ( ruleBlock ) )
            // InternalTw.g:7631:2: ( ruleBlock )
            {
            // InternalTw.g:7631:2: ( ruleBlock )
            // InternalTw.g:7632:3: ruleBlock
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


    // $ANTLR start "rule__If__ConditionAssignment_6"
    // InternalTw.g:7641:1: rule__If__ConditionAssignment_6 : ( ruleOpBool ) ;
    public final void rule__If__ConditionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7645:1: ( ( ruleOpBool ) )
            // InternalTw.g:7646:2: ( ruleOpBool )
            {
            // InternalTw.g:7646:2: ( ruleOpBool )
            // InternalTw.g:7647:3: ruleOpBool
            {
             before(grammarAccess.getIfAccess().getConditionOpBoolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionOpBoolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_6"


    // $ANTLR start "rule__Affectation__VariableAssignment_3"
    // InternalTw.g:7656:1: rule__Affectation__VariableAssignment_3 : ( ruleVariable ) ;
    public final void rule__Affectation__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7660:1: ( ( ruleVariable ) )
            // InternalTw.g:7661:2: ( ruleVariable )
            {
            // InternalTw.g:7661:2: ( ruleVariable )
            // InternalTw.g:7662:3: ruleVariable
            {
             before(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__VariableAssignment_3"


    // $ANTLR start "rule__Affectation__OpDroiteAssignment_4_1"
    // InternalTw.g:7671:1: rule__Affectation__OpDroiteAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Affectation__OpDroiteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7675:1: ( ( ruleExpression ) )
            // InternalTw.g:7676:2: ( ruleExpression )
            {
            // InternalTw.g:7676:2: ( ruleExpression )
            // InternalTw.g:7677:3: ruleExpression
            {
             before(grammarAccess.getAffectationAccess().getOpDroiteExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getOpDroiteExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__OpDroiteAssignment_4_1"


    // $ANTLR start "rule__And__ExpressionGAssignment_3"
    // InternalTw.g:7686:1: rule__And__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__And__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7690:1: ( ( ruleExpression ) )
            // InternalTw.g:7691:2: ( ruleExpression )
            {
            // InternalTw.g:7691:2: ( ruleExpression )
            // InternalTw.g:7692:3: ruleExpression
            {
             before(grammarAccess.getAndAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAndAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ExpressionGAssignment_3"


    // $ANTLR start "rule__And__ExpressionDAssignment_5"
    // InternalTw.g:7701:1: rule__And__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__And__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7705:1: ( ( ruleExpression ) )
            // InternalTw.g:7706:2: ( ruleExpression )
            {
            // InternalTw.g:7706:2: ( ruleExpression )
            // InternalTw.g:7707:3: ruleExpression
            {
             before(grammarAccess.getAndAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAndAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ExpressionDAssignment_5"


    // $ANTLR start "rule__Or__ExpressionGAssignment_3"
    // InternalTw.g:7716:1: rule__Or__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__Or__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7720:1: ( ( ruleExpression ) )
            // InternalTw.g:7721:2: ( ruleExpression )
            {
            // InternalTw.g:7721:2: ( ruleExpression )
            // InternalTw.g:7722:3: ruleExpression
            {
             before(grammarAccess.getOrAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOrAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__ExpressionGAssignment_3"


    // $ANTLR start "rule__Or__ExpressionDAssignment_5"
    // InternalTw.g:7731:1: rule__Or__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__Or__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7735:1: ( ( ruleExpression ) )
            // InternalTw.g:7736:2: ( ruleExpression )
            {
            // InternalTw.g:7736:2: ( ruleExpression )
            // InternalTw.g:7737:3: ruleExpression
            {
             before(grammarAccess.getOrAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOrAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__ExpressionDAssignment_5"


    // $ANTLR start "rule__Xor__ExpressionGAssignment_3"
    // InternalTw.g:7746:1: rule__Xor__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__Xor__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7750:1: ( ( ruleExpression ) )
            // InternalTw.g:7751:2: ( ruleExpression )
            {
            // InternalTw.g:7751:2: ( ruleExpression )
            // InternalTw.g:7752:3: ruleExpression
            {
             before(grammarAccess.getXorAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getXorAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__ExpressionGAssignment_3"


    // $ANTLR start "rule__Xor__ExpressionDAssignment_5"
    // InternalTw.g:7761:1: rule__Xor__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__Xor__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7765:1: ( ( ruleExpression ) )
            // InternalTw.g:7766:2: ( ruleExpression )
            {
            // InternalTw.g:7766:2: ( ruleExpression )
            // InternalTw.g:7767:3: ruleExpression
            {
             before(grammarAccess.getXorAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getXorAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__ExpressionDAssignment_5"


    // $ANTLR start "rule__Tweets_user__ArgsAssignment_3_2"
    // InternalTw.g:7776:1: rule__Tweets_user__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__Tweets_user__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7780:1: ( ( ruleArgs ) )
            // InternalTw.g:7781:2: ( ruleArgs )
            {
            // InternalTw.g:7781:2: ( ruleArgs )
            // InternalTw.g:7782:3: ruleArgs
            {
             before(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__ArgsAssignment_3_2"


    // $ANTLR start "rule__Tweets_user__ArgsAssignment_3_3_1"
    // InternalTw.g:7791:1: rule__Tweets_user__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__Tweets_user__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7795:1: ( ( ruleArgs ) )
            // InternalTw.g:7796:2: ( ruleArgs )
            {
            // InternalTw.g:7796:2: ( ruleArgs )
            // InternalTw.g:7797:3: ruleArgs
            {
             before(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_userAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_user__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__Tweets_location__ArgsAssignment_3_2"
    // InternalTw.g:7806:1: rule__Tweets_location__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__Tweets_location__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7810:1: ( ( ruleArgs ) )
            // InternalTw.g:7811:2: ( ruleArgs )
            {
            // InternalTw.g:7811:2: ( ruleArgs )
            // InternalTw.g:7812:3: ruleArgs
            {
             before(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__ArgsAssignment_3_2"


    // $ANTLR start "rule__Tweets_location__ArgsAssignment_3_3_1"
    // InternalTw.g:7821:1: rule__Tweets_location__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__Tweets_location__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7825:1: ( ( ruleArgs ) )
            // InternalTw.g:7826:2: ( ruleArgs )
            {
            // InternalTw.g:7826:2: ( ruleArgs )
            // InternalTw.g:7827:3: ruleArgs
            {
             before(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_locationAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_location__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__Tweets_entity__ArgsAssignment_3_2"
    // InternalTw.g:7836:1: rule__Tweets_entity__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__Tweets_entity__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7840:1: ( ( ruleArgs ) )
            // InternalTw.g:7841:2: ( ruleArgs )
            {
            // InternalTw.g:7841:2: ( ruleArgs )
            // InternalTw.g:7842:3: ruleArgs
            {
             before(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__ArgsAssignment_3_2"


    // $ANTLR start "rule__Tweets_entity__ArgsAssignment_3_3_1"
    // InternalTw.g:7851:1: rule__Tweets_entity__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__Tweets_entity__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7855:1: ( ( ruleArgs ) )
            // InternalTw.g:7856:2: ( ruleArgs )
            {
            // InternalTw.g:7856:2: ( ruleArgs )
            // InternalTw.g:7857:3: ruleArgs
            {
             before(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_entityAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_entity__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__Tweets_date__ArgsAssignment_3_2"
    // InternalTw.g:7866:1: rule__Tweets_date__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__Tweets_date__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7870:1: ( ( ruleArgs ) )
            // InternalTw.g:7871:2: ( ruleArgs )
            {
            // InternalTw.g:7871:2: ( ruleArgs )
            // InternalTw.g:7872:3: ruleArgs
            {
             before(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__ArgsAssignment_3_2"


    // $ANTLR start "rule__Tweets_date__ArgsAssignment_3_3_1"
    // InternalTw.g:7881:1: rule__Tweets_date__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__Tweets_date__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7885:1: ( ( ruleArgs ) )
            // InternalTw.g:7886:2: ( ruleArgs )
            {
            // InternalTw.g:7886:2: ( ruleArgs )
            // InternalTw.g:7887:3: ruleArgs
            {
             before(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getTweets_dateAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tweets_date__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__ProportionPositif__ArgsAssignment_3_2"
    // InternalTw.g:7896:1: rule__ProportionPositif__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__ProportionPositif__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7900:1: ( ( ruleArgs ) )
            // InternalTw.g:7901:2: ( ruleArgs )
            {
            // InternalTw.g:7901:2: ( ruleArgs )
            // InternalTw.g:7902:3: ruleArgs
            {
             before(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__ArgsAssignment_3_2"


    // $ANTLR start "rule__ProportionPositif__ArgsAssignment_3_3_1"
    // InternalTw.g:7911:1: rule__ProportionPositif__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__ProportionPositif__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7915:1: ( ( ruleArgs ) )
            // InternalTw.g:7916:2: ( ruleArgs )
            {
            // InternalTw.g:7916:2: ( ruleArgs )
            // InternalTw.g:7917:3: ruleArgs
            {
             before(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionPositifAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionPositif__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__ProportionNegatif__ArgsAssignment_3_2"
    // InternalTw.g:7926:1: rule__ProportionNegatif__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__ProportionNegatif__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7930:1: ( ( ruleArgs ) )
            // InternalTw.g:7931:2: ( ruleArgs )
            {
            // InternalTw.g:7931:2: ( ruleArgs )
            // InternalTw.g:7932:3: ruleArgs
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__ArgsAssignment_3_2"


    // $ANTLR start "rule__ProportionNegatif__ArgsAssignment_3_3_1"
    // InternalTw.g:7941:1: rule__ProportionNegatif__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__ProportionNegatif__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7945:1: ( ( ruleArgs ) )
            // InternalTw.g:7946:2: ( ruleArgs )
            {
            // InternalTw.g:7946:2: ( ruleArgs )
            // InternalTw.g:7947:3: ruleArgs
            {
             before(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getProportionNegatifAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProportionNegatif__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__CountTweet__ArgsAssignment_3_2"
    // InternalTw.g:7956:1: rule__CountTweet__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__CountTweet__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7960:1: ( ( ruleArgs ) )
            // InternalTw.g:7961:2: ( ruleArgs )
            {
            // InternalTw.g:7961:2: ( ruleArgs )
            // InternalTw.g:7962:3: ruleArgs
            {
             before(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__ArgsAssignment_3_2"


    // $ANTLR start "rule__CountTweet__ArgsAssignment_3_3_1"
    // InternalTw.g:7971:1: rule__CountTweet__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__CountTweet__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7975:1: ( ( ruleArgs ) )
            // InternalTw.g:7976:2: ( ruleArgs )
            {
            // InternalTw.g:7976:2: ( ruleArgs )
            // InternalTw.g:7977:3: ruleArgs
            {
             before(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountTweetAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountTweet__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__CountVisitProfil__ArgsAssignment_3_2"
    // InternalTw.g:7986:1: rule__CountVisitProfil__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__CountVisitProfil__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:7990:1: ( ( ruleArgs ) )
            // InternalTw.g:7991:2: ( ruleArgs )
            {
            // InternalTw.g:7991:2: ( ruleArgs )
            // InternalTw.g:7992:3: ruleArgs
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__ArgsAssignment_3_2"


    // $ANTLR start "rule__CountVisitProfil__ArgsAssignment_3_3_1"
    // InternalTw.g:8001:1: rule__CountVisitProfil__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__CountVisitProfil__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8005:1: ( ( ruleArgs ) )
            // InternalTw.g:8006:2: ( ruleArgs )
            {
            // InternalTw.g:8006:2: ( ruleArgs )
            // InternalTw.g:8007:3: ruleArgs
            {
             before(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCountVisitProfilAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountVisitProfil__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__CroissanceAbonne__ArgsAssignment_3_2"
    // InternalTw.g:8016:1: rule__CroissanceAbonne__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__CroissanceAbonne__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8020:1: ( ( ruleArgs ) )
            // InternalTw.g:8021:2: ( ruleArgs )
            {
            // InternalTw.g:8021:2: ( ruleArgs )
            // InternalTw.g:8022:3: ruleArgs
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__ArgsAssignment_3_2"


    // $ANTLR start "rule__CroissanceAbonne__ArgsAssignment_3_3_1"
    // InternalTw.g:8031:1: rule__CroissanceAbonne__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__CroissanceAbonne__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8035:1: ( ( ruleArgs ) )
            // InternalTw.g:8036:2: ( ruleArgs )
            {
            // InternalTw.g:8036:2: ( ruleArgs )
            // InternalTw.g:8037:3: ruleArgs
            {
             before(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getCroissanceAbonneAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CroissanceAbonne__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__MoyFollowers__ArgsAssignment_3_2"
    // InternalTw.g:8046:1: rule__MoyFollowers__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__MoyFollowers__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8050:1: ( ( ruleArgs ) )
            // InternalTw.g:8051:2: ( ruleArgs )
            {
            // InternalTw.g:8051:2: ( ruleArgs )
            // InternalTw.g:8052:3: ruleArgs
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__ArgsAssignment_3_2"


    // $ANTLR start "rule__MoyFollowers__ArgsAssignment_3_3_1"
    // InternalTw.g:8061:1: rule__MoyFollowers__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__MoyFollowers__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8065:1: ( ( ruleArgs ) )
            // InternalTw.g:8066:2: ( ruleArgs )
            {
            // InternalTw.g:8066:2: ( ruleArgs )
            // InternalTw.g:8067:3: ruleArgs
            {
             before(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFollowersAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFollowers__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__MoyFavorited__ArgsAssignment_3_2"
    // InternalTw.g:8076:1: rule__MoyFavorited__ArgsAssignment_3_2 : ( ruleArgs ) ;
    public final void rule__MoyFavorited__ArgsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8080:1: ( ( ruleArgs ) )
            // InternalTw.g:8081:2: ( ruleArgs )
            {
            // InternalTw.g:8081:2: ( ruleArgs )
            // InternalTw.g:8082:3: ruleArgs
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__ArgsAssignment_3_2"


    // $ANTLR start "rule__MoyFavorited__ArgsAssignment_3_3_1"
    // InternalTw.g:8091:1: rule__MoyFavorited__ArgsAssignment_3_3_1 : ( ruleArgs ) ;
    public final void rule__MoyFavorited__ArgsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8095:1: ( ( ruleArgs ) )
            // InternalTw.g:8096:2: ( ruleArgs )
            {
            // InternalTw.g:8096:2: ( ruleArgs )
            // InternalTw.g:8097:3: ruleArgs
            {
             before(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getMoyFavoritedAccess().getArgsArgsParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoyFavorited__ArgsAssignment_3_3_1"


    // $ANTLR start "rule__Greater__ExpressionGAssignment_3"
    // InternalTw.g:8106:1: rule__Greater__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__Greater__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8110:1: ( ( ruleExpression ) )
            // InternalTw.g:8111:2: ( ruleExpression )
            {
            // InternalTw.g:8111:2: ( ruleExpression )
            // InternalTw.g:8112:3: ruleExpression
            {
             before(grammarAccess.getGreaterAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGreaterAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__ExpressionGAssignment_3"


    // $ANTLR start "rule__Greater__ExpressionDAssignment_5"
    // InternalTw.g:8121:1: rule__Greater__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__Greater__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8125:1: ( ( ruleExpression ) )
            // InternalTw.g:8126:2: ( ruleExpression )
            {
            // InternalTw.g:8126:2: ( ruleExpression )
            // InternalTw.g:8127:3: ruleExpression
            {
             before(grammarAccess.getGreaterAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGreaterAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__ExpressionDAssignment_5"


    // $ANTLR start "rule__Less__ExpressionGAssignment_3"
    // InternalTw.g:8136:1: rule__Less__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__Less__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8140:1: ( ( ruleExpression ) )
            // InternalTw.g:8141:2: ( ruleExpression )
            {
            // InternalTw.g:8141:2: ( ruleExpression )
            // InternalTw.g:8142:3: ruleExpression
            {
             before(grammarAccess.getLessAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLessAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__ExpressionGAssignment_3"


    // $ANTLR start "rule__Less__ExpressionDAssignment_5"
    // InternalTw.g:8151:1: rule__Less__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__Less__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8155:1: ( ( ruleExpression ) )
            // InternalTw.g:8156:2: ( ruleExpression )
            {
            // InternalTw.g:8156:2: ( ruleExpression )
            // InternalTw.g:8157:3: ruleExpression
            {
             before(grammarAccess.getLessAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLessAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__ExpressionDAssignment_5"


    // $ANTLR start "rule__Equal__ExpressionGAssignment_3"
    // InternalTw.g:8166:1: rule__Equal__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8170:1: ( ( ruleExpression ) )
            // InternalTw.g:8171:2: ( ruleExpression )
            {
            // InternalTw.g:8171:2: ( ruleExpression )
            // InternalTw.g:8172:3: ruleExpression
            {
             before(grammarAccess.getEqualAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEqualAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__ExpressionGAssignment_3"


    // $ANTLR start "rule__Equal__ExpressionDAssignment_5"
    // InternalTw.g:8181:1: rule__Equal__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__Equal__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8185:1: ( ( ruleExpression ) )
            // InternalTw.g:8186:2: ( ruleExpression )
            {
            // InternalTw.g:8186:2: ( ruleExpression )
            // InternalTw.g:8187:3: ruleExpression
            {
             before(grammarAccess.getEqualAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEqualAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__ExpressionDAssignment_5"


    // $ANTLR start "rule__SupEgal__ExpressionGAssignment_3"
    // InternalTw.g:8196:1: rule__SupEgal__ExpressionGAssignment_3 : ( ruleExpression ) ;
    public final void rule__SupEgal__ExpressionGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8200:1: ( ( ruleExpression ) )
            // InternalTw.g:8201:2: ( ruleExpression )
            {
            // InternalTw.g:8201:2: ( ruleExpression )
            // InternalTw.g:8202:3: ruleExpression
            {
             before(grammarAccess.getSupEgalAccess().getExpressionGExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSupEgalAccess().getExpressionGExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__ExpressionGAssignment_3"


    // $ANTLR start "rule__SupEgal__ExpressionDAssignment_5"
    // InternalTw.g:8211:1: rule__SupEgal__ExpressionDAssignment_5 : ( ruleExpression ) ;
    public final void rule__SupEgal__ExpressionDAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8215:1: ( ( ruleExpression ) )
            // InternalTw.g:8216:2: ( ruleExpression )
            {
            // InternalTw.g:8216:2: ( ruleExpression )
            // InternalTw.g:8217:3: ruleExpression
            {
             before(grammarAccess.getSupEgalAccess().getExpressionDExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSupEgalAccess().getExpressionDExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupEgal__ExpressionDAssignment_5"


    // $ANTLR start "rule__Args__ArgAssignment_3_1"
    // InternalTw.g:8226:1: rule__Args__ArgAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Args__ArgAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8230:1: ( ( ruleString0 ) )
            // InternalTw.g:8231:2: ( ruleString0 )
            {
            // InternalTw.g:8231:2: ( ruleString0 )
            // InternalTw.g:8232:3: ruleString0
            {
             before(grammarAccess.getArgsAccess().getArgString0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getArgsAccess().getArgString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__ArgAssignment_3_1"


    // $ANTLR start "rule__Variable__NameVariableAssignment_3_1"
    // InternalTw.g:8241:1: rule__Variable__NameVariableAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Variable__NameVariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTw.g:8245:1: ( ( ruleString0 ) )
            // InternalTw.g:8246:2: ( ruleString0 )
            {
            // InternalTw.g:8246:2: ( ruleString0 )
            // InternalTw.g:8247:3: ruleString0
            {
             before(grammarAccess.getVariableAccess().getNameVariableString0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameVariableString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameVariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00003FFF72630000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000002000L});

}