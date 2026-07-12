class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a2=arr.clone();
        Arrays.sort(a2);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int i=0;i<a2.length;i++){
            if(!hm.containsKey(a2[i])){
                hm.put(a2[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}
