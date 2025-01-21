/*A permutation of an array of integers is an arrangement of its members into a sequence or linear order.For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1]. The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
For example, the next permutation of arr = [1,2,3] is [1,3,2]. Similarly, the next permutation of arr = [2,3,1] is [3,1,2]. While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement. Given an array of integers nums, find the next permutation of nums. The replacement must be in place and use only constant extra memory.


Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]
 

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 100 */

// case 1
// * [1,2,3], [2, 1, 3], [3,1,2],

// case 2   
// * [1,3,2], [2, 3, 1]    -> [1, 3, 2] -> start < last -> [2, 1, 3]

// case 3
// * [3,2,1]


public class Next_Permutation_03 {
    public static void nextPermutation(int[] nums) {
        int start = 0;
        int last = nums.length - 1;
        int mid = (start + last) / 2;


        // case 1
        if (nums[start] >= nums[mid] && nums[mid] >= nums[last]) {
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
        }

        else if (nums[start] == nums[last]) {
            int temp = nums[start];
            nums[start] = nums[mid];
            nums[mid] = temp;
        }

        // case 2
        else if (nums[mid] < nums[last]) {
            int temp = nums[mid];
            nums[mid] = nums[last];
            nums[last] = temp;
        }

        // case 3
        else if (nums[mid] > nums[last]) {
            if (nums[start] <= nums[last]) {
                int temp = nums[mid];
                nums[mid] = nums[last];
                nums[last] = temp;

                temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;

            } else if (nums[start] > nums[last]) {
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;

                temp = nums[mid];
                nums[mid] = nums[last];
                nums[last] = temp;
            }
        }

        
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 1 };

        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
