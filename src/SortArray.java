public class SortArray {

	/**
	 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in
	 * ascending order. Example 1: Input: N = 5 arr[]= {0 2 1 2 0} Output:0 0 1 2 2
	 * Explanation:0s 1s and 2s are segregated into ascending order.
	 **/

	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 2, 0 };
		int n = arr.length;
		sort012(arr, n);
		for (int num : arr) {
			System.out.print(num + " "); // Output: 0 0 1 2 2
		}
	}

	public static void sort012(int a[], int n) {
		int low = 0;
		int high = n - 1;
		int mid = 0;
		while (mid <= high) {
			switch (a[mid]) {
			case 0:
				swap(a, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(a, mid, high);
				high--;
				break;
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
