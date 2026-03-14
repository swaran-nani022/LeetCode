class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int c=0;
        while(tickets[k]!=0){
            if(i==tickets.length) i=0;
            if(tickets[i]==0){ i++; continue; }
            else{ tickets[i]=tickets[i]-1; c++; }
            i++;
        }
        return c;
    }
}
