package Array;

public class kokoEatingBananas {
   
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        // Step 1: Find maximum pile size
        int maxPile = 0;
        for (int i = 0; i < n; i++) {
            if (piles[i] > maxPile) {
                maxPile = piles[i];
            }
        }

        int low = 1, high = maxPile;
        int ans = maxPile;

        // Step 2: Binary search for minimum speed
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, n, h, mid)) {
                ans = mid;
                high = mid - 1; // try slower speed
            } else {
                low = mid + 1;  // need faster speed
            }
        }

        return ans;
    }

    // Step 3: Helper function to check if Koko can finish with given speed
    private boolean canFinish(int[] piles, int n, int h, int k) {
        long time = 0; // long to prevent overflow

        for (int i = 0; i < n; i++) {
            // equivalent to ceil(piles[i] / k)
            time += (piles[i] + k - 1) / k;

            // Early exit if already more than h
            if (time > h) return false;
        }

        return time <= h;
    }
}

