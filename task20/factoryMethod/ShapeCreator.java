package factoryMethod;

public abstract class ShapeCreator {
	public abstract Shape createShape();
}

class ICreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new I();
	}
}

class JCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new J();
	}
}

class LCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new L();
	}
}

class OCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new O();
	}
}

class SCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new S();
	}
}

class TCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new T();
	}
}

class ZCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new Z();
	}
}

class SuperShapeCreator extends ShapeCreator {
	@Override
	public Shape createShape() {
		return new SuperShape();
	}	
}