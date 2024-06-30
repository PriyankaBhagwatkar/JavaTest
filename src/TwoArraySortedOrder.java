import java.util.Arrays;

public class TwoArraySortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 5, 3, 2 };
		int[] arr2 = { 4, 6, 8, 7 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] mergedArr = mergeArrays(arr1, arr2, n1, n2);
		int[] sortedArr = sortArr(mergedArr, n1 + n2);
		System.out.println(Arrays.toString(sortedArr));
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2, int n1, int n2) {
		int[] mergedArr = new int[n1 + n2];
		System.arraycopy(arr1, 0, mergedArr, 0, n1);
		System.arraycopy(arr2, 0, mergedArr, n1, n2);
		return mergedArr;
	}

	public static int[] sortArr(int[] arr, int n) {
		Arrays.sort(arr);
		return arr;
	}
}
