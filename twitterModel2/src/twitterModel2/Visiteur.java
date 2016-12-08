package twitterModel2;

import twitterModel2.*;

public abstract class Visiteur {
	public abstract String visite(Program p);
	public abstract String visite(Block b);
	public abstract String visite(If i);
	public abstract String visite(Statement st);
	public abstract String visite(print prnt);
	public abstract String visite(DeclarationVar decVar);
	public abstract String visite(AND and);
	public abstract String visite(OR or);
	public abstract String visite(tweets_user twUsr);
	public abstract String visite(tweets_location twLoc);
	public abstract String visite(tweets_entity twEnt);
	public abstract String visite(tweets_date twDate);
	public abstract String visite(ProportionPositif propPos);
	public abstract String visite(ProportionNegatif propNeg);
	public abstract String visite(countTweet countTw);
	public abstract String visite (countVisitProfil countVisitP);
	public abstract String visite(CroissanceAbonne croisAbn);
	public abstract String visite(moyFollowers moyFlow);
	public abstract String visite(moyFavorited moyFavorite);
	public abstract String visite(GREATER great);
	public abstract String visite(LESS less);
	public abstract String visite(EQUALS equal);
	public abstract String visite(UtilisationVar utilVar);
	public abstract String visite(StringTw strTw);
	public abstract String visite(ADD add);
	public abstract String visite(MUL mul);
//	public abstract String visite(Args arg);
	public abstract String visite(Expression exp);
}
