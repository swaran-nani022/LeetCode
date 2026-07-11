class Solution {
    public int findCircleNum(int[][] graph) {
        int n=graph.length;
        int[] vis=new int[n];
        int prov=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                prov++;
                dfs(i,graph,vis);
            }
        }
    return prov;
    }
    public void dfs(int i,int[][] graph,int[] vis){
        vis[i]=1;
        for(int j=0;j<graph.length;j++){
            if(graph[i][j]==1 && vis[j]!=1){
                dfs(j,graph,vis);
            }
        }
    }
}
