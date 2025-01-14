import java.util.*;

/**
 * Concept: Sorted Array to Balanced BST
 * Ek balanced BST (Binary Search Tree) ek aisa tree hai jisme har node ke left aur right subtrees ka height difference 1 ya usse kam hota hai.
 * Yeh code ek sorted array ko balanced BST mein convert karne ke liye hai aur ek unbalanced BST ko balanced BST mein transform karta hai.
 */
public class Sorted_Array_to_Balanced_BST {

    /**
     * Concept: Node Class
     * Node class ek binary tree ke har node ko represent karta hai. 
     * Har node ke paas ek data hota hai jo value store karta hai aur left aur right pointers hote hain jo uske child nodes ko point karte hain.
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
     * Concept: Level Order Traversal
     * Level order traversal ek binary tree ka breadth-first traversal hota hai, jisme tree ko level by level print kiya jata hai.
     * 
     * Function: levelOrder
     * Is function ka kaam binary tree ko level-order mein print karna hai.
     * @param root Binary tree ka root node
     */
    public static void levelOrder(Node root) {
        if (root == null) {
            return; // Agar tree empty hai, toh kuch nahi karna
        }

        Queue<Node> q = new LinkedList<>(); // Queue use hoti hai level-order traversal ke liye
        q.add(root);
        q.add(null); // Null ek level ka end indicate karta hai

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // Ek level complete hone par new line
                if (q.isEmpty()) { // Agar queue empty ho gayi, traversal khatam
                    break;
                } else {
                    q.add(null); // Next level ka end marker
                }
            } else {
                System.out.print(currNode.data + " "); // Current node ka data print karo
                if (currNode.left != null) {
                    q.add(currNode.left); // Left child ko queue mein add karo
                }
                if (currNode.right != null) {
                    q.add(currNode.right); // Right child ko queue mein add karo
                }
            }
        }
    }

    /**
     * Concept: Sorted Array to Balanced BST
     * Is function ka kaam ek sorted array ko balanced BST mein convert karna hai.
     * 
     * Function: arrToBST
     * Binary search ka use karke midpoint ko root banaya jata hai aur left aur right subtrees recursively create kiye jate hain.
     * @param arr Sorted array
     * @param st  Starting index
     * @param end Ending index
     * @return Balanced BST ka root node
     */
    public static Node arrToBST(int[] arr, int st, int end) {
        if (st > end) {
            return null; // Base case: Agar start index end se bada ho, return null
        }

        int mid = (st + end) / 2; // Midpoint calculate karo
        Node root = new Node(arr[mid]); // Midpoint ko root node banao
        root.left = arrToBST(arr, st, mid - 1); // Left subtree ke liye recursive call
        root.right = arrToBST(arr, mid + 1, end); // Right subtree ke liye recursive call

        return root;
    }

    /**
     * Concept: Inorder Traversal
     * Inorder traversal ek tree ka sorted order nikalta hai (left -> root -> right).
     * 
     * Function: getInorder
     * Is function ka kaam tree ka inorder traversal karna aur result ko ArrayList mein store karna hai.
     * @param root Binary tree ka root node
     * @param inorder Inorder traversal ko store karne ke liye list
     */
    public static void getInoreder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return; // Base case: Agar node null hai, kuch nahi karna
        }
        getInoreder(root.left, inorder); // Left subtree traverse karo
        inorder.add(root.data); // Current node ka data add karo
        getInoreder(root.right, inorder); // Right subtree traverse karo
    }

    /**
     * Concept: Convert Unbalanced BST to Balanced BST
     * Is function ka kaam ek unbalanced BST ko balanced BST mein transform karna hai.
     * 
     * Function: convert_BST_to_Balanced_BST
     * Pehle tree ka inorder traversal nikal kar ek sorted array banate hain, 
     * phir us sorted array ko balanced BST mein convert karte hain.
     * @param root Unbalanced BST ka root node
     * @return Balanced BST ka root node
     */
    public static Node convert_BST_to_Balanced_BST(Node root) {
        // Inorder traversal nikal kar list mein store karo
        ArrayList<Integer> inorder = new ArrayList<>();
        getInoreder(root, inorder);

        // Inorder list ko array mein convert karo
        int[] arr = new int[inorder.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inorder.get(i);
        }

        // Sorted array se balanced BST banao
        root = arrToBST(arr, 0, arr.length - 1);
        return root;
    }

    /**
     * Main Method
     * Yeh method sample binary tree banata hai aur usse balanced BST mein convert karke level-order print karta hai.
     */
    public static void main(String[] args) {
        // Concept - 1
        // int arr[] = {3, 5, 6, 8, 10, 11, 13};
        // Node root = arrToBST(arr, 0, arr.length - 1);



        // Concept - 2
        // Sample unbalanced binary tree create karte hain
        //          8
        //        /   \
        //       6     10
        //      /        \
        //     5          11
        //    /             \
        //   3              12

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        // Convert unbalanced BST to balanced BST
        root = convert_BST_to_Balanced_BST(root);

        // Print balanced BST using level-order traversal
        levelOrder(root);
    }
}
