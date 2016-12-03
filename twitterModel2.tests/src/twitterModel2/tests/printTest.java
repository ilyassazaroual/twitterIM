/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.TwitterModel2Factory;
import twitterModel2.print;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>print</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class printTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(printTest.class);
	}

	/**
	 * Constructs a new print test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public printTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this print test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected print getFixture() {
		return (print)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createprint());
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

} //printTest
