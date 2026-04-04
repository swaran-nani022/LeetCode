class Solution {
    public int climbStairs(int n) {
        int p=2;
        int p2=1;
        int c=0;
        if(n==1)return p2;
        if(n==2)return p;
        for(int i=3;i<=n;i++){
            c=p+p2;
            p2=p;
            p=c;
        }
        return p;
    }
}
