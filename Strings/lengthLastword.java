package Strings;
import java.util.Scanner;
public class lengthLastword {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        // 1. Skip spaces from the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;
        // 2. Count last word letters
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();   // take full line input (with spaces)

        int result = lengthOfLastWord(s);
        System.out.println("Length of last word: " + result);
    }
}


