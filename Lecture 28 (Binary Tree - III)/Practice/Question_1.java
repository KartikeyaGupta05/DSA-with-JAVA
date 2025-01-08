public class Question_1{
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static boolean uniValued(Node root, int key){
        if (root == null) {
            return true;
        }

        if (key != root.data) {
            return false;
        }

        return uniValued(root.left, key) && uniValued(root.right, key);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(5);
        root.left.left = new Node(5);
        root.left.right = new Node(5);
        root.right = new Node(2);

        System.out.println(uniValued(root, root.data));
    }
}