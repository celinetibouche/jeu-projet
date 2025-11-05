package Personnage;

import java.util.ArrayList;

import comportementAttaquer.AttaqueMoyenne;
import comportementMarcher.MarcheLent;
import comportementSauter.NepasSauter;
import singleton.JournalisationSingleton;

public class Epic extends Personnage {
  
	public Epic() {
		super();

		this.nom="Epic";
		this.force=200;
		this.vie=100;
		this.vitesse=200;
		this.killer=0;
		this.arms = new ArrayList<String>();
		this.arms.add("pistolet");
		this.arms.add("fusil");
		this.arms.add("fusil à pompe");
		
		
		 comportementattaquer = new AttaqueMoyenne();
	     comportementmarcher = new MarcheLent();
	     comportementsauter= new NepasSauter();
		
	}
	public void Afficher() {
		JournalisationSingleton.getInstance().journaliser("Nom du personnage:"+getNom()+"\n"+"Vie:"+getVie()+"\n"+"Force "+getForce()+"\n"+
                "Vitesse"+getVitesse()+"\n"+"Nombre de killer"+getKiller()+"\n"+"arms"+getArms()+"\n");
	}

}
