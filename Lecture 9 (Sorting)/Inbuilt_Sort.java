import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
    public static void main(String[] args) {
        // int[] arr = { 5, 66, 4, 45, 23, 32 };
        Integer[] arr = { 5, 66, 4, 45, 23, 32 }; // this is array is ann object of Integer class
        Arrays.sort(arr); // sort complete array
        // Arrays.sort(arr, 1, 5);
        Arrays.sort(arr, Collections.reverseOrder()); // print array in desending
        System.out.print("Sorted array is = ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
