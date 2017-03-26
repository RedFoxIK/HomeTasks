package soundtracks;

import Films.Film;
import Tape.Languages;

public class EnSoundtrack extends Soundtrack {
	private static final Languages LANGUAGE = Languages.ENGLISH; 
	
	public EnSoundtrack(Film film) {
		super(film, LANGUAGE);
	}
}
