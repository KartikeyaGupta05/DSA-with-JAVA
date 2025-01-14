/**
 * Concept: AVL Tree (Height-Balanced Binary Search Tree)
 * AVL Tree ek self-balancing binary search tree hai jisme har node ka balance factor
 * (left subtree ki height aur right subtree ki height ka difference) -1, 0, ya 1 hona chahiye.
 * Agar balance factor is range se bahar jata hai, to rotations ka use karke tree ko balance kiya jata hai.
 */
public class AVL_Tree {

    /**
     * Concept: Node Class
     * Node class ek AVL Tree ke har node ko represent karta hai. Har node ke paas data, left aur right pointers,
     * aur ek height attribute hota hai.
     */
    static class Node {
        int data, height; // Node ka data aur uski height
        Node left, right; // Left aur right subtree ke references

        // Constructor: Node ka data initialize karta hai aur left, right ko null aur height ko 1 set karta hai.
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 1; // Initial height of a new node is always 1
        }
    }

    public static Node root; // AVL Tree ka root node

    /**
     * Function: height
     * Kis node ki height return karta hai. Agar node null hai, toh height 0 return karega.
     * @param root Current node
     * @return Node ki height
     */
    public static int height(Node root) {
        if (root == null) {
            return 0; // Null node ki height 0 hoti hai
        }
        return root.height; // Otherwise node ki actual height return karo
    }

    /**
     * Function: rightRotate
     * Ek subtree jo y node par rooted hai uska right rotation perform karta hai.
     * @param y Root node of the subtree
     * @return Rotated subtree ka new root
     */
    public static Node rightRotate(Node y) {
        Node x = y.left; // x becomes the new root
        Node T2 = x.right; // T2 subtree is temporarily stored

        // Perform rotation
        x.right = y; // Right subtree of x becomes y
        y.left = T2; // T2 becomes left subtree of y

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    /**
     * Function: leftRotate
     * Ek subtree jo x node par rooted hai uska left rotation perform karta hai.
     * @param x Root node of the subtree
     * @return Rotated subtree ka new root
     */
    public static Node leftRotate(Node x) {
        Node y = x.right; // y becomes the new root
        Node T2 = y.left; // T2 subtree is temporarily stored

        // Perform rotation
        y.left = x; // Left subtree of y becomes x
        x.right = T2; // T2 becomes right subtree of x

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    /**
     * Function: getBalance
     * Ek node ka balance factor calculate karta hai.
     * Balance factor = height(left subtree) - height(right subtree)
     * @param root Node jiska balance factor nikalna hai
     * @return Balance factor
     */
    public static int getBalance(Node root) {
        if (root == null) {
            return 0; // Null node ka balance factor 0 hota hai
        }
        return height(root.left) - height(root.right); // Left aur right subtree ki height ka difference
    }

    /**
     * Function: insert
     * AVL Tree me ek new key ko insert karta hai aur tree ko balance bhi karta hai.
     * @param root Current root node
     * @param key Insert karne wali value
     * @return Updated root node
     */
    public static Node insert(Node root, int key) {
        // Standard BST insertion
        if (root == null) {
            return new Node(key); // Agar root null hai, to new node banake return karo
        }

        if (key < root.data) {
            root.left = insert(root.left, key); // Left subtree me insert karo
        } else if (key > root.data) {
            root.right = insert(root.right, key); // Right subtree me insert karo
        } else {
            return root; // Duplicate keys allowed nahi hai
        }

        // Update the height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Check the balance factor of the current node
        int bf = getBalance(root);

        // If the node is unbalanced, perform appropriate rotations:

        // Left Left Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left); // Left rotation on left child
            return rightRotate(root); // Right rotation on root
        }

        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right); // Right rotation on right child
            return leftRotate(root); // Left rotation on root
        }

        // Return the root if it's balanced
        return root;
    }

    /**
     * Function: preorder
     * Pre-order traversal of the tree (Root -> Left -> Right).
     * @param root Current node
     */
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Root node ka data print karo
        preorder(root.left); // Left subtree traverse karo
        preorder(root.right); // Right subtree traverse karo
    }

    /**
     * Main Function
     * AVL Tree me elements insert karta hai aur pre-order traversal print karta hai.
     */
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /* AVL Tree structure:
              30
             /  \
           20   40
          / \      \
        10  25     50
        */

        System.out.println("Preorder traversal of the AVL Tree:");
        preorder(root); // AVL Tree ka pre-order traversal print karo
    }
}
