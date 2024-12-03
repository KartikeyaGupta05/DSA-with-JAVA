import java.util.Scanner;

public class Break_and_Continue_Statement {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Break statement
        // while(true) {
        //     System.out.print("Enter a number : ");
        //     int num = sc.nextInt();
        //     if (num % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(num);
        // }
        // System.out.println();
        // System.out.println("You are out of loop");
        
        
        sc.close();
        
        
        // Continue Statement
        while(true) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num);
        }
        // System.out.println();
        // System.out.println("You are out of loop");
        // sc.close();
    }
}
