class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));

        if(pairs.length==0) return 0;
        int c=1;
        int e=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(e<pairs[i][0]){c++;
                             e=pairs[i][1];
                             }
        }
        return c;
    }
}
