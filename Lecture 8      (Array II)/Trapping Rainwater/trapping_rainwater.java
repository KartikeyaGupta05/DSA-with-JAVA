public class trapping_rainwater {
    public static int trapped_rainwater(int height[]){
        int n = height.length;

        // calculate left max boundary - auxialries array
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }

        // calculate right max boundary - auxilaries array
        int right_max[] = new int[n];
        right_max[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }

        //loop
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {
            // water level = min(left max boundary , right max boundary
            int water_level = Math.min(left_max[i], right_max[i]);
            // trapped water = water level - height[i] 
            trapped_water += (water_level - height[i]);
        }
        return trapped_water;

    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int trapped_water = trapped_rainwater(height);
        System.out.println("Trapped water is = " + trapped_water);
    }
}