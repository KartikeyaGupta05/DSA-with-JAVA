// import java.util.*;

// public class Question_1{
//     public static class Node {
//         char data;
//         Node next;

//         public Node(char data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(char data) { // O(1)
//         // step 1 - Create new node
//         Node newNode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         // step 2 - newNode next = head
//         newNode.next = head; // linking step

//         // step 3 - head = newNode;
//         head = newNode;
//     }

//     public static boolean isPlaindrome(){
//         Stack<Character> s = new Stack<>();

//         // find mid 
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         Node mid = slow;

//         Node temp = head;
//             while (temp != mid.next) {
//                 s.push(temp.data);
//                 temp = temp.next;
//             }
//             if (size % 2 != 0) {
//                 s.pop();
//             }
//             while (temp != null) {
//                 if (temp.data == s.peek()) {
//                     s.pop();
//                     temp = temp.next;
//                 } else{
//                     return false;
//                 }
//             }
//         return true;
//     }
//     public static void main(String args[]){
//         Question_1 ll = new Question_1();
//         ll.addFirst('R');
//         ll.addFirst('A');
//         ll.addFirst('C');
//         ll.addFirst('E');
//         ll.addFirst('C');
//         ll.addFirst('E');
//         ll.addFirst('R');
//         System.out.println(isPlaindrome());
//     }
// }




import java.util.*;

public class Question_1 {
    public static boolean isPalindrome(LinkedList<Character> list) {
        // Use a Stack to help with the comparison
        Stack<Character> stack = new Stack<>();
        
        // Add all elements of the list to the stack
        for (char c : list) {
            stack.push(c);
        }

        // Compare the original list with the reversed elements in the stack
        for (char c : list) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Character> list = new LinkedList<>();
        list.add('R');
        list.add('A');
        list.add('C');
        list.add('E');
        list.add('C');
        list.add('A');
        list.add('R');
        
        // Check if the LinkedList is a palindrome
        System.out.println("Is the LinkedList a palindrome? " + isPalindrome(list));
    }
}
