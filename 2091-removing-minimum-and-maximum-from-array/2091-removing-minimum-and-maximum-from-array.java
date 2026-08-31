class Solution {
    public int minimumDeletions(int[] arr) {
        int mini=arr[0];
        int maxi=arr[0];
        int n=arr.length;
        int mi=0;
        int ma=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                ma=i;
            }
            if(arr[i]<mini){
                mini=arr[i];
                mi=i;
            }
        }
              int left = Math.min(mi,ma);
        int right = Math.max(mi, ma);

       
        int fromLeft = right + 1;

    
        int fromRight = n - left;

        
        int fromBothSides = (left + 1) + (n - right);

        return Math.min(fromLeft, Math.min(fromRight, fromBothSides));

        }
        
    
}