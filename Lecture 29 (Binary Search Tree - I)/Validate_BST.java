// Class ka naam hai Validate_BST jo ek BST ko validate karne, uska mirror banane, aur pre-order traversal ke liye banayi gayi hai.
public class Validate_BST {
    
    // Node class ka concept:
    // Ye class ek binary tree ka node represent karti hai. Har node ke paas ek data hota hai, aur uske left aur right pointers hote hain
    // jo left aur right subtree ko point karte hain.
    static class Node {
        int data; // Node ka data
        Node left, right; // Left aur right subtree ke references

        // Constructor: Jab ek naye node ka object banate hain to uske data ko initialize karta hai aur left aur right ko null set karta hai.
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function: buildBST
    // Concept: Is function ka use ek Binary Search Tree (BST) build karne ke liye hota hai.
    // BST ka property: Left subtree ke saare nodes ka value root se chhota hota hai aur right subtree ke nodes ka value bada hota hai.
    public static Node buildBST(Node root, int val) {
        if (root == null) { // Agar root null hai, to nayi node create karke return karenge.
            root = new Node(val);
            return root;
        }

        if (val < root.data) { // Agar value root ke data se chhoti hai, to left subtree mein insert karenge.
            root.left = buildBST(root.left, val);
        } else { // Agar value root ke data se badi ya barabar hai, to right subtree mein insert karenge.
            root.right = buildBST(root.right, val);
        }

        return root; // Root ko return karenge.
    }

    // Function: isValidBST
    // Concept: Ye function check karta hai ki diya gaya tree ek valid BST hai ya nahi.
    // Valid BST ke liye har node ki value min aur max range ke andar honi chahiye.
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) { // Agar root null hai, to ye ek valid subtree hai.
            return true;
        }

        // Check karte hain ki current node ka data min aur max range ke andar hai ya nahi.
        if (min != null && root.data <= min.data) { 
            return false; // Agar chhota ya barabar hai min se, to invalid BST.
        } else if (max != null && root.data >= max.data) {
            return false; // Agar bada ya barabar hai max se, to invalid BST.
        }

        // Recursively left aur right subtree check karte hain.
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    // Function: mirrorBST
    // Concept: Is function ka use ek Binary Tree ka mirror create karne ke liye hota hai.
    // Mirror banane ka matlab hota hai left aur right subtree ko swap karna.
    public static Node mirrorBST(Node root) {
        if (root == null) { // Agar root null hai, to return karenge.
            return root;
        }

        // Recursively left aur right subtree ke mirrors generate karte hain.
        Node leftSubtree = mirrorBST(root.left);
        Node rightSubtree = mirrorBST(root.right);

        // Left aur right subtrees ko swap karte hain.
        root.left = rightSubtree;
        root.right = leftSubtree;

        return root; // Mirrored root ko return karte hain.
    }

    // Function: preOrder
    // Concept: Pre-order traversal ek tree traversal technique hai jo pehle root, phir left subtree, aur phir right subtree ko visit karti hai.
    public static void preOrder(Node root) {
        if (root == null) { // Agar root null hai, to return karenge.
            return;
        }

        // Current node ka data print karte hain.
        System.out.print(root.data + " ");

        // Pehle left subtree traverse karte hain.
        preOrder(root.left);

        // Finally, right subtree traverse karte hain.
        preOrder(root.right);
    }

    // Main function: Yaha se program execution start hota hai.
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 }; // Values array jo BST banane ke liye use hoga.
        Node root = null; // Initially root null hai.

        // Loop ke through BST build karte hain.
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]); // Har value ko BST mein insert karte hain.
        }
        
        // Uncomment karke valid BST check kar sakte hain.
        // if (isValidBST(root, null, null)) {
        //     System.out.println("Valid BST");
        // } else {
        //     System.out.println("Invalid BST");
        // }

        preOrder(root); // Pehle BST ka pre-order traversal print karte hain.
        System.out.println();

        root = mirrorBST(root); // BST ka mirror banate hain.

        preOrder(root); // Mirrored BST ka pre-order traversal print karte hain.
        System.out.println();
    }
}
