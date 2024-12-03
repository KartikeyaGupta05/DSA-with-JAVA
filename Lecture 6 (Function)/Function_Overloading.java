public class Function_Overloading {

    // Method to sum two integers
    public static int sum(int a , int b){
        return a + b;  // Return the sum of a and b
    }

    // Method to sum three integers (overloaded version)
    public static int sum(int a , int b, int c){
        return a + b + c;  // Return the sum of a, b, and c
    }

    // Method to sum two floating-point numbers (overloaded version)
    public static float sum(float a , float b){
        return a + b;  // Return the sum of a and b (as floats)
    }

    public static void main(String[] args) {
        // Calling the sum method with two integer arguments
        System.out.println(sum(2, 5));  // Output: 7
        
        // Calling the sum method with three integer arguments
        System.out.println(sum(2, 5, 3));  // Output: 10
        
        // Calling the sum method with two float arguments
        System.out.println(sum(2.2f, 5.3f));  // Output: 7.5
    }
}
