public class Heap_Sort {

    // for ascending 

    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, size);
        }
    }


    public static void heapSort(int arr[]) {  // O(nlogn) + O(nlogn) = O(nlogn)
        // step 1 -> build MAX heap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {  // O(nlogn)
            heapify(arr, i, n);
        }

        // step 2 -> push largest element at last
        for (int i = n - 1; i >= 0; i--) {  // O(nlogn)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 1, 5, 4};

        heapSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
