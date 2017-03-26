package calculation;

import java.util.HashMap;
import java.util.Map;


public enum Operator {
	ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);

	final int priority;

	Operator(int priority) {
		this.priority = priority;
	}
	
	public static Map<String, Operator> operators = new HashMap<String, Operator>() {{
		put("+", Operator.ADD);
		put("-", Operator.SUBTRACT);
		put("*", Operator.MULTIPLY);
		put("/", Operator.DIVIDE);
	}};
}
