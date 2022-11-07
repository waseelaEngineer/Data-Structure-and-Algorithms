import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack<Integer> nums = new Stack<>();    // Declare stack
		
		// methods
		nums.push(1);
		nums.add(2);		
		nums.pop();
		nums.peek();
		nums.contains(3);
		nums.isEmpty();
		nums.set(0, 5); // index, value
		nums.size();
		nums.get(0);
		nums.clear();
	}
}
