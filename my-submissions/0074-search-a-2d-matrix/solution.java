class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int mm=matrix[0].length;
        int l=0;
        int r=mm*n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int mv=matrix[m/mm][m%mm];
            if(mv==target)return true;
            if(mv<target){l=m+1;}
            else{r=m-1;}
        }
        return false;
    }
}
