class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<sandwiches.length;i++)qu.add(students[i]);

        int i=0;
        int c=0;
        while(!qu.isEmpty() && c<qu.size()){
            if(sandwiches[i]==qu.peek()){
                qu.remove();
                i++;
                c=0;
            }
            else{
                int x=qu.remove();
                qu.offer(x);
                c++;
            }
        }
        return qu.size();
    }
}
