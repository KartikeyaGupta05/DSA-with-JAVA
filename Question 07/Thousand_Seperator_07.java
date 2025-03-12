/*
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

Example 1:
Input: n = 987
Output: "987"

Example 2:
Input: n = 1234
Output: "1.234"

Constraints:
0 <= n <= 231 - 1
*/


public class Thousand_Seperator_07 {
    public static String thousandSeparator(int n) {
        final String s = Integer.toString(n);
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (i > 0 && (s.length() - i) % 3 == 0)
                ans.append('.');
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(thousandSeparator(0));
    }
}