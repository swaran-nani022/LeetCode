class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int k=fruits.length;
        int n=fruits.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    baskets[j]=0;
                    k--;
                    break;
                }
            }
        }
      return k;
    }
}
