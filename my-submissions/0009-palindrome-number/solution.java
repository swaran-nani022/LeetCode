class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; 
        String n = String.valueOf(x); 
        String m = new StringBuilder(n).reverse().toString();
        return n.equals(m);
    }
}

