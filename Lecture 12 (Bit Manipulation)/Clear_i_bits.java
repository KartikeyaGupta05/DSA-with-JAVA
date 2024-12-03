public class Clear_i_bits {

    public static int clearIBits(int n, int i) {
        int bitmask = (~0) << i; // OR (-1) << i
        return n & bitmask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1; // OR (int) (Math.pow(2, i)) - 1
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean IsPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = (n >> 1);
        }
        return count;
    }

    public static int FastExponentiation(int a, int n) {   // check LSB
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
        System.out.println(IsPowerOfTwo(8192));
        System.out.println(countSetBits(15));
        System.out.println(FastExponentiation(5, 7));
    }
}