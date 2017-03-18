package Tape;

import AbstarctFactory.AbstractFactory;
import AbstarctFactory.EnFactory;
import AbstarctFactory.RuFactory;
import Films.Film;
import soundtracks.Soundtrack;
import subtitlies.Subtitles;

public class Tape {
	Film film;
	Subtitles subtitles;
	Soundtrack soundtrack;
	
	public Tape(Film film, Languages language) {
		this.film = film;
		setSoundtrack(language);
	}
	
	public void setSoundtrack(Languages language) {
		AbstractFactory factory;
		if ( language == Languages.ENGLISH ) {
			factory = new EnFactory();
			this.soundtrack = factory.getSoundtrack(this.film, language);
			this.subtitles = factory.getSubtitles(this.film, language);
		}
		if ( language == Languages.RUSSIAN ) {
			factory = new RuFactory();
			this.soundtrack = factory.getSoundtrack(this.film, language);
			this.subtitles = factory.getSubtitles(this.film, language);
		}
	}
	
	public void setSubtitles(Languages language) {
		setSoundtrack(language);
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		output.append(this.film + "\n");
		output.append(this.soundtrack + "\n");
		output.append(this.subtitles + "\n");
		return output.toString();
	}
}
