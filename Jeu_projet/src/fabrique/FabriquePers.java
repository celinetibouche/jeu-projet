package fabrique;

import Personnage.Common;
import Personnage.Epic;
import Personnage.Legendaire;
import Personnage.Personnage;
import Personnage.Rare;

public class FabriquePers implements FabriquePersAbstraite {

	@Override
	public Personnage creerPers(String typePers) {
	       Personnage Pers = null;
	        switch(typePers)
	        {
	            case "Common":Pers = new Common();break;
	            case "Epic":Pers = new Epic();break;
	            case "Legendaire":Pers = new Legendaire();break;
	            case "Rare":Pers = new Rare();break;
	        }
	        return Pers;
	}

}
