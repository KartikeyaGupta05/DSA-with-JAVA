import java.util.HashMap;

public class Subarray_Sum_equalto_K {
    public static void main(String[] args) {
        int[] arr = { 10, 2, -2, -20, 10 }; // Sample array
        int k = -10;

        // Call the method to find the largest subarray with 0 sum
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int ans = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);

    }
}
