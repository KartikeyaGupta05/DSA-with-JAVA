/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
 */

// Method 1: brute force, O(n^2) to get start and end, O(n) to calculate sum
// Method 2: prefix sum, O(n^2) to get start and end, use prefix sum to calculate sum -- O(1)
// Method 2.1: prefix sum without using extra space
// Method 3: extends from prefix sum, sum[i] - sum[j] == k means the sum of middle elements is 

import java.util.HashMap;

public class Subarray_Sum_Equals_to_K_11 {

    // BRUTE FORCE APPROACH
    public static void subarraySum(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int K = i; K <= j; K++) {
                    sum += nums[K];
                }
                System.out.println(sum);
                if (sum == k) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    // OPTIMIZED APPROACH USING

    public static void subarraySum2(int[] nums, int k) {
        int result = 0;
        int curr = 0; // in this we store prefix sum elements
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : nums) {
            curr += i;
            if (map.containsKey(curr - k)) {
                result += map.get(curr - k);
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1);

        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        subarraySum2(nums, k);
    }
}