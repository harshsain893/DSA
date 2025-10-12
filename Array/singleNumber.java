public class singleNumber {
    
    public int singleNumber(int[] nums) {
        int n = nums.length;

        // Here is brute force approach 
        // for(int i = 0; i < n; i++){
        //     int count = 0;
        //     for(int j = 0; j < n; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count == 1){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // here is optimized approach 
        int result = 0; 
        for(int i = 0; i < n; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}

