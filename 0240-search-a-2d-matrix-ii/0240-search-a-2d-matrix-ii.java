class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    //   for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(matrix[i][j]==target){
    //             return true;
    //         }
    //     }
    //   }
    int i=0;int j=matrix[0].length-1;
    int n=matrix.length;
    while(i<n&&j>=0){
        if(matrix[i][j]>target){
            j--;
        }
        else if(matrix[i][j]<target){
            i++;
        }
        else if(matrix[i][j]==target){
            return true;
        }
    }
        return false;
    }
}