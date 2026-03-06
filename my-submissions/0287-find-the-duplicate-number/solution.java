class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] s=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(s[nums[i]]==true){
                return nums[i];
            }else{
                s[nums[i]]=true;
            }
        }
        return -1;
    }
}
