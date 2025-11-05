package comportementSauter;

import singleton.JournalisationSingleton;

public class NepasSauter implements ComportementSauter {

	@Override
	public void sauter() {
		JournalisationSingleton.getInstance().journaliser("Je ne saute pas \n");
		
	}
  
}
