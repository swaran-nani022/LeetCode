class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        int ll=n;
        for(int mask=0;mask<(1<<n);mask++){
            char[] s=new char[n];
            int cost=0;
            boolean valid=true;
                for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){
                    s[i]='1';
                    
                    cost+=i;
                    if(i>0 && s[i-1] == '1'){
                        valid = false;
                        break;
                    }
                }else{
                    s[i] ='0';
                }
                }
            if(valid&&cost<=k){
                ans.add(new String(s));
            }
        }
        return ans;
    }
}
