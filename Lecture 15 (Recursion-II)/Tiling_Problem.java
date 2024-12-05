public class Tiling_Problem {
    public static int tilingFloor(int n) { // 2 X n (Floor size)
        if (n == 0 || n == 1) {
            return 1;
        }
        // totalways = vertical choice + horizontal choice
        return tilingFloor(n - 1) + tilingFloor(n - 2);
    }

    public static void removeDuplicates(String str, int index, StringBuilder newstr, boolean[] map) {
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, index + 1, newstr, map);
        } else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, index, newstr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        // System.out.println(tilingFloor(6));
        String str = "appnnacollegehhikartikeya";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        
    }
}