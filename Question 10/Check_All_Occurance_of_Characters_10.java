/*
Given a string s, return true if s is a good string, or false otherwise.A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Example 2:
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

Constraints:
1 <= s.length <= 1000
s consists of lowercase English letters.
*/

import java.util.HashMap;

public class Check_All_Occurance_of_Characters_10 {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int occur = map.get(s.charAt(0));
        for (Character key : map.keySet()) {
            if (occur != map.get(key)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = " ";
        System.out.println(areOccurrencesEqual(s));
    }
}