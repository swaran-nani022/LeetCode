class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr=new int[2];
        for(int i=0;i<k;i++){
            arr=min(nums);
            nums[arr[0]]=arr[1]*multiplier;
        }
        return nums;
    }
    public int[] min(int[] arr){
        int min=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                idx=i;
            }
        }
        return new int[]{idx,min};
    }
}
