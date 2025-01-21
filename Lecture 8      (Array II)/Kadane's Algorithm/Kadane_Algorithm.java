public class Kadane_Algorithm {
    public static void main(String[] args) {
        // int[] arr = {1, -2, 6, -1, 3};
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Subarray sum is = " + maxSum);
    }
}



/*
        * OPTIMIZED CODE 
        int curr_sum = 0;
        int max_sum = nums[0];
        for(int i = 0;i<nums.length;i++){
            curr_sum+=nums[i];
            max_sum = (curr_sum>max_sum)?curr_sum:max_sum;
            
            if(curr_sum<0) curr_sum=0;
        }
        return max_sum;
 */
