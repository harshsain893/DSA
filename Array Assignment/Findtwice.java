// Main class Findtwice
public class Findtwice {

    // Inner class ArrayAssignment
    public class ArrayAssignment {

        // Method to check if the array contains duplicate values
        public static boolean duplicateArray(int arr[]) {
            // Outer loop: pick each element one by one
            for (int i = 0; i < arr.length; i++) {
                // Inner loop: compare the chosen element with all the others
                for (int j = i; j < arr.length; j++) {
                    // If both elements are the same
                    if (arr[i] == arr[j]) {
                        return true; // Duplicate found, return true
                    }
                }
            }
            // If no duplicates found, return false
            return false;
        }

        // Main method: program execution starts here
        public static void main(String[] args) {
            // Example array with duplicate elements
            int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

            // Call duplicateArray method and print result
            System.out.println(duplicateArray(arr));
        }
    }
}
