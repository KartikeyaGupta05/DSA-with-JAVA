public class startsWith_Problem {
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

    public static boolean startsWith(String prefix) {  // TC = O(L)
        Node curr = root;
        for (int level = 0; level < prefix.length(); level++) {
            int idx = prefix.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String[] args) {
        String words[] = { "apple", "app", "man", "mango", "woman", "banana" };

        for (String word : words) {
            insert(word);
        }

        String prefix = "man";

        System.out.println(startsWith(prefix));
    }
}
