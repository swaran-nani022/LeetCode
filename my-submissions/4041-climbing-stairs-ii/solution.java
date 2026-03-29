class Solution {
    public int climbStairs(int n, int[] costs) {
        if(n==0)return 0;
        int dp0=0;
        int dp1=dp0+costs[0]+1;
        if(n==1)return dp1;
        int dp2=Math.min(dp1+costs[1]+1,dp0+costs[1]+4);
        if(n==2) return dp2;
        int dpi=0;
        for(int i=3;i<=n;i++){
            int cst=costs[i-1];
            dpi=Math.min(dp2+cst+1,Math.min(dp1+cst+4,dp0+cst+9));
            dp0=dp1;
            dp1=dp2;
            dp2=dpi;
        }
        return dp2;
    }
}
