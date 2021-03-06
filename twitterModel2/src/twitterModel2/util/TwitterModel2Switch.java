/**
 */
package twitterModel2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import twitterModel2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see twitterModel2.TwitterModel2Package
 * @generated
 */
public class TwitterModel2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TwitterModel2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterModel2Switch() {
		if (modelPackage == null) {
			modelPackage = TwitterModel2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TwitterModel2Package.PROGRAM: {
				Program program = (Program)theEObject;
				T result = caseProgram(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseStatement(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseStatement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.EXP_BINAIRE: {
				ExpBinaire expBinaire = (ExpBinaire)theEObject;
				T result = caseExpBinaire(expBinaire);
				if (result == null) result = caseExpression(expBinaire);
				if (result == null) result = caseStatement(expBinaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = caseExpression(command);
				if (result == null) result = caseStatement(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.OP_BOOL: {
				OpBool opBool = (OpBool)theEObject;
				T result = caseOpBool(opBool);
				if (result == null) result = caseExpBinaire(opBool);
				if (result == null) result = caseExpression(opBool);
				if (result == null) result = caseStatement(opBool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.DECLARATION_VAR: {
				DeclarationVar declarationVar = (DeclarationVar)theEObject;
				T result = caseDeclarationVar(declarationVar);
				if (result == null) result = caseStatement(declarationVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.AND: {
				AND and = (AND)theEObject;
				T result = caseAND(and);
				if (result == null) result = caseOpBool(and);
				if (result == null) result = caseExpBinaire(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = caseStatement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.OR: {
				OR or = (OR)theEObject;
				T result = caseOR(or);
				if (result == null) result = caseOpBool(or);
				if (result == null) result = caseExpBinaire(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = caseStatement(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.TWEETS_USER: {
				tweets_user tweets_user = (tweets_user)theEObject;
				T result = casetweets_user(tweets_user);
				if (result == null) result = caseCommandTwitter(tweets_user);
				if (result == null) result = caseCommand(tweets_user);
				if (result == null) result = caseExpression(tweets_user);
				if (result == null) result = caseStatement(tweets_user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.TWEETS_LOCATION: {
				tweets_location tweets_location = (tweets_location)theEObject;
				T result = casetweets_location(tweets_location);
				if (result == null) result = caseCommandTwitter(tweets_location);
				if (result == null) result = caseCommand(tweets_location);
				if (result == null) result = caseExpression(tweets_location);
				if (result == null) result = caseStatement(tweets_location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.TWEETS_ENTITY: {
				tweets_entity tweets_entity = (tweets_entity)theEObject;
				T result = casetweets_entity(tweets_entity);
				if (result == null) result = caseCommandTwitter(tweets_entity);
				if (result == null) result = caseCommand(tweets_entity);
				if (result == null) result = caseExpression(tweets_entity);
				if (result == null) result = caseStatement(tweets_entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.TWEETS_DATE: {
				tweets_date tweets_date = (tweets_date)theEObject;
				T result = casetweets_date(tweets_date);
				if (result == null) result = caseCommandTwitter(tweets_date);
				if (result == null) result = caseCommand(tweets_date);
				if (result == null) result = caseExpression(tweets_date);
				if (result == null) result = caseStatement(tweets_date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.COMMAND_STAT: {
				CommandStat commandStat = (CommandStat)theEObject;
				T result = caseCommandStat(commandStat);
				if (result == null) result = caseCommand(commandStat);
				if (result == null) result = caseExpression(commandStat);
				if (result == null) result = caseStatement(commandStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.COMMAND_TWITTER: {
				CommandTwitter commandTwitter = (CommandTwitter)theEObject;
				T result = caseCommandTwitter(commandTwitter);
				if (result == null) result = caseCommand(commandTwitter);
				if (result == null) result = caseExpression(commandTwitter);
				if (result == null) result = caseStatement(commandTwitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.PROPORTION_POSITIF: {
				ProportionPositif proportionPositif = (ProportionPositif)theEObject;
				T result = caseProportionPositif(proportionPositif);
				if (result == null) result = caseCommandStat(proportionPositif);
				if (result == null) result = caseCommand(proportionPositif);
				if (result == null) result = caseExpression(proportionPositif);
				if (result == null) result = caseStatement(proportionPositif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.PROPORTION_NEGATIF: {
				ProportionNegatif proportionNegatif = (ProportionNegatif)theEObject;
				T result = caseProportionNegatif(proportionNegatif);
				if (result == null) result = caseCommandStat(proportionNegatif);
				if (result == null) result = caseCommand(proportionNegatif);
				if (result == null) result = caseExpression(proportionNegatif);
				if (result == null) result = caseStatement(proportionNegatif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.COUNT_TWEET: {
				countTweet countTweet = (countTweet)theEObject;
				T result = casecountTweet(countTweet);
				if (result == null) result = caseCommandStat(countTweet);
				if (result == null) result = caseCommand(countTweet);
				if (result == null) result = caseExpression(countTweet);
				if (result == null) result = caseStatement(countTweet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.COUNT_VISIT_PROFIL: {
				countVisitProfil countVisitProfil = (countVisitProfil)theEObject;
				T result = casecountVisitProfil(countVisitProfil);
				if (result == null) result = caseCommandStat(countVisitProfil);
				if (result == null) result = caseCommand(countVisitProfil);
				if (result == null) result = caseExpression(countVisitProfil);
				if (result == null) result = caseStatement(countVisitProfil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.CROISSANCE_ABONNE: {
				CroissanceAbonne croissanceAbonne = (CroissanceAbonne)theEObject;
				T result = caseCroissanceAbonne(croissanceAbonne);
				if (result == null) result = caseCommandStat(croissanceAbonne);
				if (result == null) result = caseCommand(croissanceAbonne);
				if (result == null) result = caseExpression(croissanceAbonne);
				if (result == null) result = caseStatement(croissanceAbonne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.MOY_FOLLOWERS: {
				moyFollowers moyFollowers = (moyFollowers)theEObject;
				T result = casemoyFollowers(moyFollowers);
				if (result == null) result = caseCommandStat(moyFollowers);
				if (result == null) result = caseCommand(moyFollowers);
				if (result == null) result = caseExpression(moyFollowers);
				if (result == null) result = caseStatement(moyFollowers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.MOY_FAVORITED: {
				moyFavorited moyFavorited = (moyFavorited)theEObject;
				T result = casemoyFavorited(moyFavorited);
				if (result == null) result = caseCommandStat(moyFavorited);
				if (result == null) result = caseCommand(moyFavorited);
				if (result == null) result = caseExpression(moyFavorited);
				if (result == null) result = caseStatement(moyFavorited);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.GREATER: {
				GREATER greater = (GREATER)theEObject;
				T result = caseGREATER(greater);
				if (result == null) result = caseOpBool(greater);
				if (result == null) result = caseExpBinaire(greater);
				if (result == null) result = caseExpression(greater);
				if (result == null) result = caseStatement(greater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.LESS: {
				LESS less = (LESS)theEObject;
				T result = caseLESS(less);
				if (result == null) result = caseOpBool(less);
				if (result == null) result = caseExpBinaire(less);
				if (result == null) result = caseExpression(less);
				if (result == null) result = caseStatement(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.EQUALS: {
				EQUALS equals = (EQUALS)theEObject;
				T result = caseEQUALS(equals);
				if (result == null) result = caseOpBool(equals);
				if (result == null) result = caseExpBinaire(equals);
				if (result == null) result = caseExpression(equals);
				if (result == null) result = caseStatement(equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.UTILISATION_VAR: {
				UtilisationVar utilisationVar = (UtilisationVar)theEObject;
				T result = caseUtilisationVar(utilisationVar);
				if (result == null) result = caseExpression(utilisationVar);
				if (result == null) result = caseStatement(utilisationVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.PRINT: {
				print print = (print)theEObject;
				T result = caseprint(print);
				if (result == null) result = caseStatement(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.STRING_TW: {
				StringTw stringTw = (StringTw)theEObject;
				T result = caseStringTw(stringTw);
				if (result == null) result = caseExpression(stringTw);
				if (result == null) result = caseStatement(stringTw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.ADD: {
				ADD add = (ADD)theEObject;
				T result = caseADD(add);
				if (result == null) result = caseExpBinaire(add);
				if (result == null) result = caseExpression(add);
				if (result == null) result = caseStatement(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterModel2Package.MUL: {
				MUL mul = (MUL)theEObject;
				T result = caseMUL(mul);
				if (result == null) result = caseExpBinaire(mul);
				if (result == null) result = caseExpression(mul);
				if (result == null) result = caseStatement(mul);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpBinaire(ExpBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpBool(OpBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationVar(DeclarationVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAND(AND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOR(OR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tweets user</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tweets user</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetweets_user(tweets_user object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tweets location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tweets location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetweets_location(tweets_location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tweets entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tweets entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetweets_entity(tweets_entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tweets date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tweets date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetweets_date(tweets_date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandStat(CommandStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Twitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Twitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandTwitter(CommandTwitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proportion Positif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proportion Positif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProportionPositif(ProportionPositif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proportion Negatif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proportion Negatif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProportionNegatif(ProportionNegatif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>count Tweet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>count Tweet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecountTweet(countTweet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>count Visit Profil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>count Visit Profil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecountVisitProfil(countVisitProfil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Croissance Abonne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Croissance Abonne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCroissanceAbonne(CroissanceAbonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>moy Followers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>moy Followers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemoyFollowers(moyFollowers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>moy Favorited</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>moy Favorited</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemoyFavorited(moyFavorited object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GREATER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GREATER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGREATER(GREATER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LESS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LESS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLESS(LESS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EQUALS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EQUALS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEQUALS(EQUALS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilisation Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilisation Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilisationVar(UtilisationVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprint(print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Tw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Tw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringTw(StringTw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADD(ADD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MUL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MUL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMUL(MUL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TwitterModel2Switch
