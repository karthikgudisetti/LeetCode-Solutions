class Solution {
    public int smallestIndex(int[] arr) {
        int n=arr.length;
        int count=0;
        
        for(int i=0;i<n;i++){
        int sum=0;
            int num=arr[i];
             if(num==0){
                count=1;
                sum=0;
             }
             else{
                num=Math.abs(num);
                while(num>0){
                    int rem=num%10;
                    num=num/10;
                    count++;
                    
                    sum+=rem;
                }
             }
            if(sum==i){
                return i;
            }
            
        }
         return -1;
        
    }
}