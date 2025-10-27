package Array;

public class BubbleSort {

    // Function to perform Bubble Sort on the given array
    public static void bubblesort(int arr[]) {

        // Outer loop runs (n-1) times
        for(int i = 0; i < arr.length - 1; i++) {

            // Inner loop to compare adjacent elements
            // It should run till (length - i - 1) because last i elements are already sorted
            for(int j = 0; j < arr.length - i - 1; j++) {

                // If the current element is greater than the next element, swap them
                if(arr[j] > arr[j + 1]) {

                    // Swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print all elements of the array
    public static void printArray(int arr[]) {
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(); // Move to next line after printing the array
    }

    // Main method - execution starts here
    public static void main (String [] args) {
        int arr[] = {9, 8, 6, 2, 7, 3}; // Input array

        bubblesort(arr); // Calling bubble sort function
        printArray(arr); // Printing sorted array
    }
}

