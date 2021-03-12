package metier;

import java.util.ArrayList;

public class Client {
	private String nom, prenom ;
	private ArrayList<Achat> listOfGame = new ArrayList<Achat>();
	
	public Client()
	{
		
	}
	
	public Client(String nom, String prenom, ArrayList<Achat> listOfGame) {
		this.nom = nom;
		this.prenom = prenom;
		this.listOfGame = listOfGame;
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

	public ArrayList<Achat> getListOfGame() {
		return listOfGame;
	}

	public void setListOfGame(ArrayList<Achat> listOfGame) {
		this.listOfGame = listOfGame;
	}
	
	


}
