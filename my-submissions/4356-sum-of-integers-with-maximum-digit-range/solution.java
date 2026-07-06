class Solution {
    public static int maxDigitRange(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int num=nums[i];
            if (num == 0) {
                max = 0;
                min = 0;
            }
            while(num>0){
                int digit=num%10;
                max=Math.max(max,digit);
                min=Math.min(min,digit);
                num=num/10;
            }
            System.out.println(max+" "+min);
            arr[i]=max-min;
        }
        int max=arr[0];
        for(int x:arr){
            max=Math.max(max,x);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]==max){
                res+=nums[i];
            }
        }
        return res;
    }
}
