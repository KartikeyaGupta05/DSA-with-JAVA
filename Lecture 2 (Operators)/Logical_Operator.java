public class Logical_Operator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND
        boolean andResult = x && y;
        System.out.println("x && y: " + andResult); // false

        // Logical OR
        boolean orResult = x || y;
        System.out.println("x || y: " + orResult); // true

        // Logical NOT
        boolean notX = !x;
        System.out.println("!x: " + notX); // false

        // Combining logical operators
        boolean complexResult = (x && !y) || (y && x);
        System.out.println("(x && !y) || (y && x): " + complexResult); // true
    }
}
