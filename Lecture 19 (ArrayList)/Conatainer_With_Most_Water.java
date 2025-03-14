import java.util.*;

public class Conatainer_With_Most_Water {
    // public static int storeWater(ArrayList<Integer> height) {
    //     int max_water = 0;

    //     // brute force approach TC = O(n^2)
    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = i + 1; j < height.size(); j++) {
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j - i;
    //             int currWater = ht * width;
    //             max_water = Math.max(max_water, currWater);
    //         }
    //     }
    //     return max_water;
    // }

    public static int optimizedApproach(ArrayList<Integer> height) {
        // 2 pointer approach  | Tc = O(n)
        int max_water = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // claculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            max_water = Math.max(max_water, currWater);
            
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max_water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(optimizedApproach(height));
    }
}
