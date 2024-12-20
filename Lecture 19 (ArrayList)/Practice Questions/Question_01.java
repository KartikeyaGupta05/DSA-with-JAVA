import java.util.ArrayList;

public class Question_01 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(4);

        boolean isMonotonicInc = true; // Assume initially it is increasing
        boolean isMonotonicDec = true; // Assume initially it is decreasing

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                isMonotonicDec = false; // If found increasing, it cannot be decreasing
            } else if (nums.get(i) > nums.get(i + 1)) {
                isMonotonicInc = false; // If found decreasing, it cannot be increasing
            }
        }

        // If either increasing or decreasing is true, it's monotonic
        if (isMonotonicInc || isMonotonicDec) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }





        // optimized code 
        boolean isMonotonic = true;  // Start with the assumption that the list is monotonic
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                increasing = true;
            } else if (nums.get(i) > nums.get(i + 1)) {
                decreasing = true;
            }

            // If both increasing and decreasing conditions are met, it's not monotonic
            if (increasing && decreasing) {
                isMonotonic = false;
                break;
            }
        }

        System.out.println(isMonotonic ? "true" : "false");
    }
}
