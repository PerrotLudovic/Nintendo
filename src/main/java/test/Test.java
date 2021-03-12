package test;

import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		//1: création d'un client
		Client cl1 = new Client();
		cl1.setNom("ABID");
		cl1.setPrenom("Jordan");
		
		//2: créationd'une liste de jeux
		Jeu j1 = new Jeu("Les fous du jeux", null);
		Jeu j2 = new Jeu("Hop!", null);
		Jeu j3 = new Jeu("Les Zombies", null);
		List<Jeu> listeJeu = new ArrayList<Jeu>();
		listeJeu.add(j1);
		listeJeu.add(j2);
		listeJeu.add(j3);
		
		//3:affectation de la liste de jeux au client
		cl1.setListOfGames(listeJeu);

	}

}
