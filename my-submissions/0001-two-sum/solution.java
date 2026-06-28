class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int want=target-nums[i];
            if(hm.containsKey(want)){
                return new int[]{hm.get(want),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
