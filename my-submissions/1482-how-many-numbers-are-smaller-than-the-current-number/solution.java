class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int pref[]=new int[101];
        for(int i=0;i<nums.length;i++){
            pref[nums[i]]++;
        }
        for(int i=1;i<101;i++){
         pref[i]+=pref[i-1];
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
            res[i]=pref[nums[i]-1];
            }
        }
        return res;
    }
}
