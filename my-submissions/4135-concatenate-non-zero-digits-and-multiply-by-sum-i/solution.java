class Solution {
    public static long sumAndMultiply(int n) {
        long sum=0;
        long num=0;
        long i=1;
        while(n>0){
            long dig=n%10;
            n=n/10;
            if(dig==0)continue;
            sum+=dig;
            num+=(dig*i);
            i*=10;
            
        }
        return num*sum;
    }
}
