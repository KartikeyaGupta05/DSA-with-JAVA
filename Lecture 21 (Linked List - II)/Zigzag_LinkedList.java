public class Zigzag_LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL() { // O(n)
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    } 

    public void zigzagLL(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse right part
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate merging - zigzag merge
        Node leftH = head;
        Node rightH = prev;

        // temporary node 
        Node nextLeft , nextRight;

        while (leftH != null && rightH != null) {
            // zigzag
            nextLeft = leftH.next;
            leftH.next = rightH;
            nextRight = rightH.next;
            rightH.next = nextLeft;

            // update
            leftH = nextLeft;
            rightH = nextRight;
        }

    }
    public static void main(String[] args) {
        Zigzag_LinkedList ll = new Zigzag_LinkedList();

        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();

        ll.zigzagLL();
        ll.printLL();
        
        
    }
}
