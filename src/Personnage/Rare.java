package Personnage;

import java.util.ArrayList;

import comportementAttaquer.AttaqueForte;
import comportementMarcher.MarcheRapide;
import comportementSauter.Sauter;
import singleton.JournalisationSingleton;

public class Rare extends Personnage {

	public Rare() {
		super();
		
		this.nom="Rare";
		this.force=300;
		this.vie=100;
		this.vitesse=300;
		this.killer=0;
		this.arms = new ArrayList<String>();
		this.arms.add("pistolet");
		this.arms.add("fusil");
		this.arms.add("fusil à pompe");
		this.arms.add("fusil laser");
		this.arms.add("bazooka");
		
		
		 comportementattaquer = new AttaqueForte();
	     comportementmarcher = new MarcheRapide();
	     comportementsauter= new Sauter();
		
	}
	
	public void Afficher() {
		JournalisationSingleton.getInstance().journaliser("Nom du personnage:"+getNom()+"\n"+"Vie:"+getVie()+"\n"+"Force "+getForce()+"\n"+
                "Vitesse"+getVitesse()+"\n"+"Nombre de killer"+getKiller()+"\n"+"arms"+getArms()+"\n");
	}

}
