class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!st.isEmpty())
                str+=s.charAt(i);
                st.push(s.charAt(i));
            }
            else{
                st.pop();
                if(!st.isEmpty())
                str+=s.charAt(i);
            }
        }
        return str;
    }
}
