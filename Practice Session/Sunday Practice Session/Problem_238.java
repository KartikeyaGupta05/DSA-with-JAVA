public class Problem_238 {
    public static void main(String[] args) {
        // PRODUCT OF ARRAY EXCEPT ITSELF // BRUTE FORCE METHOD
        // int[] nums = { 1, 2, 3, 4, 5 };
        // int[] res = new int[n];
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        // int product = 1;
        // for (int j = 0; j < n; j++) {
        // if (j != i) {
        // product *= nums[j];
        // }
        // }
        // res[i] = product;
        // }
        // for (int i : res) {
        // System.out.print(i + " ");
        // }

        // PREFIX SUFFIX METHOD
        // int[] nums = { 1, 2, 3, 4, 5 };
        // int n = nums.length;
        // int[] prefix = new int[n];
        // prefix[0] = nums[0];
        // for (int i = 1; i < n; i++) {
        // prefix[i] = prefix[i - 1] * nums[i];
        // }

        // int[] suffix = new int[n];
        // suffix[n - 1] = nums[n - 1];
        // for (int i = n - 2; i >= 0; i--) {
        // suffix[i] = suffix[i + 1] * nums[i];
        // }

        // int[] res = new int[n];
        // for (int i = 0; i < n; i++) {
        // if(i != 0 && i != n - 1){
        // res[i] = prefix[i - 1] * suffix[i + 1];
        // }
        // else if(i == 0){
        // res[i] = suffix[i+1];
        // } else{
        // res[i] = prefix[n-2];
        // }
        // }

        // for (int i : res) {
        // System.out.print(i + " ");
        // }

        // WRITE OPTIMIZED CODE BY YOURSELF
        int[] nums = { 1, 2, 3, 4, 5 };

        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct *= nums[i];
        }

        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}