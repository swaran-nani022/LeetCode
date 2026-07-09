class Solution {
    public String interpret(String command) {
        StringBuilder s=new StringBuilder();
        char[] ar=command.toCharArray();
        int n=ar.length;
        for(int i=0;i<n;i++){
            if(ar[i]=='G')s.append('G');
            if(ar[i]=='('){
                if(ar[i+1]==')'){s.append('o');}
                else{s.append("al");i+=3;}
            }
        }
        return s.toString();
    }
}
