import java.util.Scanner;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rev_number : ");
        int num = sc.nextInt();
        
        // Here we cannot store the reverse number
        // while (num != 0) {
        //     int lastDigit = num % 10;
        //     System.out.print(lastDigit);
        //     num /= 10;
        // }



        // Here we store thr reverse number
        int n = num;
        int rev_number = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            rev_number = rev_number * 10 + lastDigit;  // My logic
            num /= 10;
        }
        System.out.println("Reverse of " + n + " is : " + rev_number);  // My logic
        sc.close();
    }
}
