public class Pattern_02 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}