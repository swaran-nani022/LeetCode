class Solution {
    public static long maxSum(int[] nums, int k, int mul) {
        long totalsum=0;
        Arrays.sort(nums);
        int i=nums.length-1;
        while(k!=0){
            if(mul>0){
            totalsum+=(long)nums[i]*mul;
            }
            else{
                totalsum+=(long)nums[i];
            }
            mul--;
            i--;
            k--;
        }
        return totalsum;
    }
}
