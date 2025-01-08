// Class to find the minimum distance between two nodes in a binary tree
public class Min_Distance_Between_Nodes {

    // Node class to represent each node of the binary tree
    static class Node {
        int data;       // Data stored in the node
        Node left, right; // References to the left and right children

        // Constructor to initialize a node with data and set children to null
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Function: LCA2 (Lowest Common Ancestor)
     * This function finds the lowest common ancestor (LCA) of two given nodes in the binary tree.
     * The LCA of two nodes is the deepest node that has both nodes as descendants.
     *
     * @param root The current root node of the subtree being explored
     * @param n1   The first node value
     * @param n2   The second node value
     * @return     The LCA node, or null if no common ancestor exists
     */
    public static Node LCA2(Node root, int n1, int n2) {
        // Base case: if the root is null or matches either n1 or n2, return root
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        // Recursively find the LCA in the left and right subtrees
        Node leftLca = LCA2(root.left, n1, n2);
        Node rightLca = LCA2(root.right, n1, n2);

        // If LCA is found in both left and right subtrees, the current root is the LCA
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root; // If both left and right LCA are non-null, return current root as the LCA
    }

    /**
     * Function: lcaDist
     * Calculates the distance from the LCA to a given node.
     *
     * @param root The current root node of the subtree
     * @param n    The target node value
     * @return     The distance from root to the target node, or -1 if the node is not found
     */
    public static int lcaDist(Node root, int n) {
        // Base case: if root is null, return -1 (node not found)
        if (root == null) {
            return -1;
        }

        // If the current node matches the target node, distance is 0
        if (root.data == n) {
            return 0;
        }

        // Recursively calculate the distance in the left and right subtrees
        int leftDist = lcaDist(root.left, n);
        int righttDist = lcaDist(root.right, n);

        // If the target node is not found in both subtrees, return -1
        if (righttDist == -1 && leftDist == -1) {
            return -1;
        } 
        // If the node is found in the right subtree, increment distance by 1
        else if (leftDist == -1) {
            return righttDist + 1;
        } 
        // If the node is found in the left subtree, increment distance by 1
        else {
            return leftDist + 1;
        }
    }

    /**
     * Function: minDistance
     * Calculates the minimum distance between two nodes in the binary tree.
     *
     * @param root The root of the binary tree
     * @param n1   The first node value
     * @param n2   The second node value
     * @return     The minimum distance between the two nodes
     */
    public static int minDistance(Node root, int n1, int n2) {
        // Find the LCA of the two nodes
        Node lca = LCA2(root, n1, n2);

        // Calculate the distance from LCA to each of the two nodes
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        // The minimum distance between the nodes is the sum of their distances from the LCA
        return dist1 + dist2;
    }

    // Main method to test the functionality
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

        // Test case: Find the minimum distance between nodes 4 and 6
        int n1 = 4, n2 = 6;

        // Output the minimum distance
        System.out.println("Minimum Distance = " + minDistance(root, n1, n2));
    }
}
