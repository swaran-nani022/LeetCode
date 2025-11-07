class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
            left = Math.max(map[s.charAt(right)], left);
            max = Math.max(max, right - left + 1);
            map[s.charAt(right)] = ++right;
        }
        return max;
    }
}
