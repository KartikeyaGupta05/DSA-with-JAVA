import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter an Operator for Operation:");
        System.out.println("Enter '+' for Addition");
        System.out.println("Enter '-' for Subtraction");
        System.out.println("Enter '*' for Multiplication");
        System.out.println("Enter '/' for Division");
        System.out.println("Enter '%' for Modulo");
        
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0); // Read the first character of the input

        System.out.print("Enter two numbers for operation: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        switch (choice) {
            case '+':
                System.out.println("Addition is = " + (A + B));
                break;
            case '-':
                System.out.println("Subtraction is = " + (A - B));
                break;
            case '*':
                System.out.println("Multiplication is = " + (A * B));
                break;
            case '/':
                if (B != 0) {
                    System.out.println("Division is = " + (A / B));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case '%':
                if (B != 0) {
                    System.out.println("Modulo is = " + (A % B));
                } else {
                    System.out.println("Error: Division by zero for modulo");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        
        sc.close(); // Close the scanner
    }
}
