package Array;

public class Secondlargest {

    // Method to find the second largest element in the given array
    public static int Secondlargest(int arr[]) {

        // Initialize two variables to store the largest and second largest values
        // Both are set to the minimum possible integer value initially
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        // Loop through all elements of the array
        for (int i = 0; i < arr.length; i++) {

            // If the current element is greater than the largest found so far
            if (arr[i] > largest) {
                // Update second largest before changing largest
                Secondlargest = largest;
                // Update largest to the current element
                largest = arr[i];
            }

            // (Optional improvement)
            // If the current element is not the largest but greater than second largest
            // and not equal to largest, we can add this:
            // else if (arr[i] > Secondlargest && arr[i] != largest) {
            //     Secondlargest = arr[i];
            // }
        }

        // Return the second largest value found in the array
        return Secondlargest;
    }

    public static void main(String args[]) {
        // Example array
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        // Print the second largest element
        System.out.print(Secondlargest(arr));
    }
}
