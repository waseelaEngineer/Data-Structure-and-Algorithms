/*Memoization is a technique for improving the performance of recursive algorithms.
 * It involves rewriting the recursive algorithm so that as answers to problems are found, 
 * they are stored in an array. 
 * Recursive calls can look up results in the array rather than having to recalculate them.*/
//we can see that many subproblems were redundant, 
//we were calling the recursive function multiple times for a particular string. 
//To avoid this we can use memoization

import java.util.HashSet;
import java.util.Set;

public class memoization {

	public static void main(String[] args) {
		String s = "leetcode";
		Boolean[] memo = new Boolean[s.length()]; // declare memoization boolean array
		Set<String> set = new HashSet<>();
		set.add("leet");
		set.add("code");
				
		System.out.println(wordBreakMemo(s, set, 0, memo));
	}
	
    static boolean wordBreakMemo(String s, Set<String> set, int start, Boolean[] memo) {
        if (start == s.length())
            return true;
        
        if (memo[start] != null) // check if answer is found
            return memo[start];
        
        for (int end = start + 1; end <= s.length(); end++)
            if (set.contains(s.substring(start, end)) && wordBreakMemo(s, set, end, memo))
                return memo[start] = true;
        
        return memo[start] = false;
    }
}
