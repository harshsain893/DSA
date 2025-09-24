public class plusone {
    class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, done
            }
            digits[i] = 0; // carry goes to next digit
        }

        // If we reach here, all were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
}
