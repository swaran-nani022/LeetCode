class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int p=1<<n;
        List<List<Integer>> ar=new ArrayList<>();
        for(int i=0;i<p;i++){
            List<Integer> sub=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    sub.add(nums[j]);
                }
            }
            ar.add(sub);
        }
        return ar;
    }
}
