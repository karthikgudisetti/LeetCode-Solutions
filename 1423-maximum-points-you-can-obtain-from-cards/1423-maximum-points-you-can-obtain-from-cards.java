class Solution {
    public int maxScore(int[] cardpoints, int k) {
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardpoints[i];
        }
        int total=leftsum;
        int rightsum=0;
        int right=cardpoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardpoints[i];
            rightsum+=cardpoints[right];
            right--;
            
            total=Math.max(total,leftsum+rightsum);
        }
        return total;

        
    }
}