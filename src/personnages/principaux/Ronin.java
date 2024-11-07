package personnages.principaux;
import personnages.Humain;

public class Ronin extends Humain{
	private int honneur ;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant c) {
		
	}

	public void provoquer(Yakuza y) {
		if ( (this.honneur*2) > y.getReputation()) {
			this.gagnerArgent(y.getArgent());
			y.perdre();
			this.parler("J'ai gagné contre un Ronin");
		} else
		{
			this.honneur-= 1;
			this.parler("J'ai perdu contre un Ronin");
		}
	}
	
	
	
}
