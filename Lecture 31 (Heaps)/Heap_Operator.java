import java.util.*;

public class Heap_Operator {
    static class heap {
        ArrayList<Integer> heap = new ArrayList<>();  // ArrayList to store heap elements

        // Yeh saari code Min Heap ke liye hai

        public void insert(int data) {  // O(logn)
            // Step 1: Last index pe element add karte hain
            heap.add(data);

            int childidx = heap.indexOf(data);  // Child ka index find karte hain
            int parentidx = (childidx - 1) / 2;  // Parent ka index calculate karte hain
            
            // Step 2: Child ko sahi position tak bubble up karte hain
            // while (heap.get(childidx) < heap.get(parentidx)) {  // Jab tak child ka value parent se chhota ho
            while (heap.get(childidx) > heap.get(parentidx)) {  // * MAX HEAP  (change sign  "<" -> ">")
                int temp = heap.get(childidx);
                heap.set(childidx, heap.get(parentidx));
                heap.set(parentidx, temp);

                childidx = parentidx;  // Child index ko update karte hain
                parentidx = (childidx - 1) / 2;  // Parent index ko update karte hain
            }
        }

        public int peek() {  // Root element ko return karta hai
            return heap.get(0);
        }

        private void heapify(int i) {  // O(logn)
            int leftChild = 2 * i + 1;  // Left child ka index
            int rightChild = 2 * i + 2;  // Right child ka index
            int minIdx = i;  // Minimum index ko initially root pe set karte hain  //* for MIN HEAP */

            // Left child ko check karte hain
            // if (leftChild < heap.size() && heap.get(minIdx) > heap.get(leftChild)) {
            if (leftChild < heap.size() && heap.get(minIdx) < heap.get(leftChild)) {  // * MAX HEAP  (change sign  ">" -> "<")
                minIdx = leftChild;
            }

            // Right child ko check karte hain
            // if (rightChild < heap.size() && heap.get(minIdx) > heap.get(rightChild)) {
            if (rightChild < heap.size() && heap.get(minIdx) < heap.get(rightChild)) {  // * MAX HEAP  (change sign  ">" -> "<")
                minIdx = rightChild;
            }

            // Agar root ka value correct position pe nahi hai, to swap karte hain
            if (minIdx != i) {
                int temp = heap.get(i);
                heap.set(i, heap.get(minIdx));
                heap.set(minIdx, temp);
                heapify(minIdx);  // Recursively heapify karte hain
            }
        }

        public int remove() {   // O(logn) -> because of heapify function
            int data = heap.get(0);  // Root element ko remove karte hain

            // Step 1: Root aur last element ko swap karte hain
            int temp = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.set(heap.size() - 1, temp);

            // Step 2: Last element ko remove karte hain
            heap.remove(heap.size() - 1);

            // Step 3: Heapify function call karte hain
            heapify(0);

            return data;  // Removed element ko return karte hain
        }

        public boolean isEmpty() {  // Heap empty hai ya nahi, yeh check karta hai
            return heap.size() == 0;
        }
    }

    public static void main(String[] args) {
        heap h = new heap();

        // Heap mein elements insert karte hain
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.insert(6);
        h.insert(10);
        h.insert(1);

        // Jab tak heap empty nahi hota, elements remove karte hain
        while (!h.isEmpty()) {
            System.out.println(h.remove());  // Elements ko remove aur print karte hain
        }       
    }
}
