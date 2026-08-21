class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] minPrefix = new long[k];

        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        minPrefix[0] = 0;

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int i = 1; i <= nums.length; i++) {
            prefix += nums[i - 1];

            int rem = i % k;

            if (minPrefix[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix - minPrefix[rem]);
            }

            minPrefix[rem] = Math.min(minPrefix[rem], prefix);
        }

        return ans;
    }
}