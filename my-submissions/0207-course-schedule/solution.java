class Solution {
    public boolean canFinish(int n, int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
        }
        for(int[] x:graph){
            adj.get(x[1]).add(x[0]);
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            if(!dfs(adj,b,i))return false;
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj,int[] b,int i){
        if(b[i]==1){return false;}
        if(b[i]==2){return true;}
        b[i]=1;
        for (int nei: adj.get(i)) {
            if (!dfs(adj,b,nei)) {
                return false;
            }
        }
        b[i] = 2;
        return true;
    }
}
