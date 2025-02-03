/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]

Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */

import java.util.*;

public class Majority_Element_II_14 {
    public static void majorityElement(int[] nums){
        // Brute force approach using Hashmap

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer keys : map.keySet()) {
            if (map.get(keys) > (nums.length / 3)) {
                list.add(keys);
            }
        }

        System.out.println(list);
    }

    public static void optimized(int[] nums){
        
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        majorityElement(nums);
    }
}
