class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            int temp=i;
            if(temp<100)continue;
            int tir=temp%10;
            temp/=10;
            int sec=temp%10;
            temp/=10;
            while(temp>0){
                int fst=temp%10;
                if((sec>fst &&sec>tir) || (sec<fst && sec<tir)){count++;}
                tir=sec;
                sec=fst;
                temp/=10;
            }
        }
        return count;
    }
}
