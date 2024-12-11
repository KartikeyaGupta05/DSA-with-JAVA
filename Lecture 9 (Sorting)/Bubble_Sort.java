public class Bubble_Sort {

    public static int[] BubbleSort(int[] arr){  // TC in worst case is O(n^2) and in Best case O(n^2)
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
        return arr;
    }

    public static int[] OptimizedBubbleSort(int[] arr){  // TC in worst case is O(n^2) and in Best case O(n)
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return arr;
    }

    public static void print(int[] a){
        System.out.print("Sorted array is = ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4};

        print(OptimizedBubbleSort(arr));
        print(BubbleSort(arr));
    }
}