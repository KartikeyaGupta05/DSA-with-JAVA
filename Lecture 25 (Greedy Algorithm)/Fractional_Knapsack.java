import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;

        // for sorting the ratio
        double[][] ratio = new double[value.length][2];
        // 0th col => index; 1th col => ratio

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));  // this sort the ratio in ascending form
        // Arrays.sort(ratio, Comparator.comparingDouble((double[] o) -> o[1]).reversed());  // this sort the ratio in descending form

        int capacity = W;
        int finalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {   // when ratio sorted in ascending order
        // for (int i = 0; i < ratio.length; i++) {  // when ratio sorted in descending order
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {  // include full item
                finalValue += value[idx];
                capacity -= weight[idx];
            } else{
                // include fractional item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalValue);
    }    
}

