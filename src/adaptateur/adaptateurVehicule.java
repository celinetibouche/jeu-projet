package adaptateur;
import Personnage.Personnage;
import  Personnage.PersonnageInterface;
import fabriqueAdaptateur.FabriqueVehicule;
import fabriqueAdaptateur.FabriqueVehicule_Abstraite;

public class adaptateurVehicule implements PersonnageInterface{

	 FabriqueVehicule_Abstraite fv = new FabriqueVehicule();
     Vehicule V = fv.creerVehic();
	
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
	public void killer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attaquer(Personnage P) {
		// TODO Auto-generated method stub
		
	}
	
}
