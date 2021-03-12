package test;

import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		List <Console> consoles = new ArrayList();
		List <Console> consoles2 = new ArrayList();
		List <Console> consoles3 = new ArrayList();
		
		Console c1 =new Console("SuperNintendo",120,null);
		Console c2 =new Console("nintendoSwitch",120,null);
		Console c3 =new Console("ps5",120,null);
		Console c4 =new Console("gameCube",120,null);
		consoles.add(c1);
		consoles.add(c2);
		consoles.add(c3);
		
		consoles2.add(c1);
		consoles2.add(c4);
		consoles3.add(c3);
		
		for(Console c :consoles) {System.out.println(c);}
		
			Jeu jeu1=new Jeu("WordlOfWarcraft",consoles);
			Jeu jeu2=new Jeu("Super Mario",consoles2);
			Jeu jeu3=new Jeu("Fifa21",consoles3);
			Jeu jeu4=new Jeu("Fortnite",consoles3);
			Jeu jeu5=new Jeu("LegendOfZelda",consoles);


}
}
