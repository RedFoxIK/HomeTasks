package factoryMethod;

abstract class Shape {
	String color;
	boolean[][] represent;
	
	Shape(boolean[][] represent, String color) {
		this.represent = represent;
	}
	
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		int rows = represent.length;
		
		for ( int i = 0; i < rows; i++ ) {
			int cols = represent[i].length;
			
			for ( int j = 0; j < cols; j++ ) {
				if ( represent[i][j] ) {
					output.append("#");
				} else {
					output.append(" ");
				}
			}
			output.append("\n");
		}
		return output.toString();
	}
}

class I extends Shape {
	static boolean SIZE[][] = {{true, true, true, true}};
	static String COLOR = "cyan";
	
	I() {
		super(SIZE, COLOR);
	}
}

class J extends Shape {
	static boolean SIZE[][] = {{true, true, true}, {false, false, true}};
	static String COLOR = "blue";
	
	J() {
		super(SIZE, COLOR);
	}
}

class L extends Shape {
	static boolean SIZE[][] = {{true, true, true}, {true, false, false}};
	static String COLOR = "magenta";
	
	L() {
		super(SIZE, COLOR);
	}
}

class O extends Shape {
	static boolean SIZE[][] = {{true, true}, {true, true}};
	static String COLOR = "gray";
	
	O() {
		super(SIZE, COLOR);
	}
}

class S extends Shape {
	static boolean SIZE[][] = {{false, true, true}, {true, true, false}};
	static String COLOR = "green";
	
	S() {
		super(SIZE, COLOR);
	}
}

class T extends Shape {
	static boolean SIZE[][] = {{true, true, true}, {false, true, false}};
	static String COLOR = "yellow";
	
	T() {
		super(SIZE, COLOR);
	}
}

class Z extends Shape {
	static boolean SIZE[][] = {{true, true, false}, {false, true, true}};
	static String COLOR = "red";
	
	Z() {
		super(SIZE, COLOR);
	}
}

class SuperShape extends Shape {
	static boolean SIZE[][];
	static String COLOR;
	
	SuperShape() {
		super(SIZE, COLOR);
	}
	
	public static void setParameters(boolean[][] size, String color) {
		SIZE = size;
		COLOR = color;
	}
}
