class Solution {
    public boolean consecutiveSetBits(int n) {
        String str=Integer.toBinaryString(n);
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]=='1' && ch[i+1]=='1'){
                count++;
            }
        }
        if(count==1)return true;
        return false;
    }
}
