package Array;

import java.util.Arrays;
    class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int[][] result = new int[n][2]; // store merged intervals
        int index = 0; // points to the last merged interval

        // Step 2: Start with the first interval
        result[0] = intervals[0];

        // Step 3: Check each next interval
        for (int i = 1; i < n; i++) {
            // If overlapping (current start <= last merged end)
            if (intervals[i][0] <= result[index][1]) {
                // Merge: update the end of the last merged interval
                result[index][1] = Math.max(result[index][1], intervals[i][1]);
            } else {
                // Not overlapping → new interval
                index++;
                result[index] = intervals[i];
            }
        }

        // Step 4: Copy only merged part to final array
        return Arrays.copyOf(result, index + 1);
    }
}


