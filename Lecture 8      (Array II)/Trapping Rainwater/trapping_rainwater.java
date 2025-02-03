public class trapping_rainwater {
    // Yeh function trapped rainwater ka total amount calculate karega
    public static int trapped_rainwater(int height[]) {
        int n = height.length;  // Array ki length n store karte hain

        // Step 1: Left max boundary calculate karne ke liye auxiliary array banao
        int left_max[] = new int[n];
        left_max[0] = height[0];  // Pehla element ka left max wahi hoga
        for (int i = 1; i < n; i++) {
            // Har index pe left boundary ka max value update karte hain
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        // Step 2: Right max boundary calculate karne ke liye auxiliary array banao
        int right_max[] = new int[n];
        right_max[n - 1] = height[n - 1];  // Last element ka right max wahi hoga
        for (int i = n - 2; i >= 0; i--) {
            // Har index pe right boundary ka max value update karte hain
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }

        // Step 3: Total trapped water calculate karna
        int trapped_water = 0;  // Initial trapped water 0 rakha
        for (int i = 0; i < n; i++) {
            // Water level = min(left max boundary, right max boundary)
            int water_level = Math.min(left_max[i], right_max[i]);
            // Trapped water = water level - current height
            trapped_water += (water_level - height[i]);
        }

        return trapped_water;  // Total trapped water return karo
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};  // Building heights array
        int trapped_water = trapped_rainwater(height);  // Function call
        System.out.println("Trapped water is = " + trapped_water);  // Result print karo
    }
}



/*
 * OPTIMIZED CODE 
       int left = 0;
        int leftMax = 0;
        int right = height.length - 1;
        int rightMax = 0;
        int result = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    result = result + leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    result = result + rightMax - height[right];
                }
                right--;
            }
        }

        return result;
    }
 */
