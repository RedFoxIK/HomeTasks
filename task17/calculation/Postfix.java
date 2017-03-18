package calculation;

import java.util.Deque;
import java.util.LinkedList;

public class Postfix {

	public static String transform(String input) {
		StringBuilder output = new StringBuilder();
		Deque<String> stack = new LinkedList<>();

		for ( String subStr : input.split("\\s") ) {

			if ( Operator.operators.containsKey(subStr) ) {
				while ( !stack.isEmpty() && isHigerPtiority(subStr, stack.peek()) ) {
					output.append(stack.pop()).append(' ');
				}
				stack.push(subStr);

			} else if ( subStr.equals("(") ) {
				stack.push(subStr);

			} else if ( subStr.equals(")") ) {
				while ( !stack.peek().equals("(") ) {
					output.append(stack.pop()).append(' ');
				}
				stack.pop();

			} else {
				output.append(subStr).append(' ');
			}
		}

		while ( !stack.isEmpty() ) {
			output.append(stack.pop()).append(' ');
		}

		return output.toString();
	}

	private static boolean isHigerPtiority(String operator, String subStr) {
		return (Operator.operators.containsKey(subStr) && Operator.operators.get(subStr).priority 
				>= Operator.operators.get(operator).priority);
	}
	
	private Postfix() {}
}
