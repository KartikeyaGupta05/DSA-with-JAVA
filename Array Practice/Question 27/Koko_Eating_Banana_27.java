/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

Example 3
Input: piles = [30,11,23,4,20], h = 6
Output: 23

Constraints:
1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
 */
 

public class Koko_Eating_Banana_27 {
    public static int minEatingSpeed(int[] piles, int h) {
        // The minimum speed is at least 1
        int low = 1;
        // Maximum possible speed is the size of the largest pile
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        // Binary search for the minimum speed that allows finishing within h hours.
        while (low < high) {
            int mid = low + (high - low) / 2;
            int totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid; // This is equivalent to Math.ceil((double)pile / mid)
            }
            if (totalHours <= h) {
                // This speed is sufficient; try to see if a smaller speed will also work.
                high = mid;
            } else {
                // This speed is too slow; increase it.
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}