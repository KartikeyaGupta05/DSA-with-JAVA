/**
 * Concept: Merging Two Binary Search Trees (BSTs)
 * Is code ka kaam do alag-alag BSTs ko merge karke ek single balanced BST banana hai.
 * Steps:
 * 1. Dono BSTs ka inorder traversal karke unhe sorted arrays me convert karna.
 * 2. Dono sorted arrays ko merge karna.
 * 3. Merged sorted array ko balanced BST me convert karna.
 */
import java.util.*;

public class Merge_2_BST {

    /**
     * Concept: Node Class
     * Node class ek binary tree ke har node ko represent karta hai. Har node ke paas ek data aur left aur right subtree ke references hote hain.
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

    /**
     * Concept: Pre-order Traversal
     * Ye function tree ko pre-order traversal me print karta hai (Root -> Left -> Right).
     * @param root Tree ka root node
     */
    public static void preOrder(Node root) {
        if (root == null) {
            return; // Base case: Agar node null hai toh kuch nahi karte
        }

        System.out.print(root.data + " "); // Current node ka data print karo
        preOrder(root.left); // Left subtree ko traverse karo
        preOrder(root.right); // Right subtree ko traverse karo
    }

    /**
     * Concept: Inorder Traversal
     * Inorder traversal ka use sorted sequence nikalne ke liye kiya jata hai (Left -> Root -> Right).
     * @param root Tree ka root node
     * @param inorder ArrayList jisme sorted sequence store hoga
     */
    public static void getInoreder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return; // Base case: Agar node null hai toh kuch nahi karte
        }
        getInoreder(root.left, inorder); // Left subtree traverse karo
        inorder.add(root.data); // Current node ka data add karo
        getInoreder(root.right, inorder); // Right subtree traverse karo
    }

    /**
     * Concept: Sorted Array to Balanced BST
     * Ek sorted array ko balanced BST me convert karta hai using recursion.
     * @param arr Sorted array
     * @param st Start index of the array
     * @param end End index of the array
     * @return Balanced BST ka root node
     */
    public static Node sortedArrToBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null; // Base case: Agar start index end se bada ho toh return null
        }

        int mid = (st + end) / 2; // Midpoint calculate karo
        Node root = new Node(arr.get(mid)); // Midpoint ko root node banao
        root.left = sortedArrToBST(arr, st, mid - 1); // Left subtree ke liye recursive call
        root.right = sortedArrToBST(arr, mid + 1, end); // Right subtree ke liye recursive call

        return root; // Balanced BST ka root return karo
    }

    /**
     * Concept: Merge Two BSTs
     * Do BSTs ko merge karke ek balanced BST banata hai.
     * Steps:
     * 1. Dono BSTs ka inorder traversal kar ke sorted arrays nikalta hai.
     * 2. Dono sorted arrays ko merge karta hai.
     * 3. Merged array ko balanced BST me convert karta hai.
     * @param root1 First BST ka root node
     * @param root2 Second BST ka root node
     * @return Balanced BST ka root node
     */
    public static Node mergeBSTs(Node root1, Node root2) {
        // Step 1: First BST ka inorder sequence
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInoreder(root1, inorder1);

        // Step 2: Second BST ka inorder sequence
        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInoreder(root2, inorder2);

        // Step 3: Merge sorted arrays
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < inorder1.size() && j < inorder2.size()) {
            if (inorder1.get(i) <= inorder2.get(j)) {
                finalArr.add(inorder1.get(i));
                i++;
            } else {
                finalArr.add(inorder2.get(j));
                j++;
            }
        }

        // Remaining elements ko add karo
        while (i < inorder1.size()) {
            finalArr.add(inorder1.get(i));
            i++;
        }

        while (j < inorder2.size()) {
            finalArr.add(inorder2.get(j));
            j++;
        }

        // Step 4: Sorted array -> Balanced BST
        return sortedArrToBST(finalArr, 0, finalArr.size() - 1);
    }

    /**
     * Main Method
     * Is method me do BSTs ko define karke merge kar ke ek balanced BST banaya gaya hai aur result ko pre-order traversal me print kiya gaya hai.
     */
    public static void main(String[] args) {

        // BST1 define karo
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST2 define karo
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        // Merge BSTs
        Node root = mergeBSTs(root1, root2);

        // Result ko pre-order traversal me print karo
        preOrder(root);
    }
}
