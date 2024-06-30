
public class BinarySearch {
	/**
	The binarySearch method takes an array arr and a target value target as input and returns the index of the target value in the array if it is present, otherwise it returns -1.

	The method starts by initializing two variables left and right to 0 and arr.length - 1 respectively. These variables represent the indices of the leftmost and rightmost elements of the array.
	
	The method then enters a while loop that continues as long as left is less than or equal to right.
	
	Inside the loop, the method calculates the middle index mid of the array using the formula mid = left + (right - left) / 2. This formula ensures that mid is always an integer and is always between left and right.
	
	The method then checks if the value at arr[mid] is equal to the target value. If it is, the method returns mid as the index of the target value in the array.
	
	If the value at arr[mid] is less than the target value, the method updates left to mid + 1 and continues the loop.
	
	If the value at arr[mid] is greater than the target value, the method updates right to mid - 1 and continues the loop.
	
	If the loop exits without finding the target value, the method returns -1 to indicate that the target value is not present in the array.
	
	In the main method, an example array arr and target value target are defined, and the binarySearch method is called with these values. The result is printed to the console.
	**/
	
	
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int target = 12;
		int result = binarySearch(arr, target);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid;
			}

			// If target is greater, ignore left half
			if (arr[mid] < target) {
				left = mid + 1;
			}

			// If target is smaller, ignore right half
			else {
				right = mid - 1;
			}
		}

		// If we reach here, then the element was not present
		return -1;
	}
}
