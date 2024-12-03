import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A >= B && A >= C){
            System.out.println("Largest is " + A);
        } else if (B >= C) {
            System.out.println("Largest is " + B);
        } else{
            System.out.println("Largest is " + C);
        }
        sc.close();
    }
}
