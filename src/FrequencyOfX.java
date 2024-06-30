import java.util.HashMap;
import java.util.Map;

public class FrequencyOfX {
	
	/**
	 * Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.
	 * **/
	
	
    public static void main(String[] args) {
        int[] vector = {1, 1, 1, 1, 1};
        int x = 1;
        int frequency = findFrequency(vector, x);
        System.out.println(frequency); // Output: 5
    }

    public static int findFrequency(int[] A, int x) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        return frequencyMap.getOrDefault(x, 0);
    }
}
