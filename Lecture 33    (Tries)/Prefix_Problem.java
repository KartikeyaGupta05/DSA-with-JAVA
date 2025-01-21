public class Prefix_Problem {
    // Node class for Trie representation
    static class Node {
        Node[] children = new Node[26]; // Array to store references to child nodes for each alphabet
        boolean endOfWords = false;     // Indicates if the current node marks the end of a word
        int freq;                       // Tracks frequency of visits for each node

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;     // Initialize all children as null
            }
            freq = 1;                   // Default frequency is 1 for new nodes
        }
    }

    public static Node root = new Node(); // Root node of the Trie

    // Method to insert a word into the Trie
    public static void insert(String word) { // Time Complexity: O(L), where L is the word length
        Node curr = root; // Start from the root node

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a'; // Calculate index for the character
            if (curr.children[idx] == null) {  // If child node does not exist, create it
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;     // Increment frequency if node already exists
            }
            curr = curr.children[idx];        // Move to the next node
        }
        curr.endOfWords = true;               // Mark the end of the word
    }

    // Method to find and print unique prefixes
    public static void findPrefix(Node root, String ans) {  // Time Complexity: O(L)
        if (root == null) {
            return; // Base case: If the node is null, terminate recursion
        }

        if (root.freq == 1) { // If frequency is 1, the prefix is unique
            System.out.println(ans); // Print the unique prefix
            return;
        }

        // Recursively traverse children nodes
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                // Append current character to prefix and recurse
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" }; // List of input words

        // Insert all words into the Trie
        for (String word : arr) {
            insert(word);
        }

        root.freq = -1; // Set root frequency to -1 to avoid printing root as a prefix
        findPrefix(root, ""); // Start prefix search with an empty string
    }
}
