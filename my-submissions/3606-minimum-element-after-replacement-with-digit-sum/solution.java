class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n!=0){
                int tem=n%10;
                sum+=tem;
                n/=10;
            }
            nums[i]=sum;
            min=Math.min(min,nums[i]);
            System.out.print(nums[i]+" ");
        }
    return min;
    }
}
