class Solution {
    public int[] separateDigits(int[] nums) {
       int n=nums.length;
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<n;i++){
        String str=Integer.toString(nums[i]);
        for(char cc:str.toCharArray()){
            int num=cc-'0';
            al.add(num);
        }
       } 
       int[] arr=new int[al.size()];
       for(int i=0;i<al.size();i++){
        arr[i]=al.get(i);
       }
       return arr;
    }
}
