class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int c=0;
        int p=0;
        for(int num:nums){
            p+=num;
            if(hm.containsKey(p-k)){
                c+=hm.get(p-k);
            }
            hm.put(p,hm.getOrDefault(p,0)+1);
        }
        return c;
    }
}
