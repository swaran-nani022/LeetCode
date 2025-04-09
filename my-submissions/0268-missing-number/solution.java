class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int l=0;
        int h=n;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]>m) h=m-1;
            else l=m+1; 
        }
        return l;
    }
}
