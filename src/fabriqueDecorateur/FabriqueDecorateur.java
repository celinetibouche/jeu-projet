package fabriqueDecorateur;

import Personnage.Personnage;
import decorateur.Bracelet;
import decorateur.Casquette;
import decorateur.Default;
import decorateur.Golden;
import decorateur.Lunettes;
import decorateur.Masque;


public class FabriqueDecorateur extends FabriqueDecorateur_Abstraite {

	@Override
	public Personnage creerDec(Personnage Personnage, String Nom) {
		//Personnage Pers = null;
		switch(Nom)
		{
		    case "Bracelet":Personnage= new Bracelet(Personnage);break;
		    case "Casquette":Personnage = new Casquette(Personnage);break;
		    case "Default":Personnage = new Default(Personnage);break;
		    case "Golden":Personnage = new Golden(Personnage);break;
		    case "Lunettes":Personnage = new Lunettes(Personnage);break;
		    case "Masque":Personnage = new Masque(Personnage);break;
		}
		return Personnage;
	}

}

