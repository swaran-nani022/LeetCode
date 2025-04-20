class Solution {
    public int maximumPossibleSize(int[] nums) {
       Stack<Integer> st=new Stack<>();
        for(int num:nums){
            while(!st.isEmpty() && st.peek()>num){
                num=Math.max(num,st.pop());
            }
            st.push(num);
        }
        return st.size();
    }
}
