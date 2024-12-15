public class Backtracking_on_Arrays {
    public static void printArr(int[] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void changeArray(int[] arr, int i, int value){
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = value;
        changeArray(arr, i+1, value+1);  // function call step
        arr[i] = arr[i] - 2;  // backtracking step
    }

    public static void findSubsets(String str, String ans, int i){  // Time complexity is O(n * 2)
        // base case
        if (i == str.length()) {
            if(ans.length() == 0)
            System.out.println("null");
            else
            System.err.print(ans + ", ");
            return;
        }
        // recursion
        // Yes choice
        findSubsets(str, ans + str.charAt(i), i+1);

        // No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArr(arr);

        String str = "abcdefghi";
        findSubsets(str, "", 0);
    }
}