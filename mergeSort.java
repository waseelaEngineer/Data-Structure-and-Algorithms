
public class mergeSort {

	public static void main(String[] args) {
		int[] res = new int[] {1, 4, 3, 2, 5, 7, 8, 6, 9, 10};
		divide(res);
		
		for (int num : res)
			System.out.println(num);
	}
	
	static void divide(int[] inputArray) {
		int inputLength = inputArray.length;
		
		if (inputLength < 2) return;
		
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for (int i = 0; i < midIndex; i++)
			leftHalf[i] = inputArray[i];
		
		for (int j = midIndex; j < inputLength; j++)
			rightHalf[j - midIndex] = inputArray[j];
		
		divide(leftHalf);
		divide(rightHalf);
		
		merge(inputArray, leftHalf, rightHalf);
	}
	
	static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, j = 0, k = 0;
		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}
			else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
	}
}
