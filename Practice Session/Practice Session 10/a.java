public class a {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int pivot = -1;
        int target = 1;
        int n = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                pivot = i;
            }
        }

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int realMid = (mid + pivot) % n;
            if(nums[realMid] == target){
                System.out.println("Element is at position " + realMid);
                return;
            } else if (nums[realMid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
    }
}