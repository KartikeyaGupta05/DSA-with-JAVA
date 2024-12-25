import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        // brute force approach
        // int[] arr = {5, 4, 6, 8, 23, 56, 9};

        // for (int i = 0; i < arr.length; i++) {
        //     if (i == arr.length - 1) {
        //         System.out.print("-1 ");
        //         break;
        //     }
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             System.out.print(arr[j] + " ");
        //             break;
        //         }
        //         if (j == arr.length - 1) {
        //             System.out.print("-1 ");
        //         }
        //     }
        // }


        // Stack using Approach
        int[] arr = {6, 8, 0, 1, 3};  // O(n)
        int[] nextGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i : nextGreater) {
            System.out.print(i + " ");
        }
    }
}
