import java.util.ArrayList;

public class Pair_sum_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        int pivot = -1;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
            }
        }
        int lp = pivot + 1;  // samllest 
        int rp = pivot;  // largest
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.print("(");
                System.out.print(list.get(lp) + "," + list.get(rp));
                System.out.println(")");
                return;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else{
                rp = (n + rp - 1) % n;
            }
        }
    }
}
