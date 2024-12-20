public class LinkedList {
    public static class Node {
        // int data;
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    // Methods
    public void addFirst(char data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(char data) {
        Node newNode = new Node(data);
        size++;

        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    public void reverseLL(){  // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int idx){  // O(n)
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (idx == sz){
            head = head.next;  // remove first
            return;
        }
        Node prev = head;
        for (int i = 1; i < sz - idx; i++) {  // here we go to sz - idx because we have idx from tail and we use loop from head
            prev = prev.next;
        }
        prev.next = prev.next.next; 
    }

    public Node findmidlleNode(Node head){
        Node slow = head;  // this is known as slow-fast method
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
        }
        return slow;
    }
    public boolean checkPalindrome(){  // O(n)
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 - find midNode
        Node midNode = findmidlleNode(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step 3 - check left and right half
        Node left = head;  // left half head
        Node right = prev; // right half head
        while (right != null) {
            if (left.data != right.data) {
                return false;
            } else{
                left = left.next;
                right = right.next;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4); 
        // ll.addLast(5); 
        // ll.reverseLL();
        // ll.deleteNthfromEnd(3);

        // ll.addLast(1); 
        // ll.addLast(2); 
        // ll.addLast(2); 
        // ll.addLast(1); 
        // ll.printLL();  // 1->2->2->1->null

        ll.addLast('r'); 
        ll.addLast('a'); 
        ll.addLast('c'); 
        ll.addLast('e'); 
        ll.addLast('c'); 
        ll.addLast('a'); 
        ll.addLast('r'); 
        ll.printLL();  //r->a->c->e->c->a->r->null
        System.out.println(ll.checkPalindrome());
    }
}
