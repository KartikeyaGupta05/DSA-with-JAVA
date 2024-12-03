public class Pattern_10 {
    public static void main(String[] args) {
        int n = 5, x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
            }
            x++;
            System.out.println();
        }
    }
}
