class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ar=new int[26];
        for(char c:text.toCharArray()){
            ar[c-'a']++;
        }
        return Math.min(ar[1], Math.min(ar[0], Math.min(ar[11] / 2, Math.min(ar[14] / 2, ar[13]))));
    }
}
