class Solution {
    public static int maxDistance(String moves) {
        // int ans=0;
        // for(char c:moves.toCharArray()){
        //     if(c=='L' || c=='R' || c=='U' || c=='D' || c=='_'){ans++;}
        // }
        // return ans;
        int x=0;
        int y=0;
        int count=0;
        for(char c:moves.toCharArray()){
            switch(c)
            {
                case 'L':y--;break;
                case 'R':y++;break;
                case 'U':x++;break;
                case 'D':x--;break;
                case '_':count++;break;
            }
        }
        return Math.abs(x)+Math.abs(y)+count;
    }
}
