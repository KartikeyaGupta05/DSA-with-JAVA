public class Linked_List{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


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

    public boolean detectLoop(){  // floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        // step 1 - detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycleExist = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExist = true;
                break;
            }
        }

        if (cycleExist == false) {
            return;
        }

        // finding meeting point
        slow = head;
        Node prev = null;  // track last node
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // step 3 - remove cycle last node .next = null
        prev.next = null;
    }
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        // print 1->2->3->4->5->2
        System.out.println(ll.detectLoop());
        ll.removeCycle();
        ll.printLL();

    }
}