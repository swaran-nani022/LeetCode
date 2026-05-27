class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lo=new int[26];
        int[] up=new int[26];
        Arrays.fill(lo,-1);
        Arrays.fill(up,-1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lo[ch-'a']=i;
            }
            else{
                int idx=ch-'A';
                if(up[idx]==-1){up[idx]=i;}
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(lo[i]!=-1&& up[i]!=-1 && lo[i]<up[i])count++;
        }
        return count;
    }
}
