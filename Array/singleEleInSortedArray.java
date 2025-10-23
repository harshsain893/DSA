package Array;

public class singleEleInSortedArray {

    public int singleNonDuplicate(int[] nums) {
        // int count = 0;
        // int n = nums.length;
        // for (int i = 0; i < n; i++){
        //     for (int j = i + 1; j < n; j++){
        //         if(nums[i] != nums[j]){
        //             return nums[j];
        //         }
        //     }
        // }
        // return -1;
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // make sure mid is even (so we compare pairs properly)
            if (mid % 2 == 1) mid--;

            // check if pair is correct
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;  // pair is fine, move right
            } else {
                high = mid;  // pair broken, move left
            }
        }

        return nums[low];  // when low == high → single element found
    }
}

