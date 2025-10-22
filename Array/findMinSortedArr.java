package Array;

public class findMinSortedArr {
    
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // 🔍 If middle element is greater than rightmost element,
            // that means the min is on the right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // otherwise, min is on the left half (including mid)
                high = mid;
            }
        }

        // When low == high, that’s the smallest element
        return nums[low];
    }
}
