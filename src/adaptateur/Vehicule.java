package adaptateur;

import singleton.JournalisationSingleton;

public class Vehicule implements VehiculeAbstraite{

	 public String nom="Vehicule";
	 public int vie=200;
	 public int vitesse=400;
	
	@Override
	public void rouler() {
		if(this.vie!=0)
		{
		 JournalisationSingleton.getInstance().journaliser("Le véhicule roule.... \n");
		}
	}

	@Override
	public void Afficher() {
	   JournalisationSingleton.getInstance().journaliser("Nom du vehicule:"+getNom()+"\n"+"Vie:"+getVie()+"\n"+"vitesse"+getVitesse()+"\n");
		
	}
	
	@Override
	public void seCharger() {
	  JournalisationSingleton.getInstance().journaliser("Se charger Zzzzzzz\n");
		this.vie=this.vie+10;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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


}
