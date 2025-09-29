class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        res[0]=findfirst(nums,target);
        res[1]=findlast(nums,target);
        return res;
    }
    public static int findfirst(int[] nums,int  target){
        int ind=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                r=m-1;
            }else{
                l=m+1;
            }
            if(nums[m]==target)ind=m;
        }
        return ind;
    }
    public static int findlast(int[] nums,int target){
        int ind=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<=target){
                l=m+1;
            }else{
                r=m-1;
            }
            if(nums[m]==target)ind=m;
        }
        return ind;
    }
}
