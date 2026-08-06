class Solution {
    public int smallestNumber(int n, int t) {
      
        int ans=Integer.MAX_VALUE;
        for(int i=n;i<=100;i++){
            int m=i;
              int product=1;
        while(m!=0){
            int rem=m%10;
            product=product*rem;
            m/=10;
        }
        if(product%t==0){
            ans=Math.min(ans,i);
        }
        }

        return ans;
    }
}