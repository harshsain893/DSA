package Array;

public class kokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        // Step 1: Find the biggest pile (max value)
        int low = 1;
        int high = piles[0];
        for (int i = 1; i < n; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }

        int answer = high;

        // Step 2: Binary Search to find the minimum speed
        while (low <= high) {
            int mid = low + (high - low) / 2; // Try middle speed

            if (canEatAll(piles, n, h, mid)) {
                answer = mid;    // store as possible answer
                high = mid - 1;  // try slower
            } else {
                low = mid + 1;   // try faster
            }
        }

        return answer; // final answer (minimum speed)
    }

    // Step 3: Function to check if Koko can eat all at speed 'k'
    private boolean canEatAll(int[] piles, int n, int h, int k) {
        int totalHours = 0;

        for (int i = 0; i < n; i++) {
            // ceil division without Math.ceil
            totalHours += (piles[i] + k - 1) / k;
        }

        return totalHours <= h;
    }
}

