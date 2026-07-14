class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int d=0;
        for(int l=0;l<k;l++){
            d+=nums[l];
        }
        int max=d;
        for(int i=k;i<nums.length;i++){
            max+=nums[i];
            max-=nums[i-k];
            d=Math.max(d,max);
        }
        return (double)d/k;
    }
}
