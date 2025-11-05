package decorateur;

import Personnage.Personnage;

public class Casquette extends Accessoires{
	
	public Casquette(Personnage personnage) {
	       super.personnage=personnage;
	    }

	@Override
	public String getNom() {
		return personnage.getNom()+ " avec une Casquette";
	}

	@Override
	public void etreattaquer(String nom) {
		// TODO Auto-generated method stub
		
	}


}
