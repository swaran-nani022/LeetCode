class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        int n=nums.length;
        int[] c=new int[n];
        for(int i:nums){
            c[i]++;
        }
        for(int i=0;i<n;i++){
            if(c[i]>1){al.add(i);}
        }
        int[] ar=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ar[i]=al.get(i);
        }
        return ar;
    }
}
