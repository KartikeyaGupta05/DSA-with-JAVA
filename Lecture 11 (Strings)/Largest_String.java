public class Largest_String {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana", "pineapple"};
        String largest = fruits[0];

        /* FOR COMPARISION we have TWO FUNCTION : 1. COMPARE in this 'A' and 'a' is treated as different but in 2. COMPARETOIGNORECASE in this 'a' and 'A' both are treated as same */

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
