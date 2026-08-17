class Solution {
    public int singleNonDuplicate(int[] nums) {

        int left = 1;
        int right = nums.length - 2;

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        while (left <= right) {

            int mid = (right+left) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                left = mid + 1;
            }

            else {
                right = mid-1;
            }
        }

        return -1;
        // int n=arr.length-1;
        // for(int i=0;i<=n;i++){
        //     if(i==0){
        //         if(arr[i]!=arr[i+1]){
        //             return arr[i];
        //         }
        //     }
        //     else if(i==n){
        //         if(arr[i]!=arr[i-1]){
        //             return arr[n];
        //         }
        //     }
        //     else{
        //         if(arr[i] != arr[i-1] && arr[i]!=arr[i+1]){
        //             return arr[i];
        //         }
        //     }

        // }
        // return -1;

    }
}