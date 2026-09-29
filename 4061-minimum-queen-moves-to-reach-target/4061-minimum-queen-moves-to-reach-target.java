class Solution {
    public static int minQueenMoves(int[] s, int[] t) {
        boolean sx=s[0]==t[0];
        boolean sy=s[1]==t[1];
        if(sx && sy)return 0;
        if(sx || sy)return 1;
        if(Math.abs(s[0]-t[0])==Math.abs(s[1]-t[1]))return 1;
        return 2;
    }
}