public class Quick_Sort {
    public static int partition(int[] nums, int key, int left, int right){
        int i = left;
        for (int j = left; j <= right; j++) {
            if (nums[j] <= key) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i - 1;
    }

    public static void quickSort(int[] nums, int left, int right){
        // base case
        if (left >= right) {
            return; 
        }

        // recursion kaam
        int key = nums[right];  // it means last element of upcoming array
        int pivot = partition(nums, key, left, right);  // call partition
        quickSort(nums, left, pivot - 1);  // call for left
        quickSort(nums, pivot + 1, right); // call for right
    }
    public static void main(String[] args) {
        // Quick sort using Loop
        int[] nums = {70, 80, 30, 20, 40, 60, 10, 50};
        quickSort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
