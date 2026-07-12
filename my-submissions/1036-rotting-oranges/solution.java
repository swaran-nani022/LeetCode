class Solution {
    int n=0;
    int m=0;
    public int orangesRotting(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        if(grid.length==0)return -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)dfs(grid,i,j,2);
            }
        }
        int min=2;
        for(int[] row:grid){
            for(int cells:row){
                if(cells==1)return -1;
                min=Math.max(min,cells);
            }
        }
        return min-2;
    }
    public void dfs(int[][] grid,int i,int j,int min){
        // boolean b=(1 < grid[i][j] && grid[i][j] < min);
        if(i<0 ||i>=n || j<0 || j>=m || grid[i][j]==0 || (1<grid[i][j] && grid[i][j]<min))return;
            grid[i][j]=min;
            dfs(grid,i+1,j,min+1);
            dfs(grid,i,j+1,min+1);
            dfs(grid,i-1,j,min+1);
            dfs(grid,i,j-1,min+1);
    }
}
