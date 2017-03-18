package factoryMethod;

public class Main {
	public static void main(String[] args) {
		Tetris.addSuperShape(new boolean[][] {{false, true, true, false}, {true, true, true, true}, {false, true, true, false}}, "pink");
		
		for ( int i = 0; i < 20; i++ ) {
			System.out.println(Tetris.getShape());
		}
		System.out.println("________");
		
		Tetris.addSuperShape(new boolean[][] {{true}}, "brown");
		
		for ( int i = 0; i < 20; i++ ) {
			System.out.println(Tetris.getShape());
		}
	}
}
