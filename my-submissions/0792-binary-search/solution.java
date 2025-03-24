class Solution {
    public int search(int[] nums, int target) {
        boolean b=false;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                r=i;
                b=true;
            }
        }
        if(b){
            return r;
        }
        return -1;
    }
}
