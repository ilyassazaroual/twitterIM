/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import twitterModel2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterModel2FactoryImpl extends EFactoryImpl implements TwitterModel2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TwitterModel2Factory init() {
		try {
			TwitterModel2Factory theTwitterModel2Factory = (TwitterModel2Factory)EPackage.Registry.INSTANCE.getEFactory(TwitterModel2Package.eNS_URI);
			if (theTwitterModel2Factory != null) {
				return theTwitterModel2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TwitterModel2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterModel2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TwitterModel2Package.PROGRAM: return createProgram();
			case TwitterModel2Package.BLOCK: return createBlock();
			case TwitterModel2Package.IF: return createIf();
			case TwitterModel2Package.DECLARATION_VAR: return createDeclarationVar();
			case TwitterModel2Package.AND: return createAND();
			case TwitterModel2Package.OR: return createOR();
			case TwitterModel2Package.TWEETS_USER: return createtweets_user();
			case TwitterModel2Package.TWEETS_LOCATION: return createtweets_location();
			case TwitterModel2Package.TWEETS_ENTITY: return createtweets_entity();
			case TwitterModel2Package.TWEETS_DATE: return createtweets_date();
			case TwitterModel2Package.PROPORTION_POSITIF: return createProportionPositif();
			case TwitterModel2Package.PROPORTION_NEGATIF: return createProportionNegatif();
			case TwitterModel2Package.COUNT_TWEET: return createcountTweet();
			case TwitterModel2Package.COUNT_VISIT_PROFIL: return createcountVisitProfil();
			case TwitterModel2Package.CROISSANCE_ABONNE: return createCroissanceAbonne();
			case TwitterModel2Package.MOY_FOLLOWERS: return createmoyFollowers();
			case TwitterModel2Package.MOY_FAVORITED: return createmoyFavorited();
			case TwitterModel2Package.GREATER: return createGREATER();
			case TwitterModel2Package.LESS: return createLESS();
			case TwitterModel2Package.EQUALS: return createEQUALS();
			case TwitterModel2Package.UTILISATION_VAR: return createUtilisationVar();
			case TwitterModel2Package.PRINT: return createprint();
			case TwitterModel2Package.STRING_TW: return createStringTw();
			case TwitterModel2Package.ADD: return createADD();
			case TwitterModel2Package.MUL: return createMUL();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationVar createDeclarationVar() {
		DeclarationVarImpl declarationVar = new DeclarationVarImpl();
		return declarationVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AND createAND() {
		ANDImpl and = new ANDImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OR createOR() {
		ORImpl or = new ORImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tweets_user createtweets_user() {
		tweets_userImpl tweets_user = new tweets_userImpl();
		return tweets_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tweets_location createtweets_location() {
		tweets_locationImpl tweets_location = new tweets_locationImpl();
		return tweets_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tweets_entity createtweets_entity() {
		tweets_entityImpl tweets_entity = new tweets_entityImpl();
		return tweets_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tweets_date createtweets_date() {
		tweets_dateImpl tweets_date = new tweets_dateImpl();
		return tweets_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProportionPositif createProportionPositif() {
		ProportionPositifImpl proportionPositif = new ProportionPositifImpl();
		return proportionPositif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProportionNegatif createProportionNegatif() {
		ProportionNegatifImpl proportionNegatif = new ProportionNegatifImpl();
		return proportionNegatif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public countTweet createcountTweet() {
		countTweetImpl countTweet = new countTweetImpl();
		return countTweet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public countVisitProfil createcountVisitProfil() {
		countVisitProfilImpl countVisitProfil = new countVisitProfilImpl();
		return countVisitProfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CroissanceAbonne createCroissanceAbonne() {
		CroissanceAbonneImpl croissanceAbonne = new CroissanceAbonneImpl();
		return croissanceAbonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public moyFollowers createmoyFollowers() {
		moyFollowersImpl moyFollowers = new moyFollowersImpl();
		return moyFollowers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public moyFavorited createmoyFavorited() {
		moyFavoritedImpl moyFavorited = new moyFavoritedImpl();
		return moyFavorited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GREATER createGREATER() {
		GREATERImpl greater = new GREATERImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LESS createLESS() {
		LESSImpl less = new LESSImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQUALS createEQUALS() {
		EQUALSImpl equals = new EQUALSImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilisationVar createUtilisationVar() {
		UtilisationVarImpl utilisationVar = new UtilisationVarImpl();
		return utilisationVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public print createprint() {
		printImpl print = new printImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTw createStringTw() {
		StringTwImpl stringTw = new StringTwImpl();
		return stringTw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADD createADD() {
		ADDImpl add = new ADDImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MUL createMUL() {
		MULImpl mul = new MULImpl();
		return mul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterModel2Package getTwitterModel2Package() {
		return (TwitterModel2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TwitterModel2Package getPackage() {
		return TwitterModel2Package.eINSTANCE;
	}

} //TwitterModel2FactoryImpl
