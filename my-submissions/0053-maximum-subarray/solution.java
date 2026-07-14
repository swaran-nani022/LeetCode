class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs>ms)
            {
                ms=cs;
                start=temp;
                end=i;
            }
            if(cs<0){
                cs=0;
                temp=i+1;
            }
        }
        System.out.print(start+" "+end);
        return ms;
    }
}
