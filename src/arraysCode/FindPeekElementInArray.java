package arraysCode;

public class FindPeekElementInArray {
	
	/**Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, 
	 * find the maximum element in the array.
	 * Note: If the array is increasing then just print the last element will be the maximum value.
	 * Example:
	 * Input: array[]= {5, 10, 20, 15}
	 * Output: 20
	 * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.	
	 */

	public static void main(String[] args) {
		int[] arary = {5, 10, 20, 15};
		int result = findPeak(arary,arary.length);
		System.err.println(result);

	}
	
	static int findPeak(int arr[], int n) {
		if(arr==null || arr.length==0) {
			return Integer.MIN_VALUE;
		}
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
