class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int c=0;
        int[] arr=new int[nums.length];
        for(int i:nums){
            if(i%2==0){arr[c]=i;c++;}
        }
        for(int i:nums){
            if(i%2!=0){arr[c]=i;c++;}
        }
        return arr;
    }
}
