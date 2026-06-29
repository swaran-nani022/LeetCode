class Solution {
    public int alternatingSum(int[] nums) {
        int ts=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ts+=nums[i];
            }
            else{
                ts-=nums[i];
            }
        }
        return ts;
    }
}
