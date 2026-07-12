class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String[] str=s.split(" ");
        for(String i:str){
            sb.append(i);
            k--;
            if(k==0)break;
            sb.append(" ");
        }
        return sb.toString();
    }
}
