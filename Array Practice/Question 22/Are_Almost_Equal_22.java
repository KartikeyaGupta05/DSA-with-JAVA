/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

Example 1:
Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".

Example 2:
Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.

Example 3:
Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.
 
Constraints:
1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters.
 */

import java.util.*;

public class Are_Almost_Equal_22 { 
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;  // Already equal, no swap needed

        List<Integer> diff = new ArrayList<>();

        // Find mismatched indices
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff.add(i);
            }
        }

        // More than 2 mismatches → Not possible with one swap
        if (diff.size() != 2) return false;

        // Check if swapping the two mismatched characters makes them equal
        int i = diff.get(0), j = diff.get(1);
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);

    }
    public static void main(String[] args) {
        String s1 = "defend", s2 = "attack";
        System.out.println(areAlmostEqual(s1, s2));
    }
}