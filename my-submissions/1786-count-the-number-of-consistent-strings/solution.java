class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(String str:words){
            // if(str.contains(allowed)){c++;}
            boolean b=true;
            for(char c:str.toCharArray()){
                if (!allowed.contains(Character.toString(c))) {
                b = false;
                break;
                }
            }
            if(b==true)cnt++;
        }
        return cnt;
    }
}
