/*
Given an array of integers arr, return true if and only if it is a valid mountain array. Recall that arr is a mountain array if and only if: arr.length >= 3 .
There exists some i with 0 < i < arr.length - 1 such that: 
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1:
Input: arr = [2,1]
Output: false

Example 2:
Input: arr = [3,5,5]
Output: false

Example 3:
Input: arr = [0,3,2,1]
Output: true

Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 104

 */

public class Valid_Mountain_Array_07 {
    public static boolean validMountain(int[] arr) {
        if (arr.length < 3) { // Minimum 3 elements required
            return false;
        }
    
        int max = Integer.MIN_VALUE;
        int idx = -1;
    
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
    
        if (idx == 0 || idx == arr.length - 1) { 
            return false; // Peak cannot be first or last element
        }
    
        // Check strictly increasing sequence before the peak
        for (int i = 0; i < idx; i++) {
            if (arr[i] >= arr[i + 1]) { // Should strictly increase
                return false;
            }
        }
    
        // Check strictly decreasing sequence after the peak
        for (int i = idx; i < arr.length - 1; i++) { // Avoid out-of-bounds error
            if (arr[i] <= arr[i + 1]) { // Should strictly decrease
                return false;
            }
        }
    
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 8, 5, 3, 1 };

        System.out.println(validMountain(arr));
    }
}



/*
 * OPTIMIZED SOLUTION
        int n = arr.length;        
        if (n < 3) return false;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) return false;
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
 */
