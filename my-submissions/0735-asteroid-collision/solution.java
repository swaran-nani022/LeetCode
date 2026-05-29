class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st=new Stack<>();
        for(int val:ast){
            while(!st.isEmpty() && st.peek()>0 && val<0){
                int sum=val+st.peek();
                if(sum<0){
                    st.pop();
                }
                else if(sum==0){
                    st.pop();
                    val=0;
                }
                else{
                    val=0;
                    break;
                }
            }
            if(val!=0)st.push(val);
           
        }
         int[] arr=new int[st.size()];
            for(int x=st.size()-1;x>=0;x--){
                arr[x]=st.pop();
            }
            return arr;
    }
}
