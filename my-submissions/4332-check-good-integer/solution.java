class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int squaresum=0;
        while(n!=0){
            int temp=n%10;
            digitsum+=temp;
            squaresum+=temp*temp;
            n/=10;
        }
        return (squaresum-digitsum>=50)?true:false;
    }
}
