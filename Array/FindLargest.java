package Array;

public class FindLargest {
    // This program finds the largest and smallest numbers in a given array

    // Method to find the largest value in the array
    public static int largestValue(int number[]) {
        // Initialize 'largest' with the smallest possible integer value
        int largest = Integer.MIN_VALUE;

        // Initialize 'smallest' with the largest possible integer value
        int smallest = Integer.MAX_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < number.length; i++) {
            // Check if the current element is greater than the current largest
            if (number[i] > largest) {
                largest = number[i]; // Update largest value
            }

            // Check if the current element is smaller than the current smallest
            if (number[i] < smallest) {
                smallest = number[i]; // Update smallest value
                // Print the current smallest value (this will print multiple times if array is not sorted)
                System.out.println("Smallest value is: " + smallest);
            }
        }

        // Return the largest number found in the array
        return largest;
    }

    // Main method — program execution starts here
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int number[] = {1, 2, 6, 3, 5};

        // Call the 'largestValue' method and print the largest number
        System.out.println("Largest value is: " + largestValue(number));
    }
}
