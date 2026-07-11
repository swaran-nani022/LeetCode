class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxele=nums[0];
        int n=nums.length;
        int res=0;
        int j=k;
        while(j<n){
            maxele=Math.max(maxele,nums[j-k]);
            res=Math.max(res,maxele+nums[j]);
            j++;
        }
        return res;
    }
}
