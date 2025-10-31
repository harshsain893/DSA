package Strings;

public class largestString {
    public static void main(String[] args) {
        // Create an array of fruit names
        String fruits[] = {"banana", "mango", "apple"};

        // Assume the first fruit is the largest initially
        String largest = fruits[0];

        // Loop through the rest of the array to find the largest (lexicographically)
        for (int i = 1; i < fruits.length; i++) {

            // compareTo() compares strings based on dictionary order (lexicographical order)
            // If the result is less than 0, it means 'largest' comes before fruits[i]
            if (largest.compareTo(fruits[i]) < 0) {
                // Update largest if current fruit is greater (comes later in dictionary)
                largest = fruits[i];
            }
        }

        // Print the largest string (alphabetically last word)
        System.out.println(largest);
    }
}
