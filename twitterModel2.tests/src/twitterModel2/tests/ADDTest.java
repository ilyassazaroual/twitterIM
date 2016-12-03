/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.ADD;
import twitterModel2.TwitterModel2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ADD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADDTest extends ExpBinaireTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ADDTest.class);
	}

	/**
	 * Constructs a new ADD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ADD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ADD getFixture() {
		return (ADD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createADD());
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

} //ADDTest
