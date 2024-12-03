public class Bitwise_Operator{
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        System.out.println(a & b);   // using Binary AND
        System.out.println(a | b);   // using Binary OR
        System.out.println(a ^ b);   // using Binary XOR
        System.out.println(~a);      // using Binary 1's complement
        System.out.println(a << 1);     // using Binary left shift . Yeah binary operator shift karega 'a' ko by 1 means binary of 5 ko 1 se left shift kar denge.  // Output is 10.
        System.out.println(a >> 1);     // using Binary right shift . Yeah binary operator shift karega 'a' ko by 1 means binary of 5 ko 1 se right shift kar denge. // Output is 2.
    }
}