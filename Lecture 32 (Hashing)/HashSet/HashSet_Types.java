import java.util.*;

public class HashSet_Types {
    public static void main(String[] args) {
        // Performance of Linked HashSet and Map is less then its original Map and Set due to some extra operation to maintain order
        LinkedHashSet<String> lset = new LinkedHashSet<>();

        lset.add("Mathura");  // Adds 1
        lset.add("Raya");  // Adds 2
        lset.add("Mumbai");  // Adds 3
        lset.add("Dehli");  // Adds 4
        lset.add("Naida");  // Duplicate, will not be added
        lset.add("Pune");

        System.out.println(lset);

        for (String element : lset) {  // Enhanced for loop to traverse the city
            System.out.println(element);
        }
        
        
        TreeSet<String> tset = new TreeSet<>();
        
        tset.add("Mathura");  // Adds 1
        tset.add("Raya");  // Adds 2
        tset.add("Mumbai");  // Adds 3
        tset.add("Dehli");  // Adds 4
        tset.add("Naida");  // Duplicate, will not be added
        tset.add("Pune");

        System.out.println(tset);
    
        for (String element : tset) {  // Enhanced for loop to traverse the city
            System.out.println(element);
        }
    }
}
