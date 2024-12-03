import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int n = sc.nextInt();
        int decNum = n, pow = 0, binNum = 0;

        while(n != 0){
           int remainder = n % 2;
           binNum += remainder * (int)Math.pow(10, pow);
           n /= 2;
           pow++; 
        }
        System.out.println("Binary number of " + decNum + " is = " + binNum);
        sc.close();
    }
}
