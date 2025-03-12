/*
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

Example 1:
Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

Example 2:
Input: a = "a", b = "aa"
Output: 2

Constraints:
1 <= a.length, b.length <= 104
a and b consist of lowercase English letters.
*/

public class Repeated_String_Match_04 {
    public static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        // Build the repeated string until its length is at least as long as B
        while (sb.length() < b.length()) {
            sb.append(b);
            count++;
        }
        
        // Check if B is a substring of the current repeated string
        if (sb.indexOf(b) != -1) {
            return count;
        }
        
        // Append one more A to cover cases where B spans the boundary between repeats
        sb.append(a);
        count++;
        return sb.indexOf(b) != -1 ? count : -1;
    }

    public static void main(String[] args) {
        String a = "abcd", b = "cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }
}