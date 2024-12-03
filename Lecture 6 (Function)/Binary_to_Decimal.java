import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int n = sc.nextInt();
        int binNum = n;
        int pow = 0, decNum = 0;
        while (n != 0){
            int lastDigit = n % 10;
            decNum += (lastDigit * (int)Math.pow(2,pow));
            n /= 10; 
            pow++;
        }
        System.out.println("Decimal number of " + binNum + " is = " + decNum);
        sc.close();
    }
}
