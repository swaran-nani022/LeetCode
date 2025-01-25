class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int total=0;
        for(int i=0;i<n;i++)
        {
            int maxdel=0;
            for(int j=0;j<m;j++)
            {
                int mir=0;
                int mi=0;
                for(int k=0;k<grid[j].length;k++)
                {
                    if(grid[j][k]>mir)
                    {
                        mir=grid[j][k];
                        mi=k;
                    }
                }
                grid[j][mi]=0;
                maxdel=Math.max(maxdel,mir);
            }
            total+=maxdel;
        }
        return total;
    }
}
