public class Max_Subarray_Sum {
    public static int Brute_force_method(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }


    public static int Prefix_Subarray_Sum(int arr[]){
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        // int maxSum = Brute_force_method(arr);
        int maxSum = Prefix_Subarray_Sum(arr);
        System.out.println("Maximum Subarray sum is = " + maxSum);
    }    
}