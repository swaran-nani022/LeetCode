class Solution {
    public int digitFrequencyScore(int n) {
        String str=Integer.toString(n);
        int res=0;
        for(char cc:str.toCharArray()){
            int num=cc-'0';
            res+=num;
        }
        return res;
    }
}
