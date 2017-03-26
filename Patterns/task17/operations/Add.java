package operations;

import component.Component;

public class Add extends Operation {
	
	public Add(Component left, Component right){
		super(left, right);
	}
	
	public int calculate() {
        return left.calculate() + right.calculate();
    }
}
