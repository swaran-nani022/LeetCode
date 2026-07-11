class Solution {
    public int findCenter(int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=edges.length+1;i++)graph.add(new ArrayList<>());
        for(int[] edge:edges){
            int a=edge[0];
            int b=edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans=0;
        int max=0;
        for(int i=0;i<graph.size();i++){
            int si=graph.get(i).size();
            if(si>max){
                max=si;
                ans=i;
            }
        }
        return ans;
    }
}
