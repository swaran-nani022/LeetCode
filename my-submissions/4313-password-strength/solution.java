class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> hs=new HashSet<>();
        for(char c:password.toCharArray()){
            hs.add(c);
        }
        int points=0;
        for(char c:hs){
            if(Character.isLowerCase(c)){points+=1;}
            else if(Character.isUpperCase(c)){points+=2;}
            else if(Character.isDigit(c)){points+=3;}
            else points+=5;
        }
        return points;
    }
}
