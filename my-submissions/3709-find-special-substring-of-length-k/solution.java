class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        for (int i = 0; i <= n - k; i++) {
            String sub = s.substring(i, i + k);            
            if (sub.chars().distinct().count() == 1) {
            if ((i == 0 || s.charAt(i - 1) != s.charAt(i)) &&
                 (i + k == n || s.charAt(i + k) != s.charAt(i))) {
            return true;
        }
           }
        }
        return false;
}
}
