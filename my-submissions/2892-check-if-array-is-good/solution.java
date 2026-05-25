class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=i+1){return false;}
        }
        return  nums.length-1 == nums[nums.length-1];
    }
}
