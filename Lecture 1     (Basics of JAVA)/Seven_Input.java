import java.util.Scanner;

public class Seven_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input: nextInt(), nextFloat(), nextline()etc...
        // int a = sc.nextInt();
        // System.out.println(a);

        // String name = sc.next();    // this only store till space when you gave space in name so it does not store after space part
        // System.out.println(name);

        // String name1 = sc.nextLine();  // while it store after space
        // System.out.println(name1);

        long name2 = sc.nextLong();  
        System.out.println(name2);

        short name3 = sc.nextShort();  
        System.out.println(name3);

        boolean name4 = sc.nextBoolean();  
        System.out.println(name4);

        sc.close();   // Close the scanner to prevent resource leaks
    }
}
