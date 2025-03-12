/*
You are given a string s.
Your task is to remove all digits by doing this operation repeatedly:Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.

Example 1:
Input: s = "abc"
Output: "abc"
Explanation:
There is no digit in the string.

Example 2:
Input: s = "cb34"
Output: ""
Explanation:
First, we apply the operation on s[2], and s becomes "c4".Then we apply the operation on s[1], and s becomes "".

Constraints:
1 <= s.length <= 100
s consists only of lowercase English letters and digits.
The input is generated such that it is possible to delete all digits.
 */

import java.util.Stack;

public class Clear_Digits_01 {
    public static String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                stk.push(ch);
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stk) { // Iterating without popping
            sb.append(ch);
        }
        String result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        String s = "cbb";
        System.out.println(clearDigits(s));
    }
}