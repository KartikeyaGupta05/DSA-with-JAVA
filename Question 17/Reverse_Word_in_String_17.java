/*
Given an input string s, reverse the order of the words.A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.Return a string of the words in reverse order concatenated by a single space.Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
*/

public class Reverse_Word_in_String_17 {
    public static String reverseWords(String s) {
          // 1. Trim leading and trailing spaces
          // 2. Split by one or more spaces using regex "\\s+"
          String[] words = s.trim().split("\\s+");
          
          // 3. Use StringBuilder to append words in reverse order
          StringBuilder rever = new StringBuilder();
  
          for (int i = words.length - 1; i >= 0; i--) {
              rever.append(words[i]);
              if (i > 0) rever.append(" "); // No space after the last word
          }
          return rever.toString(); // Return the reversed string
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}