class Solution {
    public int mirrorDistance(int n) {
        int v=n;
        int v2=0;
        while(n>0){
            int temp=n%10;
            v2=v2*10+temp;
            n/=10;
        }
        return Math.abs(v-v2);
    }
}
