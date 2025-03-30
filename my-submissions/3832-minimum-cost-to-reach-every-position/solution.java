class Solution {
    public int[] minCosts(int[] cost) {
      int n=cost.length;
        int a[]=new int[n];
        int num=cost[0];
        for(int i=0;i<n;i++)
            {
               if(i==0){ a[0]=cost[0]; }
                else if(num==cost[i]||num>cost[i]) {
                    a[i]=cost[i];
                    num=cost[i];
                }
                else { a[i]=num; }
            }
        return a;
    }
}
