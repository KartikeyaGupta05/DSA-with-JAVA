public class Largest_in_Array {
    public static void main(String[] args) {
        int arr[] = {1, 45, 56, 78, 87, 98, 64, 53, 0};
        int largest = Integer.MIN_VALUE;   // largest = -infinity
        int smallest = Integer.MAX_VALUE;   // largest = +infinity

        for (int value : arr) {   // this is for each loop which directly access the value of array elements
            if(value > largest ){
                largest = value;    // find the largest value
            }
            if(value < smallest){
                smallest = value;  // find the smallest value
            }
        }

        System.out.println("Largest in given array is : " + largest);
        System.out.println("Smallest in given array is : " + smallest);
    }
}
