// Define the package name
package Array;

public class PairsofArray {

    // Method to print all possible pairs from the array
    public static void PrintPairs(int number[]){
        int n = number.length;  // Get the length of the array

        // Formula to calculate total number of pairs possible = (n * (n - 1)) / 2
        int total_pairs = (n * (n - 1)) / 2;

        // Outer loop to pick one element at a time
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];  // Current element

            // Inner loop to form pairs with elements after the current element
            for (int j = i + 1; j < number.length; j++) {
                // Print the current pair
                System.out.print("(" + curr + "," + number[j] + ")");
            }

            // Move to the next line after printing all pairs with current element
            System.out.println();
        }

        // Print total number of pairs possible in the array
        System.out.println("Total pairs is : " + total_pairs);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Declare and initialize an array
        int number[] = {2, 4, 6, 8, 10};

        // Call the method to print all pairs and total count
        PrintPairs(number);
    }
}
