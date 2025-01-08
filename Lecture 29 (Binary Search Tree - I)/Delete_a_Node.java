// Class ka naam hai Delete_a_Node jo ek BST me se node delete karne ke liye banayi gayi hai.
public class Delete_a_Node {

    // Node class ka concept:
    // Ye class ek binary tree ka node represent karti hai. Har node ke paas ek data hota hai aur left aur right pointers hote hain 
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

    // Function: deleteNode
    // Concept: Is function ka use BST se ek node delete karne ke liye hota hai.
    // Node delete karne ke liye 3 cases hote hain: 
    // 1) Leaf node (jiska koi child nahi hota),
    // 2) Node with single child,
    // 3) Node with two children.
    public static Node deleteNode(Node root, int val) {
        if (root == null) {
            return null; // Agar root null hai, to directly return karte hain.
        }

        if (root.data > val) { // Agar delete karne wala value root se chhota hai, to left subtree mein dhoondte hain.
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) { // Agar delete karne wala value root se bada hai, to right subtree mein dhoondte hain.
            root.right = deleteNode(root.right, val);
        } else { // Jab root.data == val, tab node delete karte hain.
            // Case 1: Leaf node
            if (root.left == null && root.right == null) {
                return null; // Node delete karke null return karte hain.
            }

            // Case 2: Single child
            if (root.left == null) { // Agar sirf right child hai, to right child return karte hain.
                return root.right;
            } else if (root.right == null) { // Agar sirf left child hai, to left child return karte hain.
                return root.left;
            }

            // Case 3: Two children
            // In-order successor ko find karte hain jo deleted node ko replace karega.
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data; // Root ka data in-order successor ke data se replace karte hain.
            root.right = deleteNode(root.right, IS.data); // In-order successor ko delete karte hain.
        }
        return root; // Updated root ko return karte hain.
    }

    // Function: findInorderSuccessor
    // Concept: Ye function ek node ka in-order successor find karta hai jo BST ke right subtree ka sabse chhota element hota hai.
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) { // Jab tak left child exist karta hai, tab tak left subtree traverse karte hain.
            root = root.left;
        }
        return root; // Leftmost node return karte hain.
    }

    // Function: inOrder
    // Concept: In-order traversal ek tree traversal technique hai jo pehle left subtree, phir root, aur phir right subtree ko visit karti hai.
    public static void inOrder(Node root) {
        if (root == null) { // Agar root null hai, to return karenge.
            return;
        }

        // Pehle left subtree traverse karte hain.
        inOrder(root.left);

        // Phir current node ka data print karte hain.
        System.out.print(root.data + " ");

        // Finally, right subtree traverse karte hain.
        inOrder(root.right);
    }

    // Main function: Yaha se program execution start hota hai.
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14, 13 }; // BST build karne ke liye values ka array.
        Node root = null; // Initially root null hai.

        // Loop ke through BST build karte hain.
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]); // Har value ko BST mein insert karte hain.
        }

        inOrder(root); // Pehle BST ka in-order traversal print karte hain.
        System.out.println();

        root = deleteNode(root, 1); // Case 1: Leaf node delete karte hain.
        root = deleteNode(root, 10); // Case 2: Single child node delete karte hain.
        root = deleteNode(root, 8); // Case 3: Two children node delete karte hain.
        System.out.println();

        inOrder(root); // Updated BST ka in-order traversal print karte hain.
    }
}
