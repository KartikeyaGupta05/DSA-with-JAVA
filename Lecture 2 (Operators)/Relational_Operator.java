public class Relational_Operator{
    public static void main(String[] args){
                int a = 10;
                int b = 5;
        
                // Equal to
                boolean isEqual = (a == b);
                System.out.println("a == b: " + isEqual); // false
        
                // Not equal to
                boolean isNotEqual = (a != b);
                System.out.println("a != b: " + isNotEqual); // true
        
                // Greater than
                boolean isGreater = (a > b);
                System.out.println("a > b: " + isGreater); // true
        
                // Less than
                boolean isLess = (a < b);
                System.out.println("a < b: " + isLess); // false
        
                // Greater than or equal to
                boolean isGreaterOrEqual = (a >= b);
                System.out.println("a >= b: " + isGreaterOrEqual); // true
        
                // Less than or equal to
                boolean isLessOrEqual = (a <= b);
                System.out.println("a <= b: " + isLessOrEqual); // false
            }
        }
