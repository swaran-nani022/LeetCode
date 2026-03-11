class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int max=0;
        int cm=0;
        while(j<nums.length){
            if(nums[j]==1){
                cm++;
            }else{
                cm=0;
                i=j+1;
            }
            j++;
            max=Math.max(cm,max);
        }
        return max;
    }
}
