package Tape;

import Films.Film;
import Films.Matrix;

public class Main {
	public static void main(String[] args) {
		Film matrix = new Matrix();
		
		Tape tape = new Tape(matrix, Languages.ENGLISH);
		System.out.println(tape);
		
		tape.setSoundtrack(Languages.RUSSIAN);
		System.out.println(tape);
	}
}
