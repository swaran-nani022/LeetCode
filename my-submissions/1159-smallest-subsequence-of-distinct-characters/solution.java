class Solution {
    public String smallestSubsequence(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)arr[s.charAt(i)-'a']=i;

        boolean[] b=new boolean[26];
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(b[ch-'a'])continue;
            while(st.length()>0 && st.charAt(st.length()-1)>ch && arr[st.charAt(st.length()-1)-'a']>i){
                b[st.charAt(st.length()-1)-'a']=false;
                st.deleteCharAt(st.length()-1);
            }
            st.append(ch);
            b[ch-'a']=true;
        } 
        return st.toString();
    }
}
