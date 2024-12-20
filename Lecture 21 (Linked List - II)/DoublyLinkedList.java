public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Methods
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst(){
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        size--;
        if (size == 1) {
            head = tail = null;
            return val;
        }
        head = head.next;
        head.prev = null;
        return val;
    }
    

    public void printLL() { // O(n)
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node curr = head;
        Node Prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = Prev;
            curr.prev = next;
            Prev = curr;
            curr = next;
        }
        head = Prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printLL();
        System.out.println(size);

        // System.out.println(dll.removeFirst());
        // dll.printLL();
        // System.out.println(size);
        
        dll.reverse();
        dll.printLL();
    }
}
