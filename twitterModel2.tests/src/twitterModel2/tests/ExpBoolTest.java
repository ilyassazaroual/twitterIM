/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.ExpBool;
import twitterModel2.TwitterModel2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exp Bool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpBoolTest extends ExpBinaireTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpBoolTest.class);
	}

	/**
	 * Constructs a new Exp Bool test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBoolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exp Bool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpBool getFixture() {
		return (ExpBool)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createExpBool());
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

} //ExpBoolTest
