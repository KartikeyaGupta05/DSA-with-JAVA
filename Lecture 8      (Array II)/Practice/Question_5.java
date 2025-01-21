/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j!= k, and nums[i] + nums[j] + nums[k] == 0. Notice that the solution set must not contain duplicate triplets.   

Example 1: Input: nums = [-1, 0, 1, 2, -1, -4] 
Output: [ [-1, -1, 2] , [-1, 0, 1] ]  
Example 2: Input: nums = [ ]  
Output: [ ]   
Example 3: Input: nums = [ 0 ]  
Output: [ ]   

Constraints: 
•  0 <= nums . length <= 3000 
•  -105 <= nums [ i ] <= 105 */

import java.util.ArrayList;
import java.util.HashSet;

public class Question_5 {
    // {-1, 0, 1, 2, -4}
    public static void printTriplets(ArrayList<Integer> num){
        if (num.size() == 0 || num.size() == 1 || num.size() == 2) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < num.size() ; i++) {
            for (int j = i+1; j < num.size(); j++) {
                for (int k = j+1; k < num.size(); k++) {
                    if (num.get(i) + num.get(j) + num.get(k) == 0) {
                        System.out.print("[" + num.get(i) + "," + num.get(j) + "," + num.get(k) + "]");
                    }
                }
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer i : set) {
            num.add(i);
        }
        System.out.println(num);
        printTriplets(num);
    }
}
