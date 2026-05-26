class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long[] arr=new long[n];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> ind:map.values()){
            int k=ind.size();
            if(k<=1)continue;
            long ts=0;
            for(int idx:ind)ts+=idx;
            long ls=0;
            for(int m=0;m<k;m++){
                long ci=ind.get(m);
                long rs=ts-ls-ci;
                arr[(int)ci]=(m*ci-ls)+(rs-(k-1-m)*ci);
                ls+=ci;
            }
        }
        return arr;
    }
}
