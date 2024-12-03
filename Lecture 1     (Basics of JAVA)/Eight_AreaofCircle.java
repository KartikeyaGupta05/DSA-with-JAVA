import java.util.Scanner;

public class Eight_AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.print("Area of circle is : ");
        System.out.println(area);
        sc.close();

        
    }
}
