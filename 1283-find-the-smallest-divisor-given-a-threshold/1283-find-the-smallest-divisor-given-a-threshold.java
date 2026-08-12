class Solution {
    public static boolean isvalid(int[] arr,int mid,int h){
        int count=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]%mid==0){
                count+=arr[i]/mid;
             }
             else{
                count+=(arr[i]/mid)+1;
             }
        }
        return count<=h;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int n:nums){
            high=Math.max(high,n);
        }
        while(low<high)
        {
            int mid=(low+high)/2;
            if(isvalid(nums,mid,threshold))
            {
                high=mid;           
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
}