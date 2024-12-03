import java.util.Scanner;

class Linear_search {
    public static void main(String[] args) {
        // Program for Linear Search

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of array : ");
        // int n = sc.nextInt();

        // int numbers[] = new int[n];

        // System.out.print("Enter elements of array : ");
        // for (int i = 0; i < n; i++) {
        // numbers[i] = sc.nextInt();
        // }

        // System.out.print("Enter a number to find : ");
        // int search = sc.nextInt();




        
        
        String[] indianDishes = {
            "Biryani", "Butter Chicken", "Masala Dosa", "Rogan Josh",
            "Chole Bhature", "Tandoori Chicken", "Samosa", "Palak Paneer",
            "Aloo Gobi", "Pani Puri", "Dal Tadka", "Pulao", "Lassi",
            "Dhokla", "Gulab Jamun", "Korma", "Pesarattu", "Vindaloo",
            "Kachori", "Malai Kofta", "Puran Poli"
        };

        // Prompt user to enter a dish to search for
        System.out.print("Enter a dish to find: ");
        String search = sc.nextLine();

        // Search for the dish in the array
        boolean found = false; // Flag to check if dish is found
        for (int i = 0; i < indianDishes.length; i++) {
            if (indianDishes[i].equalsIgnoreCase(search)) { // Use equalsIgnoreCase to make case-insensitive comparison
                System.out.println("Dish found at index = " + i);
                found = true;
                break; // Exit the loop once dish is found
            }
        }

        // If dish was not found, print a message
        if (!found) {
            System.out.println("Dish not found.");
        }

        // Close the scanner to avoid memory leak
        sc.close();
    }
}