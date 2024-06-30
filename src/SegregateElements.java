
public class SegregateElements {
	
	/**
	 * Given an unsorted array arr[] of size n having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
	 * Example 1:
	 * Input : n = 8
	 * arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
	 * Output : 1  3  2  11  6  -1  -7  -5
	 * **/
	
	public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int n = arr.length;
        segregateElements(arr, n);
        for (int num : arr) {
            System.out.print(num + " "); // Output: 1 3 2 11 6 -1 -7 -5
        }
    }

    public static void segregateElements(int arr[], int n) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (arr[left] < 0 && arr[right] >= 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] >= 0) {
                left++;
            } else if (arr[right] < 0) {
                right--;
            }
        }
    }

}
