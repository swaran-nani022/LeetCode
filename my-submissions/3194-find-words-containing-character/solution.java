class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(Character.toString(x)))ar.add(i);
        }
        return ar;
    }
}
