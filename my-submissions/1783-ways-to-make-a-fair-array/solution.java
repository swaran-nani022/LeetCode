class Solution {
    public int waysToMakeFair(int[] nums) {
        int totaleven=0;
        int totalodd=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                totaleven+=nums[i];
            }else{
                totalodd+=nums[i];
            }
        }
        int cureven=0;
        int curodd=0;
        int faircnt=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                totaleven-=nums[i];
            }else{
                totalodd-=nums[i];
            }
            if(cureven+totalodd==curodd+totaleven){faircnt++;}
            if(i%2==0){
                cureven+=nums[i];
            }else{
                curodd+=nums[i];
            }
        }
        return faircnt;
    }
}
