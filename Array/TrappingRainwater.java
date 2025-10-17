package Array;

public class TrappingRainwater {

    // Function to calculate total trapped rainwater
    public static int TrappingRainwater(int height[]) {
        int left = 0, right = height.length - 1; // Pointers at both ends
        int leftmax = 0, rightmax = 0; // Track the maximum height on both sides
        int water = 0; // Variable to store total trapped water

        // Loop until the two pointers meet
        while (left < right) {
            // Compare heights to decide which side to process
            if (height[left] <= height[right]) {
                // If current left bar is taller or equal to leftmax, update leftmax
                if (height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    // Otherwise, water can be trapped here
                    water += leftmax - height[left];
                }
                left++; // Move left pointer forward
            } else {
                // If current right bar is taller or equal to rightmax, update rightmax
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    // Otherwise, water can be trapped here
                    water += rightmax - height[right];
                }
                right--; // Move right pointer backward
            }
        }
        return water; // Return the total trapped water
    }

    public static void main(String args[]) {
        // Example input array representing heights of bars
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        // Print the total trapped water (Expected output: 6)
        System.out.println(TrappingRainwater(height));
    }
}
