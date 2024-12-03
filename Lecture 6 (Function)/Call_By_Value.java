public class Call_By_Value {
    // Function to swap two numbers (Demonstrating Call by Value)
    public static void swap(int a, int b) {
        // Local variables a and b are copies of the original arguments
        System.out.println("Before swap inside method: a = " + a + ", b = " + b);
        
        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        // Print swapped values inside the function (this won't affect original variables)
        System.out.println("After swap inside method: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        
        System.out.println("Before calling swap: a = " + a + ", b = " + b);
        
        // Call the swap method (by value)
        swap(a, b);
        
        // Print the values after the swap call to see the effect
        System.out.println("After calling swap: a = " + a + ", b = " + b);
    }
}
