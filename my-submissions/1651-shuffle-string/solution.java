class Solution {
    public String restoreString(String s, int[] indices) {
        char[] shuf=new char[s.length()];
        for(int i=0;i<s.length();i++){
            shuf[indices[i]]=s.charAt(i);
        }
        return new String(shuf);
    }
}
