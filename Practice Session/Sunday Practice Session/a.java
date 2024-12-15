public class a {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int n = nums.length;
        int product = 1;
        for (int i : nums) {
            if (i != 0) {
                product *= i;
            }
        }
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                res[i] = product ;
            } else{
                res[i] = 0;
            }
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}