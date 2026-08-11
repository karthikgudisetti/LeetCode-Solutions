class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //   for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(matrix[i][j]==target){
    //             return true;
    //         }
    //     }
    //   }
    
    int m=matrix[0].length;
    int n=matrix.length;
    int i=0;
    int j=n*m-1;

    while(i<=j){
        int mid=i+(j-i)/2;
        int row=mid/m;
        int col=mid%m;
        if(matrix[row][col]==target){
            return true;
        }
        else if(matrix[row][col]>target){
            j=mid-1;
        }
        else{
            i=mid+1;
        }
       
    }
        return false;
    }
}