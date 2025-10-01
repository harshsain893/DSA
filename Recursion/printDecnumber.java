public class printDecnumber {

    // Recursive function to print numbers in decreasing order
    public static void printDec(int n) {
        // Base case: when n becomes 1, stop recursion
        if (n == 1) {
            System.out.println(n);  // Print the last number (1) with a newline
            return;                 // Exit the function
        }

        // Print the current number followed by a space (without newline)
        System.out.print(n + " ");

        // Recursive call: print numbers from (n-1) down to 1
        printDec(n - 1);
    }

    public static void main(String args[]) {
        int n = 10;           // Starting number
        printDec(n);          // Call the function to print numbers from 10 down to 1
    }
}
