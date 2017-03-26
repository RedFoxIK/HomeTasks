package soundtracks;

import Films.Film;
import Tape.Languages;

public abstract class Soundtrack {
	Film film;
	Languages language;
	
	public Soundtrack(Film film, Languages language) {
		this.film = film;
		this.language = language;
	}
	
	@Override
	public String toString() {
		return language.getLanguage() + " soundtrack to film " + film;
	}
}
