/*
 * generated by Xtext 2.10.0
 */
package esir3.im.parser.antlr;

import com.google.inject.Inject;
import esir3.im.parser.antlr.internal.InternalTwParser;
import esir3.im.services.TwGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TwParser extends AbstractAntlrParser {

	@Inject
	private TwGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTwParser createParser(XtextTokenStream stream) {
		return new InternalTwParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public TwGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TwGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
