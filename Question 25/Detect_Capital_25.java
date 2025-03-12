/*
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false

Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
*/

public class Detect_Capital_25 {
    public static boolean detectCapitalUse(String word) {
        // char c[] = word.toCharArray();
        
        // if (word.length() <= 1) {
        //     return true;
        // }
        // int i = 0;
        // if (c[i] - 'a' < 0) {
        //     if (c[i + 1] - 'a' < 0) {
        //         for (int j = 2; j < c.length; j++) {
        //             if (c[j] - 'a' >= 0) {
        //                 return false;
        //             }
        //         }
        //     } else {
        //         for (int j = 2; j < c.length; j++) {
        //             if (c[j] - 'a' < 0) {
        //                 return false;
        //             }
        //         }
        //     }
        // } else {
        //     for (int j = 1; j < c.length; j++) {
        //         if (c[j] - 'a' < 0) {
        //             return false;
        //         }
        //     }
        // }
        // return true;

        return word.equals(word.toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
    }

    public static void main(String[] args) {
        String s = "USa";
        
        System.out.println(detectCapitalUse(s));
    }
}