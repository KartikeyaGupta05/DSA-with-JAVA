public class Print_X_Power {
    public static int print_x_to_power(int x, int pow) {   // O(n)
        if (pow == 0) {
            return 1;
        }
        int calc = x * print_x_to_power(x, pow - 1);
        return calc;
    }

    public static int optimized_method(int x, int pow) {    // O(log n)
        if (pow == 0) {
            return 1;
        }
        // int halfPowerSq = optimized_method(x, pow / 2) * optimized_method(x, pow / 2);   // this more complex because we call function for two times . Its time complexity is O(n)

        int halfPower = optimized_method(x, pow / 2);
        int halfPowerSq = halfPower * halfPower;

        if (pow % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(print_x_to_power(3, 4));
        System.out.println(optimized_method(3, 4));
    }
}
