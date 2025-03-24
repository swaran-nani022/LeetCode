class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int total=n*(n+1)/2;
        int s=0;
        for(int i=0;i<nums.length;i++){
           s+=nums[i];
        }
        return total-s;
    }
}
