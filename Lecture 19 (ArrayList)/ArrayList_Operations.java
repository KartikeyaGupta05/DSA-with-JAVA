import java.util.*;

public class ArrayList_Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(29);
        list.add(37);
        list.add(14);
        list.add(4);
        list.add(500);

        // Reverse print  TC = O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        // Find maximum
        Integer max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            max = Math.max(list.get(i), max);
        }
        System.out.println(max);

        // swap elements
        int idx1 = 1;
        int idx2 = 3;
        int temp = list.get(idx2);
        list.set(idx2, list.get(idx1));
        list.set(idx1, temp);
        System.out.println(list);

        // Sorting Operations
        Collections.sort(list); // ascending
        System.out.println(list); 
        
        Collections.sort(list, Collections.reverseOrder()); // descending
        System.out.println(list); 
    }
}
