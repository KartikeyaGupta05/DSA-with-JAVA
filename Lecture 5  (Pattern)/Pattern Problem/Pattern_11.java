public class Pattern_11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
              System.out.print(j + " ");  
            }
            
            for (int j = 2; j <= i; j++) {
                if(i == 1){
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
