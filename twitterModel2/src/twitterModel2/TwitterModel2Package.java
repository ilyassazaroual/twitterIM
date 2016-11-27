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
	 * The number of structural features of the '<em>Exp Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BINAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link twitterModel2.impl.ArgsImpl <em>Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ArgsImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getArgs()
	 * @generated
	 */
	int ARGS = 7;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS__ARG = 0;

	/**
	 * The number of structural features of the '<em>Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.ConstImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getConst()
	 * @generated
	 */
	int CONST = 8;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.OpBoolImpl <em>Op Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.OpBoolImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOpBool()
	 * @generated
	 */
	int OP_BOOL = 9;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL__EXPRESSION_G = EXP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL__EXPRESSION_D = EXP_BINAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Op Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL_FEATURE_COUNT = EXP_BINAIRE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Op Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BOOL_OPERATION_COUNT = EXP_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.AffectationImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__VARIABLE = EXP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op Droite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__OP_DROITE = EXP_BINAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = EXP_BINAIRE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_OPERATION_COUNT = EXP_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.VariableImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME_VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.AndImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getAnd()
	 * @generated
	 */
	int AND = 12;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.OrImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOr()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.XorImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getXor()
	 * @generated
	 */
	int XOR = 14;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.CommandTwitterImpl <em>Command Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.CommandTwitterImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getCommandTwitter()
	 * @generated
	 */
	int COMMAND_TWITTER = 20;

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
	int TWEETS_USER = 15;

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
	int TWEETS_LOCATION = 16;

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
	int TWEETS_ENTITY = 17;

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
	int TWEETS_DATE = 18;

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
	int COMMAND_STAT = 19;

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
	int PROPORTION_POSITIF = 21;

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
	int PROPORTION_NEGATIF = 22;

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
	int COUNT_TWEET = 23;

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
	int COUNT_VISIT_PROFIL = 24;

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
	int CROISSANCE_ABONNE = 25;

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
	int MOY_FOLLOWERS = 26;

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
	int MOY_FAVORITED = 27;

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
	 * The meta object id for the '{@link twitterModel2.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.GreaterImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 28;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.LessImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getLess()
	 * @generated
	 */
	int LESS = 29;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.EqualImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 30;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterModel2.impl.SupEgalImpl <em>Sup Egal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterModel2.impl.SupEgalImpl
	 * @see twitterModel2.impl.TwitterModel2PackageImpl#getSupEgal()
	 * @generated
	 */
	int SUP_EGAL = 31;

	/**
	 * The feature id for the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_EGAL__EXPRESSION_G = OP_BOOL__EXPRESSION_G;

	/**
	 * The feature id for the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_EGAL__EXPRESSION_D = OP_BOOL__EXPRESSION_D;

	/**
	 * The number of structural features of the '<em>Sup Egal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_EGAL_FEATURE_COUNT = OP_BOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sup Egal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_EGAL_OPERATION_COUNT = OP_BOOL_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link twitterModel2.Args <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Args</em>'.
	 * @see twitterModel2.Args
	 * @generated
	 */
	EClass getArgs();

	/**
	 * Returns the meta object for the attribute '{@link twitterModel2.Args#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see twitterModel2.Args#getArg()
	 * @see #getArgs()
	 * @generated
	 */
	EAttribute getArgs_Arg();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see twitterModel2.Const
	 * @generated
	 */
	EClass getConst();

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
	 * Returns the meta object for the containment reference '{@link twitterModel2.OpBool#getExpressionG <em>Expression G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression G</em>'.
	 * @see twitterModel2.OpBool#getExpressionG()
	 * @see #getOpBool()
	 * @generated
	 */
	EReference getOpBool_ExpressionG();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.OpBool#getExpressionD <em>Expression D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression D</em>'.
	 * @see twitterModel2.OpBool#getExpressionD()
	 * @see #getOpBool()
	 * @generated
	 */
	EReference getOpBool_ExpressionD();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see twitterModel2.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.Affectation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see twitterModel2.Affectation#getVariable()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link twitterModel2.Affectation#getOpDroite <em>Op Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op Droite</em>'.
	 * @see twitterModel2.Affectation#getOpDroite()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_OpDroite();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see twitterModel2.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link twitterModel2.Variable#getNameVariable <em>Name Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Variable</em>'.
	 * @see twitterModel2.Variable#getNameVariable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_NameVariable();

	/**
	 * Returns the meta object for class '{@link twitterModel2.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see twitterModel2.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see twitterModel2.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see twitterModel2.Xor
	 * @generated
	 */
	EClass getXor();

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
	 * Returns the meta object for class '{@link twitterModel2.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see twitterModel2.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see twitterModel2.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link twitterModel2.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see twitterModel2.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link twitterModel2.SupEgal <em>Sup Egal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sup Egal</em>'.
	 * @see twitterModel2.SupEgal
	 * @generated
	 */
	EClass getSupEgal();

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
		 * The meta object literal for the '{@link twitterModel2.impl.ArgsImpl <em>Args</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ArgsImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getArgs()
		 * @generated
		 */
		EClass ARGS = eINSTANCE.getArgs();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGS__ARG = eINSTANCE.getArgs_Arg();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.ConstImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

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
		 * The meta object literal for the '<em><b>Expression G</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_BOOL__EXPRESSION_G = eINSTANCE.getOpBool_ExpressionG();

		/**
		 * The meta object literal for the '<em><b>Expression D</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_BOOL__EXPRESSION_D = eINSTANCE.getOpBool_ExpressionD();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.AffectationImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__VARIABLE = eINSTANCE.getAffectation_Variable();

		/**
		 * The meta object literal for the '<em><b>Op Droite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__OP_DROITE = eINSTANCE.getAffectation_OpDroite();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.VariableImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME_VARIABLE = eINSTANCE.getVariable_NameVariable();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.AndImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.OrImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.XorImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

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
		 * The meta object literal for the '{@link twitterModel2.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.GreaterImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.LessImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.EqualImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link twitterModel2.impl.SupEgalImpl <em>Sup Egal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterModel2.impl.SupEgalImpl
		 * @see twitterModel2.impl.TwitterModel2PackageImpl#getSupEgal()
		 * @generated
		 */
		EClass SUP_EGAL = eINSTANCE.getSupEgal();

	}

} //TwitterModel2Package
