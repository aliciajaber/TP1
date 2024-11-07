package personnages.principaux;
import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	

	public Yakuza(String nom, String boisson, int argent, String clan) {
		// TODO Auto-generated constructor stub
		super(nom, boisson, argent);
		this.reputation = 0;
		this.clan = clan;
	}


	public String getClan() {
		return clan;
	}


	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant commercant) {
		this.gagnerArgent(commercant.getArgent());
		this.reputation += 1;
		this.parler("J'ai extorquer un commercant");
	}
	
	public void gagner() {
		this.reputation += 1;
		this.parler("J'ai extorquer un commercant");
	}
	
	public int perdre() {
		this.perdreArgent(this.getArgent());
		this.reputation -= 1;
		this.parler("J'ai perdu contre un ronin");
		return 0;
	}
}
