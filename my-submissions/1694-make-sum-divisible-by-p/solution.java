class Solution {
    public int minSubarray(int[] nums, int p) {
        long total=0;
        for(int i:nums)total+=i;
        int rem=(int)(total%p);
        if(rem%p==0)return 0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int pre=0;
        int m=nums.length;
        for(int i=0;i<nums.length;i++){
            pre=(pre+nums[i])%p;
            int cur=pre;
            int need=(cur-rem+p)%p;
            if(hm.containsKey(need)){
                int len=i-hm.get(need);
                m=Math.min(m,len);
            }
            hm.put(cur,i);
        }
        return m==nums.length?-1:m;
    }
}
