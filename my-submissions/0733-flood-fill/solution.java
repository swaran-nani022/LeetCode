class Solution {
    int n=0;
    int m=0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n=image.length;
        m=image[0].length;
        int org=image[sr][sc];
        if(org!=color) dfs(image,sr,sc,color,org);
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int color,int org){
        if(sr<0 || sr>=n || sc<0 ||sc>=m)return ;
        if(image[sr][sc]!=org)return;
        image[sr][sc]=color;
        dfs(image,sr,sc-1,color,org);
        dfs(image,sr+1,sc,color,org);
        dfs(image,sr,sc+1,color,org);
        dfs(image,sr-1,sc,color,org);
    }
}
