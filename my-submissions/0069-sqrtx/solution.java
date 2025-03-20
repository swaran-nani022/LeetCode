class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        int res=0;
        while(l<=h){
            int m=l+(h-l)/2;
            long c=(long)m*m;
            if(c<=x){
                res=m;
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return res;
    }
    }

