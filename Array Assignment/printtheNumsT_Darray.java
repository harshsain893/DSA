// Class definition
public class printtheNumsT_Darray {

    // Method to count how many times a target number appears in a 2D array
    public static void printtheNumsT_Darray(int matrix[][], int target) {
        int count = 0; // variable to store count of target

        // Loop through each row of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column of the current row
            for (int j = 0; j < matrix[0].length; j++) {
                // Check if current element matches the target
                if (matrix[i][j] == target) {
                    count++; // increase count if match found
                }
            }
        }

        // Print how many times the target is present
        System.out.print(count);
    }

    // Main method (program starts execution here)
    public static void main(String args[]) {
        int target = 7; // number we want to count in the 2D array

        // Define a 2D array (matrix)
        int matrix[][] = {
            {4, 7, 8},  // first row
            {8, 8, 7},  // second row
        };

        // Call method to find how many times '7' is present in matrix
        printtheNumsT_Darray(matrix, target);
    }
}
