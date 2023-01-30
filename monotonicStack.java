// Time: O(n)
// Space: O(1)
import java.util.Stack;

// use of decreasing monotonik stack to find the next greater element
public class monotonicStack {

	public static void main(String[] args) {
		int[] daysToWait = dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
	}
	
	static int[] dailyTemperatures(int[] temperatures) {
		// create stack
		Stack<Integer> stack = new Stack<>(); 
		int[] ans = new int[temperatures.length];
		for(int i = 0; i < temperatures.length; i++) {
			// if new element is > previous element remove previous element
			// becuase it breaks the monotonik stack decreasing order
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int idx = stack.pop();
				ans[idx] = i - idx;
			}
			// add index to stack
			stack.push(i); 
		}
		return ans;
	}
}
