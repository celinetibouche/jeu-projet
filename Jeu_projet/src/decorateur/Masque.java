package decorateur;

import Personnage.Personnage;

public class Masque  extends Accessoires{
	
	public Masque(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec un masque";
	}

}