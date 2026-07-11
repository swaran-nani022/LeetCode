class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int[] elar=new int[101];
        for(int i:nums){
            elar[i]++;
        }
        int n=nums.length/2;
        int num=nums[n];
        return elar[num]==1?true:false;
    }
}
