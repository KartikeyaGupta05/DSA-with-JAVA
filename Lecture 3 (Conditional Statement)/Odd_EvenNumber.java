import java.util.Scanner;

public class Odd_EvenNumber {
   public Odd_EvenNumber() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int A = sc.nextInt();
      if (A % 2 == 0) {
         System.out.println("" + A + " is a even number");
      } else {
         System.out.println("" + A + " is a odd number");
      }

      sc.close();
   }
}
