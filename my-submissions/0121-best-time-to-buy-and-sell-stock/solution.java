class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int pro=0;
        int cos=0;
        for(int i=1;i<prices.length;i++){
            cos=prices[i]-m;
            pro=Math.max(pro,cos);
            m=Math.min(m,prices[i]);
        }
        return pro;
    }
}
