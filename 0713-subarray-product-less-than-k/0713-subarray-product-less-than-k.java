class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int l=0;
        int p=1;
        int count=0;
         if (k <= 1) return 0;
        for(int r=0;r<arr.length;r++){
            p*=arr[r];
            while(p>=k){
                p/=arr[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
        
    }
}