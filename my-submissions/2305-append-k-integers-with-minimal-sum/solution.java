class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        long sum=0;
        for(int i : nums){
            if(!set.contains(i) && i<=k){
                sum+=i;
                k++;
            }
            set.add(i);
        }

        return (long)(k+1)*k/2 - sum;
    }
}
