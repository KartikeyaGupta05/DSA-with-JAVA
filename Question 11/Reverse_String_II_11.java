/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"

Constraints:
1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
*/

public class Reverse_String_II_11 {
    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        // Process each 2k chunk.
        for (int i = 0; i < ch.length; i += 2 * k) {
            int left = i;
            // Ensure we don't go out of bounds.
            int right = Math.min(i + k - 1, ch.length - 1);
            reverse(left, right, ch);
        }
        return String.valueOf(ch);
    }

    private static void reverse(int left, int right, char[] ch) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;

        System.out.println(reverseStr(s, k));
    }
}

/*
 * Using String builder
 char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, ch.length - 1);
            reverse(left, right, ch);
        }
        return String.valueOf(ch);
    }

    private static void reverse(int left, int right, char[] ch) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
 */