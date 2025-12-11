class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty())return false;
                char sec=st.pop();
                if(c==')' && sec!='(') return false;
                if(c=='}' && sec!='{') return false;
                if(c==']' && sec!='[') return false;
            }
        }
        return st.isEmpty();
    }
}
