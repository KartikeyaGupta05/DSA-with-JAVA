/*
An array is considered special if every pair of its adjacent elements contains two numbers with different parity.You are given an array of integer nums and a 2D integer matrix queries, where for queries[i] = [fromi, toi] your task is to check that subarray nums[fromi..toi] is special or not.Return an array of booleans answer such that answer[i] is true if nums[fromi..toi] is special.

Example 1:
Input: nums = [3,4,1,2,6], queries = [[0,4]]
Output: [false]
Explanation:
The subarray is [3,4,1,2,6]. 2 and 6 are both even.

Example 2:
Input: nums = [4,3,1,6], queries = [[0,2],[2,3]]
Output: [false,true]
Explanation:
The subarray is [4,3,1]. 3 and 1 are both odd. So the answer to this query is false.
The subarray is [1,6]. There is only one pair: (1,6) and it contains numbers with different parity. So the answer to this query is true.

Constraints:
1 <= nums.length <= 105
1 <= nums[i] <= 105
1 <= queries.length <= 105
queries[i].length == 2
0 <= queries[i][0] <= queries[i][1] <= nums.length - 1
*/

public class Special_Array_II_32 {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        // diff[i] will be 1 if nums[i] and nums[i+1] are NOT alternating, else 0.
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            // Check if the pair alternates in parity:
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 != 0) ||
                (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0)) {
                diff[i] = 0;
            } else {
                diff[i] = 1;
            }
        }

        // Build prefix sum array for diff.
        // prefix[i] represents the sum of diff[0] to diff[i-1].
        int[] prefix = new int[n];
        prefix[0] = 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + diff[i - 1];
        }

        // Answer each query using the prefix sum.
        boolean[] result = new boolean[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int left = queries[q][0];
            int right = queries[q][1];
            // For a single-element subarray, it's trivially alternating.
            if (left == right) {
                result[q] = true;
            } else {
                // For indices from left to right-1, check if there are any non-alternating pairs.
                // The sum in the interval is prefix[right] - prefix[left].
                result[q] = (prefix[right] - prefix[left]) == 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 3, 1, 6 };
        int queries[][] = { { 0, 2 }, { 2, 3 } };
        for (boolean i : isArraySpecial(nums, queries)) {
            System.out.print(i + " ");
        }
    }
}