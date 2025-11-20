class Solution {
    public List<String> summaryRanges(int[] nums) {
       int i=0;
       int n=nums.length;
       List<String> list=new ArrayList<>();
       while(i<n){
         String str="";
         int temp=nums[i];
         int x=nums[i];
         while(i<n && temp==nums[i]){
            i++;
            temp+=1;

         }
         if(x==temp-1){
            list.add(x+"");
         }else{
           str+=x+"->"+(temp-1);
           list.add(str);
         }
       }
       return list;
    }
}
