public class findDuplicates {
    
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;

            // basic for loop
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                high = mid;      // duplicate is on left side
            } else {
                low = mid + 1;   // duplicate is on right side
            }
        }

        return low;
    }
}

