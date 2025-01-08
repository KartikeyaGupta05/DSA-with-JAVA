import java.util.LinkedList;
import java.util.Queue;

/**
 * Class to transform a binary tree into a Sum Tree and perform level-order traversal.
 * A Sum Tree is a binary tree where the value of each node is the sum of the values
 * of its left and right subtrees in the original tree.
 */
public class Transform_to_Sum_Tree {

    /**
     * Node class to represent each node in the binary tree.
     */
    static class Node {
        int data;       // The value stored in the node
        Node left, right; // References to the left and right child nodes

        /**
         * Constructor to initialize a node with a given value and set its children to null.
         *
         * @param data The value to store in the node
         */
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Transform the binary tree into a Sum Tree.
     * Each node's value will be updated to the sum of the values of its left and right subtrees
     * in the original tree. The function returns the original value of the node before transformation.
     *
     * @param root The root node of the binary tree
     * @return The original value of the current node before transformation
     */
    public static int sumTree(Node root) {
        // Base case: If the node is null, return 0
        if (root == null) {
            return 0;
        }

        // Recursively calculate the sum of the left and right subtrees
        int leftChild = sumTree(root.left);  // Sum of left subtree
        int rightChild = sumTree(root.right); // Sum of right subtree

        // Store the original value of the current node
        int data = root.data;

        // Calculate the sum of the left and right subtrees' data
        // Use 0 if the left or right child is null
        int newLeftData = root.left == null ? 0 : root.left.data;
        int newRightData = root.right == null ? 0 : root.right.data;

        // Update the current node's value with the sum of its subtrees
        root.data = newLeftData + leftChild + newRightData + rightChild;

        // Return the original value of the current node
        return data;
    }

    /**
     * Perform level-order traversal (breadth-first traversal) of the binary tree.
     * This function prints each level of the tree on a new line.
     *
     * @param root The root node of the binary tree
     */
    public static void levelOrder(Node root) {
        // If the tree is empty, exit the function
        if (root == null) {
            return;
        }

        // Create a queue to facilitate level-order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root); // Add the root node to the queue
        q.add(null); // Add a null marker to denote the end of the current level

        while (!q.isEmpty()) {
            // Remove the front node from the queue
            Node currNode = q.remove();

            // Check if we have reached the end of a level
            if (currNode == null) {
                System.out.println(); // Print a newline for the next level
                if (q.isEmpty()) { // If the queue is empty, traversal is complete
                    break;
                } else {
                    q.add(null); // Add a null marker for the next level
                }
            } else {
                // Print the current node's value
                System.out.print(currNode.data + " ");

                // Add the left child to the queue if it exists
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                // Add the right child to the queue if it exists
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    /**
     * Main method to test the transformation of a binary tree into a Sum Tree
     * and perform level-order traversal.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a sample binary tree
        //          1
        //        /   \
        //       2     3
        //      / \   / \
        //     4   5 6   7
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Transform the binary tree into a Sum Tree
        sumTree(root);

        // Perform level-order traversal to print the Sum Tree
        levelOrder(root);
    }
}
