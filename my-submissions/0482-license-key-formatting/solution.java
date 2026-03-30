class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String s2=s.replace("-","").toUpperCase();
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=s2.length()-1;i>=0;i--){
            if(c>0 && c%k==0){
                sb.append('-');
                c=0;
            }
            sb.append(s2.charAt(i));
            c++;
        }
        return sb.reverse().toString();
    }
}
