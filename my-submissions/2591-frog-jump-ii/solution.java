class Solution {
    public int maxJump(int[] stones) {
        if(stones.length==2){ return stones[1];}
        int diff=0;
        for(int i=0;i<stones.length-2;i++){
            int c=stones[i+2]-stones[i];
            if(c>diff){diff=c;}
            // diff=Math.max(diff,c);
        }
        return diff;
    }
}
