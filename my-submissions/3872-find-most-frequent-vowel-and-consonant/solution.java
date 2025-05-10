class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String v = "aeiou";
        int mv = 0, mc = 0;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            int f = map.get(ch);
            if (v.indexOf(ch) != -1) {
                mv = Math.max(mv, f);
            } else {
                mc = Math.max(mc, f);
            }
        }
        return mv + mc;
    }
}

