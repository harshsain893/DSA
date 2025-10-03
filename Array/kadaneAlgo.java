public class kadaneAlgo {
    // Function to implement Kadane's Algorithm
    // It finds the maximum subarray sum in the given array
    public static void kadaneAlgo(int number[]){
        int sum = 0;  // This will store the running sum of the current subarray
        int max = Integer.MIN_VALUE; // Initialize max as the smallest possible integer value
        
        // Traverse the entire array
        for (int i = 0; i < number.length; i++){
            sum += number[i];  // Add current element to running sum
            
            // If the running sum is greater than the max found so far, update max
            if (sum > max){
                max = sum;
            }
            
            // If the running sum becomes negative, reset it to 0
            // because continuing with a negative sum will only decrease future sums
            if (sum < 0){
                sum = 0;
            }
        }
        
        // After the loop, max contains the maximum subarray sum
        System.out.println(max);
    } 
    
    public static void main (String []args){
        // Example array containing all negative numbers
        int number[] = {-2, -3, -4, -5, -4};
        
        // Call the function to compute maximum subarray sum
        kadaneAlgo(number);
    }   
}
