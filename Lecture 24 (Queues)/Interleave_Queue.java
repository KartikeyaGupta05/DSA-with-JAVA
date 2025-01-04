import java.util.LinkedList;
import java.util.Queue;

public class Interleave_Queue {  // TC = O(n)
    public static void interLeave(Queue<Integer> q){
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int n = 10;
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        // function calling
        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
