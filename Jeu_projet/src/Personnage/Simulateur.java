package Personnage;

import fabrique.FabriquePers;
import fabrique.FabriquePersAbstraite;

public class Simulateur {
	
	public static void main(String[] args) {

        System.out.println();
        System.out.println(" ****** Début simulation comportement Pers ******");
        FabriquePersAbstraite fabriquePers= new FabriquePers();
        Common Pers = (Common) fabriquePers.creerPers("Common");
        Pers.attaquer("Rare");
        //PersonnageInterface Pers = new Common();
        //Pers.Afficher();
       // Pers.marcher();
        //Pers.attaquer("pers");
        //Pers.killer();
        //Pers.seReposer();
        System.out.println(" ****** Fin simulation comportement Pers ******");
        System.out.println();

   }
}


    
