class Solution {
    public boolean uniformArray(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 1) {
                return true;
            }
        }
        return true;
    }
}