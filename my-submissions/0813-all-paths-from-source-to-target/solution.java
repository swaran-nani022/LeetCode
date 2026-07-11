import java.util.*;
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    path.add(0);
    dfs(graph,0);
    return res;
    }
    public void dfs(int[][] graph,int node){
        if(node==graph.length-1){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int x:graph[node]){
            path.add(x);
            dfs(graph,x);
            path.remove(path.size()-1);
        }
    }
}
