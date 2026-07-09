class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] arr=new int[n];
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i]-nums[i-1])<=maxDiff){
                arr[i]=arr[i-1];
            }else{
                arr[i]=i;
            }
        }
        boolean[] b=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(arr[start]==arr[end])b[i]=true;
            else b[i]=false;
        }
        return b;
    }
}
