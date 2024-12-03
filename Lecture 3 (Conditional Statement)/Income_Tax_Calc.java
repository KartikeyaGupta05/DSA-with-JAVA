import java.util.Scanner;

public class Income_Tax_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        float tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = income * 0.2f;
        } else {
            tax = income * 0.3f;
        }
        System.out.println("Your tax is = " + tax);
        sc.close();
    }
}
