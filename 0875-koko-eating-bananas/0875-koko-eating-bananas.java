class Solution {
    static boolean isvalid(int[] arr,int mid,int h){
        int ch=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%mid==0){
                ch+=arr[i]/mid;
            }
            else{
                ch+=(arr[i]/mid)+1;
            }

        }
        return ch<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans=0;
        int low=1;
        int high=0;
        for(int pile:piles){
           high=Math.max(high,pile);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(isvalid(piles,mid,h)){
               
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;

        
    }
}