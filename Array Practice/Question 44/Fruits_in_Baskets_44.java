/*
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree while moving to the right. The picked fruits must fit in one of your baskets.Once you reach a tree with fruit that cannot fit in your baskets, you must stop.Given the integer array fruits, return the maximum number of fruits you can pick.

Example 1:
Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.

Example 2:
Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].

Example 3:
Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
*/

import java.util.*;

public class Fruits_in_Baskets_44 {
    public static int totalFruit(int[] fruits) {
         // This map will hold the count of each fruit type in the current window.
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;         // Left pointer for our window
        int maxFruits = 0;    // To keep track of the maximum number of fruits picked
        
        // Extend the window with the right pointer.
        for (int right = 0; right < fruits.length; right++) {
            // Add the current fruit to the basket (or update its count)
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            
            // If we have more than 2 types of fruits, shrink the window from the left.
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]); // Remove fruit type if its count is 0
                }
                left++;  // Move the left pointer to the right
            }
            
            // Update the maximum window size (i.e., the total fruits we can pick)
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        
        return maxFruits;

    }
    public static void main(String[] args) {
        int[] fruits2 = {0, 1, 2, 2};
        int[] fruits3 = {1, 2, 3, 2, 2};
        
        System.out.println("Test case 2 (Expected 3): " + totalFruit(fruits2));
        System.out.println("Test case 3 (Expected 4): " + totalFruit(fruits3));
    }
}