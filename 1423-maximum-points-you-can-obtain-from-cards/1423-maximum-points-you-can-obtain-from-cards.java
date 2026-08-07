class Solution {
    public int maxScore(int[] cardpoints, int k) {
        int lsum=0,rsum=0,tsum=0;
        

        for(int i=0;i<k;i++){ 
            lsum+=cardpoints[i];
        }
        tsum=lsum;
        int right=cardpoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardpoints[i];
            rsum=rsum+cardpoints[right];
            right--;
            tsum=Math.max(tsum,lsum+rsum);
        }
        
        return tsum;
        
    }
}