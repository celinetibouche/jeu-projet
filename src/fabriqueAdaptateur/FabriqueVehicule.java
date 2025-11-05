package fabriqueAdaptateur;

import adaptateur.Vehicule;


public class FabriqueVehicule extends FabriqueVehicule_Abstraite{

	@Override
	public Vehicule creerVehic() {
		Vehicule V = new Vehicule();
	       
        return V;
}
	

}


