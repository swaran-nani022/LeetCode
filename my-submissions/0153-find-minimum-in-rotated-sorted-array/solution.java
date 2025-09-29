class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[m+1]) return nums[m+1];
            if(nums[l]<=nums[m])l=m+1;
            else r=m;
        }
        return nums[0];
    }
}
