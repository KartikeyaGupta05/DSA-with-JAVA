import java.util.*;

public class Union_and_Intersection {  // TC for both is = O(n+m)
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();

        // union
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }

        System.out.println("Count of Union of elements of arr1 and arr2 is = " + set.size() + " and set is = " + set);

        // intersection
        ArrayList<Integer> intersection = new ArrayList<>();
        set.clear();
        for (int i : arr1) {
            set.add(i);
        }
        int count = 0;
        for (int i : arr2) {
            if (set.contains(i)) {
                count++;
                intersection.add(i); // Store the intersection element
                set.remove(i);
            }
        }
        System.out.println("Count of Intersection of elements of arr1 and arr2 is = " + count +  " and set is = " + intersection);
    }
}
