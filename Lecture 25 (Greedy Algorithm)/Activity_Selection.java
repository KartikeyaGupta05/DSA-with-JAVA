import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {
    public static void main(String[] args) {  // jab haramre pass end time sorted hai tab TC = O(n)
                                              // jab hamme khud sorting karni hai tab Tc = O(nlogn)
        // int[] start = { 1, 3, 0, 5, 8, 5 };
        // int[] end = { 2, 4, 6, 7, 9, 9 };  // Maximum activity completed = 4    ; A0 A1 A3 A4 

        // unsorted end time
        int[] start = { 5, 3, 1, 5, 0, 8 };
        int[] end = { 9, 4, 2, 7, 6, 9 };  // Maximum activity completed = 4   ; A2 A1 A3 A5 
        

        // this is for when the end time is not sorted so first we sort that using 2D
        // Array
        int[][] activities = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Comparator.comparingDouble(o -> o[2]) -> this is a "lambda function" means
        // shortform of a big function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];

        // for (int i = 1; i < end.length; i++) {
        // if (start[i] >= lastEnd) {
        // // activity selected
        // maxAct++;
        // ans.add(i);
        // lastEnd = end[i];
        // }
        // }

        // full code according to activities 2D Array
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity selected
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum activity completed = " + maxAct);
        for (Integer i : ans) {
            System.out.print("A" + i + " ");
        }
        System.out.println();
    }
}