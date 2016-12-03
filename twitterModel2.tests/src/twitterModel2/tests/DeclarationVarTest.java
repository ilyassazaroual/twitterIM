/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.DeclarationVar;
import twitterModel2.TwitterModel2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Declaration Var</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationVarTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeclarationVarTest.class);
	}

	/**
	 * Constructs a new Declaration Var test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationVarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Declaration Var test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeclarationVar getFixture() {
		return (DeclarationVar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createDeclarationVar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DeclarationVarTest
