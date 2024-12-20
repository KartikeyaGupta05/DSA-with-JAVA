public class Merge_SortLinkedList {

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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null)
            return head;

        // find mid
        Node mid = getMid(head);

        // call ms for left and right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head); // left half
        Node newRight = mergeSort(rightHead); // right half

        // Merge both part
        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        Merge_SortLinkedList ll = new Merge_SortLinkedList();

        ll.addFirst(3);
        ll.addFirst(12);
        ll.addFirst(24);
        ll.addFirst(5);
        ll.addFirst(33);
        ll.addFirst(1);
        ll.printLL();
        
        ll.head = ll.mergeSort(ll.head);
        ll.printLL();
    }
}
