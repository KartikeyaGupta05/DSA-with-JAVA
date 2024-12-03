import java.util.Scanner;

public class Print_Numbers_Using_while_loop {
    public static void main(String[] args) {
        int counter = 1;

        // Print numbers from 1 t0 10
        // while(counter <= 10){
            

        // Print numbers from 1 to counter
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int range = sc.nextInt();
        while(counter <= range){
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
}
