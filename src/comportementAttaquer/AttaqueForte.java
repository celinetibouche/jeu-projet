package comportementAttaquer;

import singleton.JournalisationSingleton;

public class AttaqueForte implements ComportementAttaquer{

	@Override
	public void attaquer() {
		
		JournalisationSingleton.getInstance().journaliser("J'attaque avec une grande force  \n");
		
	}
}
