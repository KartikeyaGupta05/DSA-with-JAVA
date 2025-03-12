/*
You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.Return any permutation of s that satisfies this property.

Example 1:
Input: order = "cba", s = "abcd"
Output: "cbad"
Explanation: "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".
Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.

Example 2:
Input: order = "bcafg", s = "abcd"
Output: "bcad"
Explanation: The characters "b", "c", and "a" from order dictate the order for the characters in s. The character "d" in s does not appear in order, so its position is flexible.

Following the order of appearance in order, "b", "c", and "a" from s should be arranged as "b", "c", "a". "d" can be placed at any position since it's not in order. The output "bcad" correctly follows this rule. Other arrangements like "dbca" or "bcda" would also be valid, as long as "b", "c", "a" maintain their order.

Constraints:
1 <= order.length <= 26
1 <= s.length <= 200
order and s consist of lowercase English letters.
All the characters of order are unique.
*/

import java.util.*;

public class Custom_Sort_String_22 {
    public static String customSortString(String order, String s) {
        // StringBuilder str = new StringBuilder();
        // Map<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // int j = 0;
        // while (j < order.length()) {
        // char ch = order.charAt(j);
        // if (map.containsKey(ch)) {
        // str.append(ch);
        // map.put(ch, map.get(ch) - 1);
        // j++;
        // }
        // else{
        // j++;
        // }
        // }

        // if (map.isEmpty()) {
        // return new String(str);
        // }

        // // for (Character key : map.keySet()) {
        // // if (map.get(key) >= 1) {
        // // str.append(key);
        // // }
        // // }

        // for(int i = 0; i<map.size(); i++){
        // while(map.get(s.charAt(i)) >= 1){
        // map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        // str.append(s.charAt(i));
        // }
        // }

        // return new String(str);

        StringBuilder result = new StringBuilder();
        Map<Character, Integer> count = new HashMap<>();

        // Count frequency of each character in s
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // Append characters in the order specified by 'order'
        for (char c : order.toCharArray()) {
            if (count.containsKey(c)) {
                int frequency = count.get(c);
                while (frequency-- > 0) {
                    result.append(c);
                }
                count.remove(c);
            }
        }

        // Append remaining characters that were not in 'order'
        for (char c : count.keySet()) {
            int frequency = count.get(c);
            while (frequency-- > 0) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String order = "bacfg", s = "abcaaad";
        System.out.println(customSortString(order, s));
    }
}