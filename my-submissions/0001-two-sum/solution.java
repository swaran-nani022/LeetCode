class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 1; i < nums.length; i++){

            // here i is expanding the range (jump length)

            for(int j = 0; j < nums.length-i; j++){

                // here i just minimizing the iterations

                if((nums[j] + nums[j+i]) == target){
                    return new int[]{j, j+i}; 
                }

            }

        }

        return null;
    }
}
