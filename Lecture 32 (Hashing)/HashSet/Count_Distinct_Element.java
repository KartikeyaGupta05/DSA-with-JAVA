import java.util.HashSet;

public class Count_Distinct_Element {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 6, 7, 4, 5, 3, 2, 1, 6 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        System.out.println(set.size());
    }
}
