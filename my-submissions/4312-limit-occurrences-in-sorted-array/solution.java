class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> aa=new ArrayList<>();
        int count=0;
        int curr=0;
        for(int x:nums){
           if(x!=curr){
               curr=x;
               count=0;
           }
            if(count<k){
                aa.add(x);
                count++;
            }
        }
        int[] arr=new int[aa.size()];
        for(int x=0;x<aa.size();x++){
            arr[x]=aa.get(x);
        }
        Arrays.sort(arr);
        return arr;
    }
}
