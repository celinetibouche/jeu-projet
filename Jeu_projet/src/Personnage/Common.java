package Personnage;

import java.util.ArrayList;

import comportementMarcher.MarcheLent;
import comportementSauter.NepasSauter;
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
		System.out.println("Nom du personnage:"+getNom()+"Vie:"+getVie()+"Force"+getForce()+
                "Vitesse"+getVitesse()+"Nombre de killer"+getKiller()+"arms"+getArms()+"\n");
	}

	@Override
	public void etreattaquer(String nom) {
		// TODO Auto-generated method stub
		
	}
	

}
