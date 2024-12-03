public class Print_Subarray {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10};
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " " );
                }
                ts++;
                System.out.print(")");
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("Total Subarray is = " + ts);
    }
}
