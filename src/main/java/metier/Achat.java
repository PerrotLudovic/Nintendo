package metier;

public class Achat {
private Jeu jeu;
private String date;
private Double prix;
private Boutique boutique;


public Achat(Jeu jeu, String date, Double prix, Boutique boutique) {
	this.jeu = jeu;
	this.date = date;
	this.prix = prix;
	this.boutique = boutique;
}



}
