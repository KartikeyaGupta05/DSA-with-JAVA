import java.util.*;

public class MyHashSet_02 {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        // **Adding elements to the HashSet** 
        city.add("Mathura");  // Adds 1
        city.add("Raya");  // Adds 2
        city.add("Mumbai");  // Adds 3
        city.add("Dehli");  // Adds 4
        city.add("Naida");  // Duplicate, will not be added
        city.add("Pune");  // Duplicate, will not be added

        //* Iterate over Hashset Using "Iterator Interface"

        Iterator i = city.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }


        // **Iterate over the elements of the HashSet using " For each loop "**
        System.out.println("Iterating over city:");
        for (String element : city) {  // Enhanced for loop to traverse the city
            System.out.println(element);
        }
    }
}
