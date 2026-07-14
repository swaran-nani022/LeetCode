class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int c=1;
        while(sb.length()<b.length()){
            sb.append(a);
            c++;
        }
        String text=sb.toString();
        String extext=text+a;
        int match=rabin(extext,b);
        if(match==-1)return -1;
        if(match+b.length()<=text.length())return c;
        return c+1;
    }
    private int rabin(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        if(m>n)return -1;
        long p=101;
        long mod=1000000009;
        long ph=0;
        long th=0;
        long mp=1;
        for(int i=0;i<m-1;i++){
            mp=(mp*p)%mod;
        }
        for(int i=0;i<m;i++){
            ph=(ph*p+pattern.charAt(i))%mod;
            th=(th*p+text.charAt(i))%mod;
        }
        for(int i=0;i<=n-m;i++){
            if(ph==th){
                if(text.substring(i,i+m).equals(pattern)){
                    return i;
                }
            }
            if(i<n-m){
                th=(th-text.charAt(i)*mp)%mod;
                th=(th*p+text.charAt(i+m))%mod;
                if(th<0){
                    th+=mod;
                }
            }
        }
        return -1;
    }
}
