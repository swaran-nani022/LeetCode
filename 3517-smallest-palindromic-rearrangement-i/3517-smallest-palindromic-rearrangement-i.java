class Solution {
    public String smallestPalindrome(String s) {
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']+=1;
        }
        StringBuilder sb=new StringBuilder();
        String mid="";
        for(int i=0;i<count.length;i++){
            char c=(char)('a'+i);
            sb.append(String.valueOf(c).repeat(count[i]/2));
            if(count[i]%2==1){
                mid=c+"";
            }
        }


        return sb.toString()+mid+sb.reverse().toString();
    }
}