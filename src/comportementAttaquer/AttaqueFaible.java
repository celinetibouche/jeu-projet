package comportementAttaquer;

import singleton.JournalisationSingleton;

public class AttaqueFaible implements ComportementAttaquer{

	@Override
	public void attaquer() {
		
		JournalisationSingleton.getInstance().journaliser("J'attaque avec une force faible \n");
		
	}
}
