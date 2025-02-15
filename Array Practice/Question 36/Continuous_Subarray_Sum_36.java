/*
Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
A good subarray is a subarray where:
1. its length is at least two, and
2. the sum of the elements of the subarray is a multiple of k.
Note that:
1. A subarray is a contiguous part of the array.
2. An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

Example 1:
Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

Example 2:
Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.

Example 3:
Input: nums = [23,2,6,4,7], k = 13
Output: false

Constraints:
1 <= nums.length <= 105
0 <= nums[i] <= 109
0 <= sum(nums[i]) <= 231 - 1
1 <= k <= 231 - 1
*/

import java.util.HashMap;
import java.util.Map;

public class Continuous_Subarray_Sum_36 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        // Create a HashMap to store the earliest index where a given remainder is seen.
        // We start with 0 mapped to -1. This helps us handle cases where a subarray starting
        // at index 0 has a sum that is a multiple of k.
        Map<Integer, Integer> modIndex = new HashMap<>();
        modIndex.put(0, -1);
        
        int sum = 0;
        // Iterate over the array, calculating the running (prefix) sum.
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // When k is not zero, compute the remainder of the running sum modulo k.
            // The expression ((sum % k) + k) % k ensures that the remainder is non-negative,
            // even if sum is negative.
            int mod = (k != 0) ? ((sum % k) + k) % k : sum;
            
            // If we have seen the same remainder before...
            if (modIndex.containsKey(mod)) {
                // Check if the subarray length is at least 2.
                // The current index i minus the previous index where this remainder first occurred
                // must be greater than 1.
                if (i - modIndex.get(mod) > 1)
                    return true;
            } else {
                // Otherwise, store the remainder with the current index.
                // We only store the first occurrence to maximize the length difference.
                modIndex.put(mod, i);
            }
        }
        // If we finish the loop without finding such a subarray, return false.
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};
        int k = 13;
        System.out.println(checkSubarraySum(nums, k));
    }
}
