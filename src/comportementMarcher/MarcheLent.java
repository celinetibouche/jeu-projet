package comportementMarcher;

import singleton.JournalisationSingleton;

public class MarcheLent implements ComportementMarcher{

	@Override
	public void marcher() {
		JournalisationSingleton.getInstance().journaliser("Je marche lentement \n");
		
	}

}
