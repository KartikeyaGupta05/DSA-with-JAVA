import java.util.*;

public class Chocola_Problem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer[] verticaCutsCost = { 2, 1, 3, 1, 4 }; // m-1
        Integer[] horizontalCutsCost = { 2, 1, 4 }; // n-1

        Arrays.sort(verticaCutsCost, Collections.reverseOrder());
        Arrays.sort(horizontalCutsCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < horizontalCutsCost.length && v < verticaCutsCost.length) {
            if (verticaCutsCost[v] <= horizontalCutsCost[h]) { // horizontal cut
                cost += (horizontalCutsCost[h] * vp);
                hp++;
                h++;
            } else { // vertical cut
                cost += (verticaCutsCost[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < horizontalCutsCost.length) {  // left horizontal cuts
            cost += (horizontalCutsCost[h] * vp);
            hp++;
            h++;
        }
 
        while (v < verticaCutsCost.length) {  // left vetical cuts
            cost += (verticaCutsCost[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of cuts = " + cost);
    }
}
