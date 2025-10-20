package Array;

public class majorityElem {
    
    // Function to find the majority element in the given array
    // Majority element: the element that appears more than n/2 times
    public int majorityElement(int[] nums) {
        int freq = 0, ans = 0; // 'freq' keeps track of count balance, 'ans' stores the current candidate

        // Loop through all elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If frequency becomes zero, assume current number as potential majority candidate
            if (freq == 0) 
                ans = nums[i];
            
            // If the current number matches the candidate, increment frequency
            if (ans == nums[i]) 
                freq++;
            // Otherwise, decrement frequency
            else 
                freq--;
        }

        // After the loop, 'ans' will hold the majority element
        // (Boyer–Moore Voting Algorithm)
        return ans;
    }
}
