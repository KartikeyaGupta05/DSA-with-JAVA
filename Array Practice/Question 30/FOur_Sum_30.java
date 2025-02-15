/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]

Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
*/

import java.util.*;

public class FOur_Sum_30 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            if (nums == null || nums.length < 4) return res;
            
            Arrays.sort(nums);
            int n = nums.length;
            
            for (int i = 0; i < n - 3; i++) {
                // Skip duplicates for the first element.
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                
                for (int j = i + 1; j < n - 2; j++) {
                    // Skip duplicates for the second element.
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                    
                    int left = j + 1;
                    int right = n - 1;
                    
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            left++;
                            right--;
                            // Skip duplicate third elements.
                            while (left < right && nums[left] == nums[left - 1]) left++;
                            // Skip duplicate fourth elements.
                            while (left < right && nums[right] == nums[right + 1]) right--;
                        } else if (sum < target) {
                            left++;
                        } else {  // sum > target
                            right--;
                        }
                    }
                }
            }
            return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1,0,-1,0,-2,2 };
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}


/*
* OPTIMIZED CODE

public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums == null || nums.length < 4) return res;
    
    Arrays.sort(nums);
    int n = nums.length;
    
    for (int i = 0; i < n - 3; i++) {
        // Skip duplicates for the first element.
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        
        // Early termination: smallest sum too large or largest sum too small.
        if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
        if ((long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) continue;
        
        for (int j = i + 1; j < n - 2; j++) {
            // Skip duplicates for the second element.
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;
            
            // Early termination for the inner loop.
            if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
            if ((long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target) continue;
            
            int left = j + 1;
            int right = n - 1;
            
            while (left < right) {
                long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
    return res;
}

 */
