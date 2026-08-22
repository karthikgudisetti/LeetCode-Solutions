class Solution {
    public int nsum(int[] nums,int goal){
        int sum = 0;
        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 0;
        if(goal<0){
            return 0;
        }
        while (j < n) {
        sum+=nums[j];
        while(sum>goal){
            sum-=nums[i];
            i++;
        }
        count+=j-i+1;
            j++;

        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return nsum(nums,goal)-nsum(nums,goal-1);

    }
}