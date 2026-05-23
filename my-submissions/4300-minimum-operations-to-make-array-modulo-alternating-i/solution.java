class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        for(int x=0;x<k;x++){
            for(int y=0;y<k;y++){
                if(x==y){continue;}
                int cur=0;
                for(int i=0;i<nums.length;i++){
                    int r=nums[i]%k;
                    int t=(i&1)==0 ? x:y;
                    int d=r>t?r-t:t-r;
                    cur+=d<k-d?d:k-d;
                }
                    if(cur<ans){ans=cur;}
            }
        }
        return ans;
    }
}
