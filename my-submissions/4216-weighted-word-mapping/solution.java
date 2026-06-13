class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        // int sum=0;
        // String str="";
        StringBuilder str=new StringBuilder();
        for(String word:words){
            int sum=0;
            for(char c:word.toCharArray()){
                int n=weights[c-'a'];
                sum+=n;
            }
            int rem=sum%26;
            char c=(char)('z'-rem);
            str.append(c);            
        }
        return str.toString();
    }
}
