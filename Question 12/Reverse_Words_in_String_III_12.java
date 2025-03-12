/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order. 

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"

Constraints:
1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
*/

public class Reverse_Words_in_String_III_12 {
    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int start = 0;
        // Iterate through the array; note the loop goes to n (one past the last index)
        for (int i = 0; i <= n; i++) {
            // When we hit a space or reach the end, reverse the word from 'start' to 'i - 1'
            if (i == n || ch[i] == ' ') {
                reverse(start, i - 1, ch);
                // Set the start of the next word to be i + 1
                start = i + 1;
            }
        }
        return new String(ch);
    }

    private static void reverse(int left, int right, char[] ch){
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}