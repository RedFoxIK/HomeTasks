package subtitlies;

import Films.Film;
import Tape.Languages;

public class RuSubtitles extends Subtitles {
private static final Languages LANGUAGE = Languages.RUSSIAN; 
	
	public RuSubtitles(Film film) {
		super(film, LANGUAGE);
	}
}
