// Class to demonstrate Matrix Transpose
public class transposeMatrix {

    // Method to transpose a matrix (⚠️ but currently incorrect logic)
    public static void transposeMatrix(int matrix[][]) {
        // Loop through rows
        for (int i = 0; i < matrix.length; i++) {
            // Loop through columns
            for (int j = 0; j < matrix[0].length; j++) {
                // ❌ Problem here: directly swapping like this
                // overwrites original values (causing wrong result)
                matrix[i][j] = matrix[j][i];
            }
        }

        // ❌ This recursive call will cause infinite recursion
        // because transposeMatrix() is calling itself again with no stopping condition
        transposeMatrix(matrix);
    }

    public static void main(String args[]) {
        // 3x3 matrix initialization
        int matrix [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // Printing transpose of matrix without modifying the original one
        // We just swap row and column indices while printing
        for (int i = 0; i < matrix.length; i++) {           // loop over rows
            for (int j = 0; j < matrix[0].length; j++) {    // loop over columns
                // print element at [j][i] instead of [i][j]
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();   // move to next line after each row
        }
    }
}
