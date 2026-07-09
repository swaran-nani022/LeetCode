class Solution {
    public int balancedStringSplit(String s) {
        int rc=0;
        int lc=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='R')rc++;
            else rc--;
            if(rc==0)lc++;
            i++;
        }
        return lc;
    }
}
