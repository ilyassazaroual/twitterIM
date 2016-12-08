package twitterModel2;

import twitterModel2.ADD;
import twitterModel2.AND;
//import twitterModel2.Args;
import twitterModel2.Block;
import twitterModel2.CroissanceAbonne;
import twitterModel2.DeclarationVar;
import twitterModel2.EQUALS;
import twitterModel2.Expression;
import twitterModel2.GREATER;
import twitterModel2.If;
import twitterModel2.LESS;
import twitterModel2.MUL;
import twitterModel2.OR;
import twitterModel2.Program;
import twitterModel2.ProportionNegatif;
import twitterModel2.ProportionPositif;
import twitterModel2.Statement;
import twitterModel2.StringTw;
import twitterModel2.UtilisationVar;
import twitterModel2.countTweet;
import twitterModel2.countVisitProfil;
import twitterModel2.moyFavorited;
import twitterModel2.moyFollowers;
import twitterModel2.print;
import twitterModel2.tweets_date;
import twitterModel2.tweets_entity;
import twitterModel2.tweets_location;
import twitterModel2.tweets_user;

public class VisiteurCodeJava extends Visiteur {
	private TabSymbole tabSymbole;
	private int cptParams;
	public VisiteurCodeJava(TabSymbole tabSymbole) {
		super();
		this.tabSymbole = tabSymbole;
		this.cptParams = 0;
	}

	@Override
	public String visite(Program p) {
		String res = "public class MainClass {\n"+
					  "public static void main(String[] args) {\n";
		//A faire : déclaarer les variables***************!!!!!!
		for(String s : tabSymbole.getTabSymb()){
			res += "String "+s+"= new String();\n";
		}
		return res;
	}

/*	@Override
	public String visite(Statement st) {
		// TODO Auto-generated method stub
		
		return null;
	}*/

	@Override
	public String visite(If i) {
		String res = "if("+visite(i.getCondition())+")\n"+visite(i.getIfBlock())+visite(i.getElseBlock());
		return res;
	}

	@Override
	public String visite(print prnt) {
		String res = "System.out.println("+visite(prnt.getExpression())+");";
		return res;
	}

	@Override
	public String visite(DeclarationVar decVar) {
		String res = decVar.getName()+"="+visite(decVar.getOpDroite())+";";
		return res;
	}

	@Override
	public String visite(AND and) {
		String res ="("+ visite(and.getExp1())+") && ("+visite(and.getExp2())+")";
		return res;
	}

	@Override
	public String visite(OR or) {
		String res ="("+visite(or.getExp1())+") || ("+visite(or.getExp2())+")";
		return res;
	}

	@Override
	public String visite(tweets_user twUsr) {
		String declar ="List<String> params"+this.cptParams+"= new ArrayList<String>();";
		String res = "LibTweet.getUser(";
		int i = 0;
//		for(Args arg : twUsr.getArgs()){
//			//arg.ge
//		}
		res+=");";
		return res;
	}

	@Override
	public String visite(tweets_location twLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(tweets_entity twEnt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(tweets_date twDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(ProportionPositif propPos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(ProportionNegatif propNeg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(countTweet countTw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(countVisitProfil countVisitP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(CroissanceAbonne croisAbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(moyFollowers moyFlow) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(moyFavorited moyFavorite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(GREATER great) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(LESS less) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(EQUALS equal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(UtilisationVar utilVar) {
		return utilVar.getNameVar().getName();
	}

	@Override
	public String visite(StringTw strTw) {
		return "\""+strTw.getStringTw()+"\"";
	}

	@Override
	public String visite(ADD add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(MUL mul) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visite(Block b) {
		// TODO Auto-generated method stub
		//b.getStatement()
		return "{}";
	}

	@Override
	public String visite(Expression exp) {
		
		return null;
	}

	@Override
	public String visite(Statement st) {
		// TODO Auto-generated method stub
		return st.getClass().getTypeName();
	}

}
