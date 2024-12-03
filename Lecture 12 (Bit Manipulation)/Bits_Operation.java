public class Bits_Operation {
    public static int getIthBit(int a, int i){
        // GET ith BIT
        int bitmask = 1 << i;
        if ((a & (bitmask)) == 0) {    
            return 0;
        } else{
            return 1;
        }
    }

    public static int setIthBit(int a, int i){
        // SET ith BIT
        int bitmask = 1 << i;
        int b = a | bitmask;
        return b;
    }

    public static int clearIthBit(int a, int i){
        // CLEAR ith BIT
        int bitmask1 = ~(1 << i);  
        int c = a & bitmask1;
        return c;

    }

    public static int updateIthBit(int a, int i, int newBit){
        // if (newBit == 0) {
        //     return clearIthBit(a, i);
        // } else{
        //     return setIthBit(a, i);
        // }

        // OR

        a = clearIthBit(a, i);
        int BitMask = newBit << i;
        return a | BitMask;
    }
    public static void main(String[] args) {
        int a = 10;
        int i = 2;
        System.out.println(getIthBit(a, i));
        System.out.println(setIthBit(a, i));
        System.out.println(clearIthBit(a, i));
        System.out.println(updateIthBit(a, i, 1));
    }
}
