class Solution {
    public int minimumSwaps(int[] nums) {
        int f=0;
        int l=nums.length-1;
        int s=0;
        while(f<l){
            if(nums[f]!=0){f++;}
            else if(nums[l]==0){l--;}
            else{
                int t=nums[l];
                nums[l]=nums[f];
                nums[f]=t;
                s++;
            }
    }
        return s;
}
}
