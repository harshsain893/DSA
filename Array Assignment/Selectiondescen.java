public class Selectiondescen {

    // Method to perform Selection Sort in Descending Order
    public static void Selectiondescen(int arr[]) {
        // Outer loop moves boundary of unsorted part of array
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Assume the current index 'i' has the largest element
            int min = i;

            // Inner loop to find the actual largest element in remaining array
            for (int j = i + 1; j < arr.length; j++) {
                // If a larger element is found, update 'min' index
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }

            // Swap the found largest element with the first element of unsorted part
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print elements of the array
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element with space
        }
        System.out.println(); // Print new line after array
    }

    // Main method: program starts here
    public static void main(String[] args) {
        // Declare and initialize array
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3};

        // Call selection sort (descending order)
        Selectiondescen(arr);

        // Print the sorted array
        Print(arr);
    }
}
