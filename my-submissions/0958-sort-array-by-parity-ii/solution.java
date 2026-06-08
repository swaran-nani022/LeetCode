class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0,odd=1,n=nums.length;
        int[] arr=new int[n];
        for(int x:nums){
            if(x%2==0){ arr[even]=x; even+=2; }
            else{ arr[odd]=x; odd+=2; }
        }
        return arr;
    }
}
