package Personnage;

import java.util.ArrayList;

import comportementMarcher.MarcheLent;
import comportementSauter.NepasSauter;
import singleton.JournalisationSingleton;
import comportementAttaquer.AttaqueFaible;

public class Common extends Personnage {

	public Common() {
		super();
		
		this.nom="Common";
		this.force=100;
		this.vie=100;
		this.vitesse=100;
		this.killer=0;
		this.arms = new ArrayList<String>();
		
		this.arms.add("pistolet");
		this.arms.add("fusil");
		
		 comportementattaquer = new AttaqueFaible();
	     comportementmarcher = new MarcheLent();
	     comportementsauter= new NepasSauter();
		
	}
	
	public void Afficher() {
		
		JournalisationSingleton.getInstance().journaliser("Nom du personnage:"+getNom()+"\n"+"Vie:"+getVie()+"\n"+"Force "+getForce()+"\n"+
                "Vitesse"+getVitesse()+"\n"+"Nombre de killer"+getKiller()+"\n"+"arms"+getArms()+"\n");
	}


}
