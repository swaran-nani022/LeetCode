class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>=(n+1)){
                nums[i]=n+1;
            }    
        }
        for(int i=0;i<n;i++){
            int x=Math.abs(nums[i]);
            if(x==n+1)continue;
            int ele=x-1;
            if(nums[ele]>0){
                nums[ele]=-nums[ele];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0)return i+1;
        }
        return n+1;
    }
}
