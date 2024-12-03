import java.util.Scanner;

public class Sum_using_whileloop {
    public static void main(String[] args) {
        int counter = 1, sum = 0;           
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int range = sc.nextInt();
        while(counter <= range){
            sum += counter;
            counter++;
        }
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
