/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/

public class Median_of_Sorted_array_42 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
        int n = nums1.length + nums2.length;
        int[] merge = new int[n];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merge[k] = nums1[i];
                i++;
                k++;
            } else{
                merge[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            merge[k] = nums1[i];
            i++;
            k++;
        }
    
        while (j < nums2.length) {
            merge[k] = nums2[j];
            j++;
            k++;
        }

        int left = 0;
        int right = merge.length - 1, mid;
        if (merge.length % 2 != 0) {
            mid = left + right / 2;
            res = merge[mid];
        } else{
            mid = (left + right) / 2;
            res = ((double)(merge[mid] + merge[mid + 1]) / 2);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}