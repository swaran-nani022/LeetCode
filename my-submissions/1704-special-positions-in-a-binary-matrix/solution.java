class Solution {
    public int numSpecial(int[][] mat) {
         int m=mat.length;
        int n=mat[0].length;
        int[] a1=new int[m];
        int[] a2=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    a1[i]++;
                    a2[j]++;
                }
            }
        }
        int asn=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && a1[i]==1 && a2[j]==1) asn++;
            }
        }
        return asn;
    }
}
