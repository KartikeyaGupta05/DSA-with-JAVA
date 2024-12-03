public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 66, 4, 45, 23, 32 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    continue;
                }
            }
        }
        System.out.print("Sorted array is = ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}