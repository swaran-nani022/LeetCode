class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b=new ArrayList<>();
        int max=candies[0];
        for(int i:candies){max=Math.max(max,i);}
        for(int i:candies){
            if(i+extraCandies>=max){b.add(true);}
            else {b.add(false);}
        }
        return b;
    }
}
