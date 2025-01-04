public class Binary_Tree_Basics {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height_Tree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftH = height_Tree(root.left);
        int rightH = height_Tree(root.right);
        int height = Math.max(leftH, rightH) + 1;
        return height;
    }

    public static int countNodes(Node root){
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        int treeCount = leftCount + rightCount + 1;
        return treeCount;
    }

    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int treeSum = leftSum + rightSum + root.data;
        return treeSum;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        root.left.right.right.right.right = new Node(7);

        // System.out.println(height_Tree(root));
        // System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
    }
}
