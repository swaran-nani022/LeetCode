class Solution {
    public int maxOperations(String s) {
       int on=0;
       int c=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            on++;
        }
        else if(i>0 && s.charAt(i-1)=='1')
            c+=on;
      }
      return c;
    }
}
