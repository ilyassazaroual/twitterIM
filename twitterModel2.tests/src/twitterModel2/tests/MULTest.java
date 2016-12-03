/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.MUL;
import twitterModel2.TwitterModel2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MUL</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MULTest extends ExpBinaireTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MULTest.class);
	}

	/**
	 * Constructs a new MUL test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MULTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MUL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MUL getFixture() {
		return (MUL)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createMUL());
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

} //MULTest
