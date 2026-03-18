class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums1.length==0 || nums2.length ==0 || k==0){
            return res;
        }
         PriorityQueue<int[]> mh = new PriorityQueue<>((a,b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
                );
        for(int i=0;i<Math.min(nums1.length,k);i++)
            mh.offer(new int[]{i,0});
            
        while(k-->0 &&!mh.isEmpty()){
            int[] cur=mh.poll();
            int i=cur[0];
            int j=cur[1];
            res.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1<nums2.length){
                mh.offer(new int[]{i,j+1});
            }
        }
        return res;
    }
}
