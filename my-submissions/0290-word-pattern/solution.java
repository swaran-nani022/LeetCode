class Solution {
    public boolean wordPattern(String pattern, String s) {
        String ss[]=s.split(" ");
        if(pattern.length()!=ss.length) return false;
        Map<Character,String> hm=new HashMap<>();
        Set<String> str=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c1=pattern.charAt(i);
            String c2=ss[i];
            if(hm.containsKey(c1)){
                if(!hm.get(c1).equals(c2)){return false;}
            }
            else
            {
            if(str.contains(c2))return false;
            str.add(c2);  
            hm.put(c1,c2);
        }
        }
    return true;
    }
}
