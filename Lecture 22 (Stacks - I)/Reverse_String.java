import java.util.Stack;

public class Reverse_String {
    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void reverseAStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseAStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        // String str = "Hello";
        // System.out.println(reverseStringUsingStack(str));

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // printStack(s);
        reverseAStack(s);
        printStack(s);
    } 
}
