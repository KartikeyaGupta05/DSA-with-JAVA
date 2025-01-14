/**
 * Concept: Largest BST in Binary Tree
 * Is code ka kaam ek binary tree ke andar sabse bade BST (Binary Search Tree) ka size find karna hai. 
 * Har node par check kiya jata hai ki kya wo BST properties follow karta hai ya nahi.
 */
public class Largest_BST_in_BT {

    /**
     * Concept: Info Class
     * Ye class har node ke baare me information store karti hai jo BST check karne ke liye zaroori hoti hai.
     * 1. `isBST`: Bataata hai ki subtree BST hai ya nahi.
     * 2. `size`: Subtree ka size.
     * 3. `min`: Subtree ka minimum value.
     * 4. `max`: Subtree ka maximum value.
     */
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST; // Kya current subtree BST hai?
            this.size = size;   // Current subtree ka size
            this.min = min;     // Subtree ka minimum value
            this.max = max;     // Subtree ka maximum value
        }
    }

    /**
     * Concept: Node Class
     * Node class ek binary tree ke har node ko represent karta hai. 
     * Har node ke paas ek data hota hai jo value store karta hai aur left aur right pointers hote hain jo child nodes ko point karte hain.
     */
    static class Node {
        int data; // Node ka data
        Node left, right; // Left aur right subtree ke references

        // Constructor: Node ka data initialize karta hai aur left aur right ko null set karta hai.
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Global variable to track the maximum BST size
    public static int maxBSTSize = 0;

    /**
     * Concept: Largest BST in Binary Tree
     * Is function ka kaam har node par jaake check karna hai ki us subtree ke andar BST hai ya nahi,
     * aur agar hai toh us BST ka size kya hai.
     * 
     * Function: largestBST
     * @param root Binary tree ka root node
     * @return Info object jo current node ke subtree ki information store karta hai
     */
    public static Info largestBST(Node root) {
        // Base case: Agar root null hai, toh ek empty BST return karo
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively left aur right subtree ka info calculate karo
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // Current subtree ka size calculate karo
        int size = leftInfo.size + rightInfo.size + 1;

        // Current subtree ka minimum aur maximum value calculate karo
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // BST hone ke liye condition check karo
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max); // Agar BST condition fail hui toh false return karo
        }

        // Agar left aur right subtrees BST hain, toh current subtree bhi BST hai
        if (leftInfo.isBST && rightInfo.isBST) {
            maxBSTSize = Math.max(maxBSTSize, size); // Max BST size update karo
            return new Info(true, size, min, max);  // True return karo
        }

        // Agar BST nahi hai toh false return karo
        return new Info(false, size, min, max);
    }

    /**
     * Main Method
     * Is method mein ek binary tree ka example diya gaya hai aur largest BST ka size calculate kiya gaya hai.
     */
    public static void main(String[] args) {
        // Sample binary tree create karte hain
        //           50
        //         /    \
        //       30      60
        //      /  \     /  \
        //     5   20   45   70
        //                  /   \
        //                 65    80
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.left.left = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        // Largest BST ka size calculate karo
        largestBST(root);

        // Result print karo
        System.out.println("Largest BST size = " + maxBSTSize);
    }
}
