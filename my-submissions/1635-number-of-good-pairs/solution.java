class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i=0;
        int c=0;
        while(i<nums.length){
            int j=i;
        while(j<nums.length){
            if(nums[i]==nums[j]&&i<j)c++;
            j++;
        }
        i++;
        }
        return c;
    }
}
