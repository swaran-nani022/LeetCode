class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int md = Integer.MIN_VALUE;
        List<Integer> of = new ArrayList<>();
        List<Integer> ef = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) {
                if (f % 2 == 0) {
                    ef.add(f);
                } else {
                    of.add(f);
            }
        }
        }
        for (int odd : of) {
            for (int even : ef) {
                md = Math.max(md, odd - even);
        }
        }
        return md;
    }
    }
