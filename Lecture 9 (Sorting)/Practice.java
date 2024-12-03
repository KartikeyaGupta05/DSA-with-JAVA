public class Practice {
    public static void bubbleSort(int a[]){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else{
                    continue;
                }
            }
        }
        System.out.print("Sorted array is = ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(a);
    }
}
