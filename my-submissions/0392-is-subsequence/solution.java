class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] sub =s.toCharArray();
        char [] temp=t.toCharArray();
        int slow=0;
        for(int i=0;i<temp.length;i++){
            if(slow<sub.length){
                if(temp[i]==sub[slow])slow++;
            }
        }
        return slow==sub.length;
    }
}
