class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int dig=0;
            while(num>0){
                dig+=num%10;
                num/=10;
            }
            if(dig==i){
                return i;
            }
        }
        return -1;
    }
}