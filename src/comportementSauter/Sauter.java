package comportementSauter;

import singleton.JournalisationSingleton;

public class Sauter implements ComportementSauter {

	@Override
	public void sauter() {
		JournalisationSingleton.getInstance().journaliser("Je saute___\n");
		
	}

}
