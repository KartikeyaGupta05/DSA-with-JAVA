public class Merge_Sort{
    public static void printnums(int[] nums){
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] nums, int si, int ei){
        if(si >= ei){
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2;  // or mid = (ei + si) / 2
        mergeSort(nums, si, mid);   // left
        mergeSort(nums, mid + 1, ei);   // right
        merge(nums, si, mid, ei);

    }
    public static void merge(int[] nums, int si, int mid, int ei){
        int[] temp = new int[ei - si + 1];
        int i = si;  // iterator for left part
        int j = mid + 1;  // iterator for right part
        int k = 0;  // iterator for temp numsay
        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // copy temp to original
        for (k = 0, i = si; k < temp.length;  k++, i++) {
            nums[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] nums = {6, 3, 9, 5, 45, 56, 67, 67, 45, 33, 2, 8};
        mergeSort(nums, 0, nums.length - 1);
        printnums(nums);
    }
}