class Solution {
    public int findGCD(int[] nums) {
       int small=Integer.MAX_VALUE;
       int big= Integer.MIN_VALUE;
       for(int i:nums){
        small=Math.min(small,i);
        big=Math.max(big,i);
       }
       return func(small,big);
    }
    public int func(int small,int big){
        if(big==0)return small;
        return func(big,small%big);
    }
}
