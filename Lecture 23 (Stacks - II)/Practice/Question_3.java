import java.util.*;

public class Question_3 {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the multiplier k
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current multiplier and string onto the stack
                countStack.push(k);
                resultStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                // Pop the last multiplier and previous string
                StringBuilder decoded = resultStack.pop();
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(currentString);
                }
                currentString = decoded;
            } else {
                // Append regular characters to the current string
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(decodeString("2[cv]")); // Output: cvcv
        System.out.println(decodeString("3[b2[v]]")); // Output: bvvbvvbvv
    }
}

