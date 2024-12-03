// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)



import java.util.Scanner;
public class Question_ONE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int avg = (A + B + C) / 3;
        System.out.println("Average of three number is : " + avg);
        sc.close();
    }
}