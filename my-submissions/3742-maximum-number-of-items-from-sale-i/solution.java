class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int valmorendi=items.length/2;
        int n=items.length;
        int[] dp=new int[budget+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=0;i<n;i++){
            int p=items[i][1],g=0;
            for(int j=0;j<n;j++){
                if(i!=j&&items[i][0]!=0 && items[j][0]%items[i][0]==0)g++;
            }
            int[] ndp=dp.clone();
            for(int b=budget;b>=p;b--){
                if(dp[b-p]!=-1)ndp[b]=Math.max(ndp[b],dp[b-p]+1+g);
            }
            dp=ndp;
            for(int b=p;b<=budget;b++){
                if(dp[b-p]!=-1)dp[b]=Math.max(dp[b],dp[b-p]+1);
            }
        }
        int max=0;
        for(int b=0;b<=budget;b++)max=Math.max(max,dp[b]);
        return max;
    }
}
