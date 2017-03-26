package AbstarctFactory;

import Films.Film;
import Tape.Languages;
import soundtracks.*;
import subtitlies.*;

public class EnFactory extends AbstractFactory {

	@Override
	public Soundtrack getSoundtrack(Film film, Languages language) {
		return new EnSoundtrack(film);
	}

	@Override
	public Subtitles getSubtitles(Film film, Languages language) {
		return new EnSubtitles(film);
	}
}
