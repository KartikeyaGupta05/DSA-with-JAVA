public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 66, 4, 45, 23, 32 };
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                // if (arr[minPos] < arr[j]) {    // desending order
                if (arr[minPos] > arr[j]) {    // acsending order
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array is = ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
