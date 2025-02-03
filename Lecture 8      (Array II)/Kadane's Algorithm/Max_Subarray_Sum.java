public class Max_Subarray_Sum {

    // Brute force approach to calculate maximum subarray sum
    public static int Brute_force_method(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        // Iterate over all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;  // Reset currSum for each subarray

                // Calculate sum of the subarray from i to j
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }

                // Update maxSum if current subarray sum is larger
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;  // Return the maximum subarray sum
    }

    // Optimized approach using prefix sum to calculate maximum subarray sum
    public static int Prefix_Subarray_Sum(int arr[]) {
        // 1,2,3
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // Create prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Iterate over all possible subarrays using prefix sum
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                // Calculate sum of subarray using prefix sum
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                // Update maxSum if current subarray sum is larger
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;  // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};  // Example array

        // Uncomment to use brute force method
        // int maxSum = Brute_force_method(arr);

        // Use prefix sum method
        int maxSum = Prefix_Subarray_Sum(arr);

        System.out.println("Maximum Subarray sum is = " + maxSum);
    }
}
