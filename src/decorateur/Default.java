package decorateur;

import Personnage.Personnage;

public class Default extends Accessoires{
	
	public Default(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec default skin";
	}

	@Override
	public void Afficher() {
		// TODO Auto-generated method stub
		
	}

}
