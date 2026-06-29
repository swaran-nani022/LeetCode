class Solution {
    public static int maxDistinct(String s) {
        boolean[] arr=new boolean[26];
        for(char c:s.toCharArray()){
            arr[c-'a']=true;
        }
        int c=0;
        for(boolean i:arr){
            if(i==true)c++;
        }
        return c;
    }
}
