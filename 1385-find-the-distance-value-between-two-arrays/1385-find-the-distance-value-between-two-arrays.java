class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int ele:arr1){
            boolean b=true;
            for(int i=0;i<arr2.length;i++){
                if(Math.abs(ele-arr2[i])<=d){
                    b=false;
                    break;
                }
            }
            if(b)c++;
        }
        return c;
    }
}