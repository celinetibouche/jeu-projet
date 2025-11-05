package decorateur;

import Personnage.Personnage;

public class Lunettes extends Accessoires{
	
	public Lunettes(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec des lunettes";
	}

	@Override
	public void Afficher() {
		// TODO Auto-generated method stub
		
	}

}
