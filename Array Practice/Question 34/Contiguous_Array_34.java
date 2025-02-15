/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

Example 2:
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

import java.util.*;

public class Contiguous_Array_34 {
    public static int findMaxLength(int[] nums) {
        // brute force approach - with some wrong testcases
        int count0 = 0, count1 = 0;
        for (int i : nums) {
            if (i == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        return Math.min(count0, count1) * (2);
    }

    public static int optimized_Approach(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }

        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(0, -1); // creating hashmap for storeing first occurance
        int maxlength = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            if (map.containsKey(prefixSum[i])) {
                maxlength = Math.max(maxlength, (i - map.get(prefixSum[i])));
            } else{
                map.put(prefixSum[i], i);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int nums[] = { 0,1,1,0,1,1,1,0 };
        System.out.println(optimized_Approach(nums));
    }
}