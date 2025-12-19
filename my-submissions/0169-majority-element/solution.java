class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int cand=0;
        for(int x:nums){
            if(c==0)cand=x;
            if(x==cand)c++;
            else c--;
        }
        return cand;
    }
}
