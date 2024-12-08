public class Quick_Sort {
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) { // Base case
            return;
        }

        // Partition the array
        int pivotIdx = partition(arr, si, ei);
        quickSort(arr, si, pivotIdx - 1); // Left part
        quickSort(arr, pivotIdx + 1, ei); // Right part
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei]; // Choose the last element as the pivot
        int i = si - 1; // Make space for smaller elements

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in the correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // Return the index of the pivot
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 45, 56, 67, 67, 45, 33, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
