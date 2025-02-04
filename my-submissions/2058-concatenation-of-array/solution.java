class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int[] arr=new int[2*l];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[l+i]=nums[i];
        }
        return arr;
    }
}
