import java.util.Arrays;

class Chocolate_Problem_01 {

    static int findMinDiff(int[] arr, int m) {
        int n = arr.length;

        // Sort the given packets
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {

            // calculate difference of current window
            int diff = arr[i + m - 1] - arr[i];

            // if current difference is smaller
            // then update the minimum difference
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(findMinDiff(arr, m));
    }
}