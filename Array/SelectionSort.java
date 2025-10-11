package Array;

public class SelectionSort {
    
    // Method to perform Selection Sort on the array
    public static void SelectionSort(int arr[]) {
        // Outer loop - runs (n-1) times because last element will already be sorted
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume current index has the smallest element

            // Inner loop - find the smallest element in the unsorted part of array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) { // If we find a smaller element
                    min = j; // Update index of the smallest element
                }
            }

            // Swap the smallest element found with the element at index 'i'
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array elements
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element with a space
        }
        System.out.println(); // Move to next line after printing all elements
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1}; // Declare and initialize the array
        SelectionSort(arr); // Call method to sort the array
        Print(arr); // Call method to print the sorted array
    }
}
