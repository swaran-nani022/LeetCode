class Solution {
    public int strStr(String text, String pat) {
        int m=text.length();
        int n=pat.length();
        if(m<n){return -1;}
        int base=256;
        int mod=10007;
        int h=1;
        for(int i=0;i<n-1;i++){
            h=(h*base)%mod;
            }
        int wh=0;
        int ph=0;
        for(int i=0;i<n;i++){
            wh=(base*wh+text.charAt(i))%mod;
            ph=(base*ph+pat.charAt(i))%mod;
        }
        for(int i=0;i<=m-n;i++){
            if(wh==ph){
            int j=0;
            while(j<n){
                if(text.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
                j++;
            }
            if(j==n){return i;}
            }
            if(i<m-n){
            wh=(wh-text.charAt(i)*h)%mod;
            wh=(wh*base+text.charAt(i+n))%mod;
            if(wh<0){
                wh+=mod;
            }
            }
        }
        return -1;
    }
}
