import java.util.*;

public class Stack_Implementation_Using_ArrayList {
    static class Stack {
        static ArrayList<Integer> stack = new ArrayList<>();

        // function for check empty or not
        public static boolean isEmpty() {
            return stack.size() == 0;
        }

        // push
        public static void push(int data) {
            stack.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            // int top = stack.get(stack.size() - 1);
            // return top;
            return stack.remove(stack.size() - 1); // remove function is also return deleted value so donot make another variable to stire the deleted value
        }
        
        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return stack.get(stack.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println("Deleted element " + s.pop());
        }
    }
}