class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int c=0;
        // for(int i=0;i<n;i++){
        //     int[] fre=new int[3];
        //     for(int j=i;j<n;j++){
        //         fre[s.charAt(j)-'a']++;
        //         if(fre[0]>0 && fre[1]>0 && fre[2]>0){c++;}
        //     }
        // }
        int[] fre=new int[3];
        int left=0;
        for(int right=0;right<n;right++){
            fre[s.charAt(right)-'a']++;
            while(fre[0]>0 && fre[1]>0 && fre[2]>0){
                c+=(n-right);
                fre[s.charAt(left)-'a']--;
                left++;
            }
        }
        return c;
    }
}
