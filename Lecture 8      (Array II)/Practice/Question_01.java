/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.  
   Example 1: Input: nums = [1, 2, 3, 1] 
   Output: true  
   Example 2: Input: nums = [1, 2, 3, 4] 
   Output: false  
   Example 3: Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] 
   Output: true   
   Constraints: 
   •  1 <= nums . lengtth <= 105 
   •  -109 <= nums [ i ] <= 109  */

import java.util.HashMap;

public class Question_01 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4, 3, 2, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        boolean duplicate = false;
        for (Integer i : map.keySet()) {
            if (map.get(i) != 1) {
                duplicate = true;
                break;
            } 
        }

        System.out.println(duplicate);
    }
}