/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.Return the sum of the three integers.You may assume that each input would have exactly one 
solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

Constraints:
3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
*/

import java.util.Arrays;

public class Three_Sum_Closest_38 {
    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0, diff = Integer.MAX_VALUE, closestSum = nums[0] + nums[1] + nums[2], currDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                diff = Math.abs(target - sum);
                if (currDiff > diff) {
                    currDiff = diff;
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else{
                    right--;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,4,1};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}