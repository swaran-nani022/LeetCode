class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++){
            int cw=0;
            for(int j=0;j<accounts[i].length;j++){
                cw+=accounts[i][j];
            }
            maxwealth=Math.max(maxwealth,cw);
        }
        return maxwealth;
    }
}
