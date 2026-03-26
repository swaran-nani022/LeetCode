class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        int off=1;
        dp[0]=0;
        for(int i=1;i<=n;i++){
            if(off*2==i){
                off=i;
            }
            dp[i]=1+dp[i-off];
        }
        return dp;
    }
}
