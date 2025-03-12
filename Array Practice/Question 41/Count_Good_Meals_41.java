/*
A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.You can pick any two different foods to make a good meal.Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.Note that items with different indices are considered different even if they have the same deliciousness value.

Example 1:
Input: deliciousness = [1,3,5,7,9]
Output: 4
Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.

Example 2:
Input: deliciousness = [1,1,1,3,3,3,7]
Output: 15
Explanation: The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.

Constraints:
1 <= deliciousness.length <= 105
0 <= deliciousness[i] <= 220
*/

import java.util.HashMap;
import java.util.Map;

public class Count_Good_Meals_41 {
    private static final int MOD = 1_000_000_007;  // says in question 10^9 + 7
    public static int countPairs(int[] deliciousness) {
        int ans = 0;
        // Map to count occurrences of each deliciousness value
        Map<Integer, Integer> count = new HashMap<>();
        // There are 22 possible powers of two (from 2^0 to 2^21)
        for (int d : deliciousness) {
            for (int i = 0; i < 22; i++) {
                int power = 1 << i;  // Computes 2^i
                // For each power of two, we add the number of times we've seen (power - d)
                ans = (ans + count.getOrDefault(power - d, 0)) % MOD;
            }
            // After processing, add the current deliciousness to our map
            count.put(d, count.getOrDefault(d, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,7,9};
        System.out.println(countPairs(nums));
    }
}