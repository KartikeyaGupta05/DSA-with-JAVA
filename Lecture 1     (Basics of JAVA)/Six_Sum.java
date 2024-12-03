import java.util.Scanner;

public class Six_Sum {
    public static void main(String[] args) {
        // int a = 45;
        // int b = 65;
        // int sum = a + b;
        // System.out.println(sum);
        
        // Take input from user for adding
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int total_sum = num1 + num2;
        System.out.println("Sum is : " + total_sum);
        
        int multiply = num1 * num2;
        System.out.println("Product is : " + multiply);

        sc.close();
    }
}
