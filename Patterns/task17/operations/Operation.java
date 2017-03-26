package operations;

import component.Component;

public abstract class Operation extends Component {
	Component left;
    Component right;
    
    public Operation(Component left, Component right){
        this.left = left;
        this.right = right;
    }
    
    public static Operation getOperation(String operator, Component left, Component right) {
    	switch ( operator ) {
    		case "+" :
    				return new Add(left, right);
    		case "-" :
    				return new Substraction(left, right);
    		case "*" :
    				return new Multiply(left, right);
    		case "/" :
    				return new Division(left, right);
    		default: 
    				return null;
    	}
    }
}
