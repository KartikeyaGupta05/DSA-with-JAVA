public class Ten_Type_Promotion {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);  // now b-a is convert in int
        // // char c = b-a  // show error because c is a char and b-a is int


        int a = 23;
        float b = 23.23f;
        long c = 24;
        double d = 34.45;
        double ans = a+b+c+d;   // ans type is double because it memory is superior
        System.out.println(ans);
    }
}
