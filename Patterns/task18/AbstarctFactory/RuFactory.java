package AbstarctFactory;

import Films.Film;
import Tape.Languages;
import soundtracks.*;
import subtitlies.*;

public class RuFactory extends AbstractFactory {

	@Override
	public Soundtrack getSoundtrack(Film film, Languages language) {
		return new RuSoundtrack(film);
	}

	@Override
	public Subtitles getSubtitles(Film film, Languages language) {
		return new RuSubtitles(film);
	}

}
