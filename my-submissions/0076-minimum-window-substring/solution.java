class Solution {
    public String minWindow(String s, String t) {
       int[] need=new int[128];
       for(char c:t.toCharArray())need[c]++;
       int left=0;
       int right=0;
        int count=t.length();
        int minlen=Integer.MAX_VALUE;
        int start=0;
        while(right<s.length()){
            if(need[s.charAt(right)]>0) count--;
            need[s.charAt(right)]--;
            right++;
            while(count==0){
                if(right-left<minlen){
                    minlen=right-left;
                    start=left;
                }
                need[s.charAt(left)]++;
                if(need[s.charAt(left)]>0)count++;
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE ? "":s.substring(start,start+minlen);  
    }
}
