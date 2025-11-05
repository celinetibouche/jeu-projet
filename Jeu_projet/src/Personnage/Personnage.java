package Personnage;

import java.util.ArrayList;

import comportementAttaquer.ComportementAttaquer;
import comportementMarcher.ComportementMarcher;
import comportementSauter.ComportementSauter;
import fabrique.FabriquePers;

public abstract class Personnage implements PersonnageInterface {
	
	protected String nom;
	protected int force = 0;
	protected int vie = 0;
	protected int vitesse = 0;
	protected int killer = 0;
    protected ArrayList<String> arms;
    
    ComportementAttaquer comportementattaquer;
    ComportementMarcher comportementmarcher;
    ComportementSauter comportementsauter;
    
    public Personnage() {
		super();
	}
    
	@Override
	public void marcher() {
		if (this.getForce()!=0 && this.getVie()!=0) {
			comportementmarcher.marcher();
		}
	}
	 public void sauter() {
		 comportementsauter.sauter();
	 }
	
	@Override
	public void attaquer(String n) {
		
		if (this.getForce()!=0 && this.getVie()!=0) {
			comportementattaquer.attaquer();
		}
		
		FabriquePers f=new FabriquePers();
		Personnage Pers= f.creerPers(n);
		
		Pers.etreattaquer(this.getNom());
		
		if(Pers.getVie()==0) {
			this.killer++;
		}
		
	}
	
	public void etreattaquer(String nom) {
		
		if(nom=="Common") {
		 this.vie --;
		}
		if(nom=="Epic") {
			 this.vie --;
			 this.force --;
			}
		if(nom=="Legendaire") {
			 this.vie=this.vie- 2;
			 this.force --;
			}
		if(nom=="Rare") {
			this.vie=this.vie- 3;
			 this.force=this.force-2;
			}
	}

	@Override
	public void killer() {
		 
		System.out.println("Nombre de killer:"+getKiller()+"\n");
	}

	@Override
	public void Afficher() {
		
	}

	@Override
	public void seReposer() {
		System.out.println("Zzzzzzz -_- \n");
	    this.force++;
		this.vie++;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getKiller() {
		return killer;
	}

	public void setKiller(int killer) {
		this.killer = killer;
	}

	public ArrayList<String> getArms() {
		return arms;
	}

	public void setArms(ArrayList<String> arms) {
		this.arms = arms;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public ComportementAttaquer getComportementattaquer() {
		return comportementattaquer;
	}

	public void setComportementattaquer(ComportementAttaquer comportementattaquer) {
		this.comportementattaquer = comportementattaquer;
	}

	public ComportementMarcher getComportementmarcher() {
		return comportementmarcher;
	}

	public void setComportementmarcher(ComportementMarcher comportementmarcher) {
		this.comportementmarcher = comportementmarcher;
	}


}
