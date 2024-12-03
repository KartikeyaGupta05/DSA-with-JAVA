public class Recursion_Basics {
    public static void decreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decreasingOrder(n - 1);
    }

    public static void increasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;    // recursion me agar hmm kisi recursive funtion me return use karte hai toh bo bss usi yaani cureeent function se bahar nikalta hai  jaise isme hai aur nhi toh photo dekh le
        }
        increasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static int printFact(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }

        fact = n * printFact(n - 1);
        return fact;
    }

    public static int sumNaturalNum(int n){
        int sum = 0;
        if(n == 1){
            return 1;
        }
        sum = n + sumNaturalNum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        // decreasingOrder(10);
        // increasingOrder(10);
        // System.out.println(printFact(5));
        System.out.println(sumNaturalNum(10));
    }
}