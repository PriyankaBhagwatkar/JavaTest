
public class MinAndMaxInArray {
	
	/**
	 * Input:
	 * N = 6
	 * A[] = {3, 2, 1, 56, 10000, 167}
	 * Output: 1 10000
	 * Explanation: minimum and maximum elements of array are 1 and 10000.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {1,3,5,4,3,22,34};
		System.err.println(getMinMax(arr,arr.length));
	}
	
	public static Pair getMinMax(long a[], long n)  
    {
		long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        return new Pair(min, max);
    }

}
