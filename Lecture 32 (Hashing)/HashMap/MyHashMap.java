import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();  // HashMap ka object create karte hain
        
        // Elements add karte hain HashMap me : Time Complexity = O(1)
        map.put("India", 140);   // "India" key ke sath 140 value store hoti hai
        map.put("China", 150);
        map.put("USA", 80);
        map.put("Nepal", 30);

        // HashMap ko display karte hain
        System.out.println(map);  // Output: {India=140, China=150, USA=80, Nepal=30}

        // Get method: Kisi specific key ka value retrieve karte hain : TC = O(1)
        System.out.println(map.get("India"));  // Output: 140
        System.out.println(map.get("Pakistan"));  // Key exist nahi karti, so Output: null

        // Contains Key method: Check karta hai ki key exist karti hai ya nahi : TC = O(1)
        System.out.println(map.containsKey("India"));  // Output: true
        System.out.println(map.containsKey("Indonesia"));  // Output: false

        // Remove method: Kisi specific key ko remove karta hai : TC = O(1)
        System.out.println(map.remove("Indonesia"));  // Key nahi hai, Output: null
        map.remove("Nepal");  // "Nepal" ko remove karta hai
        System.out.println(map);  // Output: {India=140, China=150, USA=80}

        // Size method: HashMap me total kitni key-value pairs hain, yeh batata hai
        System.out.println(map.size());  // Output: 3

        // IsEmpty method: Check karta hai ki HashMap empty hai ya nahi
        System.out.println(map.isEmpty());  // Output: false

        // Clear method: HashMap ke saare elements ko remove kar deta hai
        map.clear();
        System.out.println(map);  // Output: {}

        System.out.println(map.isEmpty());  // Output: true
    }
}
