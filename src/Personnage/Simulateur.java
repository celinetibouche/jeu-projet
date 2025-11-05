package Personnage;

import adaptateur.adaptateurVehicule;
import fabrique.FabriquePers;
import fabrique.FabriquePers_Abstraite;
import fabriqueDecorateur.FabriqueDecorateur;
import fabriqueDecorateur.FabriqueDecorateur_Abstraite;
import singleton.JournalisationSingleton;

public class Simulateur {

	public static void main(String[] args) {

		System.out.println();
		JournalisationSingleton.getInstance().journaliser(" ****** Creation des personnages******");

		FabriquePers_Abstraite f = new FabriquePers();

		Personnage Common = f.creerPers("Common");
		Personnage Legendaire = f.creerPers("Legendaire");
		Personnage Epic = f.creerPers("Epic");
		Personnage Rare = f.creerPers("Rare");

		JournalisationSingleton.getInstance().journaliser(" ****** Common ******");
		Common.Afficher();
		Common.marcher();
		Common.seReposer();
		Common.sauter();

		JournalisationSingleton.getInstance().journaliser(" ****** Epic ******");
		Epic.Afficher();
		Epic.marcher();
		Epic.seReposer();
		Epic.sauter();

		JournalisationSingleton.getInstance().journaliser(" ****** Legendaire ******");
		Legendaire.Afficher();
		Legendaire.marcher();
		Legendaire.seReposer();
		Legendaire.sauter();

		JournalisationSingleton.getInstance().journaliser(" ****** Rare ******");
		Rare.Afficher();
		Rare.marcher();
		Rare.seReposer();
		Rare.sauter();

		JournalisationSingleton.getInstance().journaliser(" ********* 1ere combat entre Common et Epic ************");
		Common.attaquer(Epic);

		JournalisationSingleton.getInstance().journaliser(" *************** Résultat **********************");
		JournalisationSingleton.getInstance().journaliser(" ****** Common ******");
		Common.Afficher();
		JournalisationSingleton.getInstance().journaliser(" ****** Epic ******");
		Epic.Afficher();

		JournalisationSingleton.getInstance()
				.journaliser(" ********** 2eme combat entre Epic et Legendaire **********");
		Epic.attaquer(Legendaire);

		JournalisationSingleton.getInstance().journaliser(" **************** Résultat ********************");
		JournalisationSingleton.getInstance().journaliser(" ****** Epic ******");
		Epic.Afficher();
		JournalisationSingleton.getInstance().journaliser(" ****** Legendaire ******");
		Legendaire.Afficher();

		JournalisationSingleton.getInstance()
				.journaliser(" ********** 3eme combat entre Rare et Legendaire **********");
		Rare.attaquer(Legendaire);

		JournalisationSingleton.getInstance().journaliser(" *************** Résultat ********************");
		JournalisationSingleton.getInstance().journaliser(" ****** Common ******");
		Rare.Afficher();
		JournalisationSingleton.getInstance().journaliser(" ****** Epic ******");
		Legendaire.Afficher();

		JournalisationSingleton.getInstance()
				.journaliser(" *********** 4eme combat entre Common et Legendaire **********");
		Legendaire.attaquer(Common);

		JournalisationSingleton.getInstance().journaliser(" *************** Résultat ********************");
		JournalisationSingleton.getInstance().journaliser(" ****** Common ******");
		Common.Afficher();
		JournalisationSingleton.getInstance().journaliser(" ****** Legendaire ******");
		Legendaire.Afficher();

		JournalisationSingleton.getInstance().journaliser(" *********** Véhicule **********");

		PersonnageInterface vehicule = new adaptateurVehicule();
		vehicule.Afficher();
		vehicule.marcher();
		vehicule.seReposer();
		vehicule.Afficher();

		JournalisationSingleton.getInstance().journaliser(" *********** Application décorateur **********");

		FabriqueDecorateur_Abstraite fd = new FabriqueDecorateur();
		Common = fd.creerDec(Common, "Bracelet");
		Epic = fd.creerDec(Epic, "Casquette");
		Legendaire = fd.creerDec(Legendaire, "Masque");
		Rare = fd.creerDec(Rare, "Lunettes");

		JournalisationSingleton.getInstance().journaliser("description des personnages:\n" + Common.getNom() + "\n"
				+ Epic.getNom() + "\n" + Legendaire.getNom() + "\n" + Rare.getNom());

		JournalisationSingleton.getInstance()
				.journaliser(" *************************** Fin du jeu *******************************");

		System.out.println(JournalisationSingleton.getInstance().terminerJournal());

	}
}
