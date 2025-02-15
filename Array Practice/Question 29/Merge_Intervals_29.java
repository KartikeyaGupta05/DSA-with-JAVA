/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

Constraints:
1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
*/

public class Merge_Intervals_29 {
    public static int[][] merge(int[][] intervals) {
        for (int i = 0; i < intervals[0].length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                intervals[i][1] = intervals[i+1][1];
            }
        }
        return intervals;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int intervals1[][] = merge(intervals);
        for (int i = 0; i < intervals1.length; i++) {
            for (int j = 0; j < intervals1[0].length; j++) {
                System.out.print(intervals1[i][j] + " ");
            }
            System.out.println();
        }
    }
}