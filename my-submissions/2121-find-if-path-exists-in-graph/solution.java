class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList());
        }
        for(int[] edge:edges){
            arr.get(edge[0]).add(edge[1]);
            arr.get(edge[1]).add(edge[0]);
        }
        boolean[] b=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        b[source]=true;
        while(!q.isEmpty()){
            int cur=q.poll();
            if(cur==destination)return true;
            for(int nei:arr.get(cur)){
                if(!b[nei]){
                    b[nei]=true;
                    q.add(nei);
                }
            }
        }
        return false;   
    }
}
