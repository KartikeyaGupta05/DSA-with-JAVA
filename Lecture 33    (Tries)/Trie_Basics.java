public class Trie_Basics {
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWords = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // TC = O(L) ,where L is length of longest word to be passed in this
                                             // function
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.endOfWords = true;
    }

    public static boolean search(String key) {  // TC = O(L)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWords == true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        for (String word : words) {
            insert(word);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}