public class Fibonacci{
    public static int fibonaaci(int n){  // yeah function usi term ki value dega na ki puri series . for example term 8 = 21 se in function working.
        if (n == 0 || n == 1)
        return n;

        return fibonaaci(n-1) + fibonaaci(n-2);  // time compexity = O(2^n) and space complexity = O(n).
    }
    public static void main(String[] args) {
        System.out.println(fibonaaci(8));
    }
}