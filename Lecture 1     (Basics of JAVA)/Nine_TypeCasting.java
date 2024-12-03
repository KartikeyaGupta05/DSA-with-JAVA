import java.util.Scanner;

public class Nine_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();   // this is implicit type conversion
        System.out.println(a);
        // int a = sc.nextFloat();   // can't convert by compiler directly
        // int c = (int) sc.nextFloat();  // this how we explicitely convert that

        int d = (int) 99.55f;
        System.out.println(d);
        sc.close();
    }
}
