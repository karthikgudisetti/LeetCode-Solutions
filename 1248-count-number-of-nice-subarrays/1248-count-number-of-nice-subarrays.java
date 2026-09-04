class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        int odd=0;
        int i=0;
        int j=0;
        int n=nums.length;
        int count=0;
        while(i<n){
            if(nums[i]%2==1){
                odd++;
            }
            while(odd>k){
                if(nums[j]%2==1){
                    odd--;
                }
                j++;
            }
            count+=i-j+1;
            i++;
        }

        return count;
    }
}