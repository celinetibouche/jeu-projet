package fabrique;

import Personnage.Personnage;

public interface FabriquePersAbstraite {
    public Personnage creerPers(String typePers);
}
