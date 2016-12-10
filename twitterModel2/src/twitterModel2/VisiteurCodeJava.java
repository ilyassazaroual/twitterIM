package twitterModel2;

import org.eclipse.emf.common.util.EList;

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


	public TabSymbole getTabSymbole() {
		return tabSymbole;
	}


	public void setTabSymbole(TabSymbole tabSymbole) {
		this.tabSymbole = tabSymbole;
	}


	public int getCptParams() {
		return cptParams;
	}


	public void setCptParams(int cptParams) {
		this.cptParams = cptParams;
	}


	@Override
	public String visite(Program p) {
		String res = "public class MainClass {\n"+
				"public static void main(String[] args) {\n";
		//A faire : déclaarer les variables***************!!!!!!
		//		for(String s : tabSymbole.getTabSymb()){
		//			res += "String "+s+"= new String();\n";
		//		}
		return res;
	}

	/*	@Override
	public String visite(Statement st) {
		// TODO Auto-generated method stub

		return null;
	}*/

	@Override
	public String visite(If i) {
		String res = "if("+visite(i.getCondition())+")\n"+visite(i.getIfBlock())+"\nelse"+visite(i.getElseBlock());
		return res;
	}

	@Override
	public String visite(print prnt) {
		String res = "System.out.println("+visite(prnt.getExpression())+");";
		return res;
	}

	@Override
	public String visite(DeclarationVar decVar) {
		String res="";
		if(this.tabSymbole.addVariable(decVar.getName())){
			res+="String "+decVar.getName()+" = new String();\n";
		}
		if(decVar.getOpDroite() instanceof Command){
			return visite((Command) decVar.getOpDroite(),decVar.getName());
		}
		res += decVar.getName()+"="+visite(decVar.getOpDroite())+";";
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
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : twUsr.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getUser("+listName+");";	
		return res;
	}

	@Override
	public String visite(tweets_location twLoc) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : twLoc.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getLocation("+listName+");";	
		return res;
	}

	@Override
	public String visite(tweets_entity twEnt) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : twEnt.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getEntity("+listName+");";	
		return res;
	}

	@Override
	public String visite(tweets_date twDate) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : twDate.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getDate("+listName+");";	
		return res;
	}

	@Override
	public String visite(ProportionPositif propPos) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : propPos.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getProportionPositif"+listName+");";	
		return res;
	}

	@Override
	public String visite(ProportionNegatif propNeg) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : propNeg.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getProportionNegatif("+listName+");";	
		return res;
	}

	@Override
	public String visite(countTweet countTw) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : countTw.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getCountTweet("+listName+");";	
		return res;
	}

	@Override
	public String visite(countVisitProfil countVisitP) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : countVisitP.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getCountVisitProfil("+listName+");";	
		return res;
	}

	@Override
	public String visite(CroissanceAbonne croisAbn) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : croisAbn.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getCroissanceAbonne("+listName+");";	
		return res;
	}

	@Override
	public String visite(moyFollowers moyFlow) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : moyFlow.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getMoyenFollowers("+listName+");";	
		return res;
	}

	@Override
	public String visite(moyFavorited moyFavorite) {
		String listName ="params"+this.cptParams;
		this.cptParams++;
		String declar ="List<String> "+listName+"= new ArrayList<String>();\n";
		for(UtilisationVar arg : moyFavorite.getArgs()){
			String varName = arg.getNameVar().getName();
			declar+=listName+".add("+varName+");\n";
		}
		String res =declar+ "(new LibTw()).getMoyFavorited("+listName+");";	
		return res;
	}

	@Override
	public String visite(GREATER great) {
		String res ="("+ visite(great.getExp1())+") > ("+visite(great.getExp2())+")";
		return res;
	}

	@Override
	public String visite(LESS less) {
		String res ="("+ visite(less.getExp1())+") < ("+visite(less.getExp2())+")";
		return res;
	}

	@Override
	public String visite(EQUALS equal) {
		String res ="("+ visite(equal.getExp1())+") == ("+visite(equal.getExp2())+")";
		return res;
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
		String res =visite(add.getExp1())+" + "+visite(add.getExp2());
		return res;
	}

	@Override
	public String visite(MUL mul) {
		String res =visite(mul.getExp1())+" * "+visite(mul.getExp2());
		return res;
	}

	@Override
	public String visite(Block b) {
		String res = "{";
		for(Statement st : b.getStatement()){
			res+=visite(st)+"\n";
		}
		res+="}";
		return res ;
	}

	@Override
	public String visite(Expression exp) {
		return exp.accepteVisiteur(this);
	}

	@Override
	public String visite(Statement st) {
		return st.accepteVisiteur(this);
	}

	String visite(Command c, String var){
		String res="";
		String tmp = this.visite(c);
		int deb = tmp.lastIndexOf('\n');
		String declareParam = tmp.substring(0,deb);
		String tmpLastInst = tmp.substring(deb+1,tmp.length());
		res = declareParam+"\n"+var+"="+tmpLastInst+"\n";
		return res;
	}

}
