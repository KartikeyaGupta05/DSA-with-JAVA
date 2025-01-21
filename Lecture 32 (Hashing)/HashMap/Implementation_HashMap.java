import java.util.*;

public class Implementation_HashMap {

    // Generic class for HashMap
    static class HashMap<K, V> { 
        // Inner class to represent key-value pairs
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Current number of key-value pairs
        private int N; // Current size of the buckets array
        private LinkedList<Node>[] buckets; // Array of linked lists for buckets

        // Constructor to initialize the HashMap
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // Initial bucket size
            this.buckets = new LinkedList[4]; // Create array of linked lists
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash function to map a key to its bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode(); // Generate hash code for the key
            return Math.abs(hc) % N; // Map hash code to valid index
        }

        // Search for a key in the linked list at the given bucket index
        private int SearchinLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (Node node : ll) {
                if (node.key.equals(key)) { // Compare keys
                    return di; // Return index if key found
                }
                di++;
            }
            return -1; // Return -1 if key not found
        }

        // Rehashing: Create a new bucket array with double the size
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuck = buckets; // Save old buckets
            buckets = new LinkedList[N * 2]; // Double the bucket array size
            N = N * 2; // Update N

            // Initialize new buckets
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Rehash all key-value pairs into new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value); // Re-insert into new buckets
                }
            }
        }

        // Insert a key-value pair into the HashMap
        public void put(K key, V value) { // O(1) average time complexity
            int bi = hashFunction(key); // Calculate bucket index
            int di = SearchinLL(key, bi); // Search for key in the bucket

            if (di != -1) { // Key already exists, update its value
                Node node = buckets[bi].get(di);
                node.value = value;
            } else { // Key does not exist, add new key-value pair
                buckets[bi].add(new Node(key, value));
                n++; // Increment count of key-value pairs
            }

            // Check load factor to decide whether to rehash
            double lembda = (double) n / N;
            if (lembda > 2.0) { // Load factor threshold = 2.0
                rehash();
            }
        }

        // Check if a key exists in the HashMap
        public boolean containsKey(K key) {
            int bi = hashFunction(key); // Calculate bucket index
            int di = SearchinLL(key, bi); // Search for key in the bucket
            return di != -1; // Return true if key found, otherwise false
        }

        // Remove a key-value pair from the HashMap
        public V remove(K key) {
            int bi = hashFunction(key); // Calculate bucket index
            int di = SearchinLL(key, bi); // Search for key in the bucket

            if (di != -1) { // Key found, remove it
                Node node = buckets[bi].remove(di);
                n--; // Decrement count of key-value pairs
                return node.value; // Return the value of removed key
            } else { // Key not found
                return null;
            }
        }

        // Get the value associated with a key
        public V get(K key) {
            int bi = hashFunction(key); // Calculate bucket index
            int di = SearchinLL(key, bi); // Search for key in the bucket

            if (di != -1) { // Key found, return its value
                Node node = buckets[bi].get(di);
                return node.value;
            } else { // Key not found
                return null;
            }
        }

        // Get all keys in the HashMap
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>(); // Initialize list for keys

            for (int i = 0; i < buckets.length; i++) { // Traverse all buckets
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key); // Add each key to the list
                }
            }
            return keys;
        }

        // Check if the HashMap is empty
        public boolean isEmpty() {
            return n == 0; // Return true if no key-value pairs
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("India", 140);
        map.put("China", 150);
        map.put("US", 80);
        map.put("Nepal", 10);
        map.put("Bhutan", 40);
        map.put("Indonesia", 50);

        // Print all keys
        System.out.println("Keys: " + map.keySet());

        // Get value for a specific key
        System.out.println("Population of India: " + map.get("India"));

        // Check if a key exists
        System.out.println("Contains key 'US': " + map.containsKey("US"));

        // Remove a key and its value
        System.out.println("Removed 'Nepal': " + map.remove("Nepal"));

        // Attempt to get a removed key
        System.out.println("Get 'Nepal' after removing : " + map.get("Nepal"));

        // Print keys after removal
        System.out.println("Keys after removal: " + map.keySet());

        // Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
