class Solution {
    public int reverse(int x) {
        long f=0;
        while(x!=0){
            int dig=x%10;
            f+=dig;
            f=f*10;
            x=x/10;
        }
        f=f/10;
        if(f>Integer.MAX_VALUE || f<Integer.MIN_VALUE) return 0;
        if(x<0)return (int)(-1*f);
        return (int)f;
    }
}
