import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = false;
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        for (int i = 0; i < (str.length() / 2) + 1; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                isPalindrome = true;
            } else{
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true) {
            System.out.println("String is Palindrome");
        } else{
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}
