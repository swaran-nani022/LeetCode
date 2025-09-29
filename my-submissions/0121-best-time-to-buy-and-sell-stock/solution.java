class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int x:prices){
            min=Math.min(min,x);
            maxprofit=Math.max(maxprofit,x-min);
        }
    return maxprofit;
    }
}
