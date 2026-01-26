public class backtrackingOnarr {
    

    // Backtracking function
    public static void changeArr(int arr[], int i, int value) {

        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // Step 1: Do work
        arr[i] = value;

        // Step 2: Recursive call
        changeArr(arr, i + 1, value + 1);

        // Step 3: Backtracking (undo)
        arr[i] = arr[i] - 2;
    }

    // Function to print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}

