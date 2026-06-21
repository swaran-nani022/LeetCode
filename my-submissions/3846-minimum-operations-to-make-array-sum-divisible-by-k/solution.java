class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int c:nums){
            sum+=c;
        }
        return sum%k;
    }
}
