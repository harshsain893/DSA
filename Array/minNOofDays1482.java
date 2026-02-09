class Solution {

    // check if possible to make m bouquets by 'day'
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                flowers++;
            } else {
                flowers = 0;
            }

            if (flowers == k) {
                bouquets++;
                flowers = 0;
            }

            if (bouquets >= m) {
                return true;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        // impossible case
        if ((long)m * k > bloomDay.length) {
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        // find search range
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        int left = minDay;
        int right = maxDay;
        int ans = -1;

        // binary search on days
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;        // possible answer
                right = mid - 1;  // try smaller day
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}