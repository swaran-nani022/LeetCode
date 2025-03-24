class Solution {
    public int mySqrt(int x) {
      long l=0;
      long h=100000;
     // int ans=0;
      while(l<=h){
        long m=(l+h)/2;
        if(m*m ==x){
            return (int)m;
        }
        else if(m*m < x){ 
            l=m+1;
        }else{
            h=m-1;
        }
      }
      return (int)h;
    }
}
