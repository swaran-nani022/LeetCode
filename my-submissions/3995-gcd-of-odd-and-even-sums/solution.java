class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=gcd(n*n,n*(n+1));
        return a;
    }
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
