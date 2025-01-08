// Class ka naam hai Build_BST_and_Search jo ek BST build karne aur usme element search karne ke liye banayi gayi hai.
public class Build_BST_and_Search {

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

    // Function: search
    // Concept: Ye function BST me kisi specific key ko search karta hai.
    // Agar key BST me milti hai, to true return karta hai; agar nahi milti, to false return karta hai.
    public static boolean search(Node root, int key) { 
        if (root == null) { // Agar root null hai, to key BST me exist nahi karti.
            return false;
        }

        if (root.data == key) { // Agar root ka data key ke barabar hai, to key mil gayi.
            return true;
        }

        if (key > root.data) { 
            return search(root.right, key); // Key agar root se badi hai, to right subtree me search karenge.
        } else {
            return search(root.left, key); // Key agar root se chhoti hai, to left subtree me search karenge.
        }
    }

    // Main function: Yaha se program execution start hota hai.
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 }; // BST build karne ke liye values ka array.
        Node root = null; // Initially root null hai.

        // Loop ke through BST build karte hain.
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]); // Har value ko BST mein insert karte hain.
        }

        inOrder(root); // Pehle BST ka in-order traversal print karte hain.
        System.out.println();

        System.out.println(search(root, 1)); // Search function ka use karte hain key 1 ko dhoondhne ke liye.
    }
}
