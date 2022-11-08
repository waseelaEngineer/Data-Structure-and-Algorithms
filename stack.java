import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack<Integer> nums = new Stack<>();    // Declare stack
		
		// add 
		nums.push(1);
		nums.add(2);
		
		// remove
		nums.pop();
		
		// retrieve without delete
		nums.peek();
		
		// set value by (index, value)
		nums.set(0, 5);

		// methods
		nums.contains(3);
		nums.isEmpty();
		nums.size();
		nums.get(0);
		nums.clear();
	}
}
