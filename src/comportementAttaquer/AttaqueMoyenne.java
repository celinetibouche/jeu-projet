package comportementAttaquer;

import singleton.JournalisationSingleton;

public class AttaqueMoyenne implements ComportementAttaquer{

	@Override
	public void attaquer() {
		
		JournalisationSingleton.getInstance().journaliser("J'attaque avec une force moyenne \n");
		
	}
}
