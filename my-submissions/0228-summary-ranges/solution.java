class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        int n=nums.length;
        List<String> res=new ArrayList<>();
        while(i<n){
            int start=nums[i];
            int j=i;
            while(j+1<n && nums[j+1]==nums[j]+1){
                j++;
            }
            if(nums[j]==start){
                res.add(start+"");
            }else{
                res.add(start+"->"+nums[j]);
            }
            i=j+1;
        }
        return res;
    }
}
