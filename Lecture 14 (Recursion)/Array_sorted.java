public class Array_sorted {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
        
    }

    public static int findFirstOccurance(int[] arr, int key, int i){
        if (i == arr.length - 1) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return findFirstOccurance(arr, key, i+1);

    }

    public static int lastOccurance(int[] arr, int key, int i){
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9 ,87, 115, 47, 5, 78, 5};
        int i = 0;
        // System.out.println(isSorted(arr, i));
        // System.out.println(findFirstOccurance(arr, 5, i));
        System.out.println(lastOccurance(arr, 5, i));
    }
}
