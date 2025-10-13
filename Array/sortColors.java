public class sortColors {
    
    public void sortColors(int[] nums) {
        int n = nums.length;

        // Brute Force Approach
        // for (int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(nums[i] > nums[j]){
        //            int temp = nums[i];
        //            nums[i] = nums[j];
        //            nums[j] = temp;
        //         }
        //     }
        // }
        // Optimal Approach

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;  // keep 1s in middle
            } 
            else { // nums[mid] == 2
                // swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

