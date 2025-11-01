package Strings;

public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // If the input array is null or empty, return an empty string
        if (strs == null || strs.length == 0) return "";

        // Assume the first string is the prefix initially
        String prefix = strs[0]; // Example: "flower"

        // Loop through all strings in the array starting from index 1
        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until the current string starts with it
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) return "";
            }
        }

        // Return the longest common prefix found
        return prefix;
    }
}
