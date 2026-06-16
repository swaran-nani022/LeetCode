class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){sb.append(c);}
            else if(c=='*'){if(sb.length()>0){
                sb.setLength(sb.length()-1);
            }}
            else if(c=='#'){
                sb.append(sb.toString());
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
