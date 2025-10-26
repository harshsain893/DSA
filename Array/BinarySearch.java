package Array;

public class BinarySearch {
    
    // Function to perform Binary Search on a sorted array
    public static int BinarySearch(int number[], int key) {
        int start = 0;                   // Starting index of the search range
        int end = number.length - 1;     // Ending index of the search range

        // Loop continues until the search range is valid
        while (start <= end) {
            int mid = (start + end) / 2; // Calculate middle index

            // Check if the middle element is the key
            if (number[mid] == key) {    // Element found
                return mid;
            }

            // If key is greater, ignore the left half
            if (number[mid] < key) {
                start = mid + 1;
            } 
            // If key is smaller, ignore the right half
            else {
                end = mid - 1;
            }
        }

        // If key not found, return -1
        return -1;
    }

    // Main function to test Binary Search
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10}; // Sorted array (required for binary search)
        int key = 10;                    // Element to search for

        // Print the result
        System.out.println("Key is at Index: " + BinarySearch(number, key));
    }
}
