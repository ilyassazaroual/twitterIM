/**
 */
package twitterModel2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import twitterModel2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see twitterModel2.TwitterModel2Package
 * @generated
 */
public class TwitterModel2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TwitterModel2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterModel2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TwitterModel2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterModel2Switch<Adapter> modelSwitch =
		new TwitterModel2Switch<Adapter>() {
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpBinaire(ExpBinaire object) {
				return createExpBinaireAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseArgs(Args object) {
				return createArgsAdapter();
			}
			@Override
			public Adapter caseOpBool(OpBool object) {
				return createOpBoolAdapter();
			}
			@Override
			public Adapter caseDeclarationVar(DeclarationVar object) {
				return createDeclarationVarAdapter();
			}
			@Override
			public Adapter caseAND(AND object) {
				return createANDAdapter();
			}
			@Override
			public Adapter caseOR(OR object) {
				return createORAdapter();
			}
			@Override
			public Adapter casetweets_user(tweets_user object) {
				return createtweets_userAdapter();
			}
			@Override
			public Adapter casetweets_location(tweets_location object) {
				return createtweets_locationAdapter();
			}
			@Override
			public Adapter casetweets_entity(tweets_entity object) {
				return createtweets_entityAdapter();
			}
			@Override
			public Adapter casetweets_date(tweets_date object) {
				return createtweets_dateAdapter();
			}
			@Override
			public Adapter caseCommandStat(CommandStat object) {
				return createCommandStatAdapter();
			}
			@Override
			public Adapter caseCommandTwitter(CommandTwitter object) {
				return createCommandTwitterAdapter();
			}
			@Override
			public Adapter caseProportionPositif(ProportionPositif object) {
				return createProportionPositifAdapter();
			}
			@Override
			public Adapter caseProportionNegatif(ProportionNegatif object) {
				return createProportionNegatifAdapter();
			}
			@Override
			public Adapter casecountTweet(countTweet object) {
				return createcountTweetAdapter();
			}
			@Override
			public Adapter casecountVisitProfil(countVisitProfil object) {
				return createcountVisitProfilAdapter();
			}
			@Override
			public Adapter caseCroissanceAbonne(CroissanceAbonne object) {
				return createCroissanceAbonneAdapter();
			}
			@Override
			public Adapter casemoyFollowers(moyFollowers object) {
				return createmoyFollowersAdapter();
			}
			@Override
			public Adapter casemoyFavorited(moyFavorited object) {
				return createmoyFavoritedAdapter();
			}
			@Override
			public Adapter caseGREATER(GREATER object) {
				return createGREATERAdapter();
			}
			@Override
			public Adapter caseLESS(LESS object) {
				return createLESSAdapter();
			}
			@Override
			public Adapter caseEQUALS(EQUALS object) {
				return createEQUALSAdapter();
			}
			@Override
			public Adapter caseUtilisationVar(UtilisationVar object) {
				return createUtilisationVarAdapter();
			}
			@Override
			public Adapter caseprint(print object) {
				return createprintAdapter();
			}
			@Override
			public Adapter caseStringTw(StringTw object) {
				return createStringTwAdapter();
			}
			@Override
			public Adapter caseADD(ADD object) {
				return createADDAdapter();
			}
			@Override
			public Adapter caseMUL(MUL object) {
				return createMULAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.ExpBinaire <em>Exp Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.ExpBinaire
	 * @generated
	 */
	public Adapter createExpBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.Args <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.Args
	 * @generated
	 */
	public Adapter createArgsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.OpBool <em>Op Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.OpBool
	 * @generated
	 */
	public Adapter createOpBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.DeclarationVar <em>Declaration Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.DeclarationVar
	 * @generated
	 */
	public Adapter createDeclarationVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.AND
	 * @generated
	 */
	public Adapter createANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.OR
	 * @generated
	 */
	public Adapter createORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.tweets_user <em>tweets user</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.tweets_user
	 * @generated
	 */
	public Adapter createtweets_userAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.tweets_location <em>tweets location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.tweets_location
	 * @generated
	 */
	public Adapter createtweets_locationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.tweets_entity <em>tweets entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.tweets_entity
	 * @generated
	 */
	public Adapter createtweets_entityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.tweets_date <em>tweets date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.tweets_date
	 * @generated
	 */
	public Adapter createtweets_dateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.CommandStat <em>Command Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.CommandStat
	 * @generated
	 */
	public Adapter createCommandStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.CommandTwitter <em>Command Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.CommandTwitter
	 * @generated
	 */
	public Adapter createCommandTwitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.ProportionPositif <em>Proportion Positif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.ProportionPositif
	 * @generated
	 */
	public Adapter createProportionPositifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.ProportionNegatif <em>Proportion Negatif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.ProportionNegatif
	 * @generated
	 */
	public Adapter createProportionNegatifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.countTweet <em>count Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.countTweet
	 * @generated
	 */
	public Adapter createcountTweetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.countVisitProfil <em>count Visit Profil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.countVisitProfil
	 * @generated
	 */
	public Adapter createcountVisitProfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.CroissanceAbonne <em>Croissance Abonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.CroissanceAbonne
	 * @generated
	 */
	public Adapter createCroissanceAbonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.moyFollowers <em>moy Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.moyFollowers
	 * @generated
	 */
	public Adapter createmoyFollowersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.moyFavorited <em>moy Favorited</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.moyFavorited
	 * @generated
	 */
	public Adapter createmoyFavoritedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.GREATER <em>GREATER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.GREATER
	 * @generated
	 */
	public Adapter createGREATERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.LESS <em>LESS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.LESS
	 * @generated
	 */
	public Adapter createLESSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.EQUALS <em>EQUALS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.EQUALS
	 * @generated
	 */
	public Adapter createEQUALSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.UtilisationVar <em>Utilisation Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.UtilisationVar
	 * @generated
	 */
	public Adapter createUtilisationVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.print <em>print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.print
	 * @generated
	 */
	public Adapter createprintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.StringTw <em>String Tw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.StringTw
	 * @generated
	 */
	public Adapter createStringTwAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.ADD <em>ADD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.ADD
	 * @generated
	 */
	public Adapter createADDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterModel2.MUL <em>MUL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterModel2.MUL
	 * @generated
	 */
	public Adapter createMULAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TwitterModel2AdapterFactory
