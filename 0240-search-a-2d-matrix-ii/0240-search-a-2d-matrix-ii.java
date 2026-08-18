class Solution {
    public boolean is(int[] arr,int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] arr, int target) {
      boolean ans=false;
        for(int i=0;i<arr.length;i++){
            if(is(arr[i],target)){
                ans=true;
            }

        }
        return ans;
    }
}