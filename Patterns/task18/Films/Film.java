package Films;

public abstract class Film {
	String name;
	String director;
	int duration;
	
	public Film(String name) {
		this.name = name;
	}
	
	void setDireactor(String director) {
		this.director = director;
	}
	
	void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
