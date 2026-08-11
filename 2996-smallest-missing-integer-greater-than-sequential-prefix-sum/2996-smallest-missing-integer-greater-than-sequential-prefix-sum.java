class Solution {
    public int missingInteger(int[] nums) {
int sum=nums[0];
int count=0;
      int ans=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
           sum+=nums[i];
            }else{
                break;
            }
           
        }
         int sum1=sum;
      while(true){
       
        boolean is=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==sum1){
                is=true;
                break;
            }
        }
        if(!is){
            return sum1;
        }
        sum1++;
      }
        
    }
}