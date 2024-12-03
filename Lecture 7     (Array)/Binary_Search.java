public class Binary_Search {

    public static int search(int number[], int searchNum) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = ( start + end ) / 2;

            if (number[mid] == searchNum) {
                return mid;
            } else if(number[mid] < searchNum){  // right condition
                start = mid + 1;
            } else{                              // left condition
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 7, 8, 10, 16, 34, 56, 67, 89};
        int searchNum = 7;
        System.out.println("Index for searched number is = " + search(number, searchNum));

    }
}
