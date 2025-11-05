package Personnage;

import java.util.ArrayList;

public interface PersonnageInterface {
	
	//public static final ArrayList<String> Personnage = new ArrayList<String>();
	
	public void marcher();
	public void attaquer(String Nom);
	public void killer();
	public void Afficher();
	public void seReposer();
	public void etreattaquer(String nom);
}
