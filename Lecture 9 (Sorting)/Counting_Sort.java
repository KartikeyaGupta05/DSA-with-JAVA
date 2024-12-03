public class Counting_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 6, 7};
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            largest = Math.max(largest, i);
        }
        int[] countarr = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            countarr[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < countarr.length; i++) {
            while (countarr[i] > 0) {
                arr[j] = i;
                j++;
                countarr[i]--;
            }
        }
        System.out.print("Sorted array is = ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
