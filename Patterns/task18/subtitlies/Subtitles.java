package subtitlies;

import Films.Film;
import Tape.Languages;

public abstract class Subtitles {
	Film film;
	Languages language;
	
	public Subtitles(Film film, Languages language) {
		this.film = film;
		this.language = language;
	}
	
	@Override
	public String toString() {
		return language.getLanguage() + " subtitles to film " + film;
	}
}
