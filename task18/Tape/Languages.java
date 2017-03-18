package Tape;

public enum Languages {
	ENGLISH("English"), RUSSIAN("Russian");
	
	String language;
	
	private Languages(String language) {
		this.language = language;
	}
	
	public String getLanguage() {
		return this.language;
	}
}
