class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] b=new int[26];
        for(char c:ransomNote.toCharArray()){
            int i=magazine.indexOf(c,b[c-'a']);
            if(i==-1)return false;
        b[c-'a']=i+1;
        }
    return true;
    }
}
