class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int far = 0;

        for (int i = 0; i < n; i++) {
            if (i > far) return false;          // agar i reachable hi nahi hai
            far = Math.max(far, i + nums[i]);   // max reach 
        }
        return true;  // agar loop pura chal gaya, last tak pohchna possible hai
    }
}
