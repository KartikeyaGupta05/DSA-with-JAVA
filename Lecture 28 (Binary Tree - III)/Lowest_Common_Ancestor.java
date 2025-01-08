import java.util.ArrayList;

/**
 * Concept: Lowest Common Ancestor (LCA)
 * LCA of two nodes in a binary tree is defined as the lowest node that has both nodes as its descendants.
 * This program demonstrates two approaches:
 * 1. Using paths (find paths for both nodes and compare).
 * 2. Using recursion to find LCA directly.
 */
public class Lowest_Common_Ancestor {

    /**
     * Node class to represent each node of the binary tree.
     * Yeh class har ek node ke liye data aur uske left aur right child ke references store karta hai.
     */
    static class Node {
        int data;       // Node ka value
        Node left, right; // Left aur right child ka reference

        // Constructor to initialize node with given data
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // ===================== APPROACH 1 =====================

    /**
     * Concept: Get Path
     * Is function ka kaam hai ek given node ke liye root se us tak ka path nikalna.
     * Path ko ArrayList mein store kiya jata hai.
     *
     * @param root Binary tree ka root node
     * @param n    Target node jiska path chahiye
     * @param path Root se target tak ka path store karne ke liye list
     * @return Agar path mil gaya toh true, warna false
     */
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        // Base case: Agar node null hai, return false
        if (root == null) {
            return false;
        }

        // Current node ko path mein add karo
        path.add(root);

        // Agar current node target node ke barabar hai, return true
        if (root.data == n) {
            return true;
        }

        // Recursively left aur right subtree mein target dhoondho
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        // Agar target left ya right subtree mein mila, return true
        if (foundleft || foundright) {
            return true;
        }

        // Agar target nahi mila, current node ko path se remove karo
        path.remove(path.size() - 1);
        return false;
    }

    /**
     * Concept: Lowest Common Ancestor (Using Paths)
     * Yeh function dono nodes ke paths nikalta hai aur unhe compare karta hai.
     * Jaha tak paths same hote hain, wahi LCA hota hai.
     *
     * @param root Binary tree ka root node
     * @param n1   Pehla node jiska LCA find karna hai
     * @param n2   Dusra node jiska LCA find karna hai
     * @return LCA node
     */
    public static Node LCA(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Dono nodes ke paths find karo
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Compare paths to find the last common node
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break; // Jaha path alag hota hai, waha loop tod do
            }
        }

        // Last common node LCA hoga
        Node lca = path1.get(i - 1);
        return lca;
    }

    // ===================== APPROACH 2 =====================

    /**
     * Concept: Lowest Common Ancestor (Using Recursion)
     * Is approach mein bina paths store kiye directly recursion ka use karke LCA find kiya jata hai.
     * Agar ek subtree mein dono nodes hain, toh current node LCA hai.
     *
     * @param root Binary tree ka root node
     * @param n1   Pehla node jiska LCA find karna hai
     * @param n2   Dusra node jiska LCA find karna hai
     * @return LCA node
     */
    public static Node LCA2(Node root, int n1, int n2) {
        // Base case: Agar root null hai ya root kisi ek target ke barabar hai, return root
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        // Left aur right subtree mein LCA dhoondo
        Node leftLca = LCA2(root.left, n1, n2);
        Node rightLca = LCA2(root.right, n1, n2);

        // Agar leftLca null nahi aur rightLca null hai, to LCA left mein hoga
        if (rightLca == null) {
            return leftLca;
        }
        // Agar rightLca null nahi aur leftLca null hai, to LCA right mein hoga
        if (leftLca == null) {
            return rightLca;
        }

        // Agar dono sides se value mili, iska matlab current node LCA hai
        return root;
    }

    /**
     * Main method to test both LCA approaches.
     */
    public static void main(String[] args) {
        // Ek sample binary tree create karte hain
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

        int n1 = 4, n2 = 7;

        // Approach 1: Using paths
        System.out.println("Lowest Common Ancestor is = " + LCA(root, n1, n2).data);

        // Approach 2: Using recursion
        System.out.println("Lowest Common Ancestor is = " + LCA2(root, n1, n2).data);
    }
}
