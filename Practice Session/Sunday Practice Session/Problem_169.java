public class Problem_169 {
    public static void main(String[] args) {
        // MAJORITY ELEMENT PROBLEM
        int[] nums = { 20, 20, 30, 10, 20, 30, 30, 30, 30, 30 };
        int majority = nums[0];
        int lead = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                lead++;
            } else if (lead > 0) {
                lead--;
            } else {
                majority = nums[i];
                lead = 1;
            }
        }
        System.out.println(majority);
    }
}
