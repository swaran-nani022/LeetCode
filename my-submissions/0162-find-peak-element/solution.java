class Solution {
    public int findPeakElement(int[] nums) {
        int f=0;
        int l=nums.length-1;
        while(f<l){
            int m=(f+l)/2;
            if(nums[m]>nums[m+1])l=m;
            else f=m+1;
            }
            return l;
        }
    }
