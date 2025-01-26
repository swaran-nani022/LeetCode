class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
        int s1=0;
        for(int i=0;i<nums.length-1;i++){
            s1+=nums[i];
            int s2=0;
            for(int j=i+1;j<nums.length;j++){
                s2+=nums[j];
            }
            if(Math.abs(s1-s2)%2==0){
                c++;
            }
        }
        return c;
    }
}
