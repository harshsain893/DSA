public class splitArray {
    
    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        // Step 1: Find max element and total sum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > start) {
                start = nums[i];   // max element
            }
            end += nums[i];        // total sum
        }

        // Step 2: Binary Search
        while (start < end) {

            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            // Step 3: Count required subarrays
            for (int i = 0; i < nums.length; i++) {

                if (sum + nums[i] > mid) {
                    sum = nums[i];
                    pieces++;
                } else {
                    sum += nums[i];
                }
            }

            // Step 4: Adjust range
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
