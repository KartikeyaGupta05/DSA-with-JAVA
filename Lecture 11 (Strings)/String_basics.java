import java.util.Scanner;

public class String_basics{
    public static void String_character(String fullName){
        // FUNCTION FOR PRINTING ALL CHARACTERS IN A STRING
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + ", ");
        }
    }
    public static void main(String[] args) {

        // char[] arr = {'a', 'b', 'c', 'd'};
        // String str = "abcd";


        // INPUT / OUTPUT OF STRING

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name1 = sc.nextLine();   // This is used mostly because in this when we give space in a name so the space cannot be excluded ok.
        // System.out.print("Enter your name : ");
        // String name = sc.next();

        // System.out.println(name1);
        // System.out.println(name1.length());
        // System.out.println(name);


        // STRING CONCATINATION
        String firstName = "Kartikeya";
        String lastName = "Gupta";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // System.out.println(fullName.charAt(2));  // charAt function take INDEX as INPUT and gave those character as output.

        String_character(fullName);
        sc.close();
    }
}