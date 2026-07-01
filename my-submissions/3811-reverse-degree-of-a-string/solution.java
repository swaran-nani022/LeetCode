class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            ans+=((26-(c[i]-'a'))*(i+1));
        }
        return ans;
    }
}
