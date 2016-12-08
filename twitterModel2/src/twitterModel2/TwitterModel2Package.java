/**
 */
package twitterModel2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see twitterModel2.TwitterModel2Factory
 * @model kind="package"
 * @generated
 */
public interface TwitterModel2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "twitterModel2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/twitterModel2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "twitterModel2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterModel2Package eINSTANCE = twitterModel2.impl.TwitterModel2PackageImpl.init();

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ProgramImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.StatementImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.BlockImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.IfImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getIf()
	 * @generated
	 */
	int IF = 3;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ExpressionImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ExpBinaireImpl <em>Exp Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ExpBinaireImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getExpBinaire()
	 * @generated
	 */
	int EXP_BINAIRE = 5;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BINAIRE__EXP1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BINAIRE__EXP2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exp Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BINAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exp Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BINAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.CommandImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ARGS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.OpBoolImpl <em>Op Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.OpBoolImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOpBool()
	 * @generated
	 */
	int OP_BOOL = 7;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL__EXP1 = EXP_BINAIRE__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL__EXP2 = EXP_BINAIRE__EXP2;

	/**
	 * The number of structural features of the '<em>Op Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL_FEATURE_COUNT = EXP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Op Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL_OPERATION_COUNT = EXP_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.DeclarationVarImpl <em>Declaration Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.DeclarationVarImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getDeclarationVar()
	 * @generated
	 */
	int DECLARATION_VAR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VAR__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op Droite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VAR__OP_DROITE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declaration Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Declaration Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_VAR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ANDImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getAND()
	 * @generated
	 */
	int AND = 9;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXP1 = OP_BOOL__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXP2 = OP_BOOL__EXP2;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ORImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOR()
	 * @generated
	 */
	int OR = 10;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXP1 = OP_BOOL__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXP2 = OP_BOOL__EXP2;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.CommandTwitterImpl <em>Command Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.CommandTwitterImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommandTwitter()
	 * @generated
	 */
	int COMMAND_TWITTER = 16;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TWITTER__ARGS = COMMAND__ARGS;

	/**
	 * The number of structural features of the '<em>Command Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TWITTER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TWITTER_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.tweets_userImpl <em>tweets user</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.tweets_userImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_user()
	 * @generated
	 */
	int TWEETS_USER = 11;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_USER__ARGS = COMMAND_TWITTER__ARGS;

	/**
	 * The number of structural features of the '<em>tweets user</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_USER_FEATURE_COUNT = COMMAND_TWITTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>tweets user</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_USER_OPERATION_COUNT = COMMAND_TWITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.tweets_locationImpl <em>tweets location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.tweets_locationImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_location()
	 * @generated
	 */
	int TWEETS_LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_LOCATION__ARGS = COMMAND_TWITTER__ARGS;

	/**
	 * The number of structural features of the '<em>tweets location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_LOCATION_FEATURE_COUNT = COMMAND_TWITTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>tweets location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_LOCATION_OPERATION_COUNT = COMMAND_TWITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.tweets_entityImpl <em>tweets entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.tweets_entityImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_entity()
	 * @generated
	 */
	int TWEETS_ENTITY = 13;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_ENTITY__ARGS = COMMAND_TWITTER__ARGS;

	/**
	 * The number of structural features of the '<em>tweets entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_ENTITY_FEATURE_COUNT = COMMAND_TWITTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>tweets entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_ENTITY_OPERATION_COUNT = COMMAND_TWITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.tweets_dateImpl <em>tweets date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.tweets_dateImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_date()
	 * @generated
	 */
	int TWEETS_DATE = 14;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_DATE__ARGS = COMMAND_TWITTER__ARGS;

	/**
	 * The number of structural features of the '<em>tweets date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_DATE_FEATURE_COUNT = COMMAND_TWITTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>tweets date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEETS_DATE_OPERATION_COUNT = COMMAND_TWITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.CommandStatImpl <em>Command Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.CommandStatImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommandStat()
	 * @generated
	 */
	int COMMAND_STAT = 15;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STAT__ARGS = COMMAND__ARGS;

	/**
	 * The number of structural features of the '<em>Command Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STAT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STAT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ProportionPositifImpl <em>Proportion Positif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ProportionPositifImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getProportionPositif()
	 * @generated
	 */
	int PROPORTION_POSITIF = 17;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTION_POSITIF__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>Proportion Positif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTION_POSITIF_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proportion Positif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTION_POSITIF_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ProportionNegatifImpl <em>Proportion Negatif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ProportionNegatifImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getProportionNegatif()
	 * @generated
	 */
	int PROPORTION_NEGATIF = 18;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTION_NEGATIF__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>Proportion Negatif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTION_NEGATIF_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proportion Negatif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTION_NEGATIF_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.countTweetImpl <em>count Tweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.countTweetImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getcountTweet()
	 * @generated
	 */
	int COUNT_TWEET = 19;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_TWEET__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>count Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_TWEET_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>count Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_TWEET_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.countVisitProfilImpl <em>count Visit Profil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.countVisitProfilImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getcountVisitProfil()
	 * @generated
	 */
	int COUNT_VISIT_PROFIL = 20;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_VISIT_PROFIL__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>count Visit Profil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_VISIT_PROFIL_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>count Visit Profil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_VISIT_PROFIL_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.CroissanceAbonneImpl <em>Croissance Abonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.CroissanceAbonneImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCroissanceAbonne()
	 * @generated
	 */
	int CROISSANCE_ABONNE = 21;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROISSANCE_ABONNE__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>Croissance Abonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROISSANCE_ABONNE_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Croissance Abonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROISSANCE_ABONNE_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.moyFollowersImpl <em>moy Followers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.moyFollowersImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getmoyFollowers()
	 * @generated
	 */
	int MOY_FOLLOWERS = 22;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOY_FOLLOWERS__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>moy Followers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOY_FOLLOWERS_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>moy Followers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOY_FOLLOWERS_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.moyFavoritedImpl <em>moy Favorited</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.moyFavoritedImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getmoyFavorited()
	 * @generated
	 */
	int MOY_FAVORITED = 23;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOY_FAVORITED__ARGS = COMMAND_STAT__ARGS;

	/**
	 * The number of structural features of the '<em>moy Favorited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOY_FAVORITED_FEATURE_COUNT = COMMAND_STAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>moy Favorited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOY_FAVORITED_OPERATION_COUNT = COMMAND_STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.GREATERImpl <em>GREATER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.GREATERImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getGREATER()
	 * @generated
	 */
	int GREATER = 24;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__EXP1 = OP_BOOL__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__EXP2 = OP_BOOL__EXP2;

	/**
	 * The number of structural features of the '<em>GREATER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GREATER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.LESSImpl <em>LESS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.LESSImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getLESS()
	 * @generated
	 */
	int LESS = 25;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__EXP1 = OP_BOOL__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__EXP2 = OP_BOOL__EXP2;

	/**
	 * The number of structural features of the '<em>LESS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LESS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.EQUALSImpl <em>EQUALS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.EQUALSImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getEQUALS()
	 * @generated
	 */
	int EQUALS = 26;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__EXP1 = OP_BOOL__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__EXP2 = OP_BOOL__EXP2;

	/**
	 * The number of structural features of the '<em>EQUALS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EQUALS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.UtilisationVarImpl <em>Utilisation Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.UtilisationVarImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getUtilisationVar()
	 * @generated
	 */
	int UTILISATION_VAR = 27;

	/**
	 * The feature id for the '<em><b>Name Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATION_VAR__NAME_VAR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Utilisation Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATION_VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Utilisation Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATION_VAR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.printImpl <em>print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.printImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getprint()
	 * @generated
	 */
	int PRINT = 28;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.StringTwImpl <em>String Tw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.StringTwImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getStringTw()
	 * @generated
	 */
	int STRING_TW = 29;

	/**
	 * The feature id for the '<em><b>String Tw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TW__STRING_TW = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Tw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Tw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TW_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ADDImpl <em>ADD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ADDImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getADD()
	 * @generated
	 */
	int ADD = 30;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__EXP1 = EXP_BINAIRE__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__EXP2 = EXP_BINAIRE__EXP2;

	/**
	 * The number of structural features of the '<em>ADD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = EXP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ADD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = EXP_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.MULImpl <em>MUL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.MULImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getMUL()
	 * @generated
	 */
	int MUL = 31;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__EXP1 = EXP_BINAIRE__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL__EXP2 = EXP_BINAIRE__EXP2;

	/**
	 * The number of structural features of the '<em>MUL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_FEATURE_COUNT = EXP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MUL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OPERATION_COUNT = EXP_BINAIRE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link twitterModel2.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see twitterModel2.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link twitterModel2.Program#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see twitterModel2.Program#getStatement()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statement();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see twitterModel2.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see twitterModel2.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link twitterModel2.Block#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see twitterModel2.Block#getStatement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statement();

	/**
	 * Returns the meta object for class '{@link twitterModel2.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see twitterModel2.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.If#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see twitterModel2.If#getElseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBlock();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.If#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see twitterModel2.If#getIfBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_IfBlock();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see twitterModel2.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see twitterModel2.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link twitterModel2.ExpBinaire <em>Exp Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Binaire</em>'.
	 * @see twitterModel2.ExpBinaire
	 * @generated
	 */
	EClass getExpBinaire();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.ExpBinaire#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see twitterModel2.ExpBinaire#getExp1()
	 * @see #getExpBinaire()
	 * @generated
	 */
	EReference getExpBinaire_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.ExpBinaire#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see twitterModel2.ExpBinaire#getExp2()
	 * @see #getExpBinaire()
	 * @generated
	 */
	EReference getExpBinaire_Exp2();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see twitterModel2.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link twitterModel2.Command#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see twitterModel2.Command#getArgs()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Args();

	/**
	 * Returns the meta object for class '{@link twitterModel2.OpBool <em>Op Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Bool</em>'.
	 * @see twitterModel2.OpBool
	 * @generated
	 */
	EClass getOpBool();

	/**
	 * Returns the meta object for class '{@link twitterModel2.DeclarationVar <em>Declaration Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Var</em>'.
	 * @see twitterModel2.DeclarationVar
	 * @generated
	 */
	EClass getDeclarationVar();

	/**
	 * Returns the meta object for the attribute '{@link twitterModel2.DeclarationVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see twitterModel2.DeclarationVar#getName()
	 * @see #getDeclarationVar()
	 * @generated
	 */
	EAttribute getDeclarationVar_Name();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.DeclarationVar#getOpDroite <em>Op Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op Droite</em>'.
	 * @see twitterModel2.DeclarationVar#getOpDroite()
	 * @see #getDeclarationVar()
	 * @generated
	 */
	EReference getDeclarationVar_OpDroite();

	/**
	 * Returns the meta object for class '{@link twitterModel2.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see twitterModel2.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link twitterModel2.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see twitterModel2.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link twitterModel2.tweets_user <em>tweets user</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tweets user</em>'.
	 * @see twitterModel2.tweets_user
	 * @generated
	 */
	EClass gettweets_user();

	/**
	 * Returns the meta object for class '{@link twitterModel2.tweets_location <em>tweets location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tweets location</em>'.
	 * @see twitterModel2.tweets_location
	 * @generated
	 */
	EClass gettweets_location();

	/**
	 * Returns the meta object for class '{@link twitterModel2.tweets_entity <em>tweets entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tweets entity</em>'.
	 * @see twitterModel2.tweets_entity
	 * @generated
	 */
	EClass gettweets_entity();

	/**
	 * Returns the meta object for class '{@link twitterModel2.tweets_date <em>tweets date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tweets date</em>'.
	 * @see twitterModel2.tweets_date
	 * @generated
	 */
	EClass gettweets_date();

	/**
	 * Returns the meta object for class '{@link twitterModel2.CommandStat <em>Command Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Stat</em>'.
	 * @see twitterModel2.CommandStat
	 * @generated
	 */
	EClass getCommandStat();

	/**
	 * Returns the meta object for class '{@link twitterModel2.CommandTwitter <em>Command Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Twitter</em>'.
	 * @see twitterModel2.CommandTwitter
	 * @generated
	 */
	EClass getCommandTwitter();

	/**
	 * Returns the meta object for class '{@link twitterModel2.ProportionPositif <em>Proportion Positif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportion Positif</em>'.
	 * @see twitterModel2.ProportionPositif
	 * @generated
	 */
	EClass getProportionPositif();

	/**
	 * Returns the meta object for class '{@link twitterModel2.ProportionNegatif <em>Proportion Negatif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportion Negatif</em>'.
	 * @see twitterModel2.ProportionNegatif
	 * @generated
	 */
	EClass getProportionNegatif();

	/**
	 * Returns the meta object for class '{@link twitterModel2.countTweet <em>count Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>count Tweet</em>'.
	 * @see twitterModel2.countTweet
	 * @generated
	 */
	EClass getcountTweet();

	/**
	 * Returns the meta object for class '{@link twitterModel2.countVisitProfil <em>count Visit Profil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>count Visit Profil</em>'.
	 * @see twitterModel2.countVisitProfil
	 * @generated
	 */
	EClass getcountVisitProfil();

	/**
	 * Returns the meta object for class '{@link twitterModel2.CroissanceAbonne <em>Croissance Abonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Croissance Abonne</em>'.
	 * @see twitterModel2.CroissanceAbonne
	 * @generated
	 */
	EClass getCroissanceAbonne();

	/**
	 * Returns the meta object for class '{@link twitterModel2.moyFollowers <em>moy Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>moy Followers</em>'.
	 * @see twitterModel2.moyFollowers
	 * @generated
	 */
	EClass getmoyFollowers();

	/**
	 * Returns the meta object for class '{@link twitterModel2.moyFavorited <em>moy Favorited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>moy Favorited</em>'.
	 * @see twitterModel2.moyFavorited
	 * @generated
	 */
	EClass getmoyFavorited();

	/**
	 * Returns the meta object for class '{@link twitterModel2.GREATER <em>GREATER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GREATER</em>'.
	 * @see twitterModel2.GREATER
	 * @generated
	 */
	EClass getGREATER();

	/**
	 * Returns the meta object for class '{@link twitterModel2.LESS <em>LESS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LESS</em>'.
	 * @see twitterModel2.LESS
	 * @generated
	 */
	EClass getLESS();

	/**
	 * Returns the meta object for class '{@link twitterModel2.EQUALS <em>EQUALS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EQUALS</em>'.
	 * @see twitterModel2.EQUALS
	 * @generated
	 */
	EClass getEQUALS();

	/**
	 * Returns the meta object for class '{@link twitterModel2.UtilisationVar <em>Utilisation Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisation Var</em>'.
	 * @see twitterModel2.UtilisationVar
	 * @generated
	 */
	EClass getUtilisationVar();

	/**
	 * Returns the meta object for the reference '{@link twitterModel2.UtilisationVar#getNameVar <em>Name Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Var</em>'.
	 * @see twitterModel2.UtilisationVar#getNameVar()
	 * @see #getUtilisationVar()
	 * @generated
	 */
	EReference getUtilisationVar_NameVar();

	/**
	 * Returns the meta object for class '{@link twitterModel2.print <em>print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>print</em>'.
	 * @see twitterModel2.print
	 * @generated
	 */
	EClass getprint();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.print#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see twitterModel2.print#getExpression()
	 * @see #getprint()
	 * @generated
	 */
	EReference getprint_Expression();

	/**
	 * Returns the meta object for class '{@link twitterModel2.StringTw <em>String Tw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Tw</em>'.
	 * @see twitterModel2.StringTw
	 * @generated
	 */
	EClass getStringTw();

	/**
	 * Returns the meta object for the attribute '{@link twitterModel2.StringTw#getStringTw <em>String Tw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Tw</em>'.
	 * @see twitterModel2.StringTw#getStringTw()
	 * @see #getStringTw()
	 * @generated
	 */
	EAttribute getStringTw_StringTw();

	/**
	 * Returns the meta object for class '{@link twitterModel2.ADD <em>ADD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADD</em>'.
	 * @see twitterModel2.ADD
	 * @generated
	 */
	EClass getADD();

	/**
	 * Returns the meta object for class '{@link twitterModel2.MUL <em>MUL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MUL</em>'.
	 * @see twitterModel2.MUL
	 * @generated
	 */
	EClass getMUL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TwitterModel2Factory getTwitterModel2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ProgramImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENT = eINSTANCE.getProgram_Statement();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.StatementImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.BlockImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.IfImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BLOCK = eINSTANCE.getIf_ElseBlock();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF_BLOCK = eINSTANCE.getIf_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ExpressionImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ExpBinaireImpl <em>Exp Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ExpBinaireImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getExpBinaire()
		 * @generated
		 */
		EClass EXP_BINAIRE = eINSTANCE.getExpBinaire();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_BINAIRE__EXP1 = eINSTANCE.getExpBinaire_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_BINAIRE__EXP2 = eINSTANCE.getExpBinaire_Exp2();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.CommandImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__ARGS = eINSTANCE.getCommand_Args();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.OpBoolImpl <em>Op Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.OpBoolImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOpBool()
		 * @generated
		 */
		EClass OP_BOOL = eINSTANCE.getOpBool();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.DeclarationVarImpl <em>Declaration Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.DeclarationVarImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getDeclarationVar()
		 * @generated
		 */
		EClass DECLARATION_VAR = eINSTANCE.getDeclarationVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION_VAR__NAME = eINSTANCE.getDeclarationVar_Name();

		/**
		 * The meta object literal for the '<em><b>Op Droite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_VAR__OP_DROITE = eINSTANCE.getDeclarationVar_OpDroite();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ANDImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ORImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.tweets_userImpl <em>tweets user</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.tweets_userImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_user()
		 * @generated
		 */
		EClass TWEETS_USER = eINSTANCE.gettweets_user();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.tweets_locationImpl <em>tweets location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.tweets_locationImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_location()
		 * @generated
		 */
		EClass TWEETS_LOCATION = eINSTANCE.gettweets_location();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.tweets_entityImpl <em>tweets entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.tweets_entityImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_entity()
		 * @generated
		 */
		EClass TWEETS_ENTITY = eINSTANCE.gettweets_entity();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.tweets_dateImpl <em>tweets date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.tweets_dateImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#gettweets_date()
		 * @generated
		 */
		EClass TWEETS_DATE = eINSTANCE.gettweets_date();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.CommandStatImpl <em>Command Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.CommandStatImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommandStat()
		 * @generated
		 */
		EClass COMMAND_STAT = eINSTANCE.getCommandStat();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.CommandTwitterImpl <em>Command Twitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.CommandTwitterImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommandTwitter()
		 * @generated
		 */
		EClass COMMAND_TWITTER = eINSTANCE.getCommandTwitter();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ProportionPositifImpl <em>Proportion Positif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ProportionPositifImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getProportionPositif()
		 * @generated
		 */
		EClass PROPORTION_POSITIF = eINSTANCE.getProportionPositif();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ProportionNegatifImpl <em>Proportion Negatif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ProportionNegatifImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getProportionNegatif()
		 * @generated
		 */
		EClass PROPORTION_NEGATIF = eINSTANCE.getProportionNegatif();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.countTweetImpl <em>count Tweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.countTweetImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getcountTweet()
		 * @generated
		 */
		EClass COUNT_TWEET = eINSTANCE.getcountTweet();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.countVisitProfilImpl <em>count Visit Profil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.countVisitProfilImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getcountVisitProfil()
		 * @generated
		 */
		EClass COUNT_VISIT_PROFIL = eINSTANCE.getcountVisitProfil();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.CroissanceAbonneImpl <em>Croissance Abonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.CroissanceAbonneImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCroissanceAbonne()
		 * @generated
		 */
		EClass CROISSANCE_ABONNE = eINSTANCE.getCroissanceAbonne();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.moyFollowersImpl <em>moy Followers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.moyFollowersImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getmoyFollowers()
		 * @generated
		 */
		EClass MOY_FOLLOWERS = eINSTANCE.getmoyFollowers();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.moyFavoritedImpl <em>moy Favorited</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.moyFavoritedImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getmoyFavorited()
		 * @generated
		 */
		EClass MOY_FAVORITED = eINSTANCE.getmoyFavorited();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.GREATERImpl <em>GREATER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.GREATERImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getGREATER()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGREATER();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.LESSImpl <em>LESS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.LESSImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getLESS()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLESS();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.EQUALSImpl <em>EQUALS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.EQUALSImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getEQUALS()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEQUALS();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.UtilisationVarImpl <em>Utilisation Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.UtilisationVarImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getUtilisationVar()
		 * @generated
		 */
		EClass UTILISATION_VAR = eINSTANCE.getUtilisationVar();

		/**
		 * The meta object literal for the '<em><b>Name Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATION_VAR__NAME_VAR = eINSTANCE.getUtilisationVar_NameVar();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.printImpl <em>print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.printImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getprint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getprint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__EXPRESSION = eINSTANCE.getprint_Expression();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.StringTwImpl <em>String Tw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.StringTwImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getStringTw()
		 * @generated
		 */
		EClass STRING_TW = eINSTANCE.getStringTw();

		/**
		 * The meta object literal for the '<em><b>String Tw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TW__STRING_TW = eINSTANCE.getStringTw_StringTw();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ADDImpl <em>ADD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ADDImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getADD()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getADD();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.MULImpl <em>MUL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.MULImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getMUL()
		 * @generated
		 */
		EClass MUL = eINSTANCE.getMUL();

	}

} //TwitterModel2Package
