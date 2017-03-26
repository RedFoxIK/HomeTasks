package AbstarctFactory;

import Films.Film;
import Tape.Languages;
import soundtracks.Soundtrack;
import subtitlies.Subtitles;

public abstract class AbstractFactory {
	public abstract Soundtrack getSoundtrack(Film film, Languages language);
	
	public abstract Subtitles getSubtitles(Film film, Languages language);
}
