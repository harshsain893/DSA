package Array;  // Package name

import java.util.*;  // Importing the Scanner class for user input

public class twodarrayCreation {

    // Method to search for a key element in the 2D array (matrix)
    public static boolean search(int matrix[][], int key) {
        // Loop through each row of the matrix
        for (int i = 0; i < 3; i++) {
            // Loop through each column of the current row
            for (int j = 0; j < 3; j++) {
                // Check if the current element matches the key
                if (matrix[i][j] == key) {
                    System.out.print("Found at index: (" + i + "," + j + ")");
                    return true; // Return true if element is found
                }
            }
        }
        // If the key is not found in the matrix
        System.out.print("Not found");
        return false;
    }

    public static void main(String[] args) {
        // Declare and create a 3x3 matrix (2D array)
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Input elements into the matrix
        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt(); // Taking user input for each element
            }
        }

        // Display (print) the matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to next line after each row
        }

        // Call the search method to find the key (in this case, 5)
        search(matrix, 5);
    }
}
