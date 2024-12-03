import java.util.Scanner;

public class LargestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B){
            System.out.println(A + " is greater");
        } else if (A == B){
            System.out.println(A + " is equal to " +B);
        } else{
            System.out.println(B + " is greater");
        }
        sc.close();
    }
}
