/*
Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

Example 1:
Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3

Example 2:
Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5

Example 3:
Input: s = "1111"
Output: 3

Constraints:
2 <= s.length <= 500
The string s consists of characters '0' and '1' only.
*/

public class Max_Score_After_Split_String_13 {
    public static int maxScore(String s) {
        int n = s.length();
        // Total count of 1's in the string.
        int totalOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }
        
        int maxScore = 0;
        int countZeros = 0;
        // We cannot split at the very end so iterate until n-1.
        for (int i = 0; i < n - 1; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                countZeros++;
            } else {
                totalOnes--;
            }
            // Ones in the right part = total ones - ones in the left part.
            int score = countZeros + totalOnes;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
}