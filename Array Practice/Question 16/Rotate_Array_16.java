/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 */


public class Rotate_Array_16 {
    public static void rotate(int[] nums, int k) {
        // this is brute force approach and this approach is good for when inputs is less but not for lengthy inputs and this brute force approach
        if (k == 0) {
            return;
        }

        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
        }

        rotate(nums, k - 1);
    }

    public static void rotateII(int[] nums, int k){
        // Optimized approach

        if (nums == null || nums.length == 0) {
            return;
        }
        
        k = k % nums.length; // Adjust k if it's greater than nums.length
        
        // If no rotation is needed, just return.
        if (k == 0) {
            return;
        }
        
        // Reverse the entire array.
        reverse(nums, 0, nums.length - 1);
        
        // Reverse the first k elements.
        reverse(nums, 0, k - 1);
        
        // Reverse the remaining n - k elements.
        reverse(nums, k, nums.length - 1);
    }
    
    // Helper method to reverse a portion of the array.
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {  // using < is sufficient
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
        
    

    public static void main(String[] args) {
        int nums[] = { -1 };
        int k = 3;
        rotateII(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
