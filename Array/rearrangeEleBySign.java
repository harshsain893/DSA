public class rearrangeEleBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        // int[] positive = new int[n];
        // int[] negative = new int[n];
        // int posIndex = 0, negIndex = 0;

        // // Step 1: separate positive and negative numbers
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > 0)
        //         positive[posIndex++] = nums[i];
        //     else
        //         negative[negIndex++] = nums[i];
        // }

        // // Step 2: merge them alternately
        // int[] ans = new int[n];
        // int index = 0, p = 0, q = 0;
        // while (p < posIndex && q < negIndex) {
        //     ans[index++] = positive[p++];
        //     ans[index++] = negative[q++];
        // }

        // return ans;

        int[] ans = new int[n];
        int pos = 0; // index for positive numbers (even indices)
        int neg = 1; // index for negative numbers (odd indices)

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2; // jump to next even position
            } else {
                ans[neg] = nums[i];
                neg += 2; // jump to next odd position
            }
        }
        return ans;
    }
}
    



