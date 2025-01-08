public class Kth_Level {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void  Klevel(Node root, int k, int level){   // TC = O(n)
        if (root == null) {
            return;
        }
        if (level == k) {  // for check that level element and if found than print that
            System.out.print(root.data + " ");
            return;
        }

        Klevel(root.left, k, level + 1);
        Klevel(root.right, k, level + 1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 3;

        Klevel(root, k, 1);
    }
}