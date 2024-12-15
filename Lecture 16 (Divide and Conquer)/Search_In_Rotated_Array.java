public class Search_In_Rotated_Array {
    public static int search(int[] nums, int target, int si, int ei){
        // base case
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;

        // case found
        if (nums[mid] == target) {
            return mid;
        }

        // mid on L1
        if (nums[si] <= nums[mid]) {
            // case a :
            if (nums[si] <= target && target <= nums[mid]) {
                return search(nums, target, si, mid - 1);
            }
            // case b:
            else{
                return search(nums, target, mid + 1, ei);
            }
        } 

        // mid on L2
        else {
            // case c:
            if (nums[mid] <= target && target <= nums[ei]) {
                return search(nums, target, mid + 1, ei);
            }
            // case d:
            else{
                return search(nums, target, si, mid - 1);
            }

        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1};
        int target = 0;
        System.out.print("Target index is = ");
        System.out.println(search(nums, target, 0, nums.length - 1));
    }
}