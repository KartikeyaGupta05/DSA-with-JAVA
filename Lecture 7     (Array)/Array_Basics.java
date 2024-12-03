import java.util.Scanner;

public class Array_Basics {
    public static void main(String[] args) {

        // int[] marks = new int[3]; // all are same

        // int marks[] = {98, 99, 95}; // all are same

        // int marks[] = new int[3]; // all are same
        // marks[0] = 98; // physics
        // marks[1] = 99; // maths
        // marks[2] = 95; // chemistry

        // String name[] = {"Kartikeya", "Om", "Rahul"};
        // for (int i = 0; i < 3; i++) {
        // System.out.println(name[i]);
        // }

        // int marks[] = new int[3];
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]); // It prints zero because In java array store 0
        // at empty places
        // }



        // INPUT / OUTPUT OF ARRAY 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int marks[] = new int[n];

        // INPUT IN JAVA
        System.out.print("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        // OUTPUT IN JAVA
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        sc.close();
    }
}
