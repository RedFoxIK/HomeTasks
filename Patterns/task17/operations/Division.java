package operations;

import component.Component;

public class Division extends Operation {
	public Division(Component left, Component right){
		super(left, right);
	}
	
	public int calculate() {
        return left.calculate() / right.calculate();
    }
}
