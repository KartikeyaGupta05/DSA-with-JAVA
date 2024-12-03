public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 66, 4, 45, 23, 32 };
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // find out the correct to insert
            while( prev >= 0 && arr[prev] > curr){
                arr[prev + 1 ] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
        System.out.print("Sorted array is = ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
