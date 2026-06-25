class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1 || k==0)return s;
        char[] ca=s.toCharArray();
        int i=0;
        k=k-1;
        while(i<=k){
            char c=ca[i];
            ca[i]=ca[k];
            ca[k]=c;
            i++;
            k--;
        }
        return new String(ca);
    }
}
