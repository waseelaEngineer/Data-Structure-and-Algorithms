/*
 * have fixed lenght that can not be changed
 * store multiple data with same data type in one variable name
 * slow in insertion and deletion
 * fast in retrieve and modify
 */
import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		String[] names = new String[5];    //Declare array, by default all values are set to null
		names[0] = "mohamed";
		String x = names[0];
		
		int[] nums = {1, 2, 3, 4, 5, 3};    // Declare array, set all values directly
		int y = nums.length;
		Arrays.sort(nums);
		
		// loop throw array
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
		
		for (int a : nums)
			System.out.print(a);
	}
}
