class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(color[i]==0 && !valid(graph,color,i,1))return false;
        }
        return true;
    }
    public boolean valid(int[][] g,int[] col,int i,int c){
        if(col[i]!=0)return col[i]==c;
        col[i]=c;
        for(int x:g[i]){
            if(!valid(g,col,x,-c))return false;
        }
        return true;
    }
}
