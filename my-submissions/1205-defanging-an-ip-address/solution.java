class Solution {
    public String defangIPaddr(String address) {
        ArrayList<Character> al=new ArrayList<>();
        for(char c:address.toCharArray()){
            al.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:al){
            if(c!='.'){
                sb.append(c);
            }
            else{
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}
