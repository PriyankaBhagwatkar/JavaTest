package arraysCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplciateElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };
		//findDuplicateElementInArrayUsingJava8(inputArray);
		findDuplicatesUsingHashMap(inputArray);
	}

	// approach one using Java 8
	public static void findDuplicateElementInArrayUsingJava8(int[] inputArray) {
		Set<Integer> uniqueElement = new HashSet<>();
		Set<Integer> duplicateElement = Arrays.stream(inputArray).filter(i -> !uniqueElement.add(i)).boxed()
				.collect(Collectors.toSet());
		System.out.println(duplicateElement);
	}

	// approach two using hashmap
	public static void findDuplicatesUsingHashMap(int[] inputArray) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int element : inputArray) {
			if (map.get(element) == null) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element) + 1);
			}
			Set<Entry<Integer, Integer>> entrySet = map.entrySet();

			for (Entry<Integer, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(
							"Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
				}
			}
		}

	}

}
