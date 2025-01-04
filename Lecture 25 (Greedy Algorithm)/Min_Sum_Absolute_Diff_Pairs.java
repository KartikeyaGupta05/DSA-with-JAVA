import java.util.Arrays;

public class Min_Sum_Absolute_Diff_Pairs {
    public static void main(String[] args) {
        int[] A = {4, 1, 8, 7};
        int[] B = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < B.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Sum of Absolute Difference Pairs = " + minDiff);
    }
}
