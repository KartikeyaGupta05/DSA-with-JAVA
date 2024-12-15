public class Question_1 {
    public static void ocuurance(int[] arr, int key, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        ocuurance(arr, key, index + 1);
    }
    public static void main(String[] args) {
        int [] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        ocuurance(arr, key, 0);
    }    
}
