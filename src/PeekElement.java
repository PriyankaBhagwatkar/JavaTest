
public class PeekElement {
	
	/** Given an 0-indexed array of integers arr[] of size n, find its peak element. 
	 * An element is considered to be peak if it's value is greater than or equal to the values of its adjacent 
	 * elements (if they exist). 
	 * The array is guaranteed to be in ascending order before the peak element and in descending order after it.
	 * Note: The output will be 1 if the index returned by your function is correct; otherwise, it will be 0.
	 * **/
	
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
	        int peakIndex = findPeakElement(arr);
	        System.out.println(peakIndex); // Output: 6
	    }

	    public static int findPeakElement(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] > arr[mid + 1]) {
	                right = mid;
	            } else {
	                left = mid + 1;
	            }
	        }

	        return left;
	    }

}
