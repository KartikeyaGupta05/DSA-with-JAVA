import java.util.Stack;

public class Duplicate_Parantheses { // medium level question
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ')') {
                s.push(ch);
            } else {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count > 1) {
                    s.pop();
                } else{
                    return true;  // duplicate
                }
            }
        }
        return false;
    }

    public static void main(String[] args) { // TC is O(n)
        // String str = "(((a + (b))) + (c + d))";
        String str = "((a + b) + (c + d))";
        System.out.println(isDuplicate(str));
    }
}
