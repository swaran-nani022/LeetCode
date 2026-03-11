class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        int pretime=0;
        for(String lg:logs){
            String[] parts=lg.split(":");
            int id=Integer.parseInt(parts[0]);
            String type=parts[1];
            int time=Integer.parseInt(parts[2]);
            if(type.equals("start")){
                if(!st.isEmpty()){
                    res[st.peek()]+=time-pretime;
                }
                st.push(id);
                pretime=time;
            }else{
                res[st.pop()]+=time-pretime+1;
                pretime=time+1;
            }
        }
        return res;
    }
}
