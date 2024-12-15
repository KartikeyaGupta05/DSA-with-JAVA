// Iska logic 
// 1. Hamne ek Letters naam ki ek 2D chracter matrix banai, aur isme "Final" isliye use kiya jisse isme koi change na kar sake
// 2. Mene ek function banaya letterCombinations ke name se jo letters ko combine karta hai aur "bfs name ke function ko call karta hai".
// 3. "bfs function" sabse important function for this code kyuki yeah combination banata hai aur, isme hmm "bfs func" ko recursively call karte hai jisse wo combination print karta hai.
// Isse kya seekha - Main point is Letters[Character.getNumericValue(Digit.charAt(pos))] yeah batata hai ki konse characters chahiye like isne return kara 2 so it means { 'a', 'b', 'c' }.

public class Question_2 {
    final static char[][] Letters = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void letterCombinations(String Digit) {
        int len = Digit.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), Digit);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String Digit) {
        if (pos == len) {
            System.out.println(sb.toString());
        } else {
            char[] letters = Letters[Character.getNumericValue(Digit.charAt(pos))]; // if pos = 2 so char [] letters = {'a', 'b', 'c'};
            for (int i = 0; i < letters.length; i++)
                // bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), Digit); // this
                // is right but not so good
                sb.append(letters[i]); // Add current letter
                bfs(pos + 1, len, sb, Digit); // Recursive call
                sb.deleteCharAt(sb.length() - 1); // Backtracking
        }
    }
 
    public static void main(String args[]) {
        letterCombinations("23");
    }
}
