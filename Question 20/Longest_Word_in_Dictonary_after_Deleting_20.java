/*
Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"

Example 2:
Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a"

Constraints:
1 <= s.length <= 1000
1 <= dictionary.length <= 1000
1 <= dictionary[i].length <= 1000
s and dictionary[i] consist of lowercase English letters.
*/

import java.util.*;

public class Longest_Word_in_Dictonary_after_Deleting_20 {
    public static String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        int max = 0; // Using 0 is more natural here
        for (String word : dictionary) {
            int i = 0, j = 0;
            // Check if 'word' is a subsequence of 's'
            while (i < word.length() && j < s.length()) {
                if (word.charAt(i) == s.charAt(j)) {
                    i++;
                }
                j++;
            }
            // If the entire word is a subsequence of s
            if (i == word.length()) {
                // Update the result if:
                // 1. word is longer than current result, or
                // 2. word has the same length but is lexicographically smaller.
                if (word.length() > max || (word.length() == max && word.compareTo(res) < 0)) {
                    max = word.length();
                    res = word;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("ale");
        dictionary.add("apple");
        dictionary.add("monkey");
        dictionary.add("plea");

        dictionary.add("a");
        dictionary.add("b");
        dictionary.add("c");

        System.out.println(findLongestWord(s, dictionary));
    }
}