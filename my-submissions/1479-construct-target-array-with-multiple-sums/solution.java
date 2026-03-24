class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        long sum=0;
            for(int i:target){
                pq.add(i);
                sum+=i;
            }
            while(!pq.isEmpty()){
                int maxel=pq.poll();
                long rem=sum-maxel;
                if(maxel==1 || rem==1) return true;
                if(rem==0 || maxel<rem) return false;
                int update=(int)(maxel%rem);
                if(update==0)return false;
                maxel=update;
                pq.offer(maxel);
                sum=update+rem;
            }
            return true;
            
    }
}
