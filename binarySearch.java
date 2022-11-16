/*
 * works only in sorted lists
 * faster than linear search
 * do not check all entries it cuts list in half in each iteration 
 */
public class binarySearch {

	public static void main(String[] args) {
		System.out.println(binSearch(new int[] {1, 2, 3, 4, 5}, 2));    // index of num 2 in list is 1
	}
	
	static int binSearch(int [] nums, int target) {
		
		int start = 0, end = nums.length - 1;
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if (target < nums[mid])
				end = mid -1;
			
			else if (target > nums[mid])
				start = mid + 1;
			
			else
				return mid;
		}
		return -1;
	}
}