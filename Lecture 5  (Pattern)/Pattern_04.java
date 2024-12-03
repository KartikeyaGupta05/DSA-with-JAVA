public class Pattern_04 {
    public static void main(String[] args) {
        int n = 4;
        char X = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(X);
                X++;
            }
            System.out.println();
        }
    }
}
