class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        // int m=n+n;
        int[] arr=new int[n+n];
        for(int i=0;i<n;i++)arr[i]=nums[i];
        for(int i=n;i<n+n;i++)arr[i]=nums[i-n];
        return arr;
    }
}
