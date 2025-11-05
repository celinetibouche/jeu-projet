package adaptateur;
import Personnage.Personnage;
import  Personnage.PersonnageInterface;

public class adaptateurVehicule implements PersonnageInterface{

	Vehicule V= new Vehicule();
	
	@Override
	public void marcher() {
		V.rouler();
	}

	@Override
	public void Afficher() {
		V.Afficher();
	}

	@Override
	public void seReposer() {
		V.seCharger();
	}
	
	@Override
	public void attaquer(String Nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void etreattaquer(String nom) {
		// TODO Auto-generated method stub
		
	}
	
}
