package Personnage;

import comportementAttaquer.AttaqueMoyenne;
import comportementMarcher.MarcheLent;
import comportementSauter.NepasSauter;

public class Epic extends Personnage {
  
	public Epic() {
		super();

		this.nom="Epic";
		this.force=200;
		this.vie=100;
		this.vitesse=200;
		this.killer=0;
		this.arms.add("pistolet");
		this.arms.add("fusil");
		this.arms.add("fusil à pompe");
		
		
		 comportementattaquer = new AttaqueMoyenne();
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
