class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length,dub=0,totalsum=0,total=(n*(n+1))/2;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(nums[i])) dub=nums[i];
            else hs.add(nums[i]);
            totalsum+=nums[i];
        }
        return new int[] {dub,total-(totalsum-dub)};
    }
}
