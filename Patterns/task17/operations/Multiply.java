package operations;

import component.Component;

public class Multiply extends Operation {
	
	public Multiply(Component left, Component right){
		super(left, right);
	}
	
	public int calculate() {
        return left.calculate() * right.calculate();
    }
}
