class Solution {
    public double myPow(double x, int n) {
        // convert n to long to avoid overflow
        long power = n;

        // if power is negative
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return fastPow(x, power);
    }

    private double fastPow(double x, long n) {
        // base case
        if (n == 0) return 1;

        double half = fastPow(x, n / 2);

        // if n is even
        if (n % 2 == 0) {
            return half * half;
        }
        // if n is odd
        else {
            return half * half * x;
        }
    }
}
