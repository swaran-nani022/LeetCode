class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int len=s.length();
        if(s.charAt(len-1)=='1'){return false;}

        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        int max=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==len-1){return true;}
            int start=Math.max(curr+minJump,max+1);
            int end=Math.min(curr+maxJump,len-1);
            for(int j=start;j<=end;j++){
                if(s.charAt(j)=='0'){q.offer(j);}
            }
            max=Math.max(max,end);
        }
        return false;
    }
}
