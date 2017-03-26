package calculation;

import java.util.Deque;
import java.util.LinkedList;

import component.Component;
import component.Number;
import operations.Operation;

public class ComponentTree {
	
	public static int calculate(String postfix) {
		Deque<Component> stack = new LinkedList<>();
		
		for ( String subStr: postfix.split("\\s") ) {
			if ( !Operator.operators.containsKey(subStr) ) {
				int number = Integer.parseInt(subStr);
				Number num = new Number(number);
				
				stack.push(num);
			} else {
				Component second = stack.pop();
				Component first = stack.pop();
				
				stack.push(Operation.getOperation(subStr, first, second));
			}
		}
		return stack.pop().calculate();
	}
	
	private ComponentTree() {}
}
