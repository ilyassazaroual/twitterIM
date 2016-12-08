package twitterModel2;

import java.util.*;

public class TabSymbole {
	private ArrayList<String> vars;
	
	//constructeur
	public TabSymbole(){
		vars= new ArrayList<String>();
	}
	public ArrayList<String> getTabSymb() {
		return vars;
	}
	public void setTabSymb(ArrayList<String> tabSymb) {
		this.vars = tabSymb;
	}
	
	public String toString(){
		String res="Variables {";
		int i=0;
		for(String var: vars){
			res+=var+" : var"+i+",  ";
			i++;
		}
		res+="}";
		return res;
	}
	
	public void afficher(){
		System.out.println("========================Table des symboles======================"); 
		System.out.println(this.toString());
		System.out.println("================================================================");
	}
	
	
	public boolean addVariable(String identifiant){
		boolean res  = false;
		if(!vars.contains(identifiant)){
			vars.add(identifiant);
			res = true;
		}
		return res;
	}
	
	
	public int nbVar(){
		return vars.size();
	}

}
