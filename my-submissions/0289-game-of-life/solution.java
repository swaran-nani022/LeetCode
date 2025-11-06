class Solution {
    public void gameOfLife(int[][] board) {
      int m=board.length;
      int n=board[0].length;
      int[][] copy=new int[m][n];
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            copy[i][j]=board[i][j];
        }
      }
      int[] dirs={-1,0,1};
      for(int r=0;r<m;r++){
        for(int c=0;c<n;c++){
            int live=0;
            for(int i:dirs){
                for(int j:dirs){
                    if(i==0 && j==0) continue;
                    int nr=r+i,nc=c+j;
                    if(nr>=0 && nr<m && nc>=0 && nc<n && copy[nr][nc]==1) live++;
                }
            }
            if(copy[r][c]==1 && (live<2 || live >3))
                board[r][c]=0;
            else if(copy[r][c]==0 && live ==3)
                board[r][c]=1;
        }
      }  
    }
}
