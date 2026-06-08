class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;  
            while (value > 0) {
                sum += value % 10;  
                value /= 10;
            }
        }
        int n = sum;
        for (int i = 1; i < k; i++) {
            int news = 0;
            while (n > 0) {
                news += n % 10; 
                n /= 10;           
            }
            n = news;  
        }return n;
    }
}
