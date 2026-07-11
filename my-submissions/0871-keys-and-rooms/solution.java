class Solution {
    // int c=1;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] b=new boolean[n];
        dfs(0,rooms,b);
        for(boolean x:b)if (x==false) return false;
        return true;
    }
    public void dfs(int start,List<List<Integer>> rooms,boolean[] b){
        b[start]=true;
        for(int x:rooms.get(start)){
            if(!b[x]) dfs(x,rooms,b);
        }
    }
}
