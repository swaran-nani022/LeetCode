class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(String w:word1){
            s1.append(w);
        }
        for(String ww:word2){
            s2.append(ww);
        }
        return s1.toString().equals(s2.toString());
    }
}
