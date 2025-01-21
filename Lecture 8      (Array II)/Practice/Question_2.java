/*There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the resulting  array  is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity.  
Example 1: Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0 
Output: 4  
Example 2: Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3 
Output: -1 
Example 3: Input: nums = [1], target = 0 
Output: -1  

Constraints: 
•  1 <= nums . lengtth <= 5000 
•  -104 <= nums [ i ] <= 104 
•  All values of nums are unique. 
•  nums is an ascending array that is possibly rotated. 
•  -104 <= target <= 104 */

public class Question_2 {
    // Optimized pivot finding using binary search
    public static int findPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                // Pivot must be to the right of mid
                left = mid + 1;
            } else {
                // Pivot is at mid or to the left of mid
                right = mid;
            }
        }
        return left; // Pivot index
    }

    // Binary search on rotated array
    public static int binarySearch(int[] nums, int pivot, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int realMid = (mid + pivot) % n; // Adjusted index in rotated array
            if (nums[realMid] == target) {
                return realMid;
            } else if (nums[realMid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;

        // Find the pivot index using binary search
        int pivot = findPivot(nums);

        // Perform binary search on the rotated array
        int result = binarySearch(nums, pivot, target);
        System.out.println(result == -1 ? "Element not found" : "Element is at position " + result);
    }
}
