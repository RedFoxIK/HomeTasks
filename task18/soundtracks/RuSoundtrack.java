package soundtracks;

import Films.Film;
import Tape.Languages;

public class RuSoundtrack extends Soundtrack {
	private static final Languages LANGUAGE = Languages.RUSSIAN; 
	
	public RuSoundtrack(Film film) {
		super(film, LANGUAGE);
	}
}
