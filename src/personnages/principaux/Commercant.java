package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
	}

	public int seFaireExtorquer() {
		this.parler("Le monde est injuste");
		this.perdreArgent(getArgent());
		return 0;
	}
	
	public void recevoir( int argent1) {
		this.gagnerArgent(argent1);
	}
	
}
