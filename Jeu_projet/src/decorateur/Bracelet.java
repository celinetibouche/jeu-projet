package decorateur;

import Personnage.Personnage;

public class Bracelet extends Accessoires{
	
	public Bracelet(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec un bracelet";
	}

}
