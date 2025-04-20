class Solution {
    public long calculateScore(String[] instructions, int[] values) {
       long score = 0;
        int i = 0;
        Set<Integer> visited = new HashSet<>();
        while (i >= 0 && i < instructions.length) {
            if (visited.contains(i)) {
                break;
            }
            visited.add(i);
            String instruction = instructions[i];
            if ("add".equals(instruction)) {
                score += values[i];
                i++;
            } else if ("jump".equals(instruction)) {
                i += values[i];
            }
        }
        
        return score;
    }
}
