class Solution {
    public String findValidPair(String s) {
        int[] count = new int[10];
	        for (char c : s.toCharArray()) {
	            count[c - '0']++;
	        }
	        for (int i = 0; i < s.length() - 1; i++) {
	            int firstDigit = s.charAt(i) - '0';
	            int secondDigit = s.charAt(i + 1) - '0';

	            if (firstDigit != secondDigit && count[firstDigit] == firstDigit && count[secondDigit] == secondDigit) {
	                return "" + firstDigit + secondDigit;
	            }
	        }

	        return "";
    }
}
