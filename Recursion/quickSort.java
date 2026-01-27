public class quickSort {
    // Function to perform quick sort
    public static void quickSort(int arr[], int low, int high) {

        // Base condition
        if (low < high) {
            // Find pivot position
            int pivotIndex = partition(arr, low, high);
            // Sort left part
            quickSort(arr, low, pivotIndex - 1);
            // Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    // Partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];   // last element as pivot
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    // Main method
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
