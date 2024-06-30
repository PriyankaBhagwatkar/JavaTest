import java.util.Arrays;

public class KthSmallestElement {
	/**
	 * Given an array arr[] and an integer K where K is smaller than size of array, 
	 * the task is to find the Kth smallest element in the given array. 
	 * It is given that all array elements are distinct.
	 * Note :-  l and r denotes the starting and ending index of the array.
	 * **/
	
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int l = 0;
        int r = arr.length - 1;
        int kthSmallest = kthSmallest(arr, l, r, k);
        System.out.println(kthSmallest); // Output: 7
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
