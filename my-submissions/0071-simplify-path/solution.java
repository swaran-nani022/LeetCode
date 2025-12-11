class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] directories=path.split("/");
        for(String dir:directories){
            if(dir.equals(".") || dir.isEmpty()) {continue;}
            else if(dir.equals("..") ){
                if(!st.isEmpty()){st.pop();}}
            else{st.push(dir);}
        }
        StringBuilder result = new StringBuilder("/");
        for (int i = 0; i < st.size(); i++) {
            result.append(st.get(i));
            if (i < st.size()-1) result.append("/");
        }

        return result.toString();
    }
}
