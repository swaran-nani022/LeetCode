class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        while(i<nums.length ){
            if(nums[i]!=target)i++;
            else break;
        }
        if(i==nums.length) return new int[]{-1,-1};
        int j=i;
        while(j<nums.length){
            if(nums[j]==target)j++;
            else break;
        }
        return new int[]{i,j-1};
    }
}
