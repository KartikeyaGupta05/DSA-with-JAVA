public class Pattern_05 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // if(i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0){  // My logic
                //     System.out.print("0");
                // } else{
                //     System.out.print("1");
                // }

                if((i+j) % 2 == 0){    // Didi Logic
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println(); 
        }
    }    
}
