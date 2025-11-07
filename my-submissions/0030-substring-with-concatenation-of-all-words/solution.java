class Solution{
    public List<Integer> findSubstring(String s,String[] w){
        List<Integer> r=new ArrayList<>();
        if(s.isEmpty()||w.length==0)return r;
        int n=w.length,l=w[0].length(),t=n*l,len=s.length();
        Map<String,Integer> f=new HashMap<>();
        for(String x:w)f.put(x,f.getOrDefault(x,0)+1);
        for(int offset=0;offset<l;offset++){
            int start=offset,count=0;
            Map<String,Integer> curr=new HashMap<>();
            for(int end=offset;end+l<=len;end+=l){
                String word=s.substring(end,end+l);
                if(f.containsKey(word)){
                    curr.put(word,curr.getOrDefault(word,0)+1);
                    count++;
                    while(curr.get(word)>f.get(word)){
                        String left=s.substring(start,start+l);
                        curr.put(left,curr.get(left)-1);
                        start+=l;
                        count--;
                    }
                    if(count==n){
                        r.add(start);
                        String left=s.substring(start,start+l);
                        curr.put(left,curr.get(left)-1);
                        start+=l;
                        count--;
                    }
                }else{
                    curr.clear();
                    count=0;
                    start=end+l;
                }
            }
        }
        return r;
    }
}

