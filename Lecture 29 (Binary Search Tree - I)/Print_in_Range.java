// Class ka naam hai Print_in_Range jo ek BST ke elements ko ek range ke andar print karne aur root se leaf tak ke paths ko display karne ke liye banayi gayi hai.
import java.util.ArrayList;

public class Print_in_Range {

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

    // Function: printInRange
    // Concept: Is function ka use BST ke un elements ko print karne ke liye hota hai jo kisi specific range [k1, k2] ke beech hain.
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) { // Agar root null hai, to return karenge.
            return;
        }

        // Agar root ka data range ke andar hai, to left aur right subtree ke elements bhi check karenge.
        if (k1 <= root.data && root.data <= k2) {
            printInRange(root.left, k1, k2); // Left subtree traverse karte hain.
            System.out.print(root.data + " "); // Root ka data print karte hain.
            printInRange(root.right, k1, k2); // Right subtree traverse karte hain.
        } else if (root.data > k2) { // Agar root ka data range ke upper limit se bada hai, to sirf left subtree check karte hain.
            printInRange(root.left, k1, k2);
        } else { // Agar root ka data range ke lower limit se chhota hai, to sirf right subtree check karte hain.
            printInRange(root.right, k1, k2);
        }
    }

    // Function: printPath
    // Concept: Ye function ek path ko print karne ke liye use hota hai. Path ek ArrayList ke form mein pass hota hai.
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) { // Path ke har element ko print karte hain.
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("Null"); // Path ke end pe "Null" print karte hain.
    }

    // Function: printRootToLeafPath
    // Concept: Ye function root se leaf tak ke saare paths ko print karne ke liye use hota hai.
    public static void printRootToLeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) { // Agar root null hai, to return karenge.
            return;
        }

        // Current node ka data path mein add karte hain.
        path.add(root.data);

        // Agar current node ek leaf node hai, to path ko print karte hain.
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        // Left aur right subtree ke paths recursively check karte hain.
        printRootToLeafPath(root.left, path);
        printRootToLeafPath(root.right, path);

        // Backtracking: Current node ko path se remove karte hain.
        path.remove(path.size() - 1);
    }

    // Main function: Yaha se program execution start hota hai.
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 }; // Values array jo BST banane ke liye use hoga.
        Node root = null; // Initially root null hai.

        // Loop ke through BST build karte hain.
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]); // Har value ko BST mein insert karte hain.
        }

        // Uncomment karke range mein elements ko print kar sakte hain.
        // printInRange(root, 5, 12);

        // Root se leaf tak ke paths ko print karte hain.
        printRootToLeafPath(root, new ArrayList<>());
    }
}
