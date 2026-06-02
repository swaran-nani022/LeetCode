class Solution {
    public int earliestFinishTim(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<landStartTime.length; i++){
            min=Math.min(min,landStartTime[i]+landDuration[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<waterStartTime.length; i++){
            ans=Math.min(ans,Math.max(min,waterStartTime[i])+waterDuration[i]);
        }
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(
            earliestFinishTim(landStartTime,landDuration,waterStartTime,waterDuration),
            earliestFinishTim(waterStartTime,waterDuration,landStartTime,landDuration)
        );
    }
}
