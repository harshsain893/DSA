package Array;

public class matrixDiagonalSum {

    // Function to calculate the sum of both diagonals of a square matrix
    public static int Diagonalsum(int matrix[][]) {
        int sum = 0; // Variable to store the total diagonal sum

        // Loop through each row (and column) of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Add primary diagonal element (top-left to bottom-right)
            sum += matrix[i][i];

            // Add secondary diagonal element (top-right to bottom-left)
            // Only add if it's not the same element (i.e., not the center element in odd-sized matrices)
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        // Return the total sum of both diagonals
        return sum;
    }

    public static void main(String[] args) {
        // Define a 4x4 matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };

        // Print the sum of diagonals
        System.out.println(Diagonalsum(matrix));
    }
}
