import java.util.*;

public class MyHashMap_02 {
    public static void main(String[] args) {
        // HashMap ka object banate hain
        HashMap<String, Integer> map = new HashMap<>();

        // Key-Value pairs ko map me add karte hain
        map.put("India", 140);       // India ka population = 140 crore
        map.put("China", 150);       // China ka population = 150 crore
        map.put("US", 80);           // US ka population = 80 crore
        map.put("Nepal", 10);        // Nepal ka population = 10 crore
        map.put("Bhutan", 40);       // Bhutan ka population = 40 crore
        map.put("Indonesia", 50);    // Indonesia ka population = 50 crore

        // **keySet()** method se saari keys ko retrieve karte hain
        Set<String> keys = map.keySet();  // HashMap ki keys ka ek Set return karta hai
        System.out.println(keys);  // Output: [India, China, US, Nepal, Bhutan, Indonesia] (keys random order me ho sakti hain)

        // keySet ke saath iterate karke keys aur unke corresponding values ko print karte hain
        for (String k : keys) {
            System.out.println("key = " + k + ", value = " + map.get(k));
        }

        // **entrySet()** method ka use karte hain key-value pairs ko print karne ke liye
        System.out.println("\nUsing map.entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
