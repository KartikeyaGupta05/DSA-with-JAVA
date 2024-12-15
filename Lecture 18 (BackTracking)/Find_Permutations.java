public class Find_Permutations {

    public static void findpermutations(String str, String ans){  // Time complexity is O(n * n!)
        // base case 
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findpermutations(newStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findpermutations(str, "");
    }
}
