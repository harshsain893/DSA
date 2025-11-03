package Strings;

public class pallindrome {

    // Method to check if a given string is a palindrome
    public static boolean pallindrome(String str) {
        // Loop runs only till the middle of the string
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length(); // Get the total length of the string

            // Compare the i-th character from start and i-th from end
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // If any characters don't match, it's not a palindrome
                return false;
            }
        }
        // If all characters match, return true (it is a palindrome)
        return true;
    }

    // Main method - program execution starts here
    public static void main(String args[]) {
        String str = "racecar"; // Input string to check
        // Print whether the string is palindrome or not
        System.out.println(pallindrome(str));
    }
}
