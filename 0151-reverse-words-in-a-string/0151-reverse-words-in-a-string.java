class Solution {
    public String reverseWords(String s) {
        String word="";
        String [] str=s.trim().split("\s+");
        for(String p : str)
        word=p+" "+word;
        return word.trim();
    }
}