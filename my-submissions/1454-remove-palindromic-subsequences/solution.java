class Solution {
    public int removePalindromeSub(String s) {
        String sb=new StringBuilder(s).reverse().toString();
        if(s.equals(sb))return 1;
        return 2;
    }
}
