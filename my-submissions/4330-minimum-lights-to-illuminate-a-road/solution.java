class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                diff[Math.max(0, i - lights[i])] += 1;
                diff[Math.min(n - 1, i + lights[i]) + 1] -= 1;
            }
        }
        int ravelunico = n;
        int req = 0;
        int currentCov = 0;
        int i = 0;
        while (i < n) {
            currentCov += diff[i];
            if (currentCov <= 0) {
                req++;
                diff[i] += 1;
                if (i + 3 <= n) {
                    diff[i + 3] -= 1;
                }
                currentCov += 1;
            }
            i++;
        }
        
        return req;
    }
}
