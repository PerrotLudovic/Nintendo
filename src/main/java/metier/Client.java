package metier;

import java.util.ArrayList;

public class Client {
	private String nom, prenom ;
	private ArrayList<Jeu> listOfGames = new ArrayList<Jeu>();
	
	public Client()
	{
		
	}
	
	public Client(String nom, String prenom, ArrayList<Jeu> listOfGames) {
		this.nom = nom;
		this.prenom = prenom;
		this.listOfGames = listOfGames;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public ArrayList<Jeu> getListOfGames() {
		return listOfGames;
	}
	public void setListOfGames(ArrayList<Jeu> listOfGames) {
		this.listOfGames = listOfGames;
	}
	
	


}
