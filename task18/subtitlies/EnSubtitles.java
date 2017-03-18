package subtitlies;

import Films.Film;
import Tape.Languages;

public class EnSubtitles extends Subtitles {
	private static final Languages LANGUAGE = Languages.ENGLISH; 
	
	public EnSubtitles(Film film) {
		super(film, LANGUAGE);
	}
}
