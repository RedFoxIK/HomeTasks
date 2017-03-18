package operations;

import component.Component;

public class Substraction extends Operation {
	public Substraction(Component left, Component right){
		super(left, right);
	}
	
	public int calculate() {
        return left.calculate() - right.calculate();
    }
}
