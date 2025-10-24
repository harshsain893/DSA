package Array;

public class SubArrays {

    // Function to print all subarrays of a given array
    public static void SubArrays(int number[]) {

        // Outer loop -> picks the starting index of subarray
        for (int i = 0; i < number.length; i++) {
            int start = i; // starting point of subarray

            // Middle loop -> picks the ending index of subarray
            for (int j = i; j < number.length; j++) {
                int end = j; // ending point of subarray

                // Inner loop -> prints all elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " "); // print each element in current subarray
                }

                System.out.println(); // move to next line after printing one subarray
            }

            System.out.println(); // blank line for separation between subarrays starting at next 'i'
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12}; // given array
        SubArrays(number); // call function to print all subarrays
    }
}
