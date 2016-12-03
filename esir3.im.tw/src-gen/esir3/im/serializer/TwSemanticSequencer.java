/*
 * generated by Xtext 2.10.0
 */
package esir3.im.serializer;

import com.google.inject.Inject;
import esir3.im.services.TwGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import twitterModel2.ADD;
import twitterModel2.AND;
import twitterModel2.Args;
import twitterModel2.Block;
import twitterModel2.CroissanceAbonne;
import twitterModel2.DeclarationVar;
import twitterModel2.EQUALS;
import twitterModel2.GREATER;
import twitterModel2.If;
import twitterModel2.LESS;
import twitterModel2.MUL;
import twitterModel2.OR;
import twitterModel2.Program;
import twitterModel2.ProportionNegatif;
import twitterModel2.ProportionPositif;
import twitterModel2.StringTw;
import twitterModel2.TwitterModel2Package;
import twitterModel2.UtilisationVar;
import twitterModel2.countTweet;
import twitterModel2.countVisitProfil;
import twitterModel2.moyFavorited;
import twitterModel2.moyFollowers;
import twitterModel2.print;
import twitterModel2.tweets_date;
import twitterModel2.tweets_entity;
import twitterModel2.tweets_location;
import twitterModel2.tweets_user;

@SuppressWarnings("all")
public class TwSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TwGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TwitterModel2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TwitterModel2Package.ADD:
				sequence_ADD(context, (ADD) semanticObject); 
				return; 
			case TwitterModel2Package.AND:
				sequence_AND(context, (AND) semanticObject); 
				return; 
			case TwitterModel2Package.ARGS:
				sequence_Args(context, (Args) semanticObject); 
				return; 
			case TwitterModel2Package.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case TwitterModel2Package.CROISSANCE_ABONNE:
				sequence_CroissanceAbonne(context, (CroissanceAbonne) semanticObject); 
				return; 
			case TwitterModel2Package.DECLARATION_VAR:
				sequence_DeclarationVar(context, (DeclarationVar) semanticObject); 
				return; 
			case TwitterModel2Package.EQUALS:
				sequence_EQUALS(context, (EQUALS) semanticObject); 
				return; 
			case TwitterModel2Package.GREATER:
				sequence_GREATER(context, (GREATER) semanticObject); 
				return; 
			case TwitterModel2Package.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case TwitterModel2Package.LESS:
				sequence_LESS(context, (LESS) semanticObject); 
				return; 
			case TwitterModel2Package.MUL:
				sequence_MUL(context, (MUL) semanticObject); 
				return; 
			case TwitterModel2Package.OR:
				sequence_OR(context, (OR) semanticObject); 
				return; 
			case TwitterModel2Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case TwitterModel2Package.PROPORTION_NEGATIF:
				sequence_ProportionNegatif(context, (ProportionNegatif) semanticObject); 
				return; 
			case TwitterModel2Package.PROPORTION_POSITIF:
				sequence_ProportionPositif(context, (ProportionPositif) semanticObject); 
				return; 
			case TwitterModel2Package.STRING_TW:
				sequence_StringTw(context, (StringTw) semanticObject); 
				return; 
			case TwitterModel2Package.UTILISATION_VAR:
				sequence_UtilisationVar(context, (UtilisationVar) semanticObject); 
				return; 
			case TwitterModel2Package.COUNT_TWEET:
				sequence_countTweet(context, (countTweet) semanticObject); 
				return; 
			case TwitterModel2Package.COUNT_VISIT_PROFIL:
				sequence_countVisitProfil(context, (countVisitProfil) semanticObject); 
				return; 
			case TwitterModel2Package.MOY_FAVORITED:
				sequence_moyFavorited(context, (moyFavorited) semanticObject); 
				return; 
			case TwitterModel2Package.MOY_FOLLOWERS:
				sequence_moyFollowers(context, (moyFollowers) semanticObject); 
				return; 
			case TwitterModel2Package.PRINT:
				sequence_print(context, (print) semanticObject); 
				return; 
			case TwitterModel2Package.TWEETS_DATE:
				sequence_tweets_date(context, (tweets_date) semanticObject); 
				return; 
			case TwitterModel2Package.TWEETS_ENTITY:
				sequence_tweets_entity(context, (tweets_entity) semanticObject); 
				return; 
			case TwitterModel2Package.TWEETS_LOCATION:
				sequence_tweets_location(context, (tweets_location) semanticObject); 
				return; 
			case TwitterModel2Package.TWEETS_USER:
				sequence_tweets_user(context, (tweets_user) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns ADD
	 *     Expression returns ADD
	 *     ADD returns ADD
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_ADD(ISerializationContext context, ADD semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getADDAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getADDAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns AND
	 *     OpBool returns AND
	 *     Expression returns AND
	 *     AND returns AND
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_AND(ISerializationContext context, AND semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getANDAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getANDAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Args returns Args
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Args(ISerializationContext context, Args semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.ARGS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.ARGS__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgsAccess().getExpressionExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Block
	 *     Block returns Block
	 *
	 * Constraint:
	 *     (statement+=Statement statement+=Statement*)?
	 */
	protected void sequence_Block(ISerializationContext context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns CroissanceAbonne
	 *     Expression returns CroissanceAbonne
	 *     CroissanceAbonne returns CroissanceAbonne
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_CroissanceAbonne(ISerializationContext context, CroissanceAbonne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DeclarationVar
	 *     DeclarationVar returns DeclarationVar
	 *
	 * Constraint:
	 *     (name=String0? opDroite=Expression)
	 */
	protected void sequence_DeclarationVar(ISerializationContext context, DeclarationVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns EQUALS
	 *     OpBool returns EQUALS
	 *     Expression returns EQUALS
	 *     EQUALS returns EQUALS
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_EQUALS(ISerializationContext context, EQUALS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEQUALSAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getEQUALSAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GREATER
	 *     OpBool returns GREATER
	 *     Expression returns GREATER
	 *     GREATER returns GREATER
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_GREATER(ISerializationContext context, GREATER semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGREATERAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getGREATERAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (condition=OpBool ifBlock=Block elseBlock=Block?)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LESS
	 *     OpBool returns LESS
	 *     Expression returns LESS
	 *     LESS returns LESS
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_LESS(ISerializationContext context, LESS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLESSAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getLESSAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MUL
	 *     Expression returns MUL
	 *     MUL returns MUL
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_MUL(ISerializationContext context, MUL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMULAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getMULAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OR
	 *     OpBool returns OR
	 *     Expression returns OR
	 *     OR returns OR
	 *
	 * Constraint:
	 *     (exp1=Expression exp2=Expression)
	 */
	protected void sequence_OR(ISerializationContext context, OR semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP1));
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.EXP_BINAIRE__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getORAccess().getExp1ExpressionParserRuleCall_2_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getORAccess().getExp2ExpressionParserRuleCall_4_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (statement+=Statement statement+=Statement*)?
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ProportionNegatif
	 *     Expression returns ProportionNegatif
	 *     ProportionNegatif returns ProportionNegatif
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_ProportionNegatif(ISerializationContext context, ProportionNegatif semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ProportionPositif
	 *     Expression returns ProportionPositif
	 *     ProportionPositif returns ProportionPositif
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_ProportionPositif(ISerializationContext context, ProportionPositif semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns StringTw
	 *     Expression returns StringTw
	 *     StringTw returns StringTw
	 *
	 * Constraint:
	 *     stringTw=STRING
	 */
	protected void sequence_StringTw(ISerializationContext context, StringTw semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.STRING_TW__STRING_TW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.STRING_TW__STRING_TW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringTwAccess().getStringTwSTRINGTerminalRuleCall_0(), semanticObject.getStringTw());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns UtilisationVar
	 *     Expression returns UtilisationVar
	 *     UtilisationVar returns UtilisationVar
	 *
	 * Constraint:
	 *     nameVar=[DeclarationVar|ID]
	 */
	protected void sequence_UtilisationVar(ISerializationContext context, UtilisationVar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.UTILISATION_VAR__NAME_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.UTILISATION_VAR__NAME_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUtilisationVarAccess().getNameVarDeclarationVarIDTerminalRuleCall_0_1(), semanticObject.getNameVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns countTweet
	 *     Expression returns countTweet
	 *     countTweet returns countTweet
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_countTweet(ISerializationContext context, countTweet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns countVisitProfil
	 *     Expression returns countVisitProfil
	 *     countVisitProfil returns countVisitProfil
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_countVisitProfil(ISerializationContext context, countVisitProfil semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns moyFavorited
	 *     Expression returns moyFavorited
	 *     moyFavorited returns moyFavorited
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_moyFavorited(ISerializationContext context, moyFavorited semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns moyFollowers
	 *     Expression returns moyFollowers
	 *     moyFollowers returns moyFollowers
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_moyFollowers(ISerializationContext context, moyFollowers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns print
	 *     print returns print
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_print(ISerializationContext context, print semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TwitterModel2Package.Literals.PRINT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterModel2Package.Literals.PRINT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns tweets_date
	 *     Expression returns tweets_date
	 *     tweets_date returns tweets_date
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_tweets_date(ISerializationContext context, tweets_date semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns tweets_entity
	 *     Expression returns tweets_entity
	 *     tweets_entity returns tweets_entity
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_tweets_entity(ISerializationContext context, tweets_entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns tweets_location
	 *     Expression returns tweets_location
	 *     tweets_location returns tweets_location
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_tweets_location(ISerializationContext context, tweets_location semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns tweets_user
	 *     Expression returns tweets_user
	 *     tweets_user returns tweets_user
	 *
	 * Constraint:
	 *     (args+=Args args+=Args*)?
	 */
	protected void sequence_tweets_user(ISerializationContext context, tweets_user semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
