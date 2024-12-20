public class Linked_list {
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
    public static int size;

    // Methods

    public void addFirst(int data) { // O(1)
        // step 1 - Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head
        newNode.next = head; // linking step

        // step 3 - head = newNode;
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        // step 1 - Create a Node
        Node newNode = new Node(data);
        size++;

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newnode- next = null
        // newNode.next = null; // this step is not needed because we initially put next
        // = null

        // step 3 - tail - next = tail = new node
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data, int idx) { // O(n)
        if (idx == 0) {
            addFirst(data);
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
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

    public int linearSearch(int key) { // O(n)
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i + 1;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }
    public int helper(int key, Node head){
        // base case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 1;
        }
        int idx = helper(key, head.next);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int searchReccursion(int key) {  // O(n) because of helper func
        return helper(key, head);
    }

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(5, 2);

        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        ll.printLL();

        // System.out.println(size);

        System.out.println("Key found at " + ll.linearSearch(4));
        System.out.println("Key found at " + ll.searchReccursion(4));

    }
}
