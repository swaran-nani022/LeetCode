class Solution {
    public String convert(String s, int numrows) {
       if(numrows==1 || s.length()<=numrows ) return s;
       StringBuilder[] rows=new StringBuilder[numrows];
       for(int i=0;i<numrows;i++) rows[i]=new StringBuilder();
       int currow=0;
       boolean gd=true;
       for(char ch:s.toCharArray()){
        rows[currow].append(ch);
        if(currow==0) gd=true;
        else if(currow==numrows-1)gd=false;
        currow+=gd?1:-1;
       }
       StringBuilder sb=new StringBuilder();
       for(StringBuilder row:rows){
        sb.append(row);
       }
       return sb.toString();
    }
}
