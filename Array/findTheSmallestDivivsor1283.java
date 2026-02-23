public class findTheSmallestDivivsor1283 {
    class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = nums[0];

        for (int i = 1; i < nums.length; i++){
            if(nums[i] > end){
                end = nums[i];
            }
        }

        while(start < end){
            int mid = (start + end) / 2;
            int sum = 0;

            for(int i = 0; i < nums.length; i++){
                sum += (nums[i] + mid - 1) / mid;
            }

            if(sum > threshold){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
}
