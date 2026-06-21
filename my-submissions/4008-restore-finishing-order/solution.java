class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> ar=new ArrayList<>();

        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){ar.add(order[i]);}
            }
        }
        int[] arr=new int[ar.size()];
        for(int i=0;i<ar.size();i++){
            arr[i]=ar.get(i);
        }
        return arr;
    }
}
