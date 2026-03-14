class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)pq.add(i);
        int ans=0;
        while(!pq.isEmpty()){
            int x=!pq.isEmpty()?pq.poll():0;
            int y=!pq.isEmpty()?pq.poll():0;
            if(x!=0&&y!=0){
                int v=Math.abs(x-y);
                if(v!=0)
                 pq.add(v);
               
            }else
             ans=x+y;
        }
        return ans;
    }
}
