/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/

import java.util.*;

public class Group_Annagrams_06 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Edge case: if the input is empty, return an empty list.
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // A HashMap to store sorted string as key and list of anagrams as value.
        Map<String, List<String>> map = new HashMap<>();
        
        // Process each string in the array.
        for (String s : strs) {
            // Convert string to a char array and sort it.
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            // The sorted string serves as the key.
            String key = new String(charArray);
            
            // If this key is not in the map, add it with a new list.
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add the original string to the corresponding list.
            map.get(key).add(s);
        }
        
        // Return all grouped anagrams.
        return new ArrayList<>(map.values());
      }
    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(words));
    }
}