class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=t.indexOf(ch);
            ans+=Math.abs(idx-i);
        }
        return ans;
    }
}
