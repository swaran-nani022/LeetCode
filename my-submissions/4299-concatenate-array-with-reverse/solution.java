class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[nums.length*2];
        int i=0;
        int c=arr.length;
        while(i<nums.length){
            arr[i]=nums[i];
            arr[c-i-1]=nums[i];
            i++;
        }
        return arr;
    }
}
