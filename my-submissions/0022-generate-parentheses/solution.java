class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(0,0,"",n,ans);
        return ans;
    }
    private void solve(int op,int cl,String cur,int total,List<String> ans){
        if(cur.length()==2*total){
            ans.add(cur);
            return;
        }
        if(op<total)solve(op+1,cl,cur+"(",total,ans);
        if(cl<op)solve(op,cl+1,cur+")",total,ans);
    }
}
