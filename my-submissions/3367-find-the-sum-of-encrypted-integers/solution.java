class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans=0;
        for(int x:nums){
            int max=Integer.MIN_VALUE;
            int len=0;
            while(x>0){
                int num=x%10;
                max=Math.max(max,num);
                x=x/10;
                len++;
            }
            int enc=0;
            for(int i=0;i<len;i++){
                enc=enc*10+max;
            }
            ans+=enc;
        }
        return ans;
    }
}
