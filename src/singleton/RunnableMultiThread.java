package singleton;

import Personnage.Personnage;
import Personnage.PersonnageInterface;
import fabrique.FabriquePers;

import fabrique.FabriquePers_Abstraite;

public class RunnableMultiThread implements Runnable{

    @Override
    public void run(){
    	
        FabriquePers_Abstraite pers = new FabriquePers();
    
        
        Personnage Common = pers.creerPers("Common");
        Common.Afficher();

        Personnage Epic = pers.creerPers("Epic");
        Epic.Afficher();
        
        Personnage Legendaire = pers.creerPers("Legendaire");
        Legendaire.Afficher();


        Personnage Rare = pers.creerPers("Rare");
        Rare.Afficher();

        
        }
}
