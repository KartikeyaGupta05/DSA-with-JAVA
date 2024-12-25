import java.util.Stack;

public class Stack_Implementation_Using_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        // pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        // peek operation
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // stack s = new stack();
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // while (!s.isEmpty()) {
        // System.out.println("Top element is: " + s.peek());
        // System.out.println("Popped element is: " + s.pop());
        // }
        
        
        // Using Java Collection Framework
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.println("Top element is: " + stack.peek());
            System.out.println("Popped element is: " + stack.pop());
        }
        
    }
}
