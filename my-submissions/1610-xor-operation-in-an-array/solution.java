class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            int cs=start+2*i;
            sum^=cs;
        }
        return sum;
    }
}
