package decorateur;

import Personnage.Personnage;

public class Golden extends Accessoires{
	
	public Golden(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec Golden accessoire";
	}

}
