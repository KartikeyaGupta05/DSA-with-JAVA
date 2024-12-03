import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int x = (A > B) ? A : B;
        System.out.println(x + " is greater");
        sc.close();
    }
}
