class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        long sum = 0;
        long max = 0;

        for (int i = 0; i < nums.length; i++) {
       
            sum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

       
            if (i >= k) {
                int outgoing = nums[i - k];

                sum -= outgoing;
                freq.put(outgoing, freq.get(outgoing) - 1);

                if (freq.get(outgoing) == 0) {
                    freq.remove(outgoing);
                }
            }

           
            if (i >= k - 1 && freq.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}