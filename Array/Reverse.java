package Array;

public class Reverse {
    // Method to reverse the array
    public static void Reverse(int number[]) {
        // Initialize two pointers: one at the start, one at the end
        int first = 0, last = number.length - 1;

        // Continue swapping until the pointers meet
        while (first < last) {
            // Swap the elements at 'first' and 'last'
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            // Move the pointers towards the center
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        // Declare and initialize an array
        int number[] = {2, 4, 6, 8, 10, 12};

        // Call the reverse method to reverse the array
        Reverse(number);

        // Print the reversed array
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " "); // printing each element
        }
    }
}
