import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 2){
            System.out.println("Prime number");
        }

        else{
            // for (int i = 2; i < num; i++) {  // This code is time complex
            for (int i = 2; i <= Math.sqrt(num); i++) {  // This code is optimize 
                if(num % i == 0){
                    isPrime = false;
                }
            }
    
            if(isPrime == false){
                System.out.println("Composite Number");
            } else{
                System.out.println("Prime number");
            }
        }
        sc.close();
    }
}
