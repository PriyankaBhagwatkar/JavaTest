import java.util.ArrayList;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> subarrayIndexes = subarraySum(arr, n, s);
        System.out.println(subarrayIndexes); // Output: [2, 4]
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> subarrayIndexes = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < n) {
            sum += arr[right];

            while (sum > s) {
                sum -= arr[left];
                left++;
            }

            if (sum == s) {
                subarrayIndexes.add(left + 1);
                subarrayIndexes.add(right + 1);
                return subarrayIndexes;
            }

            right++;
        }

        subarrayIndexes.add(-1);
        return subarrayIndexes;
    }
}
