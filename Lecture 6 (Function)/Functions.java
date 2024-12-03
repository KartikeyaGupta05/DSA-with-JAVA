import java.util.Scanner;

public class Functions {
    // Method/Function to print the user's name
    static void printMyName(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Use the same Scanner object
        System.out.println("Your name is: " + name);
        return;
    }

    // Method/Function to print the user's age
    static void printMyAge(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Use the same Scanner object
        System.out.println("Your age is: " + age);
        return;
    }
    // Method/Function to print the sum
    static int printSum(Scanner sc){
        System.out.println("Enter two numbers for addition");
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("sum is = ");
        // System.out.println("Sum is = " + sum); // this done when your retuntype is void
        return sum;
    }

    // Method/Function to print the Multiplication
    static void calculateMultiply(Scanner sc){
        System.out.print("Enter two numbers for multiplication : ");
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();
        int multiply = num1 * num2;// this is for void returnType
        // System.out.println(String.format("Multiply of %d and %d is = %d ", num1, num2, multiply));// this is first method to add input number in print
        System.out.println("Multiply of " + num1 + " and " + num2 + " is = " +  multiply); // this second method
        // return num1*num2;  //this is for int returnType
    }

    // Method/Function to print the Factorial
    static void calculateFactorial(Scanner sc){
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        if (num<0) {
            System.out.println("Invalid Number");
        }else if (num == 0) {
            System.out.println("Factorial of " + num + " is = " + "1");
        }else if (num == 1) {
            System.out.println("Factorial of " + num + " is = " + "1");
        }else{
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }System.out.println("Factorial of " + num + " is = " + fact);}
        return;
    }

    // Method/Function to print the Factorial
    static int calculateBinomialCofficient(int n){
        int num = n;
        int fact = 1; 
        if (num<0) {
            System.out.println("Invalid Number");
        }else if (num == 0) {
            System.out.println("Factorial of " + num + " is = " + "1");
        }else if (num == 1) {
            System.out.println("Factorial of " + num + " is = " + "1");
        }else{
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }}
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a single Scanner object
        // printMyName(sc); // Pass the Scanner to all methods
        // printMyAge(sc);
        // int sum = printSum(sc);
        // System.out.println(sum);
        // calculateMultiply(sc);
        // calculateFactorial(sc);
        // System.out.println(String.format("Multiply is =  " + calculateMultiply(sc)));

        int n = 5;
        int r = 2;
        int n_fact = calculateBinomialCofficient(n);
        int r_fact = calculateBinomialCofficient(r);
        int n_r_fact = calculateBinomialCofficient(n-r);
        int binCoff = ((n_fact)/(r_fact * n_r_fact));
        System.out.println(binCoff);
        sc.close(); // Close the Scanner after all input is done
    }
}
