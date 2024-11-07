package personnages;

public class Humain {
	private String nom ;
	private String boisson;
	private int argent ;
	
	public Humain ( String nom, String boisson, int argent ) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("( "+ this.getNom() + " ) - " + texte + " ;");
	}
	
	public void bonjour() {
		String bjr = "Bonjour ! Je m'apelle" + this.getNom() + 
				" et j'aime boire du " + this.getBoisson() ;
		this.parler(bjr);	
	}
	
	public void boire() {
		String s = "Mmmm, un bon verre de " + this.getBoisson() + " ! GLOUPS ! ";
		this.parler(s);
	}
	
	public void gagnerArgent(int argent) {
		this.argent += argent;
	}
	
	public void perdreArgent(int argent) {
		this.argent -= argent;
	}
	
	

}	

