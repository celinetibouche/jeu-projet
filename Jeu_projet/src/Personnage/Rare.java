package Personnage;

import comportementAttaquer.AttaqueForte;
import comportementMarcher.MarcheRapide;
import comportementSauter.Sauter;

public class Rare extends Personnage {

	public Rare() {
		super();
		
		this.nom="Rare";
		this.force=300;
		this.vie=100;
		this.vitesse=300;
		this.killer=0;
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
		System.out.println("Nom du personnage:"+getNom()+"Vie:"+getVie()+"Force"+getForce()+
                "Vitesse"+getVitesse()+"Nombre de killer"+getKiller()+"arms"+getArms()+"\n");
	}
	
	@Override
	public void etreattaquer(String nom) {
		// TODO Auto-generated method stub
		
	}


}
