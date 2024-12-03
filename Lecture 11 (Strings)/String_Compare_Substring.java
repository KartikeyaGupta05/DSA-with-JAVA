public class String_Compare_Substring {
    public static void main(String[] args) {
        // String s1 = "Kartikeya";
        // String s2 = "Kartikeya";
        // String s3 =new String("Kartikeya");

        // if (s1 == s2) {    // OUTPUT : String are equal
        //     System.out.println("String are equal");
        // } else{
        //     System.out.println("String are not equal");
        // }

        // if (s1 == s3) {    // OUTPUT : String are not equal
        //     System.out.println("String are equal");
        // } else{
        //     System.out.println("String are not equal");
        // }

        // if (s1.equals(s3)) {    // OUTPUT : String are equal
        //     System.out.println("String are equal");
        // } else{
        //     System.out.println("String are not equal");
        // }


        // STRING SUBSTRING
        String s1 = "Kartikeya";
        // String substr = "";
        int startIndex = 0;
        int endIndex = 9;
        // for (int i = startIndex; i < endIndex; i++) {
        //     substr += s1.charAt(i);
        // }
        // System.out.println(substr);


        // JAVA INBUILT SUBSTRING FUNCTION
        System.out.println(s1.substring(startIndex, endIndex));
    }
}
