class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i-2]%2!=0 && arr[i-1]%2 !=0 && arr[i]%2!=0){
                return true;
            }
            
        }
        return false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2!=0){
        //         count++;
        //     }
        //     else{
        //         count=Math.max(count,count--);
        //     }
        // }
        // if(count>=3){
        //     return true;
        // }
        // return false;
        
        
    }
}