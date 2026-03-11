class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> hs=new HashSet<>();
        int ts=target.length;
        int ll=0;
        for(int i:target)hs.add(i);
        for(int i=1;i<=n;i++){
            if(ll==ts)return res;
            st.push(i);
            res.add("Push");
            if(hs.contains(st.peek())){
                ll++; 
                continue;
            }else{
                st.pop();
                res.add("Pop");
            }           
        }
        return res;
    }
}
