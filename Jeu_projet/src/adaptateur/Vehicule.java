package adaptateur;

public class Vehicule implements VehiculeAbstraite{

	 public String nom="";
	 public int vie;
	 public int vitesse;
	
	@Override
	public void rouler() {
		if(this.vie!=0)
		{
		  System.out.println("rouler.... \n");
		}
	}

	@Override
	public void Afficher() {
		System.out.println("Nom du vehicule:"+getNom()+"Vie:"+getVie()+"vitesse"+getVitesse()+"\n");
		
	}
	
	@Override
	public void seCharger() {
		System.out.println("Zzzzzzz -_- \n");
		this.vie++;
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
