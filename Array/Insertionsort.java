package Array;

public class Insertionsort {

    // Function to perform Insertion Sort on an array
    public static void Insertionsort(int arr[]) {

        // Start from index 1 because the element at index 0 is already "sorted"
        for (int i = 1; i < arr.length; i++) {

            // Store the current element to be placed at the correct position
            int current = arr[i];

            // Index of the previous element
            int previous = i - 1;

            // Move elements of arr[0...i-1], that are greater than 'current',
            // one position ahead to make space for 'current'
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];  // Shift element to the right
                previous--;  // Move one step left
            }

            // Insert the 'current' element at the correct position
            arr[previous + 1] = current;
        }
    }

    // Function to print array elements
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element with a space
        }
        System.out.println();  // Move to next line after printing the array
    }

    // Main method to test the Insertion Sort
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 1, 2, 3};  // Unsorted array
        Insertionsort(arr);               // Sort the array using insertion sort
        print(arr);                       // Print the sorted array
    }
}
