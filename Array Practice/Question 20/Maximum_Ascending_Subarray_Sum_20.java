/*
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.A subarray is defined as a contiguous sequence of numbers in an array.A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

public class Maximum_Ascending_Subarray_Sum_20 {
    public static int maxAscendingSum(int[] nums) {
        int sum = nums[0], maxSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum += nums[i + 1];
            } else{
                maxSum = Math.max(maxSum, sum);
                sum = nums[i + 1];
            }
        }
        return Math.max(maxSum, sum);
    }
    

    public static void main(String[] args) {
        int nums[] = { 12,17,15,13,10,11,12 };
        System.out.println(maxAscendingSum(nums));
    }
}
