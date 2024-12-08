public class Problem_33{
    public static void main(String[] args) {
        // SEARCH IN ROTATED SORTED ARRAY
        int[] nums = {4,5,6,7,0,1,2};
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int target = 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else{
                right = mid;
            }
        }

        int shift = left;
        
        left = 0;
        right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int realMid = (mid + shift) % n;
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