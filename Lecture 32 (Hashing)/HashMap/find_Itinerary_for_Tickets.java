import java.util.*;

public class find_Itinerary_for_Tickets {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();  //* "to -> from" data
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;  // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {  // O(n)

        HashMap<String, String> tickets = new HashMap<>();  //* "from -> to" data
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Dehli", "Goa");
        tickets.put("Mumbai", "Dehli");
        tickets.put("Goa", "Chennai");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
