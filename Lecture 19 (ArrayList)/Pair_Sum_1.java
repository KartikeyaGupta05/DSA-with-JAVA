import java.util.ArrayList;

public class Pair_Sum_1 {
    public static void bruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.print("(");
                    System.out.print(list.get(i) + "," + list.get(j));
                    System.out.print(")");
                }
            }
        }
        System.out.println();
    }

    public static boolean optimizedApproach(ArrayList<Integer> list, int target) {
        // 2 Pointer Approach   | TC = O(n)
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if ((sum) == target) {
                System.out.print("(");
                System.out.print(list.get(lp) + "," + list.get(rp));
                System.out.println(")");
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        // bruteForce(list, target);
        System.out.println(optimizedApproach(list, target));

    }
}
