public class Reverse_Array {
    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 7, 8, 10, 16, 34, 56, 67, 89 };
        int first = 0, last = number.length - 1;
        while (first < last) {

            // swapping
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;

            }
            for (int i : number) {
                System.out.print(i + ", ");
            }
        }
    }
