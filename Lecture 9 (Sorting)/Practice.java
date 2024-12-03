public class Practice {
    public static int[] bubbleSort_DecreasingOrder(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
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

    public static int[] selectionSort_DecreasingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxpos] < arr[j])
                    maxpos = j;
            }
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insertionSort_DecreasingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                } else 
                    continue;
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
        int[] arr = { 2, 32, 54, 76, 43, 56, 86 };
        
        print(bubbleSort_DecreasingOrder(arr));
        print(selectionSort_DecreasingOrder(arr));
        print(insertionSort_DecreasingOrder(arr));
        
    }
}
