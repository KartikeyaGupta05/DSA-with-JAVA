import java.util.*;

public class HashMap_Types {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();  // yeah item ko sorted rakhta hai yaani hmmm jaise input karte hai waise hi output milta hai naa ki Hashmap ki tarah kisi nhi sequence me mile

        // Elements add karte hain HashMap me : Time Complexity = O(1)
        lhm.put("India", 140);   // "India" key ke sath 140 value store hoti hai
        lhm.put("China", 150);
        lhm.put("USA", 80);
        lhm.put("Nepal", 30);
        
        // LinkedHashMap ko display karte hain
        System.out.println(lhm);  // Output: {India=140, China=150, USA=80, Nepal=30}
        
        
        TreeMap<String, Integer> thm = new TreeMap<>(); // its operation TC = O(logn)
        thm.put("India", 140);   // "India" key ke sath 140 value store hoti hai
        thm.put("China", 150);
        thm.put("USA", 80);
        thm.put("Nepal", 30);

        System.out.println(thm);  // this give output in Alphabetical Sorted order {China=150, India=140, Nepal=30, USA=80}
    }
}
