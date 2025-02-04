/*Given an numsay nums[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the numsay whose sum is equal to a given target value.

 Input: nums[] = [11, 15, 6, 8, 9, 10], target = 16
Output: true
Explanation: There is a pair (6, 10) with sum 16.

Input: nums[] = [11, 11, 15, 26, 38, 9, 10], target = 35
Output: true
Explanation: There is a pair (26, 9) with sum 35.

Input: nums[] = [9, 10, 10, 11, 15, 26, 38], target = 45
Output: false
Explanation: There is no pair with sum 45.
 */


public class PairSuminaSortedandRotatedArray_05 {
    static boolean pairInSortedRotated(int[] nums, int target) {
        int n = nums.length;

        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (nums[i] > nums[i + 1])
                break;

        // l is now index of smallest element
        int l = (i + 1) % n;

        // r is now index of largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r) {

            // If we find a pair with sum target, return true
            if (nums[l] + nums[r] == target)
                return true;

            // If current pair sum is less, move to higher sum
            if (nums[l] + nums[r] < target)
                l = (l + 1) % n;

            // Move to lower sum side
            else
                r = (r - 1 + n) % n;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {11, 15, 6, 8, 9, 10};
        int target = 17;
        if (pairInSortedRotated(nums, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
