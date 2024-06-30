import java.util.Arrays;

public class SortedOrderArray {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 2};
        int n = arr.length;
        int[] sortedArr = sortArr(arr, n);
        System.out.println(Arrays.toString(sortedArr)); // Output: [1, 2, 3, 5]
    }

    public static int[] sortArr(int[] arr, int n) {
        Arrays.sort(arr);
        return arr;
    }
    
    
    

}
