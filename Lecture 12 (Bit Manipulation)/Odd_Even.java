public class Odd_Even {
    public static void main(String[] args) {
        int a = 99;
        int bitmask = 1;
        if((a & bitmask) == 1){
            System.out.println("Number is odd");
        } else{
            System.out.println("Number is even");
        }
    }
}
