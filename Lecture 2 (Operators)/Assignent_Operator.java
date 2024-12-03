public class Assignent_Operator {
    public static void main(String[] args) {
                int a = 10;
                int b = 5;
        
                // Simple assignment
                int c = a; // c = 10
                System.out.println("c: " + c);
        
                // Add and assign
                c += b; // c = c + b; c = 10 + 5
                System.out.println("c after c += b: " + c); // 15
        
                // Subtract and assign
                c -= b; // c = c - b; c = 15 - 5
                System.out.println("c after c -= b: " + c); // 10
        
                // Multiply and assign
                c *= b; // c = c * b; c = 10 * 5
                System.out.println("c after c *= b: " + c); // 50
        
                // Divide and assign
                c /= b; // c = c / b; c = 50 / 5
                System.out.println("c after c /= b: " + c); // 10
        
                // Modulus and assign
                c %= b; // c = c % b; c = 10 % 5
                System.out.println("c after c %= b: " + c); // 0
            }
        }