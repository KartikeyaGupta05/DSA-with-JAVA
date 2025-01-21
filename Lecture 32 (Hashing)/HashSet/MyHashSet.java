import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        // * HashSet java ke andar Hashmap se implement hota hai aur Hashmap ka imlementation hmne pehle hi dekh liya
        // Create a HashSet to store integers
        HashSet<Integer> set = new HashSet<>();

        // **Adding elements to the HashSet** 
        set.add(1);  // Adds 1
        set.add(2);  // Adds 2
        set.add(3);  // Adds 3
        set.add(4);  // Adds 4
        set.add(2);  // Duplicate, will not be added
        set.add(1);  // Duplicate, will not be added
        System.out.println("Initial set: " + set);  // Prints unique elements only

        // **Check if an element exists in the HashSet**
        System.out.println("Set contains 2: " + set.contains(2));  // Returns true
        System.out.println("Set contains 5: " + set.contains(5));  // Returns false

        // **Remove an element from the HashSet**
        System.out.println("Removing 3: " + set.remove(3));  // Removes 3 and returns true
        System.out.println("Set after removal: " + set);  // Prints updated set

        // **Get the size of the HashSet**
        System.out.println("Size of set: " + set.size());  // Returns the number of elements in the set

        // **Iterate over the elements of the HashSet**
        System.out.println("Iterating over set:");
        for (int element : set) {  // Enhanced for loop to traverse the set
            System.out.println(element);
        }

        // **Clear all elements from the HashSet**
        set.clear();  // Removes all elements from the set
        System.out.println("Set after clearing: " + set);  // Prints an empty set
        System.out.println("Is set empty? " + set.isEmpty());  // Checks if the set is empty
    }
}
