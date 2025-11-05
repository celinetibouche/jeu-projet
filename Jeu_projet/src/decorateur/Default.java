package decorateur;

import Personnage.Personnage;

public abstract class Default extends Accessoires{
	
	public Default(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec default accessoire";
	}

}
