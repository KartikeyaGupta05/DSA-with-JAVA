import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 4, 2, 5, 1, 6, 1, 1 };  // Input array
        HashMap<Integer, Integer> map = new HashMap<>();  // HashMap to store frequency of elements

        // **First Solution: Brute Force Approach**
        for (int i = 0; i < nums.length; i++) {
            // Check if the element already exists in the map
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);  // Increment frequency
            } else {
                map.put(nums[i], 1);  // Add element with frequency 1
            }
        }

        // Iterate over the keys of the map
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            // Check if the frequency of the key is greater than n/3
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);  // Print the majority element
            }
        }

        // **Second Solution: Optimized Approach**
        map.clear();  // Clear the map to reuse it for the second solution

        for (int i = 0; i < nums.length; i++) {
            // Use `getOrDefault` to simplify frequency update
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate over the map's keys again
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);  // Print the majority element
            }
        }
    }
}
