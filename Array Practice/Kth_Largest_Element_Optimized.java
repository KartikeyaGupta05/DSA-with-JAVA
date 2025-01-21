/*
Given an integer array nums and an integer k, return the kth largest element in the array.Note that it is the kth largest element in the sorted order, not the kth distinct element.Can you solve it without sorting?

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */

//  public class Kth_Largest_Element_02 {
// public static void kthLargest(int[] nums, int k, int n) {
//     if (k <= 0 || k > nums.length) {
//         System.out.println("Invalid value of k");
//         return;
//     }

//     int max = Integer.MIN_VALUE;
//     int idx = -1;
//     for (int i = 0; i < n; i++) {
//         if (nums[i] > max) {
//             max = nums[i];
//             idx = i;
//         }
//     }

//     // Move the largest element to the end of the array
//     int temp = nums[n - 1];
//     nums[n - 1] = nums[idx];
//     nums[idx] = temp;

//     if (k == 1) {
//         System.out.println(max); // Print the kth largest element
//         return;
//     }

//     kthLargest(nums, k - 1, n - 1); // Recursive call
// }

// public static void main(String[] args) {
//     int nums[] = {3, 2, 1, 5, 6, 4};
//     int k = 3;
//     kthLargest(nums, k, nums.length);
// }
//  }




// optimized code 
import java.util.Random;

public class Kth_Largest_Element_Optimized {
    public static int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) {
            return nums[left]; // Only one element in the range
        }

        Random random = new Random();
        int pivotIndex = left + random.nextInt(right - left + 1);

        // Partition the array around the pivot
        pivotIndex = partition(nums, left, right, pivotIndex);

        // Determine the position of the pivot in sorted order
        int count = right - pivotIndex + 1;

        if (count == k) {
            return nums[pivotIndex];
        } else if (count > k) {
            return quickSelect(nums, pivotIndex + 1, right, k); // Search right part
        } else {
            return quickSelect(nums, left, pivotIndex - 1, k - count); // Search left part
        }
    }

    private static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        // Move pivot to the end
        swap(nums, pivotIndex, right);

        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        // Move pivot to its final position
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 3;

        int result = quickSelect(nums, 0, nums.length - 1, k);
        System.out.println("The " + k + "rd largest element is: " + result);
    }
}
