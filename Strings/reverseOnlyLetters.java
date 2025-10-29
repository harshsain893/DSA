package Strings;

public class reverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // If left is not a letter, move right
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // If right is not a letter, move left
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // If both are letters, swap them
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}

