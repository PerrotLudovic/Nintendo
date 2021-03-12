package metier;

import java.util.List;

public class Boutique {

	private String nom;
	private Adresse adresse;
	private List<Jeu> listeJeux;

	public Boutique() {
		super();
	}

	public Boutique(String nom, Adresse adresse, List<Jeu> listeJeux) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.listeJeux = listeJeux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Jeu> getListeJeux() {
		return listeJeux;
	}

	public void setListeJeux(List<Jeu> listeJeux) {
		this.listeJeux = listeJeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}

}