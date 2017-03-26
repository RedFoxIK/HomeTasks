package factoryMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Tetris {
	private static Random RND = new Random();
	
	public static List<ShapeCreator> SHAPESCREATORS = new ArrayList<ShapeCreator>() {{
		add(new ICreator());
		add(new JCreator());
		add(new LCreator());
		add(new OCreator());
		add(new SCreator());
		add(new TCreator());
		add(new ZCreator());
	}};
	
	public static void addSuperShape(boolean size[][], String color) {
		boolean flag = true;
		
		SuperShape.setParameters(size, color);
		for ( ShapeCreator s: SHAPESCREATORS ) {
			if ( s instanceof SuperShapeCreator ) {
				flag = false;
			}
		}
		if ( flag ) {
			SHAPESCREATORS.add(new SuperShapeCreator());
		}
	}
	
	public static Shape getShape() {
		int index = RND.nextInt(SHAPESCREATORS.size());
		
		return SHAPESCREATORS.get(index).createShape();
	}
	
	private Tetris() {}
	
}

