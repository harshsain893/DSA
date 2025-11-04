package Strings;

public class reverseOnlyLetters {

    // Method to reverse only the letters in a given string
    public String reverseOnlyLetters(String s) {
        // Convert the input string to a character array so we can modify it
        char[] arr = s.toCharArray();

        // Initialize two pointers: one from the start and one from the end
        int left = 0, right = arr.length - 1;

        // Loop until the two pointers meet
        while (left < right) {

            // If the left character is not a letter, move the left pointer forward
            if (!Character.isLetter(arr[left])) {
                left++;
            }

            // If the right character is not a letter, move the right pointer backward
            else if (!Character.isLetter(arr[right])) {
                right--;
            }

            // If both characters are letters, swap them
            else {
                char temp = arr[left];   // Store left character temporarily
                arr[left] = arr[right];  // Replace left with right
                arr[right] = temp;       // Replace right with the stored left
                left++;                  // Move left pointer forward
                right--;                 // Move right pointer backward
            }
        }

        // Convert the modified character array back to a string and return it
        return new String(arr);
    }
}
