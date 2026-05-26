class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] up=new boolean[26];
        boolean[] lo=new boolean[26];
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                up[c-'A']=true;
            }
            else{
                lo[c-'a']=true;
            }
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(up[i] && lo[i])c++;
        }
        return c;
    }
}
