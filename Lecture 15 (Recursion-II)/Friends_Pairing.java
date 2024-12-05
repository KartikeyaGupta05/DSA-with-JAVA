public class Friends_Pairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // total ways = single + ((pair choices * pair ways) --> pairs)
        return friendsPairing(n - 1) + (n - 1) * (friendsPairing(n - 2));
    }

    public static void binaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryString(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            binaryString(n - 1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        // System.out.println(friendsPairing(4));
        binaryString(3, 0, "");
    }
}
