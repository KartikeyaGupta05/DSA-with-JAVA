public class Word_Break_Problem {
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

    public static boolean search(String key) { // TC = O(L)
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

    public static boolean wordBreak(String key){  // O(L)  , where L is length of key
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            //* here we start loop from 1 because substring method of string takes two index subString(first idx, last idx) and in this it exclude last idx. and perfr operation on i so we takes i = 1;

            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){ 
                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String key = "ilikesamsung";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
    }
}
