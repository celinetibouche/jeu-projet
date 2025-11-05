package comportementMarcher;

import singleton.JournalisationSingleton;

public class MarcheRapide implements ComportementMarcher {

	@Override
	public void marcher() {
		JournalisationSingleton.getInstance().journaliser("je marche rapidement \n");
	}

}
