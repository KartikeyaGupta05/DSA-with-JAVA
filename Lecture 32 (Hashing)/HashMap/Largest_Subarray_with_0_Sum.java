import java.util.HashMap;

public class Largest_Subarray_with_0_Sum {
    public static void main(String[] args) {
        int[] arr = { 15, 2, -2, -8, 1, 7, 23, 10 }; // Sample array

        // Call the method to find the largest subarray with 0 sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int sum = 0;

        for (int j= 0; j< arr.length; j++) {
            sum += arr[j];

            // Check if the sum is 0
            if (sum == 0) {
                len = j+ 1;
            }

            // Check if the sum exists in the map
            if (map.containsKey(sum)) {
                len = Math.max(len, j- map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("Length of the largest subarray with 0 sum: " + len);
        
    }
}
