package backtracking;

public class countGoodNum {
    

    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenPow = power(5, even);
        long oddPow = power(4, odd);

        return (int)((evenPow * oddPow) % MOD);
    }

    private long power(long x, long n) {
        if (n == 0) return 1;

        long half = power(x, n / 2);
        long result = (half * half) % MOD;

        if (n % 2 == 1) {
            result = (result * x) % MOD;
        }

        return result;
    }
}

